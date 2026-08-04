
# InvoicingV2InvoicesPost201ResponseInvoiceInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoiceNumber** | **String** | Invoice Number. |  [optional]
**transactionReferenceNumber** | **String** | The transaction reference number (TRN) is a identifier assigned to each payment transaction that allows merchants, customers, and payment processors to track and reference specific transactions throughout their lifecycle.  When provided, this value is passed to the payment processor as the reconciliation ID for the payment. For invoices this is typically the invoice number, and for purchase or donation links it is typically the link identifier.  Only letters and numbers are allowed; spaces and other special characters are not permitted.  |  [optional]
**description** | **String** | The description included in the invoice. |  [optional]
**dueDate** | [**LocalDate**](LocalDate.md) | The invoice due date. This field is required for creating an invoice. Format: &#x60;YYYY-MM-DD&#x60;, where &#x60;YYYY&#x60; &#x3D; year, &#x60;MM&#x60; &#x3D; month, and &#x60;DD&#x60; &#x3D; day.  The invoice link automatically expires 12 months after the due date.  |  [optional]
**expirationDate** | [**LocalDate**](LocalDate.md) | Define an expiration date for the link.  The date must be today or in the future.  Format: &#x60;YYYY-MM-DD&#x60;, where &#x60;YYYY&#x60; &#x3D; year, &#x60;MM&#x60; &#x3D; month, and &#x60;DD&#x60; &#x3D; day.  The invoice link automatically expires 12 months after the due date.  |  [optional]
**allowPartialPayments** | **Boolean** | If set to &#x60;true&#x60;, the payer can make a partial invoice payment. |  [optional]
**paymentLink** | **String** | Returns the payment link to an invoice when the invoice status is &#x60;SENT&#x60;, &#x60;CREATED&#x60;, &#x60;PARTIAL&#x60;, or &#x60;PAID&#x60;. |  [optional]
**deliveryMode** | **String** | If this field is set to &#39;None&#39;, an invoice will be generated with the status &#39;CREATED&#39;, but no email will be dispatched.    Possible values:        - &#x60;None&#x60;   - &#x60;Email&#x60;     |  [optional]
**customLabels** | [**List&lt;InvoicingV2InvoicesPost201ResponseInvoiceInformationCustomLabels&gt;**](InvoicingV2InvoicesPost201ResponseInvoiceInformationCustomLabels.md) | A list of custom labels that allows you to override (rename) default field names and control the visibility of specific fields on invoices and items. If the list is empty, the labels will not be overwritten.  |  [optional]



