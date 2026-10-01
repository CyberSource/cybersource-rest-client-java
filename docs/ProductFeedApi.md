# ProductFeedApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllProducts**](ProductFeedApi.md#getAllProducts) | **GET** /icc/v1/products | Get All Products
[**getFeedJobStatus**](ProductFeedApi.md#getFeedJobStatus) | **GET** /icc/v1/products/feed/bulk/{jobId} | Get Feed Job Status
[**getProduct**](ProductFeedApi.md#getProduct) | **GET** /icc/v1/products/{product_id} | Get Product by ID
[**submitProductFeedJson**](ProductFeedApi.md#submitProductFeedJson) | **POST** /icc/v1/products/feed | Ingest Product Feed


<a name="getAllProducts"></a>
# **getAllProducts**
> InlineResponse20020 getAllProducts(getAllProductsRequest, page, size)

Get All Products

Returns the full product catalog stored in ACG.  **Note:** This endpoint is intended for catalog verification and merchant tooling. It is not a real-time product discovery API for end buyers. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ProductFeedApi;


ProductFeedApi apiInstance = new ProductFeedApi();
Object getAllProductsRequest = null; // Object | Empty request body.
Integer page = 0; // Integer | Page number to retrieve (0-based). Defaults to 0.
Integer size = 300; // Integer | Number of products per page. Defaults to 300. Server enforces a maximum of 1000; values above 1000 are capped. 
try {
    InlineResponse20020 result = apiInstance.getAllProducts(getAllProductsRequest, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductFeedApi#getAllProducts");
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

<a name="getFeedJobStatus"></a>
# **getFeedJobStatus**
> InlineResponse20019 getFeedJobStatus(jobId, getFeedJobStatusRequest)

Get Feed Job Status

Returns the processing and syndication status of a previously submitted product feed job.  Use this to poll the &#x60;jobId&#x60; returned by the Ingest Product Feed endpoint until processing and syndication complete. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ProductFeedApi;


ProductFeedApi apiInstance = new ProductFeedApi();
UUID jobId = new UUID(); // UUID | Unique identifier of the feed submission job, returned by the Ingest Product Feed endpoint. 
Object getFeedJobStatusRequest = null; // Object | Empty request body.
try {
    InlineResponse20019 result = apiInstance.getFeedJobStatus(jobId, getFeedJobStatusRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductFeedApi#getFeedJobStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | [**UUID**](.md)| Unique identifier of the feed submission job, returned by the Ingest Product Feed endpoint.  |
 **getFeedJobStatusRequest** | **Object**| Empty request body. |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

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
//import Api.ProductFeedApi;


ProductFeedApi apiInstance = new ProductFeedApi();
String productId = "productId_example"; // String | The unique product identifier (SKU) assigned by the merchant and provided during feed ingestion. Example: `SKU-1001`. 
Object getProductRequest = null; // Object | Empty request body.
try {
    InlineResponse20021 result = apiInstance.getProduct(productId, getProductRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductFeedApi#getProduct");
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

<a name="submitProductFeedJson"></a>
# **submitProductFeedJson**
> InlineResponse2021 submitProductFeedJson(productFeedRequest)

Ingest Product Feed

Submits a merchant product catalog to ACG for asynchronous processing and syndication to all configured protocol backends (e.g. Google Merchant Center).  **Processing pipeline:** 1. The request is accepted immediately and a &#x60;jobId&#x60; is returned — validation, ingestion,    and syndication all happen asynchronously in the background. 2. Each product is validated against UCP/ACP schema requirements (required fields, format rules) 3. Valid products are saved to the ACG catalog 4. An async syndication job is triggered to push the catalog to configured backends  **Supported content types:** &#x60;application/json&#x60; (this endpoint). CSV and JSONL uploads are also supported via file upload endpoints.  **Note:** This endpoint no longer returns per-product validation results or syndication outcomes synchronously — only the &#x60;jobId&#x60; acknowledgement shown below. Use that &#x60;jobId&#x60; to track processing and syndication status. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ProductFeedApi;


ProductFeedApi apiInstance = new ProductFeedApi();
ProductFeedRequest productFeedRequest = new ProductFeedRequest(); // ProductFeedRequest | Product feed payload. The `products` array is required and must contain at least one product. See `ProductInput` for the full list of required fields. 
try {
    InlineResponse2021 result = apiInstance.submitProductFeedJson(productFeedRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductFeedApi#submitProductFeedJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productFeedRequest** | [**ProductFeedRequest**](ProductFeedRequest.md)| Product feed payload. The &#x60;products&#x60; array is required and must contain at least one product. See &#x60;ProductInput&#x60; for the full list of required fields.  |

### Return type

[**InlineResponse2021**](InlineResponse2021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

