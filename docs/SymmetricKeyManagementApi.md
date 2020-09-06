# SymmetricKeyManagementApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createV2SharedSecretKeys**](SymmetricKeyManagementApi.md#createV2SharedSecretKeys) | **POST** /kms/v2/keys-sym | Create Shared-Secret Keys
[**deleteBulkSymmetricKeys**](SymmetricKeyManagementApi.md#deleteBulkSymmetricKeys) | **POST** /kms/v2/keys-sym/deletes | Delete one or more Symmetric keys
[**getKeyDetails**](SymmetricKeyManagementApi.md#getKeyDetails) | **GET** /kms/v2/keys-sym/{keyId} | Retrieves shared secret key details


<a name="createV2SharedSecretKeys"></a>
# **createV2SharedSecretKeys**
> InlineResponse201 createV2SharedSecretKeys(createSharedSecretKeysRequest)

Create Shared-Secret Keys

Create one or more Shared-Secret Keys 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SymmetricKeyManagementApi;


SymmetricKeyManagementApi apiInstance = new SymmetricKeyManagementApi();
CreateSharedSecretKeysRequest createSharedSecretKeysRequest = new CreateSharedSecretKeysRequest(); // CreateSharedSecretKeysRequest | 
try {
    InlineResponse201 result = apiInstance.createV2SharedSecretKeys(createSharedSecretKeysRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SymmetricKeyManagementApi#createV2SharedSecretKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSharedSecretKeysRequest** | [**CreateSharedSecretKeysRequest**](CreateSharedSecretKeysRequest.md)|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="deleteBulkSymmetricKeys"></a>
# **deleteBulkSymmetricKeys**
> InlineResponse2001 deleteBulkSymmetricKeys(deleteBulkSymmetricKeysRequest)

Delete one or more Symmetric keys

&#39;Delete one or more Symmetric keys&#39; 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SymmetricKeyManagementApi;


SymmetricKeyManagementApi apiInstance = new SymmetricKeyManagementApi();
DeleteBulkSymmetricKeysRequest deleteBulkSymmetricKeysRequest = new DeleteBulkSymmetricKeysRequest(); // DeleteBulkSymmetricKeysRequest | 
try {
    InlineResponse2001 result = apiInstance.deleteBulkSymmetricKeys(deleteBulkSymmetricKeysRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SymmetricKeyManagementApi#deleteBulkSymmetricKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteBulkSymmetricKeysRequest** | [**DeleteBulkSymmetricKeysRequest**](DeleteBulkSymmetricKeysRequest.md)|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getKeyDetails"></a>
# **getKeyDetails**
> InlineResponse200 getKeyDetails(keyId)

Retrieves shared secret key details

Retrieves keys details by providing the key id.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SymmetricKeyManagementApi;


SymmetricKeyManagementApi apiInstance = new SymmetricKeyManagementApi();
String keyId = "keyId_example"; // String | Key ID. 
try {
    InlineResponse200 result = apiInstance.getKeyDetails(keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SymmetricKeyManagementApi#getKeyDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **String**| Key ID.  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

