# VoidApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mitVoid**](VoidApi.md#mitVoid) | **POST** /pts/v2/voids/ | Timeout Void
[**voidCapture**](VoidApi.md#voidCapture) | **POST** /pts/v2/captures/{id}/voids | Void a Capture
[**voidCredit**](VoidApi.md#voidCredit) | **POST** /pts/v2/credits/{id}/voids | Void a Credit
[**voidPayment**](VoidApi.md#voidPayment) | **POST** /pts/v2/payments/{id}/voids | Void a Payment
[**voidRefund**](VoidApi.md#voidRefund) | **POST** /pts/v2/refunds/{id}/voids | Void a Refund


<a name="mitVoid"></a>
# **mitVoid**
> PtsV2PaymentsVoidsPost201Response mitVoid(mitVoidRequest)

Timeout Void

This is to void a previous payment, capture, refund, or credit that merchant does not receive a reply(Mostly due to timeout). This is to void a previous payment, capture, refund, or credit that merchant does not receive a reply(Mostly due to Timeout). To use this feature/API, make sure to pass unique value to field - clientReferenceInformation -&gt; transactionId in your payment, capture, refund, or credit API call and use same transactionId in this API request payload to reverse the payment.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.VoidApi;


VoidApi apiInstance = new VoidApi();
MitVoidRequest mitVoidRequest = new MitVoidRequest(); // MitVoidRequest | 
try {
    PtsV2PaymentsVoidsPost201Response result = apiInstance.mitVoid(mitVoidRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoidApi#mitVoid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mitVoidRequest** | [**MitVoidRequest**](MitVoidRequest.md)|  |

### Return type

[**PtsV2PaymentsVoidsPost201Response**](PtsV2PaymentsVoidsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="voidCapture"></a>
# **voidCapture**
> PtsV2PaymentsVoidsPost201Response voidCapture(voidCaptureRequest, id)

Void a Capture

Refund a capture API is only used, if you have requested Capture independenlty using [/pts/v2/payments/{id}/captures](https://developer.cybersource.com/api-reference-assets/index.html#payments_capture) API call.  Include the capture ID in the POST request to cancel the capture. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.VoidApi;


VoidApi apiInstance = new VoidApi();
VoidCaptureRequest voidCaptureRequest = new VoidCaptureRequest(); // VoidCaptureRequest | 
String id = "id_example"; // String | The capture ID returned from a previous capture request.
try {
    PtsV2PaymentsVoidsPost201Response result = apiInstance.voidCapture(voidCaptureRequest, id);
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

[**PtsV2PaymentsVoidsPost201Response**](PtsV2PaymentsVoidsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="voidCredit"></a>
# **voidCredit**
> PtsV2PaymentsVoidsPost201Response voidCredit(voidCreditRequest, id)

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
    PtsV2PaymentsVoidsPost201Response result = apiInstance.voidCredit(voidCreditRequest, id);
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

[**PtsV2PaymentsVoidsPost201Response**](PtsV2PaymentsVoidsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="voidPayment"></a>
# **voidPayment**
> PtsV2PaymentsVoidsPost201Response voidPayment(voidPaymentRequest, id)

Void a Payment

Void a Payment API is only used, if you have requested Authorization and Capture together in [/pts/v2/payments](https://developer.cybersource.com/api-reference-assets/index.html#payments_payments) API call.  Include the payment ID in the POST request to cancel the payment. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.VoidApi;


VoidApi apiInstance = new VoidApi();
VoidPaymentRequest voidPaymentRequest = new VoidPaymentRequest(); // VoidPaymentRequest | 
String id = "id_example"; // String | The payment ID returned from a previous payment request.
try {
    PtsV2PaymentsVoidsPost201Response result = apiInstance.voidPayment(voidPaymentRequest, id);
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

[**PtsV2PaymentsVoidsPost201Response**](PtsV2PaymentsVoidsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="voidRefund"></a>
# **voidRefund**
> PtsV2PaymentsVoidsPost201Response voidRefund(voidRefundRequest, id)

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
    PtsV2PaymentsVoidsPost201Response result = apiInstance.voidRefund(voidRefundRequest, id);
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

[**PtsV2PaymentsVoidsPost201Response**](PtsV2PaymentsVoidsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

