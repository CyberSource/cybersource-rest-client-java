
# Iccv1productsfeedProducts

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **String** | Your unique product identifier (SKU). Must be unique within your merchant catalog. Max 100 characters.  | 
**title** | **String** | Product display name. Max 150 characters. | 
**description** | **String** | Detailed product description. Max 5000 characters. | 
**url** | **String** | Canonical URL to the product page on your storefront. Max 1000 characters. | 
**imageUrl** | **String** | URL to the primary product image. Must be publicly accessible (HTTPS). Max 1000 characters.  | 
**additionalImageUrls** | **String** | Optional. Additional product image URLs (comma-separated or single URL). Must be HTTPS. |  [optional]
**videoUrl** | **String** | Optional. URL to a product video. Must be HTTPS and publicly accessible. |  [optional]
**model3dUrl** | **String** | Optional. URL to a 3D model asset for the product (GLTF/GLB format preferred). |  [optional]
**availability** | **String** | Current stock status: - &#x60;in_stock&#x60; — available for immediate purchase - &#x60;out_of_stock&#x60; — temporarily unavailable - &#x60;preorder&#x60; or &#x60;pre_order&#x60; — not yet released - &#x60;backorder&#x60; — out of stock but accepting orders - &#x60;unknown&#x60; — availability status is not determined   Possible values: - in_stock - out_of_stock - preorder - pre_order - backorder - unknown | 
**availabilityDate** | [**LocalDate**](LocalDate.md) | Optional. Date when the product becomes available (for preorder/backorder). |  [optional]
**expirationDate** | [**LocalDate**](LocalDate.md) | Optional. Date after which the product listing expires. |  [optional]
**price** | **Double** | Product price as a positive decimal number. Pair with &#x60;currency&#x60; for full price representation. Must be greater than zero.  | 
**currency** | **String** | 3-letter ISO 4217 currency code for the product price (e.g. \&quot;USD\&quot;, \&quot;EUR\&quot;, \&quot;GBP\&quot;).  | 
**salePrice** | **Double** | Optional. Discounted sale price. Only shown when lower than &#x60;price&#x60;. |  [optional]
**salePriceStartDate** | [**LocalDate**](LocalDate.md) | Optional. Start date of the sale price window. |  [optional]
**salePriceEndDate** | [**LocalDate**](LocalDate.md) | Optional. End date of the sale price window. |  [optional]
**unitPricingMeasure** | **String** | Optional. Unit measure for unit-priced items (e.g. \&quot;1kg\&quot;, \&quot;750ml\&quot;). Used for per-unit price display. |  [optional]
**baseMeasure** | **String** | Optional. Base measure used for unit pricing comparison (e.g. \&quot;100g\&quot;, \&quot;1L\&quot;). Enables price-per-unit comparison. |  [optional]
**pricingTrend** | **String** | Optional. Pricing trend indicator (e.g. \&quot;dropping\&quot;, \&quot;rising\&quot;). Max 80 characters. |  [optional]
**geoPrice** | **String** | Optional. Geography-specific pricing overrides (JSON or structured string). |  [optional]
**geoAvailability** | **String** | Optional. Geography-specific availability overrides (JSON or structured string). |  [optional]
**brand** | **String** | Product brand or manufacturer name. Max 70 characters. | 
**gtin** | **String** | Optional. Global Trade Item Number (UPC, EAN, ISBN). Must be 8–14 digits. Required for Google Merchant Center syndication.  |  [optional]
**mpn** | **String** | Optional. Manufacturer Part Number. Max 70 characters. |  [optional]
**productCategory** | **String** | Optional. Product category hierarchy. Used for UCP validation and Google Merchant Center syndication. Max 255 characters.  |  [optional]
**condition** | **String** | Optional. Product condition. Typical values: &#x60;new&#x60;, &#x60;used&#x60;, &#x60;refurbished&#x60;. Used for UCP syndication and Google Merchant Center feed.  |  [optional]
**material** | **String** | Optional. Primary material of the product. Max 100 characters. |  [optional]
**weight** | **String** | Optional. Product weight (e.g. \&quot;1.2kg\&quot;). Max 100 characters. |  [optional]
**dimensions** | **String** | Optional. Combined dimension string (e.g. \&quot;10x5x3 cm\&quot;). Max 100 characters. |  [optional]
**length** | **String** | Optional. Product length. |  [optional]
**width** | **String** | Optional. Product width. |  [optional]
**height** | **String** | Optional. Product height. |  [optional]
**dimensionsUnit** | **String** | Optional. Unit for dimension values (e.g. \&quot;cm\&quot;, \&quot;in\&quot;). |  [optional]
**itemWeightUnit** | **String** | Optional. Unit for weight value (e.g. \&quot;kg\&quot;, \&quot;lb\&quot;). |  [optional]
**ageGroup** | **String** | Optional. Target age group (e.g. \&quot;adult\&quot;, \&quot;kids\&quot;, \&quot;infant\&quot;, \&quot;toddler\&quot;, \&quot;newborn\&quot;). |  [optional]
**color** | **String** | Optional. Product color. Max 40 characters. |  [optional]
**size** | **String** | Optional. Product size (e.g. \&quot;M\&quot;, \&quot;42\&quot;, \&quot;XL\&quot;). Max 20 characters. Used for variant filtering. |  [optional]
**sizeSystem** | **String** | Optional. Size standard used (e.g. \&quot;US\&quot;, \&quot;EU\&quot;, \&quot;UK\&quot;, \&quot;AU\&quot;). |  [optional]
**gender** | **String** | Optional. Target gender (e.g. \&quot;male\&quot;, \&quot;female\&quot;, \&quot;unisex\&quot;). |  [optional]
**groupId** | **String** | Product variant group ID — links products that are variations of the same item. Max 70 characters.  | 
**listingHasVariations** | **Boolean** | Whether this listing has product variations. | 
**itemGroupTitle** | **String** | Optional. Display title for the variant group. Max 150 characters. |  [optional]
**offerId** | **String** | Optional. Merchant-assigned offer identifier for marketplace deduplication. |  [optional]
**variantDict** | **Map&lt;String, String&gt;** | Optional. Key-value map of variant attribute names to values (e.g. color, size). |  [optional]
**customVariant1Category** | **String** | Optional. Custom variant 1 category label. |  [optional]
**customVariant1Option** | **String** | Optional. Custom variant 1 option value. |  [optional]
**customVariant2Category** | **String** | Optional. Custom variant 2 category label. |  [optional]
**customVariant2Option** | **String** | Optional. Custom variant 2 option value. |  [optional]
**customVariant3Category** | **String** | Optional. Custom variant 3 category label. |  [optional]
**customVariant3Option** | **String** | Optional. Custom variant 3 option value. |  [optional]
**sellerName** | **String** | Merchant or seller display name. Max 70 characters.  | 
**sellerUrl** | **String** | URL to the seller&#39;s storefront. Max 1000 characters. | 
**marketplaceSeller** | **String** | Optional. Marketplace seller identifier for multi-seller platforms. Max 70 characters. |  [optional]
**sellerPrivacyPolicy** | **String** | Optional. URL to the seller&#39;s privacy policy page. |  [optional]
**sellerTos** | **String** | Optional. URL to the seller&#39;s terms of service page. |  [optional]
**shippingPrice** | **String** | Optional. Shipping price for this product (e.g. \&quot;5.99 USD\&quot; or \&quot;Free\&quot;). |  [optional]
**deliveryEstimate** | [**LocalDate**](LocalDate.md) | Optional. Estimated delivery date. |  [optional]
**pickupMethod** | **String** | Optional. Available pickup method (e.g. \&quot;in-store\&quot;, \&quot;curbside\&quot;, \&quot;locker\&quot;). |  [optional]
**pickupSla** | **String** | Optional. Pickup SLA commitment (e.g. \&quot;same-day\&quot;, \&quot;2 hours\&quot;, \&quot;next-day\&quot;). |  [optional]
**isDigital** | **Boolean** | Optional. Whether this product is a digital/downloadable item. |  [optional]
**returnPolicy** | **String** | Human-readable return policy description. | 
**acceptsReturns** | **Boolean** | Optional. Whether the product is eligible for returns. |  [optional]
**returnDeadlineInDays** | **Integer** | Optional. Number of days within which a return is accepted. Must be a positive integer. |  [optional]
**acceptsExchanges** | **Boolean** | Optional. Whether the product is eligible for exchanges. |  [optional]
**isEligibleSearch** | **Boolean** | Controls whether this product appears in AI agent product discovery and search results. | 
**isEligibleCheckout** | **Boolean** | Controls whether this product can be added to cart and purchased via AI agents. | 
**popularityScore** | **Double** | Optional. Numeric popularity score (higher is more popular). |  [optional]
**returnRate** | **String** | Optional. Product return rate indicator (e.g. \&quot;low\&quot;, \&quot;medium\&quot;, \&quot;high\&quot;, or \&quot;5%\&quot;). |  [optional]
**warning** | **String** | Optional. Safety or compliance warning text for the product (e.g. Prop 65, choking hazard). |  [optional]
**warningUrl** | **String** | Optional. URL to a detailed warning or compliance information page. |  [optional]
**ageRestriction** | **Integer** | Optional. Minimum age required to purchase this product (e.g. 18). |  [optional]
**reviewCount** | **Integer** | Optional. Total number of customer reviews for this product. |  [optional]
**starRating** | **String** | Optional. Average star rating for this product (e.g. \&quot;4.5\&quot;). |  [optional]
**storeReviewCount** | **Integer** | Optional. Total number of store-level reviews. |  [optional]
**storeStarRating** | **String** | Optional. Average star rating for the store (e.g. \&quot;4.8\&quot;). |  [optional]
**relatedProductId** | **String** | Optional. Item ID of a related product (e.g. accessory, replacement). |  [optional]
**relationshipType** | **String** | Optional. Type of relationship to &#x60;related_product_id&#x60; (e.g. \&quot;accessory\&quot;, \&quot;replacement\&quot;, \&quot;bundle\&quot;).  |  [optional]
**targetCountries** | **List&lt;String&gt;** | List of ISO 3166-1 alpha-3 country codes where this product is available. | 
**storeCountry** | **String** | ISO 3166-1 alpha-2 country code of the merchant&#39;s store. Max 2 characters. | 
**qAndA** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md) | Optional. List of Q&amp;A entries for this product. |  [optional]
**qandA** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md) | Optional. Alias for &#x60;q_and_a&#x60;. Included for compatibility with alternate field naming conventions. |  [optional]
**reviews** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md) | Optional. List of customer review objects for this product. |  [optional]



