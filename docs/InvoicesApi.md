# InvoicesApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInvoice**](InvoicesApi.md#createInvoice) | **POST** /invoicing/v2/invoices | Create a New Invoice
[**getAllInvoices**](InvoicesApi.md#getAllInvoices) | **GET** /invoicing/v2/invoices | Get a List of Invoices
[**getInvoice**](InvoicesApi.md#getInvoice) | **GET** /invoicing/v2/invoices/{id} | Get Invoice Details
[**performCancelAction**](InvoicesApi.md#performCancelAction) | **POST** /invoicing/v2/invoices/{id}/cancelation | Cancel an Invoice
[**performSendAction**](InvoicesApi.md#performSendAction) | **POST** /invoicing/v2/invoices/{id}/delivery | Send an Invoice
[**updateInvoice**](InvoicesApi.md#updateInvoice) | **PUT** /invoicing/v2/invoices/{id} | Update an Invoice


<a name="createInvoice"></a>
# **createInvoice**
> InvoicingV2InvoicesPost201Response createInvoice(createInvoiceRequest)

Create a New Invoice

Create a new invoice.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InvoicesApi;


InvoicesApi apiInstance = new InvoicesApi();
CreateInvoiceRequest createInvoiceRequest = new CreateInvoiceRequest(); // CreateInvoiceRequest | 
try {
    InvoicingV2InvoicesPost201Response result = apiInstance.createInvoice(createInvoiceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#createInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInvoiceRequest** | [**CreateInvoiceRequest**](CreateInvoiceRequest.md)|  |

### Return type

[**InvoicingV2InvoicesPost201Response**](InvoicingV2InvoicesPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getAllInvoices"></a>
# **getAllInvoices**
> InvoicingV2InvoicesAllGet200Response getAllInvoices(offset, limit, status)

Get a List of Invoices

Get a list of invoices.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InvoicesApi;


InvoicesApi apiInstance = new InvoicesApi();
Integer offset = 56; // Integer | Page offset number.
Integer limit = 56; // Integer | Maximum number of items you would like returned.
String status = "status_example"; // String | The status of the invoice.  Possible values:   - DRAFT   - CREATED   - SENT   - PARTIAL   - PAID   - CANCELED 
try {
    InvoicingV2InvoicesAllGet200Response result = apiInstance.getAllInvoices(offset, limit, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#getAllInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Page offset number. |
 **limit** | **Integer**| Maximum number of items you would like returned. |
 **status** | **String**| The status of the invoice.  Possible values:   - DRAFT   - CREATED   - SENT   - PARTIAL   - PAID   - CANCELED  | [optional]

### Return type

[**InvoicingV2InvoicesAllGet200Response**](InvoicingV2InvoicesAllGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getInvoice"></a>
# **getInvoice**
> InvoicingV2InvoicesGet200Response getInvoice(id)

Get Invoice Details

Get the details of a specific invoice.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InvoicesApi;


InvoicesApi apiInstance = new InvoicesApi();
String id = "id_example"; // String | The invoice number.
try {
    InvoicingV2InvoicesGet200Response result = apiInstance.getInvoice(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#getInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The invoice number. |

### Return type

[**InvoicingV2InvoicesGet200Response**](InvoicingV2InvoicesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="performCancelAction"></a>
# **performCancelAction**
> InvoicingV2InvoicesPost201Response performCancelAction(id)

Cancel an Invoice

Cancel an invoice.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InvoicesApi;


InvoicesApi apiInstance = new InvoicesApi();
String id = "id_example"; // String | The invoice number.
try {
    InvoicingV2InvoicesPost201Response result = apiInstance.performCancelAction(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#performCancelAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The invoice number. |

### Return type

[**InvoicingV2InvoicesPost201Response**](InvoicingV2InvoicesPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="performSendAction"></a>
# **performSendAction**
> InvoicingV2InvoicesPost201Response performSendAction(id)

Send an Invoice

Send an invoice.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InvoicesApi;


InvoicesApi apiInstance = new InvoicesApi();
String id = "id_example"; // String | The invoice number.
try {
    InvoicingV2InvoicesPost201Response result = apiInstance.performSendAction(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#performSendAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The invoice number. |

### Return type

[**InvoicingV2InvoicesPost201Response**](InvoicingV2InvoicesPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="updateInvoice"></a>
# **updateInvoice**
> InvoicingV2InvoicesPost201Response updateInvoice(id, updateInvoiceRequest)

Update an Invoice

Update an invoice.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.InvoicesApi;


InvoicesApi apiInstance = new InvoicesApi();
String id = "id_example"; // String | The invoice number.
UpdateInvoiceRequest updateInvoiceRequest = new UpdateInvoiceRequest(); // UpdateInvoiceRequest | Updating the invoice does not resend the invoice automatically. You must resend the invoice separately.
try {
    InvoicingV2InvoicesPost201Response result = apiInstance.updateInvoice(id, updateInvoiceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#updateInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The invoice number. |
 **updateInvoiceRequest** | [**UpdateInvoiceRequest**](UpdateInvoiceRequest.md)| Updating the invoice does not resend the invoice automatically. You must resend the invoice separately. |

### Return type

[**InvoicingV2InvoicesPost201Response**](InvoicingV2InvoicesPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

