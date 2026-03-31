# PullFundsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPullFundsRefund**](PullFundsApi.md#createPullFundsRefund) | **POST** /pts/v1/pull-funds-transfer/{id}/refund | Process a Pull Funds Refund
[**createPullFundsReversal**](PullFundsApi.md#createPullFundsReversal) | **POST** /pts/v1/pull-funds-transfer/{id}/reversal | Process a Pull Funds Reversal
[**createPullFundsTransfer**](PullFundsApi.md#createPullFundsTransfer) | **POST** /pts/v1/pull-funds-transfer | Process a Pull Funds Transfer


<a name="createPullFundsRefund"></a>
# **createPullFundsRefund**
> PullFundsRefund201Response createPullFundsRefund(pullFundsRefundRequest, id, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId)

Process a Pull Funds Refund

Refund an Account Funding Transaction (AFT). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PullFundsApi;


PullFundsApi apiInstance = new PullFundsApi();
PullFundsRefundRequest pullFundsRefundRequest = new PullFundsRefundRequest(); // PullFundsRefundRequest | 
String id = "id_example"; // String | The transaction id of a previous Account Funding Transaction. 
String contentType = "contentType_example"; // String | 
String xRequestid = "xRequestid_example"; // String | 
String vCMerchantId = "vCMerchantId_example"; // String | 
String vCPermissions = "vCPermissions_example"; // String | 
String vCCorrelationId = "vCCorrelationId_example"; // String | 
String vCOrganizationId = "vCOrganizationId_example"; // String | 
try {
    PullFundsRefund201Response result = apiInstance.createPullFundsRefund(pullFundsRefundRequest, id, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullFundsApi#createPullFundsRefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullFundsRefundRequest** | [**PullFundsRefundRequest**](PullFundsRefundRequest.md)|  |
 **id** | **String**| The transaction id of a previous Account Funding Transaction.  |
 **contentType** | **String**|  |
 **xRequestid** | **String**|  |
 **vCMerchantId** | **String**|  |
 **vCPermissions** | **String**|  |
 **vCCorrelationId** | **String**|  |
 **vCOrganizationId** | **String**|  |

### Return type

[**PullFundsRefund201Response**](PullFundsRefund201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="createPullFundsReversal"></a>
# **createPullFundsReversal**
> PullFundsReversal201Response createPullFundsReversal(pullFundsReversalRequest, id, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId)

Process a Pull Funds Reversal

Reverse an Account Funding Transaction (AFT). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PullFundsApi;


PullFundsApi apiInstance = new PullFundsApi();
PullFundsReversalRequest pullFundsReversalRequest = new PullFundsReversalRequest(); // PullFundsReversalRequest | 
String id = "id_example"; // String | The transaction id of a previous Account Funding Transaction. 
String contentType = "contentType_example"; // String | 
String xRequestid = "xRequestid_example"; // String | 
String vCMerchantId = "vCMerchantId_example"; // String | 
String vCPermissions = "vCPermissions_example"; // String | 
String vCCorrelationId = "vCCorrelationId_example"; // String | 
String vCOrganizationId = "vCOrganizationId_example"; // String | 
try {
    PullFundsReversal201Response result = apiInstance.createPullFundsReversal(pullFundsReversalRequest, id, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullFundsApi#createPullFundsReversal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullFundsReversalRequest** | [**PullFundsReversalRequest**](PullFundsReversalRequest.md)|  |
 **id** | **String**| The transaction id of a previous Account Funding Transaction.  |
 **contentType** | **String**|  |
 **xRequestid** | **String**|  |
 **vCMerchantId** | **String**|  |
 **vCPermissions** | **String**|  |
 **vCCorrelationId** | **String**|  |
 **vCOrganizationId** | **String**|  |

### Return type

[**PullFundsReversal201Response**](PullFundsReversal201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="createPullFundsTransfer"></a>
# **createPullFundsTransfer**
> PullFunds201Response createPullFundsTransfer(pullFundsRequest, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId)

Process a Pull Funds Transfer

Receive funds using an Account Funding Transaction (AFT). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PullFundsApi;


PullFundsApi apiInstance = new PullFundsApi();
PullFundsRequest pullFundsRequest = new PullFundsRequest(); // PullFundsRequest | 
String contentType = "contentType_example"; // String | 
String xRequestid = "xRequestid_example"; // String | 
String vCMerchantId = "vCMerchantId_example"; // String | 
String vCPermissions = "vCPermissions_example"; // String | 
String vCCorrelationId = "vCCorrelationId_example"; // String | 
String vCOrganizationId = "vCOrganizationId_example"; // String | 
try {
    PullFunds201Response result = apiInstance.createPullFundsTransfer(pullFundsRequest, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullFundsApi#createPullFundsTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullFundsRequest** | [**PullFundsRequest**](PullFundsRequest.md)|  |
 **contentType** | **String**|  |
 **xRequestid** | **String**|  |
 **vCMerchantId** | **String**|  |
 **vCPermissions** | **String**|  |
 **vCCorrelationId** | **String**|  |
 **vCOrganizationId** | **String**|  |

### Return type

[**PullFunds201Response**](PullFunds201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

