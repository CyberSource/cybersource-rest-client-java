
# Ucv1sessionsDataInstallmentInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sequence** | **Integer** | Installment number when making payments in installments. Used along with &#x60;totalCount&#x60; to track which payment is being processed.  For example, the second of 5 payments would be passed to CyberSource as &#x60;sequence&#x60; &#x3D; 2 and &#x60;totalCount&#x60; &#x3D; 5.  #### Chase Paymentech Solutions and FDC Compass This field is optional because this value is required in the merchant descriptors.  #### CyberSource through VisaNet When you do not include this field in a request for a Crediario installment payment, CyberSource sends a value of 0 to the processor.  For Crediario installment payments, the value for this field corresponds to the following data in the TC 33 capture file*: - Record: CP01 TCR9 - Position: 38-40 - Field: Installment Payment Number  * The TC 33 Capture file contains information about the purchases and refunds that a merchant submits to CyberSource. CyberSource through VisaNet creates the TC 33 Capture file at the end of the day and sends it to the merchant&#39;s acquirer, who uses this information to facilitate end-of-day clearing processing with payment card companies.  |  [optional]



