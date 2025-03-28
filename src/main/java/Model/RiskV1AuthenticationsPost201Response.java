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
import Model.PtsV2IncrementalAuthorizationPatch201ResponseLinks;
import Model.RiskV1AuthenticationsPost201ResponseErrorInformation;
import Model.RiskV1DecisionsPost201ResponseClientReferenceInformation;
import Model.RiskV1DecisionsPost201ResponseConsumerAuthenticationInformation;
import Model.RiskV1DecisionsPost201ResponseOrderInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskV1AuthenticationsPost201Response
 */

public class RiskV1AuthenticationsPost201Response {
  @SerializedName("_links")
  private PtsV2IncrementalAuthorizationPatch201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("clientReferenceInformation")
  private RiskV1DecisionsPost201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("orderInformation")
  private RiskV1DecisionsPost201ResponseOrderInformation orderInformation = null;

  @SerializedName("consumerAuthenticationInformation")
  private RiskV1DecisionsPost201ResponseConsumerAuthenticationInformation consumerAuthenticationInformation = null;

  @SerializedName("errorInformation")
  private RiskV1AuthenticationsPost201ResponseErrorInformation errorInformation = null;

  public RiskV1AuthenticationsPost201Response links(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
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

  public RiskV1AuthenticationsPost201Response id(String id) {
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

  public RiskV1AuthenticationsPost201Response submitTimeUtc(String submitTimeUtc) {
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

  public RiskV1AuthenticationsPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status for payerAuthentication 201 enroll and validate calls. Possible values are: - &#x60;AUTHENTICATION_SUCCESSFUL&#x60; - &#x60;PENDING_AUTHENTICATION&#x60; - &#x60;AUTHENTICATION_FAILED&#x60; 
   * @return status
  **/
  @ApiModelProperty(value = "The status for payerAuthentication 201 enroll and validate calls. Possible values are: - `AUTHENTICATION_SUCCESSFUL` - `PENDING_AUTHENTICATION` - `AUTHENTICATION_FAILED` ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RiskV1AuthenticationsPost201Response message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The message describing the reason of the status. Value is: - The cardholder is enrolled in Payer Authentication. Please authenticate the cardholder before continuing with the transaction. 
   * @return message
  **/
  @ApiModelProperty(value = "The message describing the reason of the status. Value is: - The cardholder is enrolled in Payer Authentication. Please authenticate the cardholder before continuing with the transaction. ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RiskV1AuthenticationsPost201Response clientReferenceInformation(RiskV1DecisionsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(RiskV1DecisionsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public RiskV1AuthenticationsPost201Response orderInformation(RiskV1DecisionsPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(RiskV1DecisionsPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public RiskV1AuthenticationsPost201Response consumerAuthenticationInformation(RiskV1DecisionsPost201ResponseConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
    return this;
  }

   /**
   * Get consumerAuthenticationInformation
   * @return consumerAuthenticationInformation
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseConsumerAuthenticationInformation getConsumerAuthenticationInformation() {
    return consumerAuthenticationInformation;
  }

  public void setConsumerAuthenticationInformation(RiskV1DecisionsPost201ResponseConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
  }

  public RiskV1AuthenticationsPost201Response errorInformation(RiskV1AuthenticationsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public RiskV1AuthenticationsPost201ResponseErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(RiskV1AuthenticationsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1AuthenticationsPost201Response riskV1AuthenticationsPost201Response = (RiskV1AuthenticationsPost201Response) o;
    return Objects.equals(this.links, riskV1AuthenticationsPost201Response.links) &&
        Objects.equals(this.id, riskV1AuthenticationsPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, riskV1AuthenticationsPost201Response.submitTimeUtc) &&
        Objects.equals(this.status, riskV1AuthenticationsPost201Response.status) &&
        Objects.equals(this.message, riskV1AuthenticationsPost201Response.message) &&
        Objects.equals(this.clientReferenceInformation, riskV1AuthenticationsPost201Response.clientReferenceInformation) &&
        Objects.equals(this.orderInformation, riskV1AuthenticationsPost201Response.orderInformation) &&
        Objects.equals(this.consumerAuthenticationInformation, riskV1AuthenticationsPost201Response.consumerAuthenticationInformation) &&
        Objects.equals(this.errorInformation, riskV1AuthenticationsPost201Response.errorInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, message, clientReferenceInformation, orderInformation, consumerAuthenticationInformation, errorInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1AuthenticationsPost201Response {\n");
    
    if (links != null) sb.append("    links: ").append(toIndentedString(links)).append("\n");
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (submitTimeUtc != null) sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (message != null) sb.append("    message: ").append(toIndentedString(message)).append("\n");
    if (clientReferenceInformation != null) sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    if (orderInformation != null) sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    if (consumerAuthenticationInformation != null) sb.append("    consumerAuthenticationInformation: ").append(toIndentedString(consumerAuthenticationInformation)).append("\n");
    if (errorInformation != null) sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
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

