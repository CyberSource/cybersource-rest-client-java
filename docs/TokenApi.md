# TokenApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCardArtAsset**](TokenApi.md#getCardArtAsset) | **GET** /tms/v2/tokens/{instrumentIdentifierId}/{tokenProvider}/assets/{assetType} | Retrieve Card Art
[**postTokenPaymentCredentials**](TokenApi.md#postTokenPaymentCredentials) | **POST** /tms/v2/tokens/{tokenId}/payment-credentials | Generate Payment Credentials v2
[**postTokenPaymentCredentialsV3**](TokenApi.md#postTokenPaymentCredentialsV3) | **POST** /tms/v3/tokens/{tokenId}/payment-credentials | Generate Payment Credentials Latest Version v3


<a name="getCardArtAsset"></a>
# **getCardArtAsset**
> InlineResponse2002 getCardArtAsset(instrumentIdentifierId, tokenProvider, assetType)

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
    InlineResponse2002 result = apiInstance.getCardArtAsset(instrumentIdentifierId, tokenProvider, assetType);
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

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postTokenPaymentCredentials"></a>
# **postTokenPaymentCredentials**
> String postTokenPaymentCredentials(tokenId, postPaymentCredentialsRequest, profileId)

Generate Payment Credentials v2

**Note**: This resource will be replace by [payment credentials version 3](#/paths/~1tms~1v3~1tokens~1{tokenId}~1payment-credentials/post). The SDK will remain available for now; however, it will no longer be documented or maintain in the Developer Centre.&lt;br&gt; **Token**&lt;br&gt;A Token can represent your tokenized Customer, Payment Instrument, Instrument Identifier or Tokenized Card information.&lt;br&gt; **Payment Credentials**&lt;br&gt;Contains payment information such as the network token, generated cryptogram for Visa &amp; MasterCard or dynamic CVV for Amex in a JSON Web Encryption (JWE) response.&lt;br&gt;Your system can use this API to retrieve the Payment Credentials for an existing Customer, Payment Instrument, Instrument Identifier or Tokenized Card.&lt;br&gt;Optionally, **authenticated identities** information from Passkey authentication can be provided to potentially achieve liability shift, which may result in the return of an e-commerce indicator of 5 if successful. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TokenApi;


TokenApi apiInstance = new TokenApi();
String tokenId = "tokenId_example"; // String | The Id of a token representing a Customer, Payment Instrument or Instrument Identifier.
PostPaymentCredentialsRequest1 postPaymentCredentialsRequest = new PostPaymentCredentialsRequest1(); // PostPaymentCredentialsRequest1 | 
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
 **postPaymentCredentialsRequest** | [**PostPaymentCredentialsRequest1**](PostPaymentCredentialsRequest1.md)|  |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/jose;charset=utf-8

<a name="postTokenPaymentCredentialsV3"></a>
# **postTokenPaymentCredentialsV3**
> InlineResponse2011 postTokenPaymentCredentialsV3(tokenId, postPaymentCredentialsRequest, profileId)

Generate Payment Credentials Latest Version v3

**Payment Credentials**&lt;br&gt;Contains payment information such as the network token, generated TAVV cryptogram for Visa &amp; MasterCard, dynamic CVV for Amex, or DTVV cryptogram for VISA. This latest version (v3) returns the Primary Account Number details, if the network token is not present. The response is provided in JSON Web Encryption (JWE) format. &lt;br&gt;Your system can use this API to retrieve the Payment Credentials for an existing Customer, Payment Instrument, Instrument Identifier or Tokenized Card.&lt;br&gt;Optionally, **authenticated identities** information from Passkey authentication can be provided to potentially achieve liability shift, which may result in the return of an e-commerce indicator of 5 if successful. 

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
    InlineResponse2011 result = apiInstance.postTokenPaymentCredentialsV3(tokenId, postPaymentCredentialsRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#postTokenPaymentCredentialsV3");
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

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/jose;charset=utf-8

