# SubscriptionsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateSubscription**](SubscriptionsApi.md#activateSubscription) | **POST** /rbs/v1/subscriptions/{id}/activate | Activate a Subscription
[**cancelSubscription**](SubscriptionsApi.md#cancelSubscription) | **POST** /rbs/v1/subscriptions/{id}/cancel | Cancel a Subscription
[**createSubscription**](SubscriptionsApi.md#createSubscription) | **POST** /rbs/v1/subscriptions | Create a Subscription
[**getAllSubscriptions**](SubscriptionsApi.md#getAllSubscriptions) | **GET** /rbs/v1/subscriptions | Get a List of Subscriptions
[**getSubscription**](SubscriptionsApi.md#getSubscription) | **GET** /rbs/v1/subscriptions/{id} | Get a Subscription
[**getSubscriptionCode**](SubscriptionsApi.md#getSubscriptionCode) | **GET** /rbs/v1/subscriptions/code | Get a Subscription Code
[**suspendSubscription**](SubscriptionsApi.md#suspendSubscription) | **POST** /rbs/v1/subscriptions/{id}/suspend | Suspend a Subscription
[**updateSubscription**](SubscriptionsApi.md#updateSubscription) | **PATCH** /rbs/v1/subscriptions/{id} | Update a Subscription


<a name="activateSubscription"></a>
# **activateSubscription**
> InlineResponse2009 activateSubscription(id)

Activate a Subscription

Activate a &#x60;CANCELLED&#x60; Or &#x60;SUSPENDED&#x60; Subscription 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = "id_example"; // String | Subscription Id
try {
    InlineResponse2009 result = apiInstance.activateSubscription(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#activateSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Subscription Id |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="cancelSubscription"></a>
# **cancelSubscription**
> InlineResponse202 cancelSubscription(id)

Cancel a Subscription

Cancel a Subscription

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = "id_example"; // String | Subscription Id
try {
    InlineResponse202 result = apiInstance.cancelSubscription(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#cancelSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Subscription Id |

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="createSubscription"></a>
# **createSubscription**
> InlineResponse2011 createSubscription(createSubscriptionRequest)

Create a Subscription

Create a Recurring Billing Subscription

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
CreateSubscriptionRequest createSubscriptionRequest = new CreateSubscriptionRequest(); // CreateSubscriptionRequest | 
try {
    InlineResponse2011 result = apiInstance.createSubscription(createSubscriptionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#createSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSubscriptionRequest** | [**CreateSubscriptionRequest**](CreateSubscriptionRequest.md)|  |

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getAllSubscriptions"></a>
# **getAllSubscriptions**
> InlineResponse2006 getAllSubscriptions(offset, limit, code, status)

Get a List of Subscriptions

Retrieve Subscriptions by Subscription Code &amp; Subscription Status. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
Integer offset = 56; // Integer | Page offset number.
Integer limit = 56; // Integer | Number of items to be returned. Default - `20`, Max - `100` 
String code = "code_example"; // String | Filter by Subscription Code
String status = "status_example"; // String | Filter by Subscription Status
try {
    InlineResponse2006 result = apiInstance.getAllSubscriptions(offset, limit, code, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getAllSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Page offset number. | [optional]
 **limit** | **Integer**| Number of items to be returned. Default - &#x60;20&#x60;, Max - &#x60;100&#x60;  | [optional]
 **code** | **String**| Filter by Subscription Code | [optional]
 **status** | **String**| Filter by Subscription Status | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getSubscription"></a>
# **getSubscription**
> InlineResponse2007 getSubscription(id)

Get a Subscription

Get a Subscription by Subscription Id

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = "id_example"; // String | Subscription Id
try {
    InlineResponse2007 result = apiInstance.getSubscription(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Subscription Id |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getSubscriptionCode"></a>
# **getSubscriptionCode**
> InlineResponse20010 getSubscriptionCode()

Get a Subscription Code

Get a Unique Subscription Code

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
try {
    InlineResponse20010 result = apiInstance.getSubscriptionCode();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getSubscriptionCode");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="suspendSubscription"></a>
# **suspendSubscription**
> InlineResponse2021 suspendSubscription(id)

Suspend a Subscription

Suspend a Subscription

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = "id_example"; // String | Subscription Id
try {
    InlineResponse2021 result = apiInstance.suspendSubscription(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#suspendSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Subscription Id |

### Return type

[**InlineResponse2021**](InlineResponse2021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="updateSubscription"></a>
# **updateSubscription**
> InlineResponse2008 updateSubscription(id, updateSubscription)

Update a Subscription

Update a Subscription by Subscription Id

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = "id_example"; // String | Subscription Id
UpdateSubscription updateSubscription = new UpdateSubscription(); // UpdateSubscription | Update Subscription
try {
    InlineResponse2008 result = apiInstance.updateSubscription(id, updateSubscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#updateSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Subscription Id |
 **updateSubscription** | [**UpdateSubscription**](UpdateSubscription.md)| Update Subscription |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

