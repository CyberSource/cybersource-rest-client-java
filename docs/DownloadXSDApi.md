# DownloadXsdApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getXSDV2**](DownloadXsdApi.md#getXSDV2) | **GET** /reporting/v3/xsds/{reportDefinitionNameVersion} | Download XSD for Report


<a name="getXSDV2"></a>
# **getXSDV2**
> getXSDV2(reportDefinitionNameVersion)

Download XSD for Report

Used to download XSDs for reports on no-auth.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.DownloadXsdApi;


DownloadXsdApi apiInstance = new DownloadXsdApi();
String reportDefinitionNameVersion = "reportDefinitionNameVersion_example"; // String | Name and version of XSD file to download. Some XSDs only have one version. In that case version name is not needed. Some example values are DecisionManagerDetailReport, DecisionManagerTypes
try {
    apiInstance.getXSDV2(reportDefinitionNameVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadXsdApi#getXSDV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportDefinitionNameVersion** | **String**| Name and version of XSD file to download. Some XSDs only have one version. In that case version name is not needed. Some example values are DecisionManagerDetailReport, DecisionManagerTypes |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: text/xml

