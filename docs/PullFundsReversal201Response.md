
# PullFundsReversal201Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identification number to identify the submitted request. It is also appended to the endpoint of the resource.  |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60;  **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  |  [optional]
**status** | **String** | The status of the submitted transaction.  Possible values: - REVERSED - DECLINED - INVALID_REQUEST  |  [optional]
**errorInformation** | [**PullFundsReversal201ResponseErrorInformation**](PullFundsReversal201ResponseErrorInformation.md) |  |  [optional]
**processorInformation** | [**PullFundsReversal201ResponseProcessorInformation**](PullFundsReversal201ResponseProcessorInformation.md) |  |  [optional]
**links** | [**PullFundsReversal201ResponseLinks**](PullFundsReversal201ResponseLinks.md) |  |  [optional]



