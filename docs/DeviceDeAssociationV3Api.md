# DeviceDeAssociationV3Api

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postDeAssociateV3Terminal**](DeviceDeAssociationV3Api.md#postDeAssociateV3Terminal) | **POST** /dms/v3/devices/deassociate | De-associate a device from merchant to account or reseller and from account to reseller V3


<a name="postDeAssociateV3Terminal"></a>
# **postDeAssociateV3Terminal**
> List&lt;InlineResponse2005&gt; postDeAssociateV3Terminal(deviceDeAssociateV3Request)

De-associate a device from merchant to account or reseller and from account to reseller V3

A device will be de-associated from its current organization and moved up in the hierarchy. The device&#39;s new position will be determined by a specified destination, either an account or a portfolio. If no destination is provided, the device will default to the currently logged-in user. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.DeviceDeAssociationV3Api;


DeviceDeAssociationV3Api apiInstance = new DeviceDeAssociationV3Api();
List<DeviceDeAssociateV3Request> deviceDeAssociateV3Request = Arrays.asList(new DeviceDeAssociateV3Request()); // List<DeviceDeAssociateV3Request> | deviceId that has to be de-associated to the destination organizationId.
try {
    List<InlineResponse2005> result = apiInstance.postDeAssociateV3Terminal(deviceDeAssociateV3Request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDeAssociationV3Api#postDeAssociateV3Terminal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceDeAssociateV3Request** | [**List&lt;DeviceDeAssociateV3Request&gt;**](DeviceDeAssociateV3Request.md)| deviceId that has to be de-associated to the destination organizationId. |

### Return type

[**List&lt;InlineResponse2005&gt;**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

