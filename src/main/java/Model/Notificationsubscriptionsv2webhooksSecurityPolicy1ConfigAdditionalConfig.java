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
 * Additional, free form configuration data.
 */
@ApiModel(description = "Additional, free form configuration data.")

public class Notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig {
  @SerializedName("aud")
  private String aud = null;

  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("keyId")
  private String keyId = null;

  @SerializedName("scope")
  private String scope = null;

  public Notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig aud(String aud) {
    this.aud = aud;
    return this;
  }

   /**
   * Get aud
   * @return aud
  **/
  @ApiModelProperty(value = "")
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public Notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Get keyId
   * @return keyId
  **/
  @ApiModelProperty(value = "")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public Notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig = (Notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig) o;
    return Objects.equals(this.aud, notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig.aud) &&
        Objects.equals(this.clientId, notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig.clientId) &&
        Objects.equals(this.keyId, notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig.keyId) &&
        Objects.equals(this.scope, notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aud, clientId, keyId, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificationsubscriptionsv2webhooksSecurityPolicy1ConfigAdditionalConfig {\n");
    
    if (aud != null) sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    if (clientId != null) sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    if (keyId != null) sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    if (scope != null) sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

