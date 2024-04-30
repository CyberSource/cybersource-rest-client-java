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
 * Ptsv2billingagreementsidAgreementInformation
 */

public class Ptsv2billingagreementsidAgreementInformation {
  @SerializedName("id")
  private String id = null;

  @SerializedName("eSignIndicator")
  private String eSignIndicator = null;

  public Ptsv2billingagreementsidAgreementInformation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier for the mandate. #### SEPA/BACS Required for mandates services 
   * @return id
  **/
  @ApiModelProperty(value = "Identifier for the mandate. #### SEPA/BACS Required for mandates services ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Ptsv2billingagreementsidAgreementInformation eSignIndicator(String eSignIndicator) {
    this.eSignIndicator = eSignIndicator;
    return this;
  }

   /**
   * Get eSignIndicator
   * @return eSignIndicator
  **/
  @ApiModelProperty(value = "")
  public String getESignIndicator() {
    return eSignIndicator;
  }

  public void setESignIndicator(String eSignIndicator) {
    this.eSignIndicator = eSignIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2billingagreementsidAgreementInformation ptsv2billingagreementsidAgreementInformation = (Ptsv2billingagreementsidAgreementInformation) o;
    return Objects.equals(this.id, ptsv2billingagreementsidAgreementInformation.id) &&
        Objects.equals(this.eSignIndicator, ptsv2billingagreementsidAgreementInformation.eSignIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eSignIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2billingagreementsidAgreementInformation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eSignIndicator: ").append(toIndentedString(eSignIndicator)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
