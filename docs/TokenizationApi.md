# TokenizationApi

All URIs are relative to *https://api.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tokenize**](TokenizationApi.md#tokenize) | **POST** /payments/flex/v1/tokens/ | Tokenize card


<a name="tokenize"></a>
# **tokenize**
> InlineResponse2001 tokenize(tokenizeRequest)

Tokenize card

Returns a token representing the supplied card details. The token replaces card data and can be used as the Subscription ID in the CyberSource Simple Order API or SCMP API. This is an unauthenticated call that you should initiate from your customer’s device or browser.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TokenizationApi;


TokenizationApi apiInstance = new TokenizationApi();
TokenizeRequest tokenizeRequest = new TokenizeRequest(); // TokenizeRequest | 
try {
    InlineResponse2001 result = apiInstance.tokenize(tokenizeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenizationApi#tokenize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenizeRequest** | [**TokenizeRequest**](TokenizeRequest.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

