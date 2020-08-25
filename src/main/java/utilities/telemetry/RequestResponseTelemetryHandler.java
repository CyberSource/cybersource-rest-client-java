package utilities.telemetry;

import okhttp3.Request;
import okhttp3.Response;

public class RequestResponseTelemetryHandler {
	public static void collectResponseTelemetry(RequestTransactionMetrics requestMetrics, Response response, int noOfRetries) {
		String correlationId = response.header("v-c-correlation-id");
		String timeTaken = String.valueOf(response.receivedResponseAtMillis() - response.sentRequestAtMillis());

		ClientTelemetry.pushMetricsForRequest(requestMetrics.addHeaderValues(correlationId, timeTaken, noOfRetries));
	}

	public static Request addTelemetryFromPreviousRequest(Request request) {
		RequestTransactionMetrics previousRequestMetrics = ClientTelemetry.getMetricsForPreviousRequest();
		
		if (previousRequestMetrics != null) {
			Request newRequest = request.newBuilder()
										.addHeader(ClientTelemetry.TELEMETRY_HEADER_NAME, previousRequestMetrics.getTelemetryHeaderValue())
								 		.build();
					
			return newRequest;
		} else {
			return request;
		}
	}
}
