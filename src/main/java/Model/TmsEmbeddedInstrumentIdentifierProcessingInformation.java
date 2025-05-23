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
import Model.TmsAuthorizationOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsEmbeddedInstrumentIdentifierProcessingInformation
 */

public class TmsEmbeddedInstrumentIdentifierProcessingInformation {
  @SerializedName("authorizationOptions")
  private TmsAuthorizationOptions authorizationOptions = null;

  public TmsEmbeddedInstrumentIdentifierProcessingInformation authorizationOptions(TmsAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
    return this;
  }

   /**
   * Get authorizationOptions
   * @return authorizationOptions
  **/
  @ApiModelProperty(value = "")
  public TmsAuthorizationOptions getAuthorizationOptions() {
    return authorizationOptions;
  }

  public void setAuthorizationOptions(TmsAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsEmbeddedInstrumentIdentifierProcessingInformation tmsEmbeddedInstrumentIdentifierProcessingInformation = (TmsEmbeddedInstrumentIdentifierProcessingInformation) o;
    return Objects.equals(this.authorizationOptions, tmsEmbeddedInstrumentIdentifierProcessingInformation.authorizationOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsEmbeddedInstrumentIdentifierProcessingInformation {\n");
    
    if (authorizationOptions != null) sb.append("    authorizationOptions: ").append(toIndentedString(authorizationOptions)).append("\n");
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

