# BillingAgreementsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**billingAgreementsDeRegistration**](BillingAgreementsApi.md#billingAgreementsDeRegistration) | **PATCH** /pts/v2/billing-agreements/{id} | Standing Instruction Cancellation or Modification
[**billingAgreementsIntimation**](BillingAgreementsApi.md#billingAgreementsIntimation) | **POST** /pts/v2/billing-agreements/{id}/intimations | Standing Instruction intimation
[**billingAgreementsRegistration**](BillingAgreementsApi.md#billingAgreementsRegistration) | **POST** /pts/v2/billing-agreements | Standing Instruction completion registration


<a name="billingAgreementsDeRegistration"></a>
# **billingAgreementsDeRegistration**
> PtsV2CreditsPost201Response1 billingAgreementsDeRegistration(modifyBillingAgreement, id)

Standing Instruction Cancellation or Modification

Standing Instruction with or without Token

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.BillingAgreementsApi;


BillingAgreementsApi apiInstance = new BillingAgreementsApi();
ModifyBillingAgreement modifyBillingAgreement = new ModifyBillingAgreement(); // ModifyBillingAgreement | 
String id = "id_example"; // String | ID for de-registration or cancellation of Billing Agreement
try {
    PtsV2CreditsPost201Response1 result = apiInstance.billingAgreementsDeRegistration(modifyBillingAgreement, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAgreementsApi#billingAgreementsDeRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modifyBillingAgreement** | [**ModifyBillingAgreement**](ModifyBillingAgreement.md)|  |
 **id** | **String**| ID for de-registration or cancellation of Billing Agreement |

### Return type

[**PtsV2CreditsPost201Response1**](PtsV2CreditsPost201Response1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="billingAgreementsIntimation"></a>
# **billingAgreementsIntimation**
> PtsV2CreditsPost201Response1 billingAgreementsIntimation(intimateBillingAgreement, id)

Standing Instruction intimation

Standing Instruction with or without Token.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.BillingAgreementsApi;


BillingAgreementsApi apiInstance = new BillingAgreementsApi();
IntimateBillingAgreement intimateBillingAgreement = new IntimateBillingAgreement(); // IntimateBillingAgreement | 
String id = "id_example"; // String | ID for intimation of Billing Agreement
try {
    PtsV2CreditsPost201Response1 result = apiInstance.billingAgreementsIntimation(intimateBillingAgreement, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAgreementsApi#billingAgreementsIntimation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intimateBillingAgreement** | [**IntimateBillingAgreement**](IntimateBillingAgreement.md)|  |
 **id** | **String**| ID for intimation of Billing Agreement |

### Return type

[**PtsV2CreditsPost201Response1**](PtsV2CreditsPost201Response1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="billingAgreementsRegistration"></a>
# **billingAgreementsRegistration**
> PtsV2CreditsPost201Response1 billingAgreementsRegistration(createBillingAgreement)

Standing Instruction completion registration

Standing Instruction with or without Token. Transaction amount in case First payment is coming along with registration. Only 2 decimal places allowed

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.BillingAgreementsApi;


BillingAgreementsApi apiInstance = new BillingAgreementsApi();
CreateBillingAgreement createBillingAgreement = new CreateBillingAgreement(); // CreateBillingAgreement | 
try {
    PtsV2CreditsPost201Response1 result = apiInstance.billingAgreementsRegistration(createBillingAgreement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAgreementsApi#billingAgreementsRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBillingAgreement** | [**CreateBillingAgreement**](CreateBillingAgreement.md)|  |

### Return type

[**PtsV2CreditsPost201Response1**](PtsV2CreditsPost201Response1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

