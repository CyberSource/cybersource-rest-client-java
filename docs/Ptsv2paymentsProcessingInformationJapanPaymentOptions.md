
# Ptsv2paymentsProcessingInformationJapanPaymentOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentMethod** | **String** | This value is a 2-digit code indicating the payment method. Use Payment Method Code value that applies to the tranasction. - 10 (One-time payment) - 21, 22, 23, 24  (Bonus(one-time)payment) - 61 (Installment payment) - 31, 32, 33, 34  (Integrated (Bonus + Installment)payment) - 80 (Revolving payment)  |  [optional]
**bonuses** | [**List&lt;Ptsv2paymentsProcessingInformationJapanPaymentOptionsBonuses&gt;**](Ptsv2paymentsProcessingInformationJapanPaymentOptionsBonuses.md) | An array of objects, each of which contains a bonus month and bonus amount.  Length of bonuses array is equal to the number of bonuses.  Max length &#x3D; 6.  In case of bonus month and amount not specified, null objects to be returned in the array. Example: bonuses : [ {\&quot;month\&quot;: \&quot;1\&quot;,\&quot;amount\&quot;: \&quot;200\&quot;}, {\&quot;month\&quot;: \&quot;3\&quot;,\&quot;amount\&quot;: \&quot;2500\&quot;}, null]  |  [optional]
**preapprovalType** | **String** | This will contain the details of the kind of transaction that has been processe. Used only for Japan. Possible Values: - 0 &#x3D; Normal (authorization with amount and clearing/settlement; data capture or paper draft) - 1 &#x3D; Negative card authorization (authorization-only with 0 or 1 amount) - 2 &#x3D; Reservation of authorization (authorization-only with amount) - 3 &#x3D; Cancel transaction - 4 &#x3D; Merchant-initiated reversal/refund transactions - 5 &#x3D; Cancel reservation of authorization - 6 &#x3D; Post authorization  |  [optional]
**installments** | **String** | Number of Installments.  |  [optional]
**terminalId** | **String** | Unique Japan Credit Card Association (JCCA) terminal identifier.  The difference between this field and the &#x60;pointOfSaleInformation.terminalID&#x60; field is that you can define &#x60;pointOfSaleInformation.terminalID&#x60;, but &#x60;processingInformation.japanPaymentOptions.terminalId&#x60; is defined by the JCCA and is used only in Japan.  This field is supported only on CyberSource through VisaNet and JCN Gateway.  Optional field.  |  [optional]
**firstBillingMonth** | **String** | Billing month in MM format.  |  [optional]
**businessName** | **String** | Business name in Japanese characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet.  |  [optional]
**businessNameKatakana** | **String** | Business name in Katakana characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet.  |  [optional]
**jis2TrackData** | **String** | Japanese Industrial Standard Type 2 (JIS2) track data from the front of the card.  This field is supported only on CyberSource through VisaNet and JCN Gateway.  Optional field.  |  [optional]
**businessNameAlphaNumeric** | **String** | Business name in alphanumeric characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet.  |  [optional]



