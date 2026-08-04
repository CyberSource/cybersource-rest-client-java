
# InlineResponse2015

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identification number to identify the submitted request. It is also appended to the endpoint of the resource.  |  [optional]
**status** | **String** | The status of the submitted transaction.  Possible values: - &#x60;COMPLETED&#x60; - &#x60;SERVER_ERROR&#x60; - &#x60;INVALID_REQUEST&#x60; - &#x60;DECLINED&#x60;  | 
**submitTimeStampUtc** | **String** | Time of request in UTC. Format: &#x60;YYYY-MM-DD&#39;T&#39;HH:mm:ssZ&#x60;  Example: &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**links** | [**InlineResponse2015Links**](InlineResponse2015Links.md) |  |  [optional]
**transactions** | [**List&lt;InlineResponse2015Transactions&gt;**](InlineResponse2015Transactions.md) |  |  [optional]
**clientReferenceInformation** | [**InlineResponse2015ClientReferenceInformation**](InlineResponse2015ClientReferenceInformation.md) |  |  [optional]
**errorInformation** | [**InlineResponse2015ErrorInformation**](InlineResponse2015ErrorInformation.md) |  |  [optional]



