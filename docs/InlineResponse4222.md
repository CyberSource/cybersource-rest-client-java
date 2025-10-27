
# InlineResponse4222

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submitTimeUtc** | **String** | Time of request in UTC.  Format: &#x60;YYYY-MM-DDThhmmssZ&#x60;, where: - &#x60;T&#x60;:  Separates the date and the time - &#x60;Z&#x60;:  Indicates Coordinated Universal Time (UTC), also known as Greenwich Mean Time (GMT)  Example:  &#x60;2020-01-11T224757Z&#x60; equals January 11, 2020, at 22:47:57 (10:47:57 p.m.)  |  [optional]
**status** | **String** | Possible values:   - &#x60;VALIDATION_ERROR&#x60;  |  [optional]
**reason** | **String** | The reason of the status.  Possible values:   - &#x60;PRODUCT_INACTIVE&#x60;   - &#x60;INVALID_MERCHANT_CONFIGURATION&#x60;   - &#x60;PRODUCT_NOT_CONFIGURED&#x60;  |  [optional]
**message** | **String** | The detail message related to the status and reason.  |  [optional]



