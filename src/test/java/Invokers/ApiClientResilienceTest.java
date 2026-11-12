package Invokers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.junit.Test;

import com.cybersource.authsdk.core.ConfigException;
import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.authsdk.util.GlobalLabelParameters;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;

/**
 * Covers the issue #4252 fix on {@link ApiClient}: the {@code getAdditionalSettings()} /
 * {@code setAdditionalSettings()} seam, and the per-call retry override that
 * {@code buildCall()} applies via the private {@code createInternalHttpClient(boolean)} for
 * non-idempotent money-movement POSTs (exercised here through reflection, since the method
 * is intentionally not public API).
 */
public class ApiClientResilienceTest {

    @Test
    public void getAdditionalSettingsReturnsTheLiveInstance() throws ConfigException {
        ApiClient apiClient = new ApiClient(newMerchantConfig());
        assertSame(apiClient.getAdditionalSettings(), apiClient.getAdditionalSettings());
    }

    @Test
    public void setAdditionalSettingsReplacesTheInstanceUsedForRequests() throws ConfigException {
        ApiClient apiClient = new ApiClient(newMerchantConfig());

        HttpClientFactoryAdditionalSettings replacement = new HttpClientFactoryAdditionalSettings();
        replacement.setCustomRetryOnConnectionFailure(false);
        apiClient.setAdditionalSettings(replacement);

        assertSame(replacement, apiClient.getAdditionalSettings());
        assertFalse(apiClient.getHttpClient().retryOnConnectionFailure());
    }

    @Test
    public void forcesRetryOffForMoneyMovementPostWhenMerchantNeverSetAValue() throws Exception {
        ApiClient apiClient = new ApiClient(newMerchantConfig());

        OkHttpClient client = createInternalHttpClient(apiClient, true);

        assertFalse("Payment-type POSTs must default to retry-off", client.retryOnConnectionFailure());
        assertNull("The shared settings instance must not be mutated by the per-call override",
                apiClient.getAdditionalSettings().getCustomRetryOnConnectionFailure());
    }

    @Test
    public void leavesRetryAtOkHttpDefaultForOrdinaryCalls() throws Exception {
        ApiClient apiClient = new ApiClient(newMerchantConfig());

        OkHttpClient client = createInternalHttpClient(apiClient, false);

        assertTrue("Non-money-movement calls keep OkHttp's own default", client.retryOnConnectionFailure());
    }

    @Test
    public void merchantsExplicitChoiceAlwaysWinsOverTheMoneyMovementDefault() throws Exception {
        ApiClient apiClient = new ApiClient(newMerchantConfig());
        apiClient.getAdditionalSettings().setCustomRetryOnConnectionFailure(true);

        OkHttpClient client = createInternalHttpClient(apiClient, true);

        assertTrue("An explicit merchant opt-in must not be overridden", client.retryOnConnectionFailure());
    }

    @Test
    public void moneyMovementRequestBodyIsForcedOneShotEvenWithoutAProgressListener() throws Exception {
        ApiClient apiClient = new ApiClient(newMerchantConfig());
        RequestBody body = RequestBody.create("{}", MediaType.parse("application/json"));

        okhttp3.Request request = apiClient.buildRequest("/pts/v2/payments", "POST", new ArrayList<>(), body,
                new HashMap<>(), new HashMap<>(), new String[0], null);

        assertTrue("A retry-unsafe path's body must never be replayable, even without a progress listener",
                request.body().isOneShot());
    }

    @Test
    public void ordinaryRequestBodyIsNotForcedOneShot() throws Exception {
        ApiClient apiClient = new ApiClient(newMerchantConfig());
        RequestBody body = RequestBody.create("{}", MediaType.parse("application/json"));

        okhttp3.Request request = apiClient.buildRequest("/tms/v2/tokenize", "POST", new ArrayList<>(), body,
                new HashMap<>(), new HashMap<>(), new String[0], null);

        assertFalse("Non-money-movement paths are left at OkHttp's own default",
                request.body().isOneShot());
    }

    /** Invokes the private {@code ApiClient.createInternalHttpClient(boolean)} via reflection. */
    private static OkHttpClient createInternalHttpClient(ApiClient apiClient, boolean forceRetryOff) throws Exception {
        Method method = ApiClient.class.getDeclaredMethod("createInternalHttpClient", boolean.class);
        method.setAccessible(true);
        return (OkHttpClient) method.invoke(apiClient, forceRetryOff);
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
