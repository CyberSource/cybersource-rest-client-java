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
 * TmsNetworkTokenServicesMastercardDigitalEnablementService
 */

public class TmsNetworkTokenServicesMastercardDigitalEnablementService {
  @SerializedName("enableService")
  private Boolean enableService = null;

  @SerializedName("enableTransactionalTokens")
  private Boolean enableTransactionalTokens = null;

  @SerializedName("tokenRequestorId")
  private String tokenRequestorId = null;

  public TmsNetworkTokenServicesMastercardDigitalEnablementService enableService(Boolean enableService) {
    this.enableService = enableService;
    return this;
  }

   /**
   * Indicates if the service for network tokens for the Mastercard card association are enabled
   * @return enableService
  **/
  @ApiModelProperty(value = "Indicates if the service for network tokens for the Mastercard card association are enabled")
  public Boolean isEnableService() {
    return enableService;
  }

  public void setEnableService(Boolean enableService) {
    this.enableService = enableService;
  }

  public TmsNetworkTokenServicesMastercardDigitalEnablementService enableTransactionalTokens(Boolean enableTransactionalTokens) {
    this.enableTransactionalTokens = enableTransactionalTokens;
    return this;
  }

   /**
   * Indicates if network tokens for the Mastercard card association are enabled for transactions
   * @return enableTransactionalTokens
  **/
  @ApiModelProperty(value = "Indicates if network tokens for the Mastercard card association are enabled for transactions")
  public Boolean isEnableTransactionalTokens() {
    return enableTransactionalTokens;
  }

  public void setEnableTransactionalTokens(Boolean enableTransactionalTokens) {
    this.enableTransactionalTokens = enableTransactionalTokens;
  }

  public TmsNetworkTokenServicesMastercardDigitalEnablementService tokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
    return this;
  }

   /**
   * Token Requestor ID provided by Mastercard during the registration process for the Tokenization Service  Pattern: ^[0-9]{11}\\\\z$\&quot; Min Length: 11 Max Length: 11 Example:  \&quot;50162233570\&quot; 
   * @return tokenRequestorId
  **/
  @ApiModelProperty(value = "Token Requestor ID provided by Mastercard during the registration process for the Tokenization Service  Pattern: ^[0-9]{11}\\\\z$\" Min Length: 11 Max Length: 11 Example:  \"50162233570\" ")
  public String getTokenRequestorId() {
    return tokenRequestorId;
  }

  public void setTokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsNetworkTokenServicesMastercardDigitalEnablementService tmsNetworkTokenServicesMastercardDigitalEnablementService = (TmsNetworkTokenServicesMastercardDigitalEnablementService) o;
    return Objects.equals(this.enableService, tmsNetworkTokenServicesMastercardDigitalEnablementService.enableService) &&
        Objects.equals(this.enableTransactionalTokens, tmsNetworkTokenServicesMastercardDigitalEnablementService.enableTransactionalTokens) &&
        Objects.equals(this.tokenRequestorId, tmsNetworkTokenServicesMastercardDigitalEnablementService.tokenRequestorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableService, enableTransactionalTokens, tokenRequestorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsNetworkTokenServicesMastercardDigitalEnablementService {\n");
    
    sb.append("    enableService: ").append(toIndentedString(enableService)).append("\n");
    sb.append("    enableTransactionalTokens: ").append(toIndentedString(enableTransactionalTokens)).append("\n");
    sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
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
