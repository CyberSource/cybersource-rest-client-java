
# Ptsv2paymentsRiskInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**profile** | [**Ptsv2paymentsRiskInformationProfile**](Ptsv2paymentsRiskInformationProfile.md) |  |  [optional]
**eventType** | **String** | Specifies one of the following types of events: - login - account_creation - account_update For regular payment transactions, do not send this field.  |  [optional]
**buyerHistory** | [**Ptsv2paymentsRiskInformationBuyerHistory**](Ptsv2paymentsRiskInformationBuyerHistory.md) |  |  [optional]
**auxiliaryData** | [**List&lt;Ptsv2paymentsRiskInformationAuxiliaryData&gt;**](Ptsv2paymentsRiskInformationAuxiliaryData.md) |  |  [optional]
**store** | [**Ptsv2paymentsRiskInformationStore**](Ptsv2paymentsRiskInformationStore.md) |  |  [optional]
**authenticationType** | **String** | • 01 &#x3D; Static Passcode • 02 &#x3D; SMS OTP • 03 &#x3D; Key fob or EMV card reader OTP • 04 &#x3D; App OTP • 05 &#x3D; OTP Other • 07 &#x3D; OOB Biometrics • 08 &#x3D; OOB Login • 09 &#x3D; OOB Other • 10 &#x3D; Other • 11 &#x3D; Push Confirmation • 12 &#x3D; Decoupled • 13 &#x3D; WebAuthn • 14 &#x3D; SPC • 15 &#x3D; Behavioural biometrics  |  [optional]
**pickupDays** | [**BigDecimal**](BigDecimal.md) | Number of days between transaction date and rental pickup date  |  [optional]
**externalScore** | [**Ptsv2paymentsRiskInformationExternalScore**](Ptsv2paymentsRiskInformationExternalScore.md) |  |  [optional]



