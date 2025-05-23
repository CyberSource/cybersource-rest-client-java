
# PushFunds502Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identification number to identify the submitted request. It is also appended to the endpoint of the resource.  |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60;  **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  |  [optional]
**status** | **String** | Possible values: - SERVER_ERROR  |  [optional]
**reason** | **String** | The reason of the status.  Possible values: - SYSTEM_ERROR - SERVICE_TIMEOUT  |  [optional]
**message** | **String** | The detail message related to the status and reason listed above.  Possible values: - Error - General system failure. - The request was received, but a service did not finish running in time.  |  [optional]



