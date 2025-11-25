# TokenizeApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tokenize**](TokenizeApi.md#tokenize) | **POST** /tms/v2/tokenize | Tokenize


<a name="tokenize"></a>
# **tokenize**
> InlineResponse200 tokenize(postTokenizeRequest, profileId)

Tokenize

|  |  |  |   | --- | --- | --- | |The **Tokenize API** endpoint facilitates the creation of various TMS tokens such as Customers, Payment Instruments, Shipping Addresses, and Instrument Identifiers in a single operation. The request includes a processingInformation object, which specifies **\&quot;TOKEN_CREATE\&quot;** and the types of tokens to be created. The **tokenInformation** section of the request includes detailed information relevant to each token type. This includes attributes for Customers, Payment Instruments, Shipping Addresses, Instrument Identifiers and Transient Token data. The payload is flexible, allowing for different combinations of tokens to be created in a single request.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|The **API response** includes a responses array, which details the outcome of the tokenization process for each requested resource type, such as Customer, Payment Instrument, Shipping Address, and Instrument Identifier. Each entry in this array provides an HTTP status code such as **201/200 for successful creations**, and a unique identifier for the newly created token.&lt;br&gt;In cases where token creation encounters issues, the response includes a **non-2XX** status code and an errors array for the affected resource. Each error object in the array details the **error type and a descriptive message** providing insight into why a particular token creation was not attempted or failed. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TokenizeApi;


TokenizeApi apiInstance = new TokenizeApi();
PostTokenizeRequest postTokenizeRequest = new PostTokenizeRequest(); // PostTokenizeRequest | 
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    InlineResponse200 result = apiInstance.tokenize(postTokenizeRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenizeApi#tokenize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postTokenizeRequest** | [**PostTokenizeRequest**](PostTokenizeRequest.md)|  |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

