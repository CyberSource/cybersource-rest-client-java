
# Ucv1sessionsDataSenderInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **String** | First name of the sender. This field is applicable for AFT and OCT transactions.   Only alpha numeric values are supported.Special characters not in the standard ASCII character set, are not supported and will be stripped before being sent to the processor.  |  [optional]
**middleName** | **String** | Middle name of the sender. This field is applicable for AFT and OCT transactions.   Only alpha numeric values are supported. Special characters not in the standard ASCII character set, are not supported and will be stripped before being sent to sent to the processor.  |  [optional]
**lastName** | **String** | Last name of the sender. This field is applicable for AFT and OCT transactions.  Only alpha numeric values are supported. Special characters not in the standard ASCII character set, are not supported and will be stripped before being sent to sent to the processor.  |  [optional]
**address1** | **String** | The street address of the sender. This field is applicable for AFT transactions.   Only alpha numeric values are supported.  Special characters not in the standard ASCII character set are not supported and will be stripped before being sent to sent to the processor.  |  [optional]
**locality** | **String** | The city or locality of the sender. This field is applicable for AFT transactions.  Only alpha numeric values are supported.  Special characters not in the standard ASCII character set are not supported and will be stripped before being sent to sent to the processor.  |  [optional]
**administrativeArea** | **String** | The state or province of the sender. This field is applicable for AFT transactions when the sender country is US or CA. Else it is optional.  Must be a two character value  |  [optional]
**postalCode** | **String** | Postal code of sender.  |  [optional]
**countryCode** | **String** | The country associated with the address of the sender. This field is applicable for AFT transactions.   Must be a two character ISO country code.  For example, see [ISO Country Code](https://developer.cybersource.com/docs/cybs/en-us/country-codes/reference/all/na/country-codes/country-codes.html)  |  [optional]
**phoneNumber** | **String** | Sender phone number |  [optional]
**dateOfBirth** | **String** | Sender&#39;s date of birth. **Format**: &#x60;YYYYMMDD&#x60;.  This field is a &#x60;pass-through&#x60;, which means that CyberSource ensures that the value is eight numeric characters but otherwise does not verify the value or modify it in any way before sending it to the processor. If the field is not required for the transaction, CyberSource does not forward it to the processor.  |  [optional]
**accountType** | **String** | Identifies the sender&#39;s account type.     This field is applicable for AFT transactions.      Valid values are:       - &#x60;00&#x60; for Other       - &#x60;01&#x60; for Routing Transit Number (RTN) + Bank Account Number (BAN)       - &#x60;02&#x60; for International Bank Account Number (IBAN)       - &#x60;03&#x60; for Card Account       - &#x60;04&#x60; for Email       - &#x60;05&#x60; for Phone Number       - &#x60;06&#x60; for Bank Account Number (BAN) + Bank Identification Code (BIC), also known as a SWIFT code       - &#x60;07&#x60; for Wallet ID       - &#x60;08&#x60; for Social Network ID  |  [optional]
**account** | [**Ucv1sessionsDataSenderInformationAccount**](Ucv1sessionsDataSenderInformationAccount.md) |  |  [optional]



