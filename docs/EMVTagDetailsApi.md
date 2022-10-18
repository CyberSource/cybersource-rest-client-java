# EMVTagDetailsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEmvTags**](EMVTagDetailsApi.md#getEmvTags) | **GET** /tss/v2/transactions/emvTagDetails | Retrieve the EMV Dictionary
[**parseEmvTags**](EMVTagDetailsApi.md#parseEmvTags) | **POST** /tss/v2/transactions/emvTagDetails | Parse an EMV String


<a name="getEmvTags"></a>
# **getEmvTags**
> TssV2GetEmvTags200Response getEmvTags()

Retrieve the EMV Dictionary

Returns the entire EMV tag dictionary

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.EMVTagDetailsApi;


EMVTagDetailsApi apiInstance = new EMVTagDetailsApi();
try {
    TssV2GetEmvTags200Response result = apiInstance.getEmvTags();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EMVTagDetailsApi#getEmvTags");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TssV2GetEmvTags200Response**](TssV2GetEmvTags200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="parseEmvTags"></a>
# **parseEmvTags**
> TssV2PostEmvTags200Response parseEmvTags(body)

Parse an EMV String

Pass an EMV Tag-Length-Value (TLV) string for parsing.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.EMVTagDetailsApi;


EMVTagDetailsApi apiInstance = new EMVTagDetailsApi();
Body body = new Body(); // Body | 
try {
    TssV2PostEmvTags200Response result = apiInstance.parseEmvTags(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EMVTagDetailsApi#parseEmvTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)|  |

### Return type

[**TssV2PostEmvTags200Response**](TssV2PostEmvTags200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

