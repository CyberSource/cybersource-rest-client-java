# TransactionBatchesApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactionBatchDetails**](TransactionBatchesApi.md#getTransactionBatchDetails) | **GET** /pts/v1/transaction-batch-details | Filters batch response. 
[**getTransactionBatchId**](TransactionBatchesApi.md#getTransactionBatchId) | **GET** /pts/v1/transaction-batches/{id} | Get individual batch file
[**getTransactionBatches**](TransactionBatchesApi.md#getTransactionBatches) | **GET** /pts/v1/transaction-batches | Get a list of batch files


<a name="getTransactionBatchDetails"></a>
# **getTransactionBatchDetails**
> getTransactionBatchDetails(transactionBatchId, uploadDate, status)

Filters batch response. 

Filters batch response. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TransactionBatchesApi;


TransactionBatchesApi apiInstance = new TransactionBatchesApi();
String transactionBatchId = "transactionBatchId_example"; // String | Transaction Batch Id, this is unique.
LocalDate uploadDate = new LocalDate(); // LocalDate | Date in which the original batch file was uploaded. Date must be in ISO-8601 format.
String status = "status_example"; // String | Allows you to filter by rejected response. 
try {
    apiInstance.getTransactionBatchDetails(transactionBatchId, uploadDate, status);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionBatchesApi#getTransactionBatchDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionBatchId** | **String**| Transaction Batch Id, this is unique. |
 **uploadDate** | **LocalDate**| Date in which the original batch file was uploaded. Date must be in ISO-8601 format. | [optional]
 **status** | **String**| Allows you to filter by rejected response.  | [optional] [enum: Rejected]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: text/vnd.cybersource.map-csv

<a name="getTransactionBatchId"></a>
# **getTransactionBatchId**
> getTransactionBatchId(id)

Get individual batch file

Provide the search range

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TransactionBatchesApi;


TransactionBatchesApi apiInstance = new TransactionBatchesApi();
String id = "id_example"; // String | The batch id assigned for the template.
try {
    apiInstance.getTransactionBatchId(id);
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

<a name="getTransactionBatches"></a>
# **getTransactionBatches**
> PtsV1TransactionBatchesGet200Response getTransactionBatches(startTime, endTime)

Get a list of batch files

Provide the search range

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TransactionBatchesApi;


TransactionBatchesApi apiInstance = new TransactionBatchesApi();
DateTime startTime = new DateTime(); // DateTime | Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZZ 
DateTime endTime = new DateTime(); // DateTime | Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZZ 
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
 **startTime** | **DateTime**| Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  |
 **endTime** | **DateTime**| Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  |

### Return type

[**PtsV1TransactionBatchesGet200Response**](PtsV1TransactionBatchesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

