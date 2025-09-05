package Invokers;

import com.cybersource.authsdk.core.ConfigException;
import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.authsdk.util.GlobalLabelParameters;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;

import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class HttpClientFactory {
    private static final ConcurrentHashMap<Integer, OkHttpClient> _httpClientInstances = new ConcurrentHashMap<>();

    public static OkHttpClient getHttpClient(MerchantConfig merchantConfig, HttpClientFactoryAdditionalSettings additionalSettings) throws ConfigException {
        if (merchantConfig == null) {
            Properties customProperties = new Properties();
            customProperties.setProperty("userDefinedConnectionTimeout", GlobalLabelParameters.DEFAULT_MAX_CONNECT_TIMEOUT_IN_SECONDS);
            customProperties.setProperty("userDefinedReadTimeout", GlobalLabelParameters.DEFAULT_MAX_READ_TIMEOUT_IN_SECONDS);
            customProperties.setProperty("userDefinedWriteTimeout", GlobalLabelParameters.DEFAULT_MAX_WRITE_TIMEOUT_IN_SECONDS);
            customProperties.setProperty("userDefinedKeepAliveDuration", GlobalLabelParameters.DEFAULT_MAX_KEEP_ALIVE_DURATION_IN_SECONDS);
            customProperties.setProperty("userDefinedMaxIdleConnections", GlobalLabelParameters.DEFAULT_MAX_IDLE_CONNECTIONS);

            merchantConfig = new MerchantConfig(customProperties);
        }

        int hash = GetHashOfMerchantConfiguration(merchantConfig, additionalSettings);

        MerchantConfig finalMerchantConfig = merchantConfig;

        return _httpClientInstances.computeIfAbsent(hash, value -> createNewHttpClient(finalMerchantConfig, additionalSettings));
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

    private static int GetHashOfMerchantConfiguration(MerchantConfig merchantConfig, HttpClientFactoryAdditionalSettings additionalSettings) {
        return Objects.hash(
                merchantConfig.getUserDefinedConnectionTimeout(),
                merchantConfig.getUserDefinedReadTimeout(),
                merchantConfig.getUserDefinedWriteTimeout(),
                merchantConfig.getUserDefinedKeepAliveDuration(),
                merchantConfig.getUserDefinedMaxIdleConnections(),
                additionalSettings.getCustomLoggingInterceptor(),
                additionalSettings.getCustomRetryInterceptor(),
                additionalSettings.getCustomSSLSocketFactory(),
                additionalSettings.getCustomX509TrustManager(),
                additionalSettings.getCustomHostnameVerifier(),
                additionalSettings.getCustomRetryOnConnectionFailure(),
                additionalSettings.getCustomNetworkEventListener(),
                additionalSettings.getCustomProxy(),
                additionalSettings.getCustomProxyAuthenticator()
        );
    }
}
