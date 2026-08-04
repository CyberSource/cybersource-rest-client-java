package Invokers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.cybersource.authsdk.core.ConfigException;
import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.authsdk.util.GlobalLabelParameters;

import okhttp3.OkHttpClient;

/**
 * Verifies that creating many {@link ApiClient} objects that share the same
 * {@link MerchantConfig} does not leak memory.
 *
 * <p>The test exercises the {@link HttpClientFactory} cache in two ways:
 * <ul>
 *   <li><b>Identity</b> - every call with an equivalent configuration must return the
 *       <em>same</em> cached {@link OkHttpClient}, proving that clients (and their
 *       sockets/threads) are shared rather than accumulated per instance.</li>
 *   <li><b>Heap stability</b> - a large number of {@code ApiClient}/client lookups are
 *       performed while sampling the live heap over time. After a forced GC the retained
 *       heap must return close to its post-warm-up baseline, proving that the discarded
 *       {@code ApiClient} instances (and their per-instance interceptors/listeners) are
 *       reclaimed.</li>
 * </ul>
 */
public class HttpClientFactoryMemoryLeakTest {

    /** Number of client lookups performed in the heap-stability test. */
    private static final int ITERATIONS = 200_000;

    /** How often (in iterations) a heap sample is recorded. */
    private static final int SAMPLE_EVERY = 20_000;

    /**
     * Maximum heap growth tolerated between the warmed-up baseline and the final,
     * post-GC measurement. Generous enough to absorb JIT/classloader noise while still
     * catching a genuine per-iteration leak (which would be hundreds of MB at this
     * iteration count).
     */
    private static final long MAX_HEAP_GROWTH_BYTES = 32L * 1024 * 1024; // 32 MB

    private MerchantConfig merchantConfig;

    @Before
    public void setUp() throws ConfigException {
        merchantConfig = newMerchantConfig();
    }

    /**
     * Many {@link ApiClient} objects built from one {@link MerchantConfig} must all share a
     * single cached client. This is the strongest signal that no per-instance client
     * accumulation occurs.
     */
    @Test
    public void manyApiClientsShareOneCachedClient() throws ConfigException {
        OkHttpClient first = new ApiClient(merchantConfig).getHttpClient();

        for (int i = 0; i < 10_000; i++) {
            OkHttpClient next = new ApiClient(merchantConfig).getHttpClient();
            assertSame("Expected one shared OkHttpClient for the same MerchantConfig", first, next);
        }
    }

    /**
     * Creating many {@link ApiClient} objects with the same configuration must not grow the
     * heap without bound. Heap usage is printed over time for visibility and asserted to
     * remain flat after a final GC.
     */
    @Test
    public void creatingManyApiClientsDoesNotLeak() throws ConfigException {
        // Warm up: trigger classloading, JIT and the first (retained) cached client so the
        // baseline reflects steady state rather than one-off initialisation cost.
        for (int i = 0; i < SAMPLE_EVERY; i++) {
            consume(new ApiClient(merchantConfig).getHttpClient());
        }

        long baseline = usedHeapAfterGc();
        List<long[]> samples = new ArrayList<>();
        samples.add(new long[] { 0L, baseline });

        OkHttpClient firstClient = new ApiClient(merchantConfig).getHttpClient();

        for (int i = 1; i <= ITERATIONS; i++) {
            // Build a fresh ApiClient and resolve its client, then drop every reference so the
            // instance is immediately eligible for garbage collection.
            OkHttpClient http = new ApiClient(merchantConfig).getHttpClient();
            assertSame("Cache must keep returning the shared client", firstClient, http);
            consume(http);

            if (i % SAMPLE_EVERY == 0) {
                samples.add(new long[] { i, usedHeap() });
            }
        }

        long finalUsed = usedHeapAfterGc();
        samples.add(new long[] { ITERATIONS, finalUsed });

        printHeapTimeline(baseline, samples, finalUsed);

        long growth = finalUsed - baseline;
        assertTrue(
                String.format(
                        "Heap grew by %.2f MB after %,d ApiClient creations (limit %.2f MB) - possible leak",
                        growth / (1024.0 * 1024.0), ITERATIONS, MAX_HEAP_GROWTH_BYTES / (1024.0 * 1024.0)),
                growth <= MAX_HEAP_GROWTH_BYTES);
    }

    /**
     * Builds a minimal but valid MerchantConfig. Uses HTTP-signature credentials (key id +
     * base64 shared secret) so construction succeeds without needing a key file on disk.
     */
    private static MerchantConfig newMerchantConfig() throws ConfigException {
        Properties props = new Properties();
        props.setProperty("merchantID", "testrest");
        props.setProperty("runEnvironment", "apitest.cybersource.com");
        props.setProperty("authenticationType", "http_signature");
        props.setProperty("merchantKeyId", "00000000-0000-0000-0000-000000000000");
        props.setProperty("merchantsecretKey", "cnVuLXRlc3Qtc2VjcmV0LWtleS12YWx1ZQ=="); // base64 dummy
        props.setProperty("userDefinedConnectionTimeout", GlobalLabelParameters.DEFAULT_MAX_CONNECT_TIMEOUT_IN_SECONDS);
        props.setProperty("userDefinedReadTimeout", GlobalLabelParameters.DEFAULT_MAX_READ_TIMEOUT_IN_SECONDS);
        props.setProperty("userDefinedWriteTimeout", GlobalLabelParameters.DEFAULT_MAX_WRITE_TIMEOUT_IN_SECONDS);
        props.setProperty("userDefinedKeepAliveDuration", GlobalLabelParameters.DEFAULT_MAX_KEEP_ALIVE_DURATION_IN_SECONDS);
        props.setProperty("userDefinedMaxIdleConnections", GlobalLabelParameters.DEFAULT_MAX_IDLE_CONNECTIONS);
        return new MerchantConfig(props);
    }

    private static long usedHeap() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    /**
     * Requests garbage collection and returns the resulting used-heap reading. {@code System.gc()}
     * is only a hint, so it is invoked a few times with short pauses to make the measurement
     * stable enough for a leak assertion.
     */
    private static long usedHeapAfterGc() {
        for (int i = 0; i < 4; i++) {
            System.gc();
            System.runFinalization();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                fail("Interrupted while waiting for GC");
            }
        }
        return usedHeap();
    }

    /** Prevents the JIT from optimising away the client lookups. */
    private static void consume(OkHttpClient client) {
        if (client == null) {
            fail("ApiClient returned a null OkHttpClient");
        }
    }

    private static void printHeapTimeline(long baseline, List<long[]> samples, long finalUsed) {
        System.out.println("---- ApiClient heap usage over time (same MerchantConfig) ----");
        System.out.printf("baseline (post-warmup, post-GC): %.2f MB%n", baseline / (1024.0 * 1024.0));
        for (long[] sample : samples) {
            System.out.printf("  iteration %,10d : %.2f MB%n", sample[0], sample[1] / (1024.0 * 1024.0));
        }
        System.out.printf("final (post-GC):                 %.2f MB%n", finalUsed / (1024.0 * 1024.0));
        System.out.printf("net growth:                      %.2f MB%n",
                (finalUsed - baseline) / (1024.0 * 1024.0));
        System.out.println("--------------------------------------------------------------");
    }
}
