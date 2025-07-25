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
import Model.Dmsv3devicesdeassociateDevices;
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
 * InlineResponse2006
 */

public class InlineResponse2006 {
  @SerializedName("status")
  private String status = null;

  @SerializedName("devices")
  private List<Dmsv3devicesdeassociateDevices> devices = null;

  public InlineResponse2006 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Possible values: - OK
   * @return status
  **/
  @ApiModelProperty(value = "Possible values: - OK")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse2006 devices(List<Dmsv3devicesdeassociateDevices> devices) {
    this.devices = devices;
    return this;
  }

  public InlineResponse2006 addDevicesItem(Dmsv3devicesdeassociateDevices devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<Dmsv3devicesdeassociateDevices>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @ApiModelProperty(value = "")
  public List<Dmsv3devicesdeassociateDevices> getDevices() {
    return devices;
  }

  public void setDevices(List<Dmsv3devicesdeassociateDevices> devices) {
    this.devices = devices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(this.status, inlineResponse2006.status) &&
        Objects.equals(this.devices, inlineResponse2006.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, devices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (devices != null) sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

