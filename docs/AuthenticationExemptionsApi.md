# AuthenticationExemptionsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticationExemptions**](AuthenticationExemptionsApi.md#authenticationExemptions) | **POST** /risk/v1/authentication-exemptions | Authentication exemptions service


<a name="authenticationExemptions"></a>
# **authenticationExemptions**
> RiskV1AuthenticationExemptionsPost201Response authenticationExemptions(authenticationExemptionsRequest)

Authentication exemptions service

A new CYBS branded service to connect to VISA’s REST API to enable Visa Transaction Advisor (VTA) as a standalone service for merchants to support PSD2/SCA adoption and exemptions processing startegy in Europe.VTA Provides intelligent risk data to merchants as inputs to their in-house fraud management tools for fraud mitigation on Visa transactions. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AuthenticationExemptionsApi;


AuthenticationExemptionsApi apiInstance = new AuthenticationExemptionsApi();
AuthenticationExemptionsRequest authenticationExemptionsRequest = new AuthenticationExemptionsRequest(); // AuthenticationExemptionsRequest | 
try {
    RiskV1AuthenticationExemptionsPost201Response result = apiInstance.authenticationExemptions(authenticationExemptionsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationExemptionsApi#authenticationExemptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationExemptionsRequest** | [**AuthenticationExemptionsRequest**](AuthenticationExemptionsRequest.md)|  |

### Return type

[**RiskV1AuthenticationExemptionsPost201Response**](RiskV1AuthenticationExemptionsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

