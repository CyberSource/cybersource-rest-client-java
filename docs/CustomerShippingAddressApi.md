# CustomerShippingAddressApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCustomerShippingAddress**](CustomerShippingAddressApi.md#deleteCustomerShippingAddress) | **DELETE** /tms/v2/customers/{customerTokenId}/shipping-addresses/{shippingAddressTokenId} | Delete a Customer Shipping Address
[**getCustomerShippingAddress**](CustomerShippingAddressApi.md#getCustomerShippingAddress) | **GET** /tms/v2/customers/{customerTokenId}/shipping-addresses/{shippingAddressTokenId} | Retrieve a Customer Shipping Address
[**getCustomerShippingAddressesList**](CustomerShippingAddressApi.md#getCustomerShippingAddressesList) | **GET** /tms/v2/customers/{customerTokenId}/shipping-addresses | List Shipping Addresses for a Customer
[**patchCustomersShippingAddress**](CustomerShippingAddressApi.md#patchCustomersShippingAddress) | **PATCH** /tms/v2/customers/{customerTokenId}/shipping-addresses/{shippingAddressTokenId} | Update a Customer Shipping Address
[**postCustomerShippingAddress**](CustomerShippingAddressApi.md#postCustomerShippingAddress) | **POST** /tms/v2/customers/{customerTokenId}/shipping-addresses | Create a Customer Shipping Address


<a name="deleteCustomerShippingAddress"></a>
# **deleteCustomerShippingAddress**
> deleteCustomerShippingAddress(customerTokenId, shippingAddressTokenId, profileId)

Delete a Customer Shipping Address

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerShippingAddressApi;


CustomerShippingAddressApi apiInstance = new CustomerShippingAddressApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
String shippingAddressTokenId = "shippingAddressTokenId_example"; // String | The TokenId of an shipping address.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    apiInstance.deleteCustomerShippingAddress(customerTokenId, shippingAddressTokenId, profileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerShippingAddressApi#deleteCustomerShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **shippingAddressTokenId** | **String**| The TokenId of an shipping address. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getCustomerShippingAddress"></a>
# **getCustomerShippingAddress**
> Tmsv2customersEmbeddedDefaultShippingAddress getCustomerShippingAddress(customerTokenId, shippingAddressTokenId, profileId)

Retrieve a Customer Shipping Address

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerShippingAddressApi;


CustomerShippingAddressApi apiInstance = new CustomerShippingAddressApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
String shippingAddressTokenId = "shippingAddressTokenId_example"; // String | The TokenId of an shipping address.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    Tmsv2customersEmbeddedDefaultShippingAddress result = apiInstance.getCustomerShippingAddress(customerTokenId, shippingAddressTokenId, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerShippingAddressApi#getCustomerShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **shippingAddressTokenId** | **String**| The TokenId of an shipping address. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**Tmsv2customersEmbeddedDefaultShippingAddress**](Tmsv2customersEmbeddedDefaultShippingAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getCustomerShippingAddressesList"></a>
# **getCustomerShippingAddressesList**
> ShippingAddressListForCustomer getCustomerShippingAddressesList(customerTokenId, profileId, offset, limit)

List Shipping Addresses for a Customer

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerShippingAddressApi;


CustomerShippingAddressApi apiInstance = new CustomerShippingAddressApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
Long offset = 0L; // Long | Starting record in zero-based dataset that should be returned as the first object in the array. Default is 0.
Long limit = 20L; // Long | The maximum number that can be returned in the array starting from the offset record in zero-based dataset. Default is 20, maximum is 100.
try {
    ShippingAddressListForCustomer result = apiInstance.getCustomerShippingAddressesList(customerTokenId, profileId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerShippingAddressApi#getCustomerShippingAddressesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]
 **offset** | **Long**| Starting record in zero-based dataset that should be returned as the first object in the array. Default is 0. | [optional] [default to 0]
 **limit** | **Long**| The maximum number that can be returned in the array starting from the offset record in zero-based dataset. Default is 20, maximum is 100. | [optional] [default to 20]

### Return type

[**ShippingAddressListForCustomer**](ShippingAddressListForCustomer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchCustomersShippingAddress"></a>
# **patchCustomersShippingAddress**
> Tmsv2customersEmbeddedDefaultShippingAddress patchCustomersShippingAddress(customerTokenId, shippingAddressTokenId, patchCustomerShippingAddressRequest, profileId, ifMatch)

Update a Customer Shipping Address

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerShippingAddressApi;


CustomerShippingAddressApi apiInstance = new CustomerShippingAddressApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
String shippingAddressTokenId = "shippingAddressTokenId_example"; // String | The TokenId of an shipping address.
PatchCustomerShippingAddressRequest patchCustomerShippingAddressRequest = new PatchCustomerShippingAddressRequest(); // PatchCustomerShippingAddressRequest | 
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String ifMatch = "ifMatch_example"; // String | Contains an ETag value from a GET request to make the request conditional.
try {
    Tmsv2customersEmbeddedDefaultShippingAddress result = apiInstance.patchCustomersShippingAddress(customerTokenId, shippingAddressTokenId, patchCustomerShippingAddressRequest, profileId, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerShippingAddressApi#patchCustomersShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **shippingAddressTokenId** | **String**| The TokenId of an shipping address. |
 **patchCustomerShippingAddressRequest** | [**PatchCustomerShippingAddressRequest**](PatchCustomerShippingAddressRequest.md)|  |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]
 **ifMatch** | **String**| Contains an ETag value from a GET request to make the request conditional. | [optional]

### Return type

[**Tmsv2customersEmbeddedDefaultShippingAddress**](Tmsv2customersEmbeddedDefaultShippingAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postCustomerShippingAddress"></a>
# **postCustomerShippingAddress**
> Tmsv2customersEmbeddedDefaultShippingAddress postCustomerShippingAddress(customerTokenId, postCustomerShippingAddressRequest, profileId)

Create a Customer Shipping Address

Include an existing TMS Customer token id in the request URI. * A Customer token can be created by calling: **POST *_/tms/v2/customers*** 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerShippingAddressApi;


CustomerShippingAddressApi apiInstance = new CustomerShippingAddressApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
PostCustomerShippingAddressRequest postCustomerShippingAddressRequest = new PostCustomerShippingAddressRequest(); // PostCustomerShippingAddressRequest | 
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    Tmsv2customersEmbeddedDefaultShippingAddress result = apiInstance.postCustomerShippingAddress(customerTokenId, postCustomerShippingAddressRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerShippingAddressApi#postCustomerShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **postCustomerShippingAddressRequest** | [**PostCustomerShippingAddressRequest**](PostCustomerShippingAddressRequest.md)|  |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**Tmsv2customersEmbeddedDefaultShippingAddress**](Tmsv2customersEmbeddedDefaultShippingAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

