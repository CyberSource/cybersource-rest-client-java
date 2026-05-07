# CredentialsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**provisionMppCredentials**](CredentialsApi.md#provisionMppCredentials) | **POST** /acp/v1/mpp/credentials | Provision MPP credentials


<a name="provisionMppCredentials"></a>
# **provisionMppCredentials**
> MppCredentialsResponse200 provisionMppCredentials(mppCredentialsRequest)

Provision MPP credentials

Provisions an encrypted MPP credential for use as the credential payload in an Authorization: Payment header (MPP spec Section 8.2). The caller provides an instrument identifier (referencing a stored card in TMS) and the challenge context from the merchant&#39;s 402 response, including the merchant&#39;s RSA public encryption key. This service:   1. Calls TMS to retrieve the network token and cryptogram for the instrument.   2. Builds the token plaintext (MPP spec Section 8.3, type: network_token).   3. Encrypts the plaintext using RSA-OAEP with SHA-256 and the merchant&#39;s public key.   4. Returns the MPP credential payload fields (MPP spec Section 8.2, Table 4). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.CredentialsApi;


CredentialsApi apiInstance = new CredentialsApi();
MppCredentialsRequest mppCredentialsRequest = new MppCredentialsRequest(); // MppCredentialsRequest | 
try {
    MppCredentialsResponse200 result = apiInstance.provisionMppCredentials(mppCredentialsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CredentialsApi#provisionMppCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mppCredentialsRequest** | [**MppCredentialsRequest**](MppCredentialsRequest.md)|  |

### Return type

[**MppCredentialsResponse200**](MppCredentialsResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

