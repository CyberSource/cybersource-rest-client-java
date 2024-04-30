
# Boardingv1registrationsOrganizationInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationId** | **String** |  |  [optional]
**parentOrganizationId** | **String** | This field is required for Organization Types: MERCHANT, TRANSACTING  |  [optional]
**childOrganizations** | **List&lt;String&gt;** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Determines the type of organization in the hirarchy that this registration will use to onboard this Organization Possible Values:   - &#39;TRANSACTING&#39;   - &#39;STRUCTURAL&#39;   - &#39;MERCHANT&#39;  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Determines the status that the organization will be after being onboarded Possible Values:             - &#39;LIVE&#39;             - &#39;TEST&#39;             - &#39;DRAFT&#39;  |  [optional]
**configurable** | **Boolean** | This denotes the one organization, with exception to the TRANSACTING types, that is allowed to be used for configuration purposes against products.  Eventually this field will be deprecated and all organizations will be allowed for product configuration. |  [optional]
**businessInformation** | [**Boardingv1registrationsOrganizationInformationBusinessInformation**](Boardingv1registrationsOrganizationInformationBusinessInformation.md) |  | 
**KYC** | [**Boardingv1registrationsOrganizationInformationKYC**](Boardingv1registrationsOrganizationInformationKYC.md) |  |  [optional]
**owners** | [**List&lt;Boardingv1registrationsOrganizationInformationOwners&gt;**](Boardingv1registrationsOrganizationInformationOwners.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TRANSACTING | &quot;TRANSACTING&quot;
STRUCTURAL | &quot;STRUCTURAL&quot;
MERCHANT | &quot;MERCHANT&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
LIVE | &quot;LIVE&quot;
TEST | &quot;TEST&quot;
DRAFT | &quot;DRAFT&quot;



