# InstrumentIdentifierApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tmsV1InstrumentidentifiersTokenIdDelete**](InstrumentIdentifierApi.md#tmsV1InstrumentidentifiersTokenIdDelete) | **DELETE** /tms/v1/instrumentidentifiers/{tokenId} | Delete an Instrument Identifier
[**tmsV1InstrumentidentifiersTokenIdGet**](InstrumentIdentifierApi.md#tmsV1InstrumentidentifiersTokenIdGet) | **GET** /tms/v1/instrumentidentifiers/{tokenId} | Retrieve an Instrument Identifier
[**tmsV1InstrumentidentifiersTokenIdPatch**](InstrumentIdentifierApi.md#tmsV1InstrumentidentifiersTokenIdPatch) | **PATCH** /tms/v1/instrumentidentifiers/{tokenId} | Update a Instrument Identifier


<a name="tmsV1InstrumentidentifiersTokenIdDelete"></a>
# **tmsV1InstrumentidentifiersTokenIdDelete**
> tmsV1InstrumentidentifiersTokenIdDelete(profileId, tokenId)

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
    apiInstance.tmsV1InstrumentidentifiersTokenIdDelete(profileId, tokenId);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#tmsV1InstrumentidentifiersTokenIdDelete");
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

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="tmsV1InstrumentidentifiersTokenIdGet"></a>
# **tmsV1InstrumentidentifiersTokenIdGet**
> TmsV1InstrumentidentifiersPost200Response tmsV1InstrumentidentifiersTokenIdGet(profileId, tokenId)

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
    TmsV1InstrumentidentifiersPost200Response result = apiInstance.tmsV1InstrumentidentifiersTokenIdGet(profileId, tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#tmsV1InstrumentidentifiersTokenIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **tokenId** | **String**| The TokenId of an Instrument Identifier. |

### Return type

[**TmsV1InstrumentidentifiersPost200Response**](TmsV1InstrumentidentifiersPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="tmsV1InstrumentidentifiersTokenIdPatch"></a>
# **tmsV1InstrumentidentifiersTokenIdPatch**
> TmsV1InstrumentidentifiersPost200Response tmsV1InstrumentidentifiersTokenIdPatch(profileId, tokenId, body)

Update a Instrument Identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifierApi;


InstrumentIdentifierApi apiInstance = new InstrumentIdentifierApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String tokenId = "tokenId_example"; // String | The TokenId of an Instrument Identifier.
Body1 body = new Body1(); // Body1 | Please specify the previous transaction Id to update.
try {
    TmsV1InstrumentidentifiersPost200Response result = apiInstance.tmsV1InstrumentidentifiersTokenIdPatch(profileId, tokenId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifierApi#tmsV1InstrumentidentifiersTokenIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **tokenId** | **String**| The TokenId of an Instrument Identifier. |
 **body** | [**Body1**](Body1.md)| Please specify the previous transaction Id to update. |

### Return type

[**TmsV1InstrumentidentifiersPost200Response**](TmsV1InstrumentidentifiersPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

