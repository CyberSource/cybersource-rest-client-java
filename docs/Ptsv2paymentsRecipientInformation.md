
# Ptsv2paymentsRecipientInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | Identifier for the recipient&#39;s account. This field is applicable for AFT transactions.  |  [optional]
**accountType** | **String** | Identifies the recipient&#39;s account type. This field is applicable for AFT transactions.  Valid values are:   - &#x60;00&#x60; for Other   - &#x60;01&#x60; for Routing Transit Number (RTN) + Bank Account Number (BAN)   - &#x60;02&#x60; for International Bank Account Number (IBAN)   - &#x60;03&#x60; for Card Account   - &#x60;06&#x60; for Bank Account Number (BAN) + Bank Identification Code (BIC), also known as a SWIFT code  |  [optional]
**firstName** | **String** | First name of the recipient. This field is applicable for AFT transactions.    Only alpha numeric values are supported. Special characters not in the standard ASCII character set, are not supported and will be stripped before being sent to sent to the processor.  |  [optional]
**middleName** | **String** | Middle name of the recipient. This field is applicable for AFT transactions.  Only alpha numeric values are supported. Special characters not in the standard ASCII character set, are not supported and will be stripped before being sent to sent to the processor.  |  [optional]
**lastName** | **String** | Last name of the recipient. This field is applicable for AFT transactions.  Only alpha numeric values are supported. Special characters not in the standard ASCII character set, are not supported and will be stripped before being sent to sent to the processor.  |  [optional]
**address1** | **String** | The street address of the recipient This field is applicable for AFT and OCT transactions.  Only alpha numeric values are supported. Special characters not in the standard ASCII character set are not supported and will be stripped before being sent to sent to the processor.           |  [optional]
**administrativeArea** | **String** | The state or province of the recipient. This field is applicable for AFT transactions when the recipient country is US or CA. Else it is optional.  Must be a two character value  |  [optional]
**postalCode** | **String** | Partial postal code for the recipient&#39;s address. For example, if the postal code is **NN5 7SG**, the value for this field should be the first part of the postal code: **NN5**. This field is a _pass-through_, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. If the field is not required for the transaction, CyberSource does not forward it to the processor.  |  [optional]
**country** | **String** | The country associated with the address of the recipient. This field is applicable for AFT and OCT transactions.  Must be a two character ISO country code.  For example, see [ISO Country Code](https://developer.cybersource.com/docs/cybs/en-us/country-codes/reference/all/na/country-codes/country-codes.html)  |  [optional]
**dateOfBirth** | **String** | Recipient&#39;s date of birth. **Format**: &#x60;YYYYMMDD&#x60;.  This field is a &#x60;pass-through&#x60;, which means that CyberSource ensures that the value is eight numeric characters but otherwise does not verify the value or modify it in any way before sending it to the processor. If the field is not required for the transaction, CyberSource does not forward it to the processor.  |  [optional]
**beneficiaryId** | **String** | Only for e-wallets: ID, username, hash or anything uniquely identifying the ultimate beneficiary.  |  [optional]
**beneficiaryName** | **String** | Only for e-wallets: The ultimate beneficiary&#39;s full name.  |  [optional]
**beneficiaryAddress** | **String** | Only for e-wallets: The ultimate beneficiary&#39;s street address (street, zip code, city), excluding the country. Example: \&quot;Main street 1, 12345, Barcelona  |  [optional]
**aliasName** | **String** | Account owner alias name.  |  [optional]
**nationality** | **String** | Account Owner Nationality |  [optional]
**countryOfBirth** | **String** | Account Owner Country of Birth |  [optional]
**occupation** | **String** | Account Owner Occupation |  [optional]
**email** | **String** | Account Owner email address |  [optional]
**locality** | **String** | The city of the recipient. This field is applicable for AFT transactions.  Only alpha numeric values are supported. Special characters not in the standard ASCII character set are not supported and will be stripped before being sent to sent to the processor.  |  [optional]



