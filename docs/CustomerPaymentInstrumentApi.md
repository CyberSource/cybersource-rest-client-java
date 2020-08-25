# CustomerPaymentInstrumentApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCustomerPaymentInstrument**](CustomerPaymentInstrumentApi.md#deleteCustomerPaymentInstrument) | **DELETE** /tms/v2/customers/{customerTokenId}/payment-instruments/{paymentInstrumentTokenId} | Delete a Customer Payment Instrument
[**getCustomerPaymentInstrument**](CustomerPaymentInstrumentApi.md#getCustomerPaymentInstrument) | **GET** /tms/v2/customers/{customerTokenId}/payment-instruments/{paymentInstrumentTokenId} | Retrieve a Customer Payment Instrument
[**getCustomerPaymentInstrumentsList**](CustomerPaymentInstrumentApi.md#getCustomerPaymentInstrumentsList) | **GET** /tms/v2/customers/{customerTokenId}/payment-instruments | List Payment Instruments for a Customer
[**patchCustomersPaymentInstrument**](CustomerPaymentInstrumentApi.md#patchCustomersPaymentInstrument) | **PATCH** /tms/v2/customers/{customerTokenId}/payment-instruments/{paymentInstrumentTokenId} | Update a Customer Payment Instrument
[**postCustomerPaymentInstrument**](CustomerPaymentInstrumentApi.md#postCustomerPaymentInstrument) | **POST** /tms/v2/customers/{customerTokenId}/payment-instruments | Create a Customer Payment Instrument


<a name="deleteCustomerPaymentInstrument"></a>
# **deleteCustomerPaymentInstrument**
> deleteCustomerPaymentInstrument(customerTokenId, paymentInstrumentTokenId, profileId)

Delete a Customer Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerPaymentInstrumentApi;


CustomerPaymentInstrumentApi apiInstance = new CustomerPaymentInstrumentApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
String paymentInstrumentTokenId = "paymentInstrumentTokenId_example"; // String | The TokenId of a payment instrument.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    apiInstance.deleteCustomerPaymentInstrument(customerTokenId, paymentInstrumentTokenId, profileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerPaymentInstrumentApi#deleteCustomerPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **paymentInstrumentTokenId** | **String**| The TokenId of a payment instrument. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getCustomerPaymentInstrument"></a>
# **getCustomerPaymentInstrument**
> Tmsv2customersEmbeddedDefaultPaymentInstrument getCustomerPaymentInstrument(customerTokenId, paymentInstrumentTokenId, profileId)

Retrieve a Customer Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerPaymentInstrumentApi;


CustomerPaymentInstrumentApi apiInstance = new CustomerPaymentInstrumentApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
String paymentInstrumentTokenId = "paymentInstrumentTokenId_example"; // String | The TokenId of a payment instrument.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    Tmsv2customersEmbeddedDefaultPaymentInstrument result = apiInstance.getCustomerPaymentInstrument(customerTokenId, paymentInstrumentTokenId, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerPaymentInstrumentApi#getCustomerPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **paymentInstrumentTokenId** | **String**| The TokenId of a payment instrument. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**Tmsv2customersEmbeddedDefaultPaymentInstrument**](Tmsv2customersEmbeddedDefaultPaymentInstrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getCustomerPaymentInstrumentsList"></a>
# **getCustomerPaymentInstrumentsList**
> PaymentInstrumentListForCustomer getCustomerPaymentInstrumentsList(customerTokenId, profileId, offset, limit)

List Payment Instruments for a Customer

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerPaymentInstrumentApi;


CustomerPaymentInstrumentApi apiInstance = new CustomerPaymentInstrumentApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
Long offset = 0L; // Long | Starting record in zero-based dataset that should be returned as the first object in the array. Default is 0.
Long limit = 20L; // Long | The maximum number that can be returned in the array starting from the offset record in zero-based dataset. Default is 20, maximum is 100.
try {
    PaymentInstrumentListForCustomer result = apiInstance.getCustomerPaymentInstrumentsList(customerTokenId, profileId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerPaymentInstrumentApi#getCustomerPaymentInstrumentsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]
 **offset** | **Long**| Starting record in zero-based dataset that should be returned as the first object in the array. Default is 0. | [optional] [default to 0]
 **limit** | **Long**| The maximum number that can be returned in the array starting from the offset record in zero-based dataset. Default is 20, maximum is 100. | [optional] [default to 20]

### Return type

[**PaymentInstrumentListForCustomer**](PaymentInstrumentListForCustomer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchCustomersPaymentInstrument"></a>
# **patchCustomersPaymentInstrument**
> Tmsv2customersEmbeddedDefaultPaymentInstrument patchCustomersPaymentInstrument(customerTokenId, paymentInstrumentTokenId, patchCustomerPaymentInstrumentRequest, profileId, ifMatch)

Update a Customer Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerPaymentInstrumentApi;


CustomerPaymentInstrumentApi apiInstance = new CustomerPaymentInstrumentApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
String paymentInstrumentTokenId = "paymentInstrumentTokenId_example"; // String | The TokenId of a payment instrument.
PatchCustomerPaymentInstrumentRequest patchCustomerPaymentInstrumentRequest = new PatchCustomerPaymentInstrumentRequest(); // PatchCustomerPaymentInstrumentRequest | 
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String ifMatch = "ifMatch_example"; // String | Contains an ETag value from a GET request to make the request conditional.
try {
    Tmsv2customersEmbeddedDefaultPaymentInstrument result = apiInstance.patchCustomersPaymentInstrument(customerTokenId, paymentInstrumentTokenId, patchCustomerPaymentInstrumentRequest, profileId, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerPaymentInstrumentApi#patchCustomersPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **paymentInstrumentTokenId** | **String**| The TokenId of a payment instrument. |
 **patchCustomerPaymentInstrumentRequest** | [**PatchCustomerPaymentInstrumentRequest**](PatchCustomerPaymentInstrumentRequest.md)|  |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]
 **ifMatch** | **String**| Contains an ETag value from a GET request to make the request conditional. | [optional]

### Return type

[**Tmsv2customersEmbeddedDefaultPaymentInstrument**](Tmsv2customersEmbeddedDefaultPaymentInstrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postCustomerPaymentInstrument"></a>
# **postCustomerPaymentInstrument**
> Tmsv2customersEmbeddedDefaultPaymentInstrument postCustomerPaymentInstrument(customerTokenId, postCustomerPaymentInstrumentRequest, profileId)

Create a Customer Payment Instrument

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerPaymentInstrumentApi;


CustomerPaymentInstrumentApi apiInstance = new CustomerPaymentInstrumentApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
PostCustomerPaymentInstrumentRequest postCustomerPaymentInstrumentRequest = new PostCustomerPaymentInstrumentRequest(); // PostCustomerPaymentInstrumentRequest | 
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    Tmsv2customersEmbeddedDefaultPaymentInstrument result = apiInstance.postCustomerPaymentInstrument(customerTokenId, postCustomerPaymentInstrumentRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerPaymentInstrumentApi#postCustomerPaymentInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **postCustomerPaymentInstrumentRequest** | [**PostCustomerPaymentInstrumentRequest**](PostCustomerPaymentInstrumentRequest.md)|  |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**Tmsv2customersEmbeddedDefaultPaymentInstrument**](Tmsv2customersEmbeddedDefaultPaymentInstrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

