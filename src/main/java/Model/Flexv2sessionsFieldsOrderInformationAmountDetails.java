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
import Model.Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Flexv2sessionsFieldsOrderInformationAmountDetails
 */

public class Flexv2sessionsFieldsOrderInformationAmountDetails {
  @SerializedName("totalAmount")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount totalAmount = null;

  @SerializedName("currency")
  private Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount currency = null;

  public Flexv2sessionsFieldsOrderInformationAmountDetails totalAmount(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Flexv2sessionsFieldsOrderInformationAmountDetails currency(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount getCurrency() {
    return currency;
  }

  public void setCurrency(Flexv2sessionsFieldsOrderInformationAmountDetailsTotalAmount currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flexv2sessionsFieldsOrderInformationAmountDetails flexv2sessionsFieldsOrderInformationAmountDetails = (Flexv2sessionsFieldsOrderInformationAmountDetails) o;
    return Objects.equals(this.totalAmount, flexv2sessionsFieldsOrderInformationAmountDetails.totalAmount) &&
        Objects.equals(this.currency, flexv2sessionsFieldsOrderInformationAmountDetails.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flexv2sessionsFieldsOrderInformationAmountDetails {\n");
    
    if (totalAmount != null) sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    if (currency != null) sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

