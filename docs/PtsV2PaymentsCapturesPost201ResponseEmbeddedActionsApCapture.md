
# PtsV2PaymentsCapturesPost201ResponseEmbeddedActionsApCapture

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | The reason why the captured payment status is PENDING or DENIED. BUYER_COMPLAINT The payer initiated a dispute for this captured payment with processor. CHARGEBACK The captured funds were reversed in response to the payer disputing this captured payment with the issuer of the financial instrument used to pay for this captured payment. ECHECK The payer paid by an eCheck that has not yet cleared. INTERNATIONAL_WITHDRAWAL Visit your online account. In your Account Overview, accept and deny this payment. OTHER No additional specific reason can be provided. For more information about this captured payment, visit your account online or contact processor. PENDING_REVIEW The captured payment is pending manual review. RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION The payee has not yet set up appropriate receiving preferences for their account. For more information about how to accept or deny this payment, visit your account online. This reason is typically offered in scenarios such as when the currency of the captured payment is different from the primary holding currency of the payee. REFUNDED The captured funds were refunded. TRANSACTION_APPROVED_AWAITING_FUNDING The payer must send the funds for this captured payment. This code generally appears for manual EFTs. UNILATERAL The payee does not have a processor account. VERIFICATION_REQUIRED The payee&#39;s processor account is not verified. String with values,  &#x60;BUYER_COMPLAINT&#x60;  &#x60;CHARGEBACK&#x60;  &#x60;ECHECK&#x60;  &#x60;INTERNATIONAL_WITHDRAWAL&#x60;  &#x60;OTHER&#x60;  &#x60;PENDING_REVIEW&#x60;  &#x60;RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION&#x60;  &#x60;REFUNDED&#x60;  &#x60;TRANSACTION_APPROVED_AWAITING_FUNDING&#x60;  &#x60;UNILATERAL&#x60;  &#x60;VERIFICATION_REQUIRED&#x60;  |  [optional]



