package utilities.interceptors;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import utilities.telemetry.RequestResponseTelemetryHandler;
import utilities.telemetry.RequestTransactionMetrics;

public class RetryInterceptor implements Interceptor {
	public static long retryDelay;
	public static boolean retryEnabled;
	private RequestTransactionMetrics requestMetrics;
	
	public RetryInterceptor(RequestTransactionMetrics apiRequestMetrics) {
		this.requestMetrics = apiRequestMetrics;
	}

	@Override
	public Response intercept(Chain chain) throws IOException {
		// int MAX_RETRIES = 3;
		int retryNo = 1;
		Request request = null;
		Response response = null;
		// long retryWait = retryDelay;
		
		request = chain.request();
		request = RequestResponseTelemetryHandler.addTelemetryFromPreviousRequest(request);

		response = doRequest(chain, request);
		
		if (response != null) {
			RequestResponseTelemetryHandler.collectResponseTelemetry(requestMetrics, response, retryNo - 1);
		}
		
		return response;
	}
	
	private Response doRequest(Chain chain, Request request){
		Response response = null;
		try{
			response = chain.proceed(request);
		}catch (Exception e){
			
		}
		
		return response;
	}
}
