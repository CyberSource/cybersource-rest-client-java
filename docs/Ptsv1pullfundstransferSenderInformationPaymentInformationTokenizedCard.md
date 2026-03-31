
# Ptsv1pullfundstransferSenderInformationPaymentInformationTokenizedCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cryptogram** | **String** | This field contains token cryptogram information |  [optional]
**expirationMonth** | **String** | One of two possible meanings:  The two-digit month in which a token expires. The two-digit month in which a card expires.   Format: &#x60;MM&#x60;   Possible values: 01 through 12  |  [optional]
**expirationYear** | **String** | One of two possible meanings:  The four-digit year in which a token expires. The four-digit year in which a card expires.   Format: &#x60;YYYY&#x60;   Possible values: 1900 through 3000   Data type: Non-negative integer  |  [optional]
**number** | **String** | Customer&#39;s payment network token value.  |  [optional]
**securityCode** | **String** | Card Verification Number (CVN).  |  [optional]
**type** | **String** | Three-digit value that indicates the card type. Mandatory if not present in a token.  Possible values:  - &#x60;001&#x60;: Visa - &#x60;002&#x60;: Mastercard, Eurocard, which is a European regional brand of Mastercard. - &#x60;033&#x60;: Visa Electron - &#x60;024&#x60;: Maestro  |  [optional]



