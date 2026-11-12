package Invokers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/**
 * Covers the issue #4252 fix: {@link ProgressRequestBody#isOneShot()} must delegate to the
 * wrapped body instead of using {@link RequestBody}'s default of {@code false}, so OkHttp
 * will not attempt to replay a one-shot body on a connection-failure retry.
 */
public class ProgressRequestBodyTest {

    @Test
    public void delegatesOneShotTrue() {
        ProgressRequestBody body = new ProgressRequestBody(oneShotRequestBody(true), (written, total, done) -> { });
        assertTrue(body.isOneShot());
    }

    @Test
    public void delegatesOneShotFalse() {
        ProgressRequestBody body = new ProgressRequestBody(oneShotRequestBody(false), (written, total, done) -> { });
        assertFalse(body.isOneShot());
    }

    private static RequestBody oneShotRequestBody(boolean oneShot) {
        return new RequestBody() {
            @Override
            public MediaType contentType() {
                return MediaType.parse("text/plain");
            }

            @Override
            public void writeTo(BufferedSink sink) throws IOException {
                sink.writeUtf8("test");
            }

            @Override
            public boolean isOneShot() {
                return oneShot;
            }
        };
    }
}
