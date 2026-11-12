
# UcpCheckoutSessionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ucp** | [**UcpCheckoutSessionResponseUcp**](UcpCheckoutSessionResponseUcp.md) |  |  [optional]
**id** | **String** | Unique UCP session identifier. Required for all subsequent UCP calls (update, complete, cancel).  |  [optional]
**status** | **String** | Current lifecycle state of the session. - &#x60;active&#x60; — open and modifiable - &#x60;completed&#x60; — order placed, immutable - &#x60;cancelled&#x60; — abandoned, no charge made   Possible values: - active - completed - cancelled |  [optional]
**currency** | **String** | ISO 4217 currency code for this session (e.g. &#x60;USD&#x60;, &#x60;EUR&#x60;). |  [optional]
**buyer** | [**UcpCheckoutSessionResponseBuyer**](UcpCheckoutSessionResponseBuyer.md) |  |  [optional]
**lineItems** | [**List&lt;UcpCheckoutSessionResponseLineItems&gt;**](UcpCheckoutSessionResponseLineItems.md) | Cart line items with merchant-confirmed pricing. |  [optional]
**totals** | [**List&lt;Iccv1checkoutsessionsFulfillmentTotals&gt;**](Iccv1checkoutsessionsFulfillmentTotals.md) | Order cost breakdown. Each entry represents one total type (subtotal, tax, shipping, discount, or grand total). Amounts are in **cents** (not micros).  |  [optional]
**fulfillment** | [**Iccv1checkoutsessionsResponseFulfillment**](Iccv1checkoutsessionsResponseFulfillment.md) |  |  [optional]
**payment** | [**Iccv1checkoutsessionsResponsePayment**](Iccv1checkoutsessionsResponsePayment.md) |  |  [optional]
**discounts** | [**Iccv1checkoutsessionsResponseDiscounts**](Iccv1checkoutsessionsResponseDiscounts.md) |  |  [optional]
**order** | [**UcpCheckoutSessionResponseOrder**](UcpCheckoutSessionResponseOrder.md) |  |  [optional]
**links** | [**List&lt;CheckoutSessionResponseLinks&gt;**](CheckoutSessionResponseLinks.md) | Related resource links (e.g. terms of use, privacy policy). |  [optional]



