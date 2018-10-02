
# InlineResponse2011

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**InlineResponse201EmbeddedCaptureLinks**](InlineResponse201EmbeddedCaptureLinks.md) |  |  [optional]
**id** | **String** | An unique identification number assigned by CyberSource to identify the submitted request. |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the submitted transaction. |  [optional]
**reconciliationId** | **String** | The reconciliation id for the submitted transaction. This value is not returned for all processors.  |  [optional]
**clientReferenceInformation** | [**InlineResponse201ClientReferenceInformation**](InlineResponse201ClientReferenceInformation.md) |  |  [optional]
**reversalAmountDetails** | [**InlineResponse2011ReversalAmountDetails**](InlineResponse2011ReversalAmountDetails.md) |  |  [optional]
**processorInformation** | [**InlineResponse2011ProcessorInformation**](InlineResponse2011ProcessorInformation.md) |  |  [optional]
**authorizationInformation** | [**InlineResponse2011AuthorizationInformation**](InlineResponse2011AuthorizationInformation.md) |  |  [optional]
**pointOfSaleInformation** | [**V2paymentsidreversalsPointOfSaleInformation**](V2paymentsidreversalsPointOfSaleInformation.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
REVERSED | &quot;REVERSED&quot;



