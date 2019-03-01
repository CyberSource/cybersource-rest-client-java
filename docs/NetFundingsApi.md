# NetFundingsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNetFundingInfo**](NetFundingsApi.md#getNetFundingInfo) | **GET** /reporting/v3/net-fundings | Get Netfunding information for an account or a merchant


<a name="getNetFundingInfo"></a>
# **getNetFundingInfo**
> ReportingV3NetFundingsGet200Response getNetFundingInfo(startTime, endTime, organizationId, groupName)

Get Netfunding information for an account or a merchant

Get Netfunding information for an account or a merchant.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.NetFundingsApi;


NetFundingsApi apiInstance = new NetFundingsApi();
DateTime startTime = new DateTime(); // DateTime | Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd'T'HH:mm:ssXXX 
DateTime endTime = new DateTime(); // DateTime | Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd'T'HH:mm:ssXXX 
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
String groupName = "groupName_example"; // String | Valid CyberSource Group Name.
try {
    ReportingV3NetFundingsGet200Response result = apiInstance.getNetFundingInfo(startTime, endTime, organizationId, groupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetFundingsApi#getNetFundingInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **DateTime**| Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX  |
 **endTime** | **DateTime**| Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX  |
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]
 **groupName** | **String**| Valid CyberSource Group Name. | [optional]

### Return type

[**ReportingV3NetFundingsGet200Response**](ReportingV3NetFundingsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

