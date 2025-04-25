
# Rbsv1subscriptionsProcessingInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commerceIndicator** | **String** | Commerce Indicator is a way to identify the type of transaction. Some payment card companies use this information when determining discount rates.  Valid values: - &#x60;MOTO&#x60; - &#x60;RECURRING&#x60; - &#x60;INTERNET&#x60;  Please add the ecommerce indicator based on the rules defined by your gateway/processor. Some gateways may not accept the Commerce Indicator &#x60;RECURRING&#x60; with a Zero Dollar Authorization, that is done for subscriptions starting at a future date.  |  [optional]
**authorizationOptions** | [**Rbsv1subscriptionsProcessingInformationAuthorizationOptions**](Rbsv1subscriptionsProcessingInformationAuthorizationOptions.md) |  |  [optional]



