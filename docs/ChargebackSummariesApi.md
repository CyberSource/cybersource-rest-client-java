# ChargebackSummariesApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChargebackSummaries**](ChargebackSummariesApi.md#getChargebackSummaries) | **GET** /reporting/v3/chargeback-summaries | Get Chargeback Summaries


<a name="getChargebackSummaries"></a>
# **getChargebackSummaries**
> ReportingV3ChargebackSummariesGet200Response getChargebackSummaries(startTime, endTime, organizationId)

Get Chargeback Summaries

Chargeback Summary Report Description

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ChargebackSummariesApi;


ChargebackSummariesApi apiInstance = new ChargebackSummariesApi();
DateTime startTime = new DateTime(); // DateTime | Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z) 
DateTime endTime = new DateTime(); // DateTime | Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z) 
String organizationId = "organizationId_example"; // String | Valid Organization Id
try {
    ReportingV3ChargebackSummariesGet200Response result = apiInstance.getChargebackSummaries(startTime, endTime, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebackSummariesApi#getChargebackSummaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **DateTime**| Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  |
 **endTime** | **DateTime**| Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  |
 **organizationId** | **String**| Valid Organization Id | [optional]

### Return type

[**ReportingV3ChargebackSummariesGet200Response**](ReportingV3ChargebackSummariesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json, application/xml

