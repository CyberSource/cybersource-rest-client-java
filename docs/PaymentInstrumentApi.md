# PaymentInstrumentApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePaymentInstrument**](PaymentInstrumentApi.md#deletePaymentInstrument) | **DELETE** /tms/v1/paymentinstruments/{paymentInstrumentId} | Delete a Payment Instrument
[**getPaymentInstrument**](PaymentInstrumentApi.md#getPaymentInstrument) | **GET** /tms/v1/paymentinstruments/{paymentInstrumentId} | Retrieve a Payment Instrument
[**patchPaymentInstrument**](PaymentInstrumentApi.md#patchPaymentInstrument) | **PATCH** /tms/v1/paymentinstruments/{paymentInstrumentId} | Update a Payment Instrument
[**postPaymentInstrument**](PaymentInstrumentApi.md#postPaymentInstrument) | **POST** /tms/v1/paymentinstruments | Create a Payment Instrument


<a name="deletePaymentInstrument"></a>
# **deletePaymentInstrument**
> deletePaymentInstrument(paymentInstrumentId, profileId)

Delete a Payment Instrument

|  |  |  | | --- | --- | --- | |**Standalone Payment Instruments**&lt;br&gt;A Payment Instrument represents tokenized payment information such as expiration date, billing address &amp; card type.&lt;br&gt;A Payment Instrument token does not store the card number. A Payment Instrument is associated with an [Instrument Identifier](#token-management_instrument-identifier_create-an-instrument-identifier) that represents either a payment card number, or in the case of an ACH bank account, the routing and account number.&lt;br&gt;**Standalone Payment Instruments do not belong to a [Customer](#token-management_customer_create-a-customer).**|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Deleting a Payment Instrument**&lt;br&gt;Your system can use this API to delete an existing Payment Instrument.&lt;br&gt;Any Instrument Identifiers representing the card number will also be deleted if they are not associated with any other Payment Instruments. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String paymentInstrumentId = "paymentInstrumentId_example"; // String | The Id of a payment instrument.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    apiInstance.deletePaymentInstrument(paymentInstrumentId, profileId);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentInstrumentApi#deletePaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentInstrumentId** | **String**| The Id of a payment instrument. |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getPaymentInstrument"></a>
# **getPaymentInstrument**
> PostPaymentInstrumentRequest getPaymentInstrument(paymentInstrumentId, profileId, retrieveBinDetails)

Retrieve a Payment Instrument

|  |  |  | | --- | --- | --- | |**Standalone Payment Instruments**&lt;br&gt;A Payment Instrument represents tokenized payment information such as expiration date, billing address &amp; card type.&lt;br&gt;A Payment Instrument token does not store the card number. A Payment Instrument is associated with an [Instrument Identifier](#token-management_instrument-identifier_create-an-instrument-identifier) that represents either a payment card number, or in the case of an ACH bank account, the routing and account number.&lt;br&gt;**Standalone Payment Instruments do not belong to a [Customer](#token-management_customer_create-a-customer).**|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Retrieving a Payment Instrument**&lt;br&gt;Your system can use this API to retrieve an existing Payment Instrument.&lt;br&gt;To perform a payment with a particular Payment Instrument simply specify the [Payment Instrument Id in the payments request](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-using-tokens_authorization-with-customer-payment-instrument-and-shipping-address-token-id_liveconsole-tab-request-body). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String paymentInstrumentId = "paymentInstrumentId_example"; // String | The Id of a payment instrument.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
Boolean retrieveBinDetails = true; // Boolean | Retrieve the Bin Details of PAN or network token
try {
    PostPaymentInstrumentRequest result = apiInstance.getPaymentInstrument(paymentInstrumentId, profileId, retrieveBinDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentInstrumentApi#getPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentInstrumentId** | **String**| The Id of a payment instrument. |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]
 **retrieveBinDetails** | **Boolean**| Retrieve the Bin Details of PAN or network token | [optional]

### Return type

[**PostPaymentInstrumentRequest**](PostPaymentInstrumentRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchPaymentInstrument"></a>
# **patchPaymentInstrument**
> PatchPaymentInstrumentRequest patchPaymentInstrument(paymentInstrumentId, patchPaymentInstrumentRequest, profileId, retrieveBinDetails, ifMatch)

Update a Payment Instrument

|  |  |  | | --- | --- | --- | |**Standalone Payment Instruments**&lt;br&gt;A Payment Instrument represents tokenized payment information such as expiration date, billing address &amp; card type.&lt;br&gt;A Payment Instrument token does not store the card number. A Payment Instrument is associated with an [Instrument Identifier](#token-management_instrument-identifier_create-an-instrument-identifier) that represents either a payment card number, or in the case of an ACH bank account, the routing and account number.&lt;br&gt;**Standalone Payment Instruments do not belong to a [Customer](#token-management_customer_create-a-customer).**|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Updating a Payment Instrument**&lt;br&gt;Your system can use this API to update an existing Payment Instrument. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
String paymentInstrumentId = "paymentInstrumentId_example"; // String | The Id of a payment instrument.
PatchPaymentInstrumentRequest patchPaymentInstrumentRequest = new PatchPaymentInstrumentRequest(); // PatchPaymentInstrumentRequest | 
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
Boolean retrieveBinDetails = true; // Boolean | Retrieve the Bin Details of PAN or network token
String ifMatch = "ifMatch_example"; // String | Contains an ETag value from a GET request to make the request conditional.
try {
    PatchPaymentInstrumentRequest result = apiInstance.patchPaymentInstrument(paymentInstrumentId, patchPaymentInstrumentRequest, profileId, retrieveBinDetails, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentInstrumentApi#patchPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentInstrumentId** | **String**| The Id of a payment instrument. |
 **patchPaymentInstrumentRequest** | [**PatchPaymentInstrumentRequest**](PatchPaymentInstrumentRequest.md)|  |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]
 **retrieveBinDetails** | **Boolean**| Retrieve the Bin Details of PAN or network token | [optional]
 **ifMatch** | **String**| Contains an ETag value from a GET request to make the request conditional. | [optional]

### Return type

[**PatchPaymentInstrumentRequest**](PatchPaymentInstrumentRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postPaymentInstrument"></a>
# **postPaymentInstrument**
> PostPaymentInstrumentRequest postPaymentInstrument(postPaymentInstrumentRequest, profileId, retrieveBinDetails)

Create a Payment Instrument

|  |  |  | | --- | --- | --- | |**Standalone Payment Instruments**&lt;br&gt;A Payment Instrument represents tokenized payment information such as expiration date, billing address &amp; card type.&lt;br&gt;A Payment Instrument token does not store the card number. A Payment Instrument is associated with an [Instrument Identifier](#token-management_instrument-identifier_create-an-instrument-identifier) that represents either a payment card number, or in the case of an ACH bank account, the routing and account number.&lt;br&gt;**Standalone Payment Instruments do not belong to a [Customer](#token-management_customer_create-a-customer).**&lt;br&gt;&lt;br&gt;**Creating a Payment Instrument**&lt;br&gt;It is recommended you [create a Payment Instrument via a Payment Authorization](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-with-token-create_authorization-with-customer-token-creation_liveconsole-tab-request-body), this can be for a zero amount.&lt;br&gt;In Europe: You should perform Payer Authentication alongside the Authorization.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Payment Network Tokens**&lt;br&gt;Network tokens perform better than regular card numbers and they are not necessarily invalidated when a cardholder loses their card, or it expires.&lt;br&gt;A Payment Network Token will be automatically created and used in future payments if you are enabled for the service.&lt;br&gt;A Payment Network Token can also be [provisioned for an existing Instrument Identifier](#token-management_instrument-identifier_enroll-an-instrument-identifier-for-payment-network-token).&lt;br&gt;For more information about Payment Network Tokens see the Developer Guide.&lt;br&gt;&lt;br&gt;**Payments with Payment Instruments**&lt;br&gt;To perform a payment with a particular Payment Instrument specify the [Payment Instrument in the payment request](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-using-tokens_authorization-with-customer-payment-instrument-and-shipping-address-token-id_liveconsole-tab-request-body). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentInstrumentApi;


PaymentInstrumentApi apiInstance = new PaymentInstrumentApi();
PostPaymentInstrumentRequest postPaymentInstrumentRequest = new PostPaymentInstrumentRequest(); // PostPaymentInstrumentRequest | 
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
Boolean retrieveBinDetails = true; // Boolean | Retrieve the Bin Details of PAN or network token
try {
    PostPaymentInstrumentRequest result = apiInstance.postPaymentInstrument(postPaymentInstrumentRequest, profileId, retrieveBinDetails);
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
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]
 **retrieveBinDetails** | **Boolean**| Retrieve the Bin Details of PAN or network token | [optional]

### Return type

[**PostPaymentInstrumentRequest**](PostPaymentInstrumentRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

