# TokenizedCardApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTokenizedCard**](TokenizedCardApi.md#deleteTokenizedCard) | **DELETE** /tms/v2/tokenized-cards/{tokenizedCardId} | Delete a Tokenized Card
[**getTokenizedCard**](TokenizedCardApi.md#getTokenizedCard) | **GET** /tms/v2/tokenized-cards/{tokenizedCardId} | Retrieve a Tokenized Card
[**postIssuerLifeCycleSimulation**](TokenizedCardApi.md#postIssuerLifeCycleSimulation) | **POST** /tms/v2/tokenized-cards/{tokenizedCardId}/issuer-life-cycle-event-simulations | Simulate Issuer Life Cycle Management Events
[**postTokenizedCard**](TokenizedCardApi.md#postTokenizedCard) | **POST** /tms/v2/tokenized-cards | Create a Tokenized Card


<a name="deleteTokenizedCard"></a>
# **deleteTokenizedCard**
> deleteTokenizedCard(tokenizedCardId, profileId)

Delete a Tokenized Card

|  |  |  | | --- | --- | --- | | The Network Token will attempt to be deleted from the card association and if successful the corresponding TMS Network Token will be deleted. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TokenizedCardApi;


TokenizedCardApi apiInstance = new TokenizedCardApi();
String tokenizedCardId = "tokenizedCardId_example"; // String | The Id of a tokenized card.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    apiInstance.deleteTokenizedCard(tokenizedCardId, profileId);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenizedCardApi#deleteTokenizedCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenizedCardId** | **String**| The Id of a tokenized card. |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getTokenizedCard"></a>
# **getTokenizedCard**
> TokenizedcardRequest getTokenizedCard(tokenizedCardId, profileId)

Retrieve a Tokenized Card

|  |  |  | | --- | --- | --- | |**Tokenized Cards**&lt;br&gt;A Tokenized Card represents a network token. Network tokens perform better than regular card numbers and they are not necessarily invalidated when a cardholder loses their card, or it expires. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TokenizedCardApi;


TokenizedCardApi apiInstance = new TokenizedCardApi();
String tokenizedCardId = "tokenizedCardId_example"; // String | The Id of a tokenized card.
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    TokenizedcardRequest result = apiInstance.getTokenizedCard(tokenizedCardId, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenizedCardApi#getTokenizedCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenizedCardId** | **String**| The Id of a tokenized card. |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**TokenizedcardRequest**](TokenizedcardRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postIssuerLifeCycleSimulation"></a>
# **postIssuerLifeCycleSimulation**
> postIssuerLifeCycleSimulation(profileId, tokenizedCardId, postIssuerLifeCycleSimulationRequest)

Simulate Issuer Life Cycle Management Events

**Lifecycle Management Events**&lt;br&gt;Simulates an issuer life cycle manegement event for updates on the tokenized card. The events that can be simulated are: - Token status changes (e.g. active, suspended, deleted) - Updates to the underlying card, including card art changes, expiration date changes, and card number suffix. **Note:** This is only available in CAS environment. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TokenizedCardApi;


TokenizedCardApi apiInstance = new TokenizedCardApi();
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
String tokenizedCardId = "tokenizedCardId_example"; // String | The Id of a tokenized card.
PostIssuerLifeCycleSimulationRequest postIssuerLifeCycleSimulationRequest = new PostIssuerLifeCycleSimulationRequest(); // PostIssuerLifeCycleSimulationRequest | 
try {
    apiInstance.postIssuerLifeCycleSimulation(profileId, tokenizedCardId, postIssuerLifeCycleSimulationRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenizedCardApi#postIssuerLifeCycleSimulation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. |
 **tokenizedCardId** | **String**| The Id of a tokenized card. |
 **postIssuerLifeCycleSimulationRequest** | [**PostIssuerLifeCycleSimulationRequest**](PostIssuerLifeCycleSimulationRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="postTokenizedCard"></a>
# **postTokenizedCard**
> TokenizedcardRequest postTokenizedCard(tokenizedcardRequest, profileId)

Create a Tokenized Card

|  |  |  | | --- | --- | --- | |**Tokenized cards**&lt;br&gt;A Tokenized card represents a network token. Network tokens perform better than regular card numbers and they are not necessarily invalidated when a cardholder loses their card, or it expires. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TokenizedCardApi;


TokenizedCardApi apiInstance = new TokenizedCardApi();
TokenizedcardRequest tokenizedcardRequest = new TokenizedcardRequest(); // TokenizedcardRequest | 
String profileId = "profileId_example"; // String | The Id of a profile containing user specific TMS configuration.
try {
    TokenizedcardRequest result = apiInstance.postTokenizedCard(tokenizedcardRequest, profileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenizedCardApi#postTokenizedCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenizedcardRequest** | [**TokenizedcardRequest**](TokenizedcardRequest.md)|  |
 **profileId** | **String**| The Id of a profile containing user specific TMS configuration. | [optional]

### Return type

[**TokenizedcardRequest**](TokenizedcardRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

