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
 * InlineResponse20010SourceRecord
 */

public class InlineResponse20010SourceRecord {
  @SerializedName("token")
  private String token = null;

  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("paymentInstrumentId")
  private String paymentInstrumentId = null;

  @SerializedName("instrumentIdentifierId")
  private String instrumentIdentifierId = null;

  @SerializedName("cardNumber")
  private String cardNumber = null;

  @SerializedName("cardExpiryMonth")
  private String cardExpiryMonth = null;

  @SerializedName("cardExpiryYear")
  private String cardExpiryYear = null;

  @SerializedName("cardType")
  private String cardType = null;

  public InlineResponse20010SourceRecord token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "C064DE56200B0DB0E053AF598E0A52AA", value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public InlineResponse20010SourceRecord customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(example = "C064DE56200B0DB0E053AF598E0A52AA", value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public InlineResponse20010SourceRecord paymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * Get paymentInstrumentId
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(example = "C064DD33CBD30901E053AF598E0AC6CC", value = "")
  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }

  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }

  public InlineResponse20010SourceRecord instrumentIdentifierId(String instrumentIdentifierId) {
    this.instrumentIdentifierId = instrumentIdentifierId;
    return this;
  }

   /**
   * Get instrumentIdentifierId
   * @return instrumentIdentifierId
  **/
  @ApiModelProperty(example = "7030000000000116236", value = "")
  public String getInstrumentIdentifierId() {
    return instrumentIdentifierId;
  }

  public void setInstrumentIdentifierId(String instrumentIdentifierId) {
    this.instrumentIdentifierId = instrumentIdentifierId;
  }

  public InlineResponse20010SourceRecord cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(example = "511111XXXXXX6814", value = "")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public InlineResponse20010SourceRecord cardExpiryMonth(String cardExpiryMonth) {
    this.cardExpiryMonth = cardExpiryMonth;
    return this;
  }

   /**
   * Get cardExpiryMonth
   * @return cardExpiryMonth
  **/
  @ApiModelProperty(example = "12", value = "")
  public String getCardExpiryMonth() {
    return cardExpiryMonth;
  }

  public void setCardExpiryMonth(String cardExpiryMonth) {
    this.cardExpiryMonth = cardExpiryMonth;
  }

  public InlineResponse20010SourceRecord cardExpiryYear(String cardExpiryYear) {
    this.cardExpiryYear = cardExpiryYear;
    return this;
  }

   /**
   * Get cardExpiryYear
   * @return cardExpiryYear
  **/
  @ApiModelProperty(example = "2018", value = "")
  public String getCardExpiryYear() {
    return cardExpiryYear;
  }

  public void setCardExpiryYear(String cardExpiryYear) {
    this.cardExpiryYear = cardExpiryYear;
  }

  public InlineResponse20010SourceRecord cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @ApiModelProperty(example = "002", value = "")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010SourceRecord inlineResponse20010SourceRecord = (InlineResponse20010SourceRecord) o;
    return Objects.equals(this.token, inlineResponse20010SourceRecord.token) &&
        Objects.equals(this.customerId, inlineResponse20010SourceRecord.customerId) &&
        Objects.equals(this.paymentInstrumentId, inlineResponse20010SourceRecord.paymentInstrumentId) &&
        Objects.equals(this.instrumentIdentifierId, inlineResponse20010SourceRecord.instrumentIdentifierId) &&
        Objects.equals(this.cardNumber, inlineResponse20010SourceRecord.cardNumber) &&
        Objects.equals(this.cardExpiryMonth, inlineResponse20010SourceRecord.cardExpiryMonth) &&
        Objects.equals(this.cardExpiryYear, inlineResponse20010SourceRecord.cardExpiryYear) &&
        Objects.equals(this.cardType, inlineResponse20010SourceRecord.cardType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, customerId, paymentInstrumentId, instrumentIdentifierId, cardNumber, cardExpiryMonth, cardExpiryYear, cardType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010SourceRecord {\n");
    
    if (token != null) sb.append("    token: ").append(toIndentedString(token)).append("\n");
    if (customerId != null) sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    if (paymentInstrumentId != null) sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    if (instrumentIdentifierId != null) sb.append("    instrumentIdentifierId: ").append(toIndentedString(instrumentIdentifierId)).append("\n");
    if (cardNumber != null) sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    if (cardExpiryMonth != null) sb.append("    cardExpiryMonth: ").append(toIndentedString(cardExpiryMonth)).append("\n");
    if (cardExpiryYear != null) sb.append("    cardExpiryYear: ").append(toIndentedString(cardExpiryYear)).append("\n");
    if (cardType != null) sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
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

