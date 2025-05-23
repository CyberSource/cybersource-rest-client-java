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
 * PtsV2PaymentsPost201ResponseRiskInformationProfile
 */

public class PtsV2PaymentsPost201ResponseRiskInformationProfile {
  @SerializedName("name")
  private String name = null;

  @SerializedName("desinationQueue")
  private String desinationQueue = null;

  @SerializedName("selectorRule")
  private String selectorRule = null;

  public PtsV2PaymentsPost201ResponseRiskInformationProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the active profile chosen by the profile selector. If no profile selector exists, the default active profile is chosen.  **Note** By default, your default profile is the active profile, or the Profile Selector chooses the active profile. Use this field only if you want to specify the name of a different profile. The passed-in profile will then become the active profile. 
   * @return name
  **/
  @ApiModelProperty(value = "Name of the active profile chosen by the profile selector. If no profile selector exists, the default active profile is chosen.  **Note** By default, your default profile is the active profile, or the Profile Selector chooses the active profile. Use this field only if you want to specify the name of a different profile. The passed-in profile will then become the active profile. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationProfile desinationQueue(String desinationQueue) {
    this.desinationQueue = desinationQueue;
    return this;
  }

   /**
   * Name of the queue where orders that are not automatically accepted are sent. 
   * @return desinationQueue
  **/
  @ApiModelProperty(value = "Name of the queue where orders that are not automatically accepted are sent. ")
  public String getDesinationQueue() {
    return desinationQueue;
  }

  public void setDesinationQueue(String desinationQueue) {
    this.desinationQueue = desinationQueue;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationProfile selectorRule(String selectorRule) {
    this.selectorRule = selectorRule;
    return this;
  }

   /**
   * Name of the profile selector rule that chooses the profile to use for the transaction. If no profile selector exists, the value is Default Active Profile. 
   * @return selectorRule
  **/
  @ApiModelProperty(value = "Name of the profile selector rule that chooses the profile to use for the transaction. If no profile selector exists, the value is Default Active Profile. ")
  public String getSelectorRule() {
    return selectorRule;
  }

  public void setSelectorRule(String selectorRule) {
    this.selectorRule = selectorRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseRiskInformationProfile ptsV2PaymentsPost201ResponseRiskInformationProfile = (PtsV2PaymentsPost201ResponseRiskInformationProfile) o;
    return Objects.equals(this.name, ptsV2PaymentsPost201ResponseRiskInformationProfile.name) &&
        Objects.equals(this.desinationQueue, ptsV2PaymentsPost201ResponseRiskInformationProfile.desinationQueue) &&
        Objects.equals(this.selectorRule, ptsV2PaymentsPost201ResponseRiskInformationProfile.selectorRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, desinationQueue, selectorRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseRiskInformationProfile {\n");
    
    if (name != null) sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (desinationQueue != null) sb.append("    desinationQueue: ").append(toIndentedString(desinationQueue)).append("\n");
    if (selectorRule != null) sb.append("    selectorRule: ").append(toIndentedString(selectorRule)).append("\n");
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

