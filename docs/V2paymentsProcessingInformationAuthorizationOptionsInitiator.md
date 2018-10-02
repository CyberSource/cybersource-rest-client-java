
# V2paymentsProcessingInformationAuthorizationOptionsInitiator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | This field indicates whether the transaction is a merchant-initiated transaction or customer-initiated transaction.  |  [optional]
**credentialStoredOnFile** | **Boolean** | Flag that indicates whether merchant is intend to use this transaction to store payment credential for follow-up merchant-initiated transactions or not.  |  [optional]
**storedCredentialUsed** | **Boolean** | Flag that indicates whether merchant is intend to use this transaction to store payment credential for follow-up merchant-initiated transactions or not.  |  [optional]
**merchantInitiatedTransaction** | [**V2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction**](V2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CUSTOMER | &quot;customer&quot;
MERCHANT | &quot;merchant&quot;



