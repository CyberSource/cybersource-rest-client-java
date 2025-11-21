# BankAccountValidationApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bankAccountValidationRequest**](BankAccountValidationApi.md#bankAccountValidationRequest) | **POST** /bavs/v1/account-validations | Visa Bank Account Validation Service


<a name="bankAccountValidationRequest"></a>
# **bankAccountValidationRequest**
> InlineResponse20014 bankAccountValidationRequest(accountValidationsRequest)

Visa Bank Account Validation Service

The Visa Bank Account Validation Service is a new standalone product designed to validate customer&#39;s routing and bank account number combination for ACH transactions. Merchant&#39;s can use this standalone product to validate their customer&#39;s account prior to processing an ACH transaction against the customer&#39;s account to comply with Nacha&#39;s account validation mandate for Web-debit transactions. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.BankAccountValidationApi;


BankAccountValidationApi apiInstance = new BankAccountValidationApi();
AccountValidationsRequest accountValidationsRequest = new AccountValidationsRequest(); // AccountValidationsRequest | 
try {
    InlineResponse20014 result = apiInstance.bankAccountValidationRequest(accountValidationsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountValidationApi#bankAccountValidationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountValidationsRequest** | [**AccountValidationsRequest**](AccountValidationsRequest.md)|  |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

