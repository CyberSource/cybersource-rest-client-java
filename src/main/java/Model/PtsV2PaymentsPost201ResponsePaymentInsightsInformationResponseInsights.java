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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T23:41:38.291+05:30")
public class PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights {
  @SerializedName("category")
  private String category = null;

  @SerializedName("categoryCode")
  private String categoryCode = null;

  public PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Categorization of response message from processor  Possible Values: - &#x60;APPROVED&#x60; - &#x60;ISSUER_WILL_NEVER_APPROVE&#x60; - &#x60;ISSUER_CANT_APPROVE_AT_THIS_TIME&#x60; - &#x60;ISSUER_CANT_APPROVE_WITH_THESE_DETAILS&#x60; - &#x60;GENERIC_ERROR&#x60; - &#x60;OTHERS&#x60; - &#x60;MATCH_NOT_FOUND&#x60; 
   * @return category
  **/
  @ApiModelProperty(value = "Categorization of response message from processor  Possible Values: - `APPROVED` - `ISSUER_WILL_NEVER_APPROVE` - `ISSUER_CANT_APPROVE_AT_THIS_TIME` - `ISSUER_CANT_APPROVE_WITH_THESE_DETAILS` - `GENERIC_ERROR` - `OTHERS` - `MATCH_NOT_FOUND` ")
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
   * Categorization Code of response message from processor  Possible Values: - &#x60;01&#x60; : Issuer Will Never Approve - &#x60;02&#x60; : Issuer Can&#39;t Approve at this Time - &#x60;03&#x60; : Issuer Can&#39;t Approve with these Details - &#x60;04&#x60; : Generic Error - &#x60;98&#x60; : Others - &#x60;99&#x60; : Payment Insights Response Category Match Not Found 
   * @return categoryCode
  **/
  @ApiModelProperty(value = "Categorization Code of response message from processor  Possible Values: - `01` : Issuer Will Never Approve - `02` : Issuer Can't Approve at this Time - `03` : Issuer Can't Approve with these Details - `04` : Generic Error - `98` : Others - `99` : Payment Insights Response Category Match Not Found ")
  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
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
        Objects.equals(this.categoryCode, ptsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights.categoryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, categoryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInsightsInformationResponseInsights {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
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
