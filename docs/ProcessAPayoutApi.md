# ProcessAPayoutApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**octCreatePayment**](ProcessAPayoutApi.md#octCreatePayment) | **POST** /pts/v2/payouts/ | Process a Payout


<a name="octCreatePayment"></a>
# **octCreatePayment**
> PtsV2PayoutsPost201Response octCreatePayment(octCreatePaymentRequest)

Process a Payout

Send funds from a selected funding source to a designated credit/debit card account or a prepaid card using an Original Credit Transaction (OCT). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ProcessAPayoutApi;


ProcessAPayoutApi apiInstance = new ProcessAPayoutApi();
PtsV2PayoutsPostResponse octCreatePaymentRequest = new PtsV2PayoutsPostResponse(); // PtsV2PayoutsPostResponse | 
try {
    PtsV2PayoutsPost201Response result = apiInstance.octCreatePayment(octCreatePaymentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessAPayoutApi#octCreatePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **octCreatePaymentRequest** | [**PtsV2PayoutsPostResponse**](PtsV2PayoutsPostResponse.md)|  |

### Return type

[**PtsV2PayoutsPost201Response**](PtsV2PayoutsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

