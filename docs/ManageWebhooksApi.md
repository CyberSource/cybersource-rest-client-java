# ManageWebhooksApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteWebhookSubscription**](ManageWebhooksApi.md#deleteWebhookSubscription) | **DELETE** /notification-subscriptions/v2/webhooks/{webhookId} | Delete a Webhook Subscription
[**getWebhookSubscriptionById**](ManageWebhooksApi.md#getWebhookSubscriptionById) | **GET** /notification-subscriptions/v2/webhooks/{webhookId} | Get Details On a Single Webhook
[**getWebhookSubscriptionsByOrg**](ManageWebhooksApi.md#getWebhookSubscriptionsByOrg) | **GET** /notification-subscriptions/v2/webhooks | Get Details On All Created Webhooks
[**notificationSubscriptionsV1WebhooksWebhookIdPost**](ManageWebhooksApi.md#notificationSubscriptionsV1WebhooksWebhookIdPost) | **POST** /notification-subscriptions/v1/webhooks/{webhookId} | Test a Webhook Configuration
[**notificationSubscriptionsV2WebhooksWebhookIdPatch**](ManageWebhooksApi.md#notificationSubscriptionsV2WebhooksWebhookIdPatch) | **PATCH** /notification-subscriptions/v2/webhooks/{webhookId} | Update a Webhook Subscription
[**notificationSubscriptionsV2WebhooksWebhookIdStatusPut**](ManageWebhooksApi.md#notificationSubscriptionsV2WebhooksWebhookIdStatusPut) | **PUT** /notification-subscriptions/v2/webhooks/{webhookId}/status | Update a Webhook Status
[**saveAsymEgressKey**](ManageWebhooksApi.md#saveAsymEgressKey) | **POST** /kms/egress/v2/keys-asym | Message Level Encryption


<a name="deleteWebhookSubscription"></a>
# **deleteWebhookSubscription**
> deleteWebhookSubscription(webhookId)

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
    apiInstance.deleteWebhookSubscription(webhookId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#deleteWebhookSubscription");
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

<a name="getWebhookSubscriptionById"></a>
# **getWebhookSubscriptionById**
> InlineResponse2015 getWebhookSubscriptionById(webhookId)

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
    InlineResponse2015 result = apiInstance.getWebhookSubscriptionById(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#getWebhookSubscriptionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**| The webhook Identifier |

### Return type

[**InlineResponse2015**](InlineResponse2015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getWebhookSubscriptionsByOrg"></a>
# **getWebhookSubscriptionsByOrg**
> List&lt;InlineResponse2004&gt; getWebhookSubscriptionsByOrg(organizationId, productId, eventType)

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
    List<InlineResponse2004> result = apiInstance.getWebhookSubscriptionsByOrg(organizationId, productId, eventType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#getWebhookSubscriptionsByOrg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The Organization Identifier. |
 **productId** | **String**| The Product Identifier. | [optional]
 **eventType** | **String**| The Event Type. | [optional]

### Return type

[**List&lt;InlineResponse2004&gt;**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="notificationSubscriptionsV1WebhooksWebhookIdPost"></a>
# **notificationSubscriptionsV1WebhooksWebhookIdPost**
> InlineResponse2016 notificationSubscriptionsV1WebhooksWebhookIdPost(webhookId)

Test a Webhook Configuration

Test the webhook configuration by sending a sample webhook. Calling this endpoint sends a sample webhook to the endpoint identified in the user&#39;s subscription.   It will contain sample values for the product &amp; eventType based on values present in your subscription along with a sample message in the payload.   Based on the webhook response users can make any necessary modifications or rest assured knowing their setup is configured correctly. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ManageWebhooksApi;


ManageWebhooksApi apiInstance = new ManageWebhooksApi();
String webhookId = "webhookId_example"; // String | The Webhook Identifier.
try {
    InlineResponse2016 result = apiInstance.notificationSubscriptionsV1WebhooksWebhookIdPost(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#notificationSubscriptionsV1WebhooksWebhookIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**| The Webhook Identifier. |

### Return type

[**InlineResponse2016**](InlineResponse2016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="notificationSubscriptionsV2WebhooksWebhookIdPatch"></a>
# **notificationSubscriptionsV2WebhooksWebhookIdPatch**
> notificationSubscriptionsV2WebhooksWebhookIdPatch(webhookId, updateWebhook)

Update a Webhook Subscription

Update a Webhook Subscription.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ManageWebhooksApi;


ManageWebhooksApi apiInstance = new ManageWebhooksApi();
String webhookId = "webhookId_example"; // String | The Webhook Identifier.
UpdateWebhook updateWebhook = new UpdateWebhook(); // UpdateWebhook | The webhook payload or changes to apply.
try {
    apiInstance.notificationSubscriptionsV2WebhooksWebhookIdPatch(webhookId, updateWebhook);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#notificationSubscriptionsV2WebhooksWebhookIdPatch");
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

<a name="notificationSubscriptionsV2WebhooksWebhookIdStatusPut"></a>
# **notificationSubscriptionsV2WebhooksWebhookIdStatusPut**
> notificationSubscriptionsV2WebhooksWebhookIdStatusPut(webhookId, updateStatus)

Update a Webhook Status

Users can update the status of a webhook subscription by calling this endpoint.   The webhookId parameter in the URL path identifies the specific webhook subscription to be updated. The request body accepts the values ACTIVE or INACTIVE. If the subscription is set to INACTIVE, webhooks will not be delivered until the subscription is activated again. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ManageWebhooksApi;


ManageWebhooksApi apiInstance = new ManageWebhooksApi();
String webhookId = "webhookId_example"; // String | The Webhook Identifier.
UpdateStatus updateStatus = new UpdateStatus(); // UpdateStatus | The status that the subscription should be updated to.
try {
    apiInstance.notificationSubscriptionsV2WebhooksWebhookIdStatusPut(webhookId, updateStatus);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#notificationSubscriptionsV2WebhooksWebhookIdStatusPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**| The Webhook Identifier. |
 **updateStatus** | [**UpdateStatus**](UpdateStatus.md)| The status that the subscription should be updated to. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="saveAsymEgressKey"></a>
# **saveAsymEgressKey**
> InlineResponse2017 saveAsymEgressKey(vCSenderOrganizationId, vCPermissions, saveAsymEgressKey, vCCorrelationId)

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
    InlineResponse2017 result = apiInstance.saveAsymEgressKey(vCSenderOrganizationId, vCPermissions, saveAsymEgressKey, vCCorrelationId);
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

[**InlineResponse2017**](InlineResponse2017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

