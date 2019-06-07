# UserManagementApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsers**](UserManagementApi.md#getUsers) | **GET** /ums/v1/users | Get user information


<a name="getUsers"></a>
# **getUsers**
> UmsV1UsersGet200Response getUsers(organizationId, userName, permissionId, roleId)

Get user information

This endpoint is to get all the user information depending on the filter criteria passed in the query.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.UserManagementApi;


UserManagementApi apiInstance = new UserManagementApi();
String organizationId = "organizationId_example"; // String | This is the orgId of the organization which the user belongs to.
String userName = "userName_example"; // String | User ID of the user you want to get details on.
String permissionId = "permissionId_example"; // String | permission that you are trying to search user on.
String roleId = "roleId_example"; // String | role of the user you are trying to search on.
try {
    UmsV1UsersGet200Response result = apiInstance.getUsers(organizationId, userName, permissionId, roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| This is the orgId of the organization which the user belongs to. | [optional]
 **userName** | **String**| User ID of the user you want to get details on. | [optional]
 **permissionId** | **String**| permission that you are trying to search user on. | [optional]
 **roleId** | **String**| role of the user you are trying to search on. | [optional]

### Return type

[**UmsV1UsersGet200Response**](UmsV1UsersGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

