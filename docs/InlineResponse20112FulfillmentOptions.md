
# InlineResponse20112FulfillmentOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique fulfillment option ID. Pass as &#x60;fulfillment_option_id&#x60; to select it. |  [optional]
**type** | **String** | Fulfillment method type.  Possible values: - shipping - digital |  [optional]
**title** | **String** | Display name for this fulfillment option. |  [optional]
**subtitle** | **String** | Additional description (e.g. estimated delivery window). |  [optional]
**carrier** | **String** | Carrier name for shipping options. |  [optional]
**earliestDeliveryTime** | [**DateTime**](DateTime.md) | Earliest estimated delivery in RFC 3339 format. |  [optional]
**latestDeliveryTime** | [**DateTime**](DateTime.md) | Latest estimated delivery in RFC 3339 format. |  [optional]
**subtotal** | **Integer** | Shipping cost before tax, in minor units. |  [optional]
**tax** | **Integer** | Tax on shipping cost, in minor units. |  [optional]
**total** | **Integer** | Total shipping cost including tax, in minor units. |  [optional]



