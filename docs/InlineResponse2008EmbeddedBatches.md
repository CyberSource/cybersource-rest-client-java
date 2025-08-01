
# InlineResponse2008EmbeddedBatches

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**InlineResponse2008EmbeddedLinks**](InlineResponse2008EmbeddedLinks.md) |  |  [optional]
**batchId** | **String** | Unique identification number assigned to the submitted request. |  [optional]
**batchCreatedDate** | **String** | ISO-8601 format: yyyy-MM-ddTHH:mm:ssZ |  [optional]
**batchModifiedDate** | **String** | ISO-8601 format: yyyy-MM-ddTHH:mm:ssZ |  [optional]
**batchSource** | **String** | Valid Values:   * SCHEDULER   * TOKEN_API   * CREDIT_CARD_FILE_UPLOAD   * AMEX_REGSITRY   * AMEX_REGISTRY_API   * AMEX_REGISTRY_API_SYNC   * AMEX_MAINTENANCE  |  [optional]
**tokenSource** | **String** | Valid Values:   * SECURE_STORAGE   * TMS   * CYBERSOURCE  |  [optional]
**merchantReference** | **String** | Reference used by merchant to identify batch. |  [optional]
**batchCaEndpoints** | **List&lt;String&gt;** | Valid Values:   * VISA   * MASTERCARD   * AMEX  |  [optional]
**status** | **String** | Valid Values:   * REJECTED   * RECEIVED   * VALIDATED   * DECLINED   * PROCESSING   * COMPLETE  |  [optional]
**totals** | [**InlineResponse2008EmbeddedTotals**](InlineResponse2008EmbeddedTotals.md) |  |  [optional]



