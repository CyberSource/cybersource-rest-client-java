# PaymentApi

All URIs are relative to *https://api.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayment**](PaymentApi.md#createPayment) | **POST** /v2/payments/ | Process a Payment
[**getPayment**](PaymentApi.md#getPayment) | **GET** /v2/payments/{id} | Retrieve a Payment


<a name="createPayment"></a>
# **createPayment**
> InlineResponse201 createPayment(createPaymentRequest)

Process a Payment

Authorize the payment for the transaction. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
CreatePaymentRequest createPaymentRequest = new CreatePaymentRequest(); // CreatePaymentRequest | 
try {
    InlineResponse201 result = apiInstance.createPayment(createPaymentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#createPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPaymentRequest** | [**CreatePaymentRequest**](CreatePaymentRequest.md)|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPayment"></a>
# **getPayment**
> InlineResponse2002 getPayment(id)

Retrieve a Payment

Include the payment ID in the GET request to retrieve the payment details.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
String id = "id_example"; // String | The payment ID returned from a previous payment request. 
try {
    InlineResponse2002 result = apiInstance.getPayment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#getPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The payment ID returned from a previous payment request.  |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

