# KeyManagementPasswordApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updatePassword**](KeyManagementPasswordApi.md#updatePassword) | **PATCH** /kms/v2/keys-password/{keyId} | Activate or De-activate Password


<a name="updatePassword"></a>
# **updatePassword**
> Object updatePassword(keyId, updatePasswordKeysRequest)

Activate or De-activate Password

Activate or De-activate key of type password 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.KeyManagementPasswordApi;


KeyManagementPasswordApi apiInstance = new KeyManagementPasswordApi();
String keyId = "keyId_example"; // String | Key ID. 
UpdatePasswordKeysRequest updatePasswordKeysRequest = new UpdatePasswordKeysRequest(); // UpdatePasswordKeysRequest | 
try {
    Object result = apiInstance.updatePassword(keyId, updatePasswordKeysRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyManagementPasswordApi#updatePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **String**| Key ID.  |
 **updatePasswordKeysRequest** | [**UpdatePasswordKeysRequest**](UpdatePasswordKeysRequest.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

