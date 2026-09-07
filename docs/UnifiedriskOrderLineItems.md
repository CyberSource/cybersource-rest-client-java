
# UnifiedriskOrderLineItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **String** | Unique identifier for the item. |  [optional]
**name** | **String** | Name of the product. |  [optional]
**quantity** | **Integer** | Quantity of the product ordered. |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) | Price of the product. |  [optional]
**type** | [**BigDecimal**](BigDecimal.md) | Type of commodity. |  [optional]
**sku** | **String** | SKU for the product. |  [optional]
**currencyCode** | **String** | ISO 4217 3-letter currency code for the line item price (e.g., USD, EUR, GBP). Required when line item prices are expressed in a currency that differs from the order-level transaction currency. |  [optional]



