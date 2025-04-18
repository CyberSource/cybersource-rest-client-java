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
 * Ptsv2paymentsTravelInformationAutoRentalReturnAddress
 */

public class Ptsv2paymentsTravelInformationAutoRentalReturnAddress {
  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("locationId")
  private String locationId = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("location")
  private String location = null;

  public Ptsv2paymentsTravelInformationAutoRentalReturnAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City where the auto was returned to the rental agency. 
   * @return city
  **/
  @ApiModelProperty(value = "City where the auto was returned to the rental agency. ")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Ptsv2paymentsTravelInformationAutoRentalReturnAddress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State in which the auto was returned to the rental agency. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  For authorizations, this field is supported for Visa, MasterCard, and American Express.  For captures, this field is supported only for MasterCard and American Express. 
   * @return state
  **/
  @ApiModelProperty(value = "State in which the auto was returned to the rental agency. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  For authorizations, this field is supported for Visa, MasterCard, and American Express.  For captures, this field is supported only for MasterCard and American Express. ")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Ptsv2paymentsTravelInformationAutoRentalReturnAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country where the auto was returned to the rental agency. Use the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf). 
   * @return country
  **/
  @ApiModelProperty(value = "Country where the auto was returned to the rental agency. Use the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf). ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Ptsv2paymentsTravelInformationAutoRentalReturnAddress locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Code, address, phone number, etc. used to identify the location of the auto rental return. This field is supported only for MasterCard and American Express. 
   * @return locationId
  **/
  @ApiModelProperty(value = "Code, address, phone number, etc. used to identify the location of the auto rental return. This field is supported only for MasterCard and American Express. ")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Ptsv2paymentsTravelInformationAutoRentalReturnAddress address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * When merchant wants to send the rental address&#39;s street address. 
   * @return address1
  **/
  @ApiModelProperty(value = "When merchant wants to send the rental address's street address. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Ptsv2paymentsTravelInformationAutoRentalReturnAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * When merchant wants to send the return address&#39;s postal code. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "When merchant wants to send the return address's postal code. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Ptsv2paymentsTravelInformationAutoRentalReturnAddress location(String location) {
    this.location = location;
    return this;
  }

   /**
   * This field contains the location where the taxi passenger was dropped off or where the auto rental vehicle was returned. 
   * @return location
  **/
  @ApiModelProperty(value = "This field contains the location where the taxi passenger was dropped off or where the auto rental vehicle was returned. ")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTravelInformationAutoRentalReturnAddress ptsv2paymentsTravelInformationAutoRentalReturnAddress = (Ptsv2paymentsTravelInformationAutoRentalReturnAddress) o;
    return Objects.equals(this.city, ptsv2paymentsTravelInformationAutoRentalReturnAddress.city) &&
        Objects.equals(this.state, ptsv2paymentsTravelInformationAutoRentalReturnAddress.state) &&
        Objects.equals(this.country, ptsv2paymentsTravelInformationAutoRentalReturnAddress.country) &&
        Objects.equals(this.locationId, ptsv2paymentsTravelInformationAutoRentalReturnAddress.locationId) &&
        Objects.equals(this.address1, ptsv2paymentsTravelInformationAutoRentalReturnAddress.address1) &&
        Objects.equals(this.postalCode, ptsv2paymentsTravelInformationAutoRentalReturnAddress.postalCode) &&
        Objects.equals(this.location, ptsv2paymentsTravelInformationAutoRentalReturnAddress.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, state, country, locationId, address1, postalCode, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformationAutoRentalReturnAddress {\n");
    
    if (city != null) sb.append("    city: ").append(toIndentedString(city)).append("\n");
    if (state != null) sb.append("    state: ").append(toIndentedString(state)).append("\n");
    if (country != null) sb.append("    country: ").append(toIndentedString(country)).append("\n");
    if (locationId != null) sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    if (address1 != null) sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    if (postalCode != null) sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    if (location != null) sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

