
# V2paymentsOrderInformationBillTo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **String** | Customerâ€™s first name. This name must be the same as the name on the card.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the customer_firstname field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**lastName** | **String** | Customerâ€™s last name. This name must be the same as the name on the card.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the customer_lastname field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**middleName** | **String** | Customerâ€™s middle name.  |  [optional]
**nameSuffix** | **String** | Customerâ€™s name suffix.  |  [optional]
**title** | **String** | Title.  |  [optional]
**company** | **String** | Name of the customerâ€™s company.  For processor-specific information, see the company_name field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**address1** | **String** | First line of the billing street address as it appears on the credit card issuerâ€™s records.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_address1 field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**address2** | **String** | Additional address information.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_address2 field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**locality** | **String** | City of the billing address.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_city field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**administrativeArea** | **String** | State or province of the billing address. Use the State, Province, and Territory Codes for the United States and Canada.  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_state field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**postalCode** | **String** | Postal code for the billing address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  For Payouts: This field may be sent only for FDC Compass.  For processor-specific information, see the bill_zip field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**country** | **String** | Country of the billing address. Use the two-character ISO Standard Country Codes.  For processor-specific information, see the bill_country field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**district** | **String** | Customerâ€™s neighborhood, community, or region (a barrio in Brazil) within the city or municipality. This field is available only on **Cielo**.  |  [optional]
**buildingNumber** | **String** | Building number in the street address.  This field is supported only for:  - Cielo transactions.  - Redecard customer validation with CyberSource Latin American Processing.  |  [optional]
**email** | **String** | Customer&#39;s email address, including the full domain name.  For processor-specific information, see the customer_email field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**phoneNumber** | **String** | Customerâ€™s phone number.  For Payouts: This field may be sent only for FDC Compass.  CyberSource recommends that you include the country code when the order is from outside the U.S.  For processor-specific information, see the customer_phone field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**phoneType** | [**PhoneTypeEnum**](#PhoneTypeEnum) | Customer&#39;s phone number type.  For Payouts: This field may be sent only for FDC Compass.  Possible Values -  * day * home * night * work  |  [optional]


<a name="PhoneTypeEnum"></a>
## Enum: PhoneTypeEnum
Name | Value
---- | -----
DAY | &quot;day&quot;
HOME | &quot;home&quot;
NIGHT | &quot;night&quot;
WORK | &quot;work&quot;



