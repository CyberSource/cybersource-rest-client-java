
# Boardingv1registrationsOrganizationInformationKYC

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**whenIsCustomerCharged** | [**WhenIsCustomerChargedEnum**](#WhenIsCustomerChargedEnum) |  | 
**whenIsCustomerChargedDescription** | **String** |  |  [optional]
**offerSubscriptions** | **Boolean** |  | 
**monthlySubscriptionPercent** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**quarterlySubscriptionPercent** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**semiAnnualSubscriptionPercent** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**annualSubscriptionPercent** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**timeToProductDelivery** | [**TimeToProductDeliveryEnum**](#TimeToProductDeliveryEnum) |  | 
**estimatedMonthlySales** | [**BigDecimal**](BigDecimal.md) |  | 
**averageOrderAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**largestExpectedOrderAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**depositBankAccount** | [**Boardingv1registrationsOrganizationInformationKYCDepositBankAccount**](Boardingv1registrationsOrganizationInformationKYCDepositBankAccount.md) |  |  [optional]


<a name="WhenIsCustomerChargedEnum"></a>
## Enum: WhenIsCustomerChargedEnum
Name | Value
---- | -----
ONETIMEBEFORE | &quot;ONETIMEBEFORE&quot;
ONETIMEAFTER | &quot;ONETIMEAFTER&quot;
OTHER | &quot;OTHER&quot;


<a name="TimeToProductDeliveryEnum"></a>
## Enum: TimeToProductDeliveryEnum
Name | Value
---- | -----
INSTANT | &quot;INSTANT&quot;
UPTO2 | &quot;UPTO2&quot;
UPTO5 | &quot;UPTO5&quot;
UPTO10 | &quot;UPTO10&quot;
GREATERTHAN10 | &quot;GREATERTHAN10&quot;



