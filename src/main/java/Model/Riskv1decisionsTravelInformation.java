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
import Model.Riskv1decisionsTravelInformationLegs;
import Model.Riskv1decisionsTravelInformationPassengers;
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
 * Riskv1decisionsTravelInformation
 */

public class Riskv1decisionsTravelInformation {
  @SerializedName("actualFinalDestination")
  private String actualFinalDestination = null;

  @SerializedName("completeRoute")
  private String completeRoute = null;

  @SerializedName("departureTime")
  private String departureTime = null;

  @SerializedName("journeyType")
  private String journeyType = null;

  @SerializedName("legs")
  private List<Riskv1decisionsTravelInformationLegs> legs = null;

  @SerializedName("numberOfPassengers")
  private Integer numberOfPassengers = null;

  @SerializedName("passengers")
  private List<Riskv1decisionsTravelInformationPassengers> passengers = null;

  public Riskv1decisionsTravelInformation actualFinalDestination(String actualFinalDestination) {
    this.actualFinalDestination = actualFinalDestination;
    return this;
  }

   /**
   * IATA Code for the actual final destination that the customer intends to travel to. It should be a destination on the completeRoute. 
   * @return actualFinalDestination
  **/
  @ApiModelProperty(value = "IATA Code for the actual final destination that the customer intends to travel to. It should be a destination on the completeRoute. ")
  public String getActualFinalDestination() {
    return actualFinalDestination;
  }

  public void setActualFinalDestination(String actualFinalDestination) {
    this.actualFinalDestination = actualFinalDestination;
  }

  public Riskv1decisionsTravelInformation completeRoute(String completeRoute) {
    this.completeRoute = completeRoute;
    return this;
  }

   /**
   * Concatenation of individual travel legs in the format ORIG1-DEST1[:ORIG2-DEST2...:ORIGn-DESTn], for example, SFO-JFK:JFK-LHR:LHR-CDG. For airport codes, see the IATA Airline and Airport Code Search. Note In your request, send either the complete route or the individual legs (_leg#_orig and _leg#_dest). If you send all the fields, the value of _complete_route takes precedence over that of the _leg# fields. 
   * @return completeRoute
  **/
  @ApiModelProperty(value = "Concatenation of individual travel legs in the format ORIG1-DEST1[:ORIG2-DEST2...:ORIGn-DESTn], for example, SFO-JFK:JFK-LHR:LHR-CDG. For airport codes, see the IATA Airline and Airport Code Search. Note In your request, send either the complete route or the individual legs (_leg#_orig and _leg#_dest). If you send all the fields, the value of _complete_route takes precedence over that of the _leg# fields. ")
  public String getCompleteRoute() {
    return completeRoute;
  }

  public void setCompleteRoute(String completeRoute) {
    this.completeRoute = completeRoute;
  }

  public Riskv1decisionsTravelInformation departureTime(String departureTime) {
    this.departureTime = departureTime;
    return this;
  }

   /**
   * Departure date and time of the first leg of the trip. Use one of the following formats:   - yyyy-MM-dd HH:mm z   - yyyy-MM-dd hh:mm a z   - yyyy-MM-dd hh:mma z   HH &#x3D; hour in 24-hour format   hh &#x3D; hour in 12-hour format   a &#x3D; am or pm (case insensitive)   z &#x3D; time zone of the departing flight, for example: If the   airline is based in city A, but the flight departs from city   B, z is the time zone of city B at the time of departure. Important For travel information, use GMT instead of UTC, or use the local time zone. Examples 2011-03-20 11:30 PM PDT 2011-03-20 11:30pm GMT 2011-03-20 11:30pm GMT-05:00 Eastern Standard Time: GMT-05:00 or EST Note When specifying an offset from GMT, the format must be exactly as specified in the example. Insert no spaces between the time zone and the offset. 
   * @return departureTime
  **/
  @ApiModelProperty(value = "Departure date and time of the first leg of the trip. Use one of the following formats:   - yyyy-MM-dd HH:mm z   - yyyy-MM-dd hh:mm a z   - yyyy-MM-dd hh:mma z   HH = hour in 24-hour format   hh = hour in 12-hour format   a = am or pm (case insensitive)   z = time zone of the departing flight, for example: If the   airline is based in city A, but the flight departs from city   B, z is the time zone of city B at the time of departure. Important For travel information, use GMT instead of UTC, or use the local time zone. Examples 2011-03-20 11:30 PM PDT 2011-03-20 11:30pm GMT 2011-03-20 11:30pm GMT-05:00 Eastern Standard Time: GMT-05:00 or EST Note When specifying an offset from GMT, the format must be exactly as specified in the example. Insert no spaces between the time zone and the offset. ")
  public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  public Riskv1decisionsTravelInformation journeyType(String journeyType) {
    this.journeyType = journeyType;
    return this;
  }

