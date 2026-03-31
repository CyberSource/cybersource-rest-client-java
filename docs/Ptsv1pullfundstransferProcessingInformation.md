
# Ptsv1pullfundstransferProcessingInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commerceIndicator** | **String** | Type of transaction. This field identifies the level of security used in an electronic commerce transaction over an open network (for example, the internet).  Values for a Payouts transaction:   &#x60;INTERNET&#x60;, &#x60;RECURRING&#x60;, &#x60;RECURRING_INTERNET&#x60;, &#x60;VBV_FAILURE&#x60;, &#x60;VBV_ATTEMPTED&#x60;, &#x60;VBV&#x60;, &#x60;SPA_FAILURE&#x60;, &#x60;SPA_ATTEMPTED&#x60;, &#x60;SPA&#x60;    If no value is entered this field will set a default value &#x3D; &#x60;INTERNET&#x60;.  |  [optional]
**fundingOptions** | [**Ptsv1pullfundstransferProcessingInformationFundingOptions**](Ptsv1pullfundstransferProcessingInformationFundingOptions.md) |  |  [optional]
**recurringOptions** | [**Ptsv1pullfundstransferProcessingInformationRecurringOptions**](Ptsv1pullfundstransferProcessingInformationRecurringOptions.md) |  |  [optional]
**businessApplicationId** | **String** | Payouts transaction type.  Possible Values: - &#x60;AA&#x60; &#x3D; Account to account - &#x60;PP&#x60; &#x3D; Person to person - &#x60;TU&#x60; &#x3D; Top-up for enhanced prepaid loads - &#x60;WT&#x60; &#x3D; Wallet transfer - &#x60;BI&#x60; &#x3D; Bank-Initiated - &#x60;FT&#x60; &#x3D; Funds Transfer - &#x60;FD&#x60; &#x3D; Funds Disbursement - &#x60;MP&#x60; &#x3D; Merchant Payment - &#x60;PD&#x60; &#x3D; Payroll Disbursement - &#x60;LA&#x60; &#x3D; Liquid Assets  | 
**purposeOfPayment** | **String** | Visa Direct   Purpose of payment is required in certain markets to clearly identify the purpose of the payment based on the standard values defined for respective market.  |  [optional]
**payoutsOptions** | [**Ptsv1pullfundstransferProcessingInformationPayoutsOptions**](Ptsv1pullfundstransferProcessingInformationPayoutsOptions.md) |  |  [optional]
**languageCode** | **String** | Contains the ISO 639-2 defined language Code  |  [optional]



