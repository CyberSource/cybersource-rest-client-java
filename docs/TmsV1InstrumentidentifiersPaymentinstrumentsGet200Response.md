
# TmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks**](TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks.md) |  |  [optional]
**object** | [**ObjectEnum**](#ObjectEnum) | Shows the response is a collection of objects. |  [optional]
**offset** | **String** | The offset parameter supplied in the request. |  [optional]
**limit** | **String** | The limit parameter supplied in the request. |  [optional]
**count** | **String** | The number of Payment Instruments returned in the array. |  [optional]
**total** | **String** | The total number of Payment Instruments associated with the Instrument Identifier in the zero-based dataset. |  [optional]
**embedded** | [**List&lt;TmsV1PaymentinstrumentsPatch200Response&gt;**](TmsV1PaymentinstrumentsPatch200Response.md) | Array of Payment Instruments returned for the supplied Instrument Identifier. |  [optional]


<a name="ObjectEnum"></a>
## Enum: ObjectEnum
Name | Value
---- | -----
COLLECTION | &quot;collection&quot;



