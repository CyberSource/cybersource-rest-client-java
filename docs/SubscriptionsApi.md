# SubscriptionsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateSubscription**](SubscriptionsApi.md#activateSubscription) | **POST** /rbs/v1/subscriptions/{id}/activate | Reactivating a Suspended Subscription
[**cancelSubscription**](SubscriptionsApi.md#cancelSubscription) | **POST** /rbs/v1/subscriptions/{id}/cancel | Cancel a Subscription
[**createSubscription**](SubscriptionsApi.md#createSubscription) | **POST** /rbs/v1/subscriptions | Create a Subscription
[**getAllSubscriptions**](SubscriptionsApi.md#getAllSubscriptions) | **GET** /rbs/v1/subscriptions | Get a List of Subscriptions
[**getSubscription**](SubscriptionsApi.md#getSubscription) | **GET** /rbs/v1/subscriptions/{id} | Get a Subscription
[**getSubscriptionCode**](SubscriptionsApi.md#getSubscriptionCode) | **GET** /rbs/v1/subscriptions/code | Get a Subscription Code
[**suspendSubscription**](SubscriptionsApi.md#suspendSubscription) | **POST** /rbs/v1/subscriptions/{id}/suspend | Suspend a Subscription
[**updateSubscription**](SubscriptionsApi.md#updateSubscription) | **PATCH** /rbs/v1/subscriptions/{id} | Update a Subscription


<a name="activateSubscription"></a>
# **activateSubscription**
> ActivateSubscriptionResponse activateSubscription(id, processMissedPayments)

Reactivating a Suspended Subscription

# Reactivating a Suspended Subscription  You can reactivate a suspended subscription for the next billing cycle. You cannot reactivate a canceled or completed subscription.  You can specify whether you want to process missed payments for the period during which the subscription was suspended using the &#x60;processMissedPayments&#x60; query parameter by setting it to true or false.  If no value is specified, the system will default to &#x60;true&#x60;.  **Important:** The \&quot;processMissedPayments\&quot; query parameter is only effective when the Ask each time before reactivating option is selected in the reactivation settings. If any other option is chosen, the value provided in the request will be ignored by the system. For more information, see the [Recurring Billing User Guide](https://developer.cybersource.com/docs/cybs/en-us/recurring-billing/user/all/rest/recurring-billing-user/recurring-billing-user-about-guide.html).  You can check how many payments were missed and the total amount by retrieving the subscription details, where you will find the &#x60;reactivationInformation&#x60; object. See: [Retrieving a Subscription](https://developer.cybersource.com/docs/cybs/en-us/recurring-billing/developer/all/rest/recurring-billing-dev/recur-bill-subscriptions/recur-bill-getting-a-subscription.html). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = "id_example"; // String | Subscription Id
Boolean processMissedPayments = true; // Boolean | Indicates if missed payments should be processed from the period when the subscription was suspended. By default, this is set to true. When any option other than \"Ask each time before reactivating\" is selected in the reactivation settings, the value that you enter will be ignored. 
try {
    ActivateSubscriptionResponse result = apiInstance.activateSubscription(id, processMissedPayments);
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
 **processMissedPayments** | **Boolean**| Indicates if missed payments should be processed from the period when the subscription was suspended. By default, this is set to true. When any option other than \&quot;Ask each time before reactivating\&quot; is selected in the reactivation settings, the value that you enter will be ignored.  | [optional] [default to true]

### Return type

[**ActivateSubscriptionResponse**](ActivateSubscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

<a name="cancelSubscription"></a>
# **cancelSubscription**
> CancelSubscriptionResponse cancelSubscription(id)

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
    CancelSubscriptionResponse result = apiInstance.cancelSubscription(id);
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

[**CancelSubscriptionResponse**](CancelSubscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

<a name="createSubscription"></a>
# **createSubscription**
> CreateSubscriptionResponse createSubscription(createSubscriptionRequest)

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
    CreateSubscriptionResponse result = apiInstance.createSubscription(createSubscriptionRequest);
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

[**CreateSubscriptionResponse**](CreateSubscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

<a name="getAllSubscriptions"></a>
# **getAllSubscriptions**
> GetAllSubscriptionsResponse getAllSubscriptions(offset, limit, code, status)

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
    GetAllSubscriptionsResponse result = apiInstance.getAllSubscriptions(offset, limit, code, status);
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

[**GetAllSubscriptionsResponse**](GetAllSubscriptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

<a name="getSubscription"></a>
# **getSubscription**
> GetSubscriptionResponse getSubscription(id)

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
    GetSubscriptionResponse result = apiInstance.getSubscription(id);
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

[**GetSubscriptionResponse**](GetSubscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

<a name="getSubscriptionCode"></a>
# **getSubscriptionCode**
> GetSubscriptionCodeResponse getSubscriptionCode()

Get a Subscription Code

Get a Unique Subscription Code

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
try {
    GetSubscriptionCodeResponse result = apiInstance.getSubscriptionCode();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getSubscriptionCode");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSubscriptionCodeResponse**](GetSubscriptionCodeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

<a name="suspendSubscription"></a>
# **suspendSubscription**
> SuspendSubscriptionResponse suspendSubscription(id)

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
    SuspendSubscriptionResponse result = apiInstance.suspendSubscription(id);
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

[**SuspendSubscriptionResponse**](SuspendSubscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

<a name="updateSubscription"></a>
# **updateSubscription**
> UpdateSubscriptionResponse updateSubscription(id, updateSubscription)

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
    UpdateSubscriptionResponse result = apiInstance.updateSubscription(id, updateSubscription);
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

[**UpdateSubscriptionResponse**](UpdateSubscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

