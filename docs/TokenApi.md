# TokenApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postTokenPaymentCredentials**](TokenApi.md#postTokenPaymentCredentials) | **POST** /tms/v2/tokens/{tokenId}/payment-credentials | Generate Payment Credentials for a TMS Token


<a name="postTokenPaymentCredentials"></a>
# **postTokenPaymentCredentials**
> String postTokenPaymentCredentials(tokenId, profileId)

Generate Payment Credentials for a TMS Token

|  |  |  |     | --- | --- | --- |     |**Token**&lt;br&gt;A Token can represent your tokenized Customer, Payment Instrument or Instrument Identifier information.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Payment Credentials**&lt;br&gt;Contains payment information such as the network token, generated cryptogram for Visa &amp; MasterCard or dynamic CVV for Amex in a JSON Web Encryption (JWE) response.&lt;br&gt;Your system can use this API to retrieve the Payment Credentials for an existing Customer, Payment Instrument or Instrument Identifier. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TokenApi;


TokenApi apiInstance = new TokenApi();
String tokenId = "tokenId_example"; // String | The Id of a token representing a Customer, Payment Instrument or Instrument Identifier.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    String result = apiInstance.postTokenPaymentCredentials(tokenId, profileId);
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
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/jose;charset=utf-8

