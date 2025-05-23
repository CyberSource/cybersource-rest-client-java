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
import Model.Ptsv2paymentreferencesAgreementInformation;
import Model.Ptsv2paymentreferencesBuyerInformation;
import Model.Ptsv2paymentreferencesDeviceInformation;
import Model.Ptsv2paymentreferencesMerchantInformation;
import Model.Ptsv2paymentreferencesOrderInformation;
import Model.Ptsv2paymentreferencesPaymentInformation;
import Model.Ptsv2paymentreferencesProcessingInformation;
import Model.Ptsv2paymentreferencesTravelInformation;
import Model.Ptsv2paymentreferencesUserInterface;
import Model.Ptsv2paymentsMerchantDefinedInformation;
import Model.Ptsv2refreshpaymentstatusidClientReferenceInformation;
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
 * CreateSessionRequest
 */

public class CreateSessionRequest {
  @SerializedName("clientReferenceInformation")
  private Ptsv2refreshpaymentstatusidClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processingInformation")
  private Ptsv2paymentreferencesProcessingInformation processingInformation = null;

  @SerializedName("paymentInformation")
  private Ptsv2paymentreferencesPaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private Ptsv2paymentreferencesOrderInformation orderInformation = null;

  @SerializedName("buyerInformation")
  private Ptsv2paymentreferencesBuyerInformation buyerInformation = null;

  @SerializedName("deviceInformation")
  private Ptsv2paymentreferencesDeviceInformation deviceInformation = null;

  @SerializedName("merchantInformation")
  private Ptsv2paymentreferencesMerchantInformation merchantInformation = null;

  @SerializedName("userInterface")
  private Ptsv2paymentreferencesUserInterface userInterface = null;

  @SerializedName("merchantDefinedInformation")
  private List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation = null;

  @SerializedName("agreementInformation")
  private Ptsv2paymentreferencesAgreementInformation agreementInformation = null;

  @SerializedName("travelInformation")
  private Ptsv2paymentreferencesTravelInformation travelInformation = null;

  public CreateSessionRequest clientReferenceInformation(Ptsv2refreshpaymentstatusidClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2refreshpaymentstatusidClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Ptsv2refreshpaymentstatusidClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public CreateSessionRequest processingInformation(Ptsv2paymentreferencesProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Ptsv2paymentreferencesProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public CreateSessionRequest paymentInformation(Ptsv2paymentreferencesPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Ptsv2paymentreferencesPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public CreateSessionRequest orderInformation(Ptsv2paymentreferencesOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Ptsv2paymentreferencesOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public CreateSessionRequest buyerInformation(Ptsv2paymentreferencesBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Ptsv2paymentreferencesBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public CreateSessionRequest deviceInformation(Ptsv2paymentreferencesDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(Ptsv2paymentreferencesDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public CreateSessionRequest merchantInformation(Ptsv2paymentreferencesMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(Ptsv2paymentreferencesMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public CreateSessionRequest userInterface(Ptsv2paymentreferencesUserInterface userInterface) {
    this.userInterface = userInterface;
    return this;
  }

   /**
   * Get userInterface
   * @return userInterface
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesUserInterface getUserInterface() {
    return userInterface;
  }

  public void setUserInterface(Ptsv2paymentreferencesUserInterface userInterface) {
    this.userInterface = userInterface;
  }

  public CreateSessionRequest merchantDefinedInformation(List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
    return this;
  }

  public CreateSessionRequest addMerchantDefinedInformationItem(Ptsv2paymentsMerchantDefinedInformation merchantDefinedInformationItem) {
    if (this.merchantDefinedInformation == null) {
      this.merchantDefinedInformation = new ArrayList<Ptsv2paymentsMerchantDefinedInformation>();
    }
    this.merchantDefinedInformation.add(merchantDefinedInformationItem);
    return this;
  }

   /**
   * The object containing the custom data that the merchant defines. 
   * @return merchantDefinedInformation
  **/
  @ApiModelProperty(value = "The object containing the custom data that the merchant defines. ")
  public List<Ptsv2paymentsMerchantDefinedInformation> getMerchantDefinedInformation() {
    return merchantDefinedInformation;
  }

  public void setMerchantDefinedInformation(List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
  }

  public CreateSessionRequest agreementInformation(Ptsv2paymentreferencesAgreementInformation agreementInformation) {
    this.agreementInformation = agreementInformation;
    return this;
  }

   /**
   * Get agreementInformation
   * @return agreementInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesAgreementInformation getAgreementInformation() {
    return agreementInformation;
  }

  public void setAgreementInformation(Ptsv2paymentreferencesAgreementInformation agreementInformation) {
    this.agreementInformation = agreementInformation;
  }

  public CreateSessionRequest travelInformation(Ptsv2paymentreferencesTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
    return this;
  }

   /**
   * Get travelInformation
   * @return travelInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesTravelInformation getTravelInformation() {
    return travelInformation;
  }

  public void setTravelInformation(Ptsv2paymentreferencesTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSessionRequest createSessionRequest = (CreateSessionRequest) o;
    return Objects.equals(this.clientReferenceInformation, createSessionRequest.clientReferenceInformation) &&
        Objects.equals(this.processingInformation, createSessionRequest.processingInformation) &&
        Objects.equals(this.paymentInformation, createSessionRequest.paymentInformation) &&
        Objects.equals(this.orderInformation, createSessionRequest.orderInformation) &&
        Objects.equals(this.buyerInformation, createSessionRequest.buyerInformation) &&
        Objects.equals(this.deviceInformation, createSessionRequest.deviceInformation) &&
        Objects.equals(this.merchantInformation, createSessionRequest.merchantInformation) &&
        Objects.equals(this.userInterface, createSessionRequest.userInterface) &&
        Objects.equals(this.merchantDefinedInformation, createSessionRequest.merchantDefinedInformation) &&
        Objects.equals(this.agreementInformation, createSessionRequest.agreementInformation) &&
        Objects.equals(this.travelInformation, createSessionRequest.travelInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, processingInformation, paymentInformation, orderInformation, buyerInformation, deviceInformation, merchantInformation, userInterface, merchantDefinedInformation, agreementInformation, travelInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSessionRequest {\n");
    
    if (clientReferenceInformation != null) sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    if (processingInformation != null) sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    if (paymentInformation != null) sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    if (orderInformation != null) sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    if (buyerInformation != null) sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    if (deviceInformation != null) sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    if (merchantInformation != null) sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    if (userInterface != null) sb.append("    userInterface: ").append(toIndentedString(userInterface)).append("\n");
    if (merchantDefinedInformation != null) sb.append("    merchantDefinedInformation: ").append(toIndentedString(merchantDefinedInformation)).append("\n");
    if (agreementInformation != null) sb.append("    agreementInformation: ").append(toIndentedString(agreementInformation)).append("\n");
    if (travelInformation != null) sb.append("    travelInformation: ").append(toIndentedString(travelInformation)).append("\n");
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

