
# Ptsv2paymentsidreversalsOrderInformationLineItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | [**BigDecimal**](BigDecimal.md) | For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when _orderInformation.lineItems[].productCode_ is not set to **default** or one of the other values that are related to shipping and/or handling.  |  [optional]
**unitPrice** | **String** | Per-item price of the product. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places.  For processor-specific information, see the amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. This information is covered in: - Table 12, \&quot;Authorization Information for Specific Processors,\&quot; on page 36 - Table 16, \&quot;Capture Information for Specific Processors,\&quot; on page 51 - Table 20, \&quot;Credit Information for Specific Processors,\&quot; on page 65  **DCC for First Data**\\ This value is the original amount in your local currency. You must include this field. You cannot use grand_total_amount. See \&quot;Dynamic Currency Conversion for First Data,\&quot; page 113.  **FDMS South**\\ If you accept IDR or CLP currencies, see the entry for FDMS South in Table 12, \&quot;Authorization Information for Specific Processors,\&quot; on page 36.  **Zero Amount Authorizations**\\ If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. See \&quot;Zero Amount Authorizations,\&quot; page 220.  |  [optional]



