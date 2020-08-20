package Invokers;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class RetryInterceptor implements Interceptor {
	public static long retryDelay;
	public static boolean retryEnabled;
	
	@Override
	public Response intercept(Chain chain) throws IOException {
		int MAX_RETRIES = 3;
		int retryNo = 0;
		Request request = null;
		Response response = null;
		long retryWait = retryDelay;
		
		request = chain.request();
		
		response = doRequest(chain, request);
		
		if (retryEnabled) {
			while (response == null && retryNo <= MAX_RETRIES) {
				try {
					Thread.sleep(retryWait);
				} catch (InterruptedException e) {

				}

				retryWait *= 2;

				response = doRequest(chain, request);
				retryNo++;
			} 
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
