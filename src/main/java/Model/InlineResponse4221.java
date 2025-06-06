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
import Model.InlineResponse4007Details;
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
import org.joda.time.DateTime;

/**
 * InlineResponse4221
 */

public class InlineResponse4221 {
  @SerializedName("submitTimeUtc")
  private DateTime submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private List<InlineResponse4007Details> details = null;

   /**
   * Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(example = "2019-06-11T22:47:57.000Z", value = "Time of request in UTC. `Format: YYYY-MM-DDThh:mm:ssZ`  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. ")
  public DateTime getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public InlineResponse4221 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The http status description of the submitted request.
   * @return status
  **/
  @ApiModelProperty(example = "UNPROCESSABLE_ENTITY", value = "The http status description of the submitted request.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse4221 reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Documented reason codes. Client should be able to use the key for generating their own error message Possible Values:   - &#39;INVALID_DATA&#39; 
   * @return reason
  **/
  @ApiModelProperty(value = "Documented reason codes. Client should be able to use the key for generating their own error message Possible Values:   - 'INVALID_DATA' ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public InlineResponse4221 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Descriptive message for the error.
   * @return message
  **/
  @ApiModelProperty(value = "Descriptive message for the error.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse4221 details(List<InlineResponse4007Details> details) {
    this.details = details;
    return this;
  }

  public InlineResponse4221 addDetailsItem(InlineResponse4007Details detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<InlineResponse4007Details>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse4007Details> getDetails() {
    return details;
  }

  public void setDetails(List<InlineResponse4007Details> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4221 inlineResponse4221 = (InlineResponse4221) o;
    return Objects.equals(this.submitTimeUtc, inlineResponse4221.submitTimeUtc) &&
        Objects.equals(this.status, inlineResponse4221.status) &&
        Objects.equals(this.reason, inlineResponse4221.reason) &&
        Objects.equals(this.message, inlineResponse4221.message) &&
        Objects.equals(this.details, inlineResponse4221.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitTimeUtc, status, reason, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4221 {\n");
    
    if (submitTimeUtc != null) sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (reason != null) sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    if (message != null) sb.append("    message: ").append(toIndentedString(message)).append("\n");
    if (details != null) sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

