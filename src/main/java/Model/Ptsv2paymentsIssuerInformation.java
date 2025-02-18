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
 * Ptsv2paymentsIssuerInformation
 */

public class Ptsv2paymentsIssuerInformation {
  @SerializedName("discretionaryData")
  private String discretionaryData = null;

  public Ptsv2paymentsIssuerInformation discretionaryData(String discretionaryData) {
    this.discretionaryData = discretionaryData;
    return this;
  }

   /**
   * Data defined by the issuer.  The value for this reply field will probably be the same as the value that you submitted in the authorization request, but it is possible for the processor, issuer, or acquirer to modify the value.  This field is supported only for Visa transactions on **CyberSource through VisaNet**. 
   * @return discretionaryData
  **/
  @ApiModelProperty(value = "Data defined by the issuer.  The value for this reply field will probably be the same as the value that you submitted in the authorization request, but it is possible for the processor, issuer, or acquirer to modify the value.  This field is supported only for Visa transactions on **CyberSource through VisaNet**. ")
  public String getDiscretionaryData() {
    return discretionaryData;
  }

  public void setDiscretionaryData(String discretionaryData) {
    this.discretionaryData = discretionaryData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsIssuerInformation ptsv2paymentsIssuerInformation = (Ptsv2paymentsIssuerInformation) o;
    return Objects.equals(this.discretionaryData, ptsv2paymentsIssuerInformation.discretionaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discretionaryData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsIssuerInformation {\n");
    
    if (discretionaryData != null) sb.append("    discretionaryData: ").append(toIndentedString(discretionaryData)).append("\n");
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

