# FlexApiApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateFlexAPICaptureContext**](FlexApiApi.md#generateFlexAPICaptureContext) | **POST** /flex/v2/sessions | Establish a Payment Session with a Capture Context


<a name="generateFlexAPICaptureContext"></a>
# **generateFlexAPICaptureContext**
> String generateFlexAPICaptureContext(generateFlexAPICaptureContextRequest)

Establish a Payment Session with a Capture Context

To establish a payment session, include the API fields you plan to use in that session in the body of the request.  The system then returns a JSON Web Token (JWT) that includes the capture context.   To determine which fields to include in your capture context, identify the personal information that you wish to isolate from the payment session.  **Capture Context Fields**&lt;br&gt; When making a session request, any fields that you request to be added to the capture context are required by default.  However, you can choose to make a field optional by setting the required parameter to false. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.FlexApiApi;


FlexApiApi apiInstance = new FlexApiApi();
GenerateFlexAPICaptureContextRequest generateFlexAPICaptureContextRequest = new GenerateFlexAPICaptureContextRequest(); // GenerateFlexAPICaptureContextRequest | 
try {
    String result = apiInstance.generateFlexAPICaptureContext(generateFlexAPICaptureContextRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlexApiApi#generateFlexAPICaptureContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateFlexAPICaptureContextRequest** | [**GenerateFlexAPICaptureContextRequest**](GenerateFlexAPICaptureContextRequest.md)|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/jwt

