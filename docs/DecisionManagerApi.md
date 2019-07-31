# DecisionManagerApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDecisionManagerCase**](DecisionManagerApi.md#createDecisionManagerCase) | **POST** /risk/v1/decisions | Create Decision Manager Case


<a name="createDecisionManagerCase"></a>
# **createDecisionManagerCase**
> RiskV1DecisionsPost201Response createDecisionManagerCase(createDecisionManagerCaseRequest)

Create Decision Manager Case

This is the combined request to the Decision Manager Service for a transaction sent to Cybersource. Decision Manager will return a decision based on the request values. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.DecisionManagerApi;


DecisionManagerApi apiInstance = new DecisionManagerApi();
CreateDecisionManagerCaseRequest createDecisionManagerCaseRequest = new CreateDecisionManagerCaseRequest(); // CreateDecisionManagerCaseRequest | 
try {
    RiskV1DecisionsPost201Response result = apiInstance.createDecisionManagerCase(createDecisionManagerCaseRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionManagerApi#createDecisionManagerCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDecisionManagerCaseRequest** | [**CreateDecisionManagerCaseRequest**](CreateDecisionManagerCaseRequest.md)|  |

### Return type

[**RiskV1DecisionsPost201Response**](RiskV1DecisionsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

