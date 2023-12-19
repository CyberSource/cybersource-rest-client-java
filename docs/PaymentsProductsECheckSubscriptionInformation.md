
# PaymentsProductsECheckSubscriptionInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** |  |  [optional]
**selfServiceability** | [**SelfServiceabilityEnum**](#SelfServiceabilityEnum) | Indicates if the organization can enable this product using self service. |  [optional]
**mode** | **List&lt;String&gt;** | Indicates what mode the product is expected to behave at boarding and transaction flows. Ex, Acquirer/Gateway/Other. |  [optional]


<a name="SelfServiceabilityEnum"></a>
## Enum: SelfServiceabilityEnum
Name | Value
---- | -----
SELF_SERVICEABLE | &quot;SELF_SERVICEABLE&quot;
NOT_SELF_SERVICEABLE | &quot;NOT_SELF_SERVICEABLE&quot;
SELF_SERVICE_ONLY | &quot;SELF_SERVICE_ONLY&quot;



