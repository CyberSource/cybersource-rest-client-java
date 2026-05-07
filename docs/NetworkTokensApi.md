# NetworkTokensApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCardArtAsset**](NetworkTokensApi.md#getCardArtAsset) | **GET** /tms/v2/tokens/{instrumentIdentifierId}/{tokenProvider}/assets/{assetType} | Retrieve Card Art
[**getTokenizedCard**](NetworkTokensApi.md#getTokenizedCard) | **GET** /tms/v2/tokenized-cards/{tokenizedCardId} | Retrieve a Tokenized Card
[**postIssuerLifeCycleSimulation**](NetworkTokensApi.md#postIssuerLifeCycleSimulation) | **POST** /tms/v2/tokenized-cards/{tokenizedCardId}/issuer-life-cycle-event-simulations | Simulate Issuer Life Cycle Management Events
[**postTokenPaymentCredentials**](NetworkTokensApi.md#postTokenPaymentCredentials) | **POST** /tms/v2/tokens/{tokenId}/payment-credentials | Generate Payment Credentials v2
[**postTokenPaymentCredentialsV3**](NetworkTokensApi.md#postTokenPaymentCredentialsV3) | **POST** /tms/v3/tokens/{tokenId}/payment-credentials | Generate Payment Credentials Latest Version v3
[**postTokenizedCard**](NetworkTokensApi.md#postTokenizedCard) | **POST** /tms/v2/tokenized-cards | Create a Tokenized Card
[**postTokenizedCardDelete**](NetworkTokensApi.md#postTokenizedCardDelete) | **POST** /tms/v2/tokenized-cards/{tokenizedCardId}/delete | Delete a Tokenized Card


<a name="getCardArtAsset"></a>
# **getCardArtAsset**
> InlineResponse2002 getCardArtAsset(instrumentIdentifierId, tokenProvider, assetType)

Retrieve Card Art

Retrieves Card Art for a specific Instrument Identifier. The Card Art is a visual representation of the cardholder&#39;s payment card. Card Art is only available if a Network Token is successfully provisioned. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.NetworkTokensApi;


NetworkTokensApi apiInstance = new NetworkTokensApi();
String instrumentIdentifierId = "instrumentIdentifierId_example"; // String | The Id of an Instrument Identifier.
String tokenProvider = "tokenProvider_example"; // String | The token provider.
String assetType = "assetType_example"; // String | The type of asset.
try {
    InlineResponse2002 result = apiInstance.getCardArtAsset(instrumentIdentifierId, tokenProvider, assetType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkTokensApi#getCardArtAsset");
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

<a name="getTokenizedCard"></a>
# **getTokenizedCard**
> InlineResponse2001 getTokenizedCard(tokenizedCardId, profileId)

Retrieve a Tokenized Card

|**Tokenized Cards**&lt;br&gt;A Tokenized Card represents a network token. Network tokens perform better than regular card numbers and they are not necessarily invalidated when a cardholder loses their card, or it expires. This API returns the details of a tokenized card stored in TMS. You can use this API to check the status of a tokenized card and retrieve details such as the last four digits of the underlying card, expiration date, and card type. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.NetworkTokensApi;


NetworkTokensApi apiInstance = new NetworkTokensApi();
String tokenizedCardId = "tokenizedCardId_example"; // String | The Id of a tokenized card.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    InlineResponse2001 result = apiInstance.getTokenizedCard(tokenizedCardId, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkTokensApi#getTokenizedCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenizedCardId** | **String**| The Id of a tokenized card. |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postIssuerLifeCycleSimulation"></a>
# **postIssuerLifeCycleSimulation**
> postIssuerLifeCycleSimulation(profileId, tokenizedCardId, postIssuerLifeCycleSimulationRequest)

Simulate Issuer Life Cycle Management Events

**Lifecycle Management Events**&lt;br&gt;Simulates an issuer life cycle manegement event for updates on the tokenized card. The events that can be simulated are: - Token status changes (e.g. active, suspended, deleted) - Updates to the underlying card, including card art changes, expiration date changes, and card number suffix. **Note:** This is only available in CAS environment. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.NetworkTokensApi;


NetworkTokensApi apiInstance = new NetworkTokensApi();
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
String tokenizedCardId = "tokenizedCardId_example"; // String | The Id of a tokenized card.
PostIssuerLifeCycleSimulationRequest postIssuerLifeCycleSimulationRequest = new PostIssuerLifeCycleSimulationRequest(); // PostIssuerLifeCycleSimulationRequest | 
try {
    apiInstance.postIssuerLifeCycleSimulation(profileId, tokenizedCardId, postIssuerLifeCycleSimulationRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkTokensApi#postIssuerLifeCycleSimulation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. |
 **tokenizedCardId** | **String**| The Id of a tokenized card. |
 **postIssuerLifeCycleSimulationRequest** | [**PostIssuerLifeCycleSimulationRequest**](PostIssuerLifeCycleSimulationRequest.md)|  |

### Return type

null (empty response body)

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
//import Api.NetworkTokensApi;


NetworkTokensApi apiInstance = new NetworkTokensApi();
String tokenId = "tokenId_example"; // String | The Id of a token representing a Customer, Payment Instrument or Instrument Identifier.
PostPaymentCredentialsRequest1 postPaymentCredentialsRequest = new PostPaymentCredentialsRequest1(); // PostPaymentCredentialsRequest1 | 
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    String result = apiInstance.postTokenPaymentCredentials(tokenId, postPaymentCredentialsRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkTokensApi#postTokenPaymentCredentials");
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
//import Api.NetworkTokensApi;


NetworkTokensApi apiInstance = new NetworkTokensApi();
String tokenId = "tokenId_example"; // String | The Id of a token representing a Customer, Payment Instrument or Instrument Identifier.
PostPaymentCredentialsRequest postPaymentCredentialsRequest = new PostPaymentCredentialsRequest(); // PostPaymentCredentialsRequest | 
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    InlineResponse2011 result = apiInstance.postTokenPaymentCredentialsV3(tokenId, postPaymentCredentialsRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkTokensApi#postTokenPaymentCredentialsV3");
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

<a name="postTokenizedCard"></a>
# **postTokenizedCard**
> InlineResponse2001 postTokenizedCard(postTokenizedCardRequest, profileId)

Create a Tokenized Card

**Tokenized cards**&lt;br&gt;A Tokenized card represents a network token. Network tokens perform better than regular card numbers and they are not necessarily invalidated when a cardholder loses their card, or it expires. This API submits a request to the card association to create a network token. If successful, a tokenized card will be created in TMS to represent the network token. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.NetworkTokensApi;


NetworkTokensApi apiInstance = new NetworkTokensApi();
PostTokenizedCardRequest postTokenizedCardRequest = new PostTokenizedCardRequest(); // PostTokenizedCardRequest | 
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    InlineResponse2001 result = apiInstance.postTokenizedCard(postTokenizedCardRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkTokensApi#postTokenizedCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postTokenizedCardRequest** | [**PostTokenizedCardRequest**](PostTokenizedCardRequest.md)|  |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postTokenizedCardDelete"></a>
# **postTokenizedCardDelete**
> postTokenizedCardDelete(tokenizedCardId, profileId, postTokenizedCardDeleteRequest)

Delete a Tokenized Card

This API attempts to delete a network token from the card association with a specified reason. | If successful, the corresponding tokenized card will be deleted. | The reason for deletion can be specified to provide context for the deletion operation. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.NetworkTokensApi;


NetworkTokensApi apiInstance = new NetworkTokensApi();
String tokenizedCardId = "tokenizedCardId_example"; // String | The Id of a tokenized card.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
TmsTokenizedCardDeleteRequest postTokenizedCardDeleteRequest = new TmsTokenizedCardDeleteRequest(); // TmsTokenizedCardDeleteRequest | 
try {
    apiInstance.postTokenizedCardDelete(tokenizedCardId, profileId, postTokenizedCardDeleteRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkTokensApi#postTokenizedCardDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenizedCardId** | **String**| The Id of a tokenized card. |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]
 **postTokenizedCardDeleteRequest** | [**TmsTokenizedCardDeleteRequest**](TmsTokenizedCardDeleteRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

