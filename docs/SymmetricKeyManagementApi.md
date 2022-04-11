# SymmetricKeyManagementApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createV2SharedSecretKeys**](SymmetricKeyManagementApi.md#createV2SharedSecretKeys) | **POST** /kms/v2/keys-sym | Create Shared-Secret Keys
[**createV2SharedSecretKeysVerifi**](SymmetricKeyManagementApi.md#createV2SharedSecretKeysVerifi) | **POST** /kms/v2/keys-sym/verifi | Create Shared-Secret Keys as per verifi spec
[**deleteBulkSymmetricKeys**](SymmetricKeyManagementApi.md#deleteBulkSymmetricKeys) | **POST** /kms/v2/keys-sym/deletes | Delete one or more Symmetric keys
[**getKeyDetails**](SymmetricKeyManagementApi.md#getKeyDetails) | **GET** /kms/v2/keys-sym/{keyId} | Retrieves shared secret key details


<a name="createV2SharedSecretKeys"></a>
# **createV2SharedSecretKeys**
> KmsV2KeysSymPost201Response createV2SharedSecretKeys(createSharedSecretKeysRequest)

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
    KmsV2KeysSymPost201Response result = apiInstance.createV2SharedSecretKeys(createSharedSecretKeysRequest);
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

[**KmsV2KeysSymPost201Response**](KmsV2KeysSymPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="createV2SharedSecretKeysVerifi"></a>
# **createV2SharedSecretKeysVerifi**
> KmsV2KeysSymPost201Response createV2SharedSecretKeysVerifi(vIcDomain, createSharedSecretKeysRequest)

Create Shared-Secret Keys as per verifi spec

Create one or more Shared-Secret Keys as per Verifi spec with 32 chars, store digest algo during key generation. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SymmetricKeyManagementApi;


SymmetricKeyManagementApi apiInstance = new SymmetricKeyManagementApi();
String vIcDomain = "vIcDomain_example"; // String | domain
CreateSharedSecretKeysRequest1 createSharedSecretKeysRequest = new CreateSharedSecretKeysRequest1(); // CreateSharedSecretKeysRequest1 | 
try {
    KmsV2KeysSymPost201Response result = apiInstance.createV2SharedSecretKeysVerifi(vIcDomain, createSharedSecretKeysRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SymmetricKeyManagementApi#createV2SharedSecretKeysVerifi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vIcDomain** | **String**| domain |
 **createSharedSecretKeysRequest** | [**CreateSharedSecretKeysRequest1**](CreateSharedSecretKeysRequest1.md)|  |

### Return type

[**KmsV2KeysSymPost201Response**](KmsV2KeysSymPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="deleteBulkSymmetricKeys"></a>
# **deleteBulkSymmetricKeys**
> KmsV2KeysSymDeletesPost200Response deleteBulkSymmetricKeys(deleteBulkSymmetricKeysRequest)

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
    KmsV2KeysSymDeletesPost200Response result = apiInstance.deleteBulkSymmetricKeys(deleteBulkSymmetricKeysRequest);
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

[**KmsV2KeysSymDeletesPost200Response**](KmsV2KeysSymDeletesPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getKeyDetails"></a>
# **getKeyDetails**
> KmsV2KeysSymGet200Response getKeyDetails(keyId)

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
    KmsV2KeysSymGet200Response result = apiInstance.getKeyDetails(keyId);
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

[**KmsV2KeysSymGet200Response**](KmsV2KeysSymGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

