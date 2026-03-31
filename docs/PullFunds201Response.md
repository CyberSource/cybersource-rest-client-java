
# PullFunds201Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identification number to identify the submitted request. It is also appended to the endpoint of the resource.  |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60;  **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  |  [optional]
**orderInformation** | [**PullFunds201ResponseOrderInformation**](PullFunds201ResponseOrderInformation.md) |  |  [optional]
**status** | **String** | The status of the submitted transaction.  Possible values: - AUTHORIZED - DECLINED - SERVER_ERROR - INVALID_REQUEST - PARTIAL_AUTHORIZED  |  [optional]
**errorInformation** | [**PullFunds201ResponseErrorInformation**](PullFunds201ResponseErrorInformation.md) |  |  [optional]
**processorInformation** | [**PullFunds201ResponseProcessorInformation**](PullFunds201ResponseProcessorInformation.md) |  |  [optional]
**links** | [**PullFunds201ResponseLinks**](PullFunds201ResponseLinks.md) |  |  [optional]



