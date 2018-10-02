# DefaultApi

All URIs are relative to *https://api.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**octCreatePayment**](DefaultApi.md#octCreatePayment) | **POST** /v2/payouts/ | Process a Payout


<a name="octCreatePayment"></a>
# **octCreatePayment**
> octCreatePayment(octCreatePaymentRequest)

Process a Payout

Send funds from a selected funding source to a designated credit/debit card account or a prepaid card using an Original Credit Transaction (OCT). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
OctCreatePaymentRequest octCreatePaymentRequest = new OctCreatePaymentRequest(); // OctCreatePaymentRequest | 
try {
    apiInstance.octCreatePayment(octCreatePaymentRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#octCreatePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **octCreatePaymentRequest** | [**OctCreatePaymentRequest**](OctCreatePaymentRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

