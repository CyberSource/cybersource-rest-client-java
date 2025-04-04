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
import Model.Ptsv2billingagreementsInstallmentInformation;
import Model.Ptsv2billingagreementsMerchantInformation;
import Model.Ptsv2billingagreementsOrderInformation;
import Model.Ptsv2billingagreementsPaymentInformation;
import Model.Ptsv2paymentsClientReferenceInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IntimateBillingAgreement
 */

public class IntimateBillingAgreement {
  @SerializedName("clientReferenceInformation")
  private Ptsv2paymentsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("installmentInformation")
  private Ptsv2billingagreementsInstallmentInformation installmentInformation = null;

  @SerializedName("merchantInformation")
  private Ptsv2billingagreementsMerchantInformation merchantInformation = null;

  @SerializedName("orderInformation")
  private Ptsv2billingagreementsOrderInformation orderInformation = null;

  @SerializedName("paymentInformation")
  private Ptsv2billingagreementsPaymentInformation paymentInformation = null;

  public IntimateBillingAgreement clientReferenceInformation(Ptsv2paymentsClientReferenceInformation clientReferenceInformation) {
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

  public IntimateBillingAgreement installmentInformation(Ptsv2billingagreementsInstallmentInformation installmentInformation) {
    this.installmentInformation = installmentInformation;
    return this;
  }

   /**
   * Get installmentInformation
   * @return installmentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsInstallmentInformation getInstallmentInformation() {
    return installmentInformation;
  }

  public void setInstallmentInformation(Ptsv2billingagreementsInstallmentInformation installmentInformation) {
    this.installmentInformation = installmentInformation;
  }

  public IntimateBillingAgreement merchantInformation(Ptsv2billingagreementsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(Ptsv2billingagreementsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public IntimateBillingAgreement orderInformation(Ptsv2billingagreementsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Ptsv2billingagreementsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public IntimateBillingAgreement paymentInformation(Ptsv2billingagreementsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Ptsv2billingagreementsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntimateBillingAgreement intimateBillingAgreement = (IntimateBillingAgreement) o;
    return Objects.equals(this.clientReferenceInformation, intimateBillingAgreement.clientReferenceInformation) &&
        Objects.equals(this.installmentInformation, intimateBillingAgreement.installmentInformation) &&
        Objects.equals(this.merchantInformation, intimateBillingAgreement.merchantInformation) &&
        Objects.equals(this.orderInformation, intimateBillingAgreement.orderInformation) &&
        Objects.equals(this.paymentInformation, intimateBillingAgreement.paymentInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, installmentInformation, merchantInformation, orderInformation, paymentInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntimateBillingAgreement {\n");
    
    if (clientReferenceInformation != null) sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    if (installmentInformation != null) sb.append("    installmentInformation: ").append(toIndentedString(installmentInformation)).append("\n");
    if (merchantInformation != null) sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    if (orderInformation != null) sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    if (paymentInformation != null) sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
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

