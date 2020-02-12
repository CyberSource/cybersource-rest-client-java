# ReportDownloadsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadReport**](ReportDownloadsApi.md#downloadReport) | **GET** /reporting/v3/report-downloads | Download a Report


<a name="downloadReport"></a>
# **downloadReport**
> downloadReport(reportDate, reportName, organizationId, reportTime)

Download a Report

Download a report using the unique report name and date. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportDownloadsApi;


ReportDownloadsApi apiInstance = new ReportDownloadsApi();
LocalDate reportDate = new LocalDate(); // LocalDate | Valid date on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd 
String reportName = "reportName_example"; // String | Name of the report to download
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
String reportTime = "reportTime_example"; // String | Valid time on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Time Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example time format:**   - hh:mm:ss±hh:mm 
try {
    apiInstance.downloadReport(reportDate, reportName, organizationId, reportTime);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportDownloadsApi#downloadReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportDate** | **LocalDate**| Valid date on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd  |
 **reportName** | **String**| Name of the report to download |
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]
 **reportTime** | **String**| Valid time on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Time Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example time format:**   - hh:mm:ss±hh:mm  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/xml, text/csv

