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
 * Use this object to submit a payment network token instead of card-based values.
 */
@ApiModel(description = "Use this object to submit a payment network token instead of card-based values.")

public class Riskv1decisionsPaymentInformationTokenizedCard {
  @SerializedName("transactionType")
  private String transactionType = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  public Riskv1decisionsPaymentInformationTokenizedCard transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Type of transaction that provided the token data. This value does not specify the token service provider; it specifies the entity that provided you with information about the token.  Possible value: - &#x60;2&#x60;: Near-field communication (NFC) transaction. The customer&#39;s mobile device provided the token data for a contactless EMV transaction. For recurring transactions, use this value if the original transaction was a contactless EMV transaction.  #### Visa Platform Connect - &#x60;1&#x60;: For Rupay and In App tokenization. Example: InApp apple pay. - &#x60;3&#x60;: Card/Credential On File Tokenization.  **NOTE** No CyberSource through VisaNet acquirers support EMV at this time.  Required field for PIN debit credit or PIN debit purchase transactions that use payment network tokens; otherwise, not used.  #### Rupay - &#x60;3&#x60;: Card/Credential On File Tokenization. - &#x60;4&#x60;: Tokenizined Transaction. Should be used for Guest Checkout transactions with token. 
   * @return transactionType
  **/
  @ApiModelProperty(value = "Type of transaction that provided the token data. This value does not specify the token service provider; it specifies the entity that provided you with information about the token.  Possible value: - `2`: Near-field communication (NFC) transaction. The customer's mobile device provided the token data for a contactless EMV transaction. For recurring transactions, use this value if the original transaction was a contactless EMV transaction.  #### Visa Platform Connect - `1`: For Rupay and In App tokenization. Example: InApp apple pay. - `3`: Card/Credential On File Tokenization.  **NOTE** No CyberSource through VisaNet acquirers support EMV at this time.  Required field for PIN debit credit or PIN debit purchase transactions that use payment network tokens; otherwise, not used.  #### Rupay - `3`: Card/Credential On File Tokenization. - `4`: Tokenizined Transaction. Should be used for Guest Checkout transactions with token. ")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Riskv1decisionsPaymentInformationTokenizedCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Three-digit value that indicates the card type.  **IMPORTANT** It is strongly recommended that you include the card type field in request messages even if it is optional for your processor and card type. Omitting the card type can cause the transaction to be processed with the wrong card type.  Possible values: - &#x60;001&#x60;: Visa. Use card type value &#x60;001&#x60; for Visa Electron. - &#x60;002&#x60;: Mastercard, Eurocard[^1], which is a European regional brand of Mastercard. - &#x60;003&#x60;: American Express - &#x60;004&#x60;: Discover - &#x60;005&#x60;: Diners Club - &#x60;006&#x60;: Carte Blanche[^1] - &#x60;007&#x60;: JCB[^1] - &#x60;008&#x60;: Optima - &#x60;009&#x60;: GE Private Label - &#x60;010&#x60;: Beneficial Private Label - &#x60;011&#x60;: Twinpay Credit Card - &#x60;012&#x60;: Twinpay Debit Card - &#x60;013&#x60;: WalMart - &#x60;014&#x60;: Enroute[^1] - &#x60;015&#x60;: Lowe&#39;s Consumer - &#x60;016&#x60;: Home Depot Consumer - &#x60;017&#x60;: MBNA - &#x60;018&#x60;: Dick&#39;s Sportswear - &#x60;019&#x60;: Casual Corner - &#x60;020&#x60;: Sears - &#x60;021&#x60;: JAL[^1] - &#x60;023&#x60;: Disney Card - &#x60;024&#x60;: Maestro (UK Domestic)[^1] - &#x60;025&#x60;: Sam&#39;s Club Consumer - &#x60;026&#x60;: Sam&#39;s Club Business - &#x60;027&#x60;: Nico&#39;s - &#x60;028&#x60;: Paymentech Bill Me Later - &#x60;029&#x60;: Bebe - &#x60;030&#x60;: Restoration Hardware - &#x60;031&#x60;: Delta Online - &#x60;032&#x60;: Solo - &#x60;033&#x60;: Visa Electron[^1]. Do not use this value. Use &#x60;001&#x60; for all Visa card types. - &#x60;034&#x60;: Dankort[^1] - &#x60;035&#x60;: Laser - &#x60;036&#x60;: Cartes Bancaires[^1,4] - &#x60;037&#x60;: Carta Si[^1] - &#x60;038&#x60;: Pinless Debit - &#x60;039&#x60;: Encoded account number[^1] - &#x60;040&#x60;: UATP[^1] - &#x60;041&#x60;: HOUSEHOLD - &#x60;042&#x60;: Maestro (International)[^1] - &#x60;043&#x60;: GE MONEY - &#x60;044&#x60;: Korean Cards - &#x60;045&#x60;: Style Cards - &#x60;046&#x60;: JCrew - &#x60;047&#x60;: Payeasecn eWallet - &#x60;048&#x60;: Payeasecn Bank Transfer - &#x60;049&#x60;: Meijer - &#x60;050&#x60;: Hipercard[^2,3] - &#x60;051&#x60;: Aura - &#x60;052&#x60;: Redecard - &#x60;053&#x60;: Orico card - &#x60;054&#x60;: Elo[^3] - &#x60;055&#x60;: Capitol One Private Label - &#x60;056&#x60;: Carnet - &#x60;057&#x60;: Costco Private Label - &#x60;058&#x60;: Carnet - &#x60;059&#x60;: ValueLink - &#x60;060&#x60;: MADA - &#x60;061&#x60;: RuPay - &#x60;062&#x60;: China UnionPay - &#x60;063&#x60;: Falabella Private Label - &#x60;064&#x60;: Prompt Card - &#x60;065&#x60;: Korean Domestic - &#x60;066&#x60;: Banricompras - &#x60;067&#x60;: MEEZA - &#x60;068&#x60;: PayPak - &#x60;070&#x60;: EFTPOS - &#x60;071&#x60;: Codensa - &#x60;072&#x60;: Olimpica - &#x60;073&#x60;: Colsubsidio - &#x60;074&#x60;: Tuya - &#x60;075&#x60;: Sodexo - &#x60;076&#x60;: Naranja - &#x60;077&#x60;: Cabal - &#x60;078&#x60;: DINELCO - &#x60;079&#x60;: PANAL - &#x60;080&#x60;: EPM - &#x60;081&#x60;: Jaywan  [^1]: For this card type, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in your request for an authorization or a stand-alone credit. [^2]: For this card type on Cielo 3.0, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in a request for an authorization or a stand-alone credit. This card type is not supported on Cielo 1.5. [^3]: For this card type on Getnet and Rede, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in a request for an authorization or a stand-alone credit. [^4]: For this card type, you must include the &#x60;paymentInformation.card.type&#x60; in your request for any payer authentication services.  #### Used by **Authorization** Required for Carte Blanche and JCB. Optional for all other card types.  #### Card Present reply This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details. You must contact customer support to have your account enabled to receive these fields in the credit reply message.  Returned by the Credit service.  This reply field is only supported by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response.  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International 
   * @return type
  **/
  @ApiModelProperty(value = "Three-digit value that indicates the card type.  **IMPORTANT** It is strongly recommended that you include the card type field in request messages even if it is optional for your processor and card type. Omitting the card type can cause the transaction to be processed with the wrong card type.  Possible values: - `001`: Visa. Use card type value `001` for Visa Electron. - `002`: Mastercard, Eurocard[^1], which is a European regional brand of Mastercard. - `003`: American Express - `004`: Discover - `005`: Diners Club - `006`: Carte Blanche[^1] - `007`: JCB[^1] - `008`: Optima - `009`: GE Private Label - `010`: Beneficial Private Label - `011`: Twinpay Credit Card - `012`: Twinpay Debit Card - `013`: WalMart - `014`: Enroute[^1] - `015`: Lowe's Consumer - `016`: Home Depot Consumer - `017`: MBNA - `018`: Dick's Sportswear - `019`: Casual Corner - `020`: Sears - `021`: JAL[^1] - `023`: Disney Card - `024`: Maestro (UK Domestic)[^1] - `025`: Sam's Club Consumer - `026`: Sam's Club Business - `027`: Nico's - `028`: Paymentech Bill Me Later - `029`: Bebe - `030`: Restoration Hardware - `031`: Delta Online - `032`: Solo - `033`: Visa Electron[^1]. Do not use this value. Use `001` for all Visa card types. - `034`: Dankort[^1] - `035`: Laser - `036`: Cartes Bancaires[^1,4] - `037`: Carta Si[^1] - `038`: Pinless Debit - `039`: Encoded account number[^1] - `040`: UATP[^1] - `041`: HOUSEHOLD - `042`: Maestro (International)[^1] - `043`: GE MONEY - `044`: Korean Cards - `045`: Style Cards - `046`: JCrew - `047`: Payeasecn eWallet - `048`: Payeasecn Bank Transfer - `049`: Meijer - `050`: Hipercard[^2,3] - `051`: Aura - `052`: Redecard - `053`: Orico card - `054`: Elo[^3] - `055`: Capitol One Private Label - `056`: Carnet - `057`: Costco Private Label - `058`: Carnet - `059`: ValueLink - `060`: MADA - `061`: RuPay - `062`: China UnionPay - `063`: Falabella Private Label - `064`: Prompt Card - `065`: Korean Domestic - `066`: Banricompras - `067`: MEEZA - `068`: PayPak - `070`: EFTPOS - `071`: Codensa - `072`: Olimpica - `073`: Colsubsidio - `074`: Tuya - `075`: Sodexo - `076`: Naranja - `077`: Cabal - `078`: DINELCO - `079`: PANAL - `080`: EPM - `081`: Jaywan  [^1]: For this card type, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in your request for an authorization or a stand-alone credit. [^2]: For this card type on Cielo 3.0, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in a request for an authorization or a stand-alone credit. This card type is not supported on Cielo 1.5. [^3]: For this card type on Getnet and Rede, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in a request for an authorization or a stand-alone credit. [^4]: For this card type, you must include the `paymentInformation.card.type` in your request for any payer authentication services.  #### Used by **Authorization** Required for Carte Blanche and JCB. Optional for all other card types.  #### Card Present reply This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details. You must contact customer support to have your account enabled to receive these fields in the credit reply message.  Returned by the Credit service.  This reply field is only supported by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response.  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Riskv1decisionsPaymentInformationTokenizedCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Customer&#39;s payment network token value. 
   * @return number
  **/
  @ApiModelProperty(value = "Customer's payment network token value. ")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Riskv1decisionsPaymentInformationTokenizedCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * One of two possible meanings: - The two-digit month in which a token expires. - The two-digit month in which a card expires. Format: &#x60;MM&#x60; Possible values: &#x60;01&#x60; through &#x60;12&#x60;  **NOTE** The meaning of this field is dependent on the payment processor that is returning the value in an authorization reply. Please see the processor-specific details below.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (&#x60;01&#x60; through &#x60;12&#x60;) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (&#x60;card_type&#x3D;039&#x60;), if there is no expiration date on the card, use &#x60;12&#x60;.\\ **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Samsung Pay and Apple Pay Month in which the token expires. CyberSource includes this field in the reply message when it decrypts the payment blob for the tokenized transaction. 
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "One of two possible meanings: - The two-digit month in which a token expires. - The two-digit month in which a card expires. Format: `MM` Possible values: `01` through `12`  **NOTE** The meaning of this field is dependent on the payment processor that is returning the value in an authorization reply. Please see the processor-specific details below.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (`01` through `12`) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (`card_type=039`), if there is no expiration date on the card, use `12`.\\ **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Samsung Pay and Apple Pay Month in which the token expires. CyberSource includes this field in the reply message when it decrypts the payment blob for the tokenized transaction. ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public Riskv1decisionsPaymentInformationTokenizedCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * One of two possible meanings: - The four-digit year in which a token expires. - The four-digit year in which a card expires. Format: &#x60;YYYY&#x60; Possible values: &#x60;1900&#x60; through &#x60;3000&#x60; Data type: Non-negative integer  **NOTE** The meaning of this field is dependent on the payment processor that is returning the value in an authorization reply. Please see the processor-specific details below.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (1900 through 3000) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (&#x60;card_ type&#x3D;039&#x60;), if there is no expiration date on the card, use &#x60;2021&#x60;.  #### FDC Nashville Global and FDMS South You can send in 2 digits or 4 digits. When you send in 2 digits, they must be the last 2 digits of the year.  #### Samsung Pay and Apple Pay Year in which the token expires. CyberSource includes this field in the reply message when it decrypts the payment blob for the tokenized transaction.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return expirationYear
  **/
  @ApiModelProperty(value = "One of two possible meanings: - The four-digit year in which a token expires. - The four-digit year in which a card expires. Format: `YYYY` Possible values: `1900` through `3000` Data type: Non-negative integer  **NOTE** The meaning of this field is dependent on the payment processor that is returning the value in an authorization reply. Please see the processor-specific details below.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (1900 through 3000) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (`card_ type=039`), if there is no expiration date on the card, use `2021`.  #### FDC Nashville Global and FDMS South You can send in 2 digits or 4 digits. When you send in 2 digits, they must be the last 2 digits of the year.  #### Samsung Pay and Apple Pay Year in which the token expires. CyberSource includes this field in the reply message when it decrypts the payment blob for the tokenized transaction.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsPaymentInformationTokenizedCard riskv1decisionsPaymentInformationTokenizedCard = (Riskv1decisionsPaymentInformationTokenizedCard) o;
    return Objects.equals(this.transactionType, riskv1decisionsPaymentInformationTokenizedCard.transactionType) &&
        Objects.equals(this.type, riskv1decisionsPaymentInformationTokenizedCard.type) &&
        Objects.equals(this.number, riskv1decisionsPaymentInformationTokenizedCard.number) &&
        Objects.equals(this.expirationMonth, riskv1decisionsPaymentInformationTokenizedCard.expirationMonth) &&
        Objects.equals(this.expirationYear, riskv1decisionsPaymentInformationTokenizedCard.expirationYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, type, number, expirationMonth, expirationYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsPaymentInformationTokenizedCard {\n");
    
    if (transactionType != null) sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    if (type != null) sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (number != null) sb.append("    number: ").append(toIndentedString(number)).append("\n");
    if (expirationMonth != null) sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    if (expirationYear != null) sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
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

