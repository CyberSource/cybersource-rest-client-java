# KeyManagementApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchKeys**](KeyManagementApi.md#searchKeys) | **GET** /kms/v2/keys | Search Keys


<a name="searchKeys"></a>
# **searchKeys**
> InlineResponse200 searchKeys(offset, limit, sort, organizationIds, keyIds, keyTypes, expirationStartDate, expirationEndDate)

Search Keys

Search one or more Keys

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.KeyManagementApi;


KeyManagementApi apiInstance = new KeyManagementApi();
Integer offset = 56; // Integer | This allows you to specify the page offset from the resulting list resultset you want the records to be returned
Integer limit = 56; // Integer | This allows you to specify the total number of records to be returned off the resulting list resultset
String sort = "sort_example"; // String | This allows you to specify a comma separated list of fields in the order which the resulting list resultset must be sorted.
List<String> organizationIds = Arrays.asList("organizationIds_example"); // List<String> | List of Orgaization Ids to search. The maximum size of the organization Ids list is 1. The maximum length of Organization Id is 30.
List<String> keyIds = Arrays.asList("keyIds_example"); // List<String> | List of Key Ids to search. The maximum size of the Key Ids list is 1
List<String> keyTypes = Arrays.asList("keyTypes_example"); // List<String> | Key Type, Possible values -  certificate, password, pgp and scmp_api. When Key Type is provided atleast one more filter needs to be provided
DateTime expirationStartDate = new DateTime(); // DateTime | Expiry Filter Start Date. When Expiration Date filter is provided, atleast one more filter needs to be provided
DateTime expirationEndDate = new DateTime(); // DateTime | Expiry Filter End Date. When Expiration Date filter is provided, atleast one more filter needs to be provided
try {
    InlineResponse200 result = apiInstance.searchKeys(offset, limit, sort, organizationIds, keyIds, keyTypes, expirationStartDate, expirationEndDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyManagementApi#searchKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| This allows you to specify the page offset from the resulting list resultset you want the records to be returned | [optional]
 **limit** | **Integer**| This allows you to specify the total number of records to be returned off the resulting list resultset | [optional]
 **sort** | **String**| This allows you to specify a comma separated list of fields in the order which the resulting list resultset must be sorted. | [optional]
 **organizationIds** | [**List&lt;String&gt;**](String.md)| List of Orgaization Ids to search. The maximum size of the organization Ids list is 1. The maximum length of Organization Id is 30. | [optional]
 **keyIds** | [**List&lt;String&gt;**](String.md)| List of Key Ids to search. The maximum size of the Key Ids list is 1 | [optional]
 **keyTypes** | [**List&lt;String&gt;**](String.md)| Key Type, Possible values -  certificate, password, pgp and scmp_api. When Key Type is provided atleast one more filter needs to be provided | [optional]
 **expirationStartDate** | **DateTime**| Expiry Filter Start Date. When Expiration Date filter is provided, atleast one more filter needs to be provided | [optional]
 **expirationEndDate** | **DateTime**| Expiry Filter End Date. When Expiration Date filter is provided, atleast one more filter needs to be provided | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

