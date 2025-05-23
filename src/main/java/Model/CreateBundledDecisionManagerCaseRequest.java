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
import Model.Ptsv2paymentsRecurringPaymentInformation;
import Model.Ptsv2paymentsWatchlistScreeningInformation;
import Model.Riskv1decisionsAcquirerInformation;
import Model.Riskv1decisionsBuyerInformation;
import Model.Riskv1decisionsClientReferenceInformation;
import Model.Riskv1decisionsConsumerAuthenticationInformation;
import Model.Riskv1decisionsDeviceInformation;
import Model.Riskv1decisionsMerchantDefinedInformation;
import Model.Riskv1decisionsMerchantInformation;
import Model.Riskv1decisionsOrderInformation;
import Model.Riskv1decisionsPaymentInformation;
import Model.Riskv1decisionsProcessingInformation;
import Model.Riskv1decisionsProcessorInformation;
import Model.Riskv1decisionsRiskInformation;
import Model.Riskv1decisionsTokenInformation;
import Model.Riskv1decisionsTravelInformation;
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
 * CreateBundledDecisionManagerCaseRequest
 */

public class CreateBundledDecisionManagerCaseRequest {
  @SerializedName("clientReferenceInformation")
  private Riskv1decisionsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processorInformation")
  private Riskv1decisionsProcessorInformation processorInformation = null;

  @SerializedName("processingInformation")
  private Riskv1decisionsProcessingInformation processingInformation = null;

  @SerializedName("paymentInformation")
  private Riskv1decisionsPaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private Riskv1decisionsOrderInformation orderInformation = null;

  @SerializedName("buyerInformation")
  private Riskv1decisionsBuyerInformation buyerInformation = null;

  @SerializedName("deviceInformation")
  private Riskv1decisionsDeviceInformation deviceInformation = null;

  @SerializedName("riskInformation")
  private Riskv1decisionsRiskInformation riskInformation = null;

  @SerializedName("travelInformation")
  private Riskv1decisionsTravelInformation travelInformation = null;

  @SerializedName("merchantDefinedInformation")
  private List<Riskv1decisionsMerchantDefinedInformation> merchantDefinedInformation = null;

  @SerializedName("merchantInformation")
  private Riskv1decisionsMerchantInformation merchantInformation = null;

  @SerializedName("acquirerInformation")
  private Riskv1decisionsAcquirerInformation acquirerInformation = null;

  @SerializedName("recurringPaymentInformation")
  private Ptsv2paymentsRecurringPaymentInformation recurringPaymentInformation = null;

  @SerializedName("consumerAuthenticationInformation")
  private Riskv1decisionsConsumerAuthenticationInformation consumerAuthenticationInformation = null;

  @SerializedName("watchlistScreeningInformation")
  private Ptsv2paymentsWatchlistScreeningInformation watchlistScreeningInformation = null;

  @SerializedName("tokenInformation")
  private Riskv1decisionsTokenInformation tokenInformation = null;

