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
 * TmsTokenFormats
 */

public class TmsTokenFormats {
  @SerializedName("customer")
  private String customer = null;

  @SerializedName("paymentInstrument")
  private String paymentInstrument = null;

  @SerializedName("instrumentIdentifierCard")
  private String instrumentIdentifierCard = null;

  @SerializedName("instrumentIdentifierBankAccount")
  private String instrumentIdentifierBankAccount = null;

  public TmsTokenFormats customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Format for customer tokens.  Possible Values:   - &#39;16_DIGIT&#39;   - &#39;19_DIGIT&#39;   - &#39;22_DIGIT&#39;   - &#39;32_HEX&#39; 
   * @return customer
  **/
  @ApiModelProperty(example = "32_HEX", value = "Format for customer tokens.  Possible Values:   - '16_DIGIT'   - '19_DIGIT'   - '22_DIGIT'   - '32_HEX' ")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public TmsTokenFormats paymentInstrument(String paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * Format for payment instrument tokens.  Possible Values:   - &#39;16_DIGIT&#39;   - &#39;19_DIGIT&#39;   - &#39;22_DIGIT&#39;   - &#39;32_HEX&#39; 
   * @return paymentInstrument
  **/
  @ApiModelProperty(example = "32_HEX", value = "Format for payment instrument tokens.  Possible Values:   - '16_DIGIT'   - '19_DIGIT'   - '22_DIGIT'   - '32_HEX' ")
  public String getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(String paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  public TmsTokenFormats instrumentIdentifierCard(String instrumentIdentifierCard) {
    this.instrumentIdentifierCard = instrumentIdentifierCard;
    return this;
  }

   /**
   * Format for card based instrument identifier tokens.  Possible Values:   - &#39;16_DIGIT&#39;   - &#39;16_DIGIT_LAST_4&#39;   - &#39;19_DIGIT&#39;   - &#39;19_DIGIT_LAST_4&#39;   - &#39;22_DIGIT&#39;   - &#39;32_HEX&#39; 
   * @return instrumentIdentifierCard
  **/
  @ApiModelProperty(value = "Format for card based instrument identifier tokens.  Possible Values:   - '16_DIGIT'   - '16_DIGIT_LAST_4'   - '19_DIGIT'   - '19_DIGIT_LAST_4'   - '22_DIGIT'   - '32_HEX' ")
  public String getInstrumentIdentifierCard() {
    return instrumentIdentifierCard;
  }

  public void setInstrumentIdentifierCard(String instrumentIdentifierCard) {
    this.instrumentIdentifierCard = instrumentIdentifierCard;
  }

  public TmsTokenFormats instrumentIdentifierBankAccount(String instrumentIdentifierBankAccount) {
    this.instrumentIdentifierBankAccount = instrumentIdentifierBankAccount;
    return this;
  }

   /**
   * Format for bank account based instrument identifier tokens.  Possible Values:    - &#39;16_DIGIT&#39;   - &#39;19_DIGIT&#39;   - &#39;22_DIGIT&#39;   - &#39;32_HEX&#39; 
   * @return instrumentIdentifierBankAccount
  **/
  @ApiModelProperty(value = "Format for bank account based instrument identifier tokens.  Possible Values:    - '16_DIGIT'   - '19_DIGIT'   - '22_DIGIT'   - '32_HEX' ")
  public String getInstrumentIdentifierBankAccount() {
    return instrumentIdentifierBankAccount;
  }

  public void setInstrumentIdentifierBankAccount(String instrumentIdentifierBankAccount) {
    this.instrumentIdentifierBankAccount = instrumentIdentifierBankAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsTokenFormats tmsTokenFormats = (TmsTokenFormats) o;
    return Objects.equals(this.customer, tmsTokenFormats.customer) &&
        Objects.equals(this.paymentInstrument, tmsTokenFormats.paymentInstrument) &&
        Objects.equals(this.instrumentIdentifierCard, tmsTokenFormats.instrumentIdentifierCard) &&
        Objects.equals(this.instrumentIdentifierBankAccount, tmsTokenFormats.instrumentIdentifierBankAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, paymentInstrument, instrumentIdentifierCard, instrumentIdentifierBankAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsTokenFormats {\n");
    
    if (customer != null) sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    if (paymentInstrument != null) sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    if (instrumentIdentifierCard != null) sb.append("    instrumentIdentifierCard: ").append(toIndentedString(instrumentIdentifierCard)).append("\n");
    if (instrumentIdentifierBankAccount != null) sb.append("    instrumentIdentifierBankAccount: ").append(toIndentedString(instrumentIdentifierBankAccount)).append("\n");
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

