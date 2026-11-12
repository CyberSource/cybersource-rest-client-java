package Invokers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import utilities.listeners.NetworkEventListener;

/**
 * Covers the issue #4252 fix: {@link HttpClientFactoryAdditionalSettings} getter/setter for
 * retry-on-connection-failure, and the shallow {@code copy()} used to apply a per-call
 * override without mutating the merchant's shared settings instance.
 */
public class HttpClientFactoryAdditionalSettingsTest {

    @Test
    public void retryOnConnectionFailureIsUnsetByDefault() {
        HttpClientFactoryAdditionalSettings settings = new HttpClientFactoryAdditionalSettings();
        assertNull("Unset means 'use OkHttp's own default'", settings.getCustomRetryOnConnectionFailure());
    }

    @Test
    public void setterIsHonoured() {
        HttpClientFactoryAdditionalSettings settings = new HttpClientFactoryAdditionalSettings();

        settings.setCustomRetryOnConnectionFailure(false);
        assertEquals(Boolean.FALSE, settings.getCustomRetryOnConnectionFailure());

        settings.setCustomRetryOnConnectionFailure(true);
        assertEquals(Boolean.TRUE, settings.getCustomRetryOnConnectionFailure());
    }

    @Test
    public void copyProducesAnIndependentInstance() {
        HttpClientFactoryAdditionalSettings original = new HttpClientFactoryAdditionalSettings();
        original.setCustomRetryOnConnectionFailure(true);
        NetworkEventListener listener = new NetworkEventListener(1L, System.nanoTime());
        original.setCustomNetworkEventListener(listener);

        HttpClientFactoryAdditionalSettings copy = original.copy();

        assertNotSame("copy() must return a new instance", original, copy);
        assertEquals("Field values are carried over", Boolean.TRUE, copy.getCustomRetryOnConnectionFailure());
        assertSame("Shared collaborators are reused, not cloned", listener, copy.getCustomNetworkEventListener());
    }

    @Test
    public void mutatingCopyDoesNotAffectOriginal() {
        HttpClientFactoryAdditionalSettings original = new HttpClientFactoryAdditionalSettings();
        // left unset, simulating a merchant who never touched the retry flag

        HttpClientFactoryAdditionalSettings copy = original.copy();
        copy.setCustomRetryOnConnectionFailure(false);

        assertNull("Forcing retry off on the copy must not leak back to the shared settings",
                original.getCustomRetryOnConnectionFailure());
        assertEquals(Boolean.FALSE, copy.getCustomRetryOnConnectionFailure());
    }
}
