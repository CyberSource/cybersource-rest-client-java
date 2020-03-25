# ReportDownloadsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadReport**](ReportDownloadsApi.md#downloadReport) | **GET** /reporting/v3/report-downloads | Download a Report


<a name="downloadReport"></a>
# **downloadReport**
> downloadReport(reportDate, reportName, organizationId)

Download a Report

Download a report using the unique report name and date. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportDownloadsApi;


ReportDownloadsApi apiInstance = new ReportDownloadsApi();
LocalDate reportDate = new LocalDate(); // LocalDate | Valid date on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**  yyyy-mm-dd For reports that span multiple days, this value would be the end date of the report in the time zone of the report subscription. Example 1: If your report start date is 2020-03-06 and the end date is 2020-03-09, the reportDate passed in the query is 2020-03-09. Example 2: If your report runs from midnight to midnight on 2020-03-09, the reportDate passed in the query is 2020-03-10 
String reportName = "reportName_example"; // String | Name of the report to download
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
try {
    apiInstance.downloadReport(reportDate, reportName, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportDownloadsApi#downloadReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportDate** | **LocalDate**| Valid date on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**  yyyy-mm-dd For reports that span multiple days, this value would be the end date of the report in the time zone of the report subscription. Example 1: If your report start date is 2020-03-06 and the end date is 2020-03-09, the reportDate passed in the query is 2020-03-09. Example 2: If your report runs from midnight to midnight on 2020-03-09, the reportDate passed in the query is 2020-03-10  |
 **reportName** | **String**| Name of the report to download |
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/xml, text/csv

