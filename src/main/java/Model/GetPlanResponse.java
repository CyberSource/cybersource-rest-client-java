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
import Model.GetAllPlansResponseOrderInformation;
import Model.GetAllPlansResponsePlanInformation;
import Model.PtsV2IncrementalAuthorizationPatch201ResponseLinks;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetPlanResponse
 */

public class GetPlanResponse {
  @SerializedName("_links")
  private PtsV2IncrementalAuthorizationPatch201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("planInformation")
  private GetAllPlansResponsePlanInformation planInformation = null;

  @SerializedName("orderInformation")
  private GetAllPlansResponseOrderInformation orderInformation = null;

  public GetPlanResponse links(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
  }

  public GetPlanResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GetPlanResponse submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public GetPlanResponse planInformation(GetAllPlansResponsePlanInformation planInformation) {
    this.planInformation = planInformation;
    return this;
  }

   /**
   * Get planInformation
   * @return planInformation
  **/
  @ApiModelProperty(value = "")
  public GetAllPlansResponsePlanInformation getPlanInformation() {
    return planInformation;
  }

  public void setPlanInformation(GetAllPlansResponsePlanInformation planInformation) {
    this.planInformation = planInformation;
  }

  public GetPlanResponse orderInformation(GetAllPlansResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public GetAllPlansResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(GetAllPlansResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPlanResponse getPlanResponse = (GetPlanResponse) o;
    return Objects.equals(this.links, getPlanResponse.links) &&
        Objects.equals(this.id, getPlanResponse.id) &&
        Objects.equals(this.submitTimeUtc, getPlanResponse.submitTimeUtc) &&
        Objects.equals(this.planInformation, getPlanResponse.planInformation) &&
        Objects.equals(this.orderInformation, getPlanResponse.orderInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, planInformation, orderInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPlanResponse {\n");
    
    if (links != null) sb.append("    links: ").append(toIndentedString(links)).append("\n");
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (submitTimeUtc != null) sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    if (planInformation != null) sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
    if (orderInformation != null) sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
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

