# InstrumentIdentifierApi

All URIs are relative to *https://api.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instrumentidentifiersPost**](InstrumentIdentifierApi.md#instrumentidentifiersPost) | **POST** /instrumentidentifiers | Create an Instrument Identifier
[**instrumentidentifiersTokenIdDelete**](InstrumentIdentifierApi.md#instrumentidentifiersTokenIdDelete) | **DELETE** /instrumentidentifiers/{tokenId} | Delete an Instrument Identifier
[**instrumentidentifiersTokenIdGet**](InstrumentIdentifierApi.md#instrumentidentifiersTokenIdGet) | **GET** /instrumentidentifiers/{tokenId} | Retrieve an Instrument Identifier
[**instrumentidentifiersTokenIdPatch**](InstrumentIdentifierApi.md#instrumentidentifiersTokenIdPatch) | **PATCH** /instrumentidentifiers/{tokenId} | Update a Instrument Identifier
[**instrumentidentifiersTokenIdPaymentinstrumentsGet**](InstrumentIdentifierApi.md#instrumentidentifiersTokenIdPaymentinstrumentsGet) | **GET** /instrumentidentifiers/{tokenId}/paymentinstruments | Retrieve all Payment Instruments associated with an Instrument Identifier


<a name="instrumentidentifiersPost"></a>
# **instrumentidentifiersPost**
> InlineResponse2007 instrumentidentifiersPost(profileId, body)

Create an Instrument Identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifierApi;


InstrumentIdentifierApi apiInstance = new InstrumentIdentifierApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
Body body = new Body(); // Body | Please specify either a Card or Bank Account.
try {
    InlineResponse2007 result = apiInstance.instrumentidentifiersPost(profileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#instrumentidentifiersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **body** | [**Body**](Body.md)| Please specify either a Card or Bank Account. | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="instrumentidentifiersTokenIdDelete"></a>
# **instrumentidentifiersTokenIdDelete**
> instrumentidentifiersTokenIdDelete(profileId, tokenId)

Delete an Instrument Identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifierApi;


InstrumentIdentifierApi apiInstance = new InstrumentIdentifierApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String tokenId = "tokenId_example"; // String | The TokenId of an Instrument Identifier.
try {
    apiInstance.instrumentidentifiersTokenIdDelete(profileId, tokenId);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#instrumentidentifiersTokenIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **tokenId** | **String**| The TokenId of an Instrument Identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="instrumentidentifiersTokenIdGet"></a>
# **instrumentidentifiersTokenIdGet**
> InlineResponse2007 instrumentidentifiersTokenIdGet(profileId, tokenId)

Retrieve an Instrument Identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifierApi;


InstrumentIdentifierApi apiInstance = new InstrumentIdentifierApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String tokenId = "tokenId_example"; // String | The TokenId of an Instrument Identifier.
try {
    InlineResponse2007 result = apiInstance.instrumentidentifiersTokenIdGet(profileId, tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#instrumentidentifiersTokenIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **tokenId** | **String**| The TokenId of an Instrument Identifier. |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="instrumentidentifiersTokenIdPatch"></a>
# **instrumentidentifiersTokenIdPatch**
> InlineResponse2007 instrumentidentifiersTokenIdPatch(profileId, tokenId, body)

Update a Instrument Identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifierApi;


InstrumentIdentifierApi apiInstance = new InstrumentIdentifierApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String tokenId = "tokenId_example"; // String | The TokenId of an Instrument Identifier
Body1 body = new Body1(); // Body1 | Please specify the previous transaction Id to update.
try {
    InlineResponse2007 result = apiInstance.instrumentidentifiersTokenIdPatch(profileId, tokenId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#instrumentidentifiersTokenIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **tokenId** | **String**| The TokenId of an Instrument Identifier |
 **body** | [**Body1**](Body1.md)| Please specify the previous transaction Id to update. |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="instrumentidentifiersTokenIdPaymentinstrumentsGet"></a>
# **instrumentidentifiersTokenIdPaymentinstrumentsGet**
> InlineResponse2008 instrumentidentifiersTokenIdPaymentinstrumentsGet(profileId, tokenId, offset, limit)

Retrieve all Payment Instruments associated with an Instrument Identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifierApi;


InstrumentIdentifierApi apiInstance = new InstrumentIdentifierApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String tokenId = "tokenId_example"; // String | The TokenId of an Instrument Identifier.
String offset = "offset_example"; // String | Starting Payment Instrument record in zero-based dataset that should be returned as the first object in the array. Default is 0.
String limit = "20"; // String | The maximum number of Payment Instruments that can be returned in the array starting from the offset record in zero-based dataset. Default is 20, maximum is 100.
try {
    InlineResponse2008 result = apiInstance.instrumentidentifiersTokenIdPaymentinstrumentsGet(profileId, tokenId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#instrumentidentifiersTokenIdPaymentinstrumentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **tokenId** | **String**| The TokenId of an Instrument Identifier. |
 **offset** | **String**| Starting Payment Instrument record in zero-based dataset that should be returned as the first object in the array. Default is 0. | [optional]
 **limit** | **String**| The maximum number of Payment Instruments that can be returned in the array starting from the offset record in zero-based dataset. Default is 20, maximum is 100. | [optional] [default to 20]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

