
# InlineResponse201

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**InlineResponse201Links**](InlineResponse201Links.md) |  |  [optional]
**embedded** | [**InlineResponse201Embedded**](InlineResponse201Embedded.md) |  |  [optional]
**id** | **String** | An unique identification number assigned by CyberSource to identify the submitted request. |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the submitted transaction. |  [optional]
**reconciliationId** | **String** | The reconciliation id for the submitted transaction. This value is not returned for all processors.  |  [optional]
**errorInformation** | [**InlineResponse201ErrorInformation**](InlineResponse201ErrorInformation.md) |  |  [optional]
**clientReferenceInformation** | [**InlineResponse201ClientReferenceInformation**](InlineResponse201ClientReferenceInformation.md) |  |  [optional]
**processorInformation** | [**InlineResponse201ProcessorInformation**](InlineResponse201ProcessorInformation.md) |  |  [optional]
**paymentInformation** | [**InlineResponse201PaymentInformation**](InlineResponse201PaymentInformation.md) |  |  [optional]
**orderInformation** | [**InlineResponse201OrderInformation**](InlineResponse201OrderInformation.md) |  |  [optional]
**pointOfSaleInformation** | [**InlineResponse201PointOfSaleInformation**](InlineResponse201PointOfSaleInformation.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AUTHORIZED | &quot;AUTHORIZED&quot;
PARTIAL_AUTHORIZED | &quot;PARTIAL_AUTHORIZED&quot;
AUTHORIZED_PENDING_REVIEW | &quot;AUTHORIZED_PENDING_REVIEW&quot;
DECLINED | &quot;DECLINED&quot;



