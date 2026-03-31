# UnifiedCheckoutV1CaptureContextApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateUnifiedCheckoutV1CaptureContext**](UnifiedCheckoutV1CaptureContextApi.md#generateUnifiedCheckoutV1CaptureContext) | **POST** /uc/v1/sessions | Generate Unified Checkout V1 Capture Context


<a name="generateUnifiedCheckoutV1CaptureContext"></a>
# **generateUnifiedCheckoutV1CaptureContext**
> String generateUnifiedCheckoutV1CaptureContext(generateUnifiedCheckoutV1CaptureContextRequest)

Generate Unified Checkout V1 Capture Context

Unified Checkout is a powerful product within the Digital Acceptance Suite. Unified Checkout is designed to assist merchants with the adoption and inclusion of digital payments within their payment acceptance page. With Unified Checkout Integration you can add digital payment methods to create familiar, convenient and seamless payment experiences that are designed to reduce checkout friction and increase conversions. Click to Pay Drop-in UI is built on the Unified Checkout platform. For more information about Unified Checkout, see the [Unified Checkout Developer Guides Page](https://developer.cybersource.com/docs/cybs/en-us/unified-checkout/developer/all/rest/unified-checkout/uc-intro.html). For examples on how to integrate Unified Checkout within your webpage please see our [GitHub Unified Checkout Samples](https://github.com/CyberSource/cybersource-unified-checkout-sample-java). Generate Unified Checkout V1 Capture Context Generate a one-time use capture context used for the invocation of Unified Checkout. The Request wil contain all of the parameters for how Unified Checkout will operate within a client webpage. The resulting payload will be a JWT signed object that can be used to initiate Unified Checkout or Click to Pay Drop-in UI within a web page

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.UnifiedCheckoutV1CaptureContextApi;


UnifiedCheckoutV1CaptureContextApi apiInstance = new UnifiedCheckoutV1CaptureContextApi();
GenerateUnifiedCheckoutV1CaptureContextRequest generateUnifiedCheckoutV1CaptureContextRequest = new GenerateUnifiedCheckoutV1CaptureContextRequest(); // GenerateUnifiedCheckoutV1CaptureContextRequest | 
try {
    String result = apiInstance.generateUnifiedCheckoutV1CaptureContext(generateUnifiedCheckoutV1CaptureContextRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnifiedCheckoutV1CaptureContextApi#generateUnifiedCheckoutV1CaptureContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnifiedCheckoutV1CaptureContextRequest** | [**GenerateUnifiedCheckoutV1CaptureContextRequest**](GenerateUnifiedCheckoutV1CaptureContextRequest.md)|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/jwt

