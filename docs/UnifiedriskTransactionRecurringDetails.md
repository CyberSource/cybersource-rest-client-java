
# UnifiedriskTransactionRecurringDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **Integer** | Days between recurring payments |  [optional]
**occurrence** | **String** | Recurring frequency code: DAILY, WEEKLY, MONTHLY, etc |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) | Date when recurring payments end |  [optional]
**numberOfPayments** | **Integer** | Total number of payments in recurring series |  [optional]
**sequenceNumber** | **Integer** | Current sequence number in recurring series |  [optional]
**type** | **String** | Recurring type: REGISTRATION, SUBSEQUENT, MODIFICATION, CANCELLATION |  [optional]
**validationIndicator** | **String** | Indicates if recurring payment was validated |  [optional]
**amountType** | **String** | Amount type: FIXED, VARIABLE_WITH_MAX |  [optional]
**maximumAmount** | [**BigDecimal**](BigDecimal.md) | Maximum amount for variable recurring payments |  [optional]
**originalPurchaseDate** | [**DateTime**](DateTime.md) | Date of original recurring purchase |  [optional]
**referenceNumber** | **String** | Reference number for recurring payment |  [optional]
**firstPaymentDate** | **String** | Date of the first payment in a recurring series, in ISO 8601 format (YYYY-MM-DD). Used to establish the anchor date for recurring payment scheduling and risk assessment |  [optional]



