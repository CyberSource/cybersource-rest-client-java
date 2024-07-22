# ManageWebhooksApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteWebhookSubscription**](ManageWebhooksApi.md#deleteWebhookSubscription) | **DELETE** /notification-subscriptions/v1/webhooks/{webhookId} | Delete a Webhook Subscription
[**getWebhookSubscriptionById**](ManageWebhooksApi.md#getWebhookSubscriptionById) | **GET** /notification-subscriptions/v1/webhooks/{webhookId} | Get Details On a Single Webhook
[**getWebhookSubscriptionsByOrg**](ManageWebhooksApi.md#getWebhookSubscriptionsByOrg) | **GET** /notification-subscriptions/v1/webhooks | Get Details On All Created Webhooks
[**saveAsymEgressKey**](ManageWebhooksApi.md#saveAsymEgressKey) | **POST** /kms/egress/v2/keys-asym | Message Level Encryption
[**updateWebhookSubscription**](ManageWebhooksApi.md#updateWebhookSubscription) | **PATCH** /notification-subscriptions/v1/webhooks/{webhookId} | Update a Webhook Subscription


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
 - **Accept**: application/json;charset=utf-8

<a name="getWebhookSubscriptionById"></a>
# **getWebhookSubscriptionById**
> InlineResponse2005 getWebhookSubscriptionById(webhookId)

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
    InlineResponse2005 result = apiInstance.getWebhookSubscriptionById(webhookId);
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

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

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
 **productId** | **String**| The Product Identifier. |
 **eventType** | **String**| The Event Type. |

### Return type

[**List&lt;InlineResponse2004&gt;**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="saveAsymEgressKey"></a>
# **saveAsymEgressKey**
> InlineResponse2015 saveAsymEgressKey(vCSenderOrganizationId, vCPermissions, saveAsymEgressKey, vCCorrelationId)

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
    InlineResponse2015 result = apiInstance.saveAsymEgressKey(vCSenderOrganizationId, vCPermissions, saveAsymEgressKey, vCCorrelationId);
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

[**InlineResponse2015**](InlineResponse2015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateWebhookSubscription"></a>
# **updateWebhookSubscription**
> updateWebhookSubscription(webhookId, updateWebhookRequest)

Update a Webhook Subscription

Update the webhook subscription using PATCH.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ManageWebhooksApi;


ManageWebhooksApi apiInstance = new ManageWebhooksApi();
String webhookId = "webhookId_example"; // String | The Webhook Identifier.
UpdateWebhookRequest updateWebhookRequest = new UpdateWebhookRequest(); // UpdateWebhookRequest | The webhook payload or changes to apply.
try {
    apiInstance.updateWebhookSubscription(webhookId, updateWebhookRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageWebhooksApi#updateWebhookSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**| The Webhook Identifier. |
 **updateWebhookRequest** | [**UpdateWebhookRequest**](UpdateWebhookRequest.md)| The webhook payload or changes to apply. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

