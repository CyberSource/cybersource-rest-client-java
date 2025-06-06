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
 * PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights
 */

public class PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights {
  @SerializedName("category")
  private String category = null;

  @SerializedName("categoryCode")
  private String categoryCode = null;

  @SerializedName("processorRawName")
  private String processorRawName = null;

  public PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Categorization of response message from processor  Possible Values: - &#x60;ISSUER_WILL_NEVER_APPROVE&#x60; - &#x60;ISSUER_CANNOT_APPROVE_AT_THIS_TIME&#x60; - &#x60;ISSUER_CANNOT_APPROVE_WITH_THESE_DETAILS&#x60; - &#x60;GENERIC_ERROR&#x60; - &#x60;PAYMENT_INSIGHTS_INTERNAL_ERROR&#x60; - &#x60;OTHERS&#x60; - &#x60;PAYMENT_INSIGHTS_RESPONSE_CATEGORY_MATCH_NOT_FOUND&#x60; 
   * @return category
  **/
  @ApiModelProperty(value = "Categorization of response message from processor  Possible Values: - `ISSUER_WILL_NEVER_APPROVE` - `ISSUER_CANNOT_APPROVE_AT_THIS_TIME` - `ISSUER_CANNOT_APPROVE_WITH_THESE_DETAILS` - `GENERIC_ERROR` - `PAYMENT_INSIGHTS_INTERNAL_ERROR` - `OTHERS` - `PAYMENT_INSIGHTS_RESPONSE_CATEGORY_MATCH_NOT_FOUND` ")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights categoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * Categorization Code of response message from processor  Possible Values: - &#x60;01&#x60; : ISSUER_WILL_NEVER_APPROVE - &#x60;02&#x60; : ISSUER_CANNOT_APPROVE_AT_THIS_TIME - &#x60;03&#x60; : ISSUER_CANNOT_APPROVE_WITH_THESE_DETAILS - &#x60;04&#x60; : GENERIC_ERROR - &#x60;97&#x60; : PAYMENT_INSIGHTS_INTERNAL_ERROR - &#x60;98&#x60; : OTHERS - &#x60;99&#x60; : PAYMENT_INSIGHTS_RESPONSE_CATEGORY_MATCH_NOT_FOUND 
   * @return categoryCode
  **/
  @ApiModelProperty(value = "Categorization Code of response message from processor  Possible Values: - `01` : ISSUER_WILL_NEVER_APPROVE - `02` : ISSUER_CANNOT_APPROVE_AT_THIS_TIME - `03` : ISSUER_CANNOT_APPROVE_WITH_THESE_DETAILS - `04` : GENERIC_ERROR - `97` : PAYMENT_INSIGHTS_INTERNAL_ERROR - `98` : OTHERS - `99` : PAYMENT_INSIGHTS_RESPONSE_CATEGORY_MATCH_NOT_FOUND ")
  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights processorRawName(String processorRawName) {
    this.processorRawName = processorRawName;
    return this;
  }

   /**
   * Raw name of the processor used for the transaction processing, especially useful during acquirer swing to see which processor transaction settled with 
   * @return processorRawName
  **/
  @ApiModelProperty(value = "Raw name of the processor used for the transaction processing, especially useful during acquirer swing to see which processor transaction settled with ")
  public String getProcessorRawName() {
    return processorRawName;
  }

  public void setProcessorRawName(String processorRawName) {
    this.processorRawName = processorRawName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights ptsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights = (PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights) o;
    return Objects.equals(this.category, ptsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights.category) &&
        Objects.equals(this.categoryCode, ptsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights.categoryCode) &&
        Objects.equals(this.processorRawName, ptsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights.processorRawName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, categoryCode, processorRawName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights {\n");
    
    if (category != null) sb.append("    category: ").append(toIndentedString(category)).append("\n");
    if (categoryCode != null) sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    if (processorRawName != null) sb.append("    processorRawName: ").append(toIndentedString(processorRawName)).append("\n");
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

