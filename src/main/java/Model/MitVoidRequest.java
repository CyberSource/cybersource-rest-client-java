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
import Model.Ptsv2paymentsidvoidsOrderInformation;
import Model.Ptsv2paymentsidvoidsPaymentInformation;
import Model.Ptsv2voidsProcessingInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MitVoidRequest
 */

public class MitVoidRequest {
  @SerializedName("clientReferenceInformation")
  private Ptsv2paymentsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("paymentInformation")
  private Ptsv2paymentsidvoidsPaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private Ptsv2paymentsidvoidsOrderInformation orderInformation = null;

  @SerializedName("processingInformation")
  private Ptsv2voidsProcessingInformation processingInformation = null;

  public MitVoidRequest clientReferenceInformation(Ptsv2paymentsClientReferenceInformation clientReferenceInformation) {
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

  public MitVoidRequest paymentInformation(Ptsv2paymentsidvoidsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidvoidsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Ptsv2paymentsidvoidsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public MitVoidRequest orderInformation(Ptsv2paymentsidvoidsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidvoidsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Ptsv2paymentsidvoidsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public MitVoidRequest processingInformation(Ptsv2voidsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2voidsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Ptsv2voidsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MitVoidRequest mitVoidRequest = (MitVoidRequest) o;
    return Objects.equals(this.clientReferenceInformation, mitVoidRequest.clientReferenceInformation) &&
        Objects.equals(this.paymentInformation, mitVoidRequest.paymentInformation) &&
        Objects.equals(this.orderInformation, mitVoidRequest.orderInformation) &&
        Objects.equals(this.processingInformation, mitVoidRequest.processingInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, paymentInformation, orderInformation, processingInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MitVoidRequest {\n");
    
    if (clientReferenceInformation != null) sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    if (paymentInformation != null) sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    if (orderInformation != null) sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    if (processingInformation != null) sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
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

