package utilities.listeners;

import okhttp3.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Routine lifecycle events are logged at DEBUG (opt-in, silent by default - this repo's history
 * shows always-on prints from this listener were deliberately removed twice, see commits
 * 1cac0d54a and f6924b54d). Failures are logged at WARN/ERROR unconditionally: that is the one
 * signal that makes a connection-level retry/replay observable (see issue #4252), and failures
 * are low-frequency by definition so they do not reintroduce the log-volume problem.
 */
public class NetworkEventListener extends EventListener {

    private static final Logger logger = LogManager.getLogger(NetworkEventListener.class);

    final long callId;
    final long callStartNanos;

    public NetworkEventListener(long callId, long callStartNanos) {
        this.callId = callId;
        this.callStartNanos = callStartNanos;
    }

    private long elapsedMs() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - callStartNanos);
    }

    private void logEvent(String name, Call call) {
        logger.debug("callId={} elapsedMs={} event={} url={}", callId, elapsedMs(), name, call.request().url());
    }

    private void logFailure(String name, Call call, IOException ioe) {
        logger.warn("callId={} elapsedMs={} event={} url={} error={}", callId, elapsedMs(), name, call.request().url(), ioe.toString());
    }

    @Override public void callStart(Call call) {
        logEvent("callStart", call);
    }

    @Override public void dnsStart(Call call, String domainName) {
        logEvent("dnsStart", call);
    }

    @Override public void dnsEnd(Call call, String domainName, List<InetAddress> inetAddressList) {
        logEvent("dnsEnd", call);
    }

    @Override public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        logEvent("connectStart", call);
    }

    @Override public void secureConnectStart(Call call) {
        logEvent("secureConnectStart", call);
    }

    @Override public void secureConnectEnd(Call call, Handshake handshake) {
        logEvent("secureConnectEnd", call);
    }

    @Override public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        logEvent("connectEnd", call);
    }

    @Override public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        logFailure("connectFailed", call, ioe);
    }

    @Override public void connectionAcquired(Call call, Connection connection) {
        logEvent("connectionAcquired", call);
    }

    @Override public void connectionReleased(Call call, Connection connection) {
        logEvent("connectionReleased", call);
    }

    @Override public void requestHeadersStart(Call call) {
        logEvent("requestHeadersStart", call);
    }

    @Override public void requestHeadersEnd(Call call, Request request) {
        logEvent("requestHeadersEnd", call);
    }

    @Override public void requestBodyStart(Call call) {
        logEvent("requestBodyStart", call);
    }

    @Override public void requestBodyEnd(Call call, long byteCount) {
        logger.debug("callId={} elapsedMs={} event={} url={} bytes={}", callId, elapsedMs(), "requestBodyEnd", call.request().url(), byteCount);
    }

    @Override public void requestFailed(Call call, IOException ioe) {
        logFailure("requestFailed", call, ioe);
    }

    @Override public void responseHeadersStart(Call call) {
        logEvent("responseHeadersStart", call);
    }

    @Override public void responseHeadersEnd(Call call, Response response) {
        logEvent("responseHeadersEnd", call);
    }

    @Override public void responseBodyStart(Call call) {
        logEvent("responseBodyStart", call);
    }

    @Override public void responseBodyEnd(Call call, long byteCount) {
        logger.debug("callId={} elapsedMs={} event={} url={} bytes={}", callId, elapsedMs(), "responseBodyEnd", call.request().url(), byteCount);
    }

    @Override public void responseFailed(Call call, IOException ioe) {
        logFailure("responseFailed", call, ioe);
    }

    @Override public void callEnd(Call call) {
        logEvent("callEnd", call);
    }

    @Override public void callFailed(Call call, IOException ioe) {
        logger.error("callId={} elapsedMs={} event={} url={} error={}", callId, elapsedMs(), "callFailed", call.request().url(), ioe.toString());
    }
}