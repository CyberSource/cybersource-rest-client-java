package utilities.telemetry;

import com.google.gson.Gson;

public class RequestTransactionMetrics {
	private String responseCorrelationId;
	private long roundaboutTime;
	private long computeTime;
	private int retryCount;
	//private long computationStartTime;
	
	public RequestTransactionMetrics() {
	}
	
	/**
	 * @param responseCorrelationId the responseCorrelationId to set
	 */
	public void setResponseCorrelationId(String responseCorrelationId) {
		this.responseCorrelationId = responseCorrelationId;
	}

	/**
	 * @param roundaboutTime the roundaboutTime to set
	 */
	public void setRoundaboutTime(long roundaboutTime) {
		this.roundaboutTime = roundaboutTime;
	}

	/**
	 * @param computeTime the computeTime to set
	 */
	public void setComputeTime(long computeTime) {
		this.computeTime = computeTime;
	}

	/**
	 * @param retryCount the retryCount to set
	 */
	public void setRetryCount(int retryCount) {
		this.retryCount = retryCount;
	}

	public String getTelemetryHeaderValue() {
		Gson gson = new Gson();

		return gson.toJson(this);
	}

	/**
	 * Adds Header Values from response object of previous request
	 * @param correlationId
	 * @param timeTaken
	 * @param noOfRetries
	 * @return
	 */
	public RequestTransactionMetrics addHeaderValues(String correlationId, long timeTaken, int noOfRetries) {
		this.setResponseCorrelationId(correlationId);
		this.setRoundaboutTime(timeTaken);
		this.setRetryCount(noOfRetries);
		return this;
	}
}
