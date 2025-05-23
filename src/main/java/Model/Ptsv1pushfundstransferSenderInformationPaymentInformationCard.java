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
 * Ptsv1pushfundstransferSenderInformationPaymentInformationCard
 */

public class Ptsv1pushfundstransferSenderInformationPaymentInformationCard {
  @SerializedName("type")
  private String type = null;

  @SerializedName("securityCode")
  private String securityCode = null;

  @SerializedName("sourceAccountType")
  private String sourceAccountType = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  public Ptsv1pushfundstransferSenderInformationPaymentInformationCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Three-digit value that indicates the card type.  IMPORTANT It is strongly recommended that you include the card type field in request messages even if it is optional for your processor and card type. Omitting the card type can cause the transaction to be processed with the wrong card type.  Possible values: - &#x60;001&#x60;: Visa. For card-present transactions on all processors except SIX, the Visa Electron card type is processed the same way that the Visa debit card is processed. Use card type value 001 for Visa Electron. - &#x60;002&#x60;: Mastercard, Eurocard[^1], which is a European regional brand of Mastercard. - &#x60;033&#x60;: Visa Electron - &#x60;024&#x60;: Maestro - &#x60;042&#x60;: Maestro International 
   * @return type
  **/
  @ApiModelProperty(value = "Three-digit value that indicates the card type.  IMPORTANT It is strongly recommended that you include the card type field in request messages even if it is optional for your processor and card type. Omitting the card type can cause the transaction to be processed with the wrong card type.  Possible values: - `001`: Visa. For card-present transactions on all processors except SIX, the Visa Electron card type is processed the same way that the Visa debit card is processed. Use card type value 001 for Visa Electron. - `002`: Mastercard, Eurocard[^1], which is a European regional brand of Mastercard. - `033`: Visa Electron - `024`: Maestro - `042`: Maestro International ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv1pushfundstransferSenderInformationPaymentInformationCard securityCode(String securityCode) {
    this.securityCode = securityCode;
    return this;
  }

   /**
   * 3-digit value that indicates the card Cvv2Value. Values can be 0-9. 
   * @return securityCode
  **/
  @ApiModelProperty(value = "3-digit value that indicates the card Cvv2Value. Values can be 0-9. ")
  public String getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }

  public Ptsv1pushfundstransferSenderInformationPaymentInformationCard sourceAccountType(String sourceAccountType) {
    this.sourceAccountType = sourceAccountType;
    return this;
  }

   /**
   * Flag that specifies the type of account associated with the card. The cardholder provides this information during the payment process. 
   * @return sourceAccountType
  **/
  @ApiModelProperty(value = "Flag that specifies the type of account associated with the card. The cardholder provides this information during the payment process. ")
  public String getSourceAccountType() {
    return sourceAccountType;
  }

  public void setSourceAccountType(String sourceAccountType) {
    this.sourceAccountType = sourceAccountType;
  }

  public Ptsv1pushfundstransferSenderInformationPaymentInformationCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The customer&#39;s payment card number, also known as the Primary Account Number (PAN). 
   * @return number
  **/
  @ApiModelProperty(value = "The customer's payment card number, also known as the Primary Account Number (PAN). ")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Ptsv1pushfundstransferSenderInformationPaymentInformationCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Two-digit month in which the payment card expires.  Format: MM.  Valid values: 01 through 12. Leading 0 is required. 
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "Two-digit month in which the payment card expires.  Format: MM.  Valid values: 01 through 12. Leading 0 is required. ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public Ptsv1pushfundstransferSenderInformationPaymentInformationCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four-digit year in which the payment card expires. 
   * @return expirationYear
  **/
  @ApiModelProperty(value = "Four-digit year in which the payment card expires. ")
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
    Ptsv1pushfundstransferSenderInformationPaymentInformationCard ptsv1pushfundstransferSenderInformationPaymentInformationCard = (Ptsv1pushfundstransferSenderInformationPaymentInformationCard) o;
    return Objects.equals(this.type, ptsv1pushfundstransferSenderInformationPaymentInformationCard.type) &&
        Objects.equals(this.securityCode, ptsv1pushfundstransferSenderInformationPaymentInformationCard.securityCode) &&
        Objects.equals(this.sourceAccountType, ptsv1pushfundstransferSenderInformationPaymentInformationCard.sourceAccountType) &&
        Objects.equals(this.number, ptsv1pushfundstransferSenderInformationPaymentInformationCard.number) &&
        Objects.equals(this.expirationMonth, ptsv1pushfundstransferSenderInformationPaymentInformationCard.expirationMonth) &&
        Objects.equals(this.expirationYear, ptsv1pushfundstransferSenderInformationPaymentInformationCard.expirationYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, securityCode, sourceAccountType, number, expirationMonth, expirationYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferSenderInformationPaymentInformationCard {\n");
    
    if (type != null) sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (securityCode != null) sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
    if (sourceAccountType != null) sb.append("    sourceAccountType: ").append(toIndentedString(sourceAccountType)).append("\n");
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

