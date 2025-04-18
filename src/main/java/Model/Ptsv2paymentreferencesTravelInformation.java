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
import Model.Ptsv2paymentreferencesTravelInformationAutoRental;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentreferencesTravelInformation
 */

public class Ptsv2paymentreferencesTravelInformation {
  @SerializedName("autoRental")
  private Ptsv2paymentreferencesTravelInformationAutoRental autoRental = null;

  public Ptsv2paymentreferencesTravelInformation autoRental(Ptsv2paymentreferencesTravelInformationAutoRental autoRental) {
    this.autoRental = autoRental;
    return this;
  }

   /**
   * Get autoRental
   * @return autoRental
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesTravelInformationAutoRental getAutoRental() {
    return autoRental;
  }

  public void setAutoRental(Ptsv2paymentreferencesTravelInformationAutoRental autoRental) {
    this.autoRental = autoRental;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentreferencesTravelInformation ptsv2paymentreferencesTravelInformation = (Ptsv2paymentreferencesTravelInformation) o;
    return Objects.equals(this.autoRental, ptsv2paymentreferencesTravelInformation.autoRental);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRental);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentreferencesTravelInformation {\n");
    
    if (autoRental != null) sb.append("    autoRental: ").append(toIndentedString(autoRental)).append("\n");
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

