
# PostCustomerPaymentInstrumentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**DefaultPaymentInstrumentLinks**](DefaultPaymentInstrumentLinks.md) |  |  [optional]
**id** | **String** | The Id of the Payment Instrument Token. |  [optional]
**object** | **String** | The type.  Possible Values: - paymentInstrument  |  [optional]
**_default** | **Boolean** | Flag that indicates whether customer payment instrument is the dafault. Possible Values:  - &#x60;true&#x60;: Payment instrument is customer&#39;s default.  - &#x60;false&#x60;: Payment instrument is not customer&#39;s default.  |  [optional]
**state** | **String** | Issuers state for the card number. Possible Values: - ACTIVE - CLOSED : The account has been closed.  |  [optional]
**type** | **String** | The type of Payment Instrument. Possible Values: - cardHash  |  [optional]
**bankAccount** | [**DefaultPaymentInstrumentBankAccount**](DefaultPaymentInstrumentBankAccount.md) |  |  [optional]
**card** | [**DefaultPaymentInstrumentCard**](DefaultPaymentInstrumentCard.md) |  |  [optional]
**buyerInformation** | [**DefaultPaymentInstrumentBuyerInformation**](DefaultPaymentInstrumentBuyerInformation.md) |  |  [optional]
**billTo** | [**DefaultPaymentInstrumentBillTo**](DefaultPaymentInstrumentBillTo.md) |  |  [optional]
**processingInformation** | [**TmsPaymentInstrumentProcessingInfo**](TmsPaymentInstrumentProcessingInfo.md) |  |  [optional]
**merchantInformation** | [**TmsMerchantInformation**](TmsMerchantInformation.md) |  |  [optional]
**instrumentIdentifier** | [**DefaultPaymentInstrumentInstrumentIdentifier**](DefaultPaymentInstrumentInstrumentIdentifier.md) |  |  [optional]
**metadata** | [**DefaultPaymentInstrumentMetadata**](DefaultPaymentInstrumentMetadata.md) |  |  [optional]
**embedded** | [**Tmsv1paymentinstrumentsEmbedded**](Tmsv1paymentinstrumentsEmbedded.md) |  |  [optional]



