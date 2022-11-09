
# InlineResponse4003

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**correlationId** | **String** |  |  [optional]
**details** | [**List&lt;InlineResponse4003Details&gt;**](InlineResponse4003Details.md) |  |  [optional]
**informationLink** | **String** |  |  [optional]
**message** | **String** |  | 
**reason** | [**ReasonEnum**](#ReasonEnum) |  | 


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
INVALID_APIKEY | &quot;INVALID_APIKEY&quot;
INVALID_SHIPPING_INPUT_PARAMS | &quot;INVALID_SHIPPING_INPUT_PARAMS&quot;
CAPTURE_CONTEXT_INVALID | &quot;CAPTURE_CONTEXT_INVALID&quot;
CAPTURE_CONTEXT_EXPIRED | &quot;CAPTURE_CONTEXT_EXPIRED&quot;
SDK_XHR_ERROR | &quot;SDK_XHR_ERROR&quot;
UNIFIEDPAYMENTS_VALIDATION_PARAMS | &quot;UNIFIEDPAYMENTS_VALIDATION_PARAMS&quot;
UNIFIEDPAYMENTS_VALIDATION_FIELDS | &quot;UNIFIEDPAYMENTS_VALIDATION_FIELDS&quot;
UNIFIEDPAYMENT_PAYMENT_PARAMITERS | &quot;UNIFIEDPAYMENT_PAYMENT_PARAMITERS&quot;
CREATE_TOKEN_TIMEOUT | &quot;CREATE_TOKEN_TIMEOUT&quot;
CREATE_TOKEN_XHR_ERROR | &quot;CREATE_TOKEN_XHR_ERROR&quot;
SHOW_LOAD_CONTAINER_SELECTOR | &quot;SHOW_LOAD_CONTAINER_SELECTOR&quot;
SHOW_LOAD_INVALID_CONTAINER | &quot;SHOW_LOAD_INVALID_CONTAINER&quot;
SHOW_TOKEN_TIMEOUT | &quot;SHOW_TOKEN_TIMEOUT&quot;
SHOW_TOKEN_XHR_ERROR | &quot;SHOW_TOKEN_XHR_ERROR&quot;
SHOW_PAYMENT_TIMEOUT | &quot;SHOW_PAYMENT_TIMEOUT&quot;



