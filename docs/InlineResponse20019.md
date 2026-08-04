
# InlineResponse20019

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Overall ingestion result: - &#x60;success&#x60; — all products were validated and saved - &#x60;partial_success&#x60; — some products failed validation; &#x60;errors&#x60; lists the failures - &#x60;failed&#x60; — no products were saved; check &#x60;errors&#x60; for details   Possible values: - success - partial_success - failed |  [optional]
**feedId** | **String** | Unique identifier for this feed ingestion job. Use this with the Syndication Status endpoint to monitor the asynchronous protocol sync progress (e.g. to Google Merchant Center).  |  [optional]
**totalSubmitted** | **Integer** | Total number of product records in the submitted feed. |  [optional]
**successCount** | **Integer** | Number of products that passed validation and were saved to the catalog. |  [optional]
**failedCount** | **Integer** | Number of products that failed validation and were not saved. |  [optional]
**errors** | [**List&lt;InlineResponse20019Errors&gt;**](InlineResponse20019Errors.md) | Per-product validation errors for products that failed ingestion. Each entry identifies the product, the specific field that failed, and the reason. &#x60;null&#x60; when &#x60;failed_count&#x60; is zero.  |  [optional]
**ingestedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the ingestion completed. |  [optional]
**forwardedToAgent** | **Boolean** | Indicates whether the ingested products were scheduled for syndication to the configured AI agent endpoint. Set to &#x60;true&#x60; when at least one product was successfully saved. Note: syndication is asynchronous — this field confirms the dispatch was initiated, not that the agent received the data.  |  [optional]
**agentEndpoint** | **String** | The AI agent endpoint URL that the products were forwarded to. Present when &#x60;forwarded_to_agent&#x60; is &#x60;true&#x60;.  |  [optional]
**forwardedToUcpAgent** | **Boolean** | Indicates whether the ingested products were scheduled for syndication to the UCP (Unified Commerce Platform) agent. Set to &#x60;true&#x60; when UCP syndication is enabled and at least one product was successfully saved.  |  [optional]
**googleMerchant** | [**InlineResponse20019GoogleMerchant**](InlineResponse20019GoogleMerchant.md) |  |  [optional]



