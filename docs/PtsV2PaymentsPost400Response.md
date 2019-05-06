
# PtsV2PaymentsPost400Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submitTimeUtc** | **String** | Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; Example &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the submitted transaction.  Possible values:  - INVALID_REQUEST  |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason of the status.  Possible values:  - MISSING_FIELD  - INVALID_DATA  - DUPLICATE_REQUEST  - INVALID_CARD  - CARD_TYPE_NOT_ACCEPTED  - INVALID_MERCHANT_CONFIGURATION  - PROCESSOR_UNAVAILABLE  - INVALID_AMOUNT  - INVALID_CARD_TYPE  - INVALID_PAYMENT_ID  - DEBIT_CARD_USEAGE_EXCEEDD_LIMIT  |  [optional]
**message** | **String** | The detail message related to the status and reason listed above. |  [optional]
**details** | [**List&lt;PtsV2PaymentsPost201ResponseErrorInformationDetails&gt;**](PtsV2PaymentsPost201ResponseErrorInformationDetails.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
REQUEST | &quot;INVALID_REQUEST&quot;


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
MISSING_FIELD | &quot;MISSING_FIELD&quot;
INVALID_DATA | &quot;INVALID_DATA&quot;
DUPLICATE_REQUEST | &quot;DUPLICATE_REQUEST&quot;
INVALID_CARD | &quot;INVALID_CARD&quot;
CARD_TYPE_NOT_ACCEPTED | &quot;CARD_TYPE_NOT_ACCEPTED&quot;
INVALID_MERCHANT_CONFIGURATION | &quot;INVALID_MERCHANT_CONFIGURATION&quot;
PROCESSOR_UNAVAILABLE | &quot;PROCESSOR_UNAVAILABLE&quot;
INVALID_AMOUNT | &quot;INVALID_AMOUNT&quot;
INVALID_CARD_TYPE | &quot;INVALID_CARD_TYPE&quot;
DEBIT_CARD_USEAGE_EXCEEDD_LIMIT | &quot;DEBIT_CARD_USEAGE_EXCEEDD_LIMIT&quot;



