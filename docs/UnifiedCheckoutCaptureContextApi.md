# UnifiedCheckoutCaptureContextApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateUnifiedCheckoutCaptureContext**](UnifiedCheckoutCaptureContextApi.md#generateUnifiedCheckoutCaptureContext) | **POST** /up/v1/capture-contexts | Generate Unified Checkout Capture Context


<a name="generateUnifiedCheckoutCaptureContext"></a>
# **generateUnifiedCheckoutCaptureContext**
> String generateUnifiedCheckoutCaptureContext(generateUnifiedCheckoutCaptureContextRequest)

Generate Unified Checkout Capture Context

Unified Checkout is a powerful product within the Digital Acceptance Suite. Unified Checkout is designed to assist merchants with the adoption and inclusion of digital payments within their payment acceptance page. With Unified Checkout Integration you can add digital payment methods to create familiar, convenient and seamless payment experiences that are designed to reduce checkout friction and increase conversions. Click to Pay Drop-in UI is built on the Unified Checkout platform. For more information about Unified Checkout, see the [Unified Checkout Developer Guides Page](https://developer.cybersource.com/docs/cybs/en-us/unified-checkout/developer/all/rest/unified-checkout/uc-intro.html). For examples on how to integrate Unified Checkout within your webpage please see our [GitHub Unified Checkout Samples](https://github.com/CyberSource/cybersource-unified-checkout-sample-java). Generate Unified Checkout Capture Context Generate a one-time use capture context used for the invocation of Unified Checkout. The Request wil contain all of the parameters for how Unified Checkout will operate within a client webpage. The resulting payload will be a JWT signed object that can be used to initiate Unified Checkout or Click to Pay Drop-in UI within a web page

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

