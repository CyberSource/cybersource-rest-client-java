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
 * CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa
 */

public class CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa {
  @SerializedName("merchantId")
  private String merchantId = null;

  @SerializedName("segmentId")
  private String segmentId = null;

  @SerializedName("active")
  private Boolean active = null;

  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Visa merchant identified number
   * @return merchantId
  **/
  @ApiModelProperty(required = true, value = "Visa merchant identified number")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa segmentId(String segmentId) {
    this.segmentId = segmentId;
    return this;
  }

   /**
   * Visa assigned segment ID for each group of merchants participating in VAU.
   * @return segmentId
  **/
  @ApiModelProperty(required = true, value = "Visa assigned segment ID for each group of merchants participating in VAU.")
  public String getSegmentId() {
    return segmentId;
  }

  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }

  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean Active() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa = (CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa) o;
    return Objects.equals(this.merchantId, commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa.merchantId) &&
        Objects.equals(this.segmentId, commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa.segmentId) &&
        Objects.equals(this.active, commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, segmentId, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa {\n");
    
    if (merchantId != null) sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    if (segmentId != null) sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
    if (active != null) sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

