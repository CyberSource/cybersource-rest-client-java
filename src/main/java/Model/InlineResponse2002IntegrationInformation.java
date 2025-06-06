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
import Model.Boardingv1registrationsIntegrationInformationOauth2;
import Model.InlineResponse2002IntegrationInformationTenantConfigurations;
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

/**
 * InlineResponse2002IntegrationInformation
 */

public class InlineResponse2002IntegrationInformation {
  @SerializedName("oauth2")
  private List<Boardingv1registrationsIntegrationInformationOauth2> oauth2 = null;

  @SerializedName("tenantConfigurations")
  private List<InlineResponse2002IntegrationInformationTenantConfigurations> tenantConfigurations = null;

  public InlineResponse2002IntegrationInformation oauth2(List<Boardingv1registrationsIntegrationInformationOauth2> oauth2) {
    this.oauth2 = oauth2;
    return this;
  }

  public InlineResponse2002IntegrationInformation addOauth2Item(Boardingv1registrationsIntegrationInformationOauth2 oauth2Item) {
    if (this.oauth2 == null) {
      this.oauth2 = new ArrayList<Boardingv1registrationsIntegrationInformationOauth2>();
    }
    this.oauth2.add(oauth2Item);
    return this;
  }

   /**
   * Get oauth2
   * @return oauth2
  **/
  @ApiModelProperty(value = "")
  public List<Boardingv1registrationsIntegrationInformationOauth2> getOauth2() {
    return oauth2;
  }

  public void setOauth2(List<Boardingv1registrationsIntegrationInformationOauth2> oauth2) {
    this.oauth2 = oauth2;
  }

  public InlineResponse2002IntegrationInformation tenantConfigurations(List<InlineResponse2002IntegrationInformationTenantConfigurations> tenantConfigurations) {
    this.tenantConfigurations = tenantConfigurations;
    return this;
  }

  public InlineResponse2002IntegrationInformation addTenantConfigurationsItem(InlineResponse2002IntegrationInformationTenantConfigurations tenantConfigurationsItem) {
    if (this.tenantConfigurations == null) {
      this.tenantConfigurations = new ArrayList<InlineResponse2002IntegrationInformationTenantConfigurations>();
    }
    this.tenantConfigurations.add(tenantConfigurationsItem);
    return this;
  }

   /**
   * tenantConfigurations is an array of objects that includes the tenant information this merchant is associated with.
   * @return tenantConfigurations
  **/
  @ApiModelProperty(value = "tenantConfigurations is an array of objects that includes the tenant information this merchant is associated with.")
  public List<InlineResponse2002IntegrationInformationTenantConfigurations> getTenantConfigurations() {
    return tenantConfigurations;
  }

  public void setTenantConfigurations(List<InlineResponse2002IntegrationInformationTenantConfigurations> tenantConfigurations) {
    this.tenantConfigurations = tenantConfigurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002IntegrationInformation inlineResponse2002IntegrationInformation = (InlineResponse2002IntegrationInformation) o;
    return Objects.equals(this.oauth2, inlineResponse2002IntegrationInformation.oauth2) &&
        Objects.equals(this.tenantConfigurations, inlineResponse2002IntegrationInformation.tenantConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauth2, tenantConfigurations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002IntegrationInformation {\n");
    
    if (oauth2 != null) sb.append("    oauth2: ").append(toIndentedString(oauth2)).append("\n");
    if (tenantConfigurations != null) sb.append("    tenantConfigurations: ").append(toIndentedString(tenantConfigurations)).append("\n");
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

