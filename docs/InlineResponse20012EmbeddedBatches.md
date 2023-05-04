
# InlineResponse20012EmbeddedBatches

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**InlineResponse20012EmbeddedLinks**](InlineResponse20012EmbeddedLinks.md) |  |  [optional]
**batchId** | **String** | Unique identification number assigned to the submitted request. |  [optional]
**batchCreatedDate** | **String** | ISO-8601 format: yyyy-MM-ddTHH:mm:ssZ |  [optional]
**batchModifiedDate** | **String** | ISO-8601 format: yyyy-MM-ddTHH:mm:ssZ |  [optional]
**batchSource** | **String** | Valid Values:   * SCHEDULER   * TOKEN_API   * CREDIT_CARD_FILE_UPLOAD   * AMEX_REGSITRY   * AMEX_REGISTRY_API   * AMEX_REGISTRY_API_SYNC   * AMEX_MAINTENANCE  |  [optional]
**tokenSource** | **String** | Valid Values:   * SECURE_STORAGE   * TMS   * CYBERSOURCE  |  [optional]
**merchantReference** | **String** | Reference used by merchant to identify batch. |  [optional]
**batchCaEndpoints** | **List&lt;String&gt;** | Valid Values:   * VISA   * MASTERCARD   * AMEX  |  [optional]
**status** | **String** | Valid Values:   * REJECTED   * RECEIVED   * VALIDATED   * DECLINED   * PROCESSING   * COMPLETE  |  [optional]
**totals** | [**InlineResponse20012EmbeddedTotals**](InlineResponse20012EmbeddedTotals.md) |  |  [optional]


