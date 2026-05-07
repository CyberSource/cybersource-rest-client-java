
# Ptsv2paymentsidrefundsPaymentInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**card** | [**Ptsv2paymentsidrefundsPaymentInformationCard**](Ptsv2paymentsidrefundsPaymentInformationCard.md) |  |  [optional]
**bank** | [**Ptsv2paymentsidrefundsPaymentInformationBank**](Ptsv2paymentsidrefundsPaymentInformationBank.md) |  |  [optional]
**tokenizedCard** | [**Ptsv2paymentsPaymentInformationTokenizedCard**](Ptsv2paymentsPaymentInformationTokenizedCard.md) |  |  [optional]
**fluidData** | [**Ptsv2paymentsPaymentInformationFluidData**](Ptsv2paymentsPaymentInformationFluidData.md) |  |  [optional]
**customer** | [**Ptsv2paymentsPaymentInformationCustomer**](Ptsv2paymentsPaymentInformationCustomer.md) |  |  [optional]
**paymentInstrument** | [**Ptsv2paymentsPaymentInformationPaymentInstrument**](Ptsv2paymentsPaymentInformationPaymentInstrument.md) |  |  [optional]
**instrumentIdentifier** | [**Ptsv2paymentsPaymentInformationInstrumentIdentifier**](Ptsv2paymentsPaymentInformationInstrumentIdentifier.md) |  |  [optional]
**shippingAddress** | [**Ptsv2paymentsPaymentInformationShippingAddress**](Ptsv2paymentsPaymentInformationShippingAddress.md) |  |  [optional]
**legacyToken** | [**Ptsv2paymentsPaymentInformationLegacyToken**](Ptsv2paymentsPaymentInformationLegacyToken.md) |  |  [optional]
**paymentType** | [**Ptsv2paymentsidrefundsPaymentInformationPaymentType**](Ptsv2paymentsidrefundsPaymentInformationPaymentType.md) |  |  [optional]
**eWallet** | [**Ptsv2paymentsidrefundsPaymentInformationEWallet**](Ptsv2paymentsidrefundsPaymentInformationEWallet.md) |  |  [optional]
**paymentAccountReference** | [**Ptsv2paymentsPaymentInformationPaymentAccountReference**](Ptsv2paymentsPaymentInformationPaymentAccountReference.md) |  |  [optional]
**thirdPartyToken** | [**Ptsv2paymentsPaymentInformationThirdPartyToken**](Ptsv2paymentsPaymentInformationThirdPartyToken.md) |  |  [optional]
**initiationChannel** | **String** | Mastercard-defined code that indicates how the account information was obtained for credit authorization transactions.  Possible values: - &#x60;00&#x60;: Card (default) - &#x60;01&#x60;: Mobile network operator (MNO) controlled removable secure element (SIM or UICC) personalized for use with a mobile phone or smartphone - &#x60;02&#x60;: Key fob - &#x60;03&#x60;: Watch - &#x60;04&#x60;: Mobile tag - &#x60;05&#x60;: Wristband - &#x60;06&#x60;: Mobile phone case or sleeve - &#x60;07&#x60;: Mobile phone or smartphone with fixed (nonremovable) secure element controlled by the MNO (for example, code division multiple access (CDMA)) - &#x60;08&#x60;: Removable secure element not controlled by the MNO (for example, memory card personalized for use with a mobile phone or smartphone) - &#x60;09&#x60;: Mobile phone or smartphone with a fixed (nonremovable) secure element not controlled by the MNO - &#x60;10&#x60;: MNO-controlled removable secure element (SIM or UICC) personalized for use with a tablet or e-book - &#x60;11&#x60;: Tablet or e-book with a fixed (nonremovable) secure element controlled by the MNO - &#x60;12&#x60;: Removable secure element not controlled by the MNO (for example, memory card personalized for use with a tablet or e-book) - &#x60;13&#x60;: Tablet or e-book with fixed (nonremovable) secure element not controlled by the MNO - &#x60;14&#x60; - &#x60;99&#x60;: Reserved for future use  This field flows in ISO Field 104 DSID 65 Tag 04.  This field is supported for Mastercard credit authorization transactions.  #### Used by **Credit Authorization (Standalone)** Optional field.  |  [optional]



