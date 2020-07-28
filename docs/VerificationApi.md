# VerificationApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validateExportCompliance**](VerificationApi.md#validateExportCompliance) | **POST** /risk/v1/export-compliance-inquiries | Validate export compliance
[**verifyCustomerAddress**](VerificationApi.md#verifyCustomerAddress) | **POST** /risk/v1/address-verifications | Verify customer address


<a name="validateExportCompliance"></a>
# **validateExportCompliance**
> RiskV1ExportComplianceInquiriesPost201Response validateExportCompliance(validateExportComplianceRequest)

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
    RiskV1ExportComplianceInquiriesPost201Response result = apiInstance.validateExportCompliance(validateExportComplianceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#validateExportCompliance");
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
 - **Accept**: application/json;charset=utf-8

<a name="verifyCustomerAddress"></a>
# **verifyCustomerAddress**
> RiskV1AddressVerificationsPost201Response verifyCustomerAddress(verifyCustomerAddressRequest)

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
    RiskV1AddressVerificationsPost201Response result = apiInstance.verifyCustomerAddress(verifyCustomerAddressRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#verifyCustomerAddress");
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
 - **Accept**: application/json;charset=utf-8

