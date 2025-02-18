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
import Model.PushFunds201ResponseProcessorInformationRouting;
import Model.PushFunds201ResponseProcessorInformationSettlement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PushFunds201ResponseProcessorInformation
 */

public class PushFunds201ResponseProcessorInformation {
  @SerializedName("transactionId")
  private Integer transactionId = null;

  @SerializedName("responseCode")
  private String responseCode = null;

  @SerializedName("systemTraceAuditNumber")
  private String systemTraceAuditNumber = null;

  @SerializedName("retrievalReferenceNumber")
  private String retrievalReferenceNumber = null;

  @SerializedName("actionCode")
  private String actionCode = null;

  @SerializedName("approvalCode")
  private String approvalCode = null;

  @SerializedName("feeProgramIndicator")
  private String feeProgramIndicator = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("routing")
  private PushFunds201ResponseProcessorInformationRouting routing = null;

  @SerializedName("settlement")
  private PushFunds201ResponseProcessorInformationSettlement settlement = null;

  public PushFunds201ResponseProcessorInformation transactionId(Integer transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Network transaction identifier (TID). This value can be used to identify a specific transaction when you are discussing the transaction with your processor. 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Network transaction identifier (TID). This value can be used to identify a specific transaction when you are discussing the transaction with your processor. ")
  public Integer getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }

  public PushFunds201ResponseProcessorInformation responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Transaction status from the processor. 
   * @return responseCode
  **/
  @ApiModelProperty(value = "Transaction status from the processor. ")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public PushFunds201ResponseProcessorInformation systemTraceAuditNumber(String systemTraceAuditNumber) {
    this.systemTraceAuditNumber = systemTraceAuditNumber;
    return this;
  }

   /**
   * This field is returned by authorization and incremental authorization services. System trace number that must be printed on the customer&#39;s receipt. 
   * @return systemTraceAuditNumber
  **/
  @ApiModelProperty(value = "This field is returned by authorization and incremental authorization services. System trace number that must be printed on the customer's receipt. ")
  public String getSystemTraceAuditNumber() {
    return systemTraceAuditNumber;
  }

  public void setSystemTraceAuditNumber(String systemTraceAuditNumber) {
    this.systemTraceAuditNumber = systemTraceAuditNumber;
  }

