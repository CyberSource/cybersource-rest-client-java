
# AcpCreateCheckoutSessionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List&lt;Iccv1checkoutSessionsItems&gt;**](Iccv1checkoutSessionsItems.md) | The items the buyer wants to purchase. At least one item is required. Each &#x60;id&#x60; must match a product already present in the merchant&#39;s ACG catalog.  | 
**buyer** | [**AcpCreateCheckoutSessionBuyer**](AcpCreateCheckoutSessionBuyer.md) |  |  [optional]
**fulfillmentAddress** | [**Iccv1checkoutSessionsFulfillmentAddress**](Iccv1checkoutSessionsFulfillmentAddress.md) |  |  [optional]



