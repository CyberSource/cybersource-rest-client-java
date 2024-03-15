# CustomerPaymentInstrumentApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCustomerPaymentInstrument**](CustomerPaymentInstrumentApi.md#deleteCustomerPaymentInstrument) | **DELETE** /tms/v2/customers/{customerId}/payment-instruments/{paymentInstrumentId} | Delete a Customer Payment Instrument
[**getCustomerPaymentInstrument**](CustomerPaymentInstrumentApi.md#getCustomerPaymentInstrument) | **GET** /tms/v2/customers/{customerId}/payment-instruments/{paymentInstrumentId} | Retrieve a Customer Payment Instrument
[**getCustomerPaymentInstrumentsList**](CustomerPaymentInstrumentApi.md#getCustomerPaymentInstrumentsList) | **GET** /tms/v2/customers/{customerId}/payment-instruments | List Payment Instruments for a Customer
[**patchCustomersPaymentInstrument**](CustomerPaymentInstrumentApi.md#patchCustomersPaymentInstrument) | **PATCH** /tms/v2/customers/{customerId}/payment-instruments/{paymentInstrumentId} | Update a Customer Payment Instrument
[**postCustomerPaymentInstrument**](CustomerPaymentInstrumentApi.md#postCustomerPaymentInstrument) | **POST** /tms/v2/customers/{customerId}/payment-instruments | Create a Customer Payment Instrument


<a name="deleteCustomerPaymentInstrument"></a>
# **deleteCustomerPaymentInstrument**
> deleteCustomerPaymentInstrument(customerId, paymentInstrumentId, profileId)

Delete a Customer Payment Instrument

|  |  |  | | --- | --- | --- | |**Customer Payment Instrument**&lt;br&gt;A Customer Payment Instrument represents tokenized customer payment information such as expiration date, billing address &amp; card type.&lt;br&gt;A [Customer](#token-management_customer_create-a-customer) can have [one or more Payment Instruments](#token-management_customer-payment-instrument_retrieve-a-customer-payment-instrument), with one allocated as the Customers default for use in payments.&lt;br&gt;A Payment Instrument token does not store the card number. A Payment Instrument is associated with an [Instrument Identifier](#token-management_instrument-identifier_create-an-instrument-identifier) that represents either a payment card number, or in the case of an ACH bank account, the routing and account number.&lt;br&gt;|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Deleting a Customers Payment Instrument**&lt;br&gt;Your system can use this API to delete an existing Payment Instrument for a Customer.&lt;br&gt;Any Instrument Identifiers representing the card number will also be deleted if they are not associated with any other Payment Instruments.&lt;br&gt;If a customer has more than one Payment Instrument then the default Payment Instrument cannot be deleted without first selecting a [new default Payment Instrument](#token-management_customer-payment-instrument_update-a-customer-payment-instrument_samplerequests-dropdown_make-customer-payment-instrument-the-default_liveconsole-tab-request-body). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerPaymentInstrumentApi;


CustomerPaymentInstrumentApi apiInstance = new CustomerPaymentInstrumentApi();
String customerId = "customerId_example"; // String | The Id of a Customer.
String paymentInstrumentId = "paymentInstrumentId_example"; // String | The Id of a payment instrument.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    apiInstance.deleteCustomerPaymentInstrument(customerId, paymentInstrumentId, profileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerPaymentInstrumentApi#deleteCustomerPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The Id of a Customer. |
 **paymentInstrumentId** | **String**| The Id of a payment instrument. |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getCustomerPaymentInstrument"></a>
# **getCustomerPaymentInstrument**
> PostCustomerPaymentInstrumentRequest getCustomerPaymentInstrument(customerId, paymentInstrumentId, profileId)

Retrieve a Customer Payment Instrument

|  |  |  | | --- | --- | --- | |**Customer Payment Instrument**&lt;br&gt;A Customer Payment Instrument represents tokenized customer payment information such as expiration date, billing address &amp; card type.&lt;br&gt;A [Customer](#token-management_customer_create-a-customer) can have [one or more Payment Instruments](#token-management_customer-payment-instrument_retrieve-a-customer-payment-instrument), with one allocated as the Customers default for use in payments.&lt;br&gt;A Payment Instrument token does not store the card number. A Payment Instrument is associated with an [Instrument Identifier](#token-management_instrument-identifier_create-an-instrument-identifier) that represents either a payment card number, or in the case of an ACH bank account, the routing and account number.&lt;br&gt;|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Retrieving a Customer Payment Instrument**&lt;br&gt;Your system can use this API to retrieve an existing Payment Instrument for a Customer.&lt;br&gt;To perform a payment with a particular Payment Instrument simply specify the [Payment Instrument Id in the payments request](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-using-tokens_authorization-with-customer-payment-instrument-and-shipping-address-token-id_liveconsole-tab-request-body). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerPaymentInstrumentApi;


CustomerPaymentInstrumentApi apiInstance = new CustomerPaymentInstrumentApi();
String customerId = "customerId_example"; // String | The Id of a Customer.
String paymentInstrumentId = "paymentInstrumentId_example"; // String | The Id of a payment instrument.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    PostCustomerPaymentInstrumentRequest result = apiInstance.getCustomerPaymentInstrument(customerId, paymentInstrumentId, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerPaymentInstrumentApi#getCustomerPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The Id of a Customer. |
 **paymentInstrumentId** | **String**| The Id of a payment instrument. |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**PostCustomerPaymentInstrumentRequest**](PostCustomerPaymentInstrumentRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getCustomerPaymentInstrumentsList"></a>
# **getCustomerPaymentInstrumentsList**
> PaymentInstrumentList getCustomerPaymentInstrumentsList(customerId, profileId, offset, limit)

List Payment Instruments for a Customer

|  |  |  | | --- | --- | --- | |**Customer Payment Instrument**&lt;br&gt;A Customer Payment Instrument represents tokenized customer payment information such as expiration date, billing address &amp; card type.&lt;br&gt;A [Customer](#token-management_customer_create-a-customer) can have [one or more Payment Instruments](#token-management_customer-payment-instrument_retrieve-a-customer-payment-instrument), with one allocated as the Customers default for use in payments.&lt;br&gt;A Payment Instrument token does not store the card number. A Payment Instrument is associated with an [Instrument Identifier](#token-management_instrument-identifier_create-an-instrument-identifier) that represents either a payment card number, or in the case of an ACH bank account, the routing and account number.&lt;br&gt;|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Retrieving all Customer Payment Instruments**&lt;br&gt;Your system can use this API to retrieve all existing Payment Instruments for a Customer. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerPaymentInstrumentApi;


CustomerPaymentInstrumentApi apiInstance = new CustomerPaymentInstrumentApi();
String customerId = "customerId_example"; // String | The Id of a Customer.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
Long offset = 0L; // Long | Starting record in zero-based dataset that should be returned as the first object in the array. Default is 0.
Long limit = 20L; // Long | The maximum number that can be returned in the array starting from the offset record in zero-based dataset. Default is 20, maximum is 100.
try {
    PaymentInstrumentList result = apiInstance.getCustomerPaymentInstrumentsList(customerId, profileId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerPaymentInstrumentApi#getCustomerPaymentInstrumentsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The Id of a Customer. |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]
 **offset** | **Long**| Starting record in zero-based dataset that should be returned as the first object in the array. Default is 0. | [optional] [default to 0]
 **limit** | **Long**| The maximum number that can be returned in the array starting from the offset record in zero-based dataset. Default is 20, maximum is 100. | [optional] [default to 20]

### Return type

[**PaymentInstrumentList**](PaymentInstrumentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchCustomersPaymentInstrument"></a>
# **patchCustomersPaymentInstrument**
> PatchCustomerPaymentInstrumentRequest patchCustomersPaymentInstrument(customerId, paymentInstrumentId, patchCustomerPaymentInstrumentRequest, profileId, ifMatch)

Update a Customer Payment Instrument

|  |  |  | | --- | --- | --- | |**Customer Payment Instrument**&lt;br&gt;A Customer Payment Instrument represents tokenized customer payment information such as expiration date, billing address &amp; card type.&lt;br&gt;A [Customer](#token-management_customer_create-a-customer) can have [one or more Payment Instruments](#token-management_customer-payment-instrument_retrieve-a-customer-payment-instrument), with one allocated as the Customers default for use in payments.&lt;br&gt;A Payment Instrument token does not store the card number. A Payment Instrument is associated with an [Instrument Identifier](#token-management_instrument-identifier_create-an-instrument-identifier) that represents either a payment card number, or in the case of an ACH bank account, the routing and account number.&lt;br&gt;|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Updating a Customers Payment Instrument**&lt;br&gt;Your system can use this API to update an existing Payment Instrument for a Customer, including selecting a [default Payment Instrument](#token-management_customer-payment-instrument_update-a-customer-payment-instrument_samplerequests-dropdown_make-customer-payment-instrument-the-default_liveconsole-tab-request-body) for use in payments. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerPaymentInstrumentApi;


CustomerPaymentInstrumentApi apiInstance = new CustomerPaymentInstrumentApi();
String customerId = "customerId_example"; // String | The Id of a Customer.
String paymentInstrumentId = "paymentInstrumentId_example"; // String | The Id of a payment instrument.
PatchCustomerPaymentInstrumentRequest patchCustomerPaymentInstrumentRequest = new PatchCustomerPaymentInstrumentRequest(); // PatchCustomerPaymentInstrumentRequest | 
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
String ifMatch = "ifMatch_example"; // String | Contains an ETag value from a GET request to make the request conditional.
try {
    PatchCustomerPaymentInstrumentRequest result = apiInstance.patchCustomersPaymentInstrument(customerId, paymentInstrumentId, patchCustomerPaymentInstrumentRequest, profileId, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerPaymentInstrumentApi#patchCustomersPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The Id of a Customer. |
 **paymentInstrumentId** | **String**| The Id of a payment instrument. |
 **patchCustomerPaymentInstrumentRequest** | [**PatchCustomerPaymentInstrumentRequest**](PatchCustomerPaymentInstrumentRequest.md)|  |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]
 **ifMatch** | **String**| Contains an ETag value from a GET request to make the request conditional. | [optional]

### Return type

[**PatchCustomerPaymentInstrumentRequest**](PatchCustomerPaymentInstrumentRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postCustomerPaymentInstrument"></a>
# **postCustomerPaymentInstrument**
> PostCustomerPaymentInstrumentRequest postCustomerPaymentInstrument(customerId, postCustomerPaymentInstrumentRequest, profileId)

Create a Customer Payment Instrument

|  |  |  | | --- | --- | --- | |**Customer Payment Instrument**&lt;br&gt;A Customer Payment Instrument represents tokenized customer payment information such as expiration date, billing address &amp; card type.&lt;br&gt;A [Customer](#token-management_customer_create-a-customer) can have [one or more Payment Instruments](#token-management_customer-payment-instrument_retrieve-a-customer-payment-instrument), with one allocated as the Customers default for use in payments.&lt;br&gt;A Payment Instrument token does not store the card number. A Payment Instrument is associated with an [Instrument Identifier](#token-management_instrument-identifier_create-an-instrument-identifier) that represents either a payment card number, or in the case of an ACH bank account, the routing and account number.&lt;br&gt;&lt;br&gt;**Creating a Customer Payment Instrument**&lt;br&gt;It is recommended you [create a Customer Payment Instrument via a Payment Authorization](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-with-token-create_authorization-create-default-payment-instrument-shipping-address-for-existing-customer_liveconsole-tab-request-body), this can be for a zero amount.&lt;br&gt;In Europe: You should perform Payer Authentication alongside the Authorization.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Payment Network Tokens**&lt;br&gt;Network tokens perform better than regular card numbers and they are not necessarily invalidated when a cardholder loses their card, or it expires.&lt;br&gt;A Payment Network Token will be automatically created and used in future payments if you are enabled for the service.&lt;br&gt;A Payment Network Token can also be [provisioned for an existing Instrument Identifier](#token-management_instrument-identifier_enroll-an-instrument-identifier-for-payment-network-token).&lt;br&gt;For more information about Payment Network Tokens see the Developer Guide.&lt;br&gt;&lt;br&gt;**Payments with Customers Payment Instrument**&lt;br&gt;To perform a payment with a particular Payment Instrument or Shipping Address specify the [Payment Instrument in the payment request](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-using-tokens_authorization-with-customer-payment-instrument-and-shipping-address-token-id_liveconsole-tab-request-body). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerPaymentInstrumentApi;


CustomerPaymentInstrumentApi apiInstance = new CustomerPaymentInstrumentApi();
String customerId = "customerId_example"; // String | The Id of a Customer.
PostCustomerPaymentInstrumentRequest postCustomerPaymentInstrumentRequest = new PostCustomerPaymentInstrumentRequest(); // PostCustomerPaymentInstrumentRequest | 
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    PostCustomerPaymentInstrumentRequest result = apiInstance.postCustomerPaymentInstrument(customerId, postCustomerPaymentInstrumentRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerPaymentInstrumentApi#postCustomerPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The Id of a Customer. |
 **postCustomerPaymentInstrumentRequest** | [**PostCustomerPaymentInstrumentRequest**](PostCustomerPaymentInstrumentRequest.md)|  |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**PostCustomerPaymentInstrumentRequest**](PostCustomerPaymentInstrumentRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

