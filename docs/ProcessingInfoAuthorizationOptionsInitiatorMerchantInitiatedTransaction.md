
# ProcessingInfoAuthorizationOptionsInitiatorMerchantInitiatedTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | Reason for the transaction. Possible values: - &#x60;1&#x60;: Resubmission - &#x60;2&#x60;: Delayed charge - &#x60;3&#x60;: Reauthorization for split shipment - &#x60;4&#x60;: No show - &#x60;5&#x60;: Account top up or Incremental authorization - &#x60;6&#x60;: Partial shipment - &#x60;7&#x60;: Fixed amount recurring (subscription) - &#x60;8&#x60;: Variable amount recurring (standing order) - &#x60;9&#x60;: Installment - &#x60;10&#x60;: Unscheduled Card-on-File   This field should be used to identify the kind of merchant-initiated transaction. Values 7 and 8 should be used on customer-initiated transactions that are establishing the relationship for Mastercard subscriptions or standing orders.  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR0 - Position: 160-163 - Field: Message Reason Code  |  [optional]
**previousTransactionId** | **String** | Network transaction identifier that was returned in the payment response field _processorInformation.transactionID_ in the reply message for the original customer-initiated payment in the series.  If the current payment request includes a token instead of an account number, the following time limits apply for the value of this field: - For a **resubmission**, the transaction ID must be less than 14 days old. - For a **delayed charge** or **reauthorization**, the transaction ID must be less than 30 days old.  **NOTE**: The value for this field does not correspond to any data in the TC 33 capture file5.  |  [optional]
**originalAuthorizedAmount** | **String** | Amount of the original authorization in the series. This field is only needed for merchant-initiated transactions with Discover or Diners cards.  |  [optional]
**agreementId** | **String** | An API to carry the agreement ID generated for recurring and unscheduled Card on file transaction. the merchant generates this per card holder or per payment agreement and shares the generated unique ID in the subsequent transactions. This can contain foreign/arabic character set also. Cybersource forwards this value to the Saudi Payment processor.  |  [optional]



