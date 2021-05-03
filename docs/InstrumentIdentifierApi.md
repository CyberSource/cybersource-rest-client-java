# InstrumentIdentifierApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInstrumentIdentifier**](InstrumentIdentifierApi.md#deleteInstrumentIdentifier) | **DELETE** /tms/v1/instrumentidentifiers/{instrumentIdentifierTokenId} | Delete an Instrument Identifier
[**getInstrumentIdentifier**](InstrumentIdentifierApi.md#getInstrumentIdentifier) | **GET** /tms/v1/instrumentidentifiers/{instrumentIdentifierTokenId} | Retrieve an Instrument Identifier
[**getInstrumentIdentifierPaymentInstrumentsList**](InstrumentIdentifierApi.md#getInstrumentIdentifierPaymentInstrumentsList) | **GET** /tms/v1/instrumentidentifiers/{instrumentIdentifierTokenId}/paymentinstruments | List Payment Instruments for an Instrument Identifier
[**patchInstrumentIdentifier**](InstrumentIdentifierApi.md#patchInstrumentIdentifier) | **PATCH** /tms/v1/instrumentidentifiers/{instrumentIdentifierTokenId} | Update an Instrument Identifier
[**postInstrumentIdentifier**](InstrumentIdentifierApi.md#postInstrumentIdentifier) | **POST** /tms/v1/instrumentidentifiers | Create an Instrument Identifier
[**postInstrumentIdentifierEnrollment**](InstrumentIdentifierApi.md#postInstrumentIdentifierEnrollment) | **POST** /tms/v1/instrumentidentifiers/{instrumentIdentifierTokenId}/enrollment | Enroll an Instrument Identifier for Network Tokenization


<a name="deleteInstrumentIdentifier"></a>
# **deleteInstrumentIdentifier**
> deleteInstrumentIdentifier(instrumentIdentifierTokenId, profileId)

Delete an Instrument Identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifierApi;


InstrumentIdentifierApi apiInstance = new InstrumentIdentifierApi();
String instrumentIdentifierTokenId = "instrumentIdentifierTokenId_example"; // String | The TokenId of a Instrument Identifier.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    apiInstance.deleteInstrumentIdentifier(instrumentIdentifierTokenId, profileId);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#deleteInstrumentIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentIdentifierTokenId** | **String**| The TokenId of a Instrument Identifier. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getInstrumentIdentifier"></a>
# **getInstrumentIdentifier**
> Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier getInstrumentIdentifier(instrumentIdentifierTokenId, profileId)

Retrieve an Instrument Identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifierApi;


InstrumentIdentifierApi apiInstance = new InstrumentIdentifierApi();
String instrumentIdentifierTokenId = "instrumentIdentifierTokenId_example"; // String | The TokenId of a Instrument Identifier.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier result = apiInstance.getInstrumentIdentifier(instrumentIdentifierTokenId, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#getInstrumentIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentIdentifierTokenId** | **String**| The TokenId of a Instrument Identifier. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier**](Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getInstrumentIdentifierPaymentInstrumentsList"></a>
# **getInstrumentIdentifierPaymentInstrumentsList**
> PaymentInstrumentList getInstrumentIdentifierPaymentInstrumentsList(instrumentIdentifierTokenId, profileId, offset, limit)

List Payment Instruments for an Instrument Identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifierApi;


InstrumentIdentifierApi apiInstance = new InstrumentIdentifierApi();
String instrumentIdentifierTokenId = "instrumentIdentifierTokenId_example"; // String | The TokenId of a Instrument Identifier.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
Long offset = 0L; // Long | Starting record in zero-based dataset that should be returned as the first object in the array. Default is 0.
Long limit = 20L; // Long | The maximum number that can be returned in the array starting from the offset record in zero-based dataset. Default is 20, maximum is 100.
try {
    PaymentInstrumentList result = apiInstance.getInstrumentIdentifierPaymentInstrumentsList(instrumentIdentifierTokenId, profileId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#getInstrumentIdentifierPaymentInstrumentsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentIdentifierTokenId** | **String**| The TokenId of a Instrument Identifier. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]
 **offset** | **Long**| Starting record in zero-based dataset that should be returned as the first object in the array. Default is 0. | [optional] [default to 0]
 **limit** | **Long**| The maximum number that can be returned in the array starting from the offset record in zero-based dataset. Default is 20, maximum is 100. | [optional] [default to 20]

### Return type

[**PaymentInstrumentList**](PaymentInstrumentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchInstrumentIdentifier"></a>
# **patchInstrumentIdentifier**
> Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier patchInstrumentIdentifier(instrumentIdentifierTokenId, patchInstrumentIdentifierRequest, profileId, ifMatch)

Update an Instrument Identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifierApi;


InstrumentIdentifierApi apiInstance = new InstrumentIdentifierApi();
String instrumentIdentifierTokenId = "instrumentIdentifierTokenId_example"; // String | The TokenId of a Instrument Identifier.
PatchInstrumentIdentifierRequest patchInstrumentIdentifierRequest = new PatchInstrumentIdentifierRequest(); // PatchInstrumentIdentifierRequest | Specify the previous transaction ID to update.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String ifMatch = "ifMatch_example"; // String | Contains an ETag value from a GET request to make the request conditional.
try {
    Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier result = apiInstance.patchInstrumentIdentifier(instrumentIdentifierTokenId, patchInstrumentIdentifierRequest, profileId, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#patchInstrumentIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentIdentifierTokenId** | **String**| The TokenId of a Instrument Identifier. |
 **patchInstrumentIdentifierRequest** | [**PatchInstrumentIdentifierRequest**](PatchInstrumentIdentifierRequest.md)| Specify the previous transaction ID to update. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]
 **ifMatch** | **String**| Contains an ETag value from a GET request to make the request conditional. | [optional]

### Return type

[**Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier**](Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postInstrumentIdentifier"></a>
# **postInstrumentIdentifier**
> Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier postInstrumentIdentifier(postInstrumentIdentifierRequest, profileId)

Create an Instrument Identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifierApi;


InstrumentIdentifierApi apiInstance = new InstrumentIdentifierApi();
PostInstrumentIdentifierRequest postInstrumentIdentifierRequest = new PostInstrumentIdentifierRequest(); // PostInstrumentIdentifierRequest | Specify either a Card, Bank Account or Enrollable Card
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier result = apiInstance.postInstrumentIdentifier(postInstrumentIdentifierRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#postInstrumentIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postInstrumentIdentifierRequest** | [**PostInstrumentIdentifierRequest**](PostInstrumentIdentifierRequest.md)| Specify either a Card, Bank Account or Enrollable Card |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier**](Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postInstrumentIdentifierEnrollment"></a>
# **postInstrumentIdentifierEnrollment**
> postInstrumentIdentifierEnrollment(instrumentIdentifierTokenId, postInstrumentIdentifierEnrollmentRequest, profileId)

Enroll an Instrument Identifier for Network Tokenization

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifierApi;


InstrumentIdentifierApi apiInstance = new InstrumentIdentifierApi();
String instrumentIdentifierTokenId = "instrumentIdentifierTokenId_example"; // String | The TokenId of a Instrument Identifier.
PostInstrumentIdentifierEnrollmentRequest postInstrumentIdentifierEnrollmentRequest = new PostInstrumentIdentifierEnrollmentRequest(); // PostInstrumentIdentifierEnrollmentRequest | Specify Enrollable Card details
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    apiInstance.postInstrumentIdentifierEnrollment(instrumentIdentifierTokenId, postInstrumentIdentifierEnrollmentRequest, profileId);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#postInstrumentIdentifierEnrollment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentIdentifierTokenId** | **String**| The TokenId of a Instrument Identifier. |
 **postInstrumentIdentifierEnrollmentRequest** | [**PostInstrumentIdentifierEnrollmentRequest**](PostInstrumentIdentifierEnrollmentRequest.md)| Specify Enrollable Card details |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

