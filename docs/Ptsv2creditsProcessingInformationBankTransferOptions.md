
# Ptsv2creditsProcessingInformationBankTransferOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerMemo** | **String** | Payment related information.  This information is included on the customer&#39;s statement.  |  [optional]
**secCode** | **String** | Specifies the authorization method for the transaction.  #### TeleCheck Accepts only the following values: - &#x60;ARC&#x60;: account receivable conversion - &#x60;CCD&#x60;: corporate cash disbursement - &#x60;POP&#x60;: point of purchase conversion - &#x60;PPD&#x60;: prearranged payment and deposit entry - &#x60;TEL&#x60;: telephone-initiated entry - &#x60;WEB&#x60;: internet-initiated entry  |  [optional]
**terminalCity** | **String** | City in which the terminal is located. If more than four alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters.  |  [optional]
**terminalState** | **String** | State in which the terminal is located. If more than two alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters.  |  [optional]
**effectiveDate** | **String** | Effective date for the transaction. The effective date must be within 45 days of the current day. If you do not include this value, CyberSource sets the effective date to the next business day.  Format: &#x60;MMDDYYYY&#x60;  Supported only for the CyberSource ACH Service.  |  [optional]
**partialPaymentId** | **String** | Identifier for a partial payment or partial credit.  The value for each debit request or credit request must be unique within the scope of the order.  |  [optional]
**settlementMethod** | **String** | Method used for settlement.  Possible values: - &#x60;A&#x60;: Automated Clearing House (default for credits and for transactions using Canadian dollars) - &#x60;F&#x60;: Facsimile draft (U.S. dollars only) - &#x60;B&#x60;: Best possible (U.S. dollars only) (default if the field has not already been configured for your merchant ID)  |  [optional]



