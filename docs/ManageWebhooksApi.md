# ManageWebhooksApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationSubscriptionsV1WebhooksWebhookIdPost**](ManageWebhooksApi.md#notificationSubscriptionsV1WebhooksWebhookIdPost) | **POST** /notification-subscriptions/v1/webhooks/{webhookId} | Test a Webhook Configuration
[**saveAsymEgressKey**](ManageWebhooksApi.md#saveAsymEgressKey) | **POST** /kms/egress/v2/keys-asym | Message Level Encryption


<a name="notificationSubscriptionsV1WebhooksWebhookIdPost"></a>
# **notificationSubscriptionsV1WebhooksWebhookIdPost**
> InlineResponse2014 notificationSubscriptionsV1WebhooksWebhookIdPost(webhookId)

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
    InlineResponse2014 result = apiInstance.notificationSubscriptionsV1WebhooksWebhookIdPost(webhookId);
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

[**InlineResponse2014**](InlineResponse2014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

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
 - **Accept**: application/hal+json;charset=utf-8

