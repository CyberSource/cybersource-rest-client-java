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
import Model.PtsV2PaymentsPost201ResponseRiskInformationVelocityMorphing;
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
 * PtsV2PaymentsPost201ResponseRiskInformationVelocity
 */

public class PtsV2PaymentsPost201ResponseRiskInformationVelocity {
  @SerializedName("morphing")
  private List<PtsV2PaymentsPost201ResponseRiskInformationVelocityMorphing> morphing = null;

  @SerializedName("address")
  private List<String> address = null;

  public PtsV2PaymentsPost201ResponseRiskInformationVelocity morphing(List<PtsV2PaymentsPost201ResponseRiskInformationVelocityMorphing> morphing) {
    this.morphing = morphing;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationVelocity addMorphingItem(PtsV2PaymentsPost201ResponseRiskInformationVelocityMorphing morphingItem) {
    if (this.morphing == null) {
      this.morphing = new ArrayList<PtsV2PaymentsPost201ResponseRiskInformationVelocityMorphing>();
    }
    this.morphing.add(morphingItem);
    return this;
  }

   /**
   * List of information codes triggered by the order. These information codes were generated when you created the order and product velocity rules and are returned so that you can associate them with the rules.  Returned by scoring service. 
   * @return morphing
  **/
  @ApiModelProperty(value = "List of information codes triggered by the order. These information codes were generated when you created the order and product velocity rules and are returned so that you can associate them with the rules.  Returned by scoring service. ")
  public List<PtsV2PaymentsPost201ResponseRiskInformationVelocityMorphing> getMorphing() {
    return morphing;
  }

  public void setMorphing(List<PtsV2PaymentsPost201ResponseRiskInformationVelocityMorphing> morphing) {
    this.morphing = morphing;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationVelocity address(List<String> address) {
    this.address = address;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationVelocity addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<String>();
    }
    this.address.add(addressItem);
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseRiskInformationVelocity ptsV2PaymentsPost201ResponseRiskInformationVelocity = (PtsV2PaymentsPost201ResponseRiskInformationVelocity) o;
    return Objects.equals(this.morphing, ptsV2PaymentsPost201ResponseRiskInformationVelocity.morphing) &&
        Objects.equals(this.address, ptsV2PaymentsPost201ResponseRiskInformationVelocity.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(morphing, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseRiskInformationVelocity {\n");
    
    if (morphing != null) sb.append("    morphing: ").append(toIndentedString(morphing)).append("\n");
    if (address != null) sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

