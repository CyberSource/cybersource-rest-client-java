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
import Model.Ptsv2paymentsHealthCareInformationAmountDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Ptsv2paymentsHealthCareInformation
 */

public class Ptsv2paymentsHealthCareInformation {
  @SerializedName("amountDetails")
  private List<Ptsv2paymentsHealthCareInformationAmountDetails> amountDetails = null;

  public Ptsv2paymentsHealthCareInformation amountDetails(List<Ptsv2paymentsHealthCareInformationAmountDetails> amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

  public Ptsv2paymentsHealthCareInformation addAmountDetailsItem(Ptsv2paymentsHealthCareInformationAmountDetails amountDetailsItem) {
    if (this.amountDetails == null) {
      this.amountDetails = new ArrayList<Ptsv2paymentsHealthCareInformationAmountDetails>();
    }
    this.amountDetails.add(amountDetailsItem);
    return this;
  }

   /**
   * array for Healthcare fields
   * @return amountDetails
  **/
  @ApiModelProperty(value = "array for Healthcare fields")
  public List<Ptsv2paymentsHealthCareInformationAmountDetails> getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(List<Ptsv2paymentsHealthCareInformationAmountDetails> amountDetails) {
    this.amountDetails = amountDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsHealthCareInformation ptsv2paymentsHealthCareInformation = (Ptsv2paymentsHealthCareInformation) o;
    return Objects.equals(this.amountDetails, ptsv2paymentsHealthCareInformation.amountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsHealthCareInformation {\n");
    
    if (amountDetails != null) sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
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

