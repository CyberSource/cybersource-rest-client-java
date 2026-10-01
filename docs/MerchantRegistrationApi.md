# MerchantRegistrationApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateMerchantKey**](MerchantRegistrationApi.md#activateMerchantKey) | **POST** /icc/v1/merchants/{merchantId}/keys/{keyId}/activate | Activate a merchant key
[**addMerchantKey**](MerchantRegistrationApi.md#addMerchantKey) | **POST** /icc/v1/merchants/{merchantId}/keys | Add a key to a merchant
[**getMerchant**](MerchantRegistrationApi.md#getMerchant) | **GET** /icc/v1/merchants/{merchantId} | Get a merchant
[**getMerchantKey**](MerchantRegistrationApi.md#getMerchantKey) | **GET** /icc/v1/merchants/{merchantId}/keys/{keyId} | Get a key by merchant and key ID
[**listMerchantKeys**](MerchantRegistrationApi.md#listMerchantKeys) | **GET** /icc/v1/merchants/{merchantId}/keys | List keys for a merchant
[**registerMerchant**](MerchantRegistrationApi.md#registerMerchant) | **POST** /icc/v1/merchants | Register a merchant
[**updateMerchant**](MerchantRegistrationApi.md#updateMerchant) | **PUT** /icc/v1/merchants/{merchantId} | Update a merchant
[**updateMerchantKey**](MerchantRegistrationApi.md#updateMerchantKey) | **PUT** /icc/v1/merchants/{merchantId}/keys/{keyId} | Update a merchant key


<a name="activateMerchantKey"></a>
# **activateMerchantKey**
> ActivateMerchantKeyResponse200 activateMerchantKey(merchantId, keyId)

Activate a merchant key

**Activate a Merchant Key**&lt;br&gt;Activates a deactivated encryption key for the specified merchant.&lt;br&gt;&lt;br&gt; **Note:** Expired keys must be renewed via &#x60;PUT /merchants/{merchantId}/keys/{keyId}&#x60; before they can be activated.&lt;br&gt; Returns **403** if the merchant is deactivated or the key is expired, **404** if the merchant or key is not found, **409** if the key is already active. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantRegistrationApi;


MerchantRegistrationApi apiInstance = new MerchantRegistrationApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
String keyId = "keyId_example"; // String | Unique key identifier (UUID)
try {
    ActivateMerchantKeyResponse200 result = apiInstance.activateMerchantKey(merchantId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantRegistrationApi#activateMerchantKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **String**| Unique merchant identifier (UUID) |
 **keyId** | **String**| Unique key identifier (UUID) |

### Return type

[**ActivateMerchantKeyResponse200**](ActivateMerchantKeyResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="addMerchantKey"></a>
# **addMerchantKey**
> ActivateMerchantKeyResponse200 addMerchantKey(merchantId, keyRequest)

Add a key to a merchant

**Add a Key to a Merchant**&lt;br&gt;Adds a new encryption key for the specified merchant. The new key is created as ***active*** immediately.&lt;br&gt;&lt;br&gt; **Note:** Adding a new key automatically deactivates all previously active keys for this merchant (single-active key invariant).&lt;br&gt; Returns **403** if the merchant is deactivated, **404** if the merchant is not found. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantRegistrationApi;


MerchantRegistrationApi apiInstance = new MerchantRegistrationApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
KeyRequest1 keyRequest = new KeyRequest1(); // KeyRequest1 | Key creation request
try {
    ActivateMerchantKeyResponse200 result = apiInstance.addMerchantKey(merchantId, keyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantRegistrationApi#addMerchantKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **String**| Unique merchant identifier (UUID) |
 **keyRequest** | [**KeyRequest1**](KeyRequest1.md)| Key creation request |

### Return type

[**ActivateMerchantKeyResponse200**](ActivateMerchantKeyResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getMerchant"></a>
# **getMerchant**
> MerchantRegistrationResponse201 getMerchant(merchantId)

Get a merchant

**Get a Merchant**&lt;br&gt;Retrieves a single merchant by its unique identifier, including all associated encryption keys.&lt;br&gt;&lt;br&gt; Returns **404** if the merchant is not found. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantRegistrationApi;


MerchantRegistrationApi apiInstance = new MerchantRegistrationApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
try {
    MerchantRegistrationResponse201 result = apiInstance.getMerchant(merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantRegistrationApi#getMerchant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **String**| Unique merchant identifier (UUID) |

### Return type

[**MerchantRegistrationResponse201**](MerchantRegistrationResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getMerchantKey"></a>
# **getMerchantKey**
> ActivateMerchantKeyResponse200 getMerchantKey(merchantId, keyId)

Get a key by merchant and key ID

**Get a Merchant Key**&lt;br&gt;Retrieves a specific encryption key by merchant ID and key ID.&lt;br&gt;&lt;br&gt; Returns **404** if the merchant or key is not found. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantRegistrationApi;


MerchantRegistrationApi apiInstance = new MerchantRegistrationApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
String keyId = "keyId_example"; // String | Unique key identifier (UUID)
try {
    ActivateMerchantKeyResponse200 result = apiInstance.getMerchantKey(merchantId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantRegistrationApi#getMerchantKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **String**| Unique merchant identifier (UUID) |
 **keyId** | **String**| Unique key identifier (UUID) |

### Return type

[**ActivateMerchantKeyResponse200**](ActivateMerchantKeyResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="listMerchantKeys"></a>
# **listMerchantKeys**
> ListMerchantKeysResponse200 listMerchantKeys(merchantId, status)

List keys for a merchant

**List Keys for a Merchant**&lt;br&gt;Returns all encryption keys associated with the specified merchant, with optional filtering by key status.&lt;br&gt;&lt;br&gt; Returns **404** if the merchant is not found. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantRegistrationApi;


MerchantRegistrationApi apiInstance = new MerchantRegistrationApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
String status = "status_example"; // String | Filter by key status: 'active', 'deactivated', or 'expired'. Omit to return all keys.
try {
    ListMerchantKeysResponse200 result = apiInstance.listMerchantKeys(merchantId, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantRegistrationApi#listMerchantKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **String**| Unique merchant identifier (UUID) |
 **status** | **String**| Filter by key status: &#39;active&#39;, &#39;deactivated&#39;, or &#39;expired&#39;. Omit to return all keys. | [optional] [enum: active, deactivated, expired]

### Return type

[**ListMerchantKeysResponse200**](ListMerchantKeysResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="registerMerchant"></a>
# **registerMerchant**
> MerchantRegistrationResponse201 registerMerchant(merchantRequest)

Register a merchant

**Register a Merchant**&lt;br&gt;Onboards a new merchant into the Visa Merchant Registry Service (VMRS). The merchant declares how payment credentials should be delivered: cryptogram type (TAVV or DAVV), transaction indicator (TAP — Trusted Agent Protocol, ACG — Agentic Checkout Gateway, or BOTH), and whether credentials should be encrypted.&lt;br&gt;&lt;br&gt; If &#x60;paymentPayloadType&#x60; is set to ***ENCRYPTED***, an &#x60;encryptionKey&#x60; must be provided.&lt;br&gt; Returns **409** if a merchant with the same &#x60;merchantUrl&#x60; or &#x60;vmid&#x60; already exists. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantRegistrationApi;


MerchantRegistrationApi apiInstance = new MerchantRegistrationApi();
MerchantRequest merchantRequest = new MerchantRequest(); // MerchantRequest | Merchant registration request
try {
    MerchantRegistrationResponse201 result = apiInstance.registerMerchant(merchantRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantRegistrationApi#registerMerchant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantRequest** | [**MerchantRequest**](MerchantRequest.md)| Merchant registration request |

### Return type

[**MerchantRegistrationResponse201**](MerchantRegistrationResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="updateMerchant"></a>
# **updateMerchant**
> MerchantRegistrationResponse201 updateMerchant(merchantId, merchantUpdate)

Update a merchant

**Update a Merchant**&lt;br&gt;Updates merchant configuration. The following fields can be modified: &#x60;merchantName&#x60;, &#x60;merchantUrl&#x60;, &#x60;cryptogramType&#x60;, &#x60;paymentPayloadType&#x60;, &#x60;acceptanceRelationships&#x60;, &#x60;protocolInteractions&#x60;, &#x60;webIntegrations&#x60;, and &#x60;apiIntegrations&#x60;.&lt;br&gt;&lt;br&gt; Partial updates are supported — only provided fields are changed. The &#x60;vmid&#x60; and &#x60;indicator&#x60; fields cannot be updated via this endpoint.&lt;br&gt; Returns **400** if switching to ***ENCRYPTED*** without an active encryption key, **403** if the merchant is deactivated, **404** if not found, **409** if the new &#x60;merchantUrl&#x60; already exists. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantRegistrationApi;


MerchantRegistrationApi apiInstance = new MerchantRegistrationApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
MerchantUpdate merchantUpdate = new MerchantUpdate(); // MerchantUpdate | Merchant update request
try {
    MerchantRegistrationResponse201 result = apiInstance.updateMerchant(merchantId, merchantUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantRegistrationApi#updateMerchant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **String**| Unique merchant identifier (UUID) |
 **merchantUpdate** | [**MerchantUpdate**](MerchantUpdate.md)| Merchant update request |

### Return type

[**MerchantRegistrationResponse201**](MerchantRegistrationResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="updateMerchantKey"></a>
# **updateMerchantKey**
> ActivateMerchantKeyResponse200 updateMerchantKey(merchantId, keyId, keyUpdate)

Update a merchant key

**Update a Merchant Key**&lt;br&gt;Updates encryption key information. The following fields can be modified: &#x60;keyName&#x60;, &#x60;encryptionKey&#x60;, &#x60;algorithm&#x60;, &#x60;encryptionType&#x60;, and &#x60;expirationDate&#x60;.&lt;br&gt;&lt;br&gt; Returns **403** if the merchant is deactivated, key is deactivated, or key is expired, **404** if the merchant or key is not found, **409** if the new &#x60;keyName&#x60; already exists. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantRegistrationApi;


MerchantRegistrationApi apiInstance = new MerchantRegistrationApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
String keyId = "keyId_example"; // String | Unique key identifier (UUID)
KeyUpdate1 keyUpdate = new KeyUpdate1(); // KeyUpdate1 | Key update request
try {
    ActivateMerchantKeyResponse200 result = apiInstance.updateMerchantKey(merchantId, keyId, keyUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantRegistrationApi#updateMerchantKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **String**| Unique merchant identifier (UUID) |
 **keyId** | **String**| Unique key identifier (UUID) |
 **keyUpdate** | [**KeyUpdate1**](KeyUpdate1.md)| Key update request |

### Return type

[**ActivateMerchantKeyResponse200**](ActivateMerchantKeyResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

