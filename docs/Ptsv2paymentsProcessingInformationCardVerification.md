
# Ptsv2paymentsProcessingInformationCardVerification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkAVS** | **String** | Verification control flag to opt-in or opt-out of Address Verification Service (AVS) for a transaction.  Possible values: - &#x60;Y&#x60;: Enable AVS verification for this transaction - &#x60;N&#x60;: Disable AVS verification for this transaction  #### Used by **Authorization** Optional field for controlling AVS verification at the transaction level.  #### API Ticket ACCAPI-2156  |  [optional]
**checkANI** | **String** | Verification control flag to opt-in or opt-out of Address Name Inquiry (ANI) for a transaction.  Possible values: - &#x60;Y&#x60;: Enable ANI verification for this transaction - &#x60;N&#x60;: Disable ANI verification for this transaction  #### Used by **Authorization** Optional field for controlling ANI verification at the transaction level.  #### API Ticket ACCAPI-2156  |  [optional]



