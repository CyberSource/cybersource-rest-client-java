
# TmsV1InstrumentidentifiersPost200Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**Tmsv1instrumentidentifiersLinks**](Tmsv1instrumentidentifiersLinks.md) |  |  [optional]
**id** | **String** | Unique identification number assigned by CyberSource to the submitted request. |  [optional]
**object** | [**ObjectEnum**](#ObjectEnum) | Describes type of token. For example: customer, paymentInstrument or instrumentIdentifier. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Current state of the token. |  [optional]
**card** | [**Tmsv1instrumentidentifiersCard**](Tmsv1instrumentidentifiersCard.md) |  |  [optional]
**bankAccount** | [**Tmsv1instrumentidentifiersBankAccount**](Tmsv1instrumentidentifiersBankAccount.md) |  |  [optional]
**processingInformation** | [**Tmsv1instrumentidentifiersProcessingInformation**](Tmsv1instrumentidentifiersProcessingInformation.md) |  |  [optional]
**metadata** | [**Tmsv1instrumentidentifiersMetadata**](Tmsv1instrumentidentifiersMetadata.md) |  |  [optional]


<a name="ObjectEnum"></a>
## Enum: ObjectEnum
Name | Value
---- | -----
INSTRUMENTIDENTIFIER | &quot;instrumentIdentifier&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
CLOSED | &quot;CLOSED&quot;



