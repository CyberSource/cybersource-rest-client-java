# DownloadDTDApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDTDV2**](DownloadDTDApi.md#getDTDV2) | **GET** /dtds/{reportDefinitionNameVersion} | Download DTD for Report


<a name="getDTDV2"></a>
# **getDTDV2**
> getDTDV2(reportDefinitionNameVersion)

Download DTD for Report

Used to download DTDs for reports on no-auth.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.DownloadDTDApi;


DownloadDTDApi apiInstance = new DownloadDTDApi();
String reportDefinitionNameVersion = "reportDefinitionNameVersion_example"; // String | Name and version of DTD file to download. Some DTDs only have one version. In that case version name is not needed. Some example values are ctdr-1.0, tdr, pbdr-1.1
try {
    apiInstance.getDTDV2(reportDefinitionNameVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadDTDApi#getDTDV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportDefinitionNameVersion** | **String**| Name and version of DTD file to download. Some DTDs only have one version. In that case version name is not needed. Some example values are ctdr-1.0, tdr, pbdr-1.1 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/xml-dtd

