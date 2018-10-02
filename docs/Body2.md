
# Body2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**InstrumentidentifiersLinks**](InstrumentidentifiersLinks.md) |  |  [optional]
**id** | **String** | Unique identification number assigned by CyberSource to the submitted request. |  [optional]
**object** | [**ObjectEnum**](#ObjectEnum) | Describes type of token. For example: customer, paymentInstrument or instrumentIdentifier. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Current state of the token. |  [optional]
**bankAccount** | [**PaymentinstrumentsBankAccount**](PaymentinstrumentsBankAccount.md) |  |  [optional]
**card** | [**PaymentinstrumentsCard**](PaymentinstrumentsCard.md) |  |  [optional]
**buyerInformation** | [**PaymentinstrumentsBuyerInformation**](PaymentinstrumentsBuyerInformation.md) |  |  [optional]
**billTo** | [**PaymentinstrumentsBillTo**](PaymentinstrumentsBillTo.md) |  |  [optional]
**processingInformation** | [**PaymentinstrumentsProcessingInformation**](PaymentinstrumentsProcessingInformation.md) |  |  [optional]
**merchantInformation** | [**PaymentinstrumentsMerchantInformation**](PaymentinstrumentsMerchantInformation.md) |  |  [optional]
**metaData** | [**InstrumentidentifiersMetadata**](InstrumentidentifiersMetadata.md) |  |  [optional]
**instrumentIdentifier** | [**PaymentinstrumentsInstrumentIdentifier**](PaymentinstrumentsInstrumentIdentifier.md) |  |  [optional]


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



