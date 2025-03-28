
# Riskv1authenticationresultsConsumerAuthenticationInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationTransactionId** | **String** | Payer authentication transaction identifier passed to link the check enrollment and validate authentication messages.For Rupay,this is passed only in Re-Send OTP usecase. **Note**: Required for Standard integration, Rupay Seamless server to server integration for enroll service. Required for Hybrid integration for validate service.  | 
**authenticationTransactionContext** | **String** | Authentication transaction context is used as a unique identifier to link enroll and validate call.  |  [optional]
**otpToken** | **String** | OTP entered by the card holder.  |  [optional]
**responseAccessToken** | **String** | JWT returned by the 3D Secure provider when the authentication is complete. Required for Hybrid integration if you use the Cybersource-generated access token. Note: Max. length of this field is 2048 characters.  |  [optional]
**signedParesStatusReason** | **String** | Provides additional information as to why the PAResStatus has a specific value.  |  [optional]
**signedPares** | **String** | Payer authentication result (PARes) message returned by the card-issuing bank. If you need to show proof of enrollment checking, you may need to decrypt and parse the string for the information required by the payment card company. For more information, see \&quot;Storing Payer Authentication Data,\&quot; page 160. Important The value is in base64. You must remove all carriage returns and line feeds before adding the PARes to the request.  |  [optional]
**whiteListStatus** | **String** | Enables the communication of trusted beneficiary/whitelist status between the ACS, the DS and the 3DS Requestor.  Possible Values:  Y - 3DS Requestor is whitelisted by cardholder  N - 3DS Requestor is not whitelisted by cardholder  |  [optional]
**credentialEncrypted** | **String** | A flag to indicate if the passed credential has been encrypted by the Merchant. |  [optional]



