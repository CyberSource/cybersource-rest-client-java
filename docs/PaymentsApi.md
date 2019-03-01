# PaymentsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayment**](PaymentsApi.md#createPayment) | **POST** /pts/v2/payments/ | Process a Payment


<a name="createPayment"></a>
# **createPayment**
> PtsV2PaymentsPost201Response createPayment(createPaymentRequest)

Process a Payment

Authorize the payment for the transaction. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
CreatePaymentRequest createPaymentRequest = new CreatePaymentRequest(); // CreatePaymentRequest | 
try {
    PtsV2PaymentsPost201Response result = apiInstance.createPayment(createPaymentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPaymentRequest** | [**CreatePaymentRequest**](CreatePaymentRequest.md)|  |

### Return type

[**PtsV2PaymentsPost201Response**](PtsV2PaymentsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

