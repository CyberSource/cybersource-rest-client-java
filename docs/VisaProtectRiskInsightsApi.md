# VisaProtectRiskInsightsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitVpri**](VisaProtectRiskInsightsApi.md#submitVpri) | **POST** /unifiedrisk | Visa Protect Risk Insights


<a name="submitVpri"></a>
# **submitVpri**
> UnifiedRiskPost201Response submitVpri(vpriRequest)

Visa Protect Risk Insights

VPRI delivers real-time, AI-driven risk scores and insights via a data-only API to enrich existing fraud strategies and improve decisioning. It integrates easily into existing workflows and provides immediate value by identifying legitimate behavior across Visa&#39;s global network—helping reduce false declines and increase acceptance.

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.VisaProtectRiskInsightsApi;


VisaProtectRiskInsightsApi apiInstance = new VisaProtectRiskInsightsApi();
VpriRequest vpriRequest = new VpriRequest(); // VpriRequest | VPRI request for Transaction Risk Scoring or Transaction Risk Labeling
try {
    UnifiedRiskPost201Response result = apiInstance.submitVpri(vpriRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisaProtectRiskInsightsApi#submitVpri");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vpriRequest** | [**VpriRequest**](VpriRequest.md)| VPRI request for Transaction Risk Scoring or Transaction Risk Labeling |

### Return type

[**UnifiedRiskPost201Response**](UnifiedRiskPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

