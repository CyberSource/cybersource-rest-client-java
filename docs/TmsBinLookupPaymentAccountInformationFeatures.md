
# TmsBinLookupPaymentAccountInformationFeatures

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountFundingSource** | **String** | This field contains the account funding source. Possible values:   - &#x60;CREDIT&#x60;   - &#x60;DEBIT&#x60;   - &#x60;PREPAID&#x60;   - &#x60;DEFERRED DEBIT&#x60;   - &#x60;CHARGE&#x60;  |  [optional]
**accountFundingSourceSubType** | **String** | This field contains the type of prepaid card. Possible values:   - &#x60;Reloadable&#x60;   - &#x60;Non-reloadable&#x60;  |  [optional]
**cardProduct** | **String** | This field contains the type of issuer product. Example values:   - Visa Classic   - Visa Signature   - Visa Infinite  |  [optional]
**messageType** | **String** | This field contains the type of BIN based authentication. Possible values:   - &#x60;S&#x60;: Single Message   - &#x60;D&#x60;: Dual Message  |  [optional]
**acceptanceLevel** | **String** | This field contains the acceptance level of the PAN. Possible values:   - &#x60;0&#x60; : Normal   - &#x60;1&#x60; : Monitor   - &#x60;2&#x60; : Refuse   - &#x60;3&#x60; : Not Allowed   - &#x60;4&#x60; : Private   - &#x60;5&#x60; : Test  |  [optional]
**cardPlatform** | **String** | This field contains the type of card platform. Possible values:   - &#x60;BUSINESS&#x60;   - &#x60;CONSUMER&#x60;   - &#x60;CORPORATE&#x60;   - &#x60;COMMERCIAL&#x60;   - &#x60;GOVERNMENT&#x60;  |  [optional]
**comboCard** | **String** | This field indicates the type of combo card. Possible values:   - 0 (Not a combo card)   - 1 (Credit and Prepaid Combo card)   - 2 (Credit and Debit Combo card)   - 3 (Prepaid Credit and Prepaid Debit combo card)  |  [optional]
**corporatePurchase** | **Boolean** | This field indicates if the instrument can be used for corporate purchasing. This field is only applicable for American Express cards. Possible values:   - &#x60;true&#x60;   - &#x60;false&#x60;  |  [optional]
**healthCard** | **Boolean** | This field indicates if the BIN is for healthcare (HSA/FSA). Currently, this field is only supported for Visa BINs. Possible values:     - &#x60;true&#x60;     - &#x60;false&#x60;  |  [optional]
**sharedBIN** | **Boolean** | This field indicates if the BIN is shared by multiple issuers Possible values:     - &#x60;true&#x60;     - &#x60;false&#x60;  |  [optional]
**posDomesticOnly** | **Boolean** | This field indicates if the BIN is valid only for POS domestic usage. Possible values:     - &#x60;true&#x60;     - &#x60;false&#x60;  |  [optional]
**gamblingAllowed** | **Boolean** | This field indicates if gambling transactions are allowed on the BIN. Possible values:     - &#x60;true&#x60;     - &#x60;false&#x60;  |  [optional]
**commercialCardLevel2** | **Boolean** | This field indicates if a transaction on the instrument qualifies for level 2 interchange rates. Possible values:     - &#x60;true&#x60;     - &#x60;false&#x60;  |  [optional]
**commercialCardLevel3** | **Boolean** | This field indicates if a transaction on the instrument qualifies for level 3 interchange rates. Possible values:     - &#x60;true&#x60;     - &#x60;false&#x60;  |  [optional]
**exemptBIN** | **Boolean** | This field indicates if a transaction on the instrument qualifies for government exempt interchange fee. Possible values:     - &#x60;true&#x60;     - &#x60;false&#x60;  |  [optional]
**accountLevelManagement** | **Boolean** | This field indicates if the BIN participates in Account Level Management (ALM). Possible values:     - &#x60;true&#x60;     - &#x60;false&#x60;  |  [optional]
**onlineGamblingBlock** | **Boolean** | This field indicates if online gambling is blocked on the BIN. Possible values:     - &#x60;true&#x60;     - &#x60;false&#x60;  |  [optional]
**autoSubstantiation** | **Boolean** | This field indicates if auto-substantiation is enabled on the BIN. Possible values:     - &#x60;true&#x60;     - &#x60;false&#x60;  |  [optional]
**flexCredential** | **Boolean** | This field indicates if the instrument is a flex credential. Possible values:     - &#x60;true&#x60;     - &#x60;false&#x60;  |  [optional]



