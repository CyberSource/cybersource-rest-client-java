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


import Model.CreateBillingAgreement;
import Model.IntimateBillingAgreement;
import Model.ModifyBillingAgreement;
import Model.PtsV2CreateBillingAgreementPost201Response;
import Model.PtsV2CreateBillingAgreementPost400Response;
import Model.PtsV2CreateBillingAgreementPost502Response;
import Model.PtsV2CreditsPost201Response1;
import Model.PtsV2ModifyBillingAgreementPost201Response;

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

public class BillingAgreementsApi {
    private static Logger logger = LogManager.getLogger(BillingAgreementsApi.class);
    
    private ApiClient apiClient;

    public BillingAgreementsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BillingAgreementsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for billingAgreementsDeRegistration
     * @param modifyBillingAgreement  (required)
     * @param id ID for de-registration or cancellation of Billing Agreement (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call billingAgreementsDeRegistrationCall(ModifyBillingAgreement modifyBillingAgreement, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(modifyBillingAgreement, ModifyBillingAgreement.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment(), apiClient.merchantConfig.getDefaultDeveloperId());
        
        boolean isMLESupportedByCybsForApi = true;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "billingAgreementsDeRegistration,billingAgreementsDeRegistrationAsync,billingAgreementsDeRegistrationWithHttpInfo,billingAgreementsDeRegistrationCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/pts/v2/billing-agreements/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call billingAgreementsDeRegistrationValidateBeforeCall(ModifyBillingAgreement modifyBillingAgreement, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'modifyBillingAgreement' is set
        if (modifyBillingAgreement == null) {
            logger.error("Missing the required parameter 'modifyBillingAgreement' when calling billingAgreementsDeRegistration(Async)");
            throw new ApiException("Missing the required parameter 'modifyBillingAgreement' when calling billingAgreementsDeRegistration(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            logger.error("Missing the required parameter 'id' when calling billingAgreementsDeRegistration(Async)");
            throw new ApiException("Missing the required parameter 'id' when calling billingAgreementsDeRegistration(Async)");
        }
        
        
        okhttp3.Call call = billingAgreementsDeRegistrationCall(modifyBillingAgreement, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Modify a Billing Agreement
     * #### Standing Instruction: Standing Instruction with or without Token.  #### Revoke Mandate: When you revoke a mandate, any pending direct debits linked to that mandate are canceled. No notifications are sent. When you revoke a mandate with no pending direct debits, the Bacs scheme or customer&#39;s bank notify you of any subsequent direct debit events. When you revoke a mandate, you cannot send a direct debit request using the mandate ID. Customer payments cannot be made against a revoked mandate. You can revoke a mandate when the customer:   - Requests that you revoke the mandate.   - Closes their account with you. Possible revoke mandate status values -   - Revoked—the revoke mandate request was successfully processed.   - Failed—the revoke mandate request was not accepted.  #### Update Mandate: In most cases, the account details of an existing mandate cannot be updated in the Bacs schema, except by creating a new mandate. However, some very limited customer information, like name and address, can be updated to the mandate without needing to revoke it first  #### Mandate Status: After the customer signs the mandate, request that the mandate status service verify the mandate status. Possible mandate status values:   - Active—the mandate is successfully created. A direct debit can be sent for this mandate ID.   - Pending—a pending mandate means the mandate is not yet signed.   - Failed—the customer did not authenticate.   - Expired—the deadline to create the mandate passed.   - Revoked—the mandate is cancelled.  #### Paypal Billing Agreement:  A billing agreement is set up between PayPal and your customer. When you collect the details of a customer&#39;s billing agreement, you are able to bill that customer without requiring an authorization for each payment.  You can bill the customer at the same time you process their PayPal Express checkout order, which simplifies your business processes. 
     * @param modifyBillingAgreement  (required)
     * @param id ID for de-registration or cancellation of Billing Agreement (required)
     * @return PtsV2ModifyBillingAgreementPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2ModifyBillingAgreementPost201Response billingAgreementsDeRegistration(ModifyBillingAgreement modifyBillingAgreement, String id) throws ApiException {
        logger.info("CALL TO METHOD 'billingAgreementsDeRegistration' STARTED");
        ApiResponse<PtsV2ModifyBillingAgreementPost201Response> resp = billingAgreementsDeRegistrationWithHttpInfo(modifyBillingAgreement, id);
        logger.info("CALL TO METHOD 'billingAgreementsDeRegistration' ENDED");
        return resp.getData();
    }

    /**
     * Modify a Billing Agreement
     * #### Standing Instruction: Standing Instruction with or without Token.  #### Revoke Mandate: When you revoke a mandate, any pending direct debits linked to that mandate are canceled. No notifications are sent. When you revoke a mandate with no pending direct debits, the Bacs scheme or customer&#39;s bank notify you of any subsequent direct debit events. When you revoke a mandate, you cannot send a direct debit request using the mandate ID. Customer payments cannot be made against a revoked mandate. You can revoke a mandate when the customer:   - Requests that you revoke the mandate.   - Closes their account with you. Possible revoke mandate status values -   - Revoked—the revoke mandate request was successfully processed.   - Failed—the revoke mandate request was not accepted.  #### Update Mandate: In most cases, the account details of an existing mandate cannot be updated in the Bacs schema, except by creating a new mandate. However, some very limited customer information, like name and address, can be updated to the mandate without needing to revoke it first  #### Mandate Status: After the customer signs the mandate, request that the mandate status service verify the mandate status. Possible mandate status values:   - Active—the mandate is successfully created. A direct debit can be sent for this mandate ID.   - Pending—a pending mandate means the mandate is not yet signed.   - Failed—the customer did not authenticate.   - Expired—the deadline to create the mandate passed.   - Revoked—the mandate is cancelled.  #### Paypal Billing Agreement:  A billing agreement is set up between PayPal and your customer. When you collect the details of a customer&#39;s billing agreement, you are able to bill that customer without requiring an authorization for each payment.  You can bill the customer at the same time you process their PayPal Express checkout order, which simplifies your business processes. 
     * @param modifyBillingAgreement  (required)
     * @param id ID for de-registration or cancellation of Billing Agreement (required)
     * @return ApiResponse&lt;PtsV2ModifyBillingAgreementPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2ModifyBillingAgreementPost201Response> billingAgreementsDeRegistrationWithHttpInfo(ModifyBillingAgreement modifyBillingAgreement, String id) throws ApiException {
        this.apiClient.setComputationStartTime(System.nanoTime());
        okhttp3.Call call = billingAgreementsDeRegistrationValidateBeforeCall(modifyBillingAgreement, id, null, null);
        Type localVarReturnType = new TypeToken<PtsV2ModifyBillingAgreementPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Modify a Billing Agreement (asynchronously)
     * #### Standing Instruction: Standing Instruction with or without Token.  #### Revoke Mandate: When you revoke a mandate, any pending direct debits linked to that mandate are canceled. No notifications are sent. When you revoke a mandate with no pending direct debits, the Bacs scheme or customer&#39;s bank notify you of any subsequent direct debit events. When you revoke a mandate, you cannot send a direct debit request using the mandate ID. Customer payments cannot be made against a revoked mandate. You can revoke a mandate when the customer:   - Requests that you revoke the mandate.   - Closes their account with you. Possible revoke mandate status values -   - Revoked—the revoke mandate request was successfully processed.   - Failed—the revoke mandate request was not accepted.  #### Update Mandate: In most cases, the account details of an existing mandate cannot be updated in the Bacs schema, except by creating a new mandate. However, some very limited customer information, like name and address, can be updated to the mandate without needing to revoke it first  #### Mandate Status: After the customer signs the mandate, request that the mandate status service verify the mandate status. Possible mandate status values:   - Active—the mandate is successfully created. A direct debit can be sent for this mandate ID.   - Pending—a pending mandate means the mandate is not yet signed.   - Failed—the customer did not authenticate.   - Expired—the deadline to create the mandate passed.   - Revoked—the mandate is cancelled.  #### Paypal Billing Agreement:  A billing agreement is set up between PayPal and your customer. When you collect the details of a customer&#39;s billing agreement, you are able to bill that customer without requiring an authorization for each payment.  You can bill the customer at the same time you process their PayPal Express checkout order, which simplifies your business processes. 
     * @param modifyBillingAgreement  (required)
     * @param id ID for de-registration or cancellation of Billing Agreement (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call billingAgreementsDeRegistrationAsync(ModifyBillingAgreement modifyBillingAgreement, String id, final ApiCallback<PtsV2ModifyBillingAgreementPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = billingAgreementsDeRegistrationValidateBeforeCall(modifyBillingAgreement, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2ModifyBillingAgreementPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for billingAgreementsIntimation
     * @param intimateBillingAgreement  (required)
     * @param id ID for intimation of Billing Agreement (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call billingAgreementsIntimationCall(IntimateBillingAgreement intimateBillingAgreement, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(intimateBillingAgreement, IntimateBillingAgreement.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment(), apiClient.merchantConfig.getDefaultDeveloperId());
        
        boolean isMLESupportedByCybsForApi = true;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "billingAgreementsIntimation,billingAgreementsIntimationAsync,billingAgreementsIntimationWithHttpInfo,billingAgreementsIntimationCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/pts/v2/billing-agreements/{id}/intimations"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    private okhttp3.Call billingAgreementsIntimationValidateBeforeCall(IntimateBillingAgreement intimateBillingAgreement, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'intimateBillingAgreement' is set
        if (intimateBillingAgreement == null) {
            logger.error("Missing the required parameter 'intimateBillingAgreement' when calling billingAgreementsIntimation(Async)");
            throw new ApiException("Missing the required parameter 'intimateBillingAgreement' when calling billingAgreementsIntimation(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            logger.error("Missing the required parameter 'id' when calling billingAgreementsIntimation(Async)");
            throw new ApiException("Missing the required parameter 'id' when calling billingAgreementsIntimation(Async)");
        }
        
        
        okhttp3.Call call = billingAgreementsIntimationCall(intimateBillingAgreement, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Standing Instruction intimation
     * Standing Instruction with or without Token.
     * @param intimateBillingAgreement  (required)
     * @param id ID for intimation of Billing Agreement (required)
     * @return PtsV2CreditsPost201Response1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2CreditsPost201Response1 billingAgreementsIntimation(IntimateBillingAgreement intimateBillingAgreement, String id) throws ApiException {
        logger.info("CALL TO METHOD 'billingAgreementsIntimation' STARTED");
        ApiResponse<PtsV2CreditsPost201Response1> resp = billingAgreementsIntimationWithHttpInfo(intimateBillingAgreement, id);
        logger.info("CALL TO METHOD 'billingAgreementsIntimation' ENDED");
        return resp.getData();
    }

    /**
     * Standing Instruction intimation
     * Standing Instruction with or without Token.
     * @param intimateBillingAgreement  (required)
     * @param id ID for intimation of Billing Agreement (required)
     * @return ApiResponse&lt;PtsV2CreditsPost201Response1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2CreditsPost201Response1> billingAgreementsIntimationWithHttpInfo(IntimateBillingAgreement intimateBillingAgreement, String id) throws ApiException {
        this.apiClient.setComputationStartTime(System.nanoTime());
        okhttp3.Call call = billingAgreementsIntimationValidateBeforeCall(intimateBillingAgreement, id, null, null);
        Type localVarReturnType = new TypeToken<PtsV2CreditsPost201Response1>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Standing Instruction intimation (asynchronously)
     * Standing Instruction with or without Token.
     * @param intimateBillingAgreement  (required)
     * @param id ID for intimation of Billing Agreement (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call billingAgreementsIntimationAsync(IntimateBillingAgreement intimateBillingAgreement, String id, final ApiCallback<PtsV2CreditsPost201Response1> callback) throws ApiException {

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

        okhttp3.Call call = billingAgreementsIntimationValidateBeforeCall(intimateBillingAgreement, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2CreditsPost201Response1>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for billingAgreementsRegistration
     * @param createBillingAgreement  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call billingAgreementsRegistrationCall(CreateBillingAgreement createBillingAgreement, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(createBillingAgreement, CreateBillingAgreement.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment(), apiClient.merchantConfig.getDefaultDeveloperId());
        
        boolean isMLESupportedByCybsForApi = true;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "billingAgreementsRegistration,billingAgreementsRegistrationAsync,billingAgreementsRegistrationWithHttpInfo,billingAgreementsRegistrationCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/pts/v2/billing-agreements";

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
    private okhttp3.Call billingAgreementsRegistrationValidateBeforeCall(CreateBillingAgreement createBillingAgreement, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createBillingAgreement' is set
        if (createBillingAgreement == null) {
            logger.error("Missing the required parameter 'createBillingAgreement' when calling billingAgreementsRegistration(Async)");
            throw new ApiException("Missing the required parameter 'createBillingAgreement' when calling billingAgreementsRegistration(Async)");
        }
        
        
        okhttp3.Call call = billingAgreementsRegistrationCall(createBillingAgreement, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a Billing Agreement
     * #### Standing Instruction: Standing Instruction with or without Token. Transaction amount in case First payment is coming along with registration. Only 2 decimal places allowed  #### Create Mandate: You can create a mandate through the direct debit mandate flow. Possible create mandate status values:   - Pending—the create mandate request was successfully processed.   - Failed—the create mandate request was not accepted.  #### Import Mandate: In the Bacs scheme, a mandate is created with a status of active. Direct debit collections can be made against it immediately. You can import a mandate to the CyberSource database when:   - You have existing customers with signed, active mandates   - You manage mandates outside of CyberSource.  When you import an existing mandate to the CyberSource database, provide a unique value for the mandate ID or the request results in an error. If an import mandate request is not accepted, the import mandate status value is failed. 
     * @param createBillingAgreement  (required)
     * @return PtsV2CreateBillingAgreementPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2CreateBillingAgreementPost201Response billingAgreementsRegistration(CreateBillingAgreement createBillingAgreement) throws ApiException {
        logger.info("CALL TO METHOD 'billingAgreementsRegistration' STARTED");
        ApiResponse<PtsV2CreateBillingAgreementPost201Response> resp = billingAgreementsRegistrationWithHttpInfo(createBillingAgreement);
        logger.info("CALL TO METHOD 'billingAgreementsRegistration' ENDED");
        return resp.getData();
    }

    /**
     * Create a Billing Agreement
     * #### Standing Instruction: Standing Instruction with or without Token. Transaction amount in case First payment is coming along with registration. Only 2 decimal places allowed  #### Create Mandate: You can create a mandate through the direct debit mandate flow. Possible create mandate status values:   - Pending—the create mandate request was successfully processed.   - Failed—the create mandate request was not accepted.  #### Import Mandate: In the Bacs scheme, a mandate is created with a status of active. Direct debit collections can be made against it immediately. You can import a mandate to the CyberSource database when:   - You have existing customers with signed, active mandates   - You manage mandates outside of CyberSource.  When you import an existing mandate to the CyberSource database, provide a unique value for the mandate ID or the request results in an error. If an import mandate request is not accepted, the import mandate status value is failed. 
     * @param createBillingAgreement  (required)
     * @return ApiResponse&lt;PtsV2CreateBillingAgreementPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2CreateBillingAgreementPost201Response> billingAgreementsRegistrationWithHttpInfo(CreateBillingAgreement createBillingAgreement) throws ApiException {
        this.apiClient.setComputationStartTime(System.nanoTime());
        okhttp3.Call call = billingAgreementsRegistrationValidateBeforeCall(createBillingAgreement, null, null);
        Type localVarReturnType = new TypeToken<PtsV2CreateBillingAgreementPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a Billing Agreement (asynchronously)
     * #### Standing Instruction: Standing Instruction with or without Token. Transaction amount in case First payment is coming along with registration. Only 2 decimal places allowed  #### Create Mandate: You can create a mandate through the direct debit mandate flow. Possible create mandate status values:   - Pending—the create mandate request was successfully processed.   - Failed—the create mandate request was not accepted.  #### Import Mandate: In the Bacs scheme, a mandate is created with a status of active. Direct debit collections can be made against it immediately. You can import a mandate to the CyberSource database when:   - You have existing customers with signed, active mandates   - You manage mandates outside of CyberSource.  When you import an existing mandate to the CyberSource database, provide a unique value for the mandate ID or the request results in an error. If an import mandate request is not accepted, the import mandate status value is failed. 
     * @param createBillingAgreement  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call billingAgreementsRegistrationAsync(CreateBillingAgreement createBillingAgreement, final ApiCallback<PtsV2CreateBillingAgreementPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = billingAgreementsRegistrationValidateBeforeCall(createBillingAgreement, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2CreateBillingAgreementPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
