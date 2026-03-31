# OffersApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOffer**](OffersApi.md#createOffer) | **POST** /vas/v1/currencyconversion | Create an Offer
[**getOffer**](OffersApi.md#getOffer) | **GET** /vas/v1/currencyconversion/{id} | Retrieve an Offer


<a name="createOffer"></a>
# **createOffer**
> InlineResponse2019 createOffer(contentType, xRequestid, vCMerchantId, vCCorrelationId, vCOrganizationId, offerRequest)

Create an Offer

Empower global transactions with transparency and choice. Our Dynamic Currency Conversion API lets merchants offer customers the option to pay in their home currency at checkout, delivering real-time exchange rates.  &lt;div style&#x3D;\&quot;display: flex; gap: 2rem;\&quot;&gt; &lt;div style&#x3D;\&quot;flex: 1;\&quot;&gt;  **Key Benefits:** - **Enhanced Customer Experience:** Provide clarity and convenience for international shoppers. - **Real-Time Rates:** Accurate currency conversion with all the data required for acquirers and their merchants to maintain compliance with card network rules. - **Seamless Integration:** Flexible API endpoints for rate lookup, authorization, and capture. - **Regulatory Compliance:** Provides the data required for acquirers and merchants to meet and maintain card scheme requirements for disclosure and consent.  &lt;br&gt;  Ideal for merchants and payment partners seeking to boost trust and conversion in cross-border commerce.  &lt;br&gt;  **Key Features:** - **Rate Lookup:** Retrieves the most up-to-date exchange rate for eligible cards before authorization. - **Currency Choice:** Enables the merchant to offer customers the option to select between the merchant&#39;s local currency and their card&#39;s billing currency. - **Compliance:** Ensures merchants have the data required to adhere to card network regulations; exchange rates, markups, etc.  &lt;div style&#x3D;\&quot;margin-top: 1.5rem;\&quot;&gt;  **Supported Scenarios:** - Dynamic Currency Conversion when cardholder&#39;s billing currency differs from merchant&#39;s pricing currency. - Merchant and acquirer must support the cardholder&#39;s billing currency. &lt;/div&gt;  &lt;div style&#x3D;\&quot;margin-top: 1.5rem;\&quot;&gt;  **Supported Processors:** - VPC - FDI Global &lt;/div&gt;  &lt;div style&#x3D;\&quot;margin-top: 1.5rem;\&quot;&gt;  **Compliance &amp; Disclosure:**  Merchants must: - Adhere to card network rules for Dynamic Currency Conversion (DCC) transactions. - Display the converted amount, exchange rate, and markup percentage and other required disclosures. - Obtain explicit cardholder consent before applying DCC. - Work with your acquirer to obtain full set of compliance requirements. &lt;/div&gt;  &lt;/div&gt; &lt;div style&#x3D;\&quot;flex: 1;\&quot;&gt;  **Core API Endpoints:**  **Currency Conversion API**  Returns eligibility and exchange rate details, including: - exchangeRate - marginRate - reconciliationId and Id (for subsequent payment requests)  &lt;div style&#x3D;\&quot;margin-top: 1.5rem;\&quot;&gt;  **Payment Authorization with DCC***  POST /pts/v2/payments  Required fields include: - orderInformation.amountDetails.currency - orderInformation.amountDetails.originalCurrency - orderInformation.amountDetails.originalAmount - orderInformation.amountDetails.exchangeRate - currencyConversion.indicator (e.g., 1 &#x3D; Converted, 2 &#x3D; Nonconvertible, 3 &#x3D; Declined) &lt;/div&gt;  &lt;div style&#x3D;\&quot;margin-top: 1.5rem;\&quot;&gt;  **Capture with DCC***  POST /pts/v2/payments/{id}/captures  Maps from original authorization and includes original and converted amounts. &lt;/div&gt;  &lt;div style&#x3D;\&quot;margin-top: 1.5rem;\&quot;&gt;  **Refund with DCC***  POST /pts/v2/captures/{id}/refunds  Maps from original authorization and includes original and converted amounts.  *Note: DCC is only supported on select processors. Contact your acquirer or account manager for more information.* &lt;/div&gt;  &lt;/div&gt; &lt;/div&gt;  &lt;br&gt;  For more information, see the [Currency Conversion Developer Guide](https://developer.cybersource.com/docs/cybs/en-us/currency-conversion/developer/all/rest/currency-conversion/cc-intro.html). 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.OffersApi;


OffersApi apiInstance = new OffersApi();
String contentType = "contentType_example"; // String | 
String xRequestid = "xRequestid_example"; // String | 
String vCMerchantId = "vCMerchantId_example"; // String | 
String vCCorrelationId = "vCCorrelationId_example"; // String | 
String vCOrganizationId = "vCOrganizationId_example"; // String | 
OfferRequest offerRequest = new OfferRequest(); // OfferRequest | 
try {
    InlineResponse2019 result = apiInstance.createOffer(contentType, xRequestid, vCMerchantId, vCCorrelationId, vCOrganizationId, offerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OffersApi#createOffer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  |
 **xRequestid** | **String**|  |
 **vCMerchantId** | **String**|  |
 **vCCorrelationId** | **String**|  |
 **vCOrganizationId** | **String**|  |
 **offerRequest** | [**OfferRequest**](OfferRequest.md)|  |

### Return type

[**InlineResponse2019**](InlineResponse2019.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getOffer"></a>
# **getOffer**
> InlineResponse20016 getOffer(contentType, xRequestid, vCMerchantId, vCCorrelationId, vCOrganizationId, id)

Retrieve an Offer

Retrieves an offer record from the system. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.OffersApi;


OffersApi apiInstance = new OffersApi();
String contentType = "contentType_example"; // String | 
String xRequestid = "xRequestid_example"; // String | 
String vCMerchantId = "vCMerchantId_example"; // String | 
String vCCorrelationId = "vCCorrelationId_example"; // String | 
String vCOrganizationId = "vCOrganizationId_example"; // String | 
String id = "id_example"; // String | Request ID generated by Cybersource. This was sent in the header on the request. Echo value from v-c-request-id
try {
    InlineResponse20016 result = apiInstance.getOffer(contentType, xRequestid, vCMerchantId, vCCorrelationId, vCOrganizationId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OffersApi#getOffer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  |
 **xRequestid** | **String**|  |
 **vCMerchantId** | **String**|  |
 **vCCorrelationId** | **String**|  |
 **vCOrganizationId** | **String**|  |
 **id** | **String**| Request ID generated by Cybersource. This was sent in the header on the request. Echo value from v-c-request-id |

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

