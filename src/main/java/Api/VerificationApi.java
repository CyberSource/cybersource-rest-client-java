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


import Model.PtsV2PaymentsPost502Response;
import Model.RiskV1AddressVerificationsPost201Response;
import Model.RiskV1DecisionsPost400Response1;
import Model.RiskV1ExportComplianceInquiriesPost201Response;
import Model.ValidateExportComplianceRequest;
import Model.VerifyCustomerAddressRequest;

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

public class VerificationApi {
    private static Logger logger = LogManager.getLogger(VerificationApi.class);
    
    private ApiClient apiClient;

    public VerificationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VerificationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for validateExportCompliance
     * @param validateExportComplianceRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call validateExportComplianceCall(ValidateExportComplianceRequest validateExportComplianceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(validateExportComplianceRequest, ValidateExportComplianceRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment(), apiClient.merchantConfig.getDefaultDeveloperId());
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "validateExportCompliance,validateExportComplianceAsync,validateExportComplianceWithHttpInfo,validateExportComplianceCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/risk/v1/export-compliance-inquiries";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
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
    private okhttp3.Call validateExportComplianceValidateBeforeCall(ValidateExportComplianceRequest validateExportComplianceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'validateExportComplianceRequest' is set
        if (validateExportComplianceRequest == null) {
            logger.error("Missing the required parameter 'validateExportComplianceRequest' when calling validateExportCompliance(Async)");
            throw new ApiException("Missing the required parameter 'validateExportComplianceRequest' when calling validateExportCompliance(Async)");
        }
        
        
        okhttp3.Call call = validateExportComplianceCall(validateExportComplianceRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Validate export compliance
     * This call checks customer data against specified watch lists to ensure export compliance. 
     * @param validateExportComplianceRequest  (required)
     * @return RiskV1ExportComplianceInquiriesPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RiskV1ExportComplianceInquiriesPost201Response validateExportCompliance(ValidateExportComplianceRequest validateExportComplianceRequest) throws ApiException {
        logger.info("CALL TO METHOD 'validateExportCompliance' STARTED");
        ApiResponse<RiskV1ExportComplianceInquiriesPost201Response> resp = validateExportComplianceWithHttpInfo(validateExportComplianceRequest);
        logger.info("CALL TO METHOD 'validateExportCompliance' ENDED");
        return resp.getData();
    }

    /**
     * Validate export compliance
     * This call checks customer data against specified watch lists to ensure export compliance. 
     * @param validateExportComplianceRequest  (required)
     * @return ApiResponse&lt;RiskV1ExportComplianceInquiriesPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RiskV1ExportComplianceInquiriesPost201Response> validateExportComplianceWithHttpInfo(ValidateExportComplianceRequest validateExportComplianceRequest) throws ApiException {
        this.apiClient.setComputationStartTime(System.nanoTime());
        okhttp3.Call call = validateExportComplianceValidateBeforeCall(validateExportComplianceRequest, null, null);
        Type localVarReturnType = new TypeToken<RiskV1ExportComplianceInquiriesPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Validate export compliance (asynchronously)
     * This call checks customer data against specified watch lists to ensure export compliance. 
     * @param validateExportComplianceRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call validateExportComplianceAsync(ValidateExportComplianceRequest validateExportComplianceRequest, final ApiCallback<RiskV1ExportComplianceInquiriesPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = validateExportComplianceValidateBeforeCall(validateExportComplianceRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RiskV1ExportComplianceInquiriesPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for verifyCustomerAddress
     * @param verifyCustomerAddressRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call verifyCustomerAddressCall(VerifyCustomerAddressRequest verifyCustomerAddressRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(verifyCustomerAddressRequest, VerifyCustomerAddressRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment(), apiClient.merchantConfig.getDefaultDeveloperId());
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "verifyCustomerAddress,verifyCustomerAddressAsync,verifyCustomerAddressWithHttpInfo,verifyCustomerAddressCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/risk/v1/address-verifications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
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
    private okhttp3.Call verifyCustomerAddressValidateBeforeCall(VerifyCustomerAddressRequest verifyCustomerAddressRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'verifyCustomerAddressRequest' is set
        if (verifyCustomerAddressRequest == null) {
            logger.error("Missing the required parameter 'verifyCustomerAddressRequest' when calling verifyCustomerAddress(Async)");
            throw new ApiException("Missing the required parameter 'verifyCustomerAddressRequest' when calling verifyCustomerAddress(Async)");
        }
        
        
        okhttp3.Call call = verifyCustomerAddressCall(verifyCustomerAddressRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Verify customer address
     * This call verifies that the customer address submitted is valid.
     * @param verifyCustomerAddressRequest  (required)
     * @return RiskV1AddressVerificationsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RiskV1AddressVerificationsPost201Response verifyCustomerAddress(VerifyCustomerAddressRequest verifyCustomerAddressRequest) throws ApiException {
        logger.info("CALL TO METHOD 'verifyCustomerAddress' STARTED");
        ApiResponse<RiskV1AddressVerificationsPost201Response> resp = verifyCustomerAddressWithHttpInfo(verifyCustomerAddressRequest);
        logger.info("CALL TO METHOD 'verifyCustomerAddress' ENDED");
        return resp.getData();
    }

    /**
     * Verify customer address
     * This call verifies that the customer address submitted is valid.
     * @param verifyCustomerAddressRequest  (required)
     * @return ApiResponse&lt;RiskV1AddressVerificationsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RiskV1AddressVerificationsPost201Response> verifyCustomerAddressWithHttpInfo(VerifyCustomerAddressRequest verifyCustomerAddressRequest) throws ApiException {
        this.apiClient.setComputationStartTime(System.nanoTime());
        okhttp3.Call call = verifyCustomerAddressValidateBeforeCall(verifyCustomerAddressRequest, null, null);
        Type localVarReturnType = new TypeToken<RiskV1AddressVerificationsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify customer address (asynchronously)
     * This call verifies that the customer address submitted is valid.
     * @param verifyCustomerAddressRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call verifyCustomerAddressAsync(VerifyCustomerAddressRequest verifyCustomerAddressRequest, final ApiCallback<RiskV1AddressVerificationsPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = verifyCustomerAddressValidateBeforeCall(verifyCustomerAddressRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RiskV1AddressVerificationsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
