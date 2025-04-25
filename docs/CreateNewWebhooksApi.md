# CreateNewWebhooksApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findProductsToSubscribe**](CreateNewWebhooksApi.md#findProductsToSubscribe) | **GET** /notification-subscriptions/v2/products/{organizationId} | Find Products You Can Subscribe To
[**notificationSubscriptionsV2WebhooksPost**](CreateNewWebhooksApi.md#notificationSubscriptionsV2WebhooksPost) | **POST** /notification-subscriptions/v2/webhooks | Create a New Webhook Subscription
[**saveSymEgressKey**](CreateNewWebhooksApi.md#saveSymEgressKey) | **POST** /kms/egress/v2/keys-sym | Create Webhook Security Keys


<a name="findProductsToSubscribe"></a>
# **findProductsToSubscribe**
> List&lt;InlineResponse2003&gt; findProductsToSubscribe(organizationId)

Find Products You Can Subscribe To

Retrieve a list of products and event types that your account is eligible for. These products and events are the ones that you may subscribe to in the next step of creating webhooks.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CreateNewWebhooksApi;


CreateNewWebhooksApi apiInstance = new CreateNewWebhooksApi();
String organizationId = "organizationId_example"; // String | The Organization Identifier.
try {
    List<InlineResponse2003> result = apiInstance.findProductsToSubscribe(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateNewWebhooksApi#findProductsToSubscribe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The Organization Identifier. |

### Return type

[**List&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="notificationSubscriptionsV2WebhooksPost"></a>
# **notificationSubscriptionsV2WebhooksPost**
> InlineResponse2014 notificationSubscriptionsV2WebhooksPost(createWebhook)

Create a New Webhook Subscription

Create a new webhook subscription. Before creating a webhook, ensure that a signature key has been created.  For the example \&quot;Create Webhook using oAuth with Client Credentials\&quot; - for clients who have more than one oAuth Provider and have different client secrets that they would like to config for a given webhook, they may do so by overriding the keyId inside security config of webhook subscription. See the Developer Center examples section titled \&quot;Webhook Security - Create or Store Egress Symmetric Key - Store oAuth Credentials For Symmetric Key\&quot; to store these oAuth credentials that CYBS will need for oAuth.  For JWT authentication, attach your oAuth details to the webhook subscription. See the example \&quot;Create Webhook using oAuth with JWT\&quot; 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CreateNewWebhooksApi;


CreateNewWebhooksApi apiInstance = new CreateNewWebhooksApi();
CreateWebhook createWebhook = new CreateWebhook(); // CreateWebhook | The webhook payload
try {
    InlineResponse2014 result = apiInstance.notificationSubscriptionsV2WebhooksPost(createWebhook);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateNewWebhooksApi#notificationSubscriptionsV2WebhooksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWebhook** | [**CreateWebhook**](CreateWebhook.md)| The webhook payload | [optional]

### Return type

[**InlineResponse2014**](InlineResponse2014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="saveSymEgressKey"></a>
# **saveSymEgressKey**
> InlineResponse2013 saveSymEgressKey(vCSenderOrganizationId, vCPermissions, vCCorrelationId, saveSymEgressKey)

Create Webhook Security Keys

Create security keys that CyberSource will use internally to connect to your servers and validate messages using a digital signature.  Select the CREATE example for CyberSource to generate the key on our server and maintain it for you as well. Remember to save the key in the API response, so that you can use it to validate messages later. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CreateNewWebhooksApi;


CreateNewWebhooksApi apiInstance = new CreateNewWebhooksApi();
String vCSenderOrganizationId = "vCSenderOrganizationId_example"; // String | Sender organization id
String vCPermissions = "vCPermissions_example"; // String | Encoded user permissions returned by the CGK, for the entity user who initiated the boarding
String vCCorrelationId = "vCCorrelationId_example"; // String | A globally unique id associated with your request
SaveSymEgressKey saveSymEgressKey = new SaveSymEgressKey(); // SaveSymEgressKey | Provide egress Symmetric key information to save (create or store or refresh)
try {
    InlineResponse2013 result = apiInstance.saveSymEgressKey(vCSenderOrganizationId, vCPermissions, vCCorrelationId, saveSymEgressKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateNewWebhooksApi#saveSymEgressKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vCSenderOrganizationId** | **String**| Sender organization id |
 **vCPermissions** | **String**| Encoded user permissions returned by the CGK, for the entity user who initiated the boarding |
 **vCCorrelationId** | **String**| A globally unique id associated with your request | [optional]
 **saveSymEgressKey** | [**SaveSymEgressKey**](SaveSymEgressKey.md)| Provide egress Symmetric key information to save (create or store or refresh) | [optional]

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

