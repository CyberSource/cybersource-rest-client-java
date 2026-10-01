
# InlineResponse20020Products

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **String** | Unique product identifier / SKU. |  [optional]
**isEligibleSearch** | **Boolean** | When &#x60;true&#x60;, product appears in AI agent discovery results. |  [optional]
**isEligibleCheckout** | **Boolean** | When &#x60;true&#x60;, product can be added to a checkout session. |  [optional]
**title** | **String** | Product display name. |  [optional]
**description** | **String** | Product description. |  [optional]
**url** | **String** | URL to the product page on the merchant&#39;s storefront. |  [optional]
**imageUrl** | **String** | URL to the primary product image. |  [optional]
**productCategory** | **String** | Product category hierarchy (e.g. &#x60;Electronics &gt; Audio &gt; Headphones&#x60;). |  [optional]
**brand** | **String** | Product brand or manufacturer. |  [optional]
**material** | **String** | Primary material (relevant for apparel, furniture, etc.). |  [optional]
**weight** | **String** | Product weight including unit. |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) | Product price as a decimal number. |  [optional]
**currency** | **String** | ISO 4217 currency code. |  [optional]
**availability** | **String** | Current stock status.  Possible values: - in_stock - out_of_stock - preorder - pre_order - backorder - unknown |  [optional]
**color** | **String** | Primary product color. |  [optional]
**gender** | **String** | Target gender (e.g. \&quot;male\&quot;, \&quot;female\&quot;, \&quot;unisex\&quot;). |  [optional]
**ageGroup** | **String** | Target age group (e.g. \&quot;adult\&quot;, \&quot;kids\&quot;, \&quot;infant\&quot;). |  [optional]
**shippingPrice** | **String** | Shipping cost string as provided by the merchant. |  [optional]
**groupId** | **String** | Product variant group identifier. |  [optional]
**listingHasVariations** | **Boolean** | Whether this listing has product variations (e.g. different sizes or colors). |  [optional]
**sellerName** | **String** | Merchant or seller display name. |  [optional]
**sellerUrl** | **String** | URL to the seller&#39;s storefront. |  [optional]
**returnPolicy** | **String** | Merchant return policy text. |  [optional]
**targetCountries** | **List&lt;String&gt;** | Country codes where this product is available. |  [optional]
**storeCountry** | **String** | ISO 3166-1 alpha-2 country code of the merchant&#39;s store. |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when this product was first ingested. |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp of the most recent update. |  [optional]



