
# InvoicingV2InvoicesGet200ResponseTransactionDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Payer auth Transaction identifier. |  [optional]
**amount** | **String** | Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  **Note** For CTV, FDCCompass, Paymentech processors, the maximum length for this field is 12.  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths.  If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen.   #### Card Present Required to include either this field or &#x60;orderInformation.lineItems[].unitPrice&#x60; for the order.  #### Invoicing / Pay By Link Required for creating a new invoice or payment link.  #### PIN Debit Amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount.  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit; however, for all other processors, these fields are required.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either this field or the 1st line item in the order and the specific line-order amount in your request.   #### DCC for First Data Not used.  |  [optional]



