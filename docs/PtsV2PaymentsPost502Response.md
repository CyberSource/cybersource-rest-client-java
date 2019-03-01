
# PtsV2PaymentsPost502Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submitTimeUtc** | **String** | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the submitted transaction.  Possible values:  - SERVER_ERROR  |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason of the status.  Possible values:  - SYSTEM_ERROR  - SERVER_TIMEOUT  - SERVICE_TIMEOUT  - INVALID_OR_MISSING_CONFIG  - PROCESSOR_TIMEOUT  |  [optional]
**message** | **String** | The detail message related to the status and reason listed above. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ERROR | &quot;SERVER_ERROR&quot;


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
SYSTEM_ERROR | &quot;SYSTEM_ERROR&quot;
SERVER_TIMEOUT | &quot;SERVER_TIMEOUT&quot;
SERVICE_TIMEOUT | &quot;SERVICE_TIMEOUT&quot;
PROCESSOR_TIMEOUT | &quot;PROCESSOR_TIMEOUT&quot;



