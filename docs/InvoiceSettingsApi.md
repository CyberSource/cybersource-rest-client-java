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

Get the invoice settings for the invoice payment page.

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

Update invoice settings for the invoice payment page.

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

