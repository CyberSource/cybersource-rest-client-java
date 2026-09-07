# TransactionQueryApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQueryApi**](TransactionQueryApi.md#createQueryApi) | **POST** /pts/v2/payouts/transaction-query/{id} | Query Transaction Details


<a name="createQueryApi"></a>
# **createQueryApi**
> InlineResponse2014 createQueryApi(id, body, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId, limit, offset)

Query Transaction Details

Query the status and details of payouts transactions including Pull Funds, Push Funds, and Pull Funds Reversals 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TransactionQueryApi;


TransactionQueryApi apiInstance = new TransactionQueryApi();
String id = "id_example"; // String | This is the CyberSource Request ID generated for successfully processed AFT/OCT that needs to be queried. 
Body1 body = new Body1(); // Body1 | 
String contentType = "contentType_example"; // String | 
String xRequestid = "xRequestid_example"; // String | 
String vCMerchantId = "vCMerchantId_example"; // String | 
String vCPermissions = "vCPermissions_example"; // String | 
String vCCorrelationId = "vCCorrelationId_example"; // String | 
String vCOrganizationId = "vCOrganizationId_example"; // String | 
Integer limit = 56; // Integer | The maximum number of options to be retrieved from the processor and displayed to the consumer. 
Integer offset = 56; // Integer | Offset from the first item in the list of options received from the processor. If you want to display the options in multiple lists, this number represents the first option displayed in each list. 
try {
    InlineResponse2014 result = apiInstance.createQueryApi(id, body, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionQueryApi#createQueryApi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This is the CyberSource Request ID generated for successfully processed AFT/OCT that needs to be queried.  |
 **body** | [**Body1**](Body1.md)|  |
 **contentType** | **String**|  |
 **xRequestid** | **String**|  |
 **vCMerchantId** | **String**|  |
 **vCPermissions** | **String**|  |
 **vCCorrelationId** | **String**|  |
 **vCOrganizationId** | **String**|  |
 **limit** | **Integer**| The maximum number of options to be retrieved from the processor and displayed to the consumer.  | [optional]
 **offset** | **Integer**| Offset from the first item in the list of options received from the processor. If you want to display the options in multiple lists, this number represents the first option displayed in each list.  | [optional]

### Return type

[**InlineResponse2014**](InlineResponse2014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

