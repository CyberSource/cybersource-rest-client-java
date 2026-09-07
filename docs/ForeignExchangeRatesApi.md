# ForeignExchangeRatesApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFxRates**](ForeignExchangeRatesApi.md#createFxRates) | **POST** /pts/v2/payouts/fx-rates | Retrieve Foreign Exchange Rates


<a name="createFxRates"></a>
# **createFxRates**
> InlineResponse2013 createFxRates(body, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId)

Retrieve Foreign Exchange Rates

Retrieve current foreign exchange rates for cross-border payouts. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ForeignExchangeRatesApi;


ForeignExchangeRatesApi apiInstance = new ForeignExchangeRatesApi();
Body body = new Body(); // Body | 
String contentType = "contentType_example"; // String | 
String xRequestid = "xRequestid_example"; // String | 
String vCMerchantId = "vCMerchantId_example"; // String | 
String vCPermissions = "vCPermissions_example"; // String | 
String vCCorrelationId = "vCCorrelationId_example"; // String | 
String vCOrganizationId = "vCOrganizationId_example"; // String | 
try {
    InlineResponse2013 result = apiInstance.createFxRates(body, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForeignExchangeRatesApi#createFxRates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)|  |
 **contentType** | **String**|  |
 **xRequestid** | **String**|  |
 **vCMerchantId** | **String**|  |
 **vCPermissions** | **String**|  |
 **vCCorrelationId** | **String**|  |
 **vCOrganizationId** | **String**|  |

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

