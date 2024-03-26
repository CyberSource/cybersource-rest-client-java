# TransientTokenDataApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentCredentialsForTransientToken**](TransientTokenDataApi.md#getPaymentCredentialsForTransientToken) | **GET** /up/v1/payment-credentials/{jti} | Get Payment Credentials
[**getTransactionForTransientToken**](TransientTokenDataApi.md#getTransactionForTransientToken) | **GET** /up/v1/payment-details/{transientToken} | Get Transient Token Data


<a name="getPaymentCredentialsForTransientToken"></a>
# **getPaymentCredentialsForTransientToken**
> String getPaymentCredentialsForTransientToken(jti)

Get Payment Credentials

Retrieve the Payment data captured by Unified Checkout. This API is used to retrieve the detailed data represented by the Transient Token. This API will return PCI payment data captured by the Unified Checkout platform.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TransientTokenDataApi;


TransientTokenDataApi apiInstance = new TransientTokenDataApi();
String jti = "jti_example"; // String | The jti field contained within the Transient token returned from a successful Unified Checkout transaction 
try {
    String result = apiInstance.getPaymentCredentialsForTransientToken(jti);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransientTokenDataApi#getPaymentCredentialsForTransientToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jti** | **String**| The jti field contained within the Transient token returned from a successful Unified Checkout transaction  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json

<a name="getTransactionForTransientToken"></a>
# **getTransactionForTransientToken**
> getTransactionForTransientToken(transientToken)

Get Transient Token Data

Retrieve the data captured by Unified Checkout. This API is used to retrieve the detailed data represented by the Transient Token. This API will not return PCI payment data (PAN). Include the Request ID in the GET request to retrieve the transaction details.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TransientTokenDataApi;


TransientTokenDataApi apiInstance = new TransientTokenDataApi();
String transientToken = "transientToken_example"; // String | Transient Token returned by the Unified Checkout application. 
try {
    apiInstance.getTransactionForTransientToken(transientToken);
} catch (ApiException e) {
    System.err.println("Exception when calling TransientTokenDataApi#getTransactionForTransientToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transientToken** | **String**| Transient Token returned by the Unified Checkout application.  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json

