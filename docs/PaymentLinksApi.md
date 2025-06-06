# PaymentLinksApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentLink**](PaymentLinksApi.md#createPaymentLink) | **POST** /ipl/v2/payment-links | Create a Payment Link
[**getAllPaymentLinks**](PaymentLinksApi.md#getAllPaymentLinks) | **GET** /ipl/v2/payment-links | Get a List of Payment Links
[**getPaymentLink**](PaymentLinksApi.md#getPaymentLink) | **GET** /ipl/v2/payment-links/{id} | Get Payment Link Details
[**updatePaymentLink**](PaymentLinksApi.md#updatePaymentLink) | **PATCH** /ipl/v2/payment-links/{id} | Update a Payment Link


<a name="createPaymentLink"></a>
# **createPaymentLink**
> PblPaymentLinksPost201Response createPaymentLink(createPaymentLinkRequest)

Create a Payment Link

Create a new payment link.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentLinksApi;


PaymentLinksApi apiInstance = new PaymentLinksApi();
CreatePaymentLinkRequest createPaymentLinkRequest = new CreatePaymentLinkRequest(); // CreatePaymentLinkRequest | 
try {
    PblPaymentLinksPost201Response result = apiInstance.createPaymentLink(createPaymentLinkRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentLinksApi#createPaymentLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPaymentLinkRequest** | [**CreatePaymentLinkRequest**](CreatePaymentLinkRequest.md)|  |

### Return type

[**PblPaymentLinksPost201Response**](PblPaymentLinksPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

<a name="getAllPaymentLinks"></a>
# **getAllPaymentLinks**
> PblPaymentLinksAllGet200Response getAllPaymentLinks(offset, limit, status)

Get a List of Payment Links

Provides a (filtered) list of payment links that have been created in your account. You can filter the list based on the following status types:  - ACTIVE  - INACTIVE 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentLinksApi;


PaymentLinksApi apiInstance = new PaymentLinksApi();
Integer offset = 56; // Integer | Page offset number.
Integer limit = 56; // Integer | Maximum number of items you would like returned.   Maximum limit: 1000 
String status = "status_example"; // String | The status of the purchase or donation link.  Possible values:   - ACTIVE   - INACTIVE 
try {
    PblPaymentLinksAllGet200Response result = apiInstance.getAllPaymentLinks(offset, limit, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentLinksApi#getAllPaymentLinks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Page offset number. |
 **limit** | **Integer**| Maximum number of items you would like returned.   Maximum limit: 1000  |
 **status** | **String**| The status of the purchase or donation link.  Possible values:   - ACTIVE   - INACTIVE  | [optional]

### Return type

[**PblPaymentLinksAllGet200Response**](PblPaymentLinksAllGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

<a name="getPaymentLink"></a>
# **getPaymentLink**
> PblPaymentLinksGet200Response getPaymentLink(id)

Get Payment Link Details

You can retrieve details of a specific payment link. For each payment transaction you can use the Transaction Details API to get more details on the payment transaction.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentLinksApi;


PaymentLinksApi apiInstance = new PaymentLinksApi();
String id = "id_example"; // String | The purchase number.
try {
    PblPaymentLinksGet200Response result = apiInstance.getPaymentLink(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentLinksApi#getPaymentLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The purchase number. |

### Return type

[**PblPaymentLinksGet200Response**](PblPaymentLinksGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

<a name="updatePaymentLink"></a>
# **updatePaymentLink**
> PblPaymentLinksPost201Response updatePaymentLink(id, updatePaymentLinkRequest)

Update a Payment Link

You can update all information except the payment link number until any payment is received for a payment link.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentLinksApi;


PaymentLinksApi apiInstance = new PaymentLinksApi();
String id = "id_example"; // String | The purchase number.
UpdatePaymentLinkRequest updatePaymentLinkRequest = new UpdatePaymentLinkRequest(); // UpdatePaymentLinkRequest | Updating the purchase or donation link does not resend the link automatically. You must resend the purchase or donation link separately.
try {
    PblPaymentLinksPost201Response result = apiInstance.updatePaymentLink(id, updatePaymentLinkRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentLinksApi#updatePaymentLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The purchase number. |
 **updatePaymentLinkRequest** | [**UpdatePaymentLinkRequest**](UpdatePaymentLinkRequest.md)| Updating the purchase or donation link does not resend the link automatically. You must resend the purchase or donation link separately. |

### Return type

[**PblPaymentLinksPost201Response**](PblPaymentLinksPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

