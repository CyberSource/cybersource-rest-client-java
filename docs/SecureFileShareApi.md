# SecureFileShareApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFile**](SecureFileShareApi.md#getFile) | **GET** /sfs/v1/files/{fileId} | Download a File with File Identifier
[**getFileDetail**](SecureFileShareApi.md#getFileDetail) | **GET** /sfs/v1/file-details | Get List of Files


<a name="getFile"></a>
# **getFile**
> getFile(fileId, organizationId)

Download a File with File Identifier

Download a file for the given file identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SecureFileShareApi;


SecureFileShareApi apiInstance = new SecureFileShareApi();
String fileId = "fileId_example"; // String | Unique identifier for each file
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
try {
    apiInstance.getFile(fileId, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling SecureFileShareApi#getFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| Unique identifier for each file |
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/xml, text/csv, application/pdf

<a name="getFileDetail"></a>
# **getFileDetail**
> V1FileDetailsGet200Response getFileDetail(startDate, endDate, organizationId, name)

Get List of Files

Get list of files and it&#39;s information of them available inside the report directory

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SecureFileShareApi;


SecureFileShareApi apiInstance = new SecureFileShareApi();
LocalDate startDate = new LocalDate(); // LocalDate | Valid start date in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd 
LocalDate endDate = new LocalDate(); // LocalDate | Valid end date in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd 
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
String name = "name_example"; // String | **Tailored to searches for specific files with in given Date range** example : MyTransactionDetailreport.xml 
try {
    V1FileDetailsGet200Response result = apiInstance.getFileDetail(startDate, endDate, organizationId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecureFileShareApi#getFileDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **LocalDate**| Valid start date in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd  |
 **endDate** | **LocalDate**| Valid end date in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd  |
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]
 **name** | **String**| **Tailored to searches for specific files with in given Date range** example : MyTransactionDetailreport.xml  | [optional]

### Return type

[**V1FileDetailsGet200Response**](V1FileDetailsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

