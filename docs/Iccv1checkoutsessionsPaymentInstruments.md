
# Iccv1checkoutsessionsPaymentInstruments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Client-assigned instrument identifier. |  [optional]
**type** | **String** | Payment method type (e.g. &#x60;card&#x60;, &#x60;wallet&#x60;). |  [optional]
**handlerId** | **String** | Payment handler or processor identifier (e.g. &#x60;visa&#x60;). |  [optional]
**handlerName** | **String** | Human-readable name of the payment handler. |  [optional]
**brand** | **String** | Card brand (e.g. &#x60;visa&#x60;, &#x60;mastercard&#x60;). |  [optional]
**lastDigits** | **String** | Last 4 digits of the card number for display purposes. |  [optional]
**token** | **String** | Opaque payment token from the payment provider. |  [optional]
**credential** | [**Iccv1checkoutsessionsPaymentCredential**](Iccv1checkoutsessionsPaymentCredential.md) |  |  [optional]
**billingAddress** | [**Iccv1checkoutsessionsPaymentBillingAddress**](Iccv1checkoutsessionsPaymentBillingAddress.md) |  |  [optional]
**selected** | **Boolean** | Whether this instrument is selected for the current session. |  [optional]



