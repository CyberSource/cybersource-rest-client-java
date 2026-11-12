
# FeedJobStatusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | **String** | Unique identifier of the feed submission job. |  [optional]
**status** | **String** | Overall status of the feed job.  Possible values: - PENDING - PROCESSING - COMPLETED - FAILED |  [optional]
**processing** | [**FeedProcessingSummary**](FeedProcessingSummary.md) |  |  [optional]
**syndication** | [**Map&lt;String, FeedSyndicationProtocolStatus&gt;**](FeedSyndicationProtocolStatus.md) | Per-protocol syndication status, keyed by lowercase protocol name (e.g. &#x60;acp&#x60;, &#x60;ucp&#x60;).  |  [optional]



