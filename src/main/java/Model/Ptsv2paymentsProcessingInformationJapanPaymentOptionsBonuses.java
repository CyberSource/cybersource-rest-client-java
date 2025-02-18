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
 * Ptsv2paymentsProcessingInformationJapanPaymentOptionsBonuses
 */

public class Ptsv2paymentsProcessingInformationJapanPaymentOptionsBonuses {
  @SerializedName("month")
  private String month = null;

  @SerializedName("amount")
  private String amount = null;

  public Ptsv2paymentsProcessingInformationJapanPaymentOptionsBonuses month(String month) {
    this.month = month;
    return this;
  }

   /**
   * This value is a 2-digit code indicating the first bonus month. Valid value from 1 to 12. 
   * @return month
  **/
  @ApiModelProperty(value = "This value is a 2-digit code indicating the first bonus month. Valid value from 1 to 12. ")
  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public Ptsv2paymentsProcessingInformationJapanPaymentOptionsBonuses amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * This value contains the bonus amount of the first month. Maximum value without decimal 99999999. 
   * @return amount
  **/
  @ApiModelProperty(value = "This value contains the bonus amount of the first month. Maximum value without decimal 99999999. ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsProcessingInformationJapanPaymentOptionsBonuses ptsv2paymentsProcessingInformationJapanPaymentOptionsBonuses = (Ptsv2paymentsProcessingInformationJapanPaymentOptionsBonuses) o;
    return Objects.equals(this.month, ptsv2paymentsProcessingInformationJapanPaymentOptionsBonuses.month) &&
        Objects.equals(this.amount, ptsv2paymentsProcessingInformationJapanPaymentOptionsBonuses.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsProcessingInformationJapanPaymentOptionsBonuses {\n");
    
    if (month != null) sb.append("    month: ").append(toIndentedString(month)).append("\n");
    if (amount != null) sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

