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
 * TmsNetworkTokenServicesVisaTokenService
 */

public class TmsNetworkTokenServicesVisaTokenService {
  @SerializedName("enableService")
  private Boolean enableService = null;

  @SerializedName("enableTransactionalTokens")
  private Boolean enableTransactionalTokens = null;

  @SerializedName("tokenRequestorId")
  private String tokenRequestorId = null;

  @SerializedName("relationshipId")
  private String relationshipId = null;

  public TmsNetworkTokenServicesVisaTokenService enableService(Boolean enableService) {
    this.enableService = enableService;
    return this;
  }

   /**
   * Indicates if the service for network tokens for the Visa card association are enabled
   * @return enableService
  **/
  @ApiModelProperty(value = "Indicates if the service for network tokens for the Visa card association are enabled")
  public Boolean EnableService() {
    return enableService;
  }

  public void setEnableService(Boolean enableService) {
    this.enableService = enableService;
  }

  public TmsNetworkTokenServicesVisaTokenService enableTransactionalTokens(Boolean enableTransactionalTokens) {
    this.enableTransactionalTokens = enableTransactionalTokens;
    return this;
  }

   /**
   * Indicates if network tokens for the Visa card association are enabled for transactions
   * @return enableTransactionalTokens
  **/
  @ApiModelProperty(value = "Indicates if network tokens for the Visa card association are enabled for transactions")
  public Boolean EnableTransactionalTokens() {
    return enableTransactionalTokens;
  }

  public void setEnableTransactionalTokens(Boolean enableTransactionalTokens) {
    this.enableTransactionalTokens = enableTransactionalTokens;
  }

  public TmsNetworkTokenServicesVisaTokenService tokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
    return this;
  }

   /**
   * Token Requestor ID provided by Visa during the registration process for the Tokenization Service  Pattern: ^[0-9]{11}\\\\z$\&quot; Min Length: 11 Max Length: 11 Example:  \&quot;40000000082\&quot; 
   * @return tokenRequestorId
  **/
  @ApiModelProperty(value = "Token Requestor ID provided by Visa during the registration process for the Tokenization Service  Pattern: ^[0-9]{11}\\\\z$\" Min Length: 11 Max Length: 11 Example:  \"40000000082\" ")
  public String getTokenRequestorId() {
    return tokenRequestorId;
  }

  public void setTokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
  }

  public TmsNetworkTokenServicesVisaTokenService relationshipId(String relationshipId) {
    this.relationshipId = relationshipId;
    return this;
  }

   /**
   * Relationship ID provided by visa  Min Length: 1 Max Length: 100 Example: \&quot;24681921-40000000082\&quot; 
   * @return relationshipId
  **/
  @ApiModelProperty(value = "Relationship ID provided by visa  Min Length: 1 Max Length: 100 Example: \"24681921-40000000082\" ")
  public String getRelationshipId() {
    return relationshipId;
  }

  public void setRelationshipId(String relationshipId) {
    this.relationshipId = relationshipId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsNetworkTokenServicesVisaTokenService tmsNetworkTokenServicesVisaTokenService = (TmsNetworkTokenServicesVisaTokenService) o;
    return Objects.equals(this.enableService, tmsNetworkTokenServicesVisaTokenService.enableService) &&
        Objects.equals(this.enableTransactionalTokens, tmsNetworkTokenServicesVisaTokenService.enableTransactionalTokens) &&
        Objects.equals(this.tokenRequestorId, tmsNetworkTokenServicesVisaTokenService.tokenRequestorId) &&
        Objects.equals(this.relationshipId, tmsNetworkTokenServicesVisaTokenService.relationshipId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableService, enableTransactionalTokens, tokenRequestorId, relationshipId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsNetworkTokenServicesVisaTokenService {\n");
    
    if (enableService != null) sb.append("    enableService: ").append(toIndentedString(enableService)).append("\n");
    if (enableTransactionalTokens != null) sb.append("    enableTransactionalTokens: ").append(toIndentedString(enableTransactionalTokens)).append("\n");
    if (tokenRequestorId != null) sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
    if (relationshipId != null) sb.append("    relationshipId: ").append(toIndentedString(relationshipId)).append("\n");
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

