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
import Model.VTConfigCardNotPresentGlobalPaymentInformation;
import Model.VTConfigCardNotPresentReceiptInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VTConfigCardNotPresent
 */

public class VTConfigCardNotPresent {
  @SerializedName("globalPaymentInformation")
  private VTConfigCardNotPresentGlobalPaymentInformation globalPaymentInformation = null;

  @SerializedName("receiptInformation")
  private VTConfigCardNotPresentReceiptInformation receiptInformation = null;

  public VTConfigCardNotPresent globalPaymentInformation(VTConfigCardNotPresentGlobalPaymentInformation globalPaymentInformation) {
    this.globalPaymentInformation = globalPaymentInformation;
    return this;
  }

   /**
   * Get globalPaymentInformation
   * @return globalPaymentInformation
  **/
  @ApiModelProperty(value = "")
  public VTConfigCardNotPresentGlobalPaymentInformation getGlobalPaymentInformation() {
    return globalPaymentInformation;
  }

  public void setGlobalPaymentInformation(VTConfigCardNotPresentGlobalPaymentInformation globalPaymentInformation) {
    this.globalPaymentInformation = globalPaymentInformation;
  }

  public VTConfigCardNotPresent receiptInformation(VTConfigCardNotPresentReceiptInformation receiptInformation) {
    this.receiptInformation = receiptInformation;
    return this;
  }

   /**
   * Get receiptInformation
   * @return receiptInformation
  **/
  @ApiModelProperty(value = "")
  public VTConfigCardNotPresentReceiptInformation getReceiptInformation() {
    return receiptInformation;
  }

  public void setReceiptInformation(VTConfigCardNotPresentReceiptInformation receiptInformation) {
    this.receiptInformation = receiptInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VTConfigCardNotPresent vtConfigCardNotPresent = (VTConfigCardNotPresent) o;
    return Objects.equals(this.globalPaymentInformation, vtConfigCardNotPresent.globalPaymentInformation) &&
        Objects.equals(this.receiptInformation, vtConfigCardNotPresent.receiptInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalPaymentInformation, receiptInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VTConfigCardNotPresent {\n");
    
    if (globalPaymentInformation != null) sb.append("    globalPaymentInformation: ").append(toIndentedString(globalPaymentInformation)).append("\n");
    if (receiptInformation != null) sb.append("    receiptInformation: ").append(toIndentedString(receiptInformation)).append("\n");
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

