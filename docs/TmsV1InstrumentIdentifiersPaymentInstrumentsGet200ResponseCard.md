
# TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expirationMonth** | **String** | Two-digit month in which the credit card expires. Format: &#x60;MM&#x60; Possible values: &#x60;01&#x60; through &#x60;12&#x60;  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. For more information about relaxed requirements, see the TMS REST API Developer Guide.  Important: It is your responsibility to determine whether a field is required for the transaction you are requesting.  |  [optional]
**expirationYear** | **String** | Four-digit year in which the credit card expires. Format: &#x60;YYYY&#x60;. Possible values: &#x60;1900&#x60; through &#x60;2099&#x60;.  **FDC Nashville Global and FDMS South** You can send in 2 digits or 4 digits. When you send in 2 digits, they must be the last 2 digits of the year.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See Relaxed Requirements for Address Data and Expiration Date page.  Important: It is your responsibility to determine whether a field is required for the transaction you are requesting.&#39;  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of credit card. Possible values:   * Visa (001)   * Mastercard (002) - Eurocard—European regional brand of Mastercard   * American Express (003)   * Discover (004)   * Diners Club (005)   * Carte Blanche (006)   * JCB (007)   * Optima (008)   * Twinpay Credit (011)   * Twinpay Debit (012)   * Walmart (013)   * EnRoute (014)   * Lowes consumer (015)   * Home Depot consumer (016)   * MBNA (017)   * Dicks Sportswear (018)   * Casual Corner (019)   * Sears (020)   * JAL (021)   * Disney (023)   * Maestro (024) - UK Domestic   * Sams Club consumer (025)   * Sams Club business (026)   * Nicos (027)   * Bill me later (028)   * Bebe (029)   * Restoration Hardware (030)   * Delta (031) — use this value only for Ingenico ePayments. For other processors, use 001 for all Visa card types.   * Solo (032)   * Visa Electron (033)   * Dankort (034)   * Laser (035)   * Carte Bleue (036) — formerly Cartes Bancaires   * Cartes Bancaires (036)   * Carta Si (037)   * pinless debit (038)   * encoded account (039)   * UATP (040)   * Household (041)   * Maestro (042) - International   * GE Money UK (043)   * Korean cards (044)   * Style (045)   * JCrew (046)   * PayEase China processing eWallet (047)   * PayEase China processing bank transfer (048)   * Meijer Private Label (049)   * Hipercard (050) — supported only by the Comercio Latino processor.   * Aura (051) — supported only by the Comercio Latino processor.   * Redecard (052)   * ORICO (053)   * Elo (054) — supported only by the Comercio Latino processor.   * Capital One Private Label (055)   * Synchrony Private Label (056)   * Costco Private Label (057)   * mada (060)   * China Union Pay (062)   * Falabella private label (063)  | 
**issueNumber** | **String** | Number of times a Maestro (UK Domestic) card has been issued to the account holder. |  [optional]
**startMonth** | **String** | Month of the start of the Maestro (UK Domestic) card validity period.  Format: &#x60;MM&#x60;. Possible values: &#x60;01&#x60; through &#x60;12&#x60;.  |  [optional]
**startYear** | **String** | Year of the start of the Maestro (UK Domestic) card validity period.  Format: &#x60;YYYY&#x60;. Possible values: &#x60;1900&#x60; through &#x60;2099&#x60;.  |  [optional]
**useAs** | **String** | Card Use As Field. Supported value of &#x60;pinless debit&#x60; only. Only for use with Pinless Debit tokens. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
VISA | &quot;visa&quot;
MASTERCARD | &quot;mastercard&quot;
AMERICAN_EXPRESS | &quot;american express&quot;
DISCOVER | &quot;discover&quot;
DINERS_CLUB | &quot;diners club&quot;
CARTE_BLANCHE | &quot;carte blanche&quot;
JCB | &quot;jcb&quot;
OPTIMA | &quot;optima&quot;
TWINPAY_CREDIT | &quot;twinpay credit&quot;
TWINPAY_DEBIT | &quot;twinpay debit&quot;
WALMART | &quot;walmart&quot;
ENROUTE | &quot;enroute&quot;
LOWES_CONSUMER | &quot;lowes consumer&quot;
HOME_DEPOT_CONSUMER | &quot;home depot consumer&quot;
MBNA | &quot;mbna&quot;
DICKS_SPORTSWEAR | &quot;dicks sportswear&quot;
CASUAL_CORNER | &quot;casual corner&quot;
SEARS | &quot;sears&quot;
JAL | &quot;jal&quot;
DISNEY | &quot;disney&quot;
MAESTRO_UK_DOMESTIC | &quot;maestro uk domestic&quot;
SAMS_CLUB_CONSUMER | &quot;sams club consumer&quot;
SAMS_CLUB_BUSINESS | &quot;sams club business&quot;
NICOS | &quot;nicos&quot;
BILL_ME_LATER | &quot;bill me later&quot;
BEBE | &quot;bebe&quot;
RESTORATION_HARDWARE | &quot;restoration hardware&quot;
DELTA_ONLINE | &quot;delta online&quot;
SOLO | &quot;solo&quot;
VISA_ELECTRON | &quot;visa electron&quot;
DANKORT | &quot;dankort&quot;
LASER | &quot;laser&quot;
CARTE_BLEUE | &quot;carte bleue&quot;
CARTA_SI | &quot;carta si&quot;
PINLESS_DEBIT | &quot;pinless debit&quot;
ENCODED_ACCOUNT | &quot;encoded account&quot;
UATP | &quot;uatp&quot;
HOUSEHOLD | &quot;household&quot;
MAESTRO_INTERNATIONAL | &quot;maestro international&quot;
GE_MONEY_UK | &quot;ge money uk&quot;
KOREAN_CARDS | &quot;korean cards&quot;
STYLE | &quot;style&quot;
JCREW | &quot;jcrew&quot;
PAYEASE_CHINA_PROCESSING_EWALLET | &quot;payease china processing ewallet&quot;
PAYEASE_CHINA_PROCESSING_BANK_TRANSFER | &quot;payease china processing bank transfer&quot;
MEIJER_PRIVATE_LABEL | &quot;meijer private label&quot;
HIPERCARD | &quot;hipercard&quot;
AURA | &quot;aura&quot;
REDECARD | &quot;redecard&quot;
ORICO | &quot;orico&quot;
ELO | &quot;elo&quot;
CAPITAL_ONE_PRIVATE_LABEL | &quot;capital one private label&quot;
SYNCHRONY_PRIVATE_LABEL | &quot;synchrony private label&quot;
CHINA_UNION_PAY | &quot;china union pay&quot;
COSTCO_PRIVATE_LABEL | &quot;costco private label&quot;
MADA | &quot;mada&quot;
FALABELLA_PRIVATE_LABEL | &quot;falabella private label&quot;



