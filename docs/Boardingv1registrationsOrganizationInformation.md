
# Boardingv1registrationsOrganizationInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationId** | **String** |  |  [optional]
**parentOrganizationId** | **String** | This field is required for Organization Types: MERCHANT, TRANSACTING  |  [optional]
**childOrganizations** | **List&lt;String&gt;** |  |  [optional]
**type** | **String** | Determines the type of organization in the hirarchy that this registration will use to onboard this Organization Possible Values:   - &#39;TRANSACTING&#39;   - &#39;STRUCTURAL&#39;   - &#39;MERCHANT&#39;  |  [optional]
**status** | **String** | Determines the status that the organization will be after being onboarded Possible Values:             - &#39;LIVE&#39;             - &#39;TEST&#39;             - &#39;DRAFT&#39;  |  [optional]
**configurable** | **Boolean** | This denotes the one organization, with exception to the TRANSACTING types, that is allowed to be used for configuration purposes against products.  Eventually this field will be deprecated and all organizations will be allowed for product configuration. |  [optional]
**businessInformation** | [**Boardingv1registrationsOrganizationInformationBusinessInformation**](Boardingv1registrationsOrganizationInformationBusinessInformation.md) |  | 
**KYC** | [**Boardingv1registrationsOrganizationInformationKYC**](Boardingv1registrationsOrganizationInformationKYC.md) |  |  [optional]
**owners** | [**List&lt;Boardingv1registrationsOrganizationInformationOwners&gt;**](Boardingv1registrationsOrganizationInformationOwners.md) |  |  [optional]



