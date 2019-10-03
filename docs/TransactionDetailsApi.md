# TransactionDetailsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransaction**](TransactionDetailsApi.md#getTransaction) | **GET** /tss/v2/transactions/{id} | Retrieve a Transaction


<a name="getTransaction"></a>
# **getTransaction**
> TssV2TransactionsGet200Response getTransaction(id)

Retrieve a Transaction

Include the Request ID in the GET request to retrieve the transaction details.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TransactionDetailsApi;


TransactionDetailsApi apiInstance = new TransactionDetailsApi();
String id = "id_example"; // String | Request ID. 
try {
    TssV2TransactionsGet200Response result = apiInstance.getTransaction(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionDetailsApi#getTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Request ID.  |

### Return type

[**TssV2TransactionsGet200Response**](TssV2TransactionsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

