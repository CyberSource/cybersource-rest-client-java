# PayoutsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**octCreatePayment**](PayoutsApi.md#octCreatePayment) | **POST** /pts/v2/payouts | Process a Payout


<a name="octCreatePayment"></a>
# **octCreatePayment**
> octCreatePayment(octCreatePaymentRequest)

Process a Payout

Send funds from a selected funding source to a designated credit/debit card account or a prepaid card using an Original Credit Transaction (OCT). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PayoutsApi;


PayoutsApi apiInstance = new PayoutsApi();
OctCreatePaymentRequest octCreatePaymentRequest = new OctCreatePaymentRequest(); // OctCreatePaymentRequest | 
try {
    apiInstance.octCreatePayment(octCreatePaymentRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsApi#octCreatePayment");
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

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

