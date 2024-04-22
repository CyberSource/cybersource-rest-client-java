
# TmsEmbeddedInstrumentIdentifierTokenProvisioningInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consumerConsentObtained** | **Boolean** | Flag that indicates whether the user consented to the tokenization of their credentials. Required for card network tokenization in certain markets, such as India. Possible Values: - &#x60;true&#x60;: Consumer has consented to tokenization of their credentials. - &#x60;false&#x60;: Consumer has not consented to tokenization of their credentials.  |  [optional]
**multiFactorAuthenticated** | **Boolean** | Flag that indicates whether AFA (Additional Factor of Authentication) for the PAN was completed. Required for card network tokenization in certain markets, such as India. Possible Values: - &#x60;true&#x60;: Consumer has been authenticated by the issuer. - &#x60;false&#x60;: Consumer has not been authenticated by the issuer.  |  [optional]



