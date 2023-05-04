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
import Model.InlineResponse200PlanInformationBillingCycles;
import Model.InlineResponse200PlanInformationBillingPeriod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse200PlanInformation
 */

public class InlineResponse200PlanInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("billingPeriod")
  private InlineResponse200PlanInformationBillingPeriod billingPeriod = null;

  @SerializedName("billingCycles")
  private InlineResponse200PlanInformationBillingCycles billingCycles = null;

  public InlineResponse200PlanInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Plan code 
   * @return code
  **/
  @ApiModelProperty(value = "Plan code ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public InlineResponse200PlanInformation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Plan Status:  - &#x60;DRAFT&#x60;  - &#x60;ACTIVE&#x60;  - &#x60;INACTIVE&#x60; 
   * @return status
  **/
  @ApiModelProperty(value = "Plan Status:  - `DRAFT`  - `ACTIVE`  - `INACTIVE` ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse200PlanInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Plan name 
   * @return name
  **/
  @ApiModelProperty(value = "Plan name ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse200PlanInformation description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Plan description 
   * @return description
  **/
  @ApiModelProperty(value = "Plan description ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InlineResponse200PlanInformation billingPeriod(InlineResponse200PlanInformationBillingPeriod billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }

   /**
   * Get billingPeriod
   * @return billingPeriod
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200PlanInformationBillingPeriod getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(InlineResponse200PlanInformationBillingPeriod billingPeriod) {
    this.billingPeriod = billingPeriod;
  }

  public InlineResponse200PlanInformation billingCycles(InlineResponse200PlanInformationBillingCycles billingCycles) {
    this.billingCycles = billingCycles;
    return this;
  }

   /**
   * Get billingCycles
   * @return billingCycles
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200PlanInformationBillingCycles getBillingCycles() {
    return billingCycles;
  }

  public void setBillingCycles(InlineResponse200PlanInformationBillingCycles billingCycles) {
    this.billingCycles = billingCycles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200PlanInformation inlineResponse200PlanInformation = (InlineResponse200PlanInformation) o;
    return Objects.equals(this.code, inlineResponse200PlanInformation.code) &&
        Objects.equals(this.status, inlineResponse200PlanInformation.status) &&
        Objects.equals(this.name, inlineResponse200PlanInformation.name) &&
        Objects.equals(this.description, inlineResponse200PlanInformation.description) &&
        Objects.equals(this.billingPeriod, inlineResponse200PlanInformation.billingPeriod) &&
        Objects.equals(this.billingCycles, inlineResponse200PlanInformation.billingCycles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, status, name, description, billingPeriod, billingCycles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200PlanInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
    sb.append("    billingCycles: ").append(toIndentedString(billingCycles)).append("\n");
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
