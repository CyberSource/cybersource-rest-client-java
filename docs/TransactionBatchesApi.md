# TransactionBatchesApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactionBatchId**](TransactionBatchesApi.md#getTransactionBatchId) | **GET** /pts/v1/transaction-batches/{id} | Get individual batch file
[**getTransactionBatches**](TransactionBatchesApi.md#getTransactionBatches) | **GET** /pts/v1/transaction-batches | Get a list of batch files


<a name="getTransactionBatchId"></a>
# **getTransactionBatchId**
> PtsV1TransactionBatchesIdGet200Response getTransactionBatchId(id)

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

