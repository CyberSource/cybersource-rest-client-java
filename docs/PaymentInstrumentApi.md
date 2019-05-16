# PaymentInstrumentApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentInstrument**](PaymentInstrumentApi.md#createPaymentInstrument) | **POST** /tms/v1/paymentinstruments | Create a Payment Instrument
[**deletePaymentInstrument**](PaymentInstrumentApi.md#deletePaymentInstrument) | **DELETE** /tms/v1/paymentinstruments/{tokenId} | Delete a Payment Instrument
[**getPaymentInstrument**](PaymentInstrumentApi.md#getPaymentInstrument) | **GET** /tms/v1/paymentinstruments/{tokenId} | Retrieve a Payment Instrument
[**updatePaymentInstrument**](PaymentInstrumentApi.md#updatePaymentInstrument) | **PATCH** /tms/v1/paymentinstruments/{tokenId} | Update a Payment Instrument


<a name="createPaymentInstrument"></a>
# **createPaymentInstrument**
> TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments createPaymentInstrument(profileId, createPaymentInstrumentRequest)

Create a Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
CreatePaymentInstrumentRequest createPaymentInstrumentRequest = new CreatePaymentInstrumentRequest(); // CreatePaymentInstrumentRequest | Specify the customer's payment details for card or bank account.
try {
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments result = apiInstance.createPaymentInstrument(profileId, createPaymentInstrumentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentInstrumentApi#createPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **createPaymentInstrumentRequest** | [**CreatePaymentInstrumentRequest**](CreatePaymentInstrumentRequest.md)| Specify the customer&#39;s payment details for card or bank account. |

### Return type

[**TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments**](TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deletePaymentInstrument"></a>
# **deletePaymentInstrument**
> deletePaymentInstrument(profileId, tokenId)

Delete a Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String tokenId = "tokenId_example"; // String | The TokenId of a Payment Instrument.
try {
    apiInstance.deletePaymentInstrument(profileId, tokenId);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentInstrumentApi#deletePaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **tokenId** | **String**| The TokenId of a Payment Instrument. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getPaymentInstrument"></a>
# **getPaymentInstrument**
> TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments getPaymentInstrument(profileId, tokenId)

Retrieve a Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String tokenId = "tokenId_example"; // String | The TokenId of a Payment Instrument.
try {
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments result = apiInstance.getPaymentInstrument(profileId, tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentInstrumentApi#getPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **tokenId** | **String**| The TokenId of a Payment Instrument. |

### Return type

[**TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments**](TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updatePaymentInstrument"></a>
# **updatePaymentInstrument**
> TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments updatePaymentInstrument(profileId, tokenId, updatePaymentInstrumentRequest)

Update a Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String tokenId = "tokenId_example"; // String | The TokenId of a Payment Instrument.
UpdatePaymentInstrumentRequest updatePaymentInstrumentRequest = new UpdatePaymentInstrumentRequest(); // UpdatePaymentInstrumentRequest | Specify the customer's payment details.
try {
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments result = apiInstance.updatePaymentInstrument(profileId, tokenId, updatePaymentInstrumentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentInstrumentApi#updatePaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **tokenId** | **String**| The TokenId of a Payment Instrument. |
 **updatePaymentInstrumentRequest** | [**UpdatePaymentInstrumentRequest**](UpdatePaymentInstrumentRequest.md)| Specify the customer&#39;s payment details. |

### Return type

[**TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments**](TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedPaymentInstruments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

