
# Ptsv1pullfundstransferSenderInformationAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundsSource** | **String** | Source of funds. Possible values: - &#x60;01&#x60;: Credit card, - &#x60;02&#x60;: Debit card, - &#x60;03&#x60;: Prepaid card, - &#x60;04&#x60;: Cash, - &#x60;05&#x60;: Debit or deposit account that is not linked to a Visa card. Includes checking accounts, savings, - &#x60;06&#x60;: Credit account that is not linked to a Visa card. Includes credit cards and proprietary lines, - &#x60;07&#x60;: Mobile wallet account, - &#x60;08&#x60;: Other source of funds.  |  [optional]
**number** | **String** | - Cross-border: Account number of the recipient account being funded by the AFT, is mandatory in cross-border Money Transfer AFTs. - Domestic: Optional in domestic AFTs. - Europe Domestic and intra-EEA cross-border: Account number of the recipient account being funded is mandatory in domestic and intra-EEA Money Transfer AFTs. In an AFT, this field contains the account number of the Recipient Account being funded by the AFT. Note: Inclusion of this tag is conditional; Sender Information reference number or Sender account number are required. If this tag is not included, Sender Reference number must be present and contain a reference number for the recipient account.  |  [optional]



