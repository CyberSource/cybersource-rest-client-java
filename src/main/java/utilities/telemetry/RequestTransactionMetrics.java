package utilities.telemetry;

import com.google.gson.Gson;

public class RequestTransactionMetrics {
	private String responseCorrelationId;
	private String roundaboutTime;
	private int retryCount;
	
	public RequestTransactionMetrics(String correlationId, String roundaboutTime) {
		this.responseCorrelationId = correlationId;
		this.roundaboutTime = roundaboutTime;
	}
	
	public RequestTransactionMetrics(String correlationId, String roundaboutTime, int retries) {
		this.responseCorrelationId = correlationId;
		this.roundaboutTime = roundaboutTime;
		this.retryCount = retries;
	}
	
	public String getTelemetryHeaderValue() {
//		StringBuilder str = new StringBuilder();
//		
//		str.append("previous-correlation-id:").append(this.responseCorrelationId);
//		str.append(",");
//		str.append("previous-time-taken:").append(this.roundaboutTime);
//		str.append(",");
//		str.append("previous-retries:").append(this.retryCount);
//		
//		return str.toString();
		
		Gson gson = new Gson();
		
		return gson.toJson(this);
	}
}
