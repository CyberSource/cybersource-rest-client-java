
# Ptsv1pullfundstransferSenderInformationConsumerAuthentication

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cavv** | **String** | Cardholder authentication verification value (CAVV).   Conditional: this field is mandatory if the transaction is using either a Visa or Visa Electron card, and if the commerce indicator is &#x3D; &#x60;VBV&#x60;.  If in hexabinary format, length of field value must be &#x3D;40.   If in base64 format, length of field must be &#x3D;28.  |  [optional]
**strongAuthentication** | [**Ptsv1pullfundstransferSenderInformationConsumerAuthenticationStrongAuthentication**](Ptsv1pullfundstransferSenderInformationConsumerAuthenticationStrongAuthentication.md) |  |  [optional]



