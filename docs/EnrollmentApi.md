# EnrollmentApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enrollCard**](EnrollmentApi.md#enrollCard) | **POST** /acp/v1/tokens | Enroll a card


<a name="enrollCard"></a>
# **enrollCard**
> AgenticCardEnrollmentResponse200 enrollCard(agenticCardEnrollmentRequest)

Enroll a card

Enroll a card for tokenization during the customer&#39;s account registration or when the customer starts a new purchase intent.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.EnrollmentApi;


EnrollmentApi apiInstance = new EnrollmentApi();
AgenticCardEnrollmentRequest agenticCardEnrollmentRequest = new AgenticCardEnrollmentRequest(); // AgenticCardEnrollmentRequest | 
try {
    AgenticCardEnrollmentResponse200 result = apiInstance.enrollCard(agenticCardEnrollmentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnrollmentApi#enrollCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agenticCardEnrollmentRequest** | [**AgenticCardEnrollmentRequest**](AgenticCardEnrollmentRequest.md)|  |

### Return type

[**AgenticCardEnrollmentResponse200**](AgenticCardEnrollmentResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

