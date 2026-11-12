# PaymentTokensApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveOrDeletePaymentToken**](PaymentTokensApi.md#retrieveOrDeletePaymentToken) | **POST** /pts/v2/payment-tokens | Retrieve or Delete Payment Token


<a name="retrieveOrDeletePaymentToken"></a>
# **retrieveOrDeletePaymentToken**
> RetrieveOrDeletePaymentTokenResponse retrieveOrDeletePaymentToken(paymentTokenRequest)

Retrieve or Delete Payment Token

This API can be used in two flavours - for retrieval or deletion of vault id. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentTokensApi;


PaymentTokensApi apiInstance = new PaymentTokensApi();
PaymentTokenRequest paymentTokenRequest = new PaymentTokenRequest(); // PaymentTokenRequest | 
try {
    RetrieveOrDeletePaymentTokenResponse result = apiInstance.retrieveOrDeletePaymentToken(paymentTokenRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTokensApi#retrieveOrDeletePaymentToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentTokenRequest** | [**PaymentTokenRequest**](PaymentTokenRequest.md)|  |

### Return type

[**RetrieveOrDeletePaymentTokenResponse**](RetrieveOrDeletePaymentTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/json; charset=utf-8
 - **Accept**: application/hal+json

