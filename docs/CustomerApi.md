# CustomerApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCustomer**](CustomerApi.md#deleteCustomer) | **DELETE** /tms/v2/customers/{customerTokenId} | Delete a Customer
[**getCustomer**](CustomerApi.md#getCustomer) | **GET** /tms/v2/customers/{customerTokenId} | Retrieve a Customer
[**patchCustomer**](CustomerApi.md#patchCustomer) | **PATCH** /tms/v2/customers/{customerTokenId} | Update a Customer
[**postCustomer**](CustomerApi.md#postCustomer) | **POST** /tms/v2/customers | Create a Customer


<a name="deleteCustomer"></a>
# **deleteCustomer**
> deleteCustomer(customerTokenId, profileId)

Delete a Customer

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    apiInstance.deleteCustomer(customerTokenId, profileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#deleteCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getCustomer"></a>
# **getCustomer**
> TmsV2CustomersResponse getCustomer(customerTokenId, profileId)

Retrieve a Customer

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    TmsV2CustomersResponse result = apiInstance.getCustomer(customerTokenId, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**TmsV2CustomersResponse**](TmsV2CustomersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchCustomer"></a>
# **patchCustomer**
> TmsV2CustomersResponse patchCustomer(customerTokenId, patchCustomerRequest, profileId, ifMatch)

Update a Customer

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String customerTokenId = "customerTokenId_example"; // String | The TokenId of a customer.
PatchCustomerRequest patchCustomerRequest = new PatchCustomerRequest(); // PatchCustomerRequest | 
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
String ifMatch = "ifMatch_example"; // String | Contains an ETag value from a GET request to make the request conditional.
try {
    TmsV2CustomersResponse result = apiInstance.patchCustomer(customerTokenId, patchCustomerRequest, profileId, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#patchCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerTokenId** | **String**| The TokenId of a customer. |
 **patchCustomerRequest** | [**PatchCustomerRequest**](PatchCustomerRequest.md)|  |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]
 **ifMatch** | **String**| Contains an ETag value from a GET request to make the request conditional. | [optional]

### Return type

[**TmsV2CustomersResponse**](TmsV2CustomersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postCustomer"></a>
# **postCustomer**
> TmsV2CustomersResponse postCustomer(postCustomerRequest, profileId)

Create a Customer

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
PostCustomerRequest postCustomerRequest = new PostCustomerRequest(); // PostCustomerRequest | 
String profileId = "profileId_example"; // String | The id of a profile containing user specific TMS configuration.
try {
    TmsV2CustomersResponse result = apiInstance.postCustomer(postCustomerRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#postCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postCustomerRequest** | [**PostCustomerRequest**](PostCustomerRequest.md)|  |
 **profileId** | **String**| The id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**TmsV2CustomersResponse**](TmsV2CustomersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

