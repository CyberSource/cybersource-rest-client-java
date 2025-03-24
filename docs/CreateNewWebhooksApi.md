# CreateNewWebhooksApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**saveSymEgressKey**](CreateNewWebhooksApi.md#saveSymEgressKey) | **POST** /kms/egress/v2/keys-sym | Create Webhook Security Keys


<a name="saveSymEgressKey"></a>
# **saveSymEgressKey**
> InlineResponse2013 saveSymEgressKey(vCSenderOrganizationId, vCPermissions, vCCorrelationId, saveSymEgressKey)

Create Webhook Security Keys

Create security keys that CyberSource will use internally to connect to your servers and validate messages using a digital signature.  Select the CREATE example for CyberSource to generate the key on our server and maintain it for you as well. Remember to save the key in the API response, so that you can use it to validate messages later. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CreateNewWebhooksApi;


CreateNewWebhooksApi apiInstance = new CreateNewWebhooksApi();
String vCSenderOrganizationId = "vCSenderOrganizationId_example"; // String | Sender organization id
String vCPermissions = "vCPermissions_example"; // String | Encoded user permissions returned by the CGK, for the entity user who initiated the boarding
String vCCorrelationId = "vCCorrelationId_example"; // String | A globally unique id associated with your request
SaveSymEgressKey saveSymEgressKey = new SaveSymEgressKey(); // SaveSymEgressKey | Provide egress Symmetric key information to save (create or store or refresh)
try {
    InlineResponse2013 result = apiInstance.saveSymEgressKey(vCSenderOrganizationId, vCPermissions, vCCorrelationId, saveSymEgressKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateNewWebhooksApi#saveSymEgressKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vCSenderOrganizationId** | **String**| Sender organization id |
 **vCPermissions** | **String**| Encoded user permissions returned by the CGK, for the entity user who initiated the boarding |
 **vCCorrelationId** | **String**| A globally unique id associated with your request | [optional]
 **saveSymEgressKey** | [**SaveSymEgressKey**](SaveSymEgressKey.md)| Provide egress Symmetric key information to save (create or store or refresh) | [optional]

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

