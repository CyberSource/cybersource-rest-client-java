
# CommerceSolutionsProductsTokenManagementConfigurationInformationConfigurationsVault

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultTokenType** | **String** | Default token type to be used. Possible Values:   - &#39;CUSTOMER&#39;  - &#39;PAYMENT_INSTRUMENT&#39;  - &#39;INSTRUMENT_IDENTIFIER&#39;  |  [optional]
**location** | **String** | Location where the vault will be stored.  Use &#39;IDC&#39; (the Indian Data Centre) when merchant is storing token data in India  or &#39;GDC&#39; (the Global Data Centre) for all other cases.  Possible Values:    - &#39;IDC&#39;   - &#39;GDC&#39;  |  [optional]
**tokenFormats** | [**TmsTokenFormats**](TmsTokenFormats.md) |  |  [optional]
**tokenPermissions** | [**TokenPermissions**](TokenPermissions.md) |  |  [optional]
**sensitivePrivileges** | [**TmsSensitivePrivileges**](TmsSensitivePrivileges.md) |  |  [optional]
**nullify** | [**TmsNullify**](TmsNullify.md) |  |  [optional]
**networkTokenServices** | [**TmsNetworkTokenServices**](TmsNetworkTokenServices.md) |  |  [optional]



