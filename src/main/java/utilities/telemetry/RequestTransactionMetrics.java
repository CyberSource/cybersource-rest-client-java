package utilities.telemetry;

import com.google.gson.Gson;

public class RequestTransactionMetrics {
	private String responseCorrelationId;
	private String roundaboutTime;
	private String computeTime;
	private int retryCount;
	
	public RequestTransactionMetrics() {
	}

	public RequestTransactionMetrics addHeaderValues(String computeTime) {
		this.computeTime = computeTime;

		return this;
	}

	public RequestTransactionMetrics addHeaderValues(String correlationId, String roundaboutTime) {
		this.responseCorrelationId = correlationId;
		this.roundaboutTime = roundaboutTime;

		return this;
	}

	public RequestTransactionMetrics addHeaderValues(String correlationId, String roundaboutTime, int retries) {
		this.responseCorrelationId = correlationId;
		this.roundaboutTime = roundaboutTime;
		this.retryCount = retries;

		return this;
	}

	public String getTelemetryHeaderValue() {
		Gson gson = new Gson();

		return gson.toJson(this);
	}
}
