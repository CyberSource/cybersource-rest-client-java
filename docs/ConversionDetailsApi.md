# ConversionDetailsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConversionDetail**](ConversionDetailsApi.md#getConversionDetail) | **GET** /reporting/v3/conversion-details | Get conversion detail transactions


<a name="getConversionDetail"></a>
# **getConversionDetail**
> ReportingV3ConversionDetailsGet200Response getConversionDetail(startTime, endTime, organizationId)

Get conversion detail transactions

Get conversion detail of transactions for a merchant.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ConversionDetailsApi;


ConversionDetailsApi apiInstance = new ConversionDetailsApi();
DateTime startTime = new DateTime(); // DateTime | Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z) 
DateTime endTime = new DateTime(); // DateTime | Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z) 
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
try {
    ReportingV3ConversionDetailsGet200Response result = apiInstance.getConversionDetail(startTime, endTime, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversionDetailsApi#getConversionDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **DateTime**| Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  |
 **endTime** | **DateTime**| Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  |
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]

### Return type

[**ReportingV3ConversionDetailsGet200Response**](ReportingV3ConversionDetailsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

