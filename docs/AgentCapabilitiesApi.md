# AgentCapabilitiesApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateAgentKey**](AgentCapabilitiesApi.md#activateAgentKey) | **POST** /icc/v1/agents/{agentId}/keys/{keyId}/activate | Activate a key
[**addAgentKey**](AgentCapabilitiesApi.md#addAgentKey) | **POST** /icc/v1/agents/{agentId}/keys | Add a key to an agent
[**cancelCheckout**](AgentCapabilitiesApi.md#cancelCheckout) | **POST** /icc/v1/checkout_sessions/{session_id}/cancel | Cancel Checkout ACP
[**cancelPurchaseIntent**](AgentCapabilitiesApi.md#cancelPurchaseIntent) | **PUT** /icc/v1/instructions/{instructionId}/cancel | Cancel a purchase intent
[**completeCheckout**](AgentCapabilitiesApi.md#completeCheckout) | **POST** /icc/v1/checkout_sessions/{session_id}/complete | Complete Checkout ACP
[**confirmTransactionEvents**](AgentCapabilitiesApi.md#confirmTransactionEvents) | **POST** /icc/v1/instructions/{instructionId}/confirmations | Confirm transaction events
[**createCheckoutSession**](AgentCapabilitiesApi.md#createCheckoutSession) | **POST** /icc/v1/checkout_sessions | Create Checkout Session ACP
[**deactivateAgentKey**](AgentCapabilitiesApi.md#deactivateAgentKey) | **DELETE** /icc/v1/agents/{agentId}/keys/{keyId} | Deactivate a key
[**enrollCard**](AgentCapabilitiesApi.md#enrollCard) | **POST** /icc/v1/tokens | Enroll a card
[**getAgent**](AgentCapabilitiesApi.md#getAgent) | **GET** /icc/v1/agents/{agentId} | Get an agent
[**getAgentKey**](AgentCapabilitiesApi.md#getAgentKey) | **GET** /icc/v1/agents/{agentId}/keys/{keyId} | Get a key by agent and key ID
[**getCheckoutSession**](AgentCapabilitiesApi.md#getCheckoutSession) | **GET** /icc/v1/checkout_sessions/{session_id} | Get Checkout Session ACP
[**initiatePurchaseIntent**](AgentCapabilitiesApi.md#initiatePurchaseIntent) | **POST** /icc/v1/instructions | Initiate a purchase intent
[**listAgentKeys**](AgentCapabilitiesApi.md#listAgentKeys) | **GET** /icc/v1/agents/{agentId}/keys | List keys for an agent
[**registerAgent**](AgentCapabilitiesApi.md#registerAgent) | **POST** /icc/v1/agents | Register an agent
[**retrievePaymentCredentials**](AgentCapabilitiesApi.md#retrievePaymentCredentials) | **POST** /icc/v1/instructions/{instructionId}/credentials | Retrieve payment credentials
[**ucpCancelCheckout**](AgentCapabilitiesApi.md#ucpCancelCheckout) | **POST** /icc/v1/checkout-sessions/{session_id}/cancel | Cancel Checkout UCP
[**ucpCompleteCheckout**](AgentCapabilitiesApi.md#ucpCompleteCheckout) | **POST** /icc/v1/checkout-sessions/{session_id}/complete | Complete Checkout UCP
[**ucpCreateCheckoutSession**](AgentCapabilitiesApi.md#ucpCreateCheckoutSession) | **POST** /icc/v1/checkout-sessions | Create Checkout Session UCP
[**ucpGetCheckoutSession**](AgentCapabilitiesApi.md#ucpGetCheckoutSession) | **GET** /icc/v1/checkout-sessions/{session_id} | Get Checkout Session UCP
[**ucpUpdateCheckoutSession**](AgentCapabilitiesApi.md#ucpUpdateCheckoutSession) | **PUT** /icc/v1/checkout-sessions/{session_id} | Update Checkout Session UCP
[**updateAgent**](AgentCapabilitiesApi.md#updateAgent) | **PUT** /icc/v1/agents/{agentId} | Update an agent
[**updateAgentKey**](AgentCapabilitiesApi.md#updateAgentKey) | **PUT** /icc/v1/agents/{agentId}/keys/{keyId} | Update a key
[**updateCheckoutSession**](AgentCapabilitiesApi.md#updateCheckoutSession) | **POST** /icc/v1/checkout_sessions/{session_id} | Update Checkout Session ACP
[**updatePurchaseIntent**](AgentCapabilitiesApi.md#updatePurchaseIntent) | **PUT** /icc/v1/instructions/{instructionId} | Update a purchase intent


<a name="activateAgentKey"></a>
# **activateAgentKey**
> AddAgentKeyResponse201 activateAgentKey(agentId, keyId)

Activate a key

Activate a deactivated key. Raises 404 if agent or key not found, 403 if agent is deactivated.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String agentId = "agentId_example"; // String | Unique agent identifier
String keyId = "keyId_example"; // String | Unique key identifier
try {
    AddAgentKeyResponse201 result = apiInstance.activateAgentKey(agentId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#activateAgentKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **keyId** | **String**| Unique key identifier |

### Return type

[**AddAgentKeyResponse201**](AddAgentKeyResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="addAgentKey"></a>
# **addAgentKey**
> AddAgentKeyResponse201 addAgentKey(agentId, keyRequest)

Add a key to an agent

[category 1 — Agent_Capabilities] Upload a Base64-encoded public key for an agent.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String agentId = "agentId_example"; // String | Unique agent identifier
KeyRequest keyRequest = new KeyRequest(); // KeyRequest | Key creation request
try {
    AddAgentKeyResponse201 result = apiInstance.addAgentKey(agentId, keyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#addAgentKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **keyRequest** | [**KeyRequest**](KeyRequest.md)| Key creation request |

### Return type

[**AddAgentKeyResponse201**](AddAgentKeyResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="cancelCheckout"></a>
# **cancelCheckout**
> InlineResponse20018 cancelCheckout(sessionId, idempotencyKey, acceptLanguage, userAgent, requestId, signature, timestamp, apIVersion)

Cancel Checkout ACP

Cancels an active ACP checkout session. No charge is made to the buyer.  This call is safe to make multiple times — cancelling an already-cancelled session returns a successful response without error.  Sessions also expire automatically after 30 minutes of inactivity, so explicit cancellation is optional but recommended to release any reserved inventory immediately. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
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
    System.err.println("Exception when calling AgentCapabilitiesApi#cancelCheckout");
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

<a name="cancelPurchaseIntent"></a>
# **cancelPurchaseIntent**
> AgenticCreatePurchaseIntentResponse200 cancelPurchaseIntent(instructionId, agenticCancelPurchaseIntentRequest)

Cancel a purchase intent

Cancel an existing purchase intent (instruction) identified by its instructionId. The agent calls this endpoint when the consumer decides to abandon the purchase before payment credentials have been used. Requires device information and assurance data for identity verification. Returns status CANCELLED (HTTP 200) on success, or PENDING (HTTP 202) with pendingEvents if cardholder authentication is required before cancellation can proceed.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String instructionId = "instructionId_example"; // String | 
AgenticCancelPurchaseIntentRequest agenticCancelPurchaseIntentRequest = new AgenticCancelPurchaseIntentRequest(); // AgenticCancelPurchaseIntentRequest | Unique identifier for the purchase intent instruction.
try {
    AgenticCreatePurchaseIntentResponse200 result = apiInstance.cancelPurchaseIntent(instructionId, agenticCancelPurchaseIntentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#cancelPurchaseIntent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instructionId** | **String**|  |
 **agenticCancelPurchaseIntentRequest** | [**AgenticCancelPurchaseIntentRequest**](AgenticCancelPurchaseIntentRequest.md)| Unique identifier for the purchase intent instruction. |

### Return type

[**AgenticCreatePurchaseIntentResponse200**](AgenticCreatePurchaseIntentResponse200.md)

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
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
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
    System.err.println("Exception when calling AgentCapabilitiesApi#completeCheckout");
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

<a name="confirmTransactionEvents"></a>
# **confirmTransactionEvents**
> AgenticConfirmTransactionEventsResponse202 confirmTransactionEvents(instructionId, agenticConfirmTransactionEventsRequest)

Confirm transaction events

Confirm transaction events for a completed purchase. The agent calls this endpoint after the payment has been submitted to notify the Intelligent Commerce Connect of the transaction outcome. The request includes processor information (transaction type, status, approval codes), order details (shipping, tracking, product information), and merchant information. Returns HTTP 202 acknowledging receipt of the confirmation.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String instructionId = "instructionId_example"; // String | Unique identifier for the purchase intent instruction.
AgenticConfirmTransactionEventsRequest agenticConfirmTransactionEventsRequest = new AgenticConfirmTransactionEventsRequest(); // AgenticConfirmTransactionEventsRequest | 
try {
    AgenticConfirmTransactionEventsResponse202 result = apiInstance.confirmTransactionEvents(instructionId, agenticConfirmTransactionEventsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#confirmTransactionEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instructionId** | **String**| Unique identifier for the purchase intent instruction. |
 **agenticConfirmTransactionEventsRequest** | [**AgenticConfirmTransactionEventsRequest**](AgenticConfirmTransactionEventsRequest.md)|  |

### Return type

[**AgenticConfirmTransactionEventsResponse202**](AgenticConfirmTransactionEventsResponse202.md)

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
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
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
    System.err.println("Exception when calling AgentCapabilitiesApi#createCheckoutSession");
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

<a name="deactivateAgentKey"></a>
# **deactivateAgentKey**
> deactivateAgentKey(agentId, keyId)

Deactivate a key

Deactivate a key (soft delete). Raises 404 if key not found.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String agentId = "agentId_example"; // String | Unique agent identifier
String keyId = "keyId_example"; // String | Unique key identifier
try {
    apiInstance.deactivateAgentKey(agentId, keyId);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#deactivateAgentKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **keyId** | **String**| Unique key identifier |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="enrollCard"></a>
# **enrollCard**
> AgenticCardEnrollmentResponse200 enrollCard(agenticCardEnrollmentRequest)

Enroll a card

Enroll a payment card for agentic or e-commerce transactions. This is typically the first step in the Intelligent Commerce payment lifecycle — the agent calls this endpoint to register a consumer&#39;s card, creating a tokenized reference that can be used in subsequent purchase instructions and payment credential retrieval. Requires device information, consumer identity, billing details, and payment instrument references. Returns a status of ACTIVE (HTTP 200) if enrollment completes immediately, or PENDING (HTTP 202) with pendingEvents if cardholder authentication is required. Call this endpoint when a consumer wants to add a new payment card or when setting up a card for agentic payment flows.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
AgenticCardEnrollmentRequest agenticCardEnrollmentRequest = new AgenticCardEnrollmentRequest(); // AgenticCardEnrollmentRequest | 
try {
    AgenticCardEnrollmentResponse200 result = apiInstance.enrollCard(agenticCardEnrollmentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#enrollCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agenticCardEnrollmentRequest** | [**AgenticCardEnrollmentRequest**](AgenticCardEnrollmentRequest.md)|  |

### Return type

[**AgenticCardEnrollmentResponse200**](AgenticCardEnrollmentResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getAgent"></a>
# **getAgent**
> AgentRegistrationResponse201 getAgent(agentId)

Get an agent

[category 1 — Agent_Capabilities] Get agent by ID with all keys. Raises 404 if agent not found.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String agentId = "agentId_example"; // String | Unique agent identifier
try {
    AgentRegistrationResponse201 result = apiInstance.getAgent(agentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#getAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |

### Return type

[**AgentRegistrationResponse201**](AgentRegistrationResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getAgentKey"></a>
# **getAgentKey**
> AddAgentKeyResponse201 getAgentKey(agentId, keyId)

Get a key by agent and key ID

Get a specific key by agent ID and key ID. Raises 404 if key not found.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String agentId = "agentId_example"; // String | Unique agent identifier
String keyId = "keyId_example"; // String | Unique key identifier
try {
    AddAgentKeyResponse201 result = apiInstance.getAgentKey(agentId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#getAgentKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **keyId** | **String**| Unique key identifier |

### Return type

[**AddAgentKeyResponse201**](AddAgentKeyResponse201.md)

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
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
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
    System.err.println("Exception when calling AgentCapabilitiesApi#getCheckoutSession");
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

<a name="initiatePurchaseIntent"></a>
# **initiatePurchaseIntent**
> AgenticCreatePurchaseIntentResponse200 initiatePurchaseIntent(agenticCreatePurchaseIntentRequest)

Initiate a purchase intent

Create a new purchase intent (instruction) for an agentic transaction. The agent calls this endpoint after a card has been enrolled to define what the consumer wants to buy. The request includes payment instrument references, device and assurance data, mandates (spending limits, merchant preferences, and product descriptions), and optional buyer information. Return an instructionId (HTTP 200) if the intent is created immediately, or PENDING (HTTP 202) with pendingEvents if cardholder authentication is required. The instructionId returned is used in all subsequent operations - update, cancel, retrieve credentials, and confirm transaction.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
AgenticCreatePurchaseIntentRequest agenticCreatePurchaseIntentRequest = new AgenticCreatePurchaseIntentRequest(); // AgenticCreatePurchaseIntentRequest | 
try {
    AgenticCreatePurchaseIntentResponse200 result = apiInstance.initiatePurchaseIntent(agenticCreatePurchaseIntentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#initiatePurchaseIntent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agenticCreatePurchaseIntentRequest** | [**AgenticCreatePurchaseIntentRequest**](AgenticCreatePurchaseIntentRequest.md)|  |

### Return type

[**AgenticCreatePurchaseIntentResponse200**](AgenticCreatePurchaseIntentResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="listAgentKeys"></a>
# **listAgentKeys**
> ListAgentKeysResponse200 listAgentKeys(agentId, page, pageSize)

List keys for an agent

[category 1 — Agent_Capabilities] List all keys for a specific agent with pagination.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String agentId = "agentId_example"; // String | Unique agent identifier
Integer page = 1; // Integer | Page number (1-indexed)
Integer pageSize = 30; // Integer | Items per page (max 100)
try {
    ListAgentKeysResponse200 result = apiInstance.listAgentKeys(agentId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#listAgentKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **page** | **Integer**| Page number (1-indexed) | [optional] [default to 1]
 **pageSize** | **Integer**| Items per page (max 100) | [optional] [default to 30]

### Return type

[**ListAgentKeysResponse200**](ListAgentKeysResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="registerAgent"></a>
# **registerAgent**
> AgentRegistrationResponse201 registerAgent(agentRequest)

Register an agent

Register a new AI agent in the VARS. Once registered, the agent can upload public keys that merchants and Visa services use to verify request signatures. Raises 409 if domain, contactEmail, or tokenRequestorId already exists.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
AgentRequest agentRequest = new AgentRequest(); // AgentRequest | Agent registration request
try {
    AgentRegistrationResponse201 result = apiInstance.registerAgent(agentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#registerAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentRequest** | [**AgentRequest**](AgentRequest.md)| Agent registration request |

### Return type

[**AgentRegistrationResponse201**](AgentRegistrationResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="retrievePaymentCredentials"></a>
# **retrievePaymentCredentials**
> AgenticRetrievePaymentCredentialsResponse200 retrievePaymentCredentials(instructionId, agenticRetrievePaymentCredentialsRequest)

Retrieve payment credentials

Retrieve tokenized payment credentials for a purchase intent to complete the transaction at a merchant. The agent calls this endpoint after a purchase intent has been created and approved, providing transaction-level details including order information, merchant details, payment options, and production information. Returns COMPLETED (HTTP 200) with a signed payload containing encrypted payment credentials (authorization token and JWS-signed payload), or PENDING (HTTP 202) with pendingEvents if additional cardholder authentication is required. The signed payload is used by the merchant&#39;s payment processor to complete the transaction.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String instructionId = "instructionId_example"; // String | Unique identifier for the purchase intent instruction.
AgenticRetrievePaymentCredentialsRequest agenticRetrievePaymentCredentialsRequest = new AgenticRetrievePaymentCredentialsRequest(); // AgenticRetrievePaymentCredentialsRequest | 
try {
    AgenticRetrievePaymentCredentialsResponse200 result = apiInstance.retrievePaymentCredentials(instructionId, agenticRetrievePaymentCredentialsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#retrievePaymentCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instructionId** | **String**| Unique identifier for the purchase intent instruction. |
 **agenticRetrievePaymentCredentialsRequest** | [**AgenticRetrievePaymentCredentialsRequest**](AgenticRetrievePaymentCredentialsRequest.md)|  |

### Return type

[**AgenticRetrievePaymentCredentialsResponse200**](AgenticRetrievePaymentCredentialsResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="ucpCancelCheckout"></a>
# **ucpCancelCheckout**
> InlineResponse20113 ucpCancelCheckout(sessionId)

Cancel Checkout UCP

Cancels an active UCP checkout session. No charge is made.  This operation is idempotent — cancelling an already-cancelled session returns a successful response. Sessions also expire automatically after 30 minutes of inactivity. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String sessionId = "sess_abc123"; // String | The unique identifier of the UCP checkout session to cancel.
try {
    InlineResponse20113 result = apiInstance.ucpCancelCheckout(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#ucpCancelCheckout");
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
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String sessionId = "sess_abc123"; // String | The unique identifier of the UCP checkout session to complete.
String idempotencyKey = "a1b2c3d4-e5f6-7890-abcd-ef1234567890"; // String | **Strongly recommended.** A unique key that ensures this order is placed exactly once on retries. Lowercase per UCP spec. 
UcpCompleteCheckoutRequest ucpCompleteCheckoutRequest = new UcpCompleteCheckoutRequest(); // UcpCompleteCheckoutRequest | UCP completion payload containing payment instrument and optional risk signals. If payment context was already provided in the Create or Update call, the body can be omitted. Risk signals are logged for fraud analysis and are not forwarded to the merchant. 
try {
    InlineResponse20113 result = apiInstance.ucpCompleteCheckout(sessionId, idempotencyKey, ucpCompleteCheckoutRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#ucpCompleteCheckout");
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
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
UcpCreateCheckoutSessionRequest ucpCreateCheckoutSessionRequest = new UcpCreateCheckoutSessionRequest(); // UcpCreateCheckoutSessionRequest | UCP checkout session creation payload containing line items, buyer details, currency, and optional payment, fulfillment, and discount information. 
String idempotencyKey = "fc23729f-dc9b-4619-8742-2cf9d7bfdf1b"; // String | Client-generated unique key (UUID recommended) to ensure this request is processed exactly once. Lowercase per UCP specification. 
try {
    InlineResponse20113 result = apiInstance.ucpCreateCheckoutSession(ucpCreateCheckoutSessionRequest, idempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#ucpCreateCheckoutSession");
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
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String sessionId = "sess_abc123"; // String | The unique identifier of the UCP checkout session to retrieve. Obtained from the `id` field in the Create Session response. 
Object ucpGetCheckoutSessionRequest = null; // Object | Empty request body.
try {
    InlineResponse20113 result = apiInstance.ucpGetCheckoutSession(sessionId, ucpGetCheckoutSessionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#ucpGetCheckoutSession");
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
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String sessionId = "sess_abc123"; // String | The unique identifier of the UCP checkout session to update.
UcpUpdateCheckoutSessionRequest ucpUpdateCheckoutSessionRequest = new UcpUpdateCheckoutSessionRequest(); // UcpUpdateCheckoutSessionRequest | UCP session update payload. All fields are optional — only fields you include will be applied. 
String idempotencyKey = "a1b2c3d4-e5f6-7890-abcd-ef1234567890"; // String | Client-generated unique key for idempotency. Lowercase per UCP spec.
try {
    InlineResponse20113 result = apiInstance.ucpUpdateCheckoutSession(sessionId, ucpUpdateCheckoutSessionRequest, idempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#ucpUpdateCheckoutSession");
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

<a name="updateAgent"></a>
# **updateAgent**
> AgentRegistrationResponse201 updateAgent(agentId, agentUpdate)

Update an agent

[category 1 — Agent_Capabilities] Update agent information. Updatable fields are name, domain, description, contactEmail, and agentMetadata. Extra fields (e.g. tokenRequestorId, keys) will return 422 Validation Error. Raises 404 if agent not found, 403 if agent is deactivated, 409 if new domain or contactEmail already exists.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String agentId = "agentId_example"; // String | Unique agent identifier
AgentUpdate agentUpdate = new AgentUpdate(); // AgentUpdate | Agent update request
try {
    AgentRegistrationResponse201 result = apiInstance.updateAgent(agentId, agentUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#updateAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **agentUpdate** | [**AgentUpdate**](AgentUpdate.md)| Agent update request |

### Return type

[**AgentRegistrationResponse201**](AgentRegistrationResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="updateAgentKey"></a>
# **updateAgentKey**
> AddAgentKeyResponse201 updateAgentKey(agentId, keyId, keyUpdate)

Update a key

Update key information. Updatable fields are keyName, publicKey, algorithm, and expirationDate. Raises 404 if agent or key not found, 403 if agent or key is deactivated, 409 if new keyName already exists.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String agentId = "agentId_example"; // String | Unique agent identifier
String keyId = "keyId_example"; // String | Unique key identifier
KeyUpdate keyUpdate = new KeyUpdate(); // KeyUpdate | Key update request
try {
    AddAgentKeyResponse201 result = apiInstance.updateAgentKey(agentId, keyId, keyUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#updateAgentKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **keyId** | **String**| Unique key identifier |
 **keyUpdate** | [**KeyUpdate**](KeyUpdate.md)| Key update request |

### Return type

[**AddAgentKeyResponse201**](AddAgentKeyResponse201.md)

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
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
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
    System.err.println("Exception when calling AgentCapabilitiesApi#updateCheckoutSession");
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

<a name="updatePurchaseIntent"></a>
# **updatePurchaseIntent**
> AgenticCreatePurchaseIntentResponse200 updatePurchaseIntent(instructionId, agenticUpdatePurchaseIntentRequest)

Update a purchase intent

Update an existing purchase intent (instruction) identified by its instructionId. The agent calls this endpoint when the consumer modifies their order — for example, changing the quantity, updating mandates, switching payment instruments, or changing shipping details. The request body has the same structure as the initiate request. Returns the same instructionId (HTTP 200) on success, or PENDING (HTTP 202) with pendingEvents if additional cardholder authentication is required for the updated intent.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentCapabilitiesApi;


AgentCapabilitiesApi apiInstance = new AgentCapabilitiesApi();
String instructionId = "instructionId_example"; // String | Unique identifier for the purchase intent instruction.
AgenticUpdatePurchaseIntentRequest agenticUpdatePurchaseIntentRequest = new AgenticUpdatePurchaseIntentRequest(); // AgenticUpdatePurchaseIntentRequest | 
try {
    AgenticCreatePurchaseIntentResponse200 result = apiInstance.updatePurchaseIntent(instructionId, agenticUpdatePurchaseIntentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentCapabilitiesApi#updatePurchaseIntent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instructionId** | **String**| Unique identifier for the purchase intent instruction. |
 **agenticUpdatePurchaseIntentRequest** | [**AgenticUpdatePurchaseIntentRequest**](AgenticUpdatePurchaseIntentRequest.md)|  |

### Return type

[**AgenticCreatePurchaseIntentResponse200**](AgenticCreatePurchaseIntentResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

