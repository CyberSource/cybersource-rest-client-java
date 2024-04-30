# ReplayWebhooksApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**replayPreviousWebhooks**](ReplayWebhooksApi.md#replayPreviousWebhooks) | **POST** /nrtf/v1/webhooks/{webhookId}/replays | Replay Previous Webhooks


<a name="replayPreviousWebhooks"></a>
# **replayPreviousWebhooks**
> replayPreviousWebhooks(webhookId, replayWebhooksRequest)

Replay Previous Webhooks

Initiate a webhook replay request to replay transactions that happened in the past.  Cannot execute more than 1 replay request at a time. While one request is processing, you will not be allowed to execute another replay.  The difference between Start and End time cannot exceed a 24 hour window, and 1 month is the farthest date back that is eligible for replay. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReplayWebhooksApi;


ReplayWebhooksApi apiInstance = new ReplayWebhooksApi();
String webhookId = "webhookId_example"; // String | The webhook uuid identifier.
ReplayWebhooksRequest replayWebhooksRequest = new ReplayWebhooksRequest(); // ReplayWebhooksRequest | The request query
try {
    apiInstance.replayPreviousWebhooks(webhookId, replayWebhooksRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ReplayWebhooksApi#replayPreviousWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**| The webhook uuid identifier. |
 **replayWebhooksRequest** | [**ReplayWebhooksRequest**](ReplayWebhooksRequest.md)| The request query | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

