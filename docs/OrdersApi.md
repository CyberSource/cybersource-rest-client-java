# OrdersApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrder**](OrdersApi.md#createOrder) | **POST** /pts/v2/intents | Create an Order
[**updateOrder**](OrdersApi.md#updateOrder) | **PATCH** /pts/v2/intents/{id} | Update an Order


<a name="createOrder"></a>
# **createOrder**
> PtsV2CreateOrderPost201Response createOrder(createOrderRequest)

Create an Order

A create order request enables you to send the itemized details along with the order. This API can be used by merchants initiating their transactions with the create order API.  

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
CreateOrderRequest createOrderRequest = new CreateOrderRequest(); // CreateOrderRequest | 
try {
    PtsV2CreateOrderPost201Response result = apiInstance.createOrder(createOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#createOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createOrderRequest** | [**CreateOrderRequest**](CreateOrderRequest.md)|  |

### Return type

[**PtsV2CreateOrderPost201Response**](PtsV2CreateOrderPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="updateOrder"></a>
# **updateOrder**
> PtsV2UpdateOrderPatch201Response updateOrder(id, updateOrderRequest)

Update an Order

This API can be used in two flavours - for updating the order as well as saving the order. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
String id = "id_example"; // String | The ID returned from the original create order response.
UpdateOrderRequest updateOrderRequest = new UpdateOrderRequest(); // UpdateOrderRequest | 
try {
    PtsV2UpdateOrderPatch201Response result = apiInstance.updateOrder(id, updateOrderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#updateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID returned from the original create order response. |
 **updateOrderRequest** | [**UpdateOrderRequest**](UpdateOrderRequest.md)|  |

### Return type

[**PtsV2UpdateOrderPatch201Response**](PtsV2UpdateOrderPatch201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

