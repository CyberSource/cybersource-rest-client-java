# NotificationOfChangesApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNotificationOfChangeReport**](NotificationOfChangesApi.md#getNotificationOfChangeReport) | **GET** /reporting/v3/notification-of-changes | Get Notification of Changes


<a name="getNotificationOfChangeReport"></a>
# **getNotificationOfChangeReport**
> ReportingV3NotificationofChangesGet200Response getNotificationOfChangeReport(startTime, endTime)

Get Notification of Changes

Download the Notification of Change report. This report shows eCheck-related fields updated as a result of a response to an eCheck settlement transaction. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.NotificationOfChangesApi;


NotificationOfChangesApi apiInstance = new NotificationOfChangesApi();
DateTime startTime = new DateTime(); // DateTime | Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z) 
DateTime endTime = new DateTime(); // DateTime | Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z) 
try {
    ReportingV3NotificationofChangesGet200Response result = apiInstance.getNotificationOfChangeReport(startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationOfChangesApi#getNotificationOfChangeReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **DateTime**| Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  |
 **endTime** | **DateTime**| Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  |

### Return type

[**ReportingV3NotificationofChangesGet200Response**](ReportingV3NotificationofChangesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json, text/csv, application/xml

