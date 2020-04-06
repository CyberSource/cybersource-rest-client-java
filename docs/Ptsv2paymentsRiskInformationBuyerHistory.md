
# Ptsv2paymentsRiskInformationBuyerHistory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerAccount** | [**Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount**](Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount.md) |  |  [optional]
**accountHistory** | [**Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory**](Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory.md) |  |  [optional]
**accountPurchases** | **Integer** | Number of purchases with this cardholder account during the previous six months. Recommended for Discover ProtectBuy.  |  [optional]
**addCardAttempts** | **Integer** | Number of add card attempts in the last 24 hours. Recommended for Discover ProtectBuy.  |  [optional]
**priorSuspiciousActivity** | **Boolean** | Indicates whether the merchant experienced suspicious activity (including previous fraud) on the account. Recommended for Discover ProtectBuy.  |  [optional]
**paymentAccountHistory** | **String** | This only applies for NEW_ACCOUNT and EXISTING_ACCOUNT in creationHistory. Possible values are: - PAYMENT_ACCOUNT_EXISTS - PAYMENT_ACCOUNT_ADDED_NOW  |  [optional]
**paymentAccountDate** | **Integer** | Date applicable only for PAYMENT_ACCOUNT_EXISTS in paymentAccountHistory  |  [optional]
**transactionCountDay** | **Integer** | Number of transaction (successful or abandoned) for this cardholder account within the last 24 hours. Recommended for Discover ProtectBuy.  |  [optional]
**transactionCountYear** | **Integer** | Number of transaction (successful or abandoned) for this cardholder account within the last year. Recommended for Discover ProtectBuy.  |  [optional]



