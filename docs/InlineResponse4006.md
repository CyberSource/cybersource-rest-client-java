
# InlineResponse4006

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submitTimeUtc** | [**LocalDate**](LocalDate.md) | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | **String** | The http status description of the submitted request. |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) | Documented reason codes. Client should be able to use the key for generating their own error message Possible Values:   - &#39;INVALID_DATA&#39;   - &#39;SYSTEM_ERROR&#39;   - &#39;RESOURCE_NOT_FOUND&#39;  |  [optional]
**message** | **String** | Descriptive message for the error. |  [optional]
**details** | [**List&lt;InlineResponse4006Details&gt;**](InlineResponse4006Details.md) |  |  [optional]


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
INVALID_DATA | &quot;INVALID_DATA&quot;
SYSTEM_ERROR | &quot;SYSTEM_ERROR&quot;
RESOURCE_NOT_FOUND | &quot;RESOURCE_NOT_FOUND&quot;



