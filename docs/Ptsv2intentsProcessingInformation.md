
# Ptsv2intentsProcessingInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processingInstruction** | **String** | The instruction to process an order. - default value: &#39;NO_INSTRUCTION&#39; - &#39;ORDER_SAVED_EXPLICITLY&#39;  |  [optional]
**authorizationOptions** | [**Ptsv2intentsProcessingInformationAuthorizationOptions**](Ptsv2intentsProcessingInformationAuthorizationOptions.md) |  |  [optional]
**actionList** | **List&lt;String&gt;** | Array of actions (one or more) to be included in the order to invoke bundled services along with order. Possible values: - &#x60;AP_ORDER&#x60;: Use this when Alternative Payment Order service is requested.  |  [optional]
**highRiskTransactionFlag** | **String** | Indicates if the transaction is flagged as high risk.  |  [optional]
**transactionRetry** | **String** | Indicates if the transaction is a retry.  |  [optional]
**lastOneHrTransactionCount** | **String** | The number of transactions in the last one hour.  |  [optional]
**lastOneDayTransactionCount** | **String** | The number of transactions in the last one day.  |  [optional]
**lastThreeMonthsTxnCount** | **String** | The number of transactions in the last three months.  |  [optional]
**totalTransactionCount** | **String** | The total number of transactions.  |  [optional]
**pinVerification** | **String** | Indicates if PIN verification is required.  |  [optional]
**faceIdVerification** | **String** | Indicates if face ID verification is required.  |  [optional]
**userPassedVerification** | **String** | Indicates if the user passed verification.  |  [optional]
**ipAddress** | **String** | The IP address of the user.  |  [optional]
**transactionDate** | **String** | The date of the transaction.  |  [optional]
**tangible** | **String** | Indicates if the transaction involves tangible goods.  |  [optional]



