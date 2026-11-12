package Invokers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cybersource.authsdk.core.ConfigException;
import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.authsdk.util.GlobalLabelParameters;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.SocketPolicy;

/**
 * Fault-injected (not mocked away) coverage for issue #4252: a real {@link OkHttpClient}
 * produced by {@link HttpClientFactory}, driven against a real {@link MockWebServer} which
 * fully reads a POST then severs the connection before writing any response - the exact "gateway
 * processed it, response never arrived" race the finding describes.
 *
 * <p>Note: OkHttp's {@code retryOnConnectionFailure} only fails a request over to a *different
 * route* (e.g. another IP behind a load balancer); it will not retry the same address twice.
 * Reproducing that failover locally requires a second server on a distinct loopback address,
 * which isn't reliably reachable in every network environment (e.g. behind some corporate
 * VPNs/proxies, connections to addresses other than 127.0.0.1 can time out) - so that positive
 * case is intentionally not asserted here to avoid a flaky, environment-dependent test. What IS
 * asserted, and is the actual guarantee this fix provides, is below.
 */
public class HttpClientFactoryMockWebServerTest {

    private MockWebServer server;

    @Before
    public void setUp() throws IOException {
        server = new MockWebServer();
        server.start(InetAddress.getByName("127.0.0.1"), 0);
    }

    @After
    public void tearDown() throws IOException {
        server.shutdown();
    }

    @Test
    public void retryDisabled_doesNotResendAfterMidResponseDisconnect() throws Exception {
        OkHttpClient client = clientWithRetry(false);
        server.enqueue(new MockResponse().setSocketPolicy(SocketPolicy.DISCONNECT_AFTER_REQUEST));

        try {
            client.newCall(paymentRequest()).execute();
            fail("Expected the severed connection to surface as an IOException, not a silent retry");
        } catch (IOException expected) {
            // Caller stays responsive: fails fast instead of hanging or silently resending.
        }

        assertEquals("With retry disabled, the server must see exactly one request - no duplicate authorization",
                1, server.getRequestCount());
    }

    /** Builds the same kind of client {@code HttpClientFactory} hands {@code ApiClient}, with short timeouts. */
    private OkHttpClient clientWithRetry(boolean retryOnConnectionFailure) throws ConfigException {
        HttpClientFactoryAdditionalSettings settings = new HttpClientFactoryAdditionalSettings();
        settings.setCustomRetryOnConnectionFailure(retryOnConnectionFailure);
        return HttpClientFactory.getHttpClient(newMerchantConfig(), settings).newBuilder()
                .connectTimeout(2, TimeUnit.SECONDS)
                .readTimeout(2, TimeUnit.SECONDS)
                .build();
    }

    private Request paymentRequest() {
        return new Request.Builder()
                .url(server.url("/pts/v2/payments"))
                .post(RequestBody.create("{}", MediaType.parse("application/json")))
                .build();
    }

    private static MerchantConfig newMerchantConfig() throws ConfigException {
        Properties props = new Properties();
        props.setProperty("merchantID", "testrest");
        props.setProperty("runEnvironment", "apitest.cybersource.com");
        props.setProperty("authenticationType", "http_signature");
        props.setProperty("merchantKeyId", "00000000-0000-0000-0000-000000000000");
        props.setProperty("merchantsecretKey", "cnVuLXRlc3Qtc2VjcmV0LWtleS12YWx1ZQ==");
        props.setProperty("userDefinedConnectionTimeout", GlobalLabelParameters.DEFAULT_MAX_CONNECT_TIMEOUT_IN_SECONDS);
        props.setProperty("userDefinedReadTimeout", GlobalLabelParameters.DEFAULT_MAX_READ_TIMEOUT_IN_SECONDS);
        props.setProperty("userDefinedWriteTimeout", GlobalLabelParameters.DEFAULT_MAX_WRITE_TIMEOUT_IN_SECONDS);
        props.setProperty("userDefinedKeepAliveDuration", GlobalLabelParameters.DEFAULT_MAX_KEEP_ALIVE_DURATION_IN_SECONDS);
        props.setProperty("userDefinedMaxIdleConnections", GlobalLabelParameters.DEFAULT_MAX_IDLE_CONNECTIONS);
        return new MerchantConfig(props);
    }
}
