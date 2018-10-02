# VoidApi

All URIs are relative to *https://api.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVoid**](VoidApi.md#getVoid) | **GET** /v2/voids/{id} | Retrieve A Void
[**voidCapture**](VoidApi.md#voidCapture) | **POST** /v2/captures/{id}/voids | Void a Capture
[**voidCredit**](VoidApi.md#voidCredit) | **POST** /v2/credits/{id}/voids | Void a Credit
[**voidPayment**](VoidApi.md#voidPayment) | **POST** /v2/payments/{id}/voids | Void a Payment
[**voidRefund**](VoidApi.md#voidRefund) | **POST** /v2/refunds/{id}/voids | Void a Refund


<a name="getVoid"></a>
# **getVoid**
> InlineResponse2015 getVoid(id)

Retrieve A Void

Include the void ID in the GET request to retrieve the void details.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.VoidApi;


VoidApi apiInstance = new VoidApi();
String id = "id_example"; // String | The void ID returned from a previous void request.
try {
    InlineResponse2015 result = apiInstance.getVoid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoidApi#getVoid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The void ID returned from a previous void request. |

### Return type

[**InlineResponse2015**](InlineResponse2015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="voidCapture"></a>
# **voidCapture**
> InlineResponse2015 voidCapture(voidCaptureRequest, id)

Void a Capture

Include the capture ID in the POST request to cancel the capture.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.VoidApi;


VoidApi apiInstance = new VoidApi();
VoidCaptureRequest voidCaptureRequest = new VoidCaptureRequest(); // VoidCaptureRequest | 
String id = "id_example"; // String | The capture ID returned from a previous capture request.
try {
    InlineResponse2015 result = apiInstance.voidCapture(voidCaptureRequest, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoidApi#voidCapture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voidCaptureRequest** | [**VoidCaptureRequest**](VoidCaptureRequest.md)|  |
 **id** | **String**| The capture ID returned from a previous capture request. |

### Return type

[**InlineResponse2015**](InlineResponse2015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="voidCredit"></a>
# **voidCredit**
> InlineResponse2015 voidCredit(voidCreditRequest, id)

Void a Credit

Include the credit ID in the POST request to cancel the credit.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.VoidApi;


VoidApi apiInstance = new VoidApi();
VoidCreditRequest voidCreditRequest = new VoidCreditRequest(); // VoidCreditRequest | 
String id = "id_example"; // String | The credit ID returned from a previous credit request.
try {
    InlineResponse2015 result = apiInstance.voidCredit(voidCreditRequest, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoidApi#voidCredit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voidCreditRequest** | [**VoidCreditRequest**](VoidCreditRequest.md)|  |
 **id** | **String**| The credit ID returned from a previous credit request. |

### Return type

[**InlineResponse2015**](InlineResponse2015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="voidPayment"></a>
# **voidPayment**
> InlineResponse2015 voidPayment(voidPaymentRequest, id)

Void a Payment

Include the payment ID in the POST request to cancel the payment.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.VoidApi;


VoidApi apiInstance = new VoidApi();
VoidPaymentRequest voidPaymentRequest = new VoidPaymentRequest(); // VoidPaymentRequest | 
String id = "id_example"; // String | The payment ID returned from a previous payment request.
try {
    InlineResponse2015 result = apiInstance.voidPayment(voidPaymentRequest, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoidApi#voidPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voidPaymentRequest** | [**VoidPaymentRequest**](VoidPaymentRequest.md)|  |
 **id** | **String**| The payment ID returned from a previous payment request. |

### Return type

[**InlineResponse2015**](InlineResponse2015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="voidRefund"></a>
# **voidRefund**
> InlineResponse2015 voidRefund(voidRefundRequest, id)

Void a Refund

Include the refund ID in the POST request to cancel the refund.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.VoidApi;


VoidApi apiInstance = new VoidApi();
VoidRefundRequest voidRefundRequest = new VoidRefundRequest(); // VoidRefundRequest | 
String id = "id_example"; // String | The refund ID returned from a previous refund request.
try {
    InlineResponse2015 result = apiInstance.voidRefund(voidRefundRequest, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoidApi#voidRefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voidRefundRequest** | [**VoidRefundRequest**](VoidRefundRequest.md)|  |
 **id** | **String**| The refund ID returned from a previous refund request. |

### Return type

[**InlineResponse2015**](InlineResponse2015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

