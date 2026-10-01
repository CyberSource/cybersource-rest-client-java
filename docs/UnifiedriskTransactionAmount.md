
# UnifiedriskTransactionAmount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | Transaction amount in the specified currency |  [optional]
**currency** | **String** | ISO 4217 3-letter currency code |  [optional]
**baseCurrency** | **String** | Base currency for multi-currency transactions |  [optional]
**baseValue** | **String** | Amount in base currency |  [optional]
**merchantCurrency** | **String** | ISO 4217 3-letter code for the merchant&#39;s local currency used to express the transaction amount (e.g., EUR for EU merchants). Used for cross-currency risk analysis |  [optional]
**merchantValue** | **String** | Transaction amount expressed in the merchant&#39;s local currency, used for cross-currency comparison and risk threshold evaluation against merchant&#39;s baseline |  [optional]



