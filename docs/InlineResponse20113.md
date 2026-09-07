
# InlineResponse20113

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ucp** | [**InlineResponse20113Ucp**](InlineResponse20113Ucp.md) |  |  [optional]
**id** | **String** | Unique UCP session identifier. Required for all subsequent UCP calls (update, complete, cancel).  |  [optional]
**status** | **String** | Current lifecycle state of the session. - &#x60;active&#x60; — open and modifiable - &#x60;completed&#x60; — order placed, immutable - &#x60;cancelled&#x60; — abandoned, no charge made   Possible values: - active - completed - cancelled |  [optional]
**currency** | **String** | ISO 4217 currency code for this session (e.g. &#x60;USD&#x60;, &#x60;EUR&#x60;). |  [optional]
**buyer** | [**UcpCheckoutSessionResponseBuyer**](UcpCheckoutSessionResponseBuyer.md) |  |  [optional]
**lineItems** | [**List&lt;InlineResponse20113LineItems&gt;**](InlineResponse20113LineItems.md) | Cart line items with merchant-confirmed pricing. |  [optional]
**totals** | [**List&lt;Iccv1checkoutsessionsFulfillmentTotals&gt;**](Iccv1checkoutsessionsFulfillmentTotals.md) | Order cost breakdown. Each entry represents one total type (subtotal, tax, shipping, discount, or grand total). Amounts are in **cents** (not micros).  |  [optional]
**fulfillment** | [**InlineResponse20113Fulfillment**](InlineResponse20113Fulfillment.md) |  |  [optional]
**payment** | [**InlineResponse20113Payment**](InlineResponse20113Payment.md) |  |  [optional]
**discounts** | [**InlineResponse20113Discounts**](InlineResponse20113Discounts.md) |  |  [optional]
**order** | [**InlineResponse20113Order**](InlineResponse20113Order.md) |  |  [optional]
**links** | [**List&lt;InlineResponse20112Links&gt;**](InlineResponse20112Links.md) | Related resource links (e.g. terms of use, privacy policy). |  [optional]



