
# Invoicingv2invoicesInvoiceInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoiceNumber** | **String** | Invoice Number. |  [optional]
**transactionReferenceNumber** | **String** | The transaction reference number (TRN) is a identifier assigned to each payment transaction that allows merchants, customers, and payment processors to track and reference specific transactions throughout their lifecycle.  When provided, this value is passed to the payment processor as the reconciliation ID for the payment. For invoices this is typically the invoice number, and for purchase or donation links it is typically the link identifier.  Only letters and numbers are allowed; spaces and other special characters are not permitted.  |  [optional]
**description** | **String** | The description included in the invoice. | 
**dueDate** | [**LocalDate**](LocalDate.md) | The invoice due date. This field is required for creating an invoice. Format: &#x60;YYYY-MM-DD&#x60;, where &#x60;YYYY&#x60; &#x3D; year, &#x60;MM&#x60; &#x3D; month, and &#x60;DD&#x60; &#x3D; day.  The invoice link automatically expires 12 months after the due date.  | 
**expirationDate** | [**LocalDate**](LocalDate.md) | Define an expiration date for the link.  The date must be today or in the future.  Format: &#x60;YYYY-MM-DD&#x60;, where &#x60;YYYY&#x60; &#x3D; year, &#x60;MM&#x60; &#x3D; month, and &#x60;DD&#x60; &#x3D; day.  The invoice link automatically expires 12 months after the due date.  |  [optional]
**sendImmediately** | **Boolean** | If set to &#x60;true&#x60;, we send the invoice immediately. If set to &#x60;false&#x60;, the invoice remains in draft mode. |  [optional]
**allowPartialPayments** | **Boolean** | If set to &#x60;true&#x60;, the payer can make a partial invoice payment. |  [optional]
**deliveryMode** | **String** | If this field is set to &#39;None&#39;, an invoice will be generated with the status &#39;CREATED&#39;, but no email will be dispatched.    Possible values:        - &#x60;None&#x60;   - &#x60;Email&#x60;     |  [optional]



