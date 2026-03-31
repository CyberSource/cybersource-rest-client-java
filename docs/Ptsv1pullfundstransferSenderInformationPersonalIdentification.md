
# Ptsv1pullfundstransferSenderInformationPersonalIdentification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuingCountry** | **String** | Issuing country of the identification.   The field format should be a 2 character ISO 3166-1 alpha-2 country code.  |  [optional]
**id** | **String** | The ID number/value.  Visa Direct(35 characters)   This tag will contain an acquirer-populated id value associated with the API.   If &#x60;senderInformation.personalIdentification.type&#x60;&#x3D;&#x60;BTHD&#x60;, then the id format must be &#x60;YYYYMMDD&#x60;.  |  [optional]
**type** | **String** | Visa Direct   This tag will contain the type of sender identification.   The valid values are:   • &#x60;BTHD&#x60; (Date of birth)   • &#x60;CUID&#x60; (Customer identification (unspecified))   • &#x60;NTID&#x60; (National identification)   • &#x60;PASN&#x60; (Passport number)   • &#x60;DRLN&#x60; (Driver license)   • &#x60;TXIN&#x60; (Tax identification)   • &#x60;CPNY&#x60; (Company registration number)   • &#x60;PRXY&#x60; (Proxy identification)   • &#x60;SSNB&#x60; (Social security number)   • &#x60;ARNB&#x60; (Alien registration number)   • &#x60;LAWE&#x60; (Law enforcement identification)   • &#x60;MILI&#x60; (Military identification)   • &#x60;TRVL&#x60; (Travel identification (non-passport))   • &#x60;EMAL&#x60; (Email)   • &#x60;PHON&#x60; (Phone number)  |  [optional]
**personalIdType** | **String** | It denotes whether the tax ID is a business or individual tax ID.   The valid values are:   • &#x60;B&#x60; (Business)   • &#x60;I&#x60; (Individual)  Visa Direct   This field is required when &#x60;senderInformation.personalIdentification.type&#x60; has the value of &#x60;TXIN&#x60; (Tax identification).   A value for &#x60;senderInformation.personalInformation.id&#x60; is required when &#x60;senderInformation.personalIdentification.personalIdType&#x60; is present in a request.  |  [optional]



