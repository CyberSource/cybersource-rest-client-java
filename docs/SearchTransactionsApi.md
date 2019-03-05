# SearchTransactionsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSearch**](SearchTransactionsApi.md#createSearch) | **POST** /tss/v2/searches | Create a search request
[**getSearch**](SearchTransactionsApi.md#getSearch) | **GET** /tss/v2/searches/{id} | Get Search results


<a name="createSearch"></a>
# **createSearch**
> TssV2TransactionsPost201Response createSearch(createSearchRequest)

Create a search request

Create a search request. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SearchTransactionsApi;


SearchTransactionsApi apiInstance = new SearchTransactionsApi();
TssV2TransactionsPostResponse createSearchRequest = new TssV2TransactionsPostResponse(); // TssV2TransactionsPostResponse | 
try {
    TssV2TransactionsPost201Response result = apiInstance.createSearch(createSearchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchTransactionsApi#createSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSearchRequest** | [**TssV2TransactionsPostResponse**](TssV2TransactionsPostResponse.md)|  |

### Return type

[**TssV2TransactionsPost201Response**](TssV2TransactionsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getSearch"></a>
# **getSearch**
> TssV2TransactionsPost201Response getSearch(id)

Get Search results

Include the Search ID in the GET request to retrieve the search results.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SearchTransactionsApi;


SearchTransactionsApi apiInstance = new SearchTransactionsApi();
String id = "id_example"; // String | Search ID.
try {
    TssV2TransactionsPost201Response result = apiInstance.getSearch(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchTransactionsApi#getSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Search ID. |

### Return type

[**TssV2TransactionsPost201Response**](TssV2TransactionsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

