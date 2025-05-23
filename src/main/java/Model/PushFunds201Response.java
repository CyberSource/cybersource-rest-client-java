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
import Model.PushFunds201ResponseClientReferenceInformation;
import Model.PushFunds201ResponseErrorInformation;
import Model.PushFunds201ResponseLinks;
import Model.PushFunds201ResponseMerchantInformation;
import Model.PushFunds201ResponseOrderInformation;
import Model.PushFunds201ResponsePaymentInformation;
import Model.PushFunds201ResponseProcessingInformation;
import Model.PushFunds201ResponseProcessorInformation;
import Model.PushFunds201ResponseRecipientInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PushFunds201Response
 */

public class PushFunds201Response {
  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("clientReferenceInformation")
  private PushFunds201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("recipientInformation")
  private PushFunds201ResponseRecipientInformation recipientInformation = null;

  @SerializedName("merchantInformation")
  private PushFunds201ResponseMerchantInformation merchantInformation = null;

  @SerializedName("errorInformation")
  private PushFunds201ResponseErrorInformation errorInformation = null;

  @SerializedName("processorInformation")
  private PushFunds201ResponseProcessorInformation processorInformation = null;

  @SerializedName("orderInformation")
  private PushFunds201ResponseOrderInformation orderInformation = null;

  @SerializedName("paymentInformation")
  private PushFunds201ResponsePaymentInformation paymentInformation = null;

  @SerializedName("processingInformation")
  private PushFunds201ResponseProcessingInformation processingInformation = null;

  @SerializedName("_links")
  private PushFunds201ResponseLinks links = null;

  public PushFunds201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identification number to identify the submitted request. It is also appended to the endpoint of the resource. 
   * @return id
  **/
  @ApiModelProperty(value = "A unique identification number to identify the submitted request. It is also appended to the endpoint of the resource. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PushFunds201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60;  **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ`  **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public PushFunds201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values: - AUTHORIZED - DECLINED - SERVER_ERROR - INVALID_REQUEST - PARTIAL_AUTHORIZED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values: - AUTHORIZED - DECLINED - SERVER_ERROR - INVALID_REQUEST - PARTIAL_AUTHORIZED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PushFunds201Response reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Cybersource or merchant generated transaction reference number. This is sent to the processor and is echoed back in the response to the merchant. This is This value is used for reconciliation purposes. 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Cybersource or merchant generated transaction reference number. This is sent to the processor and is echoed back in the response to the merchant. This is This value is used for reconciliation purposes. ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public PushFunds201Response clientReferenceInformation(PushFunds201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public PushFunds201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(PushFunds201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public PushFunds201Response recipientInformation(PushFunds201ResponseRecipientInformation recipientInformation) {
    this.recipientInformation = recipientInformation;
    return this;
  }

   /**
   * Get recipientInformation
   * @return recipientInformation
  **/
  @ApiModelProperty(value = "")
  public PushFunds201ResponseRecipientInformation getRecipientInformation() {
    return recipientInformation;
  }

  public void setRecipientInformation(PushFunds201ResponseRecipientInformation recipientInformation) {
    this.recipientInformation = recipientInformation;
  }

  public PushFunds201Response merchantInformation(PushFunds201ResponseMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public PushFunds201ResponseMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(PushFunds201ResponseMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public PushFunds201Response errorInformation(PushFunds201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public PushFunds201ResponseErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(PushFunds201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }

  public PushFunds201Response processorInformation(PushFunds201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public PushFunds201ResponseProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(PushFunds201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public PushFunds201Response orderInformation(PushFunds201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public PushFunds201ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(PushFunds201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public PushFunds201Response paymentInformation(PushFunds201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public PushFunds201ResponsePaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(PushFunds201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public PushFunds201Response processingInformation(PushFunds201ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public PushFunds201ResponseProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(PushFunds201ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public PushFunds201Response links(PushFunds201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PushFunds201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PushFunds201ResponseLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushFunds201Response pushFunds201Response = (PushFunds201Response) o;
    return Objects.equals(this.id, pushFunds201Response.id) &&
        Objects.equals(this.submitTimeUtc, pushFunds201Response.submitTimeUtc) &&
        Objects.equals(this.status, pushFunds201Response.status) &&
        Objects.equals(this.reconciliationId, pushFunds201Response.reconciliationId) &&
        Objects.equals(this.clientReferenceInformation, pushFunds201Response.clientReferenceInformation) &&
        Objects.equals(this.recipientInformation, pushFunds201Response.recipientInformation) &&
        Objects.equals(this.merchantInformation, pushFunds201Response.merchantInformation) &&
        Objects.equals(this.errorInformation, pushFunds201Response.errorInformation) &&
        Objects.equals(this.processorInformation, pushFunds201Response.processorInformation) &&
        Objects.equals(this.orderInformation, pushFunds201Response.orderInformation) &&
        Objects.equals(this.paymentInformation, pushFunds201Response.paymentInformation) &&
        Objects.equals(this.processingInformation, pushFunds201Response.processingInformation) &&
        Objects.equals(this.links, pushFunds201Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submitTimeUtc, status, reconciliationId, clientReferenceInformation, recipientInformation, merchantInformation, errorInformation, processorInformation, orderInformation, paymentInformation, processingInformation, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFunds201Response {\n");
    
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (submitTimeUtc != null) sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (reconciliationId != null) sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    if (clientReferenceInformation != null) sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    if (recipientInformation != null) sb.append("    recipientInformation: ").append(toIndentedString(recipientInformation)).append("\n");
    if (merchantInformation != null) sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    if (errorInformation != null) sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
    if (processorInformation != null) sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    if (orderInformation != null) sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    if (paymentInformation != null) sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    if (processingInformation != null) sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    if (links != null) sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

