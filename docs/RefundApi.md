# RefundApi

All URIs are relative to *https://api.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRefund**](RefundApi.md#getRefund) | **GET** /v2/refunds/{id} | Retrieve a Refund
[**refundCapture**](RefundApi.md#refundCapture) | **POST** /v2/captures/{id}/refunds | Refund a Capture
[**refundPayment**](RefundApi.md#refundPayment) | **POST** /v2/payments/{id}/refunds | Refund a Payment


<a name="getRefund"></a>
# **getRefund**
> InlineResponse2005 getRefund(id)

Retrieve a Refund

Include the refund ID in the GET request to to retrieve the refund details.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.RefundApi;


RefundApi apiInstance = new RefundApi();
String id = "id_example"; // String | The refund ID. This ID is returned from a previous refund request.
try {
    InlineResponse2005 result = apiInstance.getRefund(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundApi#getRefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The refund ID. This ID is returned from a previous refund request. |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="refundCapture"></a>
# **refundCapture**
> InlineResponse2013 refundCapture(refundCaptureRequest, id)

Refund a Capture

Include the capture ID in the POST request to refund the captured amount. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.RefundApi;


RefundApi apiInstance = new RefundApi();
RefundCaptureRequest refundCaptureRequest = new RefundCaptureRequest(); // RefundCaptureRequest | 
String id = "id_example"; // String | The capture ID. This ID is returned from a previous capture request.
try {
    InlineResponse2013 result = apiInstance.refundCapture(refundCaptureRequest, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundApi#refundCapture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refundCaptureRequest** | [**RefundCaptureRequest**](RefundCaptureRequest.md)|  |
 **id** | **String**| The capture ID. This ID is returned from a previous capture request. |

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="refundPayment"></a>
# **refundPayment**
> InlineResponse2013 refundPayment(refundPaymentRequest, id)

Refund a Payment

Include the payment ID in the POST request to refund the payment amount. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.RefundApi;


RefundApi apiInstance = new RefundApi();
RefundPaymentRequest refundPaymentRequest = new RefundPaymentRequest(); // RefundPaymentRequest | 
String id = "id_example"; // String | The payment ID. This ID is returned from a previous payment request.
try {
    InlineResponse2013 result = apiInstance.refundPayment(refundPaymentRequest, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundApi#refundPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refundPaymentRequest** | [**RefundPaymentRequest**](RefundPaymentRequest.md)|  |
 **id** | **String**| The payment ID. This ID is returned from a previous payment request. |

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

