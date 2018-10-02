# CaptureApi

All URIs are relative to *https://api.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**capturePayment**](CaptureApi.md#capturePayment) | **POST** /v2/payments/{id}/captures | Capture a Payment
[**getCapture**](CaptureApi.md#getCapture) | **GET** /v2/captures/{id} | Retrieve a Capture


<a name="capturePayment"></a>
# **capturePayment**
> InlineResponse2012 capturePayment(capturePaymentRequest, id)

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
    InlineResponse2012 result = apiInstance.capturePayment(capturePaymentRequest, id);
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

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCapture"></a>
# **getCapture**
> InlineResponse2004 getCapture(id)

Retrieve a Capture

Include the capture ID in the GET request to retrieve the capture details. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CaptureApi;


CaptureApi apiInstance = new CaptureApi();
String id = "id_example"; // String | The capture ID returned from a previous capture request. 
try {
    InlineResponse2004 result = apiInstance.getCapture(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CaptureApi#getCapture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The capture ID returned from a previous capture request.  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

