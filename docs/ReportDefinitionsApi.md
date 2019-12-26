# ReportDefinitionsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResourceInfoByReportDefinition**](ReportDefinitionsApi.md#getResourceInfoByReportDefinition) | **GET** /reporting/v3/report-definitions/{reportDefinitionName} | Get report definition
[**getResourceV2Info**](ReportDefinitionsApi.md#getResourceV2Info) | **GET** /reporting/v3/report-definitions | Get reporting resource information


<a name="getResourceInfoByReportDefinition"></a>
# **getResourceInfoByReportDefinition**
> ReportingV3ReportDefinitionsNameGet200Response getResourceInfoByReportDefinition(reportDefinitionName, subscriptionType, reportMimeType, organizationId)

Get report definition

View the attributes of an individual report type. For a list of values for reportDefinitionName, see the [Reporting Developer Guide](https://www.cybersource.com/developers/documentation/reporting_and_reconciliation/) 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportDefinitionsApi;


ReportDefinitionsApi apiInstance = new ReportDefinitionsApi();
String reportDefinitionName = "reportDefinitionName_example"; // String | Name of the Report definition to retrieve
String subscriptionType = "subscriptionType_example"; // String | The subscription type for which report definition is required. By default the type will be CUSTOM. Valid Values: - CLASSIC - CUSTOM - STANDARD 
String reportMimeType = "reportMimeType_example"; // String | The format for which the report definition is required. By default the value will be CSV. Valid Values: - application/xml - text/csv 
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
try {
    ReportingV3ReportDefinitionsNameGet200Response result = apiInstance.getResourceInfoByReportDefinition(reportDefinitionName, subscriptionType, reportMimeType, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportDefinitionsApi#getResourceInfoByReportDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportDefinitionName** | **String**| Name of the Report definition to retrieve |
 **subscriptionType** | **String**| The subscription type for which report definition is required. By default the type will be CUSTOM. Valid Values: - CLASSIC - CUSTOM - STANDARD  | [optional]
 **reportMimeType** | **String**| The format for which the report definition is required. By default the value will be CSV. Valid Values: - application/xml - text/csv  | [optional]
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]

### Return type

[**ReportingV3ReportDefinitionsNameGet200Response**](ReportingV3ReportDefinitionsNameGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

<a name="getResourceV2Info"></a>
# **getResourceV2Info**
> ReportingV3ReportDefinitionsGet200Response getResourceV2Info(subscriptionType, organizationId)

Get reporting resource information

View a list of supported reports and their attributes before subscribing to them. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportDefinitionsApi;


ReportDefinitionsApi apiInstance = new ReportDefinitionsApi();
String subscriptionType = "subscriptionType_example"; // String | Valid Values: - CLASSIC - CUSTOM - STANDARD 
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
try {
    ReportingV3ReportDefinitionsGet200Response result = apiInstance.getResourceV2Info(subscriptionType, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportDefinitionsApi#getResourceV2Info");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionType** | **String**| Valid Values: - CLASSIC - CUSTOM - STANDARD  | [optional]
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]

### Return type

[**ReportingV3ReportDefinitionsGet200Response**](ReportingV3ReportDefinitionsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

