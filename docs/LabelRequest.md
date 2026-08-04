
# LabelRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | **List&lt;String&gt;** | Actions to perform. For label submission, specify VISA_PROTECT_RISK_INSIGHTS. | 
**events** | **List&lt;String&gt;** | Must be LABELS for label submission requests. | 
**requestId** | **String** | Unique identifier for the label submission request |  [optional]
**eventTime** | [**DateTime**](DateTime.md) | The time that the real-world event occurred. |  [optional]
**transaction** | [**UnifiedriskTransaction**](UnifiedriskTransaction.md) |  | 
**labels** | [**UnifiedriskLabels**](UnifiedriskLabels.md) |  | 



