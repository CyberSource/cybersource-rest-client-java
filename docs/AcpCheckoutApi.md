# AcpCheckoutApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCheckout**](AcpCheckoutApi.md#cancelCheckout) | **POST** /icc/v1/checkout_sessions/{session_id}/cancel | Cancel Checkout ACP
[**completeCheckout**](AcpCheckoutApi.md#completeCheckout) | **POST** /icc/v1/checkout_sessions/{session_id}/complete | Complete Checkout ACP
[**createCheckoutSession**](AcpCheckoutApi.md#createCheckoutSession) | **POST** /icc/v1/checkout_sessions | Create Checkout Session ACP
[**getCheckoutSession**](AcpCheckoutApi.md#getCheckoutSession) | **GET** /icc/v1/checkout_sessions/{session_id} | Get Checkout Session ACP
[**updateCheckoutSession**](AcpCheckoutApi.md#updateCheckoutSession) | **POST** /icc/v1/checkout_sessions/{session_id} | Update Checkout Session ACP


<a name="cancelCheckout"></a>
# **cancelCheckout**
> InlineResponse20018 cancelCheckout(sessionId, idempotencyKey, acceptLanguage, userAgent, requestId, signature, timestamp, apIVersion)

Cancel Checkout ACP

Cancels an active ACP checkout session. No charge is made to the buyer.  This call is safe to make multiple times — cancelling an already-cancelled session returns a successful response without error.  Sessions also expire automatically after 30 minutes of inactivity, so explicit cancellation is optional but recommended to release any reserved inventory immediately. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AcpCheckoutApi;


AcpCheckoutApi apiInstance = new AcpCheckoutApi();
String sessionId = "sessionId_example"; // String | The unique identifier of the ACP checkout session to cancel. Obtained from the `id` field in the Create Session response. 
String idempotencyKey = "idempotencyKey_example"; // String | Client-generated unique key to ensure this request is processed exactly once. If a request with the same key was already processed, the original response is returned. 
String acceptLanguage = "acceptLanguage_example"; // String | Preferred language for the response (e.g. `en-US`, `fr-FR`). Passed to the merchant backend for localized content. 
String userAgent = "userAgent_example"; // String | Client user agent string identifying the AI agent platform and version. 
String requestId = "requestId_example"; // String | Unique request identifier for distributed tracing and debugging. Echoed back in the response headers. 
String signature = "signature_example"; // String | Request signature for payload integrity verification. 
String timestamp = "timestamp_example"; // String | ISO 8601 timestamp of when the request was generated. Used in conjunction with Signature for replay protection. 
String apIVersion = "apIVersion_example"; // String | ACP specification version the client is targeting (e.g. `2024-01-01`). When omitted, the latest supported version is assumed. 
try {
    InlineResponse20018 result = apiInstance.cancelCheckout(sessionId, idempotencyKey, acceptLanguage, userAgent, requestId, signature, timestamp, apIVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AcpCheckoutApi#cancelCheckout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| The unique identifier of the ACP checkout session to cancel. Obtained from the &#x60;id&#x60; field in the Create Session response.  |
 **idempotencyKey** | **String**| Client-generated unique key to ensure this request is processed exactly once. If a request with the same key was already processed, the original response is returned.  | [optional]
 **acceptLanguage** | **String**| Preferred language for the response (e.g. &#x60;en-US&#x60;, &#x60;fr-FR&#x60;). Passed to the merchant backend for localized content.  | [optional]
 **userAgent** | **String**| Client user agent string identifying the AI agent platform and version.  | [optional]
 **requestId** | **String**| Unique request identifier for distributed tracing and debugging. Echoed back in the response headers.  | [optional]
 **signature** | **String**| Request signature for payload integrity verification.  | [optional]
 **timestamp** | **String**| ISO 8601 timestamp of when the request was generated. Used in conjunction with Signature for replay protection.  | [optional]
 **apIVersion** | **String**| ACP specification version the client is targeting (e.g. &#x60;2024-01-01&#x60;). When omitted, the latest supported version is assumed.  | [optional]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="completeCheckout"></a>
# **completeCheckout**
> InlineResponse20017 completeCheckout(sessionId, acpCompleteCheckoutRequest, idempotencyKey, acceptLanguage, userAgent, requestId, signature, timestamp, apIVersion)

Complete Checkout ACP

**Final step of the ACP checkout flow.**  Submits payment and buyer information to place the order with the merchant. On success, the session transitions to &#x60;completed&#x60; and an &#x60;order_id&#x60; is returned confirming the merchant accepted the order.  Once completed, the session is immutable — it cannot be updated or cancelled.  **Payment token:** The &#x60;payment.token&#x60; must be a valid token from the payment provider configured for the merchant (e.g. a tokenized card from Stripe or Braintree). ACG forwards the token to the merchant&#39;s payment processor — it is never stored. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AcpCheckoutApi;


AcpCheckoutApi apiInstance = new AcpCheckoutApi();
String sessionId = "sessionId_example"; // String | The unique identifier of the ACP checkout session to complete.
AcpCompleteCheckoutRequest acpCompleteCheckoutRequest = new AcpCompleteCheckoutRequest(); // AcpCompleteCheckoutRequest | Final buyer and payment details needed to place the order. Both `buyer` and `payment` may have been provided in earlier Create/Update calls; if so, they can be omitted here. At least a valid payment token is required to process the transaction. 
String idempotencyKey = "idempotencyKey_example"; // String | Client-generated unique key to ensure this request is processed exactly once. If a request with the same key was already processed, the original response is returned. 
String acceptLanguage = "acceptLanguage_example"; // String | Preferred language for the response (e.g. `en-US`, `fr-FR`). Passed to the merchant backend for localized content. 
String userAgent = "userAgent_example"; // String | Client user agent string identifying the AI agent platform and version. 
String requestId = "requestId_example"; // String | Unique request identifier for distributed tracing and debugging. Echoed back in the response headers. 
String signature = "signature_example"; // String | Request signature for payload integrity verification. 
String timestamp = "timestamp_example"; // String | ISO 8601 timestamp of when the request was generated. Used in conjunction with Signature for replay protection. 
String apIVersion = "apIVersion_example"; // String | ACP specification version the client is targeting (e.g. `2024-01-01`). When omitted, the latest supported version is assumed. 
try {
    InlineResponse20017 result = apiInstance.completeCheckout(sessionId, acpCompleteCheckoutRequest, idempotencyKey, acceptLanguage, userAgent, requestId, signature, timestamp, apIVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AcpCheckoutApi#completeCheckout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| The unique identifier of the ACP checkout session to complete. |
 **acpCompleteCheckoutRequest** | [**AcpCompleteCheckoutRequest**](AcpCompleteCheckoutRequest.md)| Final buyer and payment details needed to place the order. Both &#x60;buyer&#x60; and &#x60;payment&#x60; may have been provided in earlier Create/Update calls; if so, they can be omitted here. At least a valid payment token is required to process the transaction.  |
 **idempotencyKey** | **String**| Client-generated unique key to ensure this request is processed exactly once. If a request with the same key was already processed, the original response is returned.  | [optional]
 **acceptLanguage** | **String**| Preferred language for the response (e.g. &#x60;en-US&#x60;, &#x60;fr-FR&#x60;). Passed to the merchant backend for localized content.  | [optional]
 **userAgent** | **String**| Client user agent string identifying the AI agent platform and version.  | [optional]
 **requestId** | **String**| Unique request identifier for distributed tracing and debugging. Echoed back in the response headers.  | [optional]
 **signature** | **String**| Request signature for payload integrity verification.  | [optional]
 **timestamp** | **String**| ISO 8601 timestamp of when the request was generated. Used in conjunction with Signature for replay protection.  | [optional]
 **apIVersion** | **String**| ACP specification version the client is targeting (e.g. &#x60;2024-01-01&#x60;). When omitted, the latest supported version is assumed.  | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="createCheckoutSession"></a>
# **createCheckoutSession**
> InlineResponse20112 createCheckoutSession(acpCreateCheckoutSessionRequest, idempotencyKey, acceptLanguage, userAgent, requestId, signature, timestamp, apIVersion)

Create Checkout Session ACP

**Step 1 of the ACP checkout flow.**  Initiates a new ACP checkout session with the buyer&#39;s cart. ACG validates item availability against the merchant&#39;s catalog, calculates initial pricing and tax, and returns a session object with a unique &#x60;id&#x60;.  **Store the &#x60;id&#x60;** — every subsequent call in this checkout flow (update, complete, cancel) requires it.  The session remains active for 30 minutes. A new session must be created after expiry.  **Idempotency:** Supply an &#x60;Idempotency-Key&#x60; header to safely retry this call without creating duplicate sessions. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AcpCheckoutApi;


AcpCheckoutApi apiInstance = new AcpCheckoutApi();
AcpCreateCheckoutSessionRequest acpCreateCheckoutSessionRequest = new AcpCreateCheckoutSessionRequest(); // AcpCreateCheckoutSessionRequest | The cart contents and buyer context for this checkout session. `items` is required. `buyer` and `fulfillment_address` are optional on creation and can be provided via Update Session before completing checkout. 
String idempotencyKey = "idempotencyKey_example"; // String | Client-generated unique key to ensure this request is processed exactly once. If a request with the same key was already processed, the original response is returned. 
String acceptLanguage = "acceptLanguage_example"; // String | Preferred language for the response (e.g. `en-US`, `fr-FR`). Passed to the merchant backend for localized content. 
String userAgent = "userAgent_example"; // String | Client user agent string identifying the AI agent platform and version. 
String requestId = "requestId_example"; // String | Unique request identifier for distributed tracing and debugging. Echoed back in the response headers. 
String signature = "signature_example"; // String | Request signature for payload integrity verification. 
String timestamp = "timestamp_example"; // String | ISO 8601 timestamp of when the request was generated. Used in conjunction with Signature for replay protection. 
String apIVersion = "apIVersion_example"; // String | ACP specification version the client is targeting (e.g. `2024-01-01`). When omitted, the latest supported version is assumed. 
try {
    InlineResponse20112 result = apiInstance.createCheckoutSession(acpCreateCheckoutSessionRequest, idempotencyKey, acceptLanguage, userAgent, requestId, signature, timestamp, apIVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AcpCheckoutApi#createCheckoutSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acpCreateCheckoutSessionRequest** | [**AcpCreateCheckoutSessionRequest**](AcpCreateCheckoutSessionRequest.md)| The cart contents and buyer context for this checkout session. &#x60;items&#x60; is required. &#x60;buyer&#x60; and &#x60;fulfillment_address&#x60; are optional on creation and can be provided via Update Session before completing checkout.  |
 **idempotencyKey** | **String**| Client-generated unique key to ensure this request is processed exactly once. If a request with the same key was already processed, the original response is returned.  | [optional]
 **acceptLanguage** | **String**| Preferred language for the response (e.g. &#x60;en-US&#x60;, &#x60;fr-FR&#x60;). Passed to the merchant backend for localized content.  | [optional]
 **userAgent** | **String**| Client user agent string identifying the AI agent platform and version.  | [optional]
 **requestId** | **String**| Unique request identifier for distributed tracing and debugging. Echoed back in the response headers.  | [optional]
 **signature** | **String**| Request signature for payload integrity verification.  | [optional]
 **timestamp** | **String**| ISO 8601 timestamp of when the request was generated. Used in conjunction with Signature for replay protection.  | [optional]
 **apIVersion** | **String**| ACP specification version the client is targeting (e.g. &#x60;2024-01-01&#x60;). When omitted, the latest supported version is assumed.  | [optional]

### Return type

[**InlineResponse20112**](InlineResponse20112.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getCheckoutSession"></a>
# **getCheckoutSession**
> InlineResponse20112 getCheckoutSession(sessionId, acpGetCheckoutSessionRequest, idempotencyKey, acceptLanguage, userAgent, requestId, signature, timestamp, apIVersion)

Get Checkout Session ACP

Retrieves the current state of an ACP checkout session, including line items, buyer information,  and current totals.  Use this to: - Verify session status before presenting a checkout summary to the buyer - Resume an interrupted checkout flow - Poll for status after an async operation - Confirm a session has not expired before submitting payment 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AcpCheckoutApi;


AcpCheckoutApi apiInstance = new AcpCheckoutApi();
String sessionId = "sessionId_example"; // String | The unique identifier of the ACP checkout session to retrieve. Obtained from the `id` field in the Create Session response. 
Object acpGetCheckoutSessionRequest = null; // Object | Empty request body.
String idempotencyKey = "idempotencyKey_example"; // String | Client-generated unique key to ensure this request is processed exactly once. If a request with the same key was already processed, the original response is returned. 
String acceptLanguage = "acceptLanguage_example"; // String | Preferred language for the response (e.g. `en-US`, `fr-FR`). Passed to the merchant backend for localized content. 
String userAgent = "userAgent_example"; // String | Client user agent string identifying the AI agent platform and version. 
String requestId = "requestId_example"; // String | Unique request identifier for distributed tracing and debugging. Echoed back in the response headers. 
String signature = "signature_example"; // String | Request signature for payload integrity verification. 
String timestamp = "timestamp_example"; // String | ISO 8601 timestamp of when the request was generated. Used in conjunction with Signature for replay protection. 
String apIVersion = "apIVersion_example"; // String | ACP specification version the client is targeting (e.g. `2024-01-01`). When omitted, the latest supported version is assumed. 
try {
    InlineResponse20112 result = apiInstance.getCheckoutSession(sessionId, acpGetCheckoutSessionRequest, idempotencyKey, acceptLanguage, userAgent, requestId, signature, timestamp, apIVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AcpCheckoutApi#getCheckoutSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| The unique identifier of the ACP checkout session to retrieve. Obtained from the &#x60;id&#x60; field in the Create Session response.  |
 **acpGetCheckoutSessionRequest** | **Object**| Empty request body. |
 **idempotencyKey** | **String**| Client-generated unique key to ensure this request is processed exactly once. If a request with the same key was already processed, the original response is returned.  | [optional]
 **acceptLanguage** | **String**| Preferred language for the response (e.g. &#x60;en-US&#x60;, &#x60;fr-FR&#x60;). Passed to the merchant backend for localized content.  | [optional]
 **userAgent** | **String**| Client user agent string identifying the AI agent platform and version.  | [optional]
 **requestId** | **String**| Unique request identifier for distributed tracing and debugging. Echoed back in the response headers.  | [optional]
 **signature** | **String**| Request signature for payload integrity verification.  | [optional]
 **timestamp** | **String**| ISO 8601 timestamp of when the request was generated. Used in conjunction with Signature for replay protection.  | [optional]
 **apIVersion** | **String**| ACP specification version the client is targeting (e.g. &#x60;2024-01-01&#x60;). When omitted, the latest supported version is assumed.  | [optional]

### Return type

[**InlineResponse20112**](InlineResponse20112.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="updateCheckoutSession"></a>
# **updateCheckoutSession**
> InlineResponse20112 updateCheckoutSession(sessionId, acpUpdateCheckoutSessionRequest, idempotencyKey, acceptLanguage, userAgent, requestId, signature, timestamp, apIVersion)

Update Checkout Session ACP

Modifies an active ACP checkout session and returns the updated session state with recalculated totals.  Use this to: - Add, remove, or change quantities of cart items - Apply or remove discount codes - Update the buyer&#39;s shipping address or contact details - Trigger re-calculation of shipping costs and tax  Only fields included in the request body are updated — omitted fields retain their current values.  **Idempotency:** Supply an &#x60;Idempotency-Key&#x60; to safely retry updates without applying them twice. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AcpCheckoutApi;


AcpCheckoutApi apiInstance = new AcpCheckoutApi();
String sessionId = "sessionId_example"; // String | The unique identifier of the ACP checkout session to update. Obtained from the `id` field in the Create Session response. 
AcpUpdateCheckoutSessionRequest acpUpdateCheckoutSessionRequest = new AcpUpdateCheckoutSessionRequest(); // AcpUpdateCheckoutSessionRequest | Fields to update. All fields are optional — only included fields are changed. To replace the cart entirely, provide the full `items` array. 
String idempotencyKey = "idempotencyKey_example"; // String | Client-generated unique key to ensure this request is processed exactly once. If a request with the same key was already processed, the original response is returned. 
String acceptLanguage = "acceptLanguage_example"; // String | Preferred language for the response (e.g. `en-US`, `fr-FR`). Passed to the merchant backend for localized content. 
String userAgent = "userAgent_example"; // String | Client user agent string identifying the AI agent platform and version. 
String requestId = "requestId_example"; // String | Unique request identifier for distributed tracing and debugging. Echoed back in the response headers. 
String signature = "signature_example"; // String | Request signature for payload integrity verification. 
String timestamp = "timestamp_example"; // String | ISO 8601 timestamp of when the request was generated. Used in conjunction with Signature for replay protection. 
String apIVersion = "apIVersion_example"; // String | ACP specification version the client is targeting (e.g. `2024-01-01`). When omitted, the latest supported version is assumed. 
try {
    InlineResponse20112 result = apiInstance.updateCheckoutSession(sessionId, acpUpdateCheckoutSessionRequest, idempotencyKey, acceptLanguage, userAgent, requestId, signature, timestamp, apIVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AcpCheckoutApi#updateCheckoutSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| The unique identifier of the ACP checkout session to update. Obtained from the &#x60;id&#x60; field in the Create Session response.  |
 **acpUpdateCheckoutSessionRequest** | [**AcpUpdateCheckoutSessionRequest**](AcpUpdateCheckoutSessionRequest.md)| Fields to update. All fields are optional — only included fields are changed. To replace the cart entirely, provide the full &#x60;items&#x60; array.  |
 **idempotencyKey** | **String**| Client-generated unique key to ensure this request is processed exactly once. If a request with the same key was already processed, the original response is returned.  | [optional]
 **acceptLanguage** | **String**| Preferred language for the response (e.g. &#x60;en-US&#x60;, &#x60;fr-FR&#x60;). Passed to the merchant backend for localized content.  | [optional]
 **userAgent** | **String**| Client user agent string identifying the AI agent platform and version.  | [optional]
 **requestId** | **String**| Unique request identifier for distributed tracing and debugging. Echoed back in the response headers.  | [optional]
 **signature** | **String**| Request signature for payload integrity verification.  | [optional]
 **timestamp** | **String**| ISO 8601 timestamp of when the request was generated. Used in conjunction with Signature for replay protection.  | [optional]
 **apIVersion** | **String**| ACP specification version the client is targeting (e.g. &#x60;2024-01-01&#x60;). When omitted, the latest supported version is assumed.  | [optional]

### Return type

[**InlineResponse20112**](InlineResponse20112.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

