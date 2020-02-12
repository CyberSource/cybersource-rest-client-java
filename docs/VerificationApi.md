# VerificationApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**riskV1AddressVerificationsPost**](VerificationApi.md#riskV1AddressVerificationsPost) | **POST** /risk/v1/address-verifications | Verify customer address
[**riskV1ExportComplianceInquiriesPost**](VerificationApi.md#riskV1ExportComplianceInquiriesPost) | **POST** /risk/v1/export-compliance-inquiries | Validate export compliance


<a name="riskV1AddressVerificationsPost"></a>
# **riskV1AddressVerificationsPost**
> RiskV1AddressVerificationsPost201Response riskV1AddressVerificationsPost(verifyCustomerAddressRequest)

Verify customer address

This call verifies that the customer address submitted is valid.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.VerificationApi;


VerificationApi apiInstance = new VerificationApi();
VerifyCustomerAddressRequest verifyCustomerAddressRequest = new VerifyCustomerAddressRequest(); // VerifyCustomerAddressRequest | 
try {
    RiskV1AddressVerificationsPost201Response result = apiInstance.riskV1AddressVerificationsPost(verifyCustomerAddressRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#riskV1AddressVerificationsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyCustomerAddressRequest** | [**VerifyCustomerAddressRequest**](VerifyCustomerAddressRequest.md)|  |

### Return type

[**RiskV1AddressVerificationsPost201Response**](RiskV1AddressVerificationsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="riskV1ExportComplianceInquiriesPost"></a>
# **riskV1ExportComplianceInquiriesPost**
> RiskV1ExportComplianceInquiriesPost201Response riskV1ExportComplianceInquiriesPost(validateExportComplianceRequest)

Validate export compliance

This call checks customer data against specified watch lists to ensure export compliance. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.VerificationApi;


VerificationApi apiInstance = new VerificationApi();
ValidateExportComplianceRequest validateExportComplianceRequest = new ValidateExportComplianceRequest(); // ValidateExportComplianceRequest | 
try {
    RiskV1ExportComplianceInquiriesPost201Response result = apiInstance.riskV1ExportComplianceInquiriesPost(validateExportComplianceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#riskV1ExportComplianceInquiriesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validateExportComplianceRequest** | [**ValidateExportComplianceRequest**](ValidateExportComplianceRequest.md)|  |

### Return type

[**RiskV1ExportComplianceInquiriesPost201Response**](RiskV1ExportComplianceInquiriesPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

