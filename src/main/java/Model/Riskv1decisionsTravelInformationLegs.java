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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1decisionsTravelInformationLegs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-07T15:32:29.568+05:30")
public class Riskv1decisionsTravelInformationLegs {
  @SerializedName("origination")
  private String origination = null;

  @SerializedName("destination")
  private String destination = null;

  public Riskv1decisionsTravelInformationLegs origination(String origination) {
    this.origination = origination;
    return this;
  }

   /**
   * Use to specify the airport code for the origin of the leg of the trip, which is designated by the pound (#) symbol in the field name. This code is usually three digits long, for example: SFO &#x3D; San Francisco. Do not use the colon (:) or the dash (-). For airport codes, see the IATA Airline and Airport Code Search. The leg number can be a positive integer from 0 to N. For example: decision_manager_travel_leg0_orig&#x3D;SFO decision_manager_travel_leg1_orig&#x3D;SFO Note In your request, send either the complete route or the individual legs (_leg#_orig and _leg#_dest). If you send all the fields, the complete route takes precedence over the individual legs. 
   * @return origination
  **/
  @ApiModelProperty(value = "Use to specify the airport code for the origin of the leg of the trip, which is designated by the pound (#) symbol in the field name. This code is usually three digits long, for example: SFO = San Francisco. Do not use the colon (:) or the dash (-). For airport codes, see the IATA Airline and Airport Code Search. The leg number can be a positive integer from 0 to N. For example: decision_manager_travel_leg0_orig=SFO decision_manager_travel_leg1_orig=SFO Note In your request, send either the complete route or the individual legs (_leg#_orig and _leg#_dest). If you send all the fields, the complete route takes precedence over the individual legs. ")
  public String getOrigination() {
    return origination;
  }

  public void setOrigination(String origination) {
    this.origination = origination;
  }

  public Riskv1decisionsTravelInformationLegs destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Use to specify the airport code for the destination of the leg of the trip, which is designated by the pound (#) symbol in the field name. This code is usually three digits long, for example: SFO &#x3D; San Francisco. Do not use the colon (:) or the dash (-). For airport codes, see the IATA Airline and Airport Code Search. The leg number can be a positive integer from 0 to N. For example: decision_manager_travel_leg0_dest&#x3D;SFO decision_manager_travel_leg1_dest&#x3D;SFO Note In your request, send either the complete route or the individual legs (_leg#_orig and _leg#_dest). If you send all the fields, the complete route takes precedence over the individual legs. 
   * @return destination
  **/
  @ApiModelProperty(value = "Use to specify the airport code for the destination of the leg of the trip, which is designated by the pound (#) symbol in the field name. This code is usually three digits long, for example: SFO = San Francisco. Do not use the colon (:) or the dash (-). For airport codes, see the IATA Airline and Airport Code Search. The leg number can be a positive integer from 0 to N. For example: decision_manager_travel_leg0_dest=SFO decision_manager_travel_leg1_dest=SFO Note In your request, send either the complete route or the individual legs (_leg#_orig and _leg#_dest). If you send all the fields, the complete route takes precedence over the individual legs. ")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsTravelInformationLegs riskv1decisionsTravelInformationLegs = (Riskv1decisionsTravelInformationLegs) o;
    return Objects.equals(this.origination, riskv1decisionsTravelInformationLegs.origination) &&
        Objects.equals(this.destination, riskv1decisionsTravelInformationLegs.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origination, destination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsTravelInformationLegs {\n");
    
    sb.append("    origination: ").append(toIndentedString(origination)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
