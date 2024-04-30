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
import Model.Ptsv2paymentreferencesidintentsOrderInformation;
import Model.Ptsv2paymentreferencesidintentsPaymentInformation;
import Model.Ptsv2paymentreferencesidintentsProcessingInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrderPaymentRequest
 */

public class OrderPaymentRequest {
  @SerializedName("clientReferenceInformation")
  private PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processingInformation")
  private Ptsv2paymentreferencesidintentsProcessingInformation processingInformation = null;

  @SerializedName("paymentInformation")
  private Ptsv2paymentreferencesidintentsPaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private Ptsv2paymentreferencesidintentsOrderInformation orderInformation = null;

  public OrderPaymentRequest clientReferenceInformation(PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation) {
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

  public OrderPaymentRequest processingInformation(Ptsv2paymentreferencesidintentsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesidintentsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Ptsv2paymentreferencesidintentsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public OrderPaymentRequest paymentInformation(Ptsv2paymentreferencesidintentsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesidintentsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Ptsv2paymentreferencesidintentsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public OrderPaymentRequest orderInformation(Ptsv2paymentreferencesidintentsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesidintentsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Ptsv2paymentreferencesidintentsOrderInformation orderInformation) {
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
    OrderPaymentRequest orderPaymentRequest = (OrderPaymentRequest) o;
    return Objects.equals(this.clientReferenceInformation, orderPaymentRequest.clientReferenceInformation) &&
        Objects.equals(this.processingInformation, orderPaymentRequest.processingInformation) &&
        Objects.equals(this.paymentInformation, orderPaymentRequest.paymentInformation) &&
        Objects.equals(this.orderInformation, orderPaymentRequest.orderInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, processingInformation, paymentInformation, orderInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPaymentRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
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
