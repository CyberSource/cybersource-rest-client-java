
# TssV2TransactionsGet200ResponseOrderInformationLineItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productCode** | **String** | Type of product. This value is used to determine the category that the product is in: electronic, handling, physical, service, or shipping. The default value is **default**.  For a payment, when you set this field to a value other than default or any of the values related to shipping and handling, below fields _quantity_, _productName_, and _productSKU_ are required.  |  [optional]
**productName** | **String** | For PAYMENT and CAPTURE API, this field is required when above _productCode_ is not **default** or one of the values related to shipping and handling.  |  [optional]
**productSku** | **String** | Identification code for the product. For PAYMENT and CAPTURE API, this field is required when above _productCode_ is not **default** or one of the values related to shipping and/or handling.  |  [optional]
**taxAmount** | **String** | Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:  1. You include each line item in your request. ..- 1st line item has amount&#x3D;10.00, quantity&#x3D;1, and taxAmount&#x3D;0.80 ..- 2nd line item has amount&#x3D;20.00, quantity&#x3D;1, and taxAmount&#x3D;1.60 2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  This field is frequently used for Level II and Level III transactions.  |  [optional]
**quantity** | [**BigDecimal**](BigDecimal.md) | For a payment or capture, this field is required when _productCode_ is not **default** or one of the values related to shipping and handling.  |  [optional]
**unitPrice** | **String** | Per-item price of the product. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places.  For processor-specific information, see the amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**fulfillmentType** | **String** | The description for this field is not available. |  [optional]



