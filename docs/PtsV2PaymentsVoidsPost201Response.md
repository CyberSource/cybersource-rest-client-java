
# PtsV2PaymentsVoidsPost201Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**PtsV2PaymentsReversalsPost201ResponseLinks**](PtsV2PaymentsReversalsPost201ResponseLinks.md) |  |  [optional]
**id** | **String** | An unique identification number assigned by CyberSource to identify the submitted request. |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the submitted transaction.  Possible values:  - VOIDED  |  [optional]
**clientReferenceInformation** | [**PtsV2PaymentsPost201ResponseClientReferenceInformation**](PtsV2PaymentsPost201ResponseClientReferenceInformation.md) |  |  [optional]
**voidAmountDetails** | [**PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails**](PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
VOIDED | &quot;VOIDED&quot;



