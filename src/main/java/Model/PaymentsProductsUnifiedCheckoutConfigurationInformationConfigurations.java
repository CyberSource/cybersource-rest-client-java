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
import Model.PaymentsProductsUnifiedCheckoutConfigurationInformationConfigurationsFeatures;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentsProductsUnifiedCheckoutConfigurationInformationConfigurations
 */

public class PaymentsProductsUnifiedCheckoutConfigurationInformationConfigurations {
  @SerializedName("features")
  private PaymentsProductsUnifiedCheckoutConfigurationInformationConfigurationsFeatures features = null;

  public PaymentsProductsUnifiedCheckoutConfigurationInformationConfigurations features(PaymentsProductsUnifiedCheckoutConfigurationInformationConfigurationsFeatures features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsUnifiedCheckoutConfigurationInformationConfigurationsFeatures getFeatures() {
    return features;
  }

  public void setFeatures(PaymentsProductsUnifiedCheckoutConfigurationInformationConfigurationsFeatures features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsProductsUnifiedCheckoutConfigurationInformationConfigurations paymentsProductsUnifiedCheckoutConfigurationInformationConfigurations = (PaymentsProductsUnifiedCheckoutConfigurationInformationConfigurations) o;
    return Objects.equals(this.features, paymentsProductsUnifiedCheckoutConfigurationInformationConfigurations.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsProductsUnifiedCheckoutConfigurationInformationConfigurations {\n");
    
    if (features != null) sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

