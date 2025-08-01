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
import org.joda.time.DateTime;

/**
 * InlineResponse2013IntegrationInformationTenantConfigurations
 */

public class InlineResponse2013IntegrationInformationTenantConfigurations {
  @SerializedName("solutionId")
  private String solutionId = null;

  @SerializedName("tenantConfigurationId")
  private String tenantConfigurationId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("submitTimeUtc")
  private DateTime submitTimeUtc = null;

  public InlineResponse2013IntegrationInformationTenantConfigurations solutionId(String solutionId) {
    this.solutionId = solutionId;
    return this;
  }

   /**
   * The solutionId is the unique identifier for this system resource. Partner can use it to reference the specific solution through out the system. 
   * @return solutionId
  **/
  @ApiModelProperty(example = "YumSolution1", value = "The solutionId is the unique identifier for this system resource. Partner can use it to reference the specific solution through out the system. ")
  public String getSolutionId() {
    return solutionId;
  }

  public void setSolutionId(String solutionId) {
    this.solutionId = solutionId;
  }

  public InlineResponse2013IntegrationInformationTenantConfigurations tenantConfigurationId(String tenantConfigurationId) {
    this.tenantConfigurationId = tenantConfigurationId;
    return this;
  }

   /**
   * The tenantConfigurationId is the unique identifier for this system resource. You will see various places where it must be referenced in the URI path, or when querying the hierarchy for ancestors or descendants. 
   * @return tenantConfigurationId
  **/
  @ApiModelProperty(value = "The tenantConfigurationId is the unique identifier for this system resource. You will see various places where it must be referenced in the URI path, or when querying the hierarchy for ancestors or descendants. ")
  public String getTenantConfigurationId() {
    return tenantConfigurationId;
  }

  public void setTenantConfigurationId(String tenantConfigurationId) {
    this.tenantConfigurationId = tenantConfigurationId;
  }

  public InlineResponse2013IntegrationInformationTenantConfigurations status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Possible values: - LIVE - INACTIVE - TEST
   * @return status
  **/
  @ApiModelProperty(value = "Possible values: - LIVE - INACTIVE - TEST")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse2013IntegrationInformationTenantConfigurations submitTimeUtc(DateTime submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC.
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC.")
  public DateTime getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(DateTime submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2013IntegrationInformationTenantConfigurations inlineResponse2013IntegrationInformationTenantConfigurations = (InlineResponse2013IntegrationInformationTenantConfigurations) o;
    return Objects.equals(this.solutionId, inlineResponse2013IntegrationInformationTenantConfigurations.solutionId) &&
        Objects.equals(this.tenantConfigurationId, inlineResponse2013IntegrationInformationTenantConfigurations.tenantConfigurationId) &&
        Objects.equals(this.status, inlineResponse2013IntegrationInformationTenantConfigurations.status) &&
        Objects.equals(this.submitTimeUtc, inlineResponse2013IntegrationInformationTenantConfigurations.submitTimeUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solutionId, tenantConfigurationId, status, submitTimeUtc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2013IntegrationInformationTenantConfigurations {\n");
    
    if (solutionId != null) sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    if (tenantConfigurationId != null) sb.append("    tenantConfigurationId: ").append(toIndentedString(tenantConfigurationId)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (submitTimeUtc != null) sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
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

