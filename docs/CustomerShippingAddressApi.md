# CustomerShippingAddressApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCustomerShippingAddress**](CustomerShippingAddressApi.md#deleteCustomerShippingAddress) | **DELETE** /tms/v2/customers/{customerId}/shipping-addresses/{shippingAddressId} | Delete a Customer Shipping Address
[**getCustomerShippingAddress**](CustomerShippingAddressApi.md#getCustomerShippingAddress) | **GET** /tms/v2/customers/{customerId}/shipping-addresses/{shippingAddressId} | Retrieve a Customer Shipping Address
[**getCustomerShippingAddressesList**](CustomerShippingAddressApi.md#getCustomerShippingAddressesList) | **GET** /tms/v2/customers/{customerId}/shipping-addresses | List Shipping Addresses for a Customer
[**patchCustomersShippingAddress**](CustomerShippingAddressApi.md#patchCustomersShippingAddress) | **PATCH** /tms/v2/customers/{customerId}/shipping-addresses/{shippingAddressId} | Update a Customer Shipping Address
[**postCustomerShippingAddress**](CustomerShippingAddressApi.md#postCustomerShippingAddress) | **POST** /tms/v2/customers/{customerId}/shipping-addresses | Create a Customer Shipping Address


<a name="deleteCustomerShippingAddress"></a>
# **deleteCustomerShippingAddress**
> deleteCustomerShippingAddress(customerId, shippingAddressId, profileId)

Delete a Customer Shipping Address

|  |  |  | | --- | --- | --- | |**Customer Shipping Address**&lt;br&gt;A Customer Shipping Address represents tokenized customer shipping information.&lt;br&gt;A [Customer](#token-management_customer_create-a-customer) can have [one or more Shipping Addresses](#token-management_customer-shipping-address_list-shipping-addresses-for-a-customer), with one allocated as the Customers default for use in payments.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Deleting a Customers Shipping Address**&lt;br&gt;Your system can use this API to delete an existing Shipping Address for a Customer.&lt;br&gt;If a customer has more than one Shipping Address then the default Shipping Address cannot be deleted without first selecting a [new default Shipping Address](#token-management_customer-shipping-address_update-a-customer-shipping-address_samplerequests-dropdown_make-customer-shipping-address-the-default_liveconsole-tab-request-body). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerShippingAddressApi;


CustomerShippingAddressApi apiInstance = new CustomerShippingAddressApi();
String customerId = "customerId_example"; // String | The Id of a Customer.
String shippingAddressId = "shippingAddressId_example"; // String | The Id of a shipping address.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    apiInstance.deleteCustomerShippingAddress(customerId, shippingAddressId, profileId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerShippingAddressApi#deleteCustomerShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The Id of a Customer. |
 **shippingAddressId** | **String**| The Id of a shipping address. |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getCustomerShippingAddress"></a>
# **getCustomerShippingAddress**
> PostCustomerShippingAddressRequest getCustomerShippingAddress(customerId, shippingAddressId, profileId)

Retrieve a Customer Shipping Address

|  |  |  | | --- | --- | --- | |**Customer Shipping Address**&lt;br&gt;A Customer Shipping Address represents tokenized customer shipping information.&lt;br&gt;A [Customer](#token-management_customer_create-a-customer) can have [one or more Shipping Addresses](#token-management_customer-shipping-address_list-shipping-addresses-for-a-customer), with one allocated as the Customers default for use in payments.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Retrieving a Customer Shipping Address**&lt;br&gt;Your system can use this API to retrieve an existing Shipping Address for a Customer.&lt;br&gt;To perform a payment with a particular Shipping Address simply specify the [Shipping Address Id in the payments request](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-using-tokens_authorization-with-customer-payment-instrument-and-shipping-address-token-id_liveconsole-tab-request-body). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerShippingAddressApi;


CustomerShippingAddressApi apiInstance = new CustomerShippingAddressApi();
String customerId = "customerId_example"; // String | The Id of a Customer.
String shippingAddressId = "shippingAddressId_example"; // String | The Id of a shipping address.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    PostCustomerShippingAddressRequest result = apiInstance.getCustomerShippingAddress(customerId, shippingAddressId, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerShippingAddressApi#getCustomerShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The Id of a Customer. |
 **shippingAddressId** | **String**| The Id of a shipping address. |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**PostCustomerShippingAddressRequest**](PostCustomerShippingAddressRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getCustomerShippingAddressesList"></a>
# **getCustomerShippingAddressesList**
> ShippingAddressListForCustomer getCustomerShippingAddressesList(customerId, profileId, offset, limit)

List Shipping Addresses for a Customer

|  |  |  | | --- | --- | --- | |**Customer Shipping Address**&lt;br&gt;A Customer Shipping Address represents tokenized customer shipping information.&lt;br&gt;A [Customer](#token-management_customer_create-a-customer) can have [one or more Shipping Addresses](#token-management_customer-shipping-address_list-shipping-addresses-for-a-customer), with one allocated as the Customers default for use in payments.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Retrieving all Customer Shipping Addresses**&lt;br&gt;Your system can use this API to retrieve all existing Shipping Addresses for a Customer. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerShippingAddressApi;


CustomerShippingAddressApi apiInstance = new CustomerShippingAddressApi();
String customerId = "customerId_example"; // String | The Id of a Customer.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
Long offset = 0L; // Long | Starting record in zero-based dataset that should be returned as the first object in the array. Default is 0.
Long limit = 20L; // Long | The maximum number that can be returned in the array starting from the offset record in zero-based dataset. Default is 20, maximum is 100.
try {
    ShippingAddressListForCustomer result = apiInstance.getCustomerShippingAddressesList(customerId, profileId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerShippingAddressApi#getCustomerShippingAddressesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The Id of a Customer. |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]
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
> PatchCustomerShippingAddressRequest patchCustomersShippingAddress(customerId, shippingAddressId, patchCustomerShippingAddressRequest, profileId, ifMatch)

Update a Customer Shipping Address

|  |  |  | | --- | --- | --- | |**Customer Shipping Address**&lt;br&gt;A Customer Shipping Address represents tokenized customer shipping information.&lt;br&gt;A [Customer](#token-management_customer_create-a-customer) can have [one or more Shipping Addresses](#token-management_customer-shipping-address_list-shipping-addresses-for-a-customer), with one allocated as the Customers default for use in payments.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Updating a Customers Shipping Address**&lt;br&gt;Your system can use this API to update an existing Shipping Addresses for a Customer, including selecting a [default Shipping Address](#token-management_customer-shipping-address_update-a-customer-shipping-address_samplerequests-dropdown_make-customer-shipping-address-the-default_liveconsole-tab-request-body) for use in payments. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerShippingAddressApi;


CustomerShippingAddressApi apiInstance = new CustomerShippingAddressApi();
String customerId = "customerId_example"; // String | The Id of a Customer.
String shippingAddressId = "shippingAddressId_example"; // String | The Id of a shipping address.
PatchCustomerShippingAddressRequest patchCustomerShippingAddressRequest = new PatchCustomerShippingAddressRequest(); // PatchCustomerShippingAddressRequest | 
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
String ifMatch = "ifMatch_example"; // String | Contains an ETag value from a GET request to make the request conditional.
try {
    PatchCustomerShippingAddressRequest result = apiInstance.patchCustomersShippingAddress(customerId, shippingAddressId, patchCustomerShippingAddressRequest, profileId, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerShippingAddressApi#patchCustomersShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The Id of a Customer. |
 **shippingAddressId** | **String**| The Id of a shipping address. |
 **patchCustomerShippingAddressRequest** | [**PatchCustomerShippingAddressRequest**](PatchCustomerShippingAddressRequest.md)|  |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]
 **ifMatch** | **String**| Contains an ETag value from a GET request to make the request conditional. | [optional]

### Return type

[**PatchCustomerShippingAddressRequest**](PatchCustomerShippingAddressRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postCustomerShippingAddress"></a>
# **postCustomerShippingAddress**
> PostCustomerShippingAddressRequest postCustomerShippingAddress(customerId, postCustomerShippingAddressRequest, profileId)

Create a Customer Shipping Address

|  |  |  | | --- | --- | --- | |**Customer Shipping Address**&lt;br&gt;A Customer Shipping Address represents tokenized customer shipping information.&lt;br&gt;A [Customer](#token-management_customer_create-a-customer) can have [one or more Shipping Addresses](#token-management_customer-shipping-address_list-shipping-addresses-for-a-customer), with one allocated as the Customers default for use in payments.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Creating a Customer Shipping Address**&lt;br&gt;Your system can use this API to create an existing Customers default or non default Shipping Address.&lt;br&gt;You can also create additional Customer Shipping Addresses via the [Payments API](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-with-token-create_authorization-create-default-payment-instrument-shipping-address-for-existing-customer_liveconsole-tab-request-body). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CustomerShippingAddressApi;


CustomerShippingAddressApi apiInstance = new CustomerShippingAddressApi();
String customerId = "customerId_example"; // String | The Id of a Customer.
PostCustomerShippingAddressRequest postCustomerShippingAddressRequest = new PostCustomerShippingAddressRequest(); // PostCustomerShippingAddressRequest | 
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    PostCustomerShippingAddressRequest result = apiInstance.postCustomerShippingAddress(customerId, postCustomerShippingAddressRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerShippingAddressApi#postCustomerShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The Id of a Customer. |
 **postCustomerShippingAddressRequest** | [**PostCustomerShippingAddressRequest**](PostCustomerShippingAddressRequest.md)|  |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**PostCustomerShippingAddressRequest**](PostCustomerShippingAddressRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

