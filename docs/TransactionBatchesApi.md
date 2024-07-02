# TransactionBatchesApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactionBatchDetails**](TransactionBatchesApi.md#getTransactionBatchDetails) | **GET** /pts/v1/transaction-batch-details/{id} | Get Transaction Details for a given Batch Id
[**getTransactionBatchId**](TransactionBatchesApi.md#getTransactionBatchId) | **GET** /pts/v1/transaction-batches/{id} | Get Individual Batch File
[**getTransactionBatches**](TransactionBatchesApi.md#getTransactionBatches) | **GET** /pts/v1/transaction-batches | Get a List of Batch Files


<a name="getTransactionBatchDetails"></a>
# **getTransactionBatchDetails**
> getTransactionBatchDetails(id, uploadDate, status)

Get Transaction Details for a given Batch Id

Provides real-time detailed status information about the transactions that you previously uploaded in the Business Center or processed with the Offline Transaction File Submission service. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TransactionBatchesApi;


TransactionBatchesApi apiInstance = new TransactionBatchesApi();
String id = "id_example"; // String | The batch id assigned for the template.
LocalDate uploadDate = LocalDate.now(); // LocalDate | Date in which the original batch file was uploaded. Date must be in ISO-8601 format. Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14) **Example date format:**  - yyyy-MM-dd 
String status = "status_example"; // String | Allows you to filter by rejected response.  Valid values: - Rejected 
try {
    apiInstance.getTransactionBatchDetails(id, uploadDate, status);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionBatchesApi#getTransactionBatchDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The batch id assigned for the template. |
 **uploadDate** | **LocalDate**| Date in which the original batch file was uploaded. Date must be in ISO-8601 format. Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14) **Example date format:**  - yyyy-MM-dd  | [optional]
 **status** | **String**| Allows you to filter by rejected response.  Valid values: - Rejected  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: text/csv, application/xml, text/vnd.cybersource.map-csv

<a name="getTransactionBatchId"></a>
# **getTransactionBatchId**
> PtsV1TransactionBatchesIdGet200Response getTransactionBatchId(id)

Get Individual Batch File

This API provides details like upload date, completion date, transaction count and accepted and rejected transaction count of the individual batch file using the batch id

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TransactionBatchesApi;


TransactionBatchesApi apiInstance = new TransactionBatchesApi();
String id = "id_example"; // String | The batch id assigned for the template.
try {
    PtsV1TransactionBatchesIdGet200Response result = apiInstance.getTransactionBatchId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionBatchesApi#getTransactionBatchId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The batch id assigned for the template. |

### Return type

[**PtsV1TransactionBatchesIdGet200Response**](PtsV1TransactionBatchesIdGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

<a name="getTransactionBatches"></a>
# **getTransactionBatches**
> PtsV1TransactionBatchesGet200Response getTransactionBatches(startTime, endTime)

Get a List of Batch Files

Provide the date and time search range to get a list of Batch Files ready for settlement

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TransactionBatchesApi;


TransactionBatchesApi apiInstance = new TransactionBatchesApi();
DateTime startTime = new DateTime(); // DateTime | Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZZ 
DateTime endTime = new DateTime(); // DateTime | Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZZ 
try {
    PtsV1TransactionBatchesGet200Response result = apiInstance.getTransactionBatches(startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionBatchesApi#getTransactionBatches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **DateTime**| Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  |
 **endTime** | **DateTime**| Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  |

### Return type

[**PtsV1TransactionBatchesGet200Response**](PtsV1TransactionBatchesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

