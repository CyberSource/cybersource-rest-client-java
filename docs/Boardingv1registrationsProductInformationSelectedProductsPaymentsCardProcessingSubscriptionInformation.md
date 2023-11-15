
# Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingSubscriptionInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** |  |  [optional]
**selfServiceability** | [**SelfServiceabilityEnum**](#SelfServiceabilityEnum) | Indicates if the organization can enable this product using self service. |  [optional]
**features** | [**Map&lt;String, Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingSubscriptionInformationFeatures&gt;**](Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingSubscriptionInformationFeatures.md) | This is a map. The allowed keys are below. Value should be an object containing a sole boolean property - enabled. &lt;table&gt;    &lt;tr&gt;       &lt;td&gt;cardPresent&lt;/td&gt;    &lt;/tr&gt;    &lt;tr&gt;       &lt;td&gt;cardNotPresent&lt;/td&gt;    &lt;/tr&gt; &lt;/table&gt;  |  [optional]


<a name="SelfServiceabilityEnum"></a>
## Enum: SelfServiceabilityEnum
Name | Value
---- | -----
SELF_SERVICEABLE | &quot;SELF_SERVICEABLE&quot;
NOT_SELF_SERVICEABLE | &quot;NOT_SELF_SERVICEABLE&quot;
SELF_SERVICE_ONLY | &quot;SELF_SERVICE_ONLY&quot;



