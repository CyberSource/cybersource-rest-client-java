# InstructionsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelPurchaseIntent**](InstructionsApi.md#cancelPurchaseIntent) | **PUT** /acp/v1/instructions/{instructionId}/cancel | Cancel a purchase intent
[**confirmTransactionEvents**](InstructionsApi.md#confirmTransactionEvents) | **POST** /acp/v1/instructions/{instructionId}/confirmations | Confirm transaction events
[**initiatePurchaseIntent**](InstructionsApi.md#initiatePurchaseIntent) | **POST** /acp/v1/instructions | Initiate a purchase intent
[**retrievePaymentCredentials**](InstructionsApi.md#retrievePaymentCredentials) | **POST** /acp/v1/instructions/{instructionId}/credentials | Retrieve payment credentials
[**updatePurchaseIntent**](InstructionsApi.md#updatePurchaseIntent) | **PUT** /acp/v1/instructions/{instructionId} | Update a purchase intent


<a name="cancelPurchaseIntent"></a>
# **cancelPurchaseIntent**
> AgenticCreatePurchaseIntentResponse200 cancelPurchaseIntent(instructionId, agenticCancelPurchaseIntentRequest)

Cancel a purchase intent

Cancels an existing purchase intent identified by the transaction ID.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstructionsApi;


InstructionsApi apiInstance = new InstructionsApi();
String instructionId = "instructionId_example"; // String | 
AgenticCancelPurchaseIntentRequest agenticCancelPurchaseIntentRequest = new AgenticCancelPurchaseIntentRequest(); // AgenticCancelPurchaseIntentRequest | Unique identifier for the purchase intent instruction.
try {
    AgenticCreatePurchaseIntentResponse200 result = apiInstance.cancelPurchaseIntent(instructionId, agenticCancelPurchaseIntentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstructionsApi#cancelPurchaseIntent");
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

Agents send the confirm transaction events to notify the payment processing is done

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstructionsApi;


InstructionsApi apiInstance = new InstructionsApi();
String instructionId = "instructionId_example"; // String | Unique identifier for the purchase intent instruction.
AgenticConfirmTransactionEventsRequest agenticConfirmTransactionEventsRequest = new AgenticConfirmTransactionEventsRequest(); // AgenticConfirmTransactionEventsRequest | 
try {
    AgenticConfirmTransactionEventsResponse202 result = apiInstance.confirmTransactionEvents(instructionId, agenticConfirmTransactionEventsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstructionsApi#confirmTransactionEvents");
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

<a name="initiatePurchaseIntent"></a>
# **initiatePurchaseIntent**
> AgenticCreatePurchaseIntentResponse200 initiatePurchaseIntent(agenticCreatePurchaseIntentRequest)

Initiate a purchase intent

Creates a new purchase intent with the provided details.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstructionsApi;


InstructionsApi apiInstance = new InstructionsApi();
AgenticCreatePurchaseIntentRequest agenticCreatePurchaseIntentRequest = new AgenticCreatePurchaseIntentRequest(); // AgenticCreatePurchaseIntentRequest | 
try {
    AgenticCreatePurchaseIntentResponse200 result = apiInstance.initiatePurchaseIntent(agenticCreatePurchaseIntentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstructionsApi#initiatePurchaseIntent");
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

Retrieve a customer&#39;s tokenized payment credentials to complete the transaction.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstructionsApi;


InstructionsApi apiInstance = new InstructionsApi();
String instructionId = "instructionId_example"; // String | Unique identifier for the purchase intent instruction.
AgenticRetrievePaymentCredentialsRequest agenticRetrievePaymentCredentialsRequest = new AgenticRetrievePaymentCredentialsRequest(); // AgenticRetrievePaymentCredentialsRequest | 
try {
    AgenticRetrievePaymentCredentialsResponse200 result = apiInstance.retrievePaymentCredentials(instructionId, agenticRetrievePaymentCredentialsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstructionsApi#retrievePaymentCredentials");
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

Updates an existing purchase intent identified by the transaction ID.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstructionsApi;


InstructionsApi apiInstance = new InstructionsApi();
String instructionId = "instructionId_example"; // String | Unique identifier for the purchase intent instruction.
AgenticUpdatePurchaseIntentRequest agenticUpdatePurchaseIntentRequest = new AgenticUpdatePurchaseIntentRequest(); // AgenticUpdatePurchaseIntentRequest | 
try {
    AgenticCreatePurchaseIntentResponse200 result = apiInstance.updatePurchaseIntent(instructionId, agenticUpdatePurchaseIntentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstructionsApi#updatePurchaseIntent");
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

