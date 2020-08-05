# AsymmetricKeyManagementApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createP12Keys**](AsymmetricKeyManagementApi.md#createP12Keys) | **POST** /kms/v2/keys-asym | Create one or more PKCS#12 keys
[**deleteBulkP12Keys**](AsymmetricKeyManagementApi.md#deleteBulkP12Keys) | **POST** /kms/v2/keys-asym/deletes | Delete one or more PKCS#12 keys
[**getP12KeyDetails**](AsymmetricKeyManagementApi.md#getP12KeyDetails) | **GET** /kms/v2/keys-asym/{keyId} | Retrieves PKCS#12 key details


<a name="createP12Keys"></a>
# **createP12Keys**
> InlineResponse2011 createP12Keys(createP12KeysRequest)

Create one or more PKCS#12 keys

&#39;Create one or more PKCS#12 keys&#39; 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AsymmetricKeyManagementApi;


AsymmetricKeyManagementApi apiInstance = new AsymmetricKeyManagementApi();
CreateP12KeysRequest createP12KeysRequest = new CreateP12KeysRequest(); // CreateP12KeysRequest | 
try {
    InlineResponse2011 result = apiInstance.createP12Keys(createP12KeysRequest);
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

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteBulkP12Keys"></a>
# **deleteBulkP12Keys**
> InlineResponse2003 deleteBulkP12Keys(deleteBulkP12KeysRequest)

Delete one or more PKCS#12 keys

&#39;Delete one or more PKCS#12 keys&#39; 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AsymmetricKeyManagementApi;


AsymmetricKeyManagementApi apiInstance = new AsymmetricKeyManagementApi();
DeleteBulkP12KeysRequest deleteBulkP12KeysRequest = new DeleteBulkP12KeysRequest(); // DeleteBulkP12KeysRequest | 
try {
    InlineResponse2003 result = apiInstance.deleteBulkP12Keys(deleteBulkP12KeysRequest);
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

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getP12KeyDetails"></a>
# **getP12KeyDetails**
> InlineResponse2002 getP12KeyDetails(keyId)

Retrieves PKCS#12 key details

Retrieves keys details by providing the key id.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AsymmetricKeyManagementApi;


AsymmetricKeyManagementApi apiInstance = new AsymmetricKeyManagementApi();
String keyId = "keyId_example"; // String | Key ID. 
try {
    InlineResponse2002 result = apiInstance.getP12KeyDetails(keyId);
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

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