  public PushFunds201ResponseProcessorInformation retrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
    return this;
  }

   /**
   * This field contains a number that is used with other data elements as a key to identify and track all messages related to a given cardholder transaction; that is, to a given transaction set.  Recommended format: ydddhhnnnnnn  Positions 1-4: The yddd equivalent of the date, where y &#x3D; 0-9 and ddd &#x3D; 001 – 366. Positions 5-12: A unique identification number generated by the merchant or assigned by Cybersource. 
   * @return retrievalReferenceNumber
  **/
  @ApiModelProperty(value = "This field contains a number that is used with other data elements as a key to identify and track all messages related to a given cardholder transaction; that is, to a given transaction set.  Recommended format: ydddhhnnnnnn  Positions 1-4: The yddd equivalent of the date, where y = 0-9 and ddd = 001 – 366. Positions 5-12: A unique identification number generated by the merchant or assigned by Cybersource. ")
  public String getRetrievalReferenceNumber() {
    return retrievalReferenceNumber;
  }

  public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
    this.retrievalReferenceNumber = retrievalReferenceNumber;
  }

  public PushFunds201ResponseProcessorInformation actionCode(String actionCode) {
    this.actionCode = actionCode;
    return this;
  }

   /**
   * The results of the transaction request  Note: The VisaNet Response Code for the transaction 
   * @return actionCode
  **/
  @ApiModelProperty(value = "The results of the transaction request  Note: The VisaNet Response Code for the transaction ")
  public String getActionCode() {
    return actionCode;
  }

  public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
  }

  public PushFunds201ResponseProcessorInformation approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

   /**
   * Issuer-generated approval code for the transaction. 
   * @return approvalCode
  **/
  @ApiModelProperty(value = "Issuer-generated approval code for the transaction. ")
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public PushFunds201ResponseProcessorInformation feeProgramIndicator(String feeProgramIndicator) {
    this.feeProgramIndicator = feeProgramIndicator;
    return this;
  }

   /**
   * This field identifies the interchange fee program applicable to each financial transaction. Fee program indicator (FPI) values correspond to the fee descriptor and rate for each existing fee program. 
   * @return feeProgramIndicator
  **/
  @ApiModelProperty(value = "This field identifies the interchange fee program applicable to each financial transaction. Fee program indicator (FPI) values correspond to the fee descriptor and rate for each existing fee program. ")
  public String getFeeProgramIndicator() {
    return feeProgramIndicator;
  }

  public void setFeeProgramIndicator(String feeProgramIndicator) {
    this.feeProgramIndicator = feeProgramIndicator;
  }

  public PushFunds201ResponseProcessorInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the processor. 
   * @return name
  **/
  @ApiModelProperty(value = "Name of the processor. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PushFunds201ResponseProcessorInformation routing(PushFunds201ResponseProcessorInformationRouting routing) {
    this.routing = routing;
    return this;
  }

   /**
   * Get routing
   * @return routing
  **/
  @ApiModelProperty(value = "")
  public PushFunds201ResponseProcessorInformationRouting getRouting() {
    return routing;
  }

  public void setRouting(PushFunds201ResponseProcessorInformationRouting routing) {
    this.routing = routing;
  }

  public PushFunds201ResponseProcessorInformation settlement(PushFunds201ResponseProcessorInformationSettlement settlement) {
    this.settlement = settlement;
    return this;
  }

   /**
   * Get settlement
   * @return settlement
  **/
  @ApiModelProperty(value = "")
  public PushFunds201ResponseProcessorInformationSettlement getSettlement() {
    return settlement;
  }

  public void setSettlement(PushFunds201ResponseProcessorInformationSettlement settlement) {
    this.settlement = settlement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushFunds201ResponseProcessorInformation pushFunds201ResponseProcessorInformation = (PushFunds201ResponseProcessorInformation) o;
    return Objects.equals(this.transactionId, pushFunds201ResponseProcessorInformation.transactionId) &&
        Objects.equals(this.responseCode, pushFunds201ResponseProcessorInformation.responseCode) &&
        Objects.equals(this.systemTraceAuditNumber, pushFunds201ResponseProcessorInformation.systemTraceAuditNumber) &&
        Objects.equals(this.retrievalReferenceNumber, pushFunds201ResponseProcessorInformation.retrievalReferenceNumber) &&
        Objects.equals(this.actionCode, pushFunds201ResponseProcessorInformation.actionCode) &&
        Objects.equals(this.approvalCode, pushFunds201ResponseProcessorInformation.approvalCode) &&
        Objects.equals(this.feeProgramIndicator, pushFunds201ResponseProcessorInformation.feeProgramIndicator) &&
        Objects.equals(this.name, pushFunds201ResponseProcessorInformation.name) &&
        Objects.equals(this.routing, pushFunds201ResponseProcessorInformation.routing) &&
        Objects.equals(this.settlement, pushFunds201ResponseProcessorInformation.settlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, responseCode, systemTraceAuditNumber, retrievalReferenceNumber, actionCode, approvalCode, feeProgramIndicator, name, routing, settlement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFunds201ResponseProcessorInformation {\n");
    
    if (transactionId != null) sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    if (responseCode != null) sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    if (systemTraceAuditNumber != null) sb.append("    systemTraceAuditNumber: ").append(toIndentedString(systemTraceAuditNumber)).append("\n");
    if (retrievalReferenceNumber != null) sb.append("    retrievalReferenceNumber: ").append(toIndentedString(retrievalReferenceNumber)).append("\n");
    if (actionCode != null) sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
    if (approvalCode != null) sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    if (feeProgramIndicator != null) sb.append("    feeProgramIndicator: ").append(toIndentedString(feeProgramIndicator)).append("\n");
    if (name != null) sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (routing != null) sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    if (settlement != null) sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
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

