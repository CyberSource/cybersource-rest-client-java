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
 * PtsV2PaymentsPost201ResponseOrderInformationShipTo
 */

public class PtsV2PaymentsPost201ResponseOrderInformationShipTo {
  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  public PtsV2PaymentsPost201ResponseOrderInformationShipTo firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * First name of the recipient. 
   * @return firstname
  **/
  @ApiModelProperty(value = "First name of the recipient. ")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationShipTo lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Last name of the recipient. 
   * @return lastname
  **/
  @ApiModelProperty(value = "Last name of the recipient. ")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationShipTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the shipping address. 
   * @return address1
  **/
  @ApiModelProperty(value = "First line of the shipping address. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationShipTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second line of the shipping address. 
   * @return address2
  **/
  @ApiModelProperty(value = "Second line of the shipping address. ")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationShipTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of the shipping address. 
   * @return locality
  **/
  @ApiModelProperty(value = "City of the shipping address. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationShipTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of shipping address. This is a State, Province, and Territory Codes for the United States and Canada. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State or province of shipping address. This is a State, Province, and Territory Codes for the United States and Canada. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationShipTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code of the shipping address. Consists of 5 to 9 digits. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code of the shipping address. Consists of 5 to 9 digits. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationShipTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of shipping address. This is a two-character ISO Standard Country Codes. 
   * @return country
  **/
  @ApiModelProperty(value = "Country of shipping address. This is a two-character ISO Standard Country Codes. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PtsV2PaymentsPost201ResponseOrderInformationShipTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number of the recipient. 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone number of the recipient. ")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseOrderInformationShipTo ptsV2PaymentsPost201ResponseOrderInformationShipTo = (PtsV2PaymentsPost201ResponseOrderInformationShipTo) o;
    return Objects.equals(this.firstname, ptsV2PaymentsPost201ResponseOrderInformationShipTo.firstname) &&
        Objects.equals(this.lastname, ptsV2PaymentsPost201ResponseOrderInformationShipTo.lastname) &&
        Objects.equals(this.address1, ptsV2PaymentsPost201ResponseOrderInformationShipTo.address1) &&
        Objects.equals(this.address2, ptsV2PaymentsPost201ResponseOrderInformationShipTo.address2) &&
        Objects.equals(this.locality, ptsV2PaymentsPost201ResponseOrderInformationShipTo.locality) &&
        Objects.equals(this.administrativeArea, ptsV2PaymentsPost201ResponseOrderInformationShipTo.administrativeArea) &&
        Objects.equals(this.postalCode, ptsV2PaymentsPost201ResponseOrderInformationShipTo.postalCode) &&
        Objects.equals(this.country, ptsV2PaymentsPost201ResponseOrderInformationShipTo.country) &&
        Objects.equals(this.phoneNumber, ptsV2PaymentsPost201ResponseOrderInformationShipTo.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname, address1, address2, locality, administrativeArea, postalCode, country, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseOrderInformationShipTo {\n");
    
    if (firstname != null) sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    if (lastname != null) sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    if (address1 != null) sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    if (address2 != null) sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    if (locality != null) sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    if (administrativeArea != null) sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    if (postalCode != null) sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    if (country != null) sb.append("    country: ").append(toIndentedString(country)).append("\n");
    if (phoneNumber != null) sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

