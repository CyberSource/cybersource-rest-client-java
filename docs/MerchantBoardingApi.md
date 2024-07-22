# MerchantBoardingApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRegistration**](MerchantBoardingApi.md#getRegistration) | **GET** /boarding/v1/registrations/{registrationId} | Gets all the information on a boarding registration
[**postRegistration**](MerchantBoardingApi.md#postRegistration) | **POST** /boarding/v1/registrations | Create a boarding registration


<a name="getRegistration"></a>
# **getRegistration**
> InlineResponse2002 getRegistration(registrationId)

Gets all the information on a boarding registration

This end point will get all information of a boarding registration 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantBoardingApi;


MerchantBoardingApi apiInstance = new MerchantBoardingApi();
String registrationId = "registrationId_example"; // String | Identifies the boarding registration to be updated
try {
    InlineResponse2002 result = apiInstance.getRegistration(registrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantBoardingApi#getRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationId** | **String**| Identifies the boarding registration to be updated |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postRegistration"></a>
# **postRegistration**
> InlineResponse2012 postRegistration(postRegistrationBody, vCIdempotencyId)

Create a boarding registration

Create a registration to board merchant  If you have  Card Processing product enabled in your boarding request, select payment processor from Configuration -&gt; Sample Request. You may unselect attributes from the Request Builder tree which you do not need in the request. For VPC, CUP and EFTPOS processors, replace the processor name from VPC or CUP or EFTPOS to the actual processor name in the sample request. e.g. replace VPC with &amp;lt;your vpc processor&amp;gt; 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.MerchantBoardingApi;


MerchantBoardingApi apiInstance = new MerchantBoardingApi();
PostRegistrationBody postRegistrationBody = new PostRegistrationBody(); // PostRegistrationBody | Boarding registration data
String vCIdempotencyId = "vCIdempotencyId_example"; // String | defines idempotency of the request
try {
    InlineResponse2012 result = apiInstance.postRegistration(postRegistrationBody, vCIdempotencyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantBoardingApi#postRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postRegistrationBody** | [**PostRegistrationBody**](PostRegistrationBody.md)| Boarding registration data |
 **vCIdempotencyId** | **String**| defines idempotency of the request | [optional]

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

