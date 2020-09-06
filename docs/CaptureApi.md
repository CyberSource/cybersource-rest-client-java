# CaptureApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**capturePayment**](CaptureApi.md#capturePayment) | **POST** /pts/v2/payments/{id}/captures | Capture a Payment


<a name="capturePayment"></a>
# **capturePayment**
> PtsV2PaymentsCapturesPost201Response capturePayment(capturePaymentRequest, id)

Capture a Payment

Include the payment ID in the POST request to capture the payment amount.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CaptureApi;


CaptureApi apiInstance = new CaptureApi();
CapturePaymentRequest capturePaymentRequest = new CapturePaymentRequest(); // CapturePaymentRequest | 
String id = "id_example"; // String | The payment ID returned from a previous payment request. This ID links the capture to the payment. 
try {
    PtsV2PaymentsCapturesPost201Response result = apiInstance.capturePayment(capturePaymentRequest, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaptureApi#capturePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **capturePaymentRequest** | [**CapturePaymentRequest**](CapturePaymentRequest.md)|  |
 **id** | **String**| The payment ID returned from a previous payment request. This ID links the capture to the payment.  |

### Return type

[**PtsV2PaymentsCapturesPost201Response**](PtsV2PaymentsCapturesPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

