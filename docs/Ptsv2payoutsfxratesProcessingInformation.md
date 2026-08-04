
# Ptsv2payoutsfxratesProcessingInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionType** | **String** | Indicate that the FX rate is for a push (OCT) or pull (AFT) transaction. If the field is not passed, it defaults to PUSH (OCT).  Enum: &#x60;PUSH&#x60;, &#x60;PULL&#x60;  Supported for Visa Direct.  |  [optional]
**clearingSystem** | **String** | System used for clearing.  Values: - &#x60;SINGLE&#x60; - &#x60;DUAL&#x60;  Supported for Mastercard Send.  |  [optional]
**transactionTypeIndicator** | **String** | The Mastercard Transaction Type Indicator is an alphanumeric or numeric code that identifies the business purpose and transaction category for Mastercard‑routed payments. It is used by the Mastercard network to support correct processing, compliance controls, risk evaluation, and reporting.  This field is treated as a pass‑through parameter. The indicator is forwarded as provided to downstream processors and the Mastercard network, where validation and interpretation occur. Supplying an incorrect or missing value may result in network declines, misclassification, or compliance issues with Mastercard.  Example values: - &#x60;C07&#x60; or &#x60;204&#x60; – General person‑to‑person - &#x60;C55&#x60; or &#x60;208&#x60; – Business disbursement - &#x60;C65&#x60; or &#x60;213&#x60; – Business‑to‑business transfer - &#x60;P70&#x60; or &#x60;231&#x60; – Cryptocurrency  Important: Clients are responsible for ensuring the value accurately reflects the transaction intent and complies with Mastercard network requirements.  |  [optional]
**routing** | [**Ptsv2payoutsfxratesProcessingInformationRouting**](Ptsv2payoutsfxratesProcessingInformationRouting.md) |  |  [optional]



