
# InlineResponse20112

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this checkout session. Required for all subsequent calls (update, complete, cancel).  |  [optional]
**status** | **String** | Current lifecycle state of the session per ACP spec: - &#x60;not_ready_for_payment&#x60; — session is open but not yet ready - &#x60;ready_for_payment&#x60; — session is ready to be completed - &#x60;completed&#x60; — order has been placed; session is immutable - &#x60;canceled&#x60; — session was abandoned; no charge was made   Possible values: - not_ready_for_payment - ready_for_payment - completed - canceled |  [optional]
**currency** | **String** | ISO 4217 lowercase currency code for this session. |  [optional]
**lineItems** | [**List&lt;InlineResponse20112LineItems&gt;**](InlineResponse20112LineItems.md) | Line items with merchant-confirmed pricing. |  [optional]
**fulfillmentAddress** | [**InlineResponse20112FulfillmentAddress**](InlineResponse20112FulfillmentAddress.md) |  |  [optional]
**fulfillmentOptions** | [**List&lt;InlineResponse20112FulfillmentOptions&gt;**](InlineResponse20112FulfillmentOptions.md) | Available fulfillment methods with pricing. |  [optional]
**fulfillmentOptionId** | **String** | ID of the currently selected fulfillment option. |  [optional]
**totals** | [**List&lt;InlineResponse20112Totals&gt;**](InlineResponse20112Totals.md) | Order cost breakdown as an array of typed total lines. All amounts in minor units (cents). |  [optional]
**buyer** | [**AcpCheckoutSessionResponseBuyer**](AcpCheckoutSessionResponseBuyer.md) |  |  [optional]
**paymentProvider** | [**InlineResponse20112PaymentProvider**](InlineResponse20112PaymentProvider.md) |  |  [optional]
**messages** | [**List&lt;InlineResponse20112Messages&gt;**](InlineResponse20112Messages.md) | Informational or error messages from the merchant backend. |  [optional]
**links** | [**List&lt;InlineResponse20112Links&gt;**](InlineResponse20112Links.md) | Related resource links from the merchant (e.g. terms of use, privacy policy, seller shop policies).  |  [optional]



