# InstrumentIdentifiersApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tmsV1InstrumentidentifiersPost**](InstrumentIdentifiersApi.md#tmsV1InstrumentidentifiersPost) | **POST** /tms/v1/instrumentidentifiers | Create an Instrument Identifier


<a name="tmsV1InstrumentidentifiersPost"></a>
# **tmsV1InstrumentidentifiersPost**
> TmsV1InstrumentidentifiersPost200Response tmsV1InstrumentidentifiersPost(profileId, body)

Create an Instrument Identifier

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InstrumentIdentifiersApi;


InstrumentIdentifiersApi apiInstance = new InstrumentIdentifiersApi();
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
Body body = new Body(); // Body | Please specify either a Card or Bank Account.
try {
    TmsV1InstrumentidentifiersPost200Response result = apiInstance.tmsV1InstrumentidentifiersPost(profileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentIdentifiersApi#tmsV1InstrumentidentifiersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. |
 **body** | [**Body**](Body.md)| Please specify either a Card or Bank Account. |

### Return type

[**TmsV1InstrumentidentifiersPost200Response**](TmsV1InstrumentidentifiersPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

