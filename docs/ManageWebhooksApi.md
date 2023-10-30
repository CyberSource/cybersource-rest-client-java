# ManageWebhooksApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationSubscriptionsV1WebhooksGet**](ManageWebhooksApi.md#notificationSubscriptionsV1WebhooksGet) | **GET** /notification-subscriptions/v1/webhooks | Get Details On All Created Webhooks
[**notificationSubscriptionsV1WebhooksWebhookIdDelete**](ManageWebhooksApi.md#notificationSubscriptionsV1WebhooksWebhookIdDelete) | **DELETE** /notification-subscriptions/v1/webhooks/{webhookId} | Delete a Webhook Subscription
[**notificationSubscriptionsV1WebhooksWebhookIdGet**](ManageWebhooksApi.md#notificationSubscriptionsV1WebhooksWebhookIdGet) | **GET** /notification-subscriptions/v1/webhooks/{webhookId} | Get Details On a Single Webhook
[**notificationSubscriptionsV1WebhooksWebhookIdPatch**](ManageWebhooksApi.md#notificationSubscriptionsV1WebhooksWebhookIdPatch) | **PATCH** /notification-subscriptions/v1/webhooks/{webhookId} | Update a Webhook Subscription
[**nrtfV1WebhooksWebhookIdReplaysPost**](ManageWebhooksApi.md#nrtfV1WebhooksWebhookIdReplaysPost) | **POST** /nrtf/v1/webhooks/{webhookId}/replays | Replay Previous Webhooks
[**saveAsymEgressKey**](ManageWebhooksApi.md#saveAsymEgressKey) | **POST** /kms/egress/v2/keys-asym | Message Level Encryption


<a name="notificationSubscriptionsV1WebhooksGet"></a>
# **notificationSubscriptionsV1WebhooksGet**
> List&lt;InlineResponse2004&gt; notificationSubscriptionsV1WebhooksGet(organizationId, productId, eventType)

Get Details On All Created Webhooks

Retrieve a list of all previously created webhooks.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ManageWebhooksApi;


ManageWebhooksApi apiInstance = new ManageWebhooksApi();
String organizationId = "organizationId_example"; // String | The Organization Identifier.
String productId = "productId_example"; // String | The Product Identifier.
String eventType = "eventType_example"; // String | The Event Type.
try {
    List<InlineResponse2004> result = apiInstance.notificationSubscriptionsV1WebhooksGet(organizationId, productId, eventType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#notificationSubscriptionsV1WebhooksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The Organization Identifier. |
 **productId** | **String**| The Product Identifier. |
 **eventType** | **String**| The Event Type. |

### Return type

[**List&lt;InlineResponse2004&gt;**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="notificationSubscriptionsV1WebhooksWebhookIdDelete"></a>
# **notificationSubscriptionsV1WebhooksWebhookIdDelete**
> notificationSubscriptionsV1WebhooksWebhookIdDelete(webhookId)

Delete a Webhook Subscription

Delete the webhook. Please note that deleting a particular webhook does not delete the history of the webhook notifications.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ManageWebhooksApi;


ManageWebhooksApi apiInstance = new ManageWebhooksApi();
String webhookId = "webhookId_example"; // String | The webhook identifier.
try {
    apiInstance.notificationSubscriptionsV1WebhooksWebhookIdDelete(webhookId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#notificationSubscriptionsV1WebhooksWebhookIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**| The webhook identifier. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="notificationSubscriptionsV1WebhooksWebhookIdGet"></a>
# **notificationSubscriptionsV1WebhooksWebhookIdGet**
> InlineResponse2004 notificationSubscriptionsV1WebhooksWebhookIdGet(webhookId)

Get Details On a Single Webhook

Retrieve the details of a specific webhook by supplying the webhook ID in the path.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ManageWebhooksApi;


ManageWebhooksApi apiInstance = new ManageWebhooksApi();
String webhookId = "webhookId_example"; // String | The webhook Identifier
try {
    InlineResponse2004 result = apiInstance.notificationSubscriptionsV1WebhooksWebhookIdGet(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#notificationSubscriptionsV1WebhooksWebhookIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**| The webhook Identifier |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="notificationSubscriptionsV1WebhooksWebhookIdPatch"></a>
# **notificationSubscriptionsV1WebhooksWebhookIdPatch**
> notificationSubscriptionsV1WebhooksWebhookIdPatch(webhookId, updateWebhook)

Update a Webhook Subscription

Update the webhook subscription using PATCH.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ManageWebhooksApi;


ManageWebhooksApi apiInstance = new ManageWebhooksApi();
String webhookId = "webhookId_example"; // String | The Webhook Identifier.
UpdateWebhook updateWebhook = new UpdateWebhook(); // UpdateWebhook | The webhook payload or changes to apply.
try {
    apiInstance.notificationSubscriptionsV1WebhooksWebhookIdPatch(webhookId, updateWebhook);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#notificationSubscriptionsV1WebhooksWebhookIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**| The Webhook Identifier. |
 **updateWebhook** | [**UpdateWebhook**](UpdateWebhook.md)| The webhook payload or changes to apply. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="nrtfV1WebhooksWebhookIdReplaysPost"></a>
# **nrtfV1WebhooksWebhookIdReplaysPost**
> nrtfV1WebhooksWebhookIdReplaysPost(webhookId, replayWebhooks)

Replay Previous Webhooks

Initiate a webhook replay request to replay transactions that happened in the past.  Cannot execute more than 1 replay request at a time. While one request is processing, you will not be allowed to execute another replay.  The difference between Start and End time cannot exceed a 24 hour window, and 1 month is the farthest date back that is eligible for replay. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ManageWebhooksApi;


ManageWebhooksApi apiInstance = new ManageWebhooksApi();
String webhookId = "webhookId_example"; // String | The webhook uuid identifier.
ReplayWebhooks replayWebhooks = new ReplayWebhooks(); // ReplayWebhooks | The request query
try {
    apiInstance.nrtfV1WebhooksWebhookIdReplaysPost(webhookId, replayWebhooks);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#nrtfV1WebhooksWebhookIdReplaysPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**| The webhook uuid identifier. |
 **replayWebhooks** | [**ReplayWebhooks**](ReplayWebhooks.md)| The request query | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="saveAsymEgressKey"></a>
# **saveAsymEgressKey**
> InlineResponse2014 saveAsymEgressKey(vCSenderOrganizationId, vCPermissions, saveAsymEgressKey, vCCorrelationId)

Message Level Encryption

Store and manage certificates that will be used to preform Message Level Encryption (MLE). Each new webhook will need its own unique asymmetric certificate. You can either use a digital certificate issued/signed by a CA or self-sign your own using the documentation available on the Developer Guide. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ManageWebhooksApi;


ManageWebhooksApi apiInstance = new ManageWebhooksApi();
String vCSenderOrganizationId = "vCSenderOrganizationId_example"; // String | Sender organization id
String vCPermissions = "vCPermissions_example"; // String | Encoded user permissions returned by the CGK, for the entity user who initiated the boarding
SaveAsymEgressKey saveAsymEgressKey = new SaveAsymEgressKey(); // SaveAsymEgressKey | Provide egress Asymmetric key information to save (create or store)
String vCCorrelationId = "vCCorrelationId_example"; // String | A globally unique id associated with your request
try {
    InlineResponse2014 result = apiInstance.saveAsymEgressKey(vCSenderOrganizationId, vCPermissions, saveAsymEgressKey, vCCorrelationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#saveAsymEgressKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vCSenderOrganizationId** | **String**| Sender organization id |
 **vCPermissions** | **String**| Encoded user permissions returned by the CGK, for the entity user who initiated the boarding |
 **saveAsymEgressKey** | [**SaveAsymEgressKey**](SaveAsymEgressKey.md)| Provide egress Asymmetric key information to save (create or store) |
 **vCCorrelationId** | **String**| A globally unique id associated with your request | [optional]

### Return type

[**InlineResponse2014**](InlineResponse2014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

