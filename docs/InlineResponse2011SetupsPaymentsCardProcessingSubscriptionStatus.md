
# InlineResponse2011SetupsPaymentsCardProcessingSubscriptionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submitTimeUtc** | **String** | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) |  |  [optional]
**details** | [**List&lt;Map&lt;String, String&gt;&gt;**](Map.md) |  |  [optional]
**message** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
PARTIAL | &quot;PARTIAL&quot;
PENDING | &quot;PENDING&quot;


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
DEPENDENT_PRODUCT_NOT_CONTRACTED | &quot;DEPENDENT_PRODUCT_NOT_CONTRACTED&quot;
DEPENDENT_FEATURE_NOT_CHOSEN | &quot;DEPENDENT_FEATURE_NOT_CHOSEN&quot;
MISSING_DATA | &quot;MISSING_DATA&quot;
INVALID_DATA | &quot;INVALID_DATA&quot;
DUPLICATE_FIELD | &quot;DUPLICATE_FIELD&quot;



