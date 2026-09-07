
# InlineResponse20112LineItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ACG-assigned line item identifier. |  [optional]
**item** | [**InlineResponse20112Item**](InlineResponse20112Item.md) |  |  [optional]
**baseAmount** | **Integer** | Unit price × quantity before discounts, in minor units. |  [optional]
**discount** | **Integer** | Discount amount for this line item, in minor units. |  [optional]
**subtotal** | **Integer** | base_amount minus discount, in minor units. |  [optional]
**tax** | **Integer** | Tax on this line item, in minor units. |  [optional]
**total** | **Integer** | subtotal plus tax, in minor units. |  [optional]



