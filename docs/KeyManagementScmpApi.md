# KeyManagementScmpApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateSCMP**](KeyManagementScmpApi.md#updateSCMP) | **PATCH** /kms/v2/keys-scmp/{keyId} | Update or Deactivate


<a name="updateSCMP"></a>
# **updateSCMP**
> Object updateSCMP(keyId, updatePGPKeysRequest)

Update or Deactivate

Update or Deactivate scmp api Key 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.KeyManagementScmpApi;


KeyManagementScmpApi apiInstance = new KeyManagementScmpApi();
String keyId = "keyId_example"; // String | Key ID. 
UpdatePGPKeysRequest1 updatePGPKeysRequest = new UpdatePGPKeysRequest1(); // UpdatePGPKeysRequest1 | 
try {
    Object result = apiInstance.updateSCMP(keyId, updatePGPKeysRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyManagementScmpApi#updateSCMP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **String**| Key ID.  |
 **updatePGPKeysRequest** | [**UpdatePGPKeysRequest1**](UpdatePGPKeysRequest1.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

