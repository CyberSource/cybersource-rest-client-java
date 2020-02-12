# SearchTransactionsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSearch**](SearchTransactionsApi.md#createSearch) | **POST** /tss/v2/searches | Create a Search Request
[**getSearch**](SearchTransactionsApi.md#getSearch) | **GET** /tss/v2/searches/{searchId} | Get Search Results


<a name="createSearch"></a>
# **createSearch**
> TssV2TransactionsPost201Response createSearch(createSearchRequest)

Create a Search Request

Create a search request. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SearchTransactionsApi;


SearchTransactionsApi apiInstance = new SearchTransactionsApi();
CreateSearchRequest createSearchRequest = new CreateSearchRequest(); // CreateSearchRequest | 
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
 **createSearchRequest** | [**CreateSearchRequest**](CreateSearchRequest.md)|  |

### Return type

[**TssV2TransactionsPost201Response**](TssV2TransactionsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getSearch"></a>
# **getSearch**
> TssV2TransactionsPost201Response getSearch(searchId)

Get Search Results

Include the Search ID in the GET request to retrieve the search results.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SearchTransactionsApi;


SearchTransactionsApi apiInstance = new SearchTransactionsApi();
String searchId = "searchId_example"; // String | Search ID.
try {
    TssV2TransactionsPost201Response result = apiInstance.getSearch(searchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchTransactionsApi#getSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchId** | **String**| Search ID. |

### Return type

[**TssV2TransactionsPost201Response**](TssV2TransactionsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: */*

