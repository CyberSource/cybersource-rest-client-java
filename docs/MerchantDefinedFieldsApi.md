# MerchantDefinedFieldsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMerchantDefinedFieldDefinition**](MerchantDefinedFieldsApi.md#createMerchantDefinedFieldDefinition) | **POST** /invoicing/v2/{referenceType}/merchantDefinedFields | Create merchant defined field for a given reference type
[**deleteMerchantDefinedFieldsDefinitions**](MerchantDefinedFieldsApi.md#deleteMerchantDefinedFieldsDefinitions) | **DELETE** /invoicing/v2/{referenceType}/merchantDefinedFields/{id} | Delete a MerchantDefinedField by ID
[**getMerchantDefinedFieldsDefinitions**](MerchantDefinedFieldsApi.md#getMerchantDefinedFieldsDefinitions) | **GET** /invoicing/v2/{referenceType}/merchantDefinedFields | Get all merchant defined fields for a given reference type
[**putMerchantDefinedFieldsDefinitions**](MerchantDefinedFieldsApi.md#putMerchantDefinedFieldsDefinitions) | **PUT** /invoicing/v2/{referenceType}/merchantDefinedFields/{id} | Update a MerchantDefinedField by ID


<a name="createMerchantDefinedFieldDefinition"></a>
# **createMerchantDefinedFieldDefinition**
> List&lt;InlineResponse2003&gt; createMerchantDefinedFieldDefinition(referenceType, merchantDefinedFieldDefinitionRequest)

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
    List<InlineResponse2003> result = apiInstance.createMerchantDefinedFieldDefinition(referenceType, merchantDefinedFieldDefinitionRequest);
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

[**List&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

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

<a name="getMerchantDefinedFieldsDefinitions"></a>
# **getMerchantDefinedFieldsDefinitions**
> List&lt;InlineResponse2003&gt; getMerchantDefinedFieldsDefinitions(referenceType)

Get all merchant defined fields for a given reference type

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantDefinedFieldsApi;


MerchantDefinedFieldsApi apiInstance = new MerchantDefinedFieldsApi();
String referenceType = "referenceType_example"; // String | The reference type for which merchant defined fields are to be fetched. Available values are Invoice, Purchase, Donation
try {
    List<InlineResponse2003> result = apiInstance.getMerchantDefinedFieldsDefinitions(referenceType);
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

[**List&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMerchantDefinedFieldsDefinitions"></a>
# **putMerchantDefinedFieldsDefinitions**
> List&lt;InlineResponse2003&gt; putMerchantDefinedFieldsDefinitions(referenceType, id, merchantDefinedFieldCore)

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
    List<InlineResponse2003> result = apiInstance.putMerchantDefinedFieldsDefinitions(referenceType, id, merchantDefinedFieldCore);
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

[**List&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

