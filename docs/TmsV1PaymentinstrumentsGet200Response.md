
# TmsV1PaymentinstrumentsGet200Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**Tmsv1instrumentidentifiersLinks**](Tmsv1instrumentidentifiersLinks.md) |  |  [optional]
**id** | **String** | Unique identification number assigned by CyberSource to the submitted request. |  [optional]
**object** | [**ObjectEnum**](#ObjectEnum) | Describes type of token. For example: customer, paymentInstrument or instrumentIdentifier. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Current state of the token. |  [optional]
**bankAccount** | [**Tmsv1paymentinstrumentsBankAccount**](Tmsv1paymentinstrumentsBankAccount.md) |  |  [optional]
**card** | [**Tmsv1paymentinstrumentsCard**](Tmsv1paymentinstrumentsCard.md) |  |  [optional]
**buyerInformation** | [**Tmsv1paymentinstrumentsBuyerInformation**](Tmsv1paymentinstrumentsBuyerInformation.md) |  |  [optional]
**billTo** | [**Tmsv1paymentinstrumentsBillTo**](Tmsv1paymentinstrumentsBillTo.md) |  |  [optional]
**processingInformation** | [**Tmsv1paymentinstrumentsProcessingInformation**](Tmsv1paymentinstrumentsProcessingInformation.md) |  |  [optional]
**merchantInformation** | [**Tmsv1paymentinstrumentsMerchantInformation**](Tmsv1paymentinstrumentsMerchantInformation.md) |  |  [optional]
**metaData** | [**Tmsv1instrumentidentifiersMetadata**](Tmsv1instrumentidentifiersMetadata.md) |  |  [optional]
**instrumentIdentifier** | [**Tmsv1paymentinstrumentsInstrumentIdentifier**](Tmsv1paymentinstrumentsInstrumentIdentifier.md) |  |  [optional]


<a name="ObjectEnum"></a>
## Enum: ObjectEnum
Name | Value
---- | -----
PAYMENTINSTRUMENT | &quot;paymentInstrument&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
CLOSED | &quot;CLOSED&quot;



