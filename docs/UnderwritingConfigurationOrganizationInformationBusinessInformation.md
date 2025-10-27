
# UnderwritingConfigurationOrganizationInformationBusinessInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessIdentifier** | **String** | Tax ID for the business | 
**countryRegistration** | **String** | Country where the business is registered. Two character country code, ISO 3166-1 alpha-2. | 
**legalName** | **String** | The legally registered name of the business | 
**doingBusinessAs** | **String** | The DBA of the business. | 
**businessDescription** | **String** | Short description of the Business | 
**registrationNumber** | **String** | Registration ID for Enterprise Merchant |  [optional]
**stockExchange** | **String** | Which stock exchange is the company trading in? |  [optional]
**tickerSymbol** | **String** | Stock Symbol on the exchange |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) | When did Business start. Format: YYYY-MM-DD Example 2016-08-11 equals August 11, 2016 | 
**merchantCategoryCode** | **String** | Industry standard Merchant Category Code (MCC) | 
**mccDescription** | **String** | MCC Description |  [optional]
**websiteURL** | **String** | Website for the Business |  [optional]
**businessType** | **String** | Business type  Possible values: - PARTNERSHIP - SOLE_PROPRIETORSHIP - CORPORATION - LLC - NON_PROFIT - TRUST | 
**localMCC** | **List&lt;String&gt;** |  |  [optional]
**countryPhoneNumber** | **String** | Country of the Business phone number. Two character country code, ISO 3166-1 alpha-2. | 
**phoneNumber** | **String** | Business Phone Number | 
**email** | **String** | Business Email Address | 
**whatYourCompanyDoes** | **String** | What your company does and how you market your service |  [optional]
**address** | [**UnderwritingConfigurationOrganizationInformationBusinessInformationAddress**](UnderwritingConfigurationOrganizationInformationBusinessInformationAddress.md) |  |  [optional]
**tradingAddress** | [**UnderwritingConfigurationOrganizationInformationBusinessInformationTradingAddress**](UnderwritingConfigurationOrganizationInformationBusinessInformationTradingAddress.md) |  |  [optional]
**businessContact** | [**UnderwritingConfigurationOrganizationInformationBusinessInformationBusinessContact**](UnderwritingConfigurationOrganizationInformationBusinessInformationBusinessContact.md) |  |  [optional]
**businessDetails** | [**UnderwritingConfigurationOrganizationInformationBusinessInformationBusinessDetails**](UnderwritingConfigurationOrganizationInformationBusinessInformationBusinessDetails.md) |  |  [optional]
**ownerInformation** | [**List&lt;UnderwritingConfigurationOrganizationInformationBusinessInformationOwnerInformation&gt;**](UnderwritingConfigurationOrganizationInformationBusinessInformationOwnerInformation.md) |  |  [optional]
**directorInformation** | [**List&lt;UnderwritingConfigurationOrganizationInformationBusinessInformationDirectorInformation&gt;**](UnderwritingConfigurationOrganizationInformationBusinessInformationDirectorInformation.md) |  |  [optional]



