# PaymentsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayment**](PaymentsApi.md#createPayment) | **POST** /pts/v2/payments | Process a Payment
[**incrementAuth**](PaymentsApi.md#incrementAuth) | **PATCH** /pts/v2/payments/{id} | Increment an Authorization


<a name="createPayment"></a>
# **createPayment**
> PtsV2PaymentsPost201Response createPayment(createPaymentRequest)

Process a Payment

Authorize the payment for the transaction. Authorization can be requested with Capture, Decision Manager, Payer Authentication(3ds). Find more on [Authorization with Add-On Features page.] (https://developer.cybersource.com/api/authorization-add-ons.html) 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
CreatePaymentRequest createPaymentRequest = new CreatePaymentRequest(); // CreatePaymentRequest | 
try {
    PtsV2PaymentsPost201Response result = apiInstance.createPayment(createPaymentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPaymentRequest** | [**CreatePaymentRequest**](CreatePaymentRequest.md)|  |

### Return type

[**PtsV2PaymentsPost201Response**](PtsV2PaymentsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="incrementAuth"></a>
# **incrementAuth**
> PtsV2IncrementalAuthorizationPatch201Response incrementAuth(id, incrementAuthRequest)

Increment an Authorization

Use this service to authorize additional charges in a lodging or autorental transaction. Include the ID returned from the original authorization in the PATCH request to add additional charges to that authorization. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PaymentsApi;


PaymentsApi apiInstance = new PaymentsApi();
String id = "id_example"; // String | The ID returned from the original authorization request.
IncrementAuthRequest incrementAuthRequest = new IncrementAuthRequest(); // IncrementAuthRequest | 
try {
    PtsV2IncrementalAuthorizationPatch201Response result = apiInstance.incrementAuth(id, incrementAuthRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#incrementAuth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID returned from the original authorization request. |
 **incrementAuthRequest** | [**IncrementAuthRequest**](IncrementAuthRequest.md)|  |

### Return type

[**PtsV2IncrementalAuthorizationPatch201Response**](PtsV2IncrementalAuthorizationPatch201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

