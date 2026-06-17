package utilities.telemetry;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ClientTelemetry {
	public static final String TELEMETRY_HEADER_NAME = "v-c-client-telemetry";
	private static final int MAX_REQUEST_METRICS_QUEUE_SIZE = 100;
	private static final ConcurrentLinkedQueue<RequestTransactionMetrics> previousRequestTransactionMetrics = new ConcurrentLinkedQueue<>();
	private static final AtomicInteger queueSize = new AtomicInteger(0);
	
	public static void pushMetricsForRequest(RequestTransactionMetrics requestMetrics) {
		if (queueSize.get() < MAX_REQUEST_METRICS_QUEUE_SIZE) {
			previousRequestTransactionMetrics.add(requestMetrics);
			queueSize.incrementAndGet();
		}
	}
	
	public static RequestTransactionMetrics getMetricsForPreviousRequest() {
		RequestTransactionMetrics metrics = previousRequestTransactionMetrics.poll();
		if (metrics != null) {
			queueSize.decrementAndGet();
		}
		return metrics;
	}
}
