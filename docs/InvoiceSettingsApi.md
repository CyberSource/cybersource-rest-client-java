# InvoiceSettingsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInvoiceSettings**](InvoiceSettingsApi.md#getInvoiceSettings) | **GET** /invoicing/v2/invoiceSettings | Get Invoice Settings
[**updateInvoiceSettings**](InvoiceSettingsApi.md#updateInvoiceSettings) | **PUT** /invoicing/v2/invoiceSettings | Update Invoice Settings


<a name="getInvoiceSettings"></a>
# **getInvoiceSettings**
> InvoicingV2InvoiceSettingsGet200Response getInvoiceSettings()

Get Invoice Settings

Allows you to retrieve the invoice settings for the payment page.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InvoiceSettingsApi;


InvoiceSettingsApi apiInstance = new InvoiceSettingsApi();
try {
    InvoicingV2InvoiceSettingsGet200Response result = apiInstance.getInvoiceSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSettingsApi#getInvoiceSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InvoicingV2InvoiceSettingsGet200Response**](InvoicingV2InvoiceSettingsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

<a name="updateInvoiceSettings"></a>
# **updateInvoiceSettings**
> InvoicingV2InvoiceSettingsGet200Response updateInvoiceSettings(invoiceSettingsRequest)

Update Invoice Settings

Allows you to customize the payment page, the checkout experience, email communication and payer authentication. You can customize the invoice to match your brand with your business name, logo and brand colors, and a VAT Tax number. You can choose to capture the payers shipping details, phone number and email during the checkout process. You can add a custom message to all invoice emails and enable or disable payer authentication for invoice payments.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InvoiceSettingsApi;


InvoiceSettingsApi apiInstance = new InvoiceSettingsApi();
InvoiceSettingsRequest invoiceSettingsRequest = new InvoiceSettingsRequest(); // InvoiceSettingsRequest | 
try {
    InvoicingV2InvoiceSettingsGet200Response result = apiInstance.updateInvoiceSettings(invoiceSettingsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceSettingsApi#updateInvoiceSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceSettingsRequest** | [**InvoiceSettingsRequest**](InvoiceSettingsRequest.md)|  |

### Return type

[**InvoicingV2InvoiceSettingsGet200Response**](InvoicingV2InvoiceSettingsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

