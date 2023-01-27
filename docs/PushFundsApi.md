# PushFundsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPushFundsTransfer**](PushFundsApi.md#createPushFundsTransfer) | **POST** /pts/v1/push-funds-transfer | Process a Push Funds Transfer


<a name="createPushFundsTransfer"></a>
# **createPushFundsTransfer**
> PushFunds201Response createPushFundsTransfer(pushFundsRequest, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId)

Process a Push Funds Transfer

Receive funds using an Original Credit Transaction (OCT). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PushFundsApi;


PushFundsApi apiInstance = new PushFundsApi();
PushFundsRequest pushFundsRequest = new PushFundsRequest(); // PushFundsRequest | 
String contentType = "contentType_example"; // String | 
String xRequestid = "xRequestid_example"; // String | 
String vCMerchantId = "vCMerchantId_example"; // String | 
String vCPermissions = "vCPermissions_example"; // String | 
String vCCorrelationId = "vCCorrelationId_example"; // String | 
String vCOrganizationId = "vCOrganizationId_example"; // String | 
try {
    PushFunds201Response result = apiInstance.createPushFundsTransfer(pushFundsRequest, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushFundsApi#createPushFundsTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushFundsRequest** | [**PushFundsRequest**](PushFundsRequest.md)|  |
 **contentType** | **String**|  |
 **xRequestid** | **String**|  |
 **vCMerchantId** | **String**|  |
 **vCPermissions** | **String**|  |
 **vCCorrelationId** | **String**|  |
 **vCOrganizationId** | **String**|  |

### Return type

[**PushFunds201Response**](PushFunds201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

