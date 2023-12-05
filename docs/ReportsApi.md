# ReportsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReport**](ReportsApi.md#createReport) | **POST** /reporting/v3/reports | Create Adhoc Report
[**getReportByReportId**](ReportsApi.md#getReportByReportId) | **GET** /reporting/v3/reports/{reportId} | Get Report Based on Report Id
[**searchReports**](ReportsApi.md#searchReports) | **GET** /reporting/v3/reports | Retrieve Available Reports


<a name="createReport"></a>
# **createReport**
> createReport(createAdhocReportRequest, organizationId)

Create Adhoc Report

Create a one-time report. You must specify the type of report in reportDefinitionName. For a list of values for reportDefinitionName, see the [Reporting Developer Guide](https://www.cybersource.com/developers/documentation/reporting_and_reconciliation) 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
CreateAdhocReportRequest createAdhocReportRequest = new CreateAdhocReportRequest(); // CreateAdhocReportRequest | Report subscription request payload
String organizationId = "organizationId_example"; // String | Valid Organization Id
try {
    apiInstance.createReport(createAdhocReportRequest, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#createReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAdhocReportRequest** | [**CreateAdhocReportRequest**](CreateAdhocReportRequest.md)| Report subscription request payload |
 **organizationId** | **String**| Valid Organization Id | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

<a name="getReportByReportId"></a>
# **getReportByReportId**
> ReportingV3ReportsIdGet200Response getReportByReportId(reportId, organizationId)

Get Report Based on Report Id

Download a report using the reportId value. If you don&#39;t already know this value, you can obtain it using the Retrieve available reports call. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportId = "reportId_example"; // String | Valid Report Id
String organizationId = "organizationId_example"; // String | Valid Organization Id
try {
    ReportingV3ReportsIdGet200Response result = apiInstance.getReportByReportId(reportId, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getReportByReportId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **String**| Valid Report Id |
 **organizationId** | **String**| Valid Organization Id | [optional]

### Return type

[**ReportingV3ReportsIdGet200Response**](ReportingV3ReportsIdGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json, application/xml

<a name="searchReports"></a>
# **searchReports**
> ReportingV3ReportsGet200Response searchReports(startTime, endTime, timeQueryType, organizationId, reportMimeType, reportFrequency, reportName, reportDefinitionId, reportStatus)

Retrieve Available Reports

Retrieve a list of the available reports to which you are subscribed. This will also give you the reportId value, which you can also use to download a report. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
DateTime startTime = new DateTime(); // DateTime | Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z) 
DateTime endTime = new DateTime(); // DateTime | Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z) 
String timeQueryType = "timeQueryType_example"; // String | Specify time you would like to search  Valid values: - reportTimeFrame - executedTime 
String organizationId = "organizationId_example"; // String | Valid Organization Id
String reportMimeType = "reportMimeType_example"; // String | Valid Report Format  Valid values: - application/xml - text/csv 
String reportFrequency = "reportFrequency_example"; // String | Valid Report Frequency  Valid values: - DAILY - WEEKLY - MONTHLY - USER_DEFINED - ADHOC 
String reportName = "reportName_example"; // String | Valid Report Name
Integer reportDefinitionId = 56; // Integer | Valid Report Definition Id
String reportStatus = "reportStatus_example"; // String | Valid Report Status  Valid values: - COMPLETED - PENDING - QUEUED - RUNNING - ERROR - NO_DATA 
try {
    ReportingV3ReportsGet200Response result = apiInstance.searchReports(startTime, endTime, timeQueryType, organizationId, reportMimeType, reportFrequency, reportName, reportDefinitionId, reportStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#searchReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **DateTime**| Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  |
 **endTime** | **DateTime**| Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  |
 **timeQueryType** | **String**| Specify time you would like to search  Valid values: - reportTimeFrame - executedTime  |
 **organizationId** | **String**| Valid Organization Id | [optional]
 **reportMimeType** | **String**| Valid Report Format  Valid values: - application/xml - text/csv  | [optional]
 **reportFrequency** | **String**| Valid Report Frequency  Valid values: - DAILY - WEEKLY - MONTHLY - USER_DEFINED - ADHOC  | [optional]
 **reportName** | **String**| Valid Report Name | [optional]
 **reportDefinitionId** | **Integer**| Valid Report Definition Id | [optional]
 **reportStatus** | **String**| Valid Report Status  Valid values: - COMPLETED - PENDING - QUEUED - RUNNING - ERROR - NO_DATA  | [optional]

### Return type

[**ReportingV3ReportsGet200Response**](ReportingV3ReportsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

