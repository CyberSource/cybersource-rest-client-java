
# Acpv1instructionsinstructionIdcredentialsTransactionData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientReferenceInformation** | [**Acpv1instructionsinstructionIdcredentialsClientReferenceInformation**](Acpv1instructionsinstructionIdcredentialsClientReferenceInformation.md) |  | 
**mandateReferenceData** | [**List&lt;Acpv1instructionsinstructionIdcredentialsMandateReferenceData&gt;**](Acpv1instructionsinstructionIdcredentialsMandateReferenceData.md) | Mandate Reference Data. |  [optional]
**type** | **String** | (Conditional) Type of the transaction. This field is used to determine the type of transaction and the associated processing rules.   Possible values:     - &#x60;PURCHASE&#x60; (Default)   - &#x60;BILL_PAYMENT&#x60;   - &#x60;MONEY_TRANSFER&#x60;   - &#x60;DISBURSEMENT&#x60;   - &#x60;P2P&#x60;  |  [optional]
**orderInformation** | [**Acpv1instructionsinstructionIdcredentialsOrderInformation**](Acpv1instructionsinstructionIdcredentialsOrderInformation.md) |  | 
**paymentServiceProviderUrl** | **String** | (Conditional) URL of the payment service provider. |  [optional]
**paymentServiceProviderName** | **String** | (Conditional) Name of the payment service provider. |  [optional]
**merchantOrderId** | **String** | (Conditional) Digital Payment Application generated order/invoice number corresponding to a Consumer purchase. |  [optional]
**merchantInformation** | [**Acpv1instructionsinstructionIdcredentialsMerchantInformation**](Acpv1instructionsinstructionIdcredentialsMerchantInformation.md) |  | 
**paymentOptions** | [**Acpv1instructionsinstructionIdcredentialsPaymentOptions**](Acpv1instructionsinstructionIdcredentialsPaymentOptions.md) |  |  [optional]
**attachments** | [**List&lt;Acpv1instructionsinstructionIdcredentialsAttachments&gt;**](Acpv1instructionsinstructionIdcredentialsAttachments.md) |  |  [optional]



