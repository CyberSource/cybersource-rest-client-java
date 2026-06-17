package Invokers;

import com.cybersource.authsdk.core.ConfigException;
import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.authsdk.util.GlobalLabelParameters;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Factory and cache for {@link OkHttpClient} instances.
 *
 * <p>OkHttp clients are expensive to create and are explicitly designed to be
 * shared, so instances are cached and reused for merchant configurations that
 * resolve to the same connection settings. The cache enforces a retention
 * policy - idle entries expire after {@link #CLIENT_IDLE_TIMEOUT_MINUTES}
 * minutes and the total is bounded to {@link #MAX_CACHED_CLIENTS} entries.
 * When a client is evicted its connection pool and dispatcher threads are shut
 * down, so recreating callers (e.g. an {@code ApiClient} per request) never
 * leak sockets or threads.
 */
public final class HttpClientFactory {

    private static final Logger logger = LogManager.getLogger(HttpClientFactory.class);

    /** Idle duration after which an unused cached client is evicted and shut down. */
    private static final long CLIENT_IDLE_TIMEOUT_MINUTES = 30L;

    /** Maximum number of distinct clients retained before LRU eviction kicks in. */
    private static final int MAX_CACHED_CLIENTS = 50;

    private static final TimedCache<Integer, OkHttpClient> CLIENT_CACHE = new TimedCache<>(
            CLIENT_IDLE_TIMEOUT_MINUTES, TimeUnit.MINUTES, MAX_CACHED_CLIENTS,
            (key, client) -> shutdownQuietly(client));

    private HttpClientFactory() {
        // Utility class; not instantiable.
    }

    public static OkHttpClient getHttpClient(MerchantConfig merchantConfig, HttpClientFactoryAdditionalSettings additionalSettings) throws ConfigException {
        MerchantConfig effectiveConfig = merchantConfig != null ? merchantConfig : createDefaultMerchantConfig();
        HttpClientFactoryAdditionalSettings effectiveSettings =
                additionalSettings != null ? additionalSettings : new HttpClientFactoryAdditionalSettings();

        int cacheKey = computeConfigurationHash(effectiveConfig, effectiveSettings);
        return CLIENT_CACHE.get(cacheKey, key -> createNewHttpClient(effectiveConfig, effectiveSettings));
    }

    private static MerchantConfig createDefaultMerchantConfig() throws ConfigException {
        Properties customProperties = new Properties();
        customProperties.setProperty("userDefinedConnectionTimeout", GlobalLabelParameters.DEFAULT_MAX_CONNECT_TIMEOUT_IN_SECONDS);
        customProperties.setProperty("userDefinedReadTimeout", GlobalLabelParameters.DEFAULT_MAX_READ_TIMEOUT_IN_SECONDS);
        customProperties.setProperty("userDefinedWriteTimeout", GlobalLabelParameters.DEFAULT_MAX_WRITE_TIMEOUT_IN_SECONDS);
        customProperties.setProperty("userDefinedKeepAliveDuration", GlobalLabelParameters.DEFAULT_MAX_KEEP_ALIVE_DURATION_IN_SECONDS);
        customProperties.setProperty("userDefinedMaxIdleConnections", GlobalLabelParameters.DEFAULT_MAX_IDLE_CONNECTIONS);
        return new MerchantConfig(customProperties);
    }

    /**
     * Releases the resources held by an evicted client - draining its dispatcher
     * threads, connection pool and any response cache. Best-effort: failures are
     * logged but never propagated out of cache eviction.
     */
    private static void shutdownQuietly(OkHttpClient client) {
        if (client == null) {
            return;
        }
        try {
            client.dispatcher().executorService().shutdown();
            client.connectionPool().evictAll();
            Cache cache = client.cache();
            if (cache != null) {
                cache.close();
            }
        } catch (Exception e) {
            logger.warn("Failed to fully release an evicted OkHttpClient: {}", e.getMessage());
        }
    }

    private static OkHttpClient createNewHttpClient(MerchantConfig merchantConfig, HttpClientFactoryAdditionalSettings additionalSettings) {
        ConnectionPool customConnectionPool = new ConnectionPool(merchantConfig.getUserDefinedMaxIdleConnections(), merchantConfig.getUserDefinedKeepAliveDuration(), TimeUnit.SECONDS);

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        builder.connectionPool(customConnectionPool);
        builder.connectTimeout(merchantConfig.getUserDefinedConnectionTimeout(), TimeUnit.SECONDS);
        builder.readTimeout(merchantConfig.getUserDefinedReadTimeout(), TimeUnit.SECONDS);
        builder.writeTimeout(merchantConfig.getUserDefinedWriteTimeout(), TimeUnit.SECONDS);

        /* OPTIONAL ADD-ONS */
        if (additionalSettings != null) {
            if (additionalSettings.getCustomLoggingInterceptor() != null) {
                builder.addInterceptor(additionalSettings.getCustomLoggingInterceptor());
            }

            if (additionalSettings.getCustomRetryInterceptor() != null) {
                builder.addInterceptor(additionalSettings.getCustomRetryInterceptor());
            }

            if (additionalSettings.getCustomSSLSocketFactory() != null && additionalSettings.getCustomX509TrustManager() != null) {
                builder.sslSocketFactory(additionalSettings.getCustomSSLSocketFactory(), additionalSettings.getCustomX509TrustManager());
            }

            if (additionalSettings.getCustomHostnameVerifier() != null) {
                builder.hostnameVerifier(additionalSettings.getCustomHostnameVerifier());
            }

            if (additionalSettings.getCustomRetryOnConnectionFailure() != null) {
                builder.retryOnConnectionFailure(additionalSettings.getCustomRetryOnConnectionFailure());
            }

            if (additionalSettings.getCustomNetworkEventListener() != null) {
                builder.eventListener(additionalSettings.getCustomNetworkEventListener());
            }

            if (additionalSettings.getCustomProxy() != null) {
                builder.proxy(additionalSettings.getCustomProxy());

                if (additionalSettings.getCustomProxyAuthenticator() != null) {
                    builder.proxyAuthenticator(additionalSettings.getCustomProxyAuthenticator());
                }
            }
        }

        return builder.build();
    }

    private static int computeConfigurationHash(MerchantConfig merchantConfig, HttpClientFactoryAdditionalSettings additionalSettings) {
        return Objects.hash(
                merchantConfig.getUserDefinedConnectionTimeout(),
                merchantConfig.getUserDefinedReadTimeout(),
                merchantConfig.getUserDefinedWriteTimeout(),
                merchantConfig.getUserDefinedKeepAliveDuration(),
                merchantConfig.getUserDefinedMaxIdleConnections(),
                additionalSettings.getCustomLoggingInterceptor() != null ? additionalSettings.getCustomLoggingInterceptor().getLevel() : null,
                additionalSettings.getCustomRetryInterceptor() != null,
                additionalSettings.getCustomRetryOnConnectionFailure(),
                additionalSettings.getCustomNetworkEventListener() != null,
                // Security material is keyed by content/identity (not mere presence) so that
                // distinct certificates, trust settings and proxy credentials never collide
                // onto a shared client. See sslFingerprint / proxyFingerprint.
                sslFingerprint(merchantConfig, additionalSettings),
                proxyFingerprint(merchantConfig, additionalSettings)
        );
    }

    /**
     * Builds a cheap, stable fingerprint of the TLS material a client will use.
     *
     * <p>The {@link javax.net.ssl.SSLSocketFactory} and {@link javax.net.ssl.X509TrustManager}
     * instances are opaque and rebuilt per {@code ApiClient}, so they cannot be keyed by
     * instance identity (that would defeat caching) nor by hashing certificates on every
     * request (too costly). Instead the discriminating inputs that produced them are used:
     * the client-certificate location/password and whether server verification is relaxed
     * (captured by the trust-manager/verifier class names). Two clients share a cached
     * {@code OkHttpClient} only when these all match.
     */
    private static Object sslFingerprint(MerchantConfig merchantConfig, HttpClientFactoryAdditionalSettings additionalSettings) {
        boolean clientCertEnabled = safeBoolean(merchantConfig::isEnableClientCert);
        return Objects.hash(
                clientCertEnabled,
                clientCertEnabled ? safeString(merchantConfig::getClientCertDirectory) : null,
                clientCertEnabled ? safeString(merchantConfig::getClientCertFile) : null,
                // Avoid retaining the raw secret: fold it into the hash only.
                clientCertEnabled ? Objects.hashCode(safeString(merchantConfig::getClientCertPassword)) : 0,
                additionalSettings.getCustomSSLSocketFactory() != null,
                className(additionalSettings.getCustomX509TrustManager()),
                className(additionalSettings.getCustomHostnameVerifier())
        );
    }

    /**
     * Builds a stable fingerprint of the proxy configuration, including credentials, so that
     * clients targeting the same proxy host but authenticating as different users are not
     * collapsed onto one cached {@code OkHttpClient}.
     */
    private static Object proxyFingerprint(MerchantConfig merchantConfig, HttpClientFactoryAdditionalSettings additionalSettings) {
        if (additionalSettings.getCustomProxy() == null) {
            return null;
        }
        boolean useProxy = safeBoolean(merchantConfig::isUseProxyEnabled);
        return Objects.hash(
                additionalSettings.getCustomProxy().address(),
                additionalSettings.getCustomProxyAuthenticator() != null,
                useProxy ? safeString(merchantConfig::getProxyUser) : null,
                // Avoid retaining the raw secret: fold it into the hash only.
                useProxy ? Objects.hashCode(safeString(merchantConfig::getProxyPassword)) : 0
        );
    }

    private static String className(Object o) {
        return o != null ? o.getClass().getName() : null;
    }

    private static String safeString(SupplierWithException<String> supplier) {
        try {
            return supplier.get();
        } catch (Exception e) {
            return null;
        }
    }

    private static boolean safeBoolean(SupplierWithException<Boolean> supplier) {
        try {
            Boolean value = supplier.get();
            return value != null && value;
        } catch (Exception e) {
            return false;
        }
    }

    @FunctionalInterface
    private interface SupplierWithException<T> {
        T get() throws Exception;
    }
}
