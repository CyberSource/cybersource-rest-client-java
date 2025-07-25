
# GetSubscriptionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**GetAllSubscriptionsResponseLinks**](GetAllSubscriptionsResponseLinks.md) |  |  [optional]
**id** | **String** | An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response.  |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services.  |  [optional]
**planInformation** | [**GetAllSubscriptionsResponsePlanInformation**](GetAllSubscriptionsResponsePlanInformation.md) |  |  [optional]
**subscriptionInformation** | [**GetAllSubscriptionsResponseSubscriptionInformation**](GetAllSubscriptionsResponseSubscriptionInformation.md) |  |  [optional]
**paymentInformation** | [**GetAllSubscriptionsResponsePaymentInformation**](GetAllSubscriptionsResponsePaymentInformation.md) |  |  [optional]
**orderInformation** | [**GetAllSubscriptionsResponseOrderInformation**](GetAllSubscriptionsResponseOrderInformation.md) |  |  [optional]
**reactivationInformation** | [**GetSubscriptionResponseReactivationInformation**](GetSubscriptionResponseReactivationInformation.md) |  |  [optional]



