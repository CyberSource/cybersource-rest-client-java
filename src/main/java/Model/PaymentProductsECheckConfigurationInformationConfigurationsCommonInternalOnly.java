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
import Model.PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnlyProcessors;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnly
 */

public class PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnly {
  @SerializedName("displayEcheckInfo")
  private Boolean displayEcheckInfo = true;

  @SerializedName("processors")
  private Map<String, PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnlyProcessors> processors = null;

  public PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnly displayEcheckInfo(Boolean displayEcheckInfo) {
    this.displayEcheckInfo = displayEcheckInfo;
    return this;
  }

   /**
   * *NEW* Used by EBC UI always set to true
   * @return displayEcheckInfo
  **/
  @ApiModelProperty(value = "*NEW* Used by EBC UI always set to true")
  public Boolean getDisplayEcheckInfo() {
    return displayEcheckInfo;
  }

  public void setDisplayEcheckInfo(Boolean displayEcheckInfo) {
    this.displayEcheckInfo = displayEcheckInfo;
  }

  public PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnly processors(Map<String, PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnlyProcessors> processors) {
    this.processors = processors;
    return this;
  }

  public PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnly putProcessorsItem(String key, PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnlyProcessors processorsItem) {
    if (this.processors == null) {
      this.processors = new HashMap<String, PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnlyProcessors>();
    }
    this.processors.put(key, processorsItem);
    return this;
  }

   /**
   * *NEW* Payment Processing connection used to support eCheck, aka ACH, payment methods. Example * \&quot;bofaach\&quot; * \&quot;wellsfargoach\&quot; 
   * @return processors
  **/
  @ApiModelProperty(value = "*NEW* Payment Processing connection used to support eCheck, aka ACH, payment methods. Example * \"bofaach\" * \"wellsfargoach\" ")
  public Map<String, PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnlyProcessors> getProcessors() {
    return processors;
  }

  public void setProcessors(Map<String, PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnlyProcessors> processors) {
    this.processors = processors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnly paymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnly = (PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnly) o;
    return Objects.equals(this.displayEcheckInfo, paymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnly.displayEcheckInfo) &&
        Objects.equals(this.processors, paymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnly.processors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayEcheckInfo, processors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProductsECheckConfigurationInformationConfigurationsCommonInternalOnly {\n");
    
    sb.append("    displayEcheckInfo: ").append(toIndentedString(displayEcheckInfo)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
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
