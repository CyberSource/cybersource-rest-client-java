/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsGet200ResponsePaymentInformationCard
 */

public class TssV2TransactionsGet200ResponsePaymentInformationCard {
  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  @SerializedName("startMonth")
  private String startMonth = null;

  @SerializedName("startYear")
  private String startYear = null;

  @SerializedName("issueNumber")
  private String issueNumber = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("brandName")
  private String brandName = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("accountEncoderId")
  private String accountEncoderId = null;

  @SerializedName("useAs")
  private String useAs = null;

  public TssV2TransactionsGet200ResponsePaymentInformationCard suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Last four digits of the cardholder&#39;s account number. This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details.  You must contact customer support to have your account enabled to receive these fields in the credit reply message.  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response.  #### PIN debit This field is returned only for tokenized transactions. You can use this value on the receipt that you give to the cardholder.  Returned by PIN debit credit and PIN debit purchase.  This field is supported only by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX 
   * @return suffix
  **/
  @ApiModelProperty(value = "Last four digits of the cardholder's account number. This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details.  You must contact customer support to have your account enabled to receive these fields in the credit reply message.  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response.  #### PIN debit This field is returned only for tokenized transactions. You can use this value on the receipt that you give to the cardholder.  Returned by PIN debit credit and PIN debit purchase.  This field is supported only by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX ")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationCard prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Bank Identification Number (BIN). This is the initial four to six numbers on a credit card account number.  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response. 
   * @return prefix
  **/
  @ApiModelProperty(value = "Bank Identification Number (BIN). This is the initial four to six numbers on a credit card account number.  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response. ")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Two-digit month in which the payment card expires.  Format: &#x60;MM&#x60;.  Valid values: &#x60;01&#x60; through &#x60;12&#x60;. Leading 0 is required.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (&#x60;01&#x60; through &#x60;12&#x60;) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (_type_&#x3D;039), if there is no expiration date on the card, use &#x60;12&#x60;.  #### FDMS Nashville Required field.  #### All other processors Required if &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;. However, this field is optional if your account is configured for relaxed requirements for address data and expiration date. **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response. 
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "Two-digit month in which the payment card expires.  Format: `MM`.  Valid values: `01` through `12`. Leading 0 is required.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (`01` through `12`) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (_type_=039), if there is no expiration date on the card, use `12`.  #### FDMS Nashville Required field.  #### All other processors Required if `pointOfSaleInformation.entryMode=keyed`. However, this field is optional if your account is configured for relaxed requirements for address data and expiration date. **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response. ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four-digit year in which the payment card expires.  Format: &#x60;YYYY&#x60;.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (&#x60;1900&#x60; through &#x60;3000&#x60;) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (**_type_**&#x60;&#x3D;039&#x60;), if there is no expiration date on the card, use &#x60;2021&#x60;.  #### FDMS Nashville Required field.  #### FDC Nashville Global and FDMS South You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  #### All other processors Required if &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;. However, this field is optional if your account is configured for relaxed requirements for address data and expiration date. **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response. 
   * @return expirationYear
  **/
  @ApiModelProperty(value = "Four-digit year in which the payment card expires.  Format: `YYYY`.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (`1900` through `3000`) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (**_type_**`=039`), if there is no expiration date on the card, use `2021`.  #### FDMS Nashville Required field.  #### FDC Nashville Global and FDMS South You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  #### All other processors Required if `pointOfSaleInformation.entryMode=keyed`. However, this field is optional if your account is configured for relaxed requirements for address data and expiration date. **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response. ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationCard startMonth(String startMonth) {
    this.startMonth = startMonth;
    return this;
  }

   /**
   * Month of the start of the Maestro (UK Domestic) card validity period. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card. &#x60;Format: MM&#x60;. Possible values: 01 through 12.  **Note** The start date is not required for Maestro (UK Domestic) transactions. 
   * @return startMonth
  **/
  @ApiModelProperty(value = "Month of the start of the Maestro (UK Domestic) card validity period. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card. `Format: MM`. Possible values: 01 through 12.  **Note** The start date is not required for Maestro (UK Domestic) transactions. ")
  public String getStartMonth() {
    return startMonth;
  }

