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
 * CommerceSolutionsProductsBinLookupConfigurationInformationConfigurations
 */

public class CommerceSolutionsProductsBinLookupConfigurationInformationConfigurations {
  @SerializedName("isPayoutOptionsEnabled")
  private Boolean isPayoutOptionsEnabled = null;

  @SerializedName("isAccountPrefixEnabled")
  private Boolean isAccountPrefixEnabled = null;

  public CommerceSolutionsProductsBinLookupConfigurationInformationConfigurations isPayoutOptionsEnabled(Boolean isPayoutOptionsEnabled) {
    this.isPayoutOptionsEnabled = isPayoutOptionsEnabled;
    return this;
  }

   /**
   * This flag indicates if the merchant is configured to make payout calls
   * @return isPayoutOptionsEnabled
  **/
  @ApiModelProperty(value = "This flag indicates if the merchant is configured to make payout calls")
  public Boolean getIsPayoutOptionsEnabled() {
    return isPayoutOptionsEnabled;
  }

  public void setIsPayoutOptionsEnabled(Boolean isPayoutOptionsEnabled) {
    this.isPayoutOptionsEnabled = isPayoutOptionsEnabled;
  }

  public CommerceSolutionsProductsBinLookupConfigurationInformationConfigurations isAccountPrefixEnabled(Boolean isAccountPrefixEnabled) {
    this.isAccountPrefixEnabled = isAccountPrefixEnabled;
    return this;
  }

   /**
   * This flag indicates if the merchant is configured to receive account prefix
   * @return isAccountPrefixEnabled
  **/
  @ApiModelProperty(value = "This flag indicates if the merchant is configured to receive account prefix")
  public Boolean getIsAccountPrefixEnabled() {
    return isAccountPrefixEnabled;
  }

  public void setIsAccountPrefixEnabled(Boolean isAccountPrefixEnabled) {
    this.isAccountPrefixEnabled = isAccountPrefixEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceSolutionsProductsBinLookupConfigurationInformationConfigurations commerceSolutionsProductsBinLookupConfigurationInformationConfigurations = (CommerceSolutionsProductsBinLookupConfigurationInformationConfigurations) o;
    return Objects.equals(this.isPayoutOptionsEnabled, commerceSolutionsProductsBinLookupConfigurationInformationConfigurations.isPayoutOptionsEnabled) &&
        Objects.equals(this.isAccountPrefixEnabled, commerceSolutionsProductsBinLookupConfigurationInformationConfigurations.isAccountPrefixEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPayoutOptionsEnabled, isAccountPrefixEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommerceSolutionsProductsBinLookupConfigurationInformationConfigurations {\n");
    
    sb.append("    isPayoutOptionsEnabled: ").append(toIndentedString(isPayoutOptionsEnabled)).append("\n");
    sb.append("    isAccountPrefixEnabled: ").append(toIndentedString(isAccountPrefixEnabled)).append("\n");
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
