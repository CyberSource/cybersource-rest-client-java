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
import Model.Ptsv2paymentsClientReferenceInformation;
import Model.Ptsv2paymentsidreversalsOrderInformation;
import Model.Ptsv2paymentsidreversalsPointOfSaleInformation;
import Model.Ptsv2paymentsidreversalsProcessingInformation;
import Model.Ptsv2paymentsidreversalsReversalInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MitReversalRequest
 */

public class MitReversalRequest {
  @SerializedName("clientReferenceInformation")
  private Ptsv2paymentsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("reversalInformation")
  private Ptsv2paymentsidreversalsReversalInformation reversalInformation = null;

  @SerializedName("processingInformation")
  private Ptsv2paymentsidreversalsProcessingInformation processingInformation = null;

  @SerializedName("orderInformation")
  private Ptsv2paymentsidreversalsOrderInformation orderInformation = null;

  @SerializedName("pointOfSaleInformation")
  private Ptsv2paymentsidreversalsPointOfSaleInformation pointOfSaleInformation = null;

  public MitReversalRequest clientReferenceInformation(Ptsv2paymentsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Ptsv2paymentsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public MitReversalRequest reversalInformation(Ptsv2paymentsidreversalsReversalInformation reversalInformation) {
    this.reversalInformation = reversalInformation;
    return this;
  }

   /**
   * Get reversalInformation
   * @return reversalInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsReversalInformation getReversalInformation() {
    return reversalInformation;
  }

  public void setReversalInformation(Ptsv2paymentsidreversalsReversalInformation reversalInformation) {
    this.reversalInformation = reversalInformation;
  }

  public MitReversalRequest processingInformation(Ptsv2paymentsidreversalsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Ptsv2paymentsidreversalsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public MitReversalRequest orderInformation(Ptsv2paymentsidreversalsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Ptsv2paymentsidreversalsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public MitReversalRequest pointOfSaleInformation(Ptsv2paymentsidreversalsPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsPointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(Ptsv2paymentsidreversalsPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MitReversalRequest mitReversalRequest = (MitReversalRequest) o;
    return Objects.equals(this.clientReferenceInformation, mitReversalRequest.clientReferenceInformation) &&
        Objects.equals(this.reversalInformation, mitReversalRequest.reversalInformation) &&
        Objects.equals(this.processingInformation, mitReversalRequest.processingInformation) &&
        Objects.equals(this.orderInformation, mitReversalRequest.orderInformation) &&
        Objects.equals(this.pointOfSaleInformation, mitReversalRequest.pointOfSaleInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, reversalInformation, processingInformation, orderInformation, pointOfSaleInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MitReversalRequest {\n");
    
    if (clientReferenceInformation != null) sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    if (reversalInformation != null) sb.append("    reversalInformation: ").append(toIndentedString(reversalInformation)).append("\n");
    if (processingInformation != null) sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    if (orderInformation != null) sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    if (pointOfSaleInformation != null) sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
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

