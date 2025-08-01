/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;


import Model.Body;
import Model.InlineResponse20010;
import Model.InlineResponse2008;
import Model.InlineResponse2009;
import Model.InlineResponse202;
import Model.InlineResponse4011;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.tracking.SdkTracker;
import com.cybersource.authsdk.util.mle.MLEUtility;
import com.cybersource.authsdk.util.mle.MLEException;

public class BatchesApi {
    private static Logger logger = LogManager.getLogger(BatchesApi.class);
    
    private ApiClient apiClient;

    public BatchesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BatchesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getBatchReport
     * @param batchId Unique identification number assigned to the submitted request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getBatchReportCall(String batchId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = null;
        if ("GET".equalsIgnoreCase("POST")) {
            localVarPostBody = "{}";
        }
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "getBatchReport,getBatchReportAsync,getBatchReportWithHttpInfo,getBatchReportCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/accountupdater/v1/batches/{batchId}/report"
            .replaceAll("\\{" + "batchId" + "\\}", apiClient.escapeString(batchId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBatchReportValidateBeforeCall(String batchId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            logger.error("Missing the required parameter 'batchId' when calling getBatchReport(Async)");
            throw new ApiException("Missing the required parameter 'batchId' when calling getBatchReport(Async)");
        }
        
        
        okhttp3.Call call = getBatchReportCall(batchId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve a Batch Report
     * **Get Batch Report**&lt;br&gt;This resource accepts a batch id and returns: - The batch status. - The total number of accepted, rejected, updated records. - The total number of card association responses. - The billable quantities of:   - New Account Numbers (NAN)   - New Expiry Dates (NED)   - Account Closures (ACL)   - Contact Card Holders (CCH) - Source record information including token ids, masked card number, expiration dates &amp; card type. - Response record information including response code, reason, token ids, masked card number, expiration dates &amp; card type. 
     * @param batchId Unique identification number assigned to the submitted request. (required)
     * @return InlineResponse20010
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20010 getBatchReport(String batchId) throws ApiException {
        logger.info("CALL TO METHOD 'getBatchReport' STARTED");
        ApiResponse<InlineResponse20010> resp = getBatchReportWithHttpInfo(batchId);
        logger.info("CALL TO METHOD 'getBatchReport' ENDED");
        return resp.getData();
    }

    /**
     * Retrieve a Batch Report
     * **Get Batch Report**&lt;br&gt;This resource accepts a batch id and returns: - The batch status. - The total number of accepted, rejected, updated records. - The total number of card association responses. - The billable quantities of:   - New Account Numbers (NAN)   - New Expiry Dates (NED)   - Account Closures (ACL)   - Contact Card Holders (CCH) - Source record information including token ids, masked card number, expiration dates &amp; card type. - Response record information including response code, reason, token ids, masked card number, expiration dates &amp; card type. 
     * @param batchId Unique identification number assigned to the submitted request. (required)
     * @return ApiResponse&lt;InlineResponse20010&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20010> getBatchReportWithHttpInfo(String batchId) throws ApiException {
        this.apiClient.setComputationStartTime(System.nanoTime());
        okhttp3.Call call = getBatchReportValidateBeforeCall(batchId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20010>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a Batch Report (asynchronously)
     * **Get Batch Report**&lt;br&gt;This resource accepts a batch id and returns: - The batch status. - The total number of accepted, rejected, updated records. - The total number of card association responses. - The billable quantities of:   - New Account Numbers (NAN)   - New Expiry Dates (NED)   - Account Closures (ACL)   - Contact Card Holders (CCH) - Source record information including token ids, masked card number, expiration dates &amp; card type. - Response record information including response code, reason, token ids, masked card number, expiration dates &amp; card type. 
     * @param batchId Unique identification number assigned to the submitted request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getBatchReportAsync(String batchId, final ApiCallback<InlineResponse20010> callback) throws ApiException {

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

        okhttp3.Call call = getBatchReportValidateBeforeCall(batchId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20010>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBatchStatus
     * @param batchId Unique identification number assigned to the submitted request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getBatchStatusCall(String batchId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = null;
        if ("GET".equalsIgnoreCase("POST")) {
            localVarPostBody = "{}";
        }
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "getBatchStatus,getBatchStatusAsync,getBatchStatusWithHttpInfo,getBatchStatusCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/accountupdater/v1/batches/{batchId}/status"
            .replaceAll("\\{" + "batchId" + "\\}", apiClient.escapeString(batchId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBatchStatusValidateBeforeCall(String batchId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            logger.error("Missing the required parameter 'batchId' when calling getBatchStatus(Async)");
            throw new ApiException("Missing the required parameter 'batchId' when calling getBatchStatus(Async)");
        }
        
        
        okhttp3.Call call = getBatchStatusCall(batchId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve a Batch Status
     * **Get Batch Status**&lt;br&gt;This resource accepts a batch id and returns: - The batch status. - The total number of accepted, rejected, updated records. - The total number of card association responses. - The billable quantities of:   - New Account Numbers (NAN)   - New Expiry Dates (NED)   - Account Closures (ACL)   - Contact Card Holders (CCH) 
     * @param batchId Unique identification number assigned to the submitted request. (required)
     * @return InlineResponse2009
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2009 getBatchStatus(String batchId) throws ApiException {
        logger.info("CALL TO METHOD 'getBatchStatus' STARTED");
        ApiResponse<InlineResponse2009> resp = getBatchStatusWithHttpInfo(batchId);
        logger.info("CALL TO METHOD 'getBatchStatus' ENDED");
        return resp.getData();
    }

    /**
     * Retrieve a Batch Status
     * **Get Batch Status**&lt;br&gt;This resource accepts a batch id and returns: - The batch status. - The total number of accepted, rejected, updated records. - The total number of card association responses. - The billable quantities of:   - New Account Numbers (NAN)   - New Expiry Dates (NED)   - Account Closures (ACL)   - Contact Card Holders (CCH) 
     * @param batchId Unique identification number assigned to the submitted request. (required)
     * @return ApiResponse&lt;InlineResponse2009&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2009> getBatchStatusWithHttpInfo(String batchId) throws ApiException {
        this.apiClient.setComputationStartTime(System.nanoTime());
        okhttp3.Call call = getBatchStatusValidateBeforeCall(batchId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2009>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a Batch Status (asynchronously)
     * **Get Batch Status**&lt;br&gt;This resource accepts a batch id and returns: - The batch status. - The total number of accepted, rejected, updated records. - The total number of card association responses. - The billable quantities of:   - New Account Numbers (NAN)   - New Expiry Dates (NED)   - Account Closures (ACL)   - Contact Card Holders (CCH) 
     * @param batchId Unique identification number assigned to the submitted request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getBatchStatusAsync(String batchId, final ApiCallback<InlineResponse2009> callback) throws ApiException {

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

        okhttp3.Call call = getBatchStatusValidateBeforeCall(batchId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2009>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBatchesList
     * @param offset Starting record in zero-based dataset that should be returned as the first object in the array. (optional, default to 0)
     * @param limit The maximum number that can be returned in the array starting from the offset record in zero-based dataset. (optional, default to 20)
     * @param fromDate ISO-8601 format: yyyyMMddTHHmmssZ (optional)
     * @param toDate ISO-8601 format: yyyyMMddTHHmmssZ (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getBatchesListCall(Long offset, Long limit, String fromDate, String toDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = null;
        if ("GET".equalsIgnoreCase("POST")) {
            localVarPostBody = "{}";
        }
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "getBatchesList,getBatchesListAsync,getBatchesListWithHttpInfo,getBatchesListCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/accountupdater/v1/batches";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (fromDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromDate", fromDate));
        if (toDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "toDate", toDate));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBatchesListValidateBeforeCall(Long offset, Long limit, String fromDate, String toDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        okhttp3.Call call = getBatchesListCall(offset, limit, fromDate, toDate, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Batches
     * **List Batches**&lt;br&gt;This resource accepts a optional date range, record offset and limit, returning a paginated response of batches containing: - The batch id. - The batch status. - The batch created / modified dates. - The total number of accepted, rejected, updated records. - The total number of card association responses. 
     * @param offset Starting record in zero-based dataset that should be returned as the first object in the array. (optional, default to 0)
     * @param limit The maximum number that can be returned in the array starting from the offset record in zero-based dataset. (optional, default to 20)
     * @param fromDate ISO-8601 format: yyyyMMddTHHmmssZ (optional)
     * @param toDate ISO-8601 format: yyyyMMddTHHmmssZ (optional)
     * @return InlineResponse2008
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2008 getBatchesList(Long offset, Long limit, String fromDate, String toDate) throws ApiException {
        logger.info("CALL TO METHOD 'getBatchesList' STARTED");
        ApiResponse<InlineResponse2008> resp = getBatchesListWithHttpInfo(offset, limit, fromDate, toDate);
        logger.info("CALL TO METHOD 'getBatchesList' ENDED");
        return resp.getData();
    }

    /**
     * List Batches
     * **List Batches**&lt;br&gt;This resource accepts a optional date range, record offset and limit, returning a paginated response of batches containing: - The batch id. - The batch status. - The batch created / modified dates. - The total number of accepted, rejected, updated records. - The total number of card association responses. 
     * @param offset Starting record in zero-based dataset that should be returned as the first object in the array. (optional, default to 0)
     * @param limit The maximum number that can be returned in the array starting from the offset record in zero-based dataset. (optional, default to 20)
     * @param fromDate ISO-8601 format: yyyyMMddTHHmmssZ (optional)
     * @param toDate ISO-8601 format: yyyyMMddTHHmmssZ (optional)
     * @return ApiResponse&lt;InlineResponse2008&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2008> getBatchesListWithHttpInfo(Long offset, Long limit, String fromDate, String toDate) throws ApiException {
        this.apiClient.setComputationStartTime(System.nanoTime());
        okhttp3.Call call = getBatchesListValidateBeforeCall(offset, limit, fromDate, toDate, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2008>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Batches (asynchronously)
     * **List Batches**&lt;br&gt;This resource accepts a optional date range, record offset and limit, returning a paginated response of batches containing: - The batch id. - The batch status. - The batch created / modified dates. - The total number of accepted, rejected, updated records. - The total number of card association responses. 
     * @param offset Starting record in zero-based dataset that should be returned as the first object in the array. (optional, default to 0)
     * @param limit The maximum number that can be returned in the array starting from the offset record in zero-based dataset. (optional, default to 20)
     * @param fromDate ISO-8601 format: yyyyMMddTHHmmssZ (optional)
     * @param toDate ISO-8601 format: yyyyMMddTHHmmssZ (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getBatchesListAsync(Long offset, Long limit, String fromDate, String toDate, final ApiCallback<InlineResponse2008> callback) throws ApiException {

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

        okhttp3.Call call = getBatchesListValidateBeforeCall(offset, limit, fromDate, toDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2008>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postBatch
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call postBatchCall(Body body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(body, Body.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment(), apiClient.merchantConfig.getDefaultDeveloperId());
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "postBatch,postBatchAsync,postBatchWithHttpInfo,postBatchCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/accountupdater/v1/batches";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
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
    private okhttp3.Call postBatchValidateBeforeCall(Body body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            logger.error("Missing the required parameter 'body' when calling postBatch(Async)");
            throw new ApiException("Missing the required parameter 'body' when calling postBatch(Async)");
        }
        
        
        okhttp3.Call call = postBatchCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a Batch
     * **Create a Batch**&lt;br&gt;This resource accepts TMS tokens ids of a Customer, Payment Instrument or Instrument Identifier. &lt;br&gt; The card numbers for the supplied tokens ids are then sent to the relevant card associations to check for updates.&lt;br&gt;The following type of batches can be submitted: -  **oneOff** batch containing tokens id for Visa or MasterCard card numbers. - **amexRegistration** batch containing tokens id for Amex card numbers.  A batch id will be returned on a successful response which can be used to get the batch status and the batch report. The availability of API features for a merchant may depend on the portfolio configuration and may need to be enabled at the portfolio level before they can be added to merchant accounts. 
     * @param body  (required)
     * @return InlineResponse202
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse202 postBatch(Body body) throws ApiException {
        logger.info("CALL TO METHOD 'postBatch' STARTED");
        ApiResponse<InlineResponse202> resp = postBatchWithHttpInfo(body);
        logger.info("CALL TO METHOD 'postBatch' ENDED");
        return resp.getData();
    }

    /**
     * Create a Batch
     * **Create a Batch**&lt;br&gt;This resource accepts TMS tokens ids of a Customer, Payment Instrument or Instrument Identifier. &lt;br&gt; The card numbers for the supplied tokens ids are then sent to the relevant card associations to check for updates.&lt;br&gt;The following type of batches can be submitted: -  **oneOff** batch containing tokens id for Visa or MasterCard card numbers. - **amexRegistration** batch containing tokens id for Amex card numbers.  A batch id will be returned on a successful response which can be used to get the batch status and the batch report. The availability of API features for a merchant may depend on the portfolio configuration and may need to be enabled at the portfolio level before they can be added to merchant accounts. 
     * @param body  (required)
     * @return ApiResponse&lt;InlineResponse202&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse202> postBatchWithHttpInfo(Body body) throws ApiException {
        this.apiClient.setComputationStartTime(System.nanoTime());
        okhttp3.Call call = postBatchValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse202>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a Batch (asynchronously)
     * **Create a Batch**&lt;br&gt;This resource accepts TMS tokens ids of a Customer, Payment Instrument or Instrument Identifier. &lt;br&gt; The card numbers for the supplied tokens ids are then sent to the relevant card associations to check for updates.&lt;br&gt;The following type of batches can be submitted: -  **oneOff** batch containing tokens id for Visa or MasterCard card numbers. - **amexRegistration** batch containing tokens id for Amex card numbers.  A batch id will be returned on a successful response which can be used to get the batch status and the batch report. The availability of API features for a merchant may depend on the portfolio configuration and may need to be enabled at the portfolio level before they can be added to merchant accounts. 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call postBatchAsync(Body body, final ApiCallback<InlineResponse202> callback) throws ApiException {

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

        okhttp3.Call call = postBatchValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse202>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
