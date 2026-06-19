# AgentCapabilitiesApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelPurchaseIntent**](AgentCapabilitiesApi.md#cancelPurchaseIntent) | **PUT** /icc/v1/instructions/{instructionId}/cancel | Cancel a purchase intent
[**confirmTransactionEvents**](AgentCapabilitiesApi.md#confirmTransactionEvents) | **POST** /icc/v1/instructions/{instructionId}/confirmations | Confirm transaction events
[**enrollCard**](AgentCapabilitiesApi.md#enrollCard) | **POST** /icc/v1/tokens | Enroll a card
[**initiatePurchaseIntent**](AgentCapabilitiesApi.md#initiatePurchaseIntent) | **POST** /icc/v1/instructions | Initiate a purchase intent
[**retrievePaymentCredentials**](AgentCapabilitiesApi.md#retrievePaymentCredentials) | **POST** /icc/v1/instructions/{instructionId}/credentials | Retrieve payment credentials
[**updatePurchaseIntent**](AgentCapabilitiesApi.md#updatePurchaseIntent) | **PUT** /icc/v1/instructions/{instructionId} | Update a purchase intent


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

