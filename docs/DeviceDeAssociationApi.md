# DeviceDeAssociationApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTerminalAssociation**](DeviceDeAssociationApi.md#deleteTerminalAssociation) | **PATCH** /dms/v2/devices/deassociate | De-associate a device from merchant or account V2
[**postDeAssociateV3Terminal**](DeviceDeAssociationApi.md#postDeAssociateV3Terminal) | **POST** /dms/v3/devices/deassociate | De-associate a device from merchant to account or reseller and from account to reseller


<a name="deleteTerminalAssociation"></a>
# **deleteTerminalAssociation**
> deleteTerminalAssociation(deAssociationRequestBody)

De-associate a device from merchant or account V2

The current association of the device will be removed and will be assigned back to parent in the hierarchy based on internal logic

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.DeviceDeAssociationApi;


DeviceDeAssociationApi apiInstance = new DeviceDeAssociationApi();
DeAssociationRequestBody deAssociationRequestBody = new DeAssociationRequestBody(); // DeAssociationRequestBody | de association of the deviceId in the request body.
try {
    apiInstance.deleteTerminalAssociation(deAssociationRequestBody);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDeAssociationApi#deleteTerminalAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deAssociationRequestBody** | [**DeAssociationRequestBody**](DeAssociationRequestBody.md)| de association of the deviceId in the request body. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="postDeAssociateV3Terminal"></a>
# **postDeAssociateV3Terminal**
> List&lt;InlineResponse2009&gt; postDeAssociateV3Terminal(deviceDeAssociateV3Request)

De-associate a device from merchant to account or reseller and from account to reseller

A device will be de-associated from its current organization and moved up in the hierarchy. The device&#39;s new position will be determined by a specified destination, either an account or a portfolio. If no destination is provided, the device will default to the currently logged-in user. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.DeviceDeAssociationApi;


DeviceDeAssociationApi apiInstance = new DeviceDeAssociationApi();
List<DeviceDeAssociateV3Request> deviceDeAssociateV3Request = Arrays.asList(new DeviceDeAssociateV3Request()); // List<DeviceDeAssociateV3Request> | deviceId that has to be de-associated to the destination organizationId.
try {
    List<InlineResponse2009> result = apiInstance.postDeAssociateV3Terminal(deviceDeAssociateV3Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDeAssociationApi#postDeAssociateV3Terminal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceDeAssociateV3Request** | [**List&lt;DeviceDeAssociateV3Request&gt;**](DeviceDeAssociateV3Request.md)| deviceId that has to be de-associated to the destination organizationId. |

### Return type

[**List&lt;InlineResponse2009&gt;**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

