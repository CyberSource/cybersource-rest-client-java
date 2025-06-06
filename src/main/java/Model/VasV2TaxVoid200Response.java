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
import Model.PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation;
import Model.VasV2TaxVoid200ResponseVoidAmountDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VasV2TaxVoid200Response
 */

public class VasV2TaxVoid200Response {
  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("voidAmountDetails")
  private VasV2TaxVoid200ResponseVoidAmountDetails voidAmountDetails = null;

  public VasV2TaxVoid200Response id(String id) {
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

  public VasV2TaxVoid200Response submitTimeUtc(String submitTimeUtc) {
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

  public VasV2TaxVoid200Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - VOIDED  - CANCELLED  - FAILED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - VOIDED  - CANCELLED  - FAILED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public VasV2TaxVoid200Response clientReferenceInformation(PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public VasV2TaxVoid200Response voidAmountDetails(VasV2TaxVoid200ResponseVoidAmountDetails voidAmountDetails) {
    this.voidAmountDetails = voidAmountDetails;
    return this;
  }

   /**
   * Get voidAmountDetails
   * @return voidAmountDetails
  **/
  @ApiModelProperty(value = "")
  public VasV2TaxVoid200ResponseVoidAmountDetails getVoidAmountDetails() {
    return voidAmountDetails;
  }

  public void setVoidAmountDetails(VasV2TaxVoid200ResponseVoidAmountDetails voidAmountDetails) {
    this.voidAmountDetails = voidAmountDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VasV2TaxVoid200Response vasV2TaxVoid200Response = (VasV2TaxVoid200Response) o;
    return Objects.equals(this.id, vasV2TaxVoid200Response.id) &&
        Objects.equals(this.submitTimeUtc, vasV2TaxVoid200Response.submitTimeUtc) &&
        Objects.equals(this.status, vasV2TaxVoid200Response.status) &&
        Objects.equals(this.clientReferenceInformation, vasV2TaxVoid200Response.clientReferenceInformation) &&
        Objects.equals(this.voidAmountDetails, vasV2TaxVoid200Response.voidAmountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submitTimeUtc, status, clientReferenceInformation, voidAmountDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VasV2TaxVoid200Response {\n");
    
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (submitTimeUtc != null) sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (clientReferenceInformation != null) sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    if (voidAmountDetails != null) sb.append("    voidAmountDetails: ").append(toIndentedString(voidAmountDetails)).append("\n");
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

