# MerchantDefinedFieldsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMerchantDefinedFieldDefinition**](MerchantDefinedFieldsApi.md#createMerchantDefinedFieldDefinition) | **POST** /invoicing/v2/{referenceType}/merchantDefinedFields | Create merchant defined field for a given reference type
[**createPblMerchantDefinedFieldDefinition**](MerchantDefinedFieldsApi.md#createPblMerchantDefinedFieldDefinition) | **POST** /ipl/v2/{referenceType}/merchantDefinedFields | Create a PayByLink merchant defined field for a given reference type
[**deleteMerchantDefinedFieldsDefinitions**](MerchantDefinedFieldsApi.md#deleteMerchantDefinedFieldsDefinitions) | **DELETE** /invoicing/v2/{referenceType}/merchantDefinedFields/{id} | Delete a MerchantDefinedField by ID
[**deletePblMerchantDefinedFieldsDefinitions**](MerchantDefinedFieldsApi.md#deletePblMerchantDefinedFieldsDefinitions) | **DELETE** /ipl/v2/{referenceType}/merchantDefinedFields/{id} | Delete a PayByLink MerchantDefinedField by ID
[**getMerchantDefinedFieldsDefinitions**](MerchantDefinedFieldsApi.md#getMerchantDefinedFieldsDefinitions) | **GET** /invoicing/v2/{referenceType}/merchantDefinedFields | Get all merchant defined fields for a given reference type
[**getPblMerchantDefinedFieldsDefinitions**](MerchantDefinedFieldsApi.md#getPblMerchantDefinedFieldsDefinitions) | **GET** /ipl/v2/{referenceType}/merchantDefinedFields | Get all PayByLink merchant defined fields for a given reference type
[**putMerchantDefinedFieldsDefinitions**](MerchantDefinedFieldsApi.md#putMerchantDefinedFieldsDefinitions) | **PUT** /invoicing/v2/{referenceType}/merchantDefinedFields/{id} | Update a MerchantDefinedField by ID
[**putPblMerchantDefinedFieldsDefinitions**](MerchantDefinedFieldsApi.md#putPblMerchantDefinedFieldsDefinitions) | **PUT** /ipl/v2/{referenceType}/merchantDefinedFields/{id} | Update a PayByLink MerchantDefinedField by ID


<a name="createMerchantDefinedFieldDefinition"></a>
# **createMerchantDefinedFieldDefinition**
> List&lt;InlineResponse2004&gt; createMerchantDefinedFieldDefinition(referenceType, merchantDefinedFieldDefinitionRequest)

Create merchant defined field for a given reference type

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantDefinedFieldsApi;


MerchantDefinedFieldsApi apiInstance = new MerchantDefinedFieldsApi();
String referenceType = "referenceType_example"; // String | The reference type for which merchant defined fields are to be fetched. Available values are Invoice, Purchase, Donation
MerchantDefinedFieldDefinitionRequest merchantDefinedFieldDefinitionRequest = new MerchantDefinedFieldDefinitionRequest(); // MerchantDefinedFieldDefinitionRequest | 
try {
    List<InlineResponse2004> result = apiInstance.createMerchantDefinedFieldDefinition(referenceType, merchantDefinedFieldDefinitionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantDefinedFieldsApi#createMerchantDefinedFieldDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceType** | **String**| The reference type for which merchant defined fields are to be fetched. Available values are Invoice, Purchase, Donation | [enum: Invoice, Purchase, Donation]
 **merchantDefinedFieldDefinitionRequest** | [**MerchantDefinedFieldDefinitionRequest**](MerchantDefinedFieldDefinitionRequest.md)|  |

### Return type

[**List&lt;InlineResponse2004&gt;**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPblMerchantDefinedFieldDefinition"></a>
# **createPblMerchantDefinedFieldDefinition**
> List&lt;InlineResponse2004&gt; createPblMerchantDefinedFieldDefinition(referenceType, merchantDefinedFieldDefinitionRequest)

Create a PayByLink merchant defined field for a given reference type

Creates a merchant defined field for the given reference type (&#x60;Purchase&#x60; or &#x60;Donation&#x60;). The field type is independent of the reference type: both &#x60;Purchase&#x60; and &#x60;Donation&#x60; support both &#x60;Text&#x60; and &#x60;Select&#x60; fields. Set &#x60;fieldType&#x60; to &#x60;Text&#x60; or &#x60;Select&#x60; accordingly. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantDefinedFieldsApi;


MerchantDefinedFieldsApi apiInstance = new MerchantDefinedFieldsApi();
String referenceType = "referenceType_example"; // String | The reference type for which the merchant defined field is to be created. Available values are Purchase and Donation
MerchantDefinedFieldDefinitionRequest1 merchantDefinedFieldDefinitionRequest = new MerchantDefinedFieldDefinitionRequest1(); // MerchantDefinedFieldDefinitionRequest1 | 
try {
    List<InlineResponse2004> result = apiInstance.createPblMerchantDefinedFieldDefinition(referenceType, merchantDefinedFieldDefinitionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantDefinedFieldsApi#createPblMerchantDefinedFieldDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceType** | **String**| The reference type for which the merchant defined field is to be created. Available values are Purchase and Donation | [enum: Purchase, Donation]
 **merchantDefinedFieldDefinitionRequest** | [**MerchantDefinedFieldDefinitionRequest1**](MerchantDefinedFieldDefinitionRequest1.md)|  |

### Return type

[**List&lt;InlineResponse2004&gt;**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMerchantDefinedFieldsDefinitions"></a>
# **deleteMerchantDefinedFieldsDefinitions**
> deleteMerchantDefinedFieldsDefinitions(referenceType, id)

Delete a MerchantDefinedField by ID

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantDefinedFieldsApi;


MerchantDefinedFieldsApi apiInstance = new MerchantDefinedFieldsApi();
String referenceType = "referenceType_example"; // String | 
Long id = 789L; // Long | 
try {
    apiInstance.deleteMerchantDefinedFieldsDefinitions(referenceType, id);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantDefinedFieldsApi#deleteMerchantDefinedFieldsDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceType** | **String**|  | [enum: Invoice, Purchase, Donation]
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="deletePblMerchantDefinedFieldsDefinitions"></a>
# **deletePblMerchantDefinedFieldsDefinitions**
> deletePblMerchantDefinedFieldsDefinitions(referenceType, id)

Delete a PayByLink MerchantDefinedField by ID

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantDefinedFieldsApi;


MerchantDefinedFieldsApi apiInstance = new MerchantDefinedFieldsApi();
String referenceType = "referenceType_example"; // String | 
Long id = 789L; // Long | 
try {
    apiInstance.deletePblMerchantDefinedFieldsDefinitions(referenceType, id);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantDefinedFieldsApi#deletePblMerchantDefinedFieldsDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceType** | **String**|  | [enum: Purchase, Donation]
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getMerchantDefinedFieldsDefinitions"></a>
# **getMerchantDefinedFieldsDefinitions**
> List&lt;InlineResponse2004&gt; getMerchantDefinedFieldsDefinitions(referenceType)

Get all merchant defined fields for a given reference type

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantDefinedFieldsApi;


MerchantDefinedFieldsApi apiInstance = new MerchantDefinedFieldsApi();
String referenceType = "referenceType_example"; // String | The reference type for which merchant defined fields are to be fetched. Available values are Invoice, Purchase, Donation
try {
    List<InlineResponse2004> result = apiInstance.getMerchantDefinedFieldsDefinitions(referenceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantDefinedFieldsApi#getMerchantDefinedFieldsDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceType** | **String**| The reference type for which merchant defined fields are to be fetched. Available values are Invoice, Purchase, Donation | [enum: Invoice, Purchase, Donation]

### Return type

[**List&lt;InlineResponse2004&gt;**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPblMerchantDefinedFieldsDefinitions"></a>
# **getPblMerchantDefinedFieldsDefinitions**
> List&lt;InlineResponse2004&gt; getPblMerchantDefinedFieldsDefinitions(referenceType)

Get all PayByLink merchant defined fields for a given reference type

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantDefinedFieldsApi;


MerchantDefinedFieldsApi apiInstance = new MerchantDefinedFieldsApi();
String referenceType = "referenceType_example"; // String | The reference type for which merchant defined fields are to be fetched. Available values are Purchase, Donation and PayByLink. PayByLink returns the merchant defined fields for both Purchase and Donation combined.
try {
    List<InlineResponse2004> result = apiInstance.getPblMerchantDefinedFieldsDefinitions(referenceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantDefinedFieldsApi#getPblMerchantDefinedFieldsDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceType** | **String**| The reference type for which merchant defined fields are to be fetched. Available values are Purchase, Donation and PayByLink. PayByLink returns the merchant defined fields for both Purchase and Donation combined. | [enum: Purchase, Donation, PayByLink]

### Return type

[**List&lt;InlineResponse2004&gt;**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMerchantDefinedFieldsDefinitions"></a>
# **putMerchantDefinedFieldsDefinitions**
> List&lt;InlineResponse2004&gt; putMerchantDefinedFieldsDefinitions(referenceType, id, merchantDefinedFieldCore)

Update a MerchantDefinedField by ID

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantDefinedFieldsApi;


MerchantDefinedFieldsApi apiInstance = new MerchantDefinedFieldsApi();
String referenceType = "referenceType_example"; // String | 
Long id = 789L; // Long | 
MerchantDefinedFieldCore merchantDefinedFieldCore = new MerchantDefinedFieldCore(); // MerchantDefinedFieldCore | 
try {
    List<InlineResponse2004> result = apiInstance.putMerchantDefinedFieldsDefinitions(referenceType, id, merchantDefinedFieldCore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantDefinedFieldsApi#putMerchantDefinedFieldsDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceType** | **String**|  | [enum: Invoice, Purchase, Donation]
 **id** | **Long**|  |
 **merchantDefinedFieldCore** | [**MerchantDefinedFieldCore**](MerchantDefinedFieldCore.md)|  |

### Return type

[**List&lt;InlineResponse2004&gt;**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="putPblMerchantDefinedFieldsDefinitions"></a>
# **putPblMerchantDefinedFieldsDefinitions**
> List&lt;InlineResponse2004&gt; putPblMerchantDefinedFieldsDefinitions(referenceType, id, merchantDefinedFieldCore)

Update a PayByLink MerchantDefinedField by ID

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantDefinedFieldsApi;


MerchantDefinedFieldsApi apiInstance = new MerchantDefinedFieldsApi();
String referenceType = "referenceType_example"; // String | 
Long id = 789L; // Long | 
MerchantDefinedFieldCore1 merchantDefinedFieldCore = new MerchantDefinedFieldCore1(); // MerchantDefinedFieldCore1 | 
try {
    List<InlineResponse2004> result = apiInstance.putPblMerchantDefinedFieldsDefinitions(referenceType, id, merchantDefinedFieldCore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantDefinedFieldsApi#putPblMerchantDefinedFieldsDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceType** | **String**|  | [enum: Purchase, Donation]
 **id** | **Long**|  |
 **merchantDefinedFieldCore** | [**MerchantDefinedFieldCore1**](MerchantDefinedFieldCore1.md)|  |

### Return type

[**List&lt;InlineResponse2004&gt;**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

