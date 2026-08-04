
# InlineResponse20019GoogleMerchant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Upload outcome status: - &#x60;TRIGGERED&#x60; — async upload dispatched; check Google Merchant Center for results - &#x60;FAILED&#x60; — all products failed UCP validation; nothing sent to Google - &#x60;DISABLED&#x60; — Google Merchant integration is disabled for this merchant - &#x60;COMPLETED&#x60; — synchronous validate-and-upload completed   Possible values: - TRIGGERED - FAILED - DISABLED - COMPLETED |  [optional]
**ucpValidCount** | **Integer** | Number of products that passed UCP validation and were queued for upload. |  [optional]
**ucpInvalidCount** | **Integer** | Number of products that failed UCP validation and were not sent to Google. |  [optional]
**googleEnabled** | **Boolean** | Whether Google Merchant integration is enabled for this merchant. |  [optional]
**products** | [**List&lt;InlineResponse20019GoogleMerchantProducts&gt;**](InlineResponse20019GoogleMerchantProducts.md) | Per-product UCP validation and upload results. Populated when at least one product was saved successfully. Null when all products failed ACG-level validation.  |  [optional]



