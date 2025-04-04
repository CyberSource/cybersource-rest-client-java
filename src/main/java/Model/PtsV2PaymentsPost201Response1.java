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
import Model.PtsV2PaymentsPost201Response1ErrorInformation;
import Model.PtsV2PaymentsPost201Response1IssuerInformation;
import Model.PtsV2PaymentsPost201Response1OrderInformation;
import Model.PtsV2PaymentsPost201Response1PaymentInformation;
import Model.PtsV2PaymentsPost201Response1ProcessorInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201Response1
 */

public class PtsV2PaymentsPost201Response1 {
  @SerializedName("id")
  private String id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("processorInformation")
  private PtsV2PaymentsPost201Response1ProcessorInformation processorInformation = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("paymentInformation")
  private PtsV2PaymentsPost201Response1PaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private PtsV2PaymentsPost201Response1OrderInformation orderInformation = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("issuerInformation")
  private PtsV2PaymentsPost201Response1IssuerInformation issuerInformation = null;

  @SerializedName("errorInformation")
  private PtsV2PaymentsPost201Response1ErrorInformation errorInformation = null;

  public PtsV2PaymentsPost201Response1 id(String id) {
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

  public PtsV2PaymentsPost201Response1 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - AUTHORIZED  - PARTIAL_AUTHORIZED  - AUTHORIZED_PENDING_REVIEW  - AUTHORIZED_RISK_DECLINED  - PENDING_AUTHENTICATION  - PENDING_REVIEW  - DECLINED  - INVALID_REQUEST 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - AUTHORIZED  - PARTIAL_AUTHORIZED  - AUTHORIZED_PENDING_REVIEW  - AUTHORIZED_RISK_DECLINED  - PENDING_AUTHENTICATION  - PENDING_REVIEW  - DECLINED  - INVALID_REQUEST ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PtsV2PaymentsPost201Response1 submitTimeUtc(String submitTimeUtc) {
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

  public PtsV2PaymentsPost201Response1 processorInformation(PtsV2PaymentsPost201Response1ProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201Response1ProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(PtsV2PaymentsPost201Response1ProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public PtsV2PaymentsPost201Response1 reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Reference number for the transaction. Depending on how your Cybersource account is configured, this value could either be provided in the API request or generated by CyberSource. The actual value used in the request to the processor is provided back to you by Cybersource in the response. 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Reference number for the transaction. Depending on how your Cybersource account is configured, this value could either be provided in the API request or generated by CyberSource. The actual value used in the request to the processor is provided back to you by Cybersource in the response. ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public PtsV2PaymentsPost201Response1 paymentInformation(PtsV2PaymentsPost201Response1PaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201Response1PaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(PtsV2PaymentsPost201Response1PaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public PtsV2PaymentsPost201Response1 orderInformation(PtsV2PaymentsPost201Response1OrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201Response1OrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(PtsV2PaymentsPost201Response1OrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public PtsV2PaymentsPost201Response1 clientReferenceInformation(PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation) {
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

  public PtsV2PaymentsPost201Response1 issuerInformation(PtsV2PaymentsPost201Response1IssuerInformation issuerInformation) {
    this.issuerInformation = issuerInformation;
    return this;
  }

   /**
   * Get issuerInformation
   * @return issuerInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201Response1IssuerInformation getIssuerInformation() {
    return issuerInformation;
  }

  public void setIssuerInformation(PtsV2PaymentsPost201Response1IssuerInformation issuerInformation) {
    this.issuerInformation = issuerInformation;
  }

  public PtsV2PaymentsPost201Response1 errorInformation(PtsV2PaymentsPost201Response1ErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201Response1ErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(PtsV2PaymentsPost201Response1ErrorInformation errorInformation) {
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
    PtsV2PaymentsPost201Response1 ptsV2PaymentsPost201Response1 = (PtsV2PaymentsPost201Response1) o;
    return Objects.equals(this.id, ptsV2PaymentsPost201Response1.id) &&
        Objects.equals(this.status, ptsV2PaymentsPost201Response1.status) &&
        Objects.equals(this.submitTimeUtc, ptsV2PaymentsPost201Response1.submitTimeUtc) &&
        Objects.equals(this.processorInformation, ptsV2PaymentsPost201Response1.processorInformation) &&
        Objects.equals(this.reconciliationId, ptsV2PaymentsPost201Response1.reconciliationId) &&
        Objects.equals(this.paymentInformation, ptsV2PaymentsPost201Response1.paymentInformation) &&
        Objects.equals(this.orderInformation, ptsV2PaymentsPost201Response1.orderInformation) &&
        Objects.equals(this.clientReferenceInformation, ptsV2PaymentsPost201Response1.clientReferenceInformation) &&
        Objects.equals(this.issuerInformation, ptsV2PaymentsPost201Response1.issuerInformation) &&
        Objects.equals(this.errorInformation, ptsV2PaymentsPost201Response1.errorInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, submitTimeUtc, processorInformation, reconciliationId, paymentInformation, orderInformation, clientReferenceInformation, issuerInformation, errorInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201Response1 {\n");
    
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (submitTimeUtc != null) sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    if (processorInformation != null) sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    if (reconciliationId != null) sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    if (paymentInformation != null) sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    if (orderInformation != null) sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    if (clientReferenceInformation != null) sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    if (issuerInformation != null) sb.append("    issuerInformation: ").append(toIndentedString(issuerInformation)).append("\n");
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

