# PaymentEventsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmTransactionEvents**](PaymentEventsApi.md#confirmTransactionEvents) | **POST** /icc/v1/instructions/{instructionId}/confirmations | Confirm transaction events
[**retrievePaymentCredentials**](PaymentEventsApi.md#retrievePaymentCredentials) | **POST** /icc/v1/instructions/{instructionId}/credentials | Retrieve payment credentials


<a name="confirmTransactionEvents"></a>
# **confirmTransactionEvents**
> AgenticConfirmTransactionEventsResponse202 confirmTransactionEvents(instructionId, agenticConfirmTransactionEventsRequest)

Confirm transaction events

Confirm transaction events for a completed purchase. The agent calls this endpoint after the payment has been submitted to notify the Intelligent Commerce Connect of the transaction outcome. The request includes processor information (transaction type, status, approval codes), order details (shipping, tracking, product information), and merchant information. Returns HTTP 202 acknowledging receipt of the confirmation.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentEventsApi;


PaymentEventsApi apiInstance = new PaymentEventsApi();
String instructionId = "instructionId_example"; // String | Unique identifier for the purchase intent instruction.
AgenticConfirmTransactionEventsRequest agenticConfirmTransactionEventsRequest = new AgenticConfirmTransactionEventsRequest(); // AgenticConfirmTransactionEventsRequest | 
try {
    AgenticConfirmTransactionEventsResponse202 result = apiInstance.confirmTransactionEvents(instructionId, agenticConfirmTransactionEventsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentEventsApi#confirmTransactionEvents");
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

<a name="retrievePaymentCredentials"></a>
# **retrievePaymentCredentials**
> AgenticRetrievePaymentCredentialsResponse200 retrievePaymentCredentials(instructionId, agenticRetrievePaymentCredentialsRequest)

Retrieve payment credentials

Retrieve tokenized payment credentials for a purchase intent to complete the transaction at a merchant. The agent calls this endpoint after a purchase intent has been created and approved, providing transaction-level details including order information, merchant details, payment options, and production information. Returns COMPLETED (HTTP 200) with a signed payload containing encrypted payment credentials (authorization token and JWS-signed payload), or PENDING (HTTP 202) with pendingEvents if additional cardholder authentication is required. The signed payload is used by the merchant&#39;s payment processor to complete the transaction.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentEventsApi;


PaymentEventsApi apiInstance = new PaymentEventsApi();
String instructionId = "instructionId_example"; // String | Unique identifier for the purchase intent instruction.
AgenticRetrievePaymentCredentialsRequest agenticRetrievePaymentCredentialsRequest = new AgenticRetrievePaymentCredentialsRequest(); // AgenticRetrievePaymentCredentialsRequest | 
try {
    AgenticRetrievePaymentCredentialsResponse200 result = apiInstance.retrievePaymentCredentials(instructionId, agenticRetrievePaymentCredentialsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentEventsApi#retrievePaymentCredentials");
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

