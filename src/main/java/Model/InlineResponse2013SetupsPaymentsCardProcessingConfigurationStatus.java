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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus
 */

public class InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus {
  @SerializedName("configurationId")
  private UUID configurationId = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("details")
  private List<Map<String, String>> details = null;

  @SerializedName("message")
  private String message = null;

  public InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus configurationId(UUID configurationId) {
    this.configurationId = configurationId;
    return this;
  }

   /**
   * This is NOT for MVP
   * @return configurationId
  **/
  @ApiModelProperty(value = "This is NOT for MVP")
  public UUID getConfigurationId() {
    return configurationId;
  }

  public void setConfigurationId(UUID configurationId) {
    this.configurationId = configurationId;
  }

  public InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. `Format: YYYY-MM-DDThh:mm:ssZ`  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Possible values: - SUCCESS - PARTIAL - PENDING - NOT_SETUP
   * @return status
  **/
  @ApiModelProperty(value = "Possible values: - SUCCESS - PARTIAL - PENDING - NOT_SETUP")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Possible values: - PENDING_PROVISIONING_PROCESS - MISSING_DATA - INVALID_DATA - DUPLICATE_FIELD - NOT_APPLICABLE
   * @return reason
  **/
  @ApiModelProperty(value = "Possible values: - PENDING_PROVISIONING_PROCESS - MISSING_DATA - INVALID_DATA - DUPLICATE_FIELD - NOT_APPLICABLE")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus details(List<Map<String, String>> details) {
    this.details = details;
    return this;
  }

  public InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus addDetailsItem(Map<String, String> detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<Map<String, String>>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<Map<String, String>> getDetails() {
    return details;
  }

  public void setDetails(List<Map<String, String>> details) {
    this.details = details;
  }

  public InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus inlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus = (InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus) o;
    return Objects.equals(this.configurationId, inlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus.configurationId) &&
        Objects.equals(this.version, inlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus.version) &&
        Objects.equals(this.submitTimeUtc, inlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus.submitTimeUtc) &&
        Objects.equals(this.status, inlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus.status) &&
        Objects.equals(this.reason, inlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus.reason) &&
        Objects.equals(this.details, inlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus.details) &&
        Objects.equals(this.message, inlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationId, version, submitTimeUtc, status, reason, details, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2013SetupsPaymentsCardProcessingConfigurationStatus {\n");
    
    if (configurationId != null) sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    if (version != null) sb.append("    version: ").append(toIndentedString(version)).append("\n");
    if (submitTimeUtc != null) sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (reason != null) sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    if (details != null) sb.append("    details: ").append(toIndentedString(details)).append("\n");
    if (message != null) sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

