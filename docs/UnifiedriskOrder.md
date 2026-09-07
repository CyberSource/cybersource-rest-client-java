
# UnifiedriskOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalItemsCount** | **Integer** | Total number of items in order |  [optional]
**returnsAccepted** | **Boolean** | Indicates if returns are accepted |  [optional]
**lineItems** | [**List&lt;UnifiedriskOrderLineItems&gt;**](UnifiedriskOrderLineItems.md) |  |  [optional]
**shipping** | [**UnifiedriskOrderShipping**](UnifiedriskOrderShipping.md) |  |  [optional]
**billing** | [**UnifiedriskOrderBilling**](UnifiedriskOrderBilling.md) |  |  [optional]
**orderId** | **String** | Merchant-assigned unique identifier for this order, used for transaction correlation, dispute matching, and fraud monitoring |  [optional]
**orderDescription** | **String** | Free-text description of the order contents or purpose, provided by the merchant for risk analysis and dispute management |  [optional]



