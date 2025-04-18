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
 * UmsV1UsersGet200ResponseContactInformation
 */

public class UmsV1UsersGet200ResponseContactInformation {
  @SerializedName("email")
  private String email = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  public UmsV1UsersGet200ResponseContactInformation email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UmsV1UsersGet200ResponseContactInformation phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public UmsV1UsersGet200ResponseContactInformation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UmsV1UsersGet200ResponseContactInformation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UmsV1UsersGet200ResponseContactInformation umsV1UsersGet200ResponseContactInformation = (UmsV1UsersGet200ResponseContactInformation) o;
    return Objects.equals(this.email, umsV1UsersGet200ResponseContactInformation.email) &&
        Objects.equals(this.phoneNumber, umsV1UsersGet200ResponseContactInformation.phoneNumber) &&
        Objects.equals(this.firstName, umsV1UsersGet200ResponseContactInformation.firstName) &&
        Objects.equals(this.lastName, umsV1UsersGet200ResponseContactInformation.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phoneNumber, firstName, lastName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UmsV1UsersGet200ResponseContactInformation {\n");
    
    if (email != null) sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (phoneNumber != null) sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    if (firstName != null) sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    if (lastName != null) sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

