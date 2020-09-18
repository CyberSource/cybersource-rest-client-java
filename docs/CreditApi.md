# CreditApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCredit**](CreditApi.md#createCredit) | **POST** /pts/v2/credits | Process a Credit


<a name="createCredit"></a>
# **createCredit**
> PtsV2CreditsPost201Response createCredit(createCreditRequest)

Process a Credit

POST to the credit resource to credit funds to a specified credit card.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CreditApi;


CreditApi apiInstance = new CreditApi();
CreateCreditRequest createCreditRequest = new CreateCreditRequest(); // CreateCreditRequest | 
try {
    PtsV2CreditsPost201Response result = apiInstance.createCredit(createCreditRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditApi#createCredit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCreditRequest** | [**CreateCreditRequest**](CreateCreditRequest.md)|  |

### Return type

[**PtsV2CreditsPost201Response**](PtsV2CreditsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

