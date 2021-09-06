package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import Model.*;
import com.google.gson.reflect.TypeToken;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OAuthApi {
    private static Logger logger = LogManager.getLogger(NotificationOfChangesApi.class);

    private ApiClient apiClient;

    public OAuthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OAuthApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for postAccessTokenFromAuthCode
     * @param createAccessTokenRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call postAccessTokenFromAuthCodeCall(CreateAccessTokenRequest createAccessTokenRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createAccessTokenRequest;

        // create path and map variables
        String localVarPath = "/oauth2/v3/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postAccessTokenFromAuthCodeValidateBeforeCall(CreateAccessTokenRequest createAccessTokenRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'CreateAccessTokenRequest' is set
        if (createAccessTokenRequest == null) {
            throw new ApiException("Missing the required parameter 'createAccessTokenRequest' when calling postAccessTokenFromAuthCode(Async)");
        }


        okhttp3.Call call = postAccessTokenFromAuthCodeCall(createAccessTokenRequest, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Post Access Token from Auth Code
     * @param createAccessTokenRequest  (required)
     * @return AccessTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccessTokenResponse postAccessTokenFromAuthCode(CreateAccessTokenRequest createAccessTokenRequest) throws ApiException {
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<AccessTokenResponse> resp = postAccessTokenFromAuthCodeWithHttpInfo(createAccessTokenRequest);
        return resp.getData();
    }


    /**
     * Post Access Token from Auth Code
     * @param createAccessTokenRequest  (required)
     * @return ApiResponse&lt;AccessTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */

    public ApiResponse<AccessTokenResponse> postAccessTokenFromAuthCodeWithHttpInfo(CreateAccessTokenRequest createAccessTokenRequest) throws ApiException {
        okhttp3.Call call = postAccessTokenFromAuthCodeValidateBeforeCall(createAccessTokenRequest, null, null);
        Type localVarReturnType = new TypeToken<AccessTokenResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Post Access Token from Auth Code (asynchronously)
     * @param createAccessTokenRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */

    public okhttp3.Call postAccessTokenFromAuthCodeAsync(CreateAccessTokenRequest createAccessTokenRequest, final ApiCallback<AccessTokenResponse> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = postAccessTokenFromAuthCodeValidateBeforeCall(createAccessTokenRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccessTokenResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }


    /**
     * Build call for postAccessTokenFromRefreshToken
     * @param createAccessTokenRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call postAccessTokenFromRefreshTokenCall(CreateAccessTokenRequest createAccessTokenRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createAccessTokenRequest;

        // create path and map variables
        String localVarPath = "/oauth2/v3/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postAccessTokenFromRefreshTokenValidateBeforeCall(CreateAccessTokenRequest createAccessTokenRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'CreateAccessTokenRequest' is set
        if (createAccessTokenRequest == null) {
            throw new ApiException("Missing the required parameter 'createAccessTokenRequest' when calling postAccessTokenFromRefreshToken(Async)");
        }


        okhttp3.Call call = postAccessTokenFromRefreshTokenCall(createAccessTokenRequest, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Post Access Token from Refresh Token
     * @param createAccessTokenRequest  (required)
     * @return AccessTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccessTokenResponse postAccessTokenFromRefreshToken(CreateAccessTokenRequest createAccessTokenRequest) throws ApiException {
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<AccessTokenResponse> resp = postAccessTokenFromRefreshTokenWithHttpInfo(createAccessTokenRequest);
        return resp.getData();
    }


    /**
     * Post Access Token from Refresh Token
     * @param createAccessTokenRequest  (required)
     * @return ApiResponse&lt;AccessTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */

    public ApiResponse<AccessTokenResponse> postAccessTokenFromRefreshTokenWithHttpInfo(CreateAccessTokenRequest createAccessTokenRequest) throws ApiException {
        okhttp3.Call call = postAccessTokenFromRefreshTokenValidateBeforeCall(createAccessTokenRequest, null, null);
        Type localVarReturnType = new TypeToken<AccessTokenResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Post Access Token from Refresh Token (asynchronously)
     * @param createAccessTokenRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */

    public okhttp3.Call postAccessTokenFromRefreshTokenAsync(CreateAccessTokenRequest createAccessTokenRequest, final ApiCallback<AccessTokenResponse> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = postAccessTokenFromRefreshTokenValidateBeforeCall(createAccessTokenRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccessTokenResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
