
# InvoicingV2InvoicesPost201ResponseInvoiceInformationCustomLabels

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The invoice field key. Possible values:   - billTo   - invoiceNumber   - customerId   - companyName   - description   - shipping   - partialPayment   - discount   - tax  |  [optional]
**value** | **String** | The new (overridden) field name |  [optional]
**hidden** | **Boolean** | Hides the specified field. This field is applicable for keys:   - customerId   - companyName   - description   - shipping   - partialPayment  |  [optional]
**hiddenForInvoice** | **Boolean** | Hides the field at invoice level. This field is applicable for keys:   - discount   - tax  |  [optional]
**hiddenForItem** | **Boolean** | Hides the field at invoice item level. This field is applicable for keys:   - discount   - tax  |  [optional]



