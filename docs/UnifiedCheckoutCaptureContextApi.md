# UnifiedCheckoutCaptureContextApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateUnifiedCheckoutCaptureContext**](UnifiedCheckoutCaptureContextApi.md#generateUnifiedCheckoutCaptureContext) | **POST** /up/v1/capture-contexts | Generate Unified Checkout Capture Context


<a name="generateUnifiedCheckoutCaptureContext"></a>
# **generateUnifiedCheckoutCaptureContext**
> String generateUnifiedCheckoutCaptureContext(generateUnifiedCheckoutCaptureContextRequest)

Generate Unified Checkout Capture Context

Generate a one-time use capture context used for the invocation of Unified Checkout. The Request wil contain all of the parameters for how Unified Checkout will operate within a client webpage. The resulting payload will be a JWT signed object that can be used to initiate Unified Checkout within a merchant web page

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.UnifiedCheckoutCaptureContextApi;


UnifiedCheckoutCaptureContextApi apiInstance = new UnifiedCheckoutCaptureContextApi();
GenerateUnifiedCheckoutCaptureContextRequest generateUnifiedCheckoutCaptureContextRequest = new GenerateUnifiedCheckoutCaptureContextRequest(); // GenerateUnifiedCheckoutCaptureContextRequest | 
try {
    String result = apiInstance.generateUnifiedCheckoutCaptureContext(generateUnifiedCheckoutCaptureContextRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnifiedCheckoutCaptureContextApi#generateUnifiedCheckoutCaptureContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnifiedCheckoutCaptureContextRequest** | [**GenerateUnifiedCheckoutCaptureContextRequest**](GenerateUnifiedCheckoutCaptureContextRequest.md)|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/jwt

