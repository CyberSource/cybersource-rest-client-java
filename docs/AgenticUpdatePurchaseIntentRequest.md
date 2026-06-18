
# AgenticUpdatePurchaseIntentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientCorrelationId** | **String** | Client Correlation Id used during the tokenization or during FIDO assertion. | 
**paymentInformation** | [**Iccv1tokensPaymentInformation**](Iccv1tokensPaymentInformation.md) |  | 
**deviceInformation** | [**Iccv1tokensDeviceInformation**](Iccv1tokensDeviceInformation.md) |  | 
**assuranceData** | [**List&lt;Iccv1tokensAssuranceData&gt;**](Iccv1tokensAssuranceData.md) | Assurance data. | 
**mandates** | [**List&lt;Iccv1instructionsMandates&gt;**](Iccv1instructionsMandates.md) |  | 
**buyerInformation** | [**Iccv1tokensBuyerInformation**](Iccv1tokensBuyerInformation.md) |  |  [optional]
**consumerPrompt** | **String** | Recap - A summary or condensed version of user prompts that leads to the purchase. |  [optional]



