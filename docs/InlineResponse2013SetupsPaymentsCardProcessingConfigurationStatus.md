
# InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configurationId** | [**UUID**](UUID.md) | This is NOT for MVP |  [optional]
**version** | **String** |  |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | **String** | Possible values: - SUCCESS - PARTIAL - PENDING - NOT_SETUP |  [optional]
**reason** | **String** | Possible values: - PENDING_PROVISIONING_PROCESS - MISSING_DATA - INVALID_DATA - DUPLICATE_FIELD - NOT_APPLICABLE |  [optional]
**details** | [**List&lt;Map&lt;String, String&gt;&gt;**](Map.md) |  |  [optional]
**message** | **String** |  |  [optional]



