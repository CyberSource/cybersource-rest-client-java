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
 * ReportingV3NetFundingsGet200ResponseNetFundingSummaries
 */

public class ReportingV3NetFundingsGet200ResponseNetFundingSummaries {
  @SerializedName("type")
  private String type = null;

  @SerializedName("paymentSubType")
  private String paymentSubType = null;

  @SerializedName("conveyedCount")
  private Integer conveyedCount = null;

  @SerializedName("conveyedAmount")
  private String conveyedAmount = null;

  @SerializedName("settledCount")
  private Integer settledCount = null;

  @SerializedName("fundedCount")
  private Integer fundedCount = null;

  @SerializedName("fundedAmount")
  private String fundedAmount = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  public ReportingV3NetFundingsGet200ResponseNetFundingSummaries type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Valid values: - PURCHASES - REFUNDS - FEES - CHARGEBACKS 
   * @return type
  **/
  @ApiModelProperty(example = "PURCHASES", value = "Valid values: - PURCHASES - REFUNDS - FEES - CHARGEBACKS ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ReportingV3NetFundingsGet200ResponseNetFundingSummaries paymentSubType(String paymentSubType) {
    this.paymentSubType = paymentSubType;
    return this;
  }

   /**
   * Get paymentSubType
   * @return paymentSubType
  **/
  @ApiModelProperty(example = "VI", value = "")
  public String getPaymentSubType() {
    return paymentSubType;
  }

  public void setPaymentSubType(String paymentSubType) {
    this.paymentSubType = paymentSubType;
  }

  public ReportingV3NetFundingsGet200ResponseNetFundingSummaries conveyedCount(Integer conveyedCount) {
    this.conveyedCount = conveyedCount;
    return this;
  }

   /**
   * Get conveyedCount
   * @return conveyedCount
  **/
  @ApiModelProperty(example = "10", value = "")
  public Integer getConveyedCount() {
    return conveyedCount;
  }

  public void setConveyedCount(Integer conveyedCount) {
    this.conveyedCount = conveyedCount;
  }

  public ReportingV3NetFundingsGet200ResponseNetFundingSummaries conveyedAmount(String conveyedAmount) {
    this.conveyedAmount = conveyedAmount;
    return this;
  }

   /**
   * Get conveyedAmount
   * @return conveyedAmount
  **/
  @ApiModelProperty(example = "100.50", value = "")
  public String getConveyedAmount() {
    return conveyedAmount;
  }

  public void setConveyedAmount(String conveyedAmount) {
    this.conveyedAmount = conveyedAmount;
  }

  public ReportingV3NetFundingsGet200ResponseNetFundingSummaries settledCount(Integer settledCount) {
    this.settledCount = settledCount;
    return this;
  }

   /**
   * Get settledCount
   * @return settledCount
  **/
  @ApiModelProperty(example = "10", value = "")
  public Integer getSettledCount() {
    return settledCount;
  }

  public void setSettledCount(Integer settledCount) {
    this.settledCount = settledCount;
  }

  public ReportingV3NetFundingsGet200ResponseNetFundingSummaries fundedCount(Integer fundedCount) {
    this.fundedCount = fundedCount;
    return this;
  }

   /**
   * Get fundedCount
   * @return fundedCount
  **/
  @ApiModelProperty(example = "10", value = "")
  public Integer getFundedCount() {
    return fundedCount;
  }

  public void setFundedCount(Integer fundedCount) {
    this.fundedCount = fundedCount;
  }

  public ReportingV3NetFundingsGet200ResponseNetFundingSummaries fundedAmount(String fundedAmount) {
    this.fundedAmount = fundedAmount;
    return this;
  }

   /**
   * Get fundedAmount
   * @return fundedAmount
  **/
  @ApiModelProperty(example = "150.50", value = "")
  public String getFundedAmount() {
    return fundedAmount;
  }

  public void setFundedAmount(String fundedAmount) {
    this.fundedAmount = fundedAmount;
  }

  public ReportingV3NetFundingsGet200ResponseNetFundingSummaries currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Valid ISO 4217 ALPHA-3 currency code
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "Valid ISO 4217 ALPHA-3 currency code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3NetFundingsGet200ResponseNetFundingSummaries reportingV3NetFundingsGet200ResponseNetFundingSummaries = (ReportingV3NetFundingsGet200ResponseNetFundingSummaries) o;
    return Objects.equals(this.type, reportingV3NetFundingsGet200ResponseNetFundingSummaries.type) &&
        Objects.equals(this.paymentSubType, reportingV3NetFundingsGet200ResponseNetFundingSummaries.paymentSubType) &&
        Objects.equals(this.conveyedCount, reportingV3NetFundingsGet200ResponseNetFundingSummaries.conveyedCount) &&
        Objects.equals(this.conveyedAmount, reportingV3NetFundingsGet200ResponseNetFundingSummaries.conveyedAmount) &&
        Objects.equals(this.settledCount, reportingV3NetFundingsGet200ResponseNetFundingSummaries.settledCount) &&
        Objects.equals(this.fundedCount, reportingV3NetFundingsGet200ResponseNetFundingSummaries.fundedCount) &&
        Objects.equals(this.fundedAmount, reportingV3NetFundingsGet200ResponseNetFundingSummaries.fundedAmount) &&
        Objects.equals(this.currencyCode, reportingV3NetFundingsGet200ResponseNetFundingSummaries.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, paymentSubType, conveyedCount, conveyedAmount, settledCount, fundedCount, fundedAmount, currencyCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3NetFundingsGet200ResponseNetFundingSummaries {\n");
    
    if (type != null) sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (paymentSubType != null) sb.append("    paymentSubType: ").append(toIndentedString(paymentSubType)).append("\n");
    if (conveyedCount != null) sb.append("    conveyedCount: ").append(toIndentedString(conveyedCount)).append("\n");
    if (conveyedAmount != null) sb.append("    conveyedAmount: ").append(toIndentedString(conveyedAmount)).append("\n");
    if (settledCount != null) sb.append("    settledCount: ").append(toIndentedString(settledCount)).append("\n");
    if (fundedCount != null) sb.append("    fundedCount: ").append(toIndentedString(fundedCount)).append("\n");
    if (fundedAmount != null) sb.append("    fundedAmount: ").append(toIndentedString(fundedAmount)).append("\n");
    if (currencyCode != null) sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