  public CreateBundledDecisionManagerCaseRequest clientReferenceInformation(Riskv1decisionsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Riskv1decisionsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public CreateBundledDecisionManagerCaseRequest processorInformation(Riskv1decisionsProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(Riskv1decisionsProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public CreateBundledDecisionManagerCaseRequest processingInformation(Riskv1decisionsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Riskv1decisionsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public CreateBundledDecisionManagerCaseRequest paymentInformation(Riskv1decisionsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Riskv1decisionsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public CreateBundledDecisionManagerCaseRequest orderInformation(Riskv1decisionsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(required = true, value = "")
  public Riskv1decisionsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Riskv1decisionsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public CreateBundledDecisionManagerCaseRequest buyerInformation(Riskv1decisionsBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Riskv1decisionsBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public CreateBundledDecisionManagerCaseRequest deviceInformation(Riskv1decisionsDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(Riskv1decisionsDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public CreateBundledDecisionManagerCaseRequest riskInformation(Riskv1decisionsRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
    return this;
  }

   /**
   * Get riskInformation
   * @return riskInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsRiskInformation getRiskInformation() {
    return riskInformation;
  }

  public void setRiskInformation(Riskv1decisionsRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
  }

  public CreateBundledDecisionManagerCaseRequest travelInformation(Riskv1decisionsTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
    return this;
  }

   /**
   * Get travelInformation
   * @return travelInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsTravelInformation getTravelInformation() {
    return travelInformation;
  }

  public void setTravelInformation(Riskv1decisionsTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
  }

  public CreateBundledDecisionManagerCaseRequest merchantDefinedInformation(List<Riskv1decisionsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
    return this;
  }

  public CreateBundledDecisionManagerCaseRequest addMerchantDefinedInformationItem(Riskv1decisionsMerchantDefinedInformation merchantDefinedInformationItem) {
    if (this.merchantDefinedInformation == null) {
      this.merchantDefinedInformation = new ArrayList<Riskv1decisionsMerchantDefinedInformation>();
    }
    this.merchantDefinedInformation.add(merchantDefinedInformationItem);
    return this;
  }

   /**
   * Get merchantDefinedInformation
   * @return merchantDefinedInformation
  **/
  @ApiModelProperty(value = "")
  public List<Riskv1decisionsMerchantDefinedInformation> getMerchantDefinedInformation() {
    return merchantDefinedInformation;
  }

  public void setMerchantDefinedInformation(List<Riskv1decisionsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
  }

  public CreateBundledDecisionManagerCaseRequest merchantInformation(Riskv1decisionsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(Riskv1decisionsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public CreateBundledDecisionManagerCaseRequest acquirerInformation(Riskv1decisionsAcquirerInformation acquirerInformation) {
    this.acquirerInformation = acquirerInformation;
    return this;
  }

   /**
   * Get acquirerInformation
   * @return acquirerInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsAcquirerInformation getAcquirerInformation() {
    return acquirerInformation;
  }

  public void setAcquirerInformation(Riskv1decisionsAcquirerInformation acquirerInformation) {
    this.acquirerInformation = acquirerInformation;
  }

  public CreateBundledDecisionManagerCaseRequest recurringPaymentInformation(Ptsv2paymentsRecurringPaymentInformation recurringPaymentInformation) {
    this.recurringPaymentInformation = recurringPaymentInformation;
    return this;
  }

   /**
   * Get recurringPaymentInformation
   * @return recurringPaymentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsRecurringPaymentInformation getRecurringPaymentInformation() {
    return recurringPaymentInformation;
  }

  public void setRecurringPaymentInformation(Ptsv2paymentsRecurringPaymentInformation recurringPaymentInformation) {
    this.recurringPaymentInformation = recurringPaymentInformation;
  }

  public CreateBundledDecisionManagerCaseRequest consumerAuthenticationInformation(Riskv1decisionsConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
    return this;
  }

   /**
   * Get consumerAuthenticationInformation
   * @return consumerAuthenticationInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsConsumerAuthenticationInformation getConsumerAuthenticationInformation() {
    return consumerAuthenticationInformation;
  }

  public void setConsumerAuthenticationInformation(Riskv1decisionsConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
  }

  public CreateBundledDecisionManagerCaseRequest watchlistScreeningInformation(Ptsv2paymentsWatchlistScreeningInformation watchlistScreeningInformation) {
    this.watchlistScreeningInformation = watchlistScreeningInformation;
    return this;
  }

   /**
   * Get watchlistScreeningInformation
   * @return watchlistScreeningInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsWatchlistScreeningInformation getWatchlistScreeningInformation() {
    return watchlistScreeningInformation;
  }

  public void setWatchlistScreeningInformation(Ptsv2paymentsWatchlistScreeningInformation watchlistScreeningInformation) {
    this.watchlistScreeningInformation = watchlistScreeningInformation;
  }

  public CreateBundledDecisionManagerCaseRequest tokenInformation(Riskv1decisionsTokenInformation tokenInformation) {
    this.tokenInformation = tokenInformation;
    return this;
  }

   /**
   * Get tokenInformation
   * @return tokenInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsTokenInformation getTokenInformation() {
    return tokenInformation;
  }

  public void setTokenInformation(Riskv1decisionsTokenInformation tokenInformation) {
    this.tokenInformation = tokenInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBundledDecisionManagerCaseRequest createBundledDecisionManagerCaseRequest = (CreateBundledDecisionManagerCaseRequest) o;
    return Objects.equals(this.clientReferenceInformation, createBundledDecisionManagerCaseRequest.clientReferenceInformation) &&
        Objects.equals(this.processorInformation, createBundledDecisionManagerCaseRequest.processorInformation) &&
        Objects.equals(this.processingInformation, createBundledDecisionManagerCaseRequest.processingInformation) &&
        Objects.equals(this.paymentInformation, createBundledDecisionManagerCaseRequest.paymentInformation) &&
        Objects.equals(this.orderInformation, createBundledDecisionManagerCaseRequest.orderInformation) &&
        Objects.equals(this.buyerInformation, createBundledDecisionManagerCaseRequest.buyerInformation) &&
        Objects.equals(this.deviceInformation, createBundledDecisionManagerCaseRequest.deviceInformation) &&
        Objects.equals(this.riskInformation, createBundledDecisionManagerCaseRequest.riskInformation) &&
        Objects.equals(this.travelInformation, createBundledDecisionManagerCaseRequest.travelInformation) &&
        Objects.equals(this.merchantDefinedInformation, createBundledDecisionManagerCaseRequest.merchantDefinedInformation) &&
        Objects.equals(this.merchantInformation, createBundledDecisionManagerCaseRequest.merchantInformation) &&
        Objects.equals(this.acquirerInformation, createBundledDecisionManagerCaseRequest.acquirerInformation) &&
        Objects.equals(this.recurringPaymentInformation, createBundledDecisionManagerCaseRequest.recurringPaymentInformation) &&
        Objects.equals(this.consumerAuthenticationInformation, createBundledDecisionManagerCaseRequest.consumerAuthenticationInformation) &&
        Objects.equals(this.watchlistScreeningInformation, createBundledDecisionManagerCaseRequest.watchlistScreeningInformation) &&
        Objects.equals(this.tokenInformation, createBundledDecisionManagerCaseRequest.tokenInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, processorInformation, processingInformation, paymentInformation, orderInformation, buyerInformation, deviceInformation, riskInformation, travelInformation, merchantDefinedInformation, merchantInformation, acquirerInformation, recurringPaymentInformation, consumerAuthenticationInformation, watchlistScreeningInformation, tokenInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBundledDecisionManagerCaseRequest {\n");
    
    if (clientReferenceInformation != null) sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    if (processorInformation != null) sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    if (processingInformation != null) sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    if (paymentInformation != null) sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    if (orderInformation != null) sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    if (buyerInformation != null) sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    if (deviceInformation != null) sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    if (riskInformation != null) sb.append("    riskInformation: ").append(toIndentedString(riskInformation)).append("\n");
    if (travelInformation != null) sb.append("    travelInformation: ").append(toIndentedString(travelInformation)).append("\n");
    if (merchantDefinedInformation != null) sb.append("    merchantDefinedInformation: ").append(toIndentedString(merchantDefinedInformation)).append("\n");
    if (merchantInformation != null) sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    if (acquirerInformation != null) sb.append("    acquirerInformation: ").append(toIndentedString(acquirerInformation)).append("\n");
    if (recurringPaymentInformation != null) sb.append("    recurringPaymentInformation: ").append(toIndentedString(recurringPaymentInformation)).append("\n");
    if (consumerAuthenticationInformation != null) sb.append("    consumerAuthenticationInformation: ").append(toIndentedString(consumerAuthenticationInformation)).append("\n");
    if (watchlistScreeningInformation != null) sb.append("    watchlistScreeningInformation: ").append(toIndentedString(watchlistScreeningInformation)).append("\n");
    if (tokenInformation != null) sb.append("    tokenInformation: ").append(toIndentedString(tokenInformation)).append("\n");
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

