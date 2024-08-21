
# PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | Payment types accepted by this merchant. The supported values are: MASTERDEBIT, MASTERCREDIT, VISACREDIT, VISADEBIT, DISCOVERCREDIT, AMEXCREDIT, ECHECK |  [optional]
**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) | Fee type for the selected payment type. Supported values are: Flat or Percentage.  |  [optional]
**feeAmount** | [**BigDecimal**](BigDecimal.md) | Fee Amount of the selected payment type if you chose Flat fee type.  |  [optional]
**percentage** | [**BigDecimal**](BigDecimal.md) | Percentage of the selected payment type if you chose Percentage Fee type. Supported values use numbers with decimals. For example, 1.0  |  [optional]
**feeCap** | [**BigDecimal**](BigDecimal.md) | Fee cap for the selected payment type. Supported values use numbers with decimals. For example, 1.0  |  [optional]


<a name="PaymentTypeEnum"></a>
## Enum: PaymentTypeEnum
Name | Value
---- | -----
MASTERDEBIT | &quot;MASTERDEBIT&quot;
MASTERCREDIT | &quot;MASTERCREDIT&quot;
VISACREDIT | &quot;VISACREDIT&quot;
VISADEBIT | &quot;VISADEBIT&quot;
DISCOVERCREDIT | &quot;DISCOVERCREDIT&quot;
AMEXCREDIT | &quot;AMEXCREDIT&quot;
ECHECK | &quot;ECHECK&quot;


<a name="FeeTypeEnum"></a>
## Enum: FeeTypeEnum
Name | Value
---- | -----
FLAT | &quot;FLAT&quot;
PERCENTAGE | &quot;PERCENTAGE&quot;



