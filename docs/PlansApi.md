# PlansApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activatePlan**](PlansApi.md#activatePlan) | **POST** /rbs/v1/plans/{id}/activate | Activate a Plan
[**createPlan**](PlansApi.md#createPlan) | **POST** /rbs/v1/plans | Create a Plan
[**deactivatePlan**](PlansApi.md#deactivatePlan) | **POST** /rbs/v1/plans/{id}/deactivate | Deactivate a Plan
[**deletePlan**](PlansApi.md#deletePlan) | **DELETE** /rbs/v1/plans/{id} | Delete a Plan
[**getPlan**](PlansApi.md#getPlan) | **GET** /rbs/v1/plans/{id} | Get a Plan
[**getPlanCode**](PlansApi.md#getPlanCode) | **GET** /rbs/v1/plans/code | Get a Plan Code
[**getPlans**](PlansApi.md#getPlans) | **GET** /rbs/v1/plans | Get a List of Plans
[**updatePlan**](PlansApi.md#updatePlan) | **PATCH** /rbs/v1/plans/{id} | Update a Plan


<a name="activatePlan"></a>
# **activatePlan**
> InlineResponse2004 activatePlan(id)

Activate a Plan

Activate a Plan

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PlansApi;


PlansApi apiInstance = new PlansApi();
String id = "id_example"; // String | Plan Id
try {
    InlineResponse2004 result = apiInstance.activatePlan(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#activatePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Plan Id |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="createPlan"></a>
# **createPlan**
> InlineResponse201 createPlan(createPlanRequest)

Create a Plan

The recurring billing service enables you to manage payment plans and subscriptions for recurring payment schedules. It securely stores your customer&#39;s payment information and personal data within secure Visa data centers, reducing storage risks and PCI DSS scope through the use of *Token Management* (*TMS*).  The three key elements of *Cybersource* Recurring Billing are:  -  **Token**: stores customer billing, shipping, and payment details.  -  **Plan**: stores the billing schedule.  -  **Subscription**: combines the token and plan, and defines the subscription start date, name, and description.  The APIs in this section demonstrate the management of the Plans and Subscriptions. For Tokens please refer to [Token Management](#token-management) 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PlansApi;


PlansApi apiInstance = new PlansApi();
CreatePlanRequest createPlanRequest = new CreatePlanRequest(); // CreatePlanRequest | 
try {
    InlineResponse201 result = apiInstance.createPlan(createPlanRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#createPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPlanRequest** | [**CreatePlanRequest**](CreatePlanRequest.md)|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deactivatePlan"></a>
# **deactivatePlan**
> InlineResponse2004 deactivatePlan(id)

Deactivate a Plan

Deactivate a Plan

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PlansApi;


PlansApi apiInstance = new PlansApi();
String id = "id_example"; // String | Plan Id
try {
    InlineResponse2004 result = apiInstance.deactivatePlan(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#deactivatePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Plan Id |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deletePlan"></a>
# **deletePlan**
> InlineResponse2002 deletePlan(id)

Delete a Plan

Delete a Plan is only allowed: - plan status is in &#x60;DRAFT&#x60; - plan status is in &#x60;ACTIVE&#x60;, and &#x60;INACTIVE&#x60; only allowed when no subscriptions attached to a plan in the lifetime of a plan 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PlansApi;


PlansApi apiInstance = new PlansApi();
String id = "id_example"; // String | Plan Id
try {
    InlineResponse2002 result = apiInstance.deletePlan(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#deletePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Plan Id |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getPlan"></a>
# **getPlan**
> InlineResponse2001 getPlan(id)

Get a Plan

Retrieve a Plan details by Plan Id.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PlansApi;


PlansApi apiInstance = new PlansApi();
String id = "id_example"; // String | Plan Id
try {
    InlineResponse2001 result = apiInstance.getPlan(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#getPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Plan Id |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getPlanCode"></a>
# **getPlanCode**
> InlineResponse2005 getPlanCode()

Get a Plan Code

Get a Unique Plan Code

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PlansApi;


PlansApi apiInstance = new PlansApi();
try {
    InlineResponse2005 result = apiInstance.getPlanCode();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#getPlanCode");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getPlans"></a>
# **getPlans**
> InlineResponse200 getPlans(offset, limit, code, status, name)

Get a List of Plans

Retrieve Plans by Plan Code &amp; Plan Status. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PlansApi;


PlansApi apiInstance = new PlansApi();
Integer offset = 56; // Integer | Page offset number.
Integer limit = 56; // Integer | Number of items to be returned. Default - `20`, Max - `100` 
String code = "code_example"; // String | Filter by Plan Code
String status = "status_example"; // String | Filter by Plan Status
String name = "name_example"; // String | Filter by Plan Name. (First sub string or full string) **[Not Recommended]** 
try {
    InlineResponse200 result = apiInstance.getPlans(offset, limit, code, status, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#getPlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Page offset number. | [optional]
 **limit** | **Integer**| Number of items to be returned. Default - &#x60;20&#x60;, Max - &#x60;100&#x60;  | [optional]
 **code** | **String**| Filter by Plan Code | [optional]
 **status** | **String**| Filter by Plan Status | [optional]
 **name** | **String**| Filter by Plan Name. (First sub string or full string) **[Not Recommended]**  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updatePlan"></a>
# **updatePlan**
> InlineResponse2003 updatePlan(id, updatePlanRequest)

Update a Plan

Update a Plan  Plan in &#x60;DRAFT&#x60; status - All updates are allowed on Plan with &#x60;DRAFT&#x60; status  Plan in &#x60;ACTIVE&#x60; status [Following fields are **Not Updatable**] - &#x60;planInformation.billingPeriod&#x60; - &#x60;planInformation.billingCycles&#x60; [Update is only allowed to **increase** billingCycles] - &#x60;orderInformation.amountDetails.currency&#x60; 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PlansApi;


PlansApi apiInstance = new PlansApi();
String id = "id_example"; // String | Plan Id
UpdatePlanRequest updatePlanRequest = new UpdatePlanRequest(); // UpdatePlanRequest | 
try {
    InlineResponse2003 result = apiInstance.updatePlan(id, updatePlanRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#updatePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Plan Id |
 **updatePlanRequest** | [**UpdatePlanRequest**](UpdatePlanRequest.md)|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