   /**
   * Type of travel, for example one way or round trip.
   * @return journeyType
  **/
  @ApiModelProperty(value = "Type of travel, for example one way or round trip.")
  public String getJourneyType() {
    return journeyType;
  }

  public void setJourneyType(String journeyType) {
    this.journeyType = journeyType;
  }

  public Riskv1decisionsTravelInformation legs(List<Riskv1decisionsTravelInformationLegs> legs) {
    this.legs = legs;
    return this;
  }

  public Riskv1decisionsTravelInformation addLegsItem(Riskv1decisionsTravelInformationLegs legsItem) {
    if (this.legs == null) {
      this.legs = new ArrayList<Riskv1decisionsTravelInformationLegs>();
    }
    this.legs.add(legsItem);
    return this;
  }

   /**
   * Get legs
   * @return legs
  **/
  @ApiModelProperty(value = "")
  public List<Riskv1decisionsTravelInformationLegs> getLegs() {
    return legs;
  }

  public void setLegs(List<Riskv1decisionsTravelInformationLegs> legs) {
    this.legs = legs;
  }

  public Riskv1decisionsTravelInformation numberOfPassengers(Integer numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
    return this;
  }

   /**
   * Number of passengers for whom the ticket was issued. If you do not include this field in your request, CyberSource uses a default value of 1. Required for American Express SafeKey (U.S.) for travel-related requests. 
   * @return numberOfPassengers
  **/
  @ApiModelProperty(value = "Number of passengers for whom the ticket was issued. If you do not include this field in your request, CyberSource uses a default value of 1. Required for American Express SafeKey (U.S.) for travel-related requests. ")
  public Integer getNumberOfPassengers() {
    return numberOfPassengers;
  }

  public void setNumberOfPassengers(Integer numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
  }

  public Riskv1decisionsTravelInformation passengers(List<Riskv1decisionsTravelInformationPassengers> passengers) {
    this.passengers = passengers;
    return this;
  }

  public Riskv1decisionsTravelInformation addPassengersItem(Riskv1decisionsTravelInformationPassengers passengersItem) {
    if (this.passengers == null) {
      this.passengers = new ArrayList<Riskv1decisionsTravelInformationPassengers>();
    }
    this.passengers.add(passengersItem);
    return this;
  }

   /**
   * Get passengers
   * @return passengers
  **/
  @ApiModelProperty(value = "")
  public List<Riskv1decisionsTravelInformationPassengers> getPassengers() {
    return passengers;
  }

  public void setPassengers(List<Riskv1decisionsTravelInformationPassengers> passengers) {
    this.passengers = passengers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsTravelInformation riskv1decisionsTravelInformation = (Riskv1decisionsTravelInformation) o;
    return Objects.equals(this.actualFinalDestination, riskv1decisionsTravelInformation.actualFinalDestination) &&
        Objects.equals(this.completeRoute, riskv1decisionsTravelInformation.completeRoute) &&
        Objects.equals(this.departureTime, riskv1decisionsTravelInformation.departureTime) &&
        Objects.equals(this.journeyType, riskv1decisionsTravelInformation.journeyType) &&
        Objects.equals(this.legs, riskv1decisionsTravelInformation.legs) &&
        Objects.equals(this.numberOfPassengers, riskv1decisionsTravelInformation.numberOfPassengers) &&
        Objects.equals(this.passengers, riskv1decisionsTravelInformation.passengers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualFinalDestination, completeRoute, departureTime, journeyType, legs, numberOfPassengers, passengers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsTravelInformation {\n");
    
    if (actualFinalDestination != null) sb.append("    actualFinalDestination: ").append(toIndentedString(actualFinalDestination)).append("\n");
    if (completeRoute != null) sb.append("    completeRoute: ").append(toIndentedString(completeRoute)).append("\n");
    if (departureTime != null) sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    if (journeyType != null) sb.append("    journeyType: ").append(toIndentedString(journeyType)).append("\n");
    if (legs != null) sb.append("    legs: ").append(toIndentedString(legs)).append("\n");
    if (numberOfPassengers != null) sb.append("    numberOfPassengers: ").append(toIndentedString(numberOfPassengers)).append("\n");
    if (passengers != null) sb.append("    passengers: ").append(toIndentedString(passengers)).append("\n");
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

