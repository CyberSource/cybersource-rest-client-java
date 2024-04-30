# BatchesApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchReport**](BatchesApi.md#getBatchReport) | **GET** /accountupdater/v1/batches/{batchId}/report | Retrieve a Batch Report
[**getBatchStatus**](BatchesApi.md#getBatchStatus) | **GET** /accountupdater/v1/batches/{batchId}/status | Retrieve a Batch Status
[**getBatchesList**](BatchesApi.md#getBatchesList) | **GET** /accountupdater/v1/batches | List Batches
[**postBatch**](BatchesApi.md#postBatch) | **POST** /accountupdater/v1/batches | Create a Batch


<a name="getBatchReport"></a>
# **getBatchReport**
> InlineResponse2008 getBatchReport(batchId)

Retrieve a Batch Report

**Get Batch Report**&lt;br&gt;This resource accepts a batch id and returns: - The batch status. - The total number of accepted, rejected, updated records. - The total number of card association responses. - The billable quantities of:   - New Account Numbers (NAN)   - New Expiry Dates (NED)   - Account Closures (ACL)   - Contact Card Holders (CCH) - Source record information including token ids, masked card number, expiration dates &amp; card type. - Response record information including response code, reason, token ids, masked card number, expiration dates &amp; card type. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.BatchesApi;


BatchesApi apiInstance = new BatchesApi();
String batchId = "batchId_example"; // String | Unique identification number assigned to the submitted request.
try {
    InlineResponse2008 result = apiInstance.getBatchReport(batchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchesApi#getBatchReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**| Unique identification number assigned to the submitted request. |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getBatchStatus"></a>
# **getBatchStatus**
> InlineResponse2007 getBatchStatus(batchId)

Retrieve a Batch Status

**Get Batch Status**&lt;br&gt;This resource accepts a batch id and returns: - The batch status. - The total number of accepted, rejected, updated records. - The total number of card association responses. - The billable quantities of:   - New Account Numbers (NAN)   - New Expiry Dates (NED)   - Account Closures (ACL)   - Contact Card Holders (CCH) 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.BatchesApi;


BatchesApi apiInstance = new BatchesApi();
String batchId = "batchId_example"; // String | Unique identification number assigned to the submitted request.
try {
    InlineResponse2007 result = apiInstance.getBatchStatus(batchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchesApi#getBatchStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**| Unique identification number assigned to the submitted request. |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getBatchesList"></a>
# **getBatchesList**
> InlineResponse2006 getBatchesList(offset, limit, fromDate, toDate)

List Batches

**List Batches**&lt;br&gt;This resource accepts a optional date range, record offset and limit, returning a paginated response of batches containing: - The batch id. - The batch status. - The batch created / modified dates. - The total number of accepted, rejected, updated records. - The total number of card association responses. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.BatchesApi;


BatchesApi apiInstance = new BatchesApi();
Long offset = 0L; // Long | Starting record in zero-based dataset that should be returned as the first object in the array.
Long limit = 20L; // Long | The maximum number that can be returned in the array starting from the offset record in zero-based dataset.
String fromDate = "fromDate_example"; // String | ISO-8601 format: yyyyMMddTHHmmssZ
String toDate = "toDate_example"; // String | ISO-8601 format: yyyyMMddTHHmmssZ
try {
    InlineResponse2006 result = apiInstance.getBatchesList(offset, limit, fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchesApi#getBatchesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Long**| Starting record in zero-based dataset that should be returned as the first object in the array. | [optional] [default to 0]
 **limit** | **Long**| The maximum number that can be returned in the array starting from the offset record in zero-based dataset. | [optional] [default to 20]
 **fromDate** | **String**| ISO-8601 format: yyyyMMddTHHmmssZ | [optional]
 **toDate** | **String**| ISO-8601 format: yyyyMMddTHHmmssZ | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postBatch"></a>
# **postBatch**
> InlineResponse202 postBatch(body)

Create a Batch

**Create a Batch**&lt;br&gt;This resource accepts TMS tokens ids of a Customer, Payment Instrument or Instrument Identifier. &lt;br&gt; The card numbers for the supplied tokens ids are then sent to the relevant card associations to check for updates.&lt;br&gt;The following type of batches can be submitted: -  **oneOff** batch containing tokens id for Visa or MasterCard card numbers. - **amexRegistration** batch containing tokens id for Amex card numbers.  A batch id will be returned on a successful response which can be used to get the batch status and the batch report. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.BatchesApi;


BatchesApi apiInstance = new BatchesApi();
Body body = new Body(); // Body | 
try {
    InlineResponse202 result = apiInstance.postBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchesApi#postBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)|  |

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

