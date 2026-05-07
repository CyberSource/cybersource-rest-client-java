
# Ptsv2payoutsProcessingInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessApplicationId** | **String** | Payouts transaction type.  Applicable Processors: FDC Compass, Paymentech, CtV  Possible values:  **Credit Card Bill Payment**   - **CP**: credit card bill payment  **Funds Disbursement**   - **FD**: funds disbursement  - **GD**: government disbursement  - **MD**: merchant disbursement  **Money Transfer**   - **AA**: account to account. Sender and receiver are same person.  - **PP**: person to person. Sender and receiver are different.  **Prepaid Load**   - **TU**: top up  |  [optional]
**networkRoutingOrder** | **String** | This field is optionally used by Push Payments Gateway participants (merchants and acquirers) to get the attributes for specified networks only. The networks specified in this field must be a subset of the information provided during program enrollment. Refer to Sharing Group Code/Network Routing Order. Note: Supported only in US for domestic transactions involving Push Payments Gateway Service.  VisaNet checks to determine if there are issuer routing preferences for any of the networks specified by the network routing order. If an issuer preference exists for one of the specified debit networks, VisaNet makes a routing selection based on the issuer&#39;s preference.  If an issuer preference exists for more than one of the specified debit networks, or if no issuer preference exists, VisaNet makes a selection based on the acquirer&#39;s routing priorities.   |  [optional]
**commerceIndicator** | **String** | Type of transaction.  Value for an OCT transaction: - &#x60;internet&#x60;  |  [optional]
**reconciliationId** | **String** | Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request. * For Payouts: max length for FDCCompass is String (22).  |  [optional]
**payoutsOptions** | [**Ptsv2payoutsProcessingInformationPayoutsOptions**](Ptsv2payoutsProcessingInformationPayoutsOptions.md) |  |  [optional]
**transactionReason** | **String** | Transaction reason code.  |  [optional]
**purposeOfPayment** | **String** | This field is applicable for AFT and OCT transactions. For list of supported values, please refer to Developer Guide.  |  [optional]
**fundingOptions** | [**Ptsv2payoutsProcessingInformationFundingOptions**](Ptsv2payoutsProcessingInformationFundingOptions.md) |  |  [optional]
**languageCode** | **String** | Contains the ISO 639-2 defined language Code  |  [optional]
**purchaseOptions** | [**Ptsv2payoutsProcessingInformationPurchaseOptions**](Ptsv2payoutsProcessingInformationPurchaseOptions.md) |  |  [optional]
**accountVerificationCode** | **List&lt;String&gt;** | Account verification code will inform what Payment Account Verification should be performed. With this array of codes, a merchant can choose à la carte what verifications to run. This field is optional, and the default is 1 if it is not passed in. This means that a full validation of the fields will be performed. Valid verification codes: - &#x60;1&#x60; &#x3D; Full Account Verification (Card Account, CVN, CAVV, TAVV, Address, Name, eMail, Phone, Identity) - &#x60;2&#x60; &#x3D; Card Account Verification - &#x60;3&#x60; &#x3D; Address Verification - &#x60;4&#x60; &#x3D; Card Authentication Method (CAM) (Cryptogram) - &#x60;5&#x60; &#x3D; Cardholder Authentication Verification (CAVV) - &#x60;6&#x60; &#x3D; Cardholder Identity Verification - &#x60;7&#x60; &#x3D; CVV2 Verification - &#x60;8&#x60; &#x3D; eMail Verification - &#x60;9&#x60; &#x3D; Name Verification - &#x60;10&#x60; &#x3D; Phone Verification  |  [optional]



