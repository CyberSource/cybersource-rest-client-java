package utilities.telemetry;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ClientTelemetry {
	public static final String TELEMETRY_HEADER_NAME = "v-c-client-telemetry";
	private static final int MAX_REQUEST_METRICS_QUEUE_SIZE = 100;
	private static ConcurrentLinkedQueue<RequestTransactionMetrics> previousRequestTransactionMetrics = new ConcurrentLinkedQueue<>();
	
	public static void pushMetricsForRequest(RequestTransactionMetrics requestMetrics) {
		if (previousRequestTransactionMetrics.size() <= MAX_REQUEST_METRICS_QUEUE_SIZE) {
			previousRequestTransactionMetrics.add(requestMetrics);
		}
	}
	
	public static RequestTransactionMetrics getMetricsForPreviousRequest() {
		return previousRequestTransactionMetrics.poll();
	}
}
