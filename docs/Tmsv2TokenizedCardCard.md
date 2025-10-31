
# Tmsv2TokenizedCardCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **String** | The customer&#39;s payment card number, also known as the Primary Account Number (PAN).  |  [optional]
**expirationMonth** | **String** | Two-digit month in which the payment card expires.  Format: &#x60;MM&#x60;.  Possible Values: &#x60;01&#x60; through &#x60;12&#x60;.  |  [optional]
**expirationYear** | **String** | Four-digit year in which the credit card expires.  Format: &#x60;YYYY&#x60;.  |  [optional]
**type** | **String** | The type of card (Card Network). Possible Values: - 001: visa  |  [optional]
**suffix** | **String** | The customer&#39;s latest payment card number suffix.  |  [optional]
**issueDate** | [**LocalDate**](LocalDate.md) | Card issuance date. XML date format: YYYY-MM-DD. |  [optional]
**activationDate** | [**LocalDate**](LocalDate.md) | Card activation date. XML date format: YYYY-MM-DD |  [optional]
**expirationPrinted** | **Boolean** | Indicates if the expiration date is printed on the card. |  [optional]
**securityCodePrinted** | **Boolean** | Indicates if the Card Verification Number is printed on the card. |  [optional]
**termsAndConditions** | [**Tmsv2TokenizedCardCardTermsAndConditions**](Tmsv2TokenizedCardCardTermsAndConditions.md) |  |  [optional]



