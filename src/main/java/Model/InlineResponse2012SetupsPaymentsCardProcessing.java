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
import Model.InlineResponse2012SetupsPaymentsCardProcessingConfigurationStatus;
import Model.InlineResponse2012SetupsPaymentsCardProcessingSubscriptionStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse2012SetupsPaymentsCardProcessing
 */

public class InlineResponse2012SetupsPaymentsCardProcessing {
  @SerializedName("subscriptionStatus")
  private InlineResponse2012SetupsPaymentsCardProcessingSubscriptionStatus subscriptionStatus = null;

  @SerializedName("configurationStatus")
  private InlineResponse2012SetupsPaymentsCardProcessingConfigurationStatus configurationStatus = null;

  public InlineResponse2012SetupsPaymentsCardProcessing subscriptionStatus(InlineResponse2012SetupsPaymentsCardProcessingSubscriptionStatus subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
    return this;
  }

   /**
   * Get subscriptionStatus
   * @return subscriptionStatus
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessingSubscriptionStatus getSubscriptionStatus() {
    return subscriptionStatus;
  }

  public void setSubscriptionStatus(InlineResponse2012SetupsPaymentsCardProcessingSubscriptionStatus subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
  }

  public InlineResponse2012SetupsPaymentsCardProcessing configurationStatus(InlineResponse2012SetupsPaymentsCardProcessingConfigurationStatus configurationStatus) {
    this.configurationStatus = configurationStatus;
    return this;
  }

   /**
   * Get configurationStatus
   * @return configurationStatus
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012SetupsPaymentsCardProcessingConfigurationStatus getConfigurationStatus() {
    return configurationStatus;
  }

  public void setConfigurationStatus(InlineResponse2012SetupsPaymentsCardProcessingConfigurationStatus configurationStatus) {
    this.configurationStatus = configurationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2012SetupsPaymentsCardProcessing inlineResponse2012SetupsPaymentsCardProcessing = (InlineResponse2012SetupsPaymentsCardProcessing) o;
    return Objects.equals(this.subscriptionStatus, inlineResponse2012SetupsPaymentsCardProcessing.subscriptionStatus) &&
        Objects.equals(this.configurationStatus, inlineResponse2012SetupsPaymentsCardProcessing.configurationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionStatus, configurationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2012SetupsPaymentsCardProcessing {\n");
    
    if (subscriptionStatus != null) sb.append("    subscriptionStatus: ").append(toIndentedString(subscriptionStatus)).append("\n");
    if (configurationStatus != null) sb.append("    configurationStatus: ").append(toIndentedString(configurationStatus)).append("\n");
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

