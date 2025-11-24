
# UnderwritingConfigurationOrganizationInformationBusinessInformationOwnerInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **String** | Owner&#39;s first name | 
**middleName** | **String** | Owner&#39;s middle name |  [optional]
**lastName** | **String** | Owner&#39;s last name | 
**birthDate** | [**LocalDate**](LocalDate.md) | Owner&#39;s date of birth. Format: YYYY-MM-DD Example 2016-08-11 equals August 11, 2016 | 
**isPrimary** | **Boolean** | Primary Owner or Non-Primary Owner | 
**hasSignificantResponsibility** | **Boolean** | If not an owner, is the user a Control Person | 
**ownerDirector** | **Boolean** | Is the owner a Director as well? |  [optional]
**nationalId** | **String** | Identification value from ID document | 
**idCountry** | **String** | Country of the ID document. Two character country code, ISO 3166-1 alpha-2. |  [optional]
**passportNumber** | **String** | Passport Number |  [optional]
**passportCountry** | **String** | Passport Country. Two character country code, ISO 3166-1 alpha-2. |  [optional]
**jobTitle** | **String** | Owner&#39;s Job Title |  [optional]
**ownershipPercentage** | [**BigDecimal**](BigDecimal.md) | Percentage of the company that owner owns | 
**nationality** | **String** | Country of origin for the owner. Two character country code, ISO 3166-1 alpha-2. | 
**dueDiligenceRequired** | **Boolean** | Indicates if due diligence checks should be run for this owner | 
**phoneNumberCountryCode** | **String** | Phone number country. Two character country code, ISO 3166-1 alpha-2. | 
**phoneNumber** | **String** | Owner&#39;s phone number | 
**email** | **String** | Email address for Owner | 
**address** | [**UnderwritingConfigurationOrganizationInformationBusinessInformationAddress1**](UnderwritingConfigurationOrganizationInformationBusinessInformationAddress1.md) |  |  [optional]



