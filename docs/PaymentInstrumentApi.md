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
> TmsV1PaymentinstrumentsPatch200Response createPaymentInstrument(profileId, vCMerchantId, vCCorrelationId, createPaymentInstrumentRequest, clientApplication)

Create a Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String vCMerchantId = "vCMerchantId_example"; // String | CyberSource merchant id.
String vCCorrelationId = "vCCorrelationId_example"; // String | The mandatory correlation id passed by upstream (calling) system.
CreatePaymentInstrumentRequest createPaymentInstrumentRequest = new CreatePaymentInstrumentRequest(); // CreatePaymentInstrumentRequest | Specify the customer's payment details for card or bank account.
String clientApplication = "clientApplication_example"; // String | Client application name
try {
    TmsV1PaymentinstrumentsPatch200Response result = apiInstance.createPaymentInstrument(profileId, vCMerchantId, vCCorrelationId, createPaymentInstrumentRequest, clientApplication);
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
 **vCMerchantId** | **String**| CyberSource merchant id. |
 **vCCorrelationId** | **String**| The mandatory correlation id passed by upstream (calling) system. |
 **createPaymentInstrumentRequest** | [**CreatePaymentInstrumentRequest**](CreatePaymentInstrumentRequest.md)| Specify the customer&#39;s payment details for card or bank account. |
 **clientApplication** | **String**| Client application name | [optional]

### Return type

[**TmsV1PaymentinstrumentsPatch200Response**](TmsV1PaymentinstrumentsPatch200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="deletePaymentInstrument"></a>
# **deletePaymentInstrument**
> deletePaymentInstrument(profileId, vCMerchantId, vCCorrelationId, tokenId, clientApplication)

Delete a Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String vCMerchantId = "vCMerchantId_example"; // String | CyberSource merchant id.
String vCCorrelationId = "vCCorrelationId_example"; // String | The mandatory correlation id passed by upstream (calling) system.
String tokenId = "tokenId_example"; // String | The TokenId of a Payment Instrument.
String clientApplication = "clientApplication_example"; // String | Client application name
try {
    apiInstance.deletePaymentInstrument(profileId, vCMerchantId, vCCorrelationId, tokenId, clientApplication);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentInstrumentApi#deletePaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **vCMerchantId** | **String**| CyberSource merchant id. |
 **vCCorrelationId** | **String**| The mandatory correlation id passed by upstream (calling) system. |
 **tokenId** | **String**| The TokenId of a Payment Instrument. |
 **clientApplication** | **String**| Client application name | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="getPaymentInstrument"></a>
# **getPaymentInstrument**
> TmsV1PaymentinstrumentsPatch200Response getPaymentInstrument(profileId, vCMerchantId, vCCorrelationId, tokenId, clientApplication)

Retrieve a Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String vCMerchantId = "vCMerchantId_example"; // String | CyberSource merchant id.
String vCCorrelationId = "vCCorrelationId_example"; // String | The mandatory correlation id passed by upstream (calling) system.
String tokenId = "tokenId_example"; // String | The TokenId of a Payment Instrument.
String clientApplication = "clientApplication_example"; // String | Client application name
try {
    TmsV1PaymentinstrumentsPatch200Response result = apiInstance.getPaymentInstrument(profileId, vCMerchantId, vCCorrelationId, tokenId, clientApplication);
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
 **vCMerchantId** | **String**| CyberSource merchant id. |
 **vCCorrelationId** | **String**| The mandatory correlation id passed by upstream (calling) system. |
 **tokenId** | **String**| The TokenId of a Payment Instrument. |
 **clientApplication** | **String**| Client application name | [optional]

### Return type

[**TmsV1PaymentinstrumentsPatch200Response**](TmsV1PaymentinstrumentsPatch200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="updatePaymentInstrument"></a>
# **updatePaymentInstrument**
> TmsV1PaymentinstrumentsPatch200Response updatePaymentInstrument(profileId, vCMerchantId, vCCorrelationId, tokenId, updatePaymentInstrumentRequest, clientApplication)

Update a Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String vCMerchantId = "vCMerchantId_example"; // String | CyberSource merchant id.
String vCCorrelationId = "vCCorrelationId_example"; // String | The mandatory correlation id passed by upstream (calling) system.
String tokenId = "tokenId_example"; // String | The TokenId of a Payment Instrument.
UpdatePaymentInstrumentRequest updatePaymentInstrumentRequest = new UpdatePaymentInstrumentRequest(); // UpdatePaymentInstrumentRequest | Specify the customer's payment details.
String clientApplication = "clientApplication_example"; // String | Client application name
try {
    TmsV1PaymentinstrumentsPatch200Response result = apiInstance.updatePaymentInstrument(profileId, vCMerchantId, vCCorrelationId, tokenId, updatePaymentInstrumentRequest, clientApplication);
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
 **vCMerchantId** | **String**| CyberSource merchant id. |
 **vCCorrelationId** | **String**| The mandatory correlation id passed by upstream (calling) system. |
 **tokenId** | **String**| The TokenId of a Payment Instrument. |
 **updatePaymentInstrumentRequest** | [**UpdatePaymentInstrumentRequest**](UpdatePaymentInstrumentRequest.md)| Specify the customer&#39;s payment details. |
 **clientApplication** | **String**| Client application name | [optional]

### Return type

[**TmsV1PaymentinstrumentsPatch200Response**](TmsV1PaymentinstrumentsPatch200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

