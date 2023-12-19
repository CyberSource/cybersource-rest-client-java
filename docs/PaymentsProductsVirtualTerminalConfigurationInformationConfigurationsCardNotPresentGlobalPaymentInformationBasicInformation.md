
# PaymentsProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultStandardEntryClassCode** | **String** |  |  [optional]
**defaultCountryCode** | **String** | ISO 4217 format |  [optional]
**defaultCurrencyCode** | **String** | Three-character [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf) |  [optional]
**defaultTransactionType** | [**DefaultTransactionTypeEnum**](#DefaultTransactionTypeEnum) |  |  [optional]
**defaultPaymentType** | [**DefaultPaymentTypeEnum**](#DefaultPaymentTypeEnum) |  |  [optional]
**defaultTransactionSource** | **String** |  |  [optional]
**displayRetail** | **Boolean** |  |  [optional]
**displayMoto** | **Boolean** |  |  [optional]
**displayInternet** | **Boolean** |  |  [optional]


<a name="DefaultTransactionTypeEnum"></a>
## Enum: DefaultTransactionTypeEnum
Name | Value
---- | -----
AUTHORIZATION | &quot;AUTHORIZATION&quot;
SALE | &quot;SALE&quot;


<a name="DefaultPaymentTypeEnum"></a>
## Enum: DefaultPaymentTypeEnum
Name | Value
---- | -----
CREDIT_CARD | &quot;CREDIT_CARD&quot;
ECHECK | &quot;ECHECK&quot;



