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
 * Ptsv2paymentreferencesDeviceInformation
 */

public class Ptsv2paymentreferencesDeviceInformation {
  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("deviceType")
  private String deviceType = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("userAgent")
  private String userAgent = null;

  public Ptsv2paymentreferencesDeviceInformation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the customer.  #### Used by **Authorization, Capture, and Credit** Optional field. 
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address of the customer.  #### Used by **Authorization, Capture, and Credit** Optional field. ")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Ptsv2paymentreferencesDeviceInformation deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * The device type at the client side.
   * @return deviceType
  **/
  @ApiModelProperty(value = "The device type at the client side.")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public Ptsv2paymentreferencesDeviceInformation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ../../../commons/definitions/device.yaml#/properties/id
   * @return id
  **/
  @ApiModelProperty(value = "../../../commons/definitions/device.yaml#/properties/id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Ptsv2paymentreferencesDeviceInformation userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Customer&#39;s browser as identified from the HTTP header data. For example, &#x60;Mozilla&#x60; is the value that identifies the Netscape browser. 
   * @return userAgent
  **/
  @ApiModelProperty(value = "Customer's browser as identified from the HTTP header data. For example, `Mozilla` is the value that identifies the Netscape browser. ")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentreferencesDeviceInformation ptsv2paymentreferencesDeviceInformation = (Ptsv2paymentreferencesDeviceInformation) o;
    return Objects.equals(this.ipAddress, ptsv2paymentreferencesDeviceInformation.ipAddress) &&
        Objects.equals(this.deviceType, ptsv2paymentreferencesDeviceInformation.deviceType) &&
        Objects.equals(this.id, ptsv2paymentreferencesDeviceInformation.id) &&
        Objects.equals(this.userAgent, ptsv2paymentreferencesDeviceInformation.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, deviceType, id, userAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentreferencesDeviceInformation {\n");
    
    if (ipAddress != null) sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    if (deviceType != null) sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (userAgent != null) sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

