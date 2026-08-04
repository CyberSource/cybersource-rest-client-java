# MerchantCapabilitiesApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateMerchantKey**](MerchantCapabilitiesApi.md#activateMerchantKey) | **POST** /icc/v1/merchants/{merchantId}/keys/{keyId}/activate | Activate a merchant key
[**addMerchantKey**](MerchantCapabilitiesApi.md#addMerchantKey) | **POST** /icc/v1/merchants/{merchantId}/keys | Add a key to a merchant
[**deactivateMerchantKey**](MerchantCapabilitiesApi.md#deactivateMerchantKey) | **DELETE** /icc/v1/merchants/{merchantId}/keys/{keyId} | Deactivate a merchant key
[**getAllProducts**](MerchantCapabilitiesApi.md#getAllProducts) | **GET** /icc/v1/products | Get All Products
[**getMerchant**](MerchantCapabilitiesApi.md#getMerchant) | **GET** /icc/v1/merchants/{merchantId} | Get a merchant
[**getMerchantKey**](MerchantCapabilitiesApi.md#getMerchantKey) | **GET** /icc/v1/merchants/{merchantId}/keys/{keyId} | Get a key by merchant and key ID
[**getProduct**](MerchantCapabilitiesApi.md#getProduct) | **GET** /icc/v1/products/{product_id} | Get Product by ID
[**ingestProductFeedJson**](MerchantCapabilitiesApi.md#ingestProductFeedJson) | **POST** /icc/v1/products/feed | Ingest Product Feed
[**listMerchantKeys**](MerchantCapabilitiesApi.md#listMerchantKeys) | **GET** /icc/v1/merchants/{merchantId}/keys | List keys for a merchant
[**registerMerchant**](MerchantCapabilitiesApi.md#registerMerchant) | **POST** /icc/v1/merchants | Register a merchant
[**updateMerchant**](MerchantCapabilitiesApi.md#updateMerchant) | **PUT** /icc/v1/merchants/{merchantId} | Update a merchant
[**updateMerchantKey**](MerchantCapabilitiesApi.md#updateMerchantKey) | **PUT** /icc/v1/merchants/{merchantId}/keys/{keyId} | Update a merchant key


<a name="activateMerchantKey"></a>
# **activateMerchantKey**
> ActivateMerchantKeyResponse200 activateMerchantKey(merchantId, keyId)

Activate a merchant key

Activate a deactivated key. Raises 403 if merchant is deactivated, 404 if merchant or key not found, 409 if key is already active.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantCapabilitiesApi;


MerchantCapabilitiesApi apiInstance = new MerchantCapabilitiesApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
String keyId = "keyId_example"; // String | Unique key identifier (UUID)
try {
    ActivateMerchantKeyResponse200 result = apiInstance.activateMerchantKey(merchantId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantCapabilitiesApi#activateMerchantKey");
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

Add a new encryption key for a merchant. Raises 401 if not authenticated, 403 if caller does not own the merchant, 404 if merchant not found.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantCapabilitiesApi;


MerchantCapabilitiesApi apiInstance = new MerchantCapabilitiesApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
KeyRequest1 keyRequest = new KeyRequest1(); // KeyRequest1 | Key creation request
try {
    ActivateMerchantKeyResponse200 result = apiInstance.addMerchantKey(merchantId, keyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantCapabilitiesApi#addMerchantKey");
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

<a name="deactivateMerchantKey"></a>
# **deactivateMerchantKey**
> DeactivateMerchantKeyResponse200 deactivateMerchantKey(merchantId, keyId)

Deactivate a merchant key

Deactivate a key (soft delete). Raises 401 if not authenticated, 403 if caller does not own the merchant, 404 if key not found.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantCapabilitiesApi;


MerchantCapabilitiesApi apiInstance = new MerchantCapabilitiesApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
String keyId = "keyId_example"; // String | Unique key identifier (UUID)
try {
    DeactivateMerchantKeyResponse200 result = apiInstance.deactivateMerchantKey(merchantId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantCapabilitiesApi#deactivateMerchantKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **String**| Unique merchant identifier (UUID) |
 **keyId** | **String**| Unique key identifier (UUID) |

### Return type

[**DeactivateMerchantKeyResponse200**](DeactivateMerchantKeyResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getAllProducts"></a>
# **getAllProducts**
> InlineResponse20020 getAllProducts(getAllProductsRequest, page, size)

Get All Products

Returns the full product catalog stored in ACG.  **Note:** This endpoint is intended for catalog verification and merchant tooling. It is not a real-time product discovery API for end buyers. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantCapabilitiesApi;


MerchantCapabilitiesApi apiInstance = new MerchantCapabilitiesApi();
Object getAllProductsRequest = null; // Object | Empty request body.
Integer page = 0; // Integer | Page number to retrieve (0-based). Defaults to 0.
Integer size = 300; // Integer | Number of products per page. Defaults to 300. Server enforces a maximum of 1000; values above 1000 are capped. 
try {
    InlineResponse20020 result = apiInstance.getAllProducts(getAllProductsRequest, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantCapabilitiesApi#getAllProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getAllProductsRequest** | **Object**| Empty request body. |
 **page** | **Integer**| Page number to retrieve (0-based). Defaults to 0. | [optional] [default to 0]
 **size** | **Integer**| Number of products per page. Defaults to 300. Server enforces a maximum of 1000; values above 1000 are capped.  | [optional] [default to 300]

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getMerchant"></a>
# **getMerchant**
> MerchantRegistrationResponse201 getMerchant(merchantId)

Get a merchant

Get merchant by ID with all associated keys. Raises 404 if merchant not found.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantCapabilitiesApi;


MerchantCapabilitiesApi apiInstance = new MerchantCapabilitiesApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
try {
    MerchantRegistrationResponse201 result = apiInstance.getMerchant(merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantCapabilitiesApi#getMerchant");
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

Get a specific key by merchant ID and key ID. Raises 401 if not authenticated, 404 if key not found.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantCapabilitiesApi;


MerchantCapabilitiesApi apiInstance = new MerchantCapabilitiesApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
String keyId = "keyId_example"; // String | Unique key identifier (UUID)
try {
    ActivateMerchantKeyResponse200 result = apiInstance.getMerchantKey(merchantId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantCapabilitiesApi#getMerchantKey");
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

<a name="getProduct"></a>
# **getProduct**
> InlineResponse20021 getProduct(productId, getProductRequest)

Get Product by ID

Retrieves a single product from the ACG catalog by its unique product identifier (SKU).  Use this to verify that a product was ingested correctly, inspect its current field values, or check its syndication-eligibility flags (&#x60;is_eligible_search&#x60;, &#x60;is_eligible_checkout&#x60;). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantCapabilitiesApi;


MerchantCapabilitiesApi apiInstance = new MerchantCapabilitiesApi();
String productId = "productId_example"; // String | The unique product identifier (SKU) assigned by the merchant and provided during feed ingestion. Example: `SKU-1001`. 
Object getProductRequest = null; // Object | Empty request body.
try {
    InlineResponse20021 result = apiInstance.getProduct(productId, getProductRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantCapabilitiesApi#getProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The unique product identifier (SKU) assigned by the merchant and provided during feed ingestion. Example: &#x60;SKU-1001&#x60;.  |
 **getProductRequest** | **Object**| Empty request body. |

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="ingestProductFeedJson"></a>
# **ingestProductFeedJson**
> InlineResponse20019 ingestProductFeedJson(productFeedRequest)

Ingest Product Feed

Uploads a merchant product catalog to ACG and triggers asynchronous syndication to all configured protocol backends (e.g. Google Merchant Center).  **Processing pipeline:** 1. Each product is validated against UCP/ACP schema requirements (required fields, format rules) 2. Valid products are saved to the ACG catalog 3. An async syndication job is triggered to push the catalog to configured backends 4. A &#x60;feed_id&#x60; is returned — use this with the Syndication Status endpoint to monitor progress  **Supported content types:** &#x60;application/json&#x60; (this endpoint). CSV and JSONL uploads are also supported via file upload endpoints.  **Partial success:** If some products fail validation, the response status is &#x60;PARTIAL_SUCCESS&#x60; and the &#x60;errors&#x60; array lists the per-product validation failures. Successfully validated products are still ingested and syndicated. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantCapabilitiesApi;


MerchantCapabilitiesApi apiInstance = new MerchantCapabilitiesApi();
ProductFeedRequest productFeedRequest = new ProductFeedRequest(); // ProductFeedRequest | Product feed payload. The `products` array is required and must contain at least one product. See `ProductInput` for the full list of required fields. 
try {
    InlineResponse20019 result = apiInstance.ingestProductFeedJson(productFeedRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantCapabilitiesApi#ingestProductFeedJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productFeedRequest** | [**ProductFeedRequest**](ProductFeedRequest.md)| Product feed payload. The &#x60;products&#x60; array is required and must contain at least one product. See &#x60;ProductInput&#x60; for the full list of required fields.  |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="listMerchantKeys"></a>
# **listMerchantKeys**
> ListMerchantKeysResponse200 listMerchantKeys(merchantId, status)

List keys for a merchant

List all keys for a specific merchant with optional filtering by status. Raises 404 if merchant not found.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantCapabilitiesApi;


MerchantCapabilitiesApi apiInstance = new MerchantCapabilitiesApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
String status = "status_example"; // String | Filter by key status: 'active', 'deactivated', or 'expired'. Omit to return all keys.
try {
    ListMerchantKeysResponse200 result = apiInstance.listMerchantKeys(merchantId, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantCapabilitiesApi#listMerchantKeys");
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

Onboard a new merchant into the VMRS. The merchant declares how they want payment data delivered: cryptogram type (TAVV or DAVV), transaction indicator (TAP, ACG, or Both), whether credentials should be encrypted, and their public encryption key if encryption is enabled. Raises 409 if merchantUrl or vmid already exists.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantCapabilitiesApi;


MerchantCapabilitiesApi apiInstance = new MerchantCapabilitiesApi();
MerchantRequest merchantRequest = new MerchantRequest(); // MerchantRequest | Merchant registration request
try {
    MerchantRegistrationResponse201 result = apiInstance.registerMerchant(merchantRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantCapabilitiesApi#registerMerchant");
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

Update merchant configuration. Updatable fields: merchantName, merchantUrl, cryptogramType, acceptanceRelationships, protocolInteractions, webIntegrations, apiIntegrations. Partial updates are supported — only provided fields are changed. The vmid, indicator, and paymentPayloadType fields are not updatable here; use the enable/disable-payment-encryption endpoints for encryption changes. Raises 404 if merchant not found, 403 if merchant is deactivated, 409 if new merchantUrl already exists.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantCapabilitiesApi;


MerchantCapabilitiesApi apiInstance = new MerchantCapabilitiesApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
MerchantUpdate merchantUpdate = new MerchantUpdate(); // MerchantUpdate | Merchant update request
try {
    MerchantRegistrationResponse201 result = apiInstance.updateMerchant(merchantId, merchantUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantCapabilitiesApi#updateMerchant");
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

Update key information. Updatable fields are keyName, encryptionKey, algorithm, encryptionType, and expirationDate. Raises 401 if not authenticated, 403 if caller does not own the merchant or if merchant/key is deactivated, 404 if merchant or key not found, 409 if new keyName already exists.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantCapabilitiesApi;


MerchantCapabilitiesApi apiInstance = new MerchantCapabilitiesApi();
String merchantId = "merchantId_example"; // String | Unique merchant identifier (UUID)
String keyId = "keyId_example"; // String | Unique key identifier (UUID)
KeyUpdate1 keyUpdate = new KeyUpdate1(); // KeyUpdate1 | Key update request
try {
    ActivateMerchantKeyResponse200 result = apiInstance.updateMerchantKey(merchantId, keyId, keyUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantCapabilitiesApi#updateMerchantKey");
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

