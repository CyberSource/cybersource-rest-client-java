
# CancelCheckoutResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The checkout session identifier. | 
**status** | **String** | Will always be &#x60;canceled&#x60; on a successful response.  Possible values: - canceled | 
**currency** | **String** | ISO 4217 lowercase currency code. | 
**buyer** | [**AcpCheckoutSessionResponseBuyer**](AcpCheckoutSessionResponseBuyer.md) |  |  [optional]
**lineItems** | [**List&lt;CheckoutSessionResponseLineItems&gt;**](CheckoutSessionResponseLineItems.md) | Line items with merchant-confirmed pricing. | 
**fulfillmentAddress** | [**CheckoutSessionResponseFulfillmentAddress**](CheckoutSessionResponseFulfillmentAddress.md) |  |  [optional]
**fulfillmentOptions** | [**List&lt;CheckoutSessionResponseFulfillmentOptions&gt;**](CheckoutSessionResponseFulfillmentOptions.md) | Available fulfillment methods with pricing. | 
**fulfillmentOptionId** | **String** | ID of the currently selected fulfillment option. |  [optional]
**totals** | [**List&lt;CheckoutSessionResponseTotals&gt;**](CheckoutSessionResponseTotals.md) | Order cost breakdown as typed total lines. All amounts in minor units (cents). | 
**messages** | [**List&lt;CheckoutSessionResponseMessages&gt;**](CheckoutSessionResponseMessages.md) | Informational or error messages from the merchant backend. | 
**links** | [**List&lt;CheckoutSessionResponseLinks&gt;**](CheckoutSessionResponseLinks.md) | Related resource links from the merchant (e.g. terms of use, privacy policy). | 



