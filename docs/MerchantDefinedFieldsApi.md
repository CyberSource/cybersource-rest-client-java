# MerchantDefinedFieldsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMerchantDefinedFieldDefinition**](MerchantDefinedFieldsApi.md#createMerchantDefinedFieldDefinition) | **POST** /invoicing/v2/{referenceType}/merchantDefinedFields | Create merchant defined field for a given reference type
[**getMerchantDefinedFieldsDefinitions**](MerchantDefinedFieldsApi.md#getMerchantDefinedFieldsDefinitions) | **GET** /invoicing/v2/{referenceType}/merchantDefinedFields | Get all merchant defined fields for a given reference type
[**invoicingV2ReferenceTypeMerchantDefinedFieldsIdDelete**](MerchantDefinedFieldsApi.md#invoicingV2ReferenceTypeMerchantDefinedFieldsIdDelete) | **DELETE** /invoicing/v2/{referenceType}/merchantDefinedFields/{id} | Delete a MerchantDefinedField by ID
[**invoicingV2ReferenceTypeMerchantDefinedFieldsIdPut**](MerchantDefinedFieldsApi.md#invoicingV2ReferenceTypeMerchantDefinedFieldsIdPut) | **PUT** /invoicing/v2/{referenceType}/merchantDefinedFields/{id} | Update a MerchantDefinedField by ID


<a name="createMerchantDefinedFieldDefinition"></a>
# **createMerchantDefinedFieldDefinition**
> List&lt;InlineResponse2002&gt; createMerchantDefinedFieldDefinition(referenceType, merchantDefinedFieldDefinitionRequest)

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
    List<InlineResponse2002> result = apiInstance.createMerchantDefinedFieldDefinition(referenceType, merchantDefinedFieldDefinitionRequest);
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

[**List&lt;InlineResponse2002&gt;**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMerchantDefinedFieldsDefinitions"></a>
# **getMerchantDefinedFieldsDefinitions**
> List&lt;InlineResponse2002&gt; getMerchantDefinedFieldsDefinitions(referenceType)

Get all merchant defined fields for a given reference type

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantDefinedFieldsApi;


MerchantDefinedFieldsApi apiInstance = new MerchantDefinedFieldsApi();
String referenceType = "referenceType_example"; // String | The reference type for which merchant defined fields are to be fetched. Available values are Invoice, Purchase, Donation
try {
    List<InlineResponse2002> result = apiInstance.getMerchantDefinedFieldsDefinitions(referenceType);
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

[**List&lt;InlineResponse2002&gt;**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invoicingV2ReferenceTypeMerchantDefinedFieldsIdDelete"></a>
# **invoicingV2ReferenceTypeMerchantDefinedFieldsIdDelete**
> invoicingV2ReferenceTypeMerchantDefinedFieldsIdDelete(referenceType, id)

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
    apiInstance.invoicingV2ReferenceTypeMerchantDefinedFieldsIdDelete(referenceType, id);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantDefinedFieldsApi#invoicingV2ReferenceTypeMerchantDefinedFieldsIdDelete");
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

<a name="invoicingV2ReferenceTypeMerchantDefinedFieldsIdPut"></a>
# **invoicingV2ReferenceTypeMerchantDefinedFieldsIdPut**
> List&lt;InlineResponse2002&gt; invoicingV2ReferenceTypeMerchantDefinedFieldsIdPut(referenceType, id, merchantDefinedFieldCore)

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
    List<InlineResponse2002> result = apiInstance.invoicingV2ReferenceTypeMerchantDefinedFieldsIdPut(referenceType, id, merchantDefinedFieldCore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantDefinedFieldsApi#invoicingV2ReferenceTypeMerchantDefinedFieldsIdPut");
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

[**List&lt;InlineResponse2002&gt;**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

