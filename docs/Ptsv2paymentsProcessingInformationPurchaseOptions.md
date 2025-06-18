
# Ptsv2paymentsProcessingInformationPurchaseOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isElectronicBenefitsTransfer** | **Boolean** | Flag that indicates whether this transaction is an EBT transaction. Possible values: - &#x60;true&#x60; - &#x60;false&#x60;  #### PIN debit Required field for EBT and EBT voucher transactions that use PIN debit credit or PIN debit purchase; otherwise, not used.  |  [optional]
**type** | **String** | Flag that indicates an EBT voucher transaction. Possible value: - &#x60;EBT_VOUCHER&#x60;: Indicates the PIN debit transaction is an EBT voucher. - &#x60;BUY&#x60; - &#x60;RENT&#x60; - &#x60;BOOK&#x60; - &#x60;SUBSCRIBE&#x60; - &#x60;DOWNLOAD&#x60; - &#x60;ORDER&#x60; - &#x60;CONTINUE&#x60;  #### PIN debit Required field for EBT voucher transactions that use PIN debit purchase; otherwise, not used.  |  [optional]
**eligibilityIndicator** | **String** | This field contains installment data defined by MasterCard. Possible values:   - Y &#x3D; eligible   - N &#x3D; not eligile  |  [optional]
**benefitAmount** | **String** | Workplace benefit amount. |  [optional]
**benefitType** | **String** | Workplace benefit type. Possible values: - 70 &#x3D; employee benefit - 4T &#x3D; transportation / transit - 52 &#x3D; general benefit - 53 &#x3D; meal voucher - 54 &#x3D; fuel - 55 &#x3D; ecological / sustainability - 58 &#x3D; philanthropy / patronage / consumption - 59 &#x3D; gift - 5S &#x3D; sport / culture - 5T &#x3D; book / education  |  [optional]



