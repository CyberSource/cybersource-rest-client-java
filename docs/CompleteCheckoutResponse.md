
# CompleteCheckoutResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The checkout session identifier. | 
**status** | **String** | Will always be &#x60;completed&#x60; on a successful response.  Possible values: - completed | 
**currency** | **String** | ISO 4217 lowercase currency code. | 
**buyer** | [**AcpCompleteCheckoutResponseBuyer**](AcpCompleteCheckoutResponseBuyer.md) |  | 
**lineItems** | [**List&lt;CheckoutSessionResponseLineItems&gt;**](CheckoutSessionResponseLineItems.md) | Final line items with confirmed pricing. | 
**fulfillmentAddress** | [**CompleteCheckoutResponseFulfillmentAddress**](CompleteCheckoutResponseFulfillmentAddress.md) |  |  [optional]
**fulfillmentOptions** | [**List&lt;CheckoutSessionResponseFulfillmentOptions&gt;**](CheckoutSessionResponseFulfillmentOptions.md) |  | 
**fulfillmentOptionId** | **String** | ID of the selected fulfillment option. | 
**totals** | [**List&lt;CheckoutSessionResponseTotals&gt;**](CheckoutSessionResponseTotals.md) | Final order totals as typed total lines. All amounts in minor units (cents). | 
**order** | [**CompleteCheckoutResponseOrder**](CompleteCheckoutResponseOrder.md) |  | 
**messages** | [**List&lt;CheckoutSessionResponseMessages&gt;**](CheckoutSessionResponseMessages.md) | Informational or error messages from the merchant backend. | 
**links** | [**List&lt;CheckoutSessionResponseLinks&gt;**](CheckoutSessionResponseLinks.md) | Related resource links from the merchant (e.g. terms of use, privacy policy). | 



