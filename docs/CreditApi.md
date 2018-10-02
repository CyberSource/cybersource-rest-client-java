# CreditApi

All URIs are relative to *https://api.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCredit**](CreditApi.md#createCredit) | **POST** /v2/credits/ | Process a Credit
[**getCredit**](CreditApi.md#getCredit) | **GET** /v2/credits/{id} | Retrieve a Credit


<a name="createCredit"></a>
# **createCredit**
> InlineResponse2014 createCredit(createCreditRequest)

Process a Credit

POST to the credit resource to credit funds to a specified credit card.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CreditApi;


CreditApi apiInstance = new CreditApi();
CreateCreditRequest createCreditRequest = new CreateCreditRequest(); // CreateCreditRequest | 
try {
    InlineResponse2014 result = apiInstance.createCredit(createCreditRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditApi#createCredit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCreditRequest** | [**CreateCreditRequest**](CreateCreditRequest.md)|  |

### Return type

[**InlineResponse2014**](InlineResponse2014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCredit"></a>
# **getCredit**
> InlineResponse2006 getCredit(id)

Retrieve a Credit

Include the credit ID in the GET request to return details of the credit.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CreditApi;


CreditApi apiInstance = new CreditApi();
String id = "id_example"; // String | The credit ID returned from a previous stand-alone credit request. 
try {
    InlineResponse2006 result = apiInstance.getCredit(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditApi#getCredit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The credit ID returned from a previous stand-alone credit request.  |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

