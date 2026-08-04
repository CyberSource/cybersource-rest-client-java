
# InlineResponse4003

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identification number to identify the submitted request. It is also appended to the endpoint of the resource.  |  [optional]
**submitTimeStampUtc** | **String** | Time of request in UTC. Format: &#x60;YYYY-MM-DD&#39;T&#39;HH:mm:ssZ&#x60;  Example: &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | **String** | Possible values: - INVALID_REQUEST  |  [optional]
**reason** | **String** | The reason of the status.  Possible values: - INVALID_DATA - MISSING_FIELD  |  [optional]
**message** | **String** | The detail message related to the status and reason listed above.  |  [optional]
**details** | [**List&lt;InlineResponse2014ErrorInformationDetails&gt;**](InlineResponse2014ErrorInformationDetails.md) |  |  [optional]



