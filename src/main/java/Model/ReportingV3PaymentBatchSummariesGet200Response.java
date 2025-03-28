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
import Model.ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries;
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
 * ReportingV3PaymentBatchSummariesGet200Response
 */

public class ReportingV3PaymentBatchSummariesGet200Response {
  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("endTime")
  private DateTime endTime = null;

  @SerializedName("paymentBatchSummaries")
  private List<ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries> paymentBatchSummaries = null;

  public ReportingV3PaymentBatchSummariesGet200Response startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public ReportingV3PaymentBatchSummariesGet200Response endTime(DateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public DateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(DateTime endTime) {
    this.endTime = endTime;
  }

  public ReportingV3PaymentBatchSummariesGet200Response paymentBatchSummaries(List<ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries> paymentBatchSummaries) {
    this.paymentBatchSummaries = paymentBatchSummaries;
    return this;
  }

  public ReportingV3PaymentBatchSummariesGet200Response addPaymentBatchSummariesItem(ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries paymentBatchSummariesItem) {
    if (this.paymentBatchSummaries == null) {
      this.paymentBatchSummaries = new ArrayList<ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries>();
    }
    this.paymentBatchSummaries.add(paymentBatchSummariesItem);
    return this;
  }

   /**
   * Get paymentBatchSummaries
   * @return paymentBatchSummaries
  **/
  @ApiModelProperty(value = "")
  public List<ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries> getPaymentBatchSummaries() {
    return paymentBatchSummaries;
  }

  public void setPaymentBatchSummaries(List<ReportingV3PaymentBatchSummariesGet200ResponsePaymentBatchSummaries> paymentBatchSummaries) {
    this.paymentBatchSummaries = paymentBatchSummaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3PaymentBatchSummariesGet200Response reportingV3PaymentBatchSummariesGet200Response = (ReportingV3PaymentBatchSummariesGet200Response) o;
    return Objects.equals(this.startTime, reportingV3PaymentBatchSummariesGet200Response.startTime) &&
        Objects.equals(this.endTime, reportingV3PaymentBatchSummariesGet200Response.endTime) &&
        Objects.equals(this.paymentBatchSummaries, reportingV3PaymentBatchSummariesGet200Response.paymentBatchSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, paymentBatchSummaries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3PaymentBatchSummariesGet200Response {\n");
    
    if (startTime != null) sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    if (endTime != null) sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    if (paymentBatchSummaries != null) sb.append("    paymentBatchSummaries: ").append(toIndentedString(paymentBatchSummaries)).append("\n");
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

