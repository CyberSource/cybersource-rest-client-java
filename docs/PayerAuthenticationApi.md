# PayerAuthenticationApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkPayerAuthEnrollment**](PayerAuthenticationApi.md#checkPayerAuthEnrollment) | **POST** /risk/v1/authentications | Check Payer Auth Enrollment
[**validateAuthenticationResults**](PayerAuthenticationApi.md#validateAuthenticationResults) | **POST** /risk/v1/authentication-results | Validate Authentication Results


<a name="checkPayerAuthEnrollment"></a>
# **checkPayerAuthEnrollment**
> RiskV1AuthenticationsPost201Response checkPayerAuthEnrollment(checkPayerAuthEnrollmentRequest)

Check Payer Auth Enrollment

This call verifies that the card is enrolled in a card authentication program.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PayerAuthenticationApi;


PayerAuthenticationApi apiInstance = new PayerAuthenticationApi();
CheckPayerAuthEnrollmentRequest checkPayerAuthEnrollmentRequest = new CheckPayerAuthEnrollmentRequest(); // CheckPayerAuthEnrollmentRequest | 
try {
    RiskV1AuthenticationsPost201Response result = apiInstance.checkPayerAuthEnrollment(checkPayerAuthEnrollmentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayerAuthenticationApi#checkPayerAuthEnrollment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkPayerAuthEnrollmentRequest** | [**CheckPayerAuthEnrollmentRequest**](CheckPayerAuthEnrollmentRequest.md)|  |

### Return type

[**RiskV1AuthenticationsPost201Response**](RiskV1AuthenticationsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="validateAuthenticationResults"></a>
# **validateAuthenticationResults**
> RiskV1AuthenticationResultsPost201Response validateAuthenticationResults(validateRequest)

Validate Authentication Results

This call retrieves and validates the authentication results from issuer and allows the merchant to proceed with processing the payment. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PayerAuthenticationApi;


PayerAuthenticationApi apiInstance = new PayerAuthenticationApi();
ValidateRequest validateRequest = new ValidateRequest(); // ValidateRequest | 
try {
    RiskV1AuthenticationResultsPost201Response result = apiInstance.validateAuthenticationResults(validateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayerAuthenticationApi#validateAuthenticationResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validateRequest** | [**ValidateRequest**](ValidateRequest.md)|  |

### Return type

[**RiskV1AuthenticationResultsPost201Response**](RiskV1AuthenticationResultsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

