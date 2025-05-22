
# Ptsv2paymentreferencesBuyerInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateOfBirth** | **String** | Recipient&#39;s date of birth. **Format**: &#x60;YYYYMMDD&#x60;.  This field is a &#x60;pass-through&#x60;, which means that CyberSource ensures that the value is eight numeric characters but otherwise does not verify the value or modify it in any way before sending it to the processor. If the field is not required for the transaction, CyberSource does not forward it to the processor.  |  [optional]
**gender** | **String** | Customer&#39;s gender. Possible values are F (female), M (male),O (other). |  [optional]
**language** | **String** | language setting of the user.  Supports 2-character language codes (e.g., en, fr) and 5-character locale values (e.g., en-US, fr-CA).  |  [optional]
**noteToSeller** | **String** | Note to the recipient of the funds in this transaction |  [optional]
**personalIdentification** | [**List&lt;Ptsv2paymentsidcapturesBuyerInformationPersonalIdentification&gt;**](Ptsv2paymentsidcapturesBuyerInformationPersonalIdentification.md) |  |  [optional]



