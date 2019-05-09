# PurchaseAndRefundDetailsApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPurchaseAndRefundDetails**](PurchaseAndRefundDetailsApi.md#getPurchaseAndRefundDetails) | **GET** /reporting/v3/purchase-refund-details | Get Purchase and Refund details


<a name="getPurchaseAndRefundDetails"></a>
# **getPurchaseAndRefundDetails**
> ReportingV3PurchaseRefundDetailsGet200Response getPurchaseAndRefundDetails(startTime, endTime, organizationId, paymentSubtype, viewBy, groupName, offset, limit)

Get Purchase and Refund details

Download the Purchase and Refund Details report. This report report includes all purchases and refund transactions, as well as all activities related to transactions resulting in an adjustment to the net proceeds. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.PurchaseAndRefundDetailsApi;


PurchaseAndRefundDetailsApi apiInstance = new PurchaseAndRefundDetailsApi();
DateTime startTime = new DateTime(); // DateTime | Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z) 
DateTime endTime = new DateTime(); // DateTime | Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd'T'HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z) 
String organizationId = "organizationId_example"; // String | Valid Cybersource Organization Id
String paymentSubtype = "ALL"; // String | Payment Subtypes.   - **ALL**:  All Payment Subtypes   - **VI** :  Visa   - **MC** :  Master Card   - **AX** :  American Express   - **DI** :  Discover   - **DP** :  Pinless Debit 
String viewBy = "requestDate"; // String | View results by Request Date or Submission Date.   - **requestDate** : Request Date   - **submissionDate**: Submission Date 
String groupName = "groupName_example"; // String | Valid CyberSource Group Name.User can define groups using CBAPI and Group Management Module in EBC2. Groups are collection of organizationIds
Integer offset = 56; // Integer | Offset of the Purchase and Refund Results.
Integer limit = 2000; // Integer | Results count per page. Range(1-2000)
try {
    ReportingV3PurchaseRefundDetailsGet200Response result = apiInstance.getPurchaseAndRefundDetails(startTime, endTime, organizationId, paymentSubtype, viewBy, groupName, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseAndRefundDetailsApi#getPurchaseAndRefundDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **DateTime**| Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  |
 **endTime** | **DateTime**| Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  |
 **organizationId** | **String**| Valid Cybersource Organization Id | [optional]
 **paymentSubtype** | **String**| Payment Subtypes.   - **ALL**:  All Payment Subtypes   - **VI** :  Visa   - **MC** :  Master Card   - **AX** :  American Express   - **DI** :  Discover   - **DP** :  Pinless Debit  | [optional] [default to ALL] [enum: ALL, VI, MC, AX, DI, DP]
 **viewBy** | **String**| View results by Request Date or Submission Date.   - **requestDate** : Request Date   - **submissionDate**: Submission Date  | [optional] [default to requestDate] [enum: requestDate, submissionDate]
 **groupName** | **String**| Valid CyberSource Group Name.User can define groups using CBAPI and Group Management Module in EBC2. Groups are collection of organizationIds | [optional]
 **offset** | **Integer**| Offset of the Purchase and Refund Results. | [optional]
 **limit** | **Integer**| Results count per page. Range(1-2000) | [optional] [default to 2000]

### Return type

[**ReportingV3PurchaseRefundDetailsGet200Response**](ReportingV3PurchaseRefundDetailsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json

