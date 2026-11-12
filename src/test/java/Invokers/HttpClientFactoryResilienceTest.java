package Invokers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Properties;

import org.junit.Test;

import com.cybersource.authsdk.core.ConfigException;
import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.authsdk.util.GlobalLabelParameters;

import okhttp3.OkHttpClient;

/**
 * Covers the issue #4252 fix: {@link HttpClientFactory#isRetryUnsafePost(String, String)}
 * (the whitelist of non-idempotent money-movement paths) and the fact that
 * {@link HttpClientFactory#getHttpClient} actually honours the resulting retry flag.
 */
public class HttpClientFactoryResilienceTest {

    @Test
    public void flagsAllKnownMoneyMovementPosts() {
        assertTrue(HttpClientFactory.isRetryUnsafePost("/pts/v2/payments", "POST"));
        assertTrue(HttpClientFactory.isRetryUnsafePost("/pts/v2/payments/ABC123/captures", "POST"));
        assertTrue(HttpClientFactory.isRetryUnsafePost("/pts/v2/payments/ABC123/reversals", "POST"));
        assertTrue(HttpClientFactory.isRetryUnsafePost("/pts/v2/payments/ABC123/refunds", "POST"));
        assertTrue(HttpClientFactory.isRetryUnsafePost("/pts/v2/credits", "POST"));
        assertTrue(HttpClientFactory.isRetryUnsafePost("/pts/v2/captures/ABC123/refunds", "POST"));
        assertTrue(HttpClientFactory.isRetryUnsafePost("/pts/v2/reversals", "POST"));
        assertTrue(HttpClientFactory.isRetryUnsafePost("/pts/v2/payouts", "POST"));
        assertTrue(HttpClientFactory.isRetryUnsafePost("/pts/v1/push-funds-transfer", "POST"));
        assertTrue(HttpClientFactory.isRetryUnsafePost("/pts/v1/pull-funds-transfer", "POST"));
        assertTrue(HttpClientFactory.isRetryUnsafePost("/pts/v1/pull-funds-transfer/ABC123/refund", "POST"));
        assertTrue(HttpClientFactory.isRetryUnsafePost("/pts/v1/pull-funds-transfer/ABC123/reversal", "POST"));
    }

    @Test
    public void ignoresNonPaymentPaths() {
        assertFalse(HttpClientFactory.isRetryUnsafePost("/tms/v2/tokenize", "POST"));
        assertFalse(HttpClientFactory.isRetryUnsafePost("/risk/v1/decisions", "POST"));
        assertFalse(HttpClientFactory.isRetryUnsafePost("/reporting/v3/net-fundings", "POST"));
    }

    @Test
    public void ignoresNonPostMethodsOnMoneyMovementPaths() {
        assertFalse(HttpClientFactory.isRetryUnsafePost("/pts/v2/payments/ABC123", "GET"));
        assertFalse(HttpClientFactory.isRetryUnsafePost("/pts/v2/payments", "PATCH"));
    }

    @Test
    public void toleratesNullPathAndMethod() {
        assertFalse(HttpClientFactory.isRetryUnsafePost(null, "POST"));
        assertFalse(HttpClientFactory.isRetryUnsafePost("/pts/v2/payments", null));
    }

    @Test
    public void getHttpClientHonoursExplicitRetryFalse() throws ConfigException {
        HttpClientFactoryAdditionalSettings settings = new HttpClientFactoryAdditionalSettings();
        settings.setCustomRetryOnConnectionFailure(false);

        OkHttpClient client = HttpClientFactory.getHttpClient(newMerchantConfig(), settings);

        assertFalse(client.retryOnConnectionFailure());
    }

    @Test
    public void getHttpClientHonoursExplicitRetryTrue() throws ConfigException {
        HttpClientFactoryAdditionalSettings settings = new HttpClientFactoryAdditionalSettings();
        settings.setCustomRetryOnConnectionFailure(true);

        OkHttpClient client = HttpClientFactory.getHttpClient(newMerchantConfig(), settings);

        assertTrue(client.retryOnConnectionFailure());
    }

    @Test
    public void getHttpClientDefaultsToOkHttpRetryWhenUnset() throws ConfigException {
        HttpClientFactoryAdditionalSettings settings = new HttpClientFactoryAdditionalSettings();

        OkHttpClient client = HttpClientFactory.getHttpClient(newMerchantConfig(), settings);

        assertTrue("OkHttp's own default is retryOnConnectionFailure=true", client.retryOnConnectionFailure());
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
