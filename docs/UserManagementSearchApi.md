# UserManagementSearchApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchUsers**](UserManagementSearchApi.md#searchUsers) | **POST** /ums/v1/users/search | Search User Information


<a name="searchUsers"></a>
# **searchUsers**
> UmsV1UsersGet200Response searchUsers(searchRequest)

Search User Information

This endpoint is to get all the user information depending on the filter criteria passed in request body.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.UserManagementSearchApi;


UserManagementSearchApi apiInstance = new UserManagementSearchApi();
SearchRequest searchRequest = new SearchRequest(); // SearchRequest | 
try {
    UmsV1UsersGet200Response result = apiInstance.searchUsers(searchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementSearchApi#searchUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchRequest** | [**SearchRequest**](SearchRequest.md)|  |

### Return type

[**UmsV1UsersGet200Response**](UmsV1UsersGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json;charset=utf-8

