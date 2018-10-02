# KeyGenerationApi

All URIs are relative to *https://api.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generatePublicKey**](KeyGenerationApi.md#generatePublicKey) | **POST** /payments/flex/v1/keys/ | Generate Key


<a name="generatePublicKey"></a>
# **generatePublicKey**
> InlineResponse200 generatePublicKey(generatePublicKeyRequest)

Generate Key

Generate a one-time use public key and key ID to encrypt the card number in the follow-on Tokenize Card request. The key used to encrypt the card number on the cardholder’s device or browser is valid for 15 minutes and must be used to verify the signature in the response message. CyberSource recommends creating a new key for each order. Generating a key is an authenticated request initiated from your servers, prior to requesting to tokenize the card data from your customer’s device or browser.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.KeyGenerationApi;


KeyGenerationApi apiInstance = new KeyGenerationApi();
GeneratePublicKeyRequest generatePublicKeyRequest = new GeneratePublicKeyRequest(); // GeneratePublicKeyRequest | 
try {
    InlineResponse200 result = apiInstance.generatePublicKey(generatePublicKeyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyGenerationApi#generatePublicKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generatePublicKeyRequest** | [**GeneratePublicKeyRequest**](GeneratePublicKeyRequest.md)|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

