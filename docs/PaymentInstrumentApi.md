# PaymentInstrumentApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePaymentInstrument**](PaymentInstrumentApi.md#deletePaymentInstrument) | **DELETE** /tms/v1/paymentinstruments/{paymentInstrumentTokenId} | Delete a Payment Instrument
[**getPaymentInstrument**](PaymentInstrumentApi.md#getPaymentInstrument) | **GET** /tms/v1/paymentinstruments/{paymentInstrumentTokenId} | Retrieve a Payment Instrument
[**patchPaymentInstrument**](PaymentInstrumentApi.md#patchPaymentInstrument) | **PATCH** /tms/v1/paymentinstruments/{paymentInstrumentTokenId} | Update a Payment Instrument
[**postPaymentInstrument**](PaymentInstrumentApi.md#postPaymentInstrument) | **POST** /tms/v1/paymentinstruments | Create a Payment Instrument


<a name="deletePaymentInstrument"></a>
# **deletePaymentInstrument**
> deletePaymentInstrument(paymentInstrumentTokenId, profileId)

Delete a Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String paymentInstrumentTokenId = "paymentInstrumentTokenId_example"; // String | The TokenId of a payment instrument.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    apiInstance.deletePaymentInstrument(paymentInstrumentTokenId, profileId);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentInstrumentApi#deletePaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentInstrumentTokenId** | **String**| The TokenId of a payment instrument. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getPaymentInstrument"></a>
# **getPaymentInstrument**
> Tmsv2customersEmbeddedDefaultPaymentInstrument getPaymentInstrument(paymentInstrumentTokenId, profileId)

Retrieve a Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String paymentInstrumentTokenId = "paymentInstrumentTokenId_example"; // String | The TokenId of a payment instrument.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    Tmsv2customersEmbeddedDefaultPaymentInstrument result = apiInstance.getPaymentInstrument(paymentInstrumentTokenId, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentInstrumentApi#getPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentInstrumentTokenId** | **String**| The TokenId of a payment instrument. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**Tmsv2customersEmbeddedDefaultPaymentInstrument**](Tmsv2customersEmbeddedDefaultPaymentInstrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchPaymentInstrument"></a>
# **patchPaymentInstrument**
> Tmsv2customersEmbeddedDefaultPaymentInstrument patchPaymentInstrument(paymentInstrumentTokenId, patchPaymentInstrumentRequest, profileId, ifMatch)

Update a Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String paymentInstrumentTokenId = "paymentInstrumentTokenId_example"; // String | The TokenId of a payment instrument.
PatchPaymentInstrumentRequest patchPaymentInstrumentRequest = new PatchPaymentInstrumentRequest(); // PatchPaymentInstrumentRequest | 
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String ifMatch = "ifMatch_example"; // String | Contains an ETag value from a GET request to make the request conditional.
try {
    Tmsv2customersEmbeddedDefaultPaymentInstrument result = apiInstance.patchPaymentInstrument(paymentInstrumentTokenId, patchPaymentInstrumentRequest, profileId, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentInstrumentApi#patchPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentInstrumentTokenId** | **String**| The TokenId of a payment instrument. |
 **patchPaymentInstrumentRequest** | [**PatchPaymentInstrumentRequest**](PatchPaymentInstrumentRequest.md)|  |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]
 **ifMatch** | **String**| Contains an ETag value from a GET request to make the request conditional. | [optional]

### Return type

[**Tmsv2customersEmbeddedDefaultPaymentInstrument**](Tmsv2customersEmbeddedDefaultPaymentInstrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postPaymentInstrument"></a>
# **postPaymentInstrument**
> Tmsv2customersEmbeddedDefaultPaymentInstrument postPaymentInstrument(postPaymentInstrumentRequest, profileId)

Create a Payment Instrument

Include an existing TMS Instrument Identifier id in the request body. * An Instrument Identifier token can be created by calling: **POST *_/tms/v1/instrumentidentifiers*** 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
PostPaymentInstrumentRequest postPaymentInstrumentRequest = new PostPaymentInstrumentRequest(); // PostPaymentInstrumentRequest | 
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    Tmsv2customersEmbeddedDefaultPaymentInstrument result = apiInstance.postPaymentInstrument(postPaymentInstrumentRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentInstrumentApi#postPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postPaymentInstrumentRequest** | [**PostPaymentInstrumentRequest**](PostPaymentInstrumentRequest.md)|  |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**Tmsv2customersEmbeddedDefaultPaymentInstrument**](Tmsv2customersEmbeddedDefaultPaymentInstrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

