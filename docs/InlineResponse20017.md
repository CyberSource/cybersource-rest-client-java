
# InlineResponse20017

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The checkout session identifier. | 
**status** | **String** | Will always be &#x60;completed&#x60; on a successful response.  Possible values: - completed | 
**currency** | **String** | ISO 4217 lowercase currency code. | 
**buyer** | [**AcpCompleteCheckoutResponseBuyer**](AcpCompleteCheckoutResponseBuyer.md) |  | 
**lineItems** | [**List&lt;InlineResponse20112LineItems&gt;**](InlineResponse20112LineItems.md) | Final line items with confirmed pricing. | 
**fulfillmentAddress** | [**InlineResponse20017FulfillmentAddress**](InlineResponse20017FulfillmentAddress.md) |  |  [optional]
**fulfillmentOptions** | [**List&lt;InlineResponse20112FulfillmentOptions&gt;**](InlineResponse20112FulfillmentOptions.md) |  | 
**fulfillmentOptionId** | **String** | ID of the selected fulfillment option. | 
**totals** | [**List&lt;InlineResponse20112Totals&gt;**](InlineResponse20112Totals.md) | Final order totals as typed total lines. All amounts in minor units (cents). | 
**order** | [**InlineResponse20017Order**](InlineResponse20017Order.md) |  | 
**messages** | [**List&lt;InlineResponse20112Messages&gt;**](InlineResponse20112Messages.md) | Informational or error messages from the merchant backend. | 
**links** | [**List&lt;InlineResponse20112Links&gt;**](InlineResponse20112Links.md) | Related resource links from the merchant (e.g. terms of use, privacy policy). | 