  public void setStartMonth(String startMonth) {
    this.startMonth = startMonth;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationCard startYear(String startYear) {
    this.startYear = startYear;
    return this;
  }

   /**
   * Year of the start of the Maestro (UK Domestic) card validity period. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card. &#x60;Format: YYYY&#x60;.  **Note** The start date is not required for Maestro (UK Domestic) transactions. 
   * @return startYear
  **/
  @ApiModelProperty(value = "Year of the start of the Maestro (UK Domestic) card validity period. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card. `Format: YYYY`.  **Note** The start date is not required for Maestro (UK Domestic) transactions. ")
  public String getStartYear() {
    return startYear;
  }

  public void setStartYear(String startYear) {
    this.startYear = startYear;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationCard issueNumber(String issueNumber) {
    this.issueNumber = issueNumber;
    return this;
  }

   /**
   * Number of times a Maestro (UK Domestic) card has been issued to the account holder. The card might or might not have an issue number. The number can consist of one or two digits, and the first digit might be a zero. When you include this value in your request, include exactly what is printed on the card. A value of 2 is different than a value of 02. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card.  **Note** The issue number is not required for Maestro (UK Domestic) transactions. 
   * @return issueNumber
  **/
  @ApiModelProperty(value = "Number of times a Maestro (UK Domestic) card has been issued to the account holder. The card might or might not have an issue number. The number can consist of one or two digits, and the first digit might be a zero. When you include this value in your request, include exactly what is printed on the card. A value of 2 is different than a value of 02. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card.  **Note** The issue number is not required for Maestro (UK Domestic) transactions. ")
  public String getIssueNumber() {
    return issueNumber;
  }

  public void setIssueNumber(String issueNumber) {
    this.issueNumber = issueNumber;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Three-digit value that indicates the card type.  **IMPORTANT** It is strongly recommended that you include the card type field in request messages even if it is optional for your processor and card type. Omitting the card type can cause the transaction to be processed with the wrong card type.  Possible values: - &#x60;001&#x60;: Visa. Use card type value &#x60;001&#x60; for Visa Electron. - &#x60;002&#x60;: Mastercard, Eurocard[^1], which is a European regional brand of Mastercard. - &#x60;003&#x60;: American Express - &#x60;004&#x60;: Discover - &#x60;005&#x60;: Diners Club - &#x60;006&#x60;: Carte Blanche[^1] - &#x60;007&#x60;: JCB[^1] - &#x60;014&#x60;: Enroute[^1] - &#x60;021&#x60;: JAL[^1] - &#x60;024&#x60;: Maestro (UK Domestic)[^1] - &#x60;033&#x60;: Visa Electron[^1]. Do not use this value. Use &#x60;001&#x60; for all Visa card types. - &#x60;034&#x60;: Dankort[^1] - &#x60;036&#x60;: Cartes Bancaires[^1,4] - &#x60;037&#x60;: Carta Si[^1] - &#x60;039&#x60;: Encoded account number[^1] - &#x60;040&#x60;: UATP[^1] - &#x60;042&#x60;: Maestro (International)[^1] - &#x60;050&#x60;: Hipercard[^2,3] - &#x60;051&#x60;: Aura - &#x60;054&#x60;: Elo[^3] - &#x60;062&#x60;: China UnionPay - &#39;070&#39;: EFTPOS  [^1]: For this card type, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in your request for an authorization or a stand-alone credit. [^2]: For this card type on Cielo 3.0, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in a request for an authorization or a stand-alone credit. This card type is not supported on Cielo 1.5. [^3]: For this card type on Getnet and Rede, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in a request for an authorization or a stand-alone credit. [^4]: For this card type, you must include the &#x60;paymentInformation.card.type&#x60; in your request for any payer authentication services.  #### Used by **Authorization** Required for Carte Blanche and JCB. Optional for all other card types.  #### Card Present reply This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details. You must contact customer support to have your account enabled to receive these fields in the credit reply message.  Returned by the Credit service.  This reply field is only supported by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response.  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International 
   * @return type
  **/
  @ApiModelProperty(value = "Three-digit value that indicates the card type.  **IMPORTANT** It is strongly recommended that you include the card type field in request messages even if it is optional for your processor and card type. Omitting the card type can cause the transaction to be processed with the wrong card type.  Possible values: - `001`: Visa. Use card type value `001` for Visa Electron. - `002`: Mastercard, Eurocard[^1], which is a European regional brand of Mastercard. - `003`: American Express - `004`: Discover - `005`: Diners Club - `006`: Carte Blanche[^1] - `007`: JCB[^1] - `014`: Enroute[^1] - `021`: JAL[^1] - `024`: Maestro (UK Domestic)[^1] - `033`: Visa Electron[^1]. Do not use this value. Use `001` for all Visa card types. - `034`: Dankort[^1] - `036`: Cartes Bancaires[^1,4] - `037`: Carta Si[^1] - `039`: Encoded account number[^1] - `040`: UATP[^1] - `042`: Maestro (International)[^1] - `050`: Hipercard[^2,3] - `051`: Aura - `054`: Elo[^3] - `062`: China UnionPay - '070': EFTPOS  [^1]: For this card type, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in your request for an authorization or a stand-alone credit. [^2]: For this card type on Cielo 3.0, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in a request for an authorization or a stand-alone credit. This card type is not supported on Cielo 1.5. [^3]: For this card type on Getnet and Rede, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in a request for an authorization or a stand-alone credit. [^4]: For this card type, you must include the `paymentInformation.card.type` in your request for any payer authentication services.  #### Used by **Authorization** Required for Carte Blanche and JCB. Optional for all other card types.  #### Card Present reply This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details. You must contact customer support to have your account enabled to receive these fields in the credit reply message.  Returned by the Credit service.  This reply field is only supported by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response.  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationCard brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

   /**
   * This field contains the card brand name.   Some of the possible values (not an exhaustive list) are -    - VISA   - MASTERCARD   - AMERICAN EXPRESS   - DISCOVER   - DINERS CLUB   - CARTE BLANCHE   - JCB   - OPTIMA   - TWINPAY CREDIT CARD   - TWINPAY DEBIT CARD   - WALMART   - ENROUTE   - LOWES CONSUMER   - HOME DEPOT CONSUMER   - MBNA   - DICKS SPORTWEAR   - CASUAL CORNER   - SEARS   - JAL   - DISNEY CARD   - SWITCH/SOLO   - SAMS CLUB CONSUMER   - SAMS CLUB BUSINESS   - NICOS HOUSE CARD   - BEBE   - RESTORATION HARDWARE   - DELTA ONLINE   - SOLO   - VISA ELECTRON   - DANKORT   - LASER   - CARTE BANCAIRE   - CARTA SI   - ENCODED ACCOUNT   - UATP   - HOUSEHOLD   - MAESTRO   - GE CAPITAL   - KOREAN CARDS   - STYLE CARDS   - JCREW   - MEIJER   - HIPERCARD   - AURA   - REDECARD   - ORICO HOUSE CARD   - ELO   - CAPITAL ONE PRIVATE LABEL   - CARNET   - RUPAY   - CHINA UNION PAY   - FALABELLA PRIVATE LABEL   - PROMPTCARD   - KOREAN DOMESTIC   - BANRICOMPRAS 
   * @return brandName
  **/
  @ApiModelProperty(value = "This field contains the card brand name.   Some of the possible values (not an exhaustive list) are -    - VISA   - MASTERCARD   - AMERICAN EXPRESS   - DISCOVER   - DINERS CLUB   - CARTE BLANCHE   - JCB   - OPTIMA   - TWINPAY CREDIT CARD   - TWINPAY DEBIT CARD   - WALMART   - ENROUTE   - LOWES CONSUMER   - HOME DEPOT CONSUMER   - MBNA   - DICKS SPORTWEAR   - CASUAL CORNER   - SEARS   - JAL   - DISNEY CARD   - SWITCH/SOLO   - SAMS CLUB CONSUMER   - SAMS CLUB BUSINESS   - NICOS HOUSE CARD   - BEBE   - RESTORATION HARDWARE   - DELTA ONLINE   - SOLO   - VISA ELECTRON   - DANKORT   - LASER   - CARTE BANCAIRE   - CARTA SI   - ENCODED ACCOUNT   - UATP   - HOUSEHOLD   - MAESTRO   - GE CAPITAL   - KOREAN CARDS   - STYLE CARDS   - JCREW   - MEIJER   - HIPERCARD   - AURA   - REDECARD   - ORICO HOUSE CARD   - ELO   - CAPITAL ONE PRIVATE LABEL   - CARNET   - RUPAY   - CHINA UNION PAY   - FALABELLA PRIVATE LABEL   - PROMPTCARD   - KOREAN DOMESTIC   - BANRICOMPRAS ")
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationCard currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * This field indicates the 3-letter [ISO Standard Currency Codes](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf) for the card currency. 
   * @return currency
  **/
  @ApiModelProperty(value = "This field indicates the 3-letter [ISO Standard Currency Codes](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf) for the card currency. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationCard accountEncoderId(String accountEncoderId) {
    this.accountEncoderId = accountEncoderId;
    return this;
  }

   /**
   * Identifier for the issuing bank that provided the customer&#39;s encoded account number. Contact your processor for the bank&#39;s ID. 
   * @return accountEncoderId
  **/
  @ApiModelProperty(value = "Identifier for the issuing bank that provided the customer's encoded account number. Contact your processor for the bank's ID. ")
  public String getAccountEncoderId() {
    return accountEncoderId;
  }

  public void setAccountEncoderId(String accountEncoderId) {
    this.accountEncoderId = accountEncoderId;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationCard useAs(String useAs) {
    this.useAs = useAs;
    return this;
  }

   /**
   * Flag that specifies the type of account associated with the card.  This field is available only for China UnionPay, Cielo, Comercio Latino and Visa Platform Connect. The cardholder provides this information during the payment process.  This field is required for:  - Debit transactions on Cielo and Comercio Latino.  - Transactions with Brazilian-issued cards on CyberSource through VisaNet.  **China UnionPayCard Transactions on China UnionPay:** Possible values:  - C: Domestic credit card  - D: Domestic debit card  - F: International credit card  - I: International debit card  When the value is D, the e-commerce indicator and CAVV fields must be included in the authorization request. When the value is C, F or I the card verification number, expiration month and expiration year fields must in included in the authorization request.  **Cielo and Comercio Latino Credit Card Transactions:** On these processors, this field is supported only for authorizations.  Possible values:  - CR: Credit card  - DB: Debit card       **Visa Platform Connect Credit Card Transactions:** This field is supported for all card types on Visa Platform Connect. For combo **card present** transactions with Mastercard on Brazilian-issued cards, possible values:  - CR: Credit card  - DB: Debit Card  For combo **card not present** transactions with Mastercard on Brazilian-issued cards, possible values:  - C: Credit card  - D: Debit card  A value of CR or DB in the useAs field takes precedence over any value in the Source Account Type field. 
   * @return useAs
  **/
  @ApiModelProperty(value = "Flag that specifies the type of account associated with the card.  This field is available only for China UnionPay, Cielo, Comercio Latino and Visa Platform Connect. The cardholder provides this information during the payment process.  This field is required for:  - Debit transactions on Cielo and Comercio Latino.  - Transactions with Brazilian-issued cards on CyberSource through VisaNet.  **China UnionPayCard Transactions on China UnionPay:** Possible values:  - C: Domestic credit card  - D: Domestic debit card  - F: International credit card  - I: International debit card  When the value is D, the e-commerce indicator and CAVV fields must be included in the authorization request. When the value is C, F or I the card verification number, expiration month and expiration year fields must in included in the authorization request.  **Cielo and Comercio Latino Credit Card Transactions:** On these processors, this field is supported only for authorizations.  Possible values:  - CR: Credit card  - DB: Debit card       **Visa Platform Connect Credit Card Transactions:** This field is supported for all card types on Visa Platform Connect. For combo **card present** transactions with Mastercard on Brazilian-issued cards, possible values:  - CR: Credit card  - DB: Debit Card  For combo **card not present** transactions with Mastercard on Brazilian-issued cards, possible values:  - C: Credit card  - D: Debit card  A value of CR or DB in the useAs field takes precedence over any value in the Source Account Type field. ")
  public String getUseAs() {
    return useAs;
  }

  public void setUseAs(String useAs) {
    this.useAs = useAs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePaymentInformationCard tssV2TransactionsGet200ResponsePaymentInformationCard = (TssV2TransactionsGet200ResponsePaymentInformationCard) o;
    return Objects.equals(this.suffix, tssV2TransactionsGet200ResponsePaymentInformationCard.suffix) &&
        Objects.equals(this.prefix, tssV2TransactionsGet200ResponsePaymentInformationCard.prefix) &&
        Objects.equals(this.expirationMonth, tssV2TransactionsGet200ResponsePaymentInformationCard.expirationMonth) &&
        Objects.equals(this.expirationYear, tssV2TransactionsGet200ResponsePaymentInformationCard.expirationYear) &&
        Objects.equals(this.startMonth, tssV2TransactionsGet200ResponsePaymentInformationCard.startMonth) &&
        Objects.equals(this.startYear, tssV2TransactionsGet200ResponsePaymentInformationCard.startYear) &&
        Objects.equals(this.issueNumber, tssV2TransactionsGet200ResponsePaymentInformationCard.issueNumber) &&
        Objects.equals(this.type, tssV2TransactionsGet200ResponsePaymentInformationCard.type) &&
        Objects.equals(this.brandName, tssV2TransactionsGet200ResponsePaymentInformationCard.brandName) &&
        Objects.equals(this.currency, tssV2TransactionsGet200ResponsePaymentInformationCard.currency) &&
        Objects.equals(this.accountEncoderId, tssV2TransactionsGet200ResponsePaymentInformationCard.accountEncoderId) &&
        Objects.equals(this.useAs, tssV2TransactionsGet200ResponsePaymentInformationCard.useAs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suffix, prefix, expirationMonth, expirationYear, startMonth, startYear, issueNumber, type, brandName, currency, accountEncoderId, useAs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePaymentInformationCard {\n");
    
    if (suffix != null) sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    if (prefix != null) sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    if (expirationMonth != null) sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    if (expirationYear != null) sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    if (startMonth != null) sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
    if (startYear != null) sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
    if (issueNumber != null) sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
    if (type != null) sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (brandName != null) sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    if (currency != null) sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    if (accountEncoderId != null) sb.append("    accountEncoderId: ").append(toIndentedString(accountEncoderId)).append("\n");
    if (useAs != null) sb.append("    useAs: ").append(toIndentedString(useAs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      // return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

