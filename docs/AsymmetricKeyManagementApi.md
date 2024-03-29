# AsymmetricKeyManagementApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createP12Keys**](AsymmetricKeyManagementApi.md#createP12Keys) | **POST** /kms/v2/keys-asym | Create one or more PKCS12 keys
[**deleteBulkP12Keys**](AsymmetricKeyManagementApi.md#deleteBulkP12Keys) | **POST** /kms/v2/keys-asym/deletes | Delete one or more PKCS12 keys
[**getP12KeyDetails**](AsymmetricKeyManagementApi.md#getP12KeyDetails) | **GET** /kms/v2/keys-asym/{keyId} | Retrieves PKCS12 key details
[**updateAsymKey**](AsymmetricKeyManagementApi.md#updateAsymKey) | **PATCH** /kms/v2/keys-asym/{keyId} | Activate or De-activate Asymmetric Key


<a name="createP12Keys"></a>
# **createP12Keys**
> KmsV2KeysAsymPost201Response createP12Keys(createP12KeysRequest)

Create one or more PKCS12 keys

&#39;Create one or more PKCS12 keys&#39; 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AsymmetricKeyManagementApi;


AsymmetricKeyManagementApi apiInstance = new AsymmetricKeyManagementApi();
CreateP12KeysRequest createP12KeysRequest = new CreateP12KeysRequest(); // CreateP12KeysRequest | 
try {
    KmsV2KeysAsymPost201Response result = apiInstance.createP12Keys(createP12KeysRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsymmetricKeyManagementApi#createP12Keys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createP12KeysRequest** | [**CreateP12KeysRequest**](CreateP12KeysRequest.md)|  |

### Return type

[**KmsV2KeysAsymPost201Response**](KmsV2KeysAsymPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="deleteBulkP12Keys"></a>
# **deleteBulkP12Keys**
> KmsV2KeysAsymDeletesPost200Response deleteBulkP12Keys(deleteBulkP12KeysRequest)

Delete one or more PKCS12 keys

&#39;Delete one or more PKCS12 keys&#39; 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AsymmetricKeyManagementApi;


AsymmetricKeyManagementApi apiInstance = new AsymmetricKeyManagementApi();
DeleteBulkP12KeysRequest deleteBulkP12KeysRequest = new DeleteBulkP12KeysRequest(); // DeleteBulkP12KeysRequest | 
try {
    KmsV2KeysAsymDeletesPost200Response result = apiInstance.deleteBulkP12Keys(deleteBulkP12KeysRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsymmetricKeyManagementApi#deleteBulkP12Keys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteBulkP12KeysRequest** | [**DeleteBulkP12KeysRequest**](DeleteBulkP12KeysRequest.md)|  |

### Return type

[**KmsV2KeysAsymDeletesPost200Response**](KmsV2KeysAsymDeletesPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getP12KeyDetails"></a>
# **getP12KeyDetails**
> KmsV2KeysAsymGet200Response getP12KeyDetails(keyId)

Retrieves PKCS12 key details

Retrieves keys details by providing the key id.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AsymmetricKeyManagementApi;


AsymmetricKeyManagementApi apiInstance = new AsymmetricKeyManagementApi();
String keyId = "keyId_example"; // String | Key ID. 
try {
    KmsV2KeysAsymGet200Response result = apiInstance.getP12KeyDetails(keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsymmetricKeyManagementApi#getP12KeyDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **String**| Key ID.  |

### Return type

[**KmsV2KeysAsymGet200Response**](KmsV2KeysAsymGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="updateAsymKey"></a>
# **updateAsymKey**
> Object updateAsymKey(keyId, updateAsymKeysRequest)

Activate or De-activate Asymmetric Key

Activate or De-activate Asymmetric Key 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AsymmetricKeyManagementApi;


AsymmetricKeyManagementApi apiInstance = new AsymmetricKeyManagementApi();
String keyId = "keyId_example"; // String | Key ID. 
UpdateAsymKeysRequest updateAsymKeysRequest = new UpdateAsymKeysRequest(); // UpdateAsymKeysRequest | 
try {
    Object result = apiInstance.updateAsymKey(keyId, updateAsymKeysRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsymmetricKeyManagementApi#updateAsymKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **String**| Key ID.  |
 **updateAsymKeysRequest** | [**UpdateAsymKeysRequest**](UpdateAsymKeysRequest.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

