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
 * PtsV2PaymentsPost201ResponsePaymentAccountInformationCard
 */

public class PtsV2PaymentsPost201ResponsePaymentAccountInformationCard {
  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("hashedNumber")
  private String hashedNumber = null;

  public PtsV2PaymentsPost201ResponsePaymentAccountInformationCard suffix(String suffix) {
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

  public PtsV2PaymentsPost201ResponsePaymentAccountInformationCard expirationMonth(String expirationMonth) {
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

  public PtsV2PaymentsPost201ResponsePaymentAccountInformationCard expirationYear(String expirationYear) {
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

  public PtsV2PaymentsPost201ResponsePaymentAccountInformationCard type(String type) {
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

  public PtsV2PaymentsPost201ResponsePaymentAccountInformationCard prefix(String prefix) {
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

  public PtsV2PaymentsPost201ResponsePaymentAccountInformationCard hashedNumber(String hashedNumber) {
    this.hashedNumber = hashedNumber;
    return this;
  }

   /**
   * #### Visa Platform Connect This API field will contain the SHA 256 hashed value of PAN. 
   * @return hashedNumber
  **/
  @ApiModelProperty(value = "#### Visa Platform Connect This API field will contain the SHA 256 hashed value of PAN. ")
  public String getHashedNumber() {
    return hashedNumber;
  }

  public void setHashedNumber(String hashedNumber) {
    this.hashedNumber = hashedNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentAccountInformationCard ptsV2PaymentsPost201ResponsePaymentAccountInformationCard = (PtsV2PaymentsPost201ResponsePaymentAccountInformationCard) o;
    return Objects.equals(this.suffix, ptsV2PaymentsPost201ResponsePaymentAccountInformationCard.suffix) &&
        Objects.equals(this.expirationMonth, ptsV2PaymentsPost201ResponsePaymentAccountInformationCard.expirationMonth) &&
        Objects.equals(this.expirationYear, ptsV2PaymentsPost201ResponsePaymentAccountInformationCard.expirationYear) &&
        Objects.equals(this.type, ptsV2PaymentsPost201ResponsePaymentAccountInformationCard.type) &&
        Objects.equals(this.prefix, ptsV2PaymentsPost201ResponsePaymentAccountInformationCard.prefix) &&
        Objects.equals(this.hashedNumber, ptsV2PaymentsPost201ResponsePaymentAccountInformationCard.hashedNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suffix, expirationMonth, expirationYear, type, prefix, hashedNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentAccountInformationCard {\n");
    
    if (suffix != null) sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    if (expirationMonth != null) sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    if (expirationYear != null) sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    if (type != null) sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (prefix != null) sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    if (hashedNumber != null) sb.append("    hashedNumber: ").append(toIndentedString(hashedNumber)).append("\n");
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

