# SubscriptionsFollowOnsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFollowOnSubscription**](SubscriptionsFollowOnsApi.md#createFollowOnSubscription) | **POST** /rbs/v1/subscriptions/follow-ons/{requestId} | Create a Follow-On Subscription
[**getFollowOnSubscription**](SubscriptionsFollowOnsApi.md#getFollowOnSubscription) | **GET** /rbs/v1/subscriptions/follow-ons/{requestId} | Get a Follow-On Subscription


<a name="createFollowOnSubscription"></a>
# **createFollowOnSubscription**
> CreateSubscriptionResponse createFollowOnSubscription(requestId, createSubscriptionRequest)

Create a Follow-On Subscription

Create a new Subscription based on the Request Id of an existing successful Transaction.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SubscriptionsFollowOnsApi;


SubscriptionsFollowOnsApi apiInstance = new SubscriptionsFollowOnsApi();
String requestId = "requestId_example"; // String | Request Id of an existing successful Transaction
CreateSubscriptionRequest1 createSubscriptionRequest = new CreateSubscriptionRequest1(); // CreateSubscriptionRequest1 | 
try {
    CreateSubscriptionResponse result = apiInstance.createFollowOnSubscription(requestId, createSubscriptionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsFollowOnsApi#createFollowOnSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**| Request Id of an existing successful Transaction |
 **createSubscriptionRequest** | [**CreateSubscriptionRequest1**](CreateSubscriptionRequest1.md)|  |

### Return type

[**CreateSubscriptionResponse**](CreateSubscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

<a name="getFollowOnSubscription"></a>
# **getFollowOnSubscription**
> GetSubscriptionResponse1 getFollowOnSubscription(requestId)

Get a Follow-On Subscription

Get details of the Subscription being created based on the Request Id of an existing successful Transaction. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.SubscriptionsFollowOnsApi;


SubscriptionsFollowOnsApi apiInstance = new SubscriptionsFollowOnsApi();
String requestId = "requestId_example"; // String | Request Id of an existing successful Transaction
try {
    GetSubscriptionResponse1 result = apiInstance.getFollowOnSubscription(requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsFollowOnsApi#getFollowOnSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**| Request Id of an existing successful Transaction |

### Return type

[**GetSubscriptionResponse1**](GetSubscriptionResponse1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json, application/hal+json, application/json;charset=utf-8, application/hal+json;charset=utf-8

