# ReportSubscriptionsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStandardOrClassicSubscription**](ReportSubscriptionsApi.md#createStandardOrClassicSubscription) | **PUT** /reporting/v3/predefined-report-subscriptions | Create a Standard or Classic Subscription
[**createSubscription**](ReportSubscriptionsApi.md#createSubscription) | **PUT** /reporting/v3/report-subscriptions | Create Report Subscription for a Report Name by Organization
[**deleteSubscription**](ReportSubscriptionsApi.md#deleteSubscription) | **DELETE** /reporting/v3/report-subscriptions/{reportName} | Delete Subscription of a Report Name by Organization
[**getAllSubscriptions**](ReportSubscriptionsApi.md#getAllSubscriptions) | **GET** /reporting/v3/report-subscriptions | Get All Subscriptions
[**getSubscription**](ReportSubscriptionsApi.md#getSubscription) | **GET** /reporting/v3/report-subscriptions/{reportName} | Get Subscription for Report Name


<a name="createStandardOrClassicSubscription"></a>
# **createStandardOrClassicSubscription**
> createStandardOrClassicSubscription(predefinedSubscriptionRequestBean, organizationId)

Create a Standard or Classic Subscription

Create or update an already existing classic or standard subscription. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportSubscriptionsApi;


ReportSubscriptionsApi apiInstance = new ReportSubscriptionsApi();
PredefinedSubscriptionRequestBean predefinedSubscriptionRequestBean = new PredefinedSubscriptionRequestBean(); // PredefinedSubscriptionRequestBean | Report subscription request payload
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
try {
    apiInstance.createStandardOrClassicSubscription(predefinedSubscriptionRequestBean, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSubscriptionsApi#createStandardOrClassicSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **predefinedSubscriptionRequestBean** | [**PredefinedSubscriptionRequestBean**](PredefinedSubscriptionRequestBean.md)| Report subscription request payload |
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

<a name="createSubscription"></a>
# **createSubscription**
> createSubscription(createReportSubscriptionRequest, organizationId)

Create Report Subscription for a Report Name by Organization

Create a report subscription for your organization. The report name must be unique. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportSubscriptionsApi;


ReportSubscriptionsApi apiInstance = new ReportSubscriptionsApi();
CreateReportSubscriptionRequest createReportSubscriptionRequest = new CreateReportSubscriptionRequest(); // CreateReportSubscriptionRequest | Report subscription request payload
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
try {
    apiInstance.createSubscription(createReportSubscriptionRequest, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSubscriptionsApi#createSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createReportSubscriptionRequest** | [**CreateReportSubscriptionRequest**](CreateReportSubscriptionRequest.md)| Report subscription request payload |
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

<a name="deleteSubscription"></a>
# **deleteSubscription**
> deleteSubscription(reportName)

Delete Subscription of a Report Name by Organization

Delete a report subscription for your organization. You must know the unique name of the report you want to delete. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportSubscriptionsApi;


ReportSubscriptionsApi apiInstance = new ReportSubscriptionsApi();
String reportName = "reportName_example"; // String | Name of the Report to Delete
try {
    apiInstance.deleteSubscription(reportName);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSubscriptionsApi#deleteSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportName** | **String**| Name of the Report to Delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

<a name="getAllSubscriptions"></a>
# **getAllSubscriptions**
> ReportingV3ReportSubscriptionsGet200Response getAllSubscriptions()

Get All Subscriptions

View a summary of all report subscriptions. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportSubscriptionsApi;


ReportSubscriptionsApi apiInstance = new ReportSubscriptionsApi();
try {
    ReportingV3ReportSubscriptionsGet200Response result = apiInstance.getAllSubscriptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSubscriptionsApi#getAllSubscriptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportingV3ReportSubscriptionsGet200Response**](ReportingV3ReportSubscriptionsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

<a name="getSubscription"></a>
# **getSubscription**
> ReportingV3ReportSubscriptionsGet200ResponseSubscriptions getSubscription(reportName)

Get Subscription for Report Name

View the details of a report subscription, such as the report format or report frequency, using the report’s unique name. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReportSubscriptionsApi;


ReportSubscriptionsApi apiInstance = new ReportSubscriptionsApi();
String reportName = "reportName_example"; // String | Name of the Report to Retrieve
try {
    ReportingV3ReportSubscriptionsGet200ResponseSubscriptions result = apiInstance.getSubscription(reportName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSubscriptionsApi#getSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportName** | **String**| Name of the Report to Retrieve |

### Return type

[**ReportingV3ReportSubscriptionsGet200ResponseSubscriptions**](ReportingV3ReportSubscriptionsGet200ResponseSubscriptions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

