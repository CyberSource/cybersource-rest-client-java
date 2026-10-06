# PurchaseIntentApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelPurchaseIntent**](PurchaseIntentApi.md#cancelPurchaseIntent) | **PUT** /icc/v1/instructions/{instructionId}/cancel | Cancel a purchase intent
[**initiatePurchaseIntent**](PurchaseIntentApi.md#initiatePurchaseIntent) | **POST** /icc/v1/instructions | Initiate a purchase intent
[**updatePurchaseIntent**](PurchaseIntentApi.md#updatePurchaseIntent) | **PUT** /icc/v1/instructions/{instructionId} | Update a purchase intent


<a name="cancelPurchaseIntent"></a>
# **cancelPurchaseIntent**
> AgenticCreatePurchaseIntentResponse200 cancelPurchaseIntent(instructionId, agenticCancelPurchaseIntentRequest)

Cancel a purchase intent

Cancel an existing purchase intent (instruction) identified by its instructionId. The agent calls this endpoint when the consumer decides to abandon the purchase before payment credentials have been used. Requires device information and assurance data for identity verification. Returns status CANCELLED (HTTP 200) on success, or PENDING (HTTP 202) with pendingEvents if cardholder authentication is required before cancellation can proceed.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PurchaseIntentApi;


PurchaseIntentApi apiInstance = new PurchaseIntentApi();
String instructionId = "instructionId_example"; // String | 
AgenticCancelPurchaseIntentRequest agenticCancelPurchaseIntentRequest = new AgenticCancelPurchaseIntentRequest(); // AgenticCancelPurchaseIntentRequest | Unique identifier for the purchase intent instruction.
try {
    AgenticCreatePurchaseIntentResponse200 result = apiInstance.cancelPurchaseIntent(instructionId, agenticCancelPurchaseIntentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseIntentApi#cancelPurchaseIntent");
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

<a name="initiatePurchaseIntent"></a>
# **initiatePurchaseIntent**
> AgenticCreatePurchaseIntentResponse200 initiatePurchaseIntent(agenticCreatePurchaseIntentRequest)

Initiate a purchase intent

Create a new purchase intent (instruction) for an agentic transaction. The agent calls this endpoint after a card has been enrolled to define what the consumer wants to buy. The request includes payment instrument references, device and assurance data, mandates (spending limits, merchant preferences, and product descriptions), and optional buyer information. Return an instructionId (HTTP 200) if the intent is created immediately, or PENDING (HTTP 202) with pendingEvents if cardholder authentication is required. The instructionId returned is used in all subsequent operations - update, cancel, retrieve credentials, and confirm transaction.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PurchaseIntentApi;


PurchaseIntentApi apiInstance = new PurchaseIntentApi();
AgenticCreatePurchaseIntentRequest agenticCreatePurchaseIntentRequest = new AgenticCreatePurchaseIntentRequest(); // AgenticCreatePurchaseIntentRequest | 
try {
    AgenticCreatePurchaseIntentResponse200 result = apiInstance.initiatePurchaseIntent(agenticCreatePurchaseIntentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseIntentApi#initiatePurchaseIntent");
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

<a name="updatePurchaseIntent"></a>
# **updatePurchaseIntent**
> AgenticCreatePurchaseIntentResponse200 updatePurchaseIntent(instructionId, agenticUpdatePurchaseIntentRequest)

Update a purchase intent

Update an existing purchase intent (instruction) identified by its instructionId. The agent calls this endpoint when the consumer modifies their order — for example, changing the quantity, updating mandates, switching payment instruments, or changing shipping details. The request body has the same structure as the initiate request. Returns the same instructionId (HTTP 200) on success, or PENDING (HTTP 202) with pendingEvents if additional cardholder authentication is required for the updated intent.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PurchaseIntentApi;


PurchaseIntentApi apiInstance = new PurchaseIntentApi();
String instructionId = "instructionId_example"; // String | Unique identifier for the purchase intent instruction.
AgenticUpdatePurchaseIntentRequest agenticUpdatePurchaseIntentRequest = new AgenticUpdatePurchaseIntentRequest(); // AgenticUpdatePurchaseIntentRequest | 
try {
    AgenticCreatePurchaseIntentResponse200 result = apiInstance.updatePurchaseIntent(instructionId, agenticUpdatePurchaseIntentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseIntentApi#updatePurchaseIntent");
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

