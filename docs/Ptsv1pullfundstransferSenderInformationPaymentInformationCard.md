
# Ptsv1pullfundstransferSenderInformationPaymentInformationCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Three-digit value that indicates the card type. Mandatory if not present in a token.  Possible values: - &#x60;001&#x60;: Visa - &#x60;002&#x60;: Mastercard, Eurocard, which is a European regional brand of Mastercard. - &#x60;033&#x60;: Visa Electron - &#x60;024&#x60;: Maestro  |  [optional]
**securityCode** | **String** | 3-digit value that indicates the cardCvv2Value. Values can be 0-9.  |  [optional]
**number** | **String** | The customer&#39;s payment card number, also known as the Primary Account Number (PAN).  Conditional: this field is required if not using tokens.  |  [optional]
**expirationMonth** | **String** | Two-digit month in which the payment card expires.  Format: &#x60;MM&#x60;.  Valid values: &#x60;01&#x60; through &#x60;12&#x60;. Leading 0 is required.   Conditional: this field is required if using neither a Customer nor Payment Instrument token.  |  [optional]
**expirationYear** | **String** | Four-digit year in which the payment card expires.  Format: &#x60;YYYY&#x60;.  Conditional: this field is required if using neither a Customer nor Payment Instrument token.  |  [optional]



