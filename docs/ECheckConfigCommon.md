
# ECheckConfigCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processors** | [**Map&lt;String, ECheckConfigCommonProcessors&gt;**](ECheckConfigCommonProcessors.md) |  |  [optional]
**internalOnly** | [**ECheckConfigCommonInternalOnly**](ECheckConfigCommonInternalOnly.md) |  |  [optional]
**accountHolderName** | **String** | Mandatory  Name on Merchant&#39;s Bank Account Only ASCII (Hex 20 to Hex 7E)  | 
**accountType** | **String** | Mandatory  Type of account for Merchant&#39;s Bank Account Possible values: - checking - savings - corporatechecking - corporatesavings  | 
**accountRoutingNumber** | **String** | Mandatory  Routing number for Merchant&#39;s Bank Account US Account Routing Number  | 
**accountNumber** | **String** | Mandatory  Account number for Merchant&#39;s Bank Account  | 



