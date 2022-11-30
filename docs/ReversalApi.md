# ReversalApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authReversal**](ReversalApi.md#authReversal) | **POST** /pts/v2/payments/{id}/reversals | Process an Authorization Reversal
[**mitReversal**](ReversalApi.md#mitReversal) | **POST** /pts/v2/reversals | Timeout Reversal


<a name="authReversal"></a>
# **authReversal**
> PtsV2PaymentsReversalsPost201Response authReversal(id, authReversalRequest)

Process an Authorization Reversal

Include the payment ID in the POST request to reverse the payment amount.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReversalApi;


ReversalApi apiInstance = new ReversalApi();
String id = "id_example"; // String | The payment ID returned from a previous payment request.
AuthReversalRequest authReversalRequest = new AuthReversalRequest(); // AuthReversalRequest | 
try {
    PtsV2PaymentsReversalsPost201Response result = apiInstance.authReversal(id, authReversalRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReversalApi#authReversal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The payment ID returned from a previous payment request. |
 **authReversalRequest** | [**AuthReversalRequest**](AuthReversalRequest.md)|  |

### Return type

[**PtsV2PaymentsReversalsPost201Response**](PtsV2PaymentsReversalsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="mitReversal"></a>
# **mitReversal**
> PtsV2PaymentsReversalsPost201Response mitReversal(mitReversalRequest)

Timeout Reversal

This is to reverse a previous payment that merchant does not receive a reply(Mostly due to Timeout). To use this feature/API, make sure to pass unique value to field - clientReferenceInformation -&gt; transactionId in [/pts/v2/payments](https://developer.cybersource.com/api-reference-assets/index.html#payments_payments) API call and use same transactionId in this API request payload to reverse the payment.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.ReversalApi;


ReversalApi apiInstance = new ReversalApi();
MitReversalRequest mitReversalRequest = new MitReversalRequest(); // MitReversalRequest | 
try {
    PtsV2PaymentsReversalsPost201Response result = apiInstance.mitReversal(mitReversalRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReversalApi#mitReversal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mitReversalRequest** | [**MitReversalRequest**](MitReversalRequest.md)|  |

### Return type

[**PtsV2PaymentsReversalsPost201Response**](PtsV2PaymentsReversalsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

