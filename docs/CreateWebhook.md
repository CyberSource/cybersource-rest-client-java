
# CreateWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Client friendly webhook name. |  [optional]
**description** | **String** | Client friendly webhook description. |  [optional]
**organizationId** | **String** | Organization Identifier (OrgId) or Merchant Identifier (MID). |  [optional]
**products** | [**List&lt;Notificationsubscriptionsv2webhooksProducts1&gt;**](Notificationsubscriptionsv2webhooksProducts1.md) | To see the valid productId and eventTypes, call the \&quot;Create and Manage Webhooks - Retrieve a list of event types\&quot; endpoint. |  [optional]
**webhookUrl** | **String** | The client&#39;s endpoint (URL) to receive webhooks. |  [optional]
**healthCheckUrl** | **String** | The client&#39;s health check endpoint (URL). This should be as close as possible to the actual webhookUrl. If the user does not provide the health check URL, it is the user&#39;s responsibility to re-activate the webhook if it is deactivated by calling the test endpoint.  |  [optional]
**retryPolicy** | [**Notificationsubscriptionsv2webhooksRetryPolicy**](Notificationsubscriptionsv2webhooksRetryPolicy.md) |  |  [optional]
**securityPolicy** | [**Notificationsubscriptionsv2webhooksSecurityPolicy1**](Notificationsubscriptionsv2webhooksSecurityPolicy1.md) |  |  [optional]



