
# PtsV2PaymentsPost201ResponseRiskInformationInfoCodes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**velocity** | **List&lt;String&gt;** | List of information codes triggered by the order. These information codes were generated when you created the order and product velocity rules and are returned so that you can associate them with the rules.  |  [optional]
**address** | **List&lt;String&gt;** | Indicates a mismatch between the customer&#39;s billing and shipping addresses.  |  [optional]
**customerList** | **List&lt;String&gt;** | Indicates that customer information is associated with transactions that are either on the negative or the positive list.  |  [optional]
**deviceBehavior** | **List&lt;String&gt;** | Indicates the device behavior information code(s) returned from device fingerprinting.  |  [optional]
**identityChange** | **List&lt;String&gt;** | Indicates excessive identity changes. The threshold is variable depending on the identity elements being compared.  |  [optional]
**internet** | **List&lt;String&gt;** | Indicates a problem with the customer&#39;s email address, IP address, or billing address.  |  [optional]
**phone** | **List&lt;String&gt;** | Indicates a problem with the customer&#39;s phone number.  |  [optional]
**suspicious** | **List&lt;String&gt;** | Indicates that the customer provided potentially suspicious information.  |  [optional]
**globalVelocity** | **List&lt;String&gt;** | Indicates that the customer has a high purchase frequency.  |  [optional]



