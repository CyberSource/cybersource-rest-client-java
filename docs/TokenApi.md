# TokenApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCardArtAsset**](TokenApi.md#getCardArtAsset) | **GET** /tms/v2/tokens/{instrumentIdentifierId}/{tokenProvider}/assets/{assetType} | Retrieve Card Art
[**postTokenPaymentCredentials**](TokenApi.md#postTokenPaymentCredentials) | **POST** /tms/v2/tokens/{tokenId}/payment-credentials | Generate Payment Credentials for a TMS Token


<a name="getCardArtAsset"></a>
# **getCardArtAsset**
> InlineResponse200 getCardArtAsset(instrumentIdentifierId, tokenProvider, assetType)

Retrieve Card Art

Retrieves Card Art for a specific Instrument Identifier. The Card Art is a visual representation of the cardholder&#39;s payment card. Card Art is only available if a Network Token is successfully provisioned. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TokenApi;


TokenApi apiInstance = new TokenApi();
String instrumentIdentifierId = "instrumentIdentifierId_example"; // String | The Id of an Instrument Identifier.
String tokenProvider = "tokenProvider_example"; // String | The token provider.
String assetType = "assetType_example"; // String | The type of asset.
try {
    InlineResponse200 result = apiInstance.getCardArtAsset(instrumentIdentifierId, tokenProvider, assetType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#getCardArtAsset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentIdentifierId** | **String**| The Id of an Instrument Identifier. |
 **tokenProvider** | **String**| The token provider. | [enum: vts, mdes, amex, mscof]
 **assetType** | **String**| The type of asset. | [enum: card-art-combined, brand-logo, issuer-logo, icon-logo]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postTokenPaymentCredentials"></a>
# **postTokenPaymentCredentials**
> String postTokenPaymentCredentials(tokenId, postPaymentCredentialsRequest, profileId)

Generate Payment Credentials for a TMS Token

|  |  |  |     | --- | --- | --- |     |**Token**&lt;br&gt;A Token can represent your tokenized Customer, Payment Instrument or Instrument Identifier information.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Payment Credentials**&lt;br&gt;Contains payment information such as the network token, generated cryptogram for Visa &amp; MasterCard or dynamic CVV for Amex in a JSON Web Encryption (JWE) response.&lt;br&gt;Your system can use this API to retrieve the Payment Credentials for an existing Customer, Payment Instrument or Instrument Identifier. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TokenApi;


TokenApi apiInstance = new TokenApi();
String tokenId = "tokenId_example"; // String | The Id of a token representing a Customer, Payment Instrument or Instrument Identifier.
PostPaymentCredentialsRequest postPaymentCredentialsRequest = new PostPaymentCredentialsRequest(); // PostPaymentCredentialsRequest | 
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    String result = apiInstance.postTokenPaymentCredentials(tokenId, postPaymentCredentialsRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#postTokenPaymentCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | **String**| The Id of a token representing a Customer, Payment Instrument or Instrument Identifier. |
 **postPaymentCredentialsRequest** | [**PostPaymentCredentialsRequest**](PostPaymentCredentialsRequest.md)|  |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/jose;charset=utf-8

