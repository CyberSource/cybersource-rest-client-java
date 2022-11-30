# KeyManagementPgpApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updatePGP**](KeyManagementPgpApi.md#updatePGP) | **PATCH** /kms/v2/keys-pgp/{keyId} | Activate or De-activate PGP Key


<a name="updatePGP"></a>
# **updatePGP**
> Object updatePGP(keyId, updatePGPKeysRequest)

Activate or De-activate PGP Key

Activate or De-activate PGP Key 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.KeyManagementPgpApi;


KeyManagementPgpApi apiInstance = new KeyManagementPgpApi();
String keyId = "keyId_example"; // String | Key ID. 
UpdatePGPKeysRequest updatePGPKeysRequest = new UpdatePGPKeysRequest(); // UpdatePGPKeysRequest | 
try {
    Object result = apiInstance.updatePGP(keyId, updatePGPKeysRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyManagementPgpApi#updatePGP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **String**| Key ID.  |
 **updatePGPKeysRequest** | [**UpdatePGPKeysRequest**](UpdatePGPKeysRequest.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

