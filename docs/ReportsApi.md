# ReportsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReport**](ReportsApi.md#createReport) | **POST** /reporting/v3/reports | Create Adhoc Report
[**getReportByReportId**](ReportsApi.md#getReportByReportId) | **GET** /reporting/v3/reports/{reportId} | Get Report based on reportId
[**searchReports**](ReportsApi.md#searchReports) | **GET** /reporting/v3/reports | Retrieve available reports


<a name="createReport"></a>
# **createReport**
> createReport(requestBody, organizationId)

Create Adhoc Report

Create a one-time report. You must specify the type of report in reportDefinitionName. For a list of values for reportDefinitionName, see the [Reporting Developer Guide](https://www.cybersource.com/developers/documentation/reporting_and_reconciliation) 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
RequestBody requestBody = new RequestBody(); // RequestBody | Report subscription request payload
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
try {
    apiInstance.createReport(requestBody, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#createReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**RequestBody**](RequestBody.md)| Report subscription request payload |
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]

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

Get Report based on reportId

Download a report using the reportId value. If you don’t already know this value, you can obtain it using the Retrieve available reports call. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportId = "reportId_example"; // String | Valid Report Id
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
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
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]

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

Retrieve available reports

Retrieve a list of the available reports to which you are subscribed. This will also give you the reportId value, which you can also use to download a report. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
DateTime startTime = new DateTime(); // DateTime | Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd'T'HH:mm:ssXXX 
DateTime endTime = new DateTime(); // DateTime | Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd'T'HH:mm:ssXXX 
String timeQueryType = "timeQueryType_example"; // String | Specify time you would like to search
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
String reportMimeType = "reportMimeType_example"; // String | Valid Report Format
String reportFrequency = "reportFrequency_example"; // String | Valid Report Frequency
String reportName = "reportName_example"; // String | Valid Report Name
Integer reportDefinitionId = 56; // Integer | Valid Report Definition Id
String reportStatus = "reportStatus_example"; // String | Valid Report Status
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
 **startTime** | **DateTime**| Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX  |
 **endTime** | **DateTime**| Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX  |
 **timeQueryType** | **String**| Specify time you would like to search | [enum: reportTimeFrame, executedTime]
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]
 **reportMimeType** | **String**| Valid Report Format | [optional] [enum: application/xml, text/csv]
 **reportFrequency** | **String**| Valid Report Frequency | [optional] [enum: DAILY, WEEKLY, MONTHLY, ADHOC]
 **reportName** | **String**| Valid Report Name | [optional]
 **reportDefinitionId** | **Integer**| Valid Report Definition Id | [optional]
 **reportStatus** | **String**| Valid Report Status | [optional] [enum: COMPLETED, PENDING, QUEUED, RUNNING, ERROR, NO_DATA]

### Return type

[**ReportingV3ReportsGet200Response**](ReportingV3ReportsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

