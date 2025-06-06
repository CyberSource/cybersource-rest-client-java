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
 * PushFunds201ResponseOrderInformationAmountDetails
 */

public class PushFunds201ResponseOrderInformationAmountDetails {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("settlementAmount")
  private String settlementAmount = null;

  @SerializedName("settlementCurrency")
  private String settlementCurrency = null;

  public PushFunds201ResponseOrderInformationAmountDetails totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places. 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places. ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public PushFunds201ResponseOrderInformationAmountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the order. Use the three-character ISO Standard Currency Codes 
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Currency used for the order. Use the three-character ISO Standard Currency Codes ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PushFunds201ResponseOrderInformationAmountDetails settlementAmount(String settlementAmount) {
    this.settlementAmount = settlementAmount;
    return this;
  }

   /**
   * This is a multicurrency field. It contains the transaction amount (field 4), converted to the Currency used to bill the cardholder&#39;s account. This field is returned for OCT transactions. 
   * @return settlementAmount
  **/
  @ApiModelProperty(value = "This is a multicurrency field. It contains the transaction amount (field 4), converted to the Currency used to bill the cardholder's account. This field is returned for OCT transactions. ")
  public String getSettlementAmount() {
    return settlementAmount;
  }

  public void setSettlementAmount(String settlementAmount) {
    this.settlementAmount = settlementAmount;
  }

  public PushFunds201ResponseOrderInformationAmountDetails settlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    return this;
  }

   /**
   * This is a multicurrency-only field. It contains a 3-digit numeric code that identifies the currency used by the issuer to bill the cardholder&#39;s account. This field is returned for OCT transactions. 
   * @return settlementCurrency
  **/
  @ApiModelProperty(value = "This is a multicurrency-only field. It contains a 3-digit numeric code that identifies the currency used by the issuer to bill the cardholder's account. This field is returned for OCT transactions. ")
  public String getSettlementCurrency() {
    return settlementCurrency;
  }

  public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushFunds201ResponseOrderInformationAmountDetails pushFunds201ResponseOrderInformationAmountDetails = (PushFunds201ResponseOrderInformationAmountDetails) o;
    return Objects.equals(this.totalAmount, pushFunds201ResponseOrderInformationAmountDetails.totalAmount) &&
        Objects.equals(this.currency, pushFunds201ResponseOrderInformationAmountDetails.currency) &&
        Objects.equals(this.settlementAmount, pushFunds201ResponseOrderInformationAmountDetails.settlementAmount) &&
        Objects.equals(this.settlementCurrency, pushFunds201ResponseOrderInformationAmountDetails.settlementCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, currency, settlementAmount, settlementCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFunds201ResponseOrderInformationAmountDetails {\n");
    
    if (totalAmount != null) sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    if (currency != null) sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    if (settlementAmount != null) sb.append("    settlementAmount: ").append(toIndentedString(settlementAmount)).append("\n");
    if (settlementCurrency != null) sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
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

