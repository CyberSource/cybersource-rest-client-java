
# InlineResponse20113

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this checkout session. Required for all subsequent calls (update, complete, cancel).  |  [optional]
**status** | **String** | Current lifecycle state of the session per ACP spec: - &#x60;not_ready_for_payment&#x60; — session is open but not yet ready - &#x60;ready_for_payment&#x60; — session is ready to be completed - &#x60;completed&#x60; — order has been placed; session is immutable - &#x60;canceled&#x60; — session was abandoned; no charge was made   Possible values: - not_ready_for_payment - ready_for_payment - completed - canceled |  [optional]
**currency** | **String** | ISO 4217 lowercase currency code for this session. |  [optional]
**lineItems** | [**List&lt;InlineResponse20113LineItems&gt;**](InlineResponse20113LineItems.md) | Line items with merchant-confirmed pricing. |  [optional]
**fulfillmentAddress** | [**InlineResponse20113FulfillmentAddress**](InlineResponse20113FulfillmentAddress.md) |  |  [optional]
**fulfillmentOptions** | [**List&lt;InlineResponse20113FulfillmentOptions&gt;**](InlineResponse20113FulfillmentOptions.md) | Available fulfillment methods with pricing. |  [optional]
**fulfillmentOptionId** | **String** | ID of the currently selected fulfillment option. |  [optional]
**totals** | [**List&lt;InlineResponse20113Totals&gt;**](InlineResponse20113Totals.md) | Order cost breakdown as an array of typed total lines. All amounts in minor units (cents). |  [optional]
**buyer** | [**AcpCheckoutSessionResponseBuyer**](AcpCheckoutSessionResponseBuyer.md) |  |  [optional]
**paymentProvider** | [**InlineResponse20113PaymentProvider**](InlineResponse20113PaymentProvider.md) |  |  [optional]
**messages** | [**List&lt;InlineResponse20113Messages&gt;**](InlineResponse20113Messages.md) | Informational or error messages from the merchant backend. |  [optional]
**links** | [**List&lt;InlineResponse20113Links&gt;**](InlineResponse20113Links.md) | Related resource links from the merchant (e.g. terms of use, privacy policy, seller shop policies).  |  [optional]



