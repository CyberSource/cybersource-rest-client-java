# TransactionRiskLabelingApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitLabels**](TransactionRiskLabelingApi.md#submitLabels) | **POST** /unifiedrisk | Transaction Risk Labeling


<a name="submitLabels"></a>
# **submitLabels**
> InlineResponse2013 submitLabels(labelRequest)

Transaction Risk Labeling

The Labels endpoint enables clients to submit post-transaction feedback, including both the decision made on the transaction  (such as accept or reject) and the final outcome (such as confirmed fraud, valid, or suspected).  Consistent label submission is critical to achieving optimal model performance, as it directly drives model accuracy, tuning,  and the quality of client‑specific insights over time

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.TransactionRiskLabelingApi;


TransactionRiskLabelingApi apiInstance = new TransactionRiskLabelingApi();
LabelRequest labelRequest = new LabelRequest(); // LabelRequest | Label submission request
try {
    InlineResponse2013 result = apiInstance.submitLabels(labelRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionRiskLabelingApi#submitLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **labelRequest** | [**LabelRequest**](LabelRequest.md)| Label submission request |

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

