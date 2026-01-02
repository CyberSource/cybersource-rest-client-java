
# Acpv1instructionsinstructionIdconfirmationsProcessorInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dynamicDataId** | **String** | A unique reference ID that represents the dynamic data associated with a transaction |  [optional]
**transactionType** | **String** | Type of payment transaction Possible values:   - &#39;PURCHASE&#39;   - &#39;AUTHORIZATION&#39;   - &#39;CAPTURE&#39;   - &#39;REFUND&#39;   - &#39;REVERSAL&#39;   - &#39;VERIFICATION&#39;   - &#39;CHARGEBACK&#39;   - &#39;FRAUD&#39;  | 
**transactionStatus** | **String** | Status of payment transaction Possible values:   - &#39;APPROVED&#39;   - &#39;DECLINED&#39;   - &#39;PENDING&#39;   - &#39;ERROR&#39;   - &#39;CANCELLED&#39;  | 
**responseCode** | **String** | 2 Digit Response code sent directly from the payment processor |  [optional]
**transactionTimestamp** | **String** | Date and time of the transaction (UTC time in Epoch format) |  [optional]
**approvalCode** | **String** | Authorization code. Returned when the processor returns this value |  [optional]
**retrievalReferenceNumber** | **String** | Unique number to identify the transaction. It is used with other data elements to identify and track all messages related to a transaction |  [optional]
**systemTraceAuditNumber** | **String** | System Trace Audit Number. Audit number assigned by the payment network |  [optional]
**acquirerReferenceNumber** | **String** | Acquirer Reference Number. Reference number assigned by the acquirer |  [optional]
**amountDetail** | [**Acpv1instructionsinstructionIdcredentialsOrderInformationAmountDetail**](Acpv1instructionsinstructionIdcredentialsOrderInformationAmountDetail.md) |  |  [optional]
**entryMode** | **String** | Method of entering payment card information Possible values:     - &#39;EMV&#39;   - &#39;CONTACTLESS&#39;   - &#39;MANUAL&#39;   - &#39;ECOMMERCE&#39;   - &#39;WALLET&#39;  |  [optional]
**paymentInstrument** | [**Acpv1instructionsinstructionIdconfirmationsProcessorInformationPaymentInstrument**](Acpv1instructionsinstructionIdconfirmationsProcessorInformationPaymentInstrument.md) |  |  [optional]



