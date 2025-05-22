# DeviceSearchApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postSearchQueryV3**](DeviceSearchApi.md#postSearchQueryV3) | **POST** /dms/v3/devices/search | Retrieve List of Devices for a given search query V3


<a name="postSearchQueryV3"></a>
# **postSearchQueryV3**
> InlineResponse2006 postSearchQueryV3(postDeviceSearchRequestV3)

Retrieve List of Devices for a given search query V3

Search for devices matching a given search query.  The search query supports serialNumber, readerId, terminalId, status, statusChangeReason or organizationId  Matching results are paginated. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.DeviceSearchApi;


DeviceSearchApi apiInstance = new DeviceSearchApi();
PostDeviceSearchRequestV3 postDeviceSearchRequestV3 = new PostDeviceSearchRequestV3(); // PostDeviceSearchRequestV3 | 
try {
    InlineResponse2006 result = apiInstance.postSearchQueryV3(postDeviceSearchRequestV3);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceSearchApi#postSearchQueryV3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postDeviceSearchRequestV3** | [**PostDeviceSearchRequestV3**](PostDeviceSearchRequestV3.md)|  |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

