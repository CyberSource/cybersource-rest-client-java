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
 * TmsNetworkTokenServicesPaymentCredentials
 */

public class TmsNetworkTokenServicesPaymentCredentials {
  @SerializedName("enabled")
  private Boolean enabled = null;

  public TmsNetworkTokenServicesPaymentCredentials enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates if Payment Credentials are enabled. If enabled, this provides access to the unredacted token and its associated cryptogram.
   * @return enabled
  **/
  @ApiModelProperty(value = "Indicates if Payment Credentials are enabled. If enabled, this provides access to the unredacted token and its associated cryptogram.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsNetworkTokenServicesPaymentCredentials tmsNetworkTokenServicesPaymentCredentials = (TmsNetworkTokenServicesPaymentCredentials) o;
    return Objects.equals(this.enabled, tmsNetworkTokenServicesPaymentCredentials.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsNetworkTokenServicesPaymentCredentials {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
