
# PaymentProductsDigitalPaymentsSubscriptionInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** |  |  [optional]
**selfServiceability** | [**SelfServiceabilityEnum**](#SelfServiceabilityEnum) | Indicates if the organization can enable this product using self service. |  [optional]
**features** | [**Map&lt;String, PaymentProductsCardProcessingSubscriptionInformationFeatures&gt;**](PaymentProductsCardProcessingSubscriptionInformationFeatures.md) | Allowed values are; &lt;table&gt;    &lt;tr&gt;       &lt;td&gt;visaCheckout&lt;/td&gt;    &lt;/tr&gt;    &lt;tr&gt;       &lt;td&gt;applePay&lt;/td&gt;    &lt;/tr&gt;    &lt;tr&gt;       &lt;td&gt;samsungPay&lt;/td&gt;    &lt;/tr&gt;    &lt;tr&gt;        &lt;td&gt;googlePay&lt;/td&gt;     &lt;/tr&gt; &lt;/table&gt;  |  [optional]


<a name="SelfServiceabilityEnum"></a>
## Enum: SelfServiceabilityEnum
Name | Value
---- | -----
SELF_SERVICEABLE | &quot;SELF_SERVICEABLE&quot;
NOT_SELF_SERVICEABLE | &quot;NOT_SELF_SERVICEABLE&quot;
SELF_SERVICE_ONLY | &quot;SELF_SERVICE_ONLY&quot;



