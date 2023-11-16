# CreateNewWebhooksApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhook**](CreateNewWebhooksApi.md#createWebhook) | **POST** /notification-subscriptions/v1/webhooks | Create a Webhook
[**findProductToSubscribe**](CreateNewWebhooksApi.md#findProductToSubscribe) | **GET** /notification-subscriptions/v1/products/{organizationId} | Find Products You Can Subscribe To
[**saveSymEgressKey**](CreateNewWebhooksApi.md#saveSymEgressKey) | **POST** /kms/egress/v2/keys-sym | Create Webhook Security Keys


<a name="createWebhook"></a>
# **createWebhook**
> InlineResponse2013 createWebhook(createWebhook)

Create a Webhook

Create a new webhook subscription. Before creating a webhook, ensure that a security key has been created at the top of this developer center section. You will not need to pass us back the key during the creation of the webhook, but you will receive an error if you did not already create a key or store one on file. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CreateNewWebhooksApi;


CreateNewWebhooksApi apiInstance = new CreateNewWebhooksApi();
CreateWebhook createWebhook = new CreateWebhook(); // CreateWebhook | The webhook payload
try {
    InlineResponse2013 result = apiInstance.createWebhook(createWebhook);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateNewWebhooksApi#createWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWebhook** | [**CreateWebhook**](CreateWebhook.md)| The webhook payload | [optional]

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="findProductToSubscribe"></a>
# **findProductToSubscribe**
> List&lt;InlineResponse2003&gt; findProductToSubscribe(organizationId)

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
    List<InlineResponse2003> result = apiInstance.findProductToSubscribe(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateNewWebhooksApi#findProductToSubscribe");
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

<a name="saveSymEgressKey"></a>
# **saveSymEgressKey**
> InlineResponse2012 saveSymEgressKey(vCSenderOrganizationId, vCPermissions, vCCorrelationId, saveSymEgressKey)

Create Webhook Security Keys

Create security keys that CyberSource will use internally to connect to your servers and validate messages using a digital signature.  Select the CREATE example for CyberSource to generate the key on our server and maintain it for you as well. Remeber to save the key in the API response, so that you can use it to validate messages later. 

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
    InlineResponse2012 result = apiInstance.saveSymEgressKey(vCSenderOrganizationId, vCPermissions, vCCorrelationId, saveSymEgressKey);
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

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

