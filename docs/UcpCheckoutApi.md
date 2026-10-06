# UcpCheckoutApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ucpCancelCheckout**](UcpCheckoutApi.md#ucpCancelCheckout) | **POST** /icc/v1/checkout-sessions/{session_id}/cancel | Cancel Checkout UCP
[**ucpCompleteCheckout**](UcpCheckoutApi.md#ucpCompleteCheckout) | **POST** /icc/v1/checkout-sessions/{session_id}/complete | Complete Checkout UCP
[**ucpCreateCheckoutSession**](UcpCheckoutApi.md#ucpCreateCheckoutSession) | **POST** /icc/v1/checkout-sessions | Create Checkout Session UCP
[**ucpGetCheckoutSession**](UcpCheckoutApi.md#ucpGetCheckoutSession) | **GET** /icc/v1/checkout-sessions/{session_id} | Get Checkout Session UCP
[**ucpUpdateCheckoutSession**](UcpCheckoutApi.md#ucpUpdateCheckoutSession) | **PUT** /icc/v1/checkout-sessions/{session_id} | Update Checkout Session UCP


<a name="ucpCancelCheckout"></a>
# **ucpCancelCheckout**
> InlineResponse20113 ucpCancelCheckout(sessionId)

Cancel Checkout UCP

Cancels an active UCP checkout session. No charge is made.  This operation is idempotent — cancelling an already-cancelled session returns a successful response. Sessions also expire automatically after 30 minutes of inactivity. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.UcpCheckoutApi;


UcpCheckoutApi apiInstance = new UcpCheckoutApi();
String sessionId = "sess_abc123"; // String | The unique identifier of the UCP checkout session to cancel.
try {
    InlineResponse20113 result = apiInstance.ucpCancelCheckout(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UcpCheckoutApi#ucpCancelCheckout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| The unique identifier of the UCP checkout session to cancel. |

### Return type

[**InlineResponse20113**](InlineResponse20113.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="ucpCompleteCheckout"></a>
# **ucpCompleteCheckout**
> InlineResponse20113 ucpCompleteCheckout(sessionId, idempotencyKey, ucpCompleteCheckoutRequest)

Complete Checkout UCP

**Final step of the UCP checkout flow.**  Finalizes the session and places the order with the merchant. ACG translates the UCP completion request to the merchant&#39;s checkout API.  On success, the session transitions to &#x60;completed&#x60;. An &#x60;order_id&#x60; is not returned in the UCP response — use the ACP Complete endpoint if you need order confirmation details.  **Always use an &#x60;idempotency-key&#x60;** to prevent duplicate orders on network retries. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.UcpCheckoutApi;


UcpCheckoutApi apiInstance = new UcpCheckoutApi();
String sessionId = "sess_abc123"; // String | The unique identifier of the UCP checkout session to complete.
String idempotencyKey = "a1b2c3d4-e5f6-7890-abcd-ef1234567890"; // String | **Strongly recommended.** A unique key that ensures this order is placed exactly once on retries. Lowercase per UCP spec. 
UcpCompleteCheckoutRequest ucpCompleteCheckoutRequest = new UcpCompleteCheckoutRequest(); // UcpCompleteCheckoutRequest | UCP completion payload containing payment instrument and optional risk signals. If payment context was already provided in the Create or Update call, the body can be omitted. Risk signals are logged for fraud analysis and are not forwarded to the merchant. 
try {
    InlineResponse20113 result = apiInstance.ucpCompleteCheckout(sessionId, idempotencyKey, ucpCompleteCheckoutRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UcpCheckoutApi#ucpCompleteCheckout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| The unique identifier of the UCP checkout session to complete. |
 **idempotencyKey** | **String**| **Strongly recommended.** A unique key that ensures this order is placed exactly once on retries. Lowercase per UCP spec.  | [optional]
 **ucpCompleteCheckoutRequest** | [**UcpCompleteCheckoutRequest**](UcpCompleteCheckoutRequest.md)| UCP completion payload containing payment instrument and optional risk signals. If payment context was already provided in the Create or Update call, the body can be omitted. Risk signals are logged for fraud analysis and are not forwarded to the merchant.  | [optional]

### Return type

[**InlineResponse20113**](InlineResponse20113.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="ucpCreateCheckoutSession"></a>
# **ucpCreateCheckoutSession**
> InlineResponse20113 ucpCreateCheckoutSession(ucpCreateCheckoutSessionRequest, idempotencyKey)

Create Checkout Session UCP

**Step 1 of the UCP checkout flow.**  Creates a new UCP checkout session using Google&#39;s Universal Commerce Protocol format. ACG translates the UCP request into the internal ACP format, applies merchant pricing, and returns a UCP-format session response with a session &#x60;id&#x60;.  UCP uses &#x60;line_items&#x60; (instead of &#x60;items&#x60;) and lowercase header names (&#x60;idempotency-key&#x60;) per the UCP specification.  **Store the &#x60;id&#x60;** from the response — it is required for all subsequent UCP calls. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.UcpCheckoutApi;


UcpCheckoutApi apiInstance = new UcpCheckoutApi();
UcpCreateCheckoutSessionRequest ucpCreateCheckoutSessionRequest = new UcpCreateCheckoutSessionRequest(); // UcpCreateCheckoutSessionRequest | UCP checkout session creation payload containing line items, buyer details, currency, and optional payment, fulfillment, and discount information. 
String idempotencyKey = "fc23729f-dc9b-4619-8742-2cf9d7bfdf1b"; // String | Client-generated unique key (UUID recommended) to ensure this request is processed exactly once. Lowercase per UCP specification. 
try {
    InlineResponse20113 result = apiInstance.ucpCreateCheckoutSession(ucpCreateCheckoutSessionRequest, idempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UcpCheckoutApi#ucpCreateCheckoutSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ucpCreateCheckoutSessionRequest** | [**UcpCreateCheckoutSessionRequest**](UcpCreateCheckoutSessionRequest.md)| UCP checkout session creation payload containing line items, buyer details, currency, and optional payment, fulfillment, and discount information.  |
 **idempotencyKey** | **String**| Client-generated unique key (UUID recommended) to ensure this request is processed exactly once. Lowercase per UCP specification.  | [optional]

### Return type

[**InlineResponse20113**](InlineResponse20113.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="ucpGetCheckoutSession"></a>
# **ucpGetCheckoutSession**
> InlineResponse20113 ucpGetCheckoutSession(sessionId, ucpGetCheckoutSessionRequest)

Get Checkout Session UCP

Retrieves the current state of a UCP checkout session.  Use this to verify session status, retrieve updated totals after a fulfillment change, or resume a session after an interruption. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.UcpCheckoutApi;


UcpCheckoutApi apiInstance = new UcpCheckoutApi();
String sessionId = "sess_abc123"; // String | The unique identifier of the UCP checkout session to retrieve. Obtained from the `id` field in the Create Session response. 
Object ucpGetCheckoutSessionRequest = null; // Object | Empty request body.
try {
    InlineResponse20113 result = apiInstance.ucpGetCheckoutSession(sessionId, ucpGetCheckoutSessionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UcpCheckoutApi#ucpGetCheckoutSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| The unique identifier of the UCP checkout session to retrieve. Obtained from the &#x60;id&#x60; field in the Create Session response.  |
 **ucpGetCheckoutSessionRequest** | **Object**| Empty request body. |

### Return type

[**InlineResponse20113**](InlineResponse20113.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="ucpUpdateCheckoutSession"></a>
# **ucpUpdateCheckoutSession**
> InlineResponse20113 ucpUpdateCheckoutSession(sessionId, ucpUpdateCheckoutSessionRequest, idempotencyKey)

Update Checkout Session UCP

Modifies an active UCP checkout session and returns the updated session state.  Use this to change line item quantities, update fulfillment address or method, or apply discount codes. Totals are recalculated and returned in the response.  Only the fields you include in the request body are updated. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.UcpCheckoutApi;


UcpCheckoutApi apiInstance = new UcpCheckoutApi();
String sessionId = "sess_abc123"; // String | The unique identifier of the UCP checkout session to update.
UcpUpdateCheckoutSessionRequest ucpUpdateCheckoutSessionRequest = new UcpUpdateCheckoutSessionRequest(); // UcpUpdateCheckoutSessionRequest | UCP session update payload. All fields are optional — only fields you include will be applied. 
String idempotencyKey = "a1b2c3d4-e5f6-7890-abcd-ef1234567890"; // String | Client-generated unique key for idempotency. Lowercase per UCP spec.
try {
    InlineResponse20113 result = apiInstance.ucpUpdateCheckoutSession(sessionId, ucpUpdateCheckoutSessionRequest, idempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UcpCheckoutApi#ucpUpdateCheckoutSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| The unique identifier of the UCP checkout session to update. |
 **ucpUpdateCheckoutSessionRequest** | [**UcpUpdateCheckoutSessionRequest**](UcpUpdateCheckoutSessionRequest.md)| UCP session update payload. All fields are optional — only fields you include will be applied.  |
 **idempotencyKey** | **String**| Client-generated unique key for idempotency. Lowercase per UCP spec. | [optional]

### Return type

[**InlineResponse20113**](InlineResponse20113.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

