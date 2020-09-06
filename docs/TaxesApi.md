# TaxesApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateTax**](TaxesApi.md#calculateTax) | **POST** /vas/v2/tax | Calculate Taxes
[**voidTax**](TaxesApi.md#voidTax) | **PATCH** /vas/v2/tax/{id} | Void Taxes


<a name="calculateTax"></a>
# **calculateTax**
> VasV2PaymentsPost201Response calculateTax(taxRequest)

Calculate Taxes

Get tax details for a transaction. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TaxesApi;


TaxesApi apiInstance = new TaxesApi();
TaxRequest taxRequest = new TaxRequest(); // TaxRequest | 
try {
    VasV2PaymentsPost201Response result = apiInstance.calculateTax(taxRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#calculateTax");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRequest** | [**TaxRequest**](TaxRequest.md)|  |

### Return type

[**VasV2PaymentsPost201Response**](VasV2PaymentsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="voidTax"></a>
# **voidTax**
> VasV2TaxVoid200Response voidTax(voidTaxRequest, id)

Void Taxes

Pass the Tax Request ID in the PATCH request to void the committed tax calculation.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TaxesApi;


TaxesApi apiInstance = new TaxesApi();
VoidTaxRequest voidTaxRequest = new VoidTaxRequest(); // VoidTaxRequest | 
String id = "id_example"; // String | The tax ID returned from a previous request.
try {
    VasV2TaxVoid200Response result = apiInstance.voidTax(voidTaxRequest, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#voidTax");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voidTaxRequest** | [**VoidTaxRequest**](VoidTaxRequest.md)|  |
 **id** | **String**| The tax ID returned from a previous request. |

### Return type

[**VasV2TaxVoid200Response**](VasV2TaxVoid200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

