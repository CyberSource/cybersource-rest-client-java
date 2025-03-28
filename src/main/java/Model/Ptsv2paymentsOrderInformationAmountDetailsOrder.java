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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsOrderInformationAmountDetailsOrder
 */

public class Ptsv2paymentsOrderInformationAmountDetailsOrder {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("subTotalAmount")
  private String subTotalAmount = null;

  @SerializedName("handlingAmount")
  private String handlingAmount = null;

  @SerializedName("shippingAmount")
  private String shippingAmount = null;

  @SerializedName("shippingDiscountAmount")
  private String shippingDiscountAmount = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  @SerializedName("insuranceAmount")
  private String insuranceAmount = null;

  @SerializedName("giftWrapAmount")
  private String giftWrapAmount = null;

  public Ptsv2paymentsOrderInformationAmountDetailsOrder totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Grand total for the order. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Grand total for the order. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsOrder currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the order 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency used for the order ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsOrder subTotalAmount(String subTotalAmount) {
    this.subTotalAmount = subTotalAmount;
    return this;
  }

   /**
   * Shipping discount amount for the transaction. If this amount has changed since the initial sessions request, you must include the new value in the order request. You must also include all additional amount fields that apply to the order and ensure the total amount equals the purchaseTotals_grandTotalAmount value. 
   * @return subTotalAmount
  **/
  @ApiModelProperty(value = "Shipping discount amount for the transaction. If this amount has changed since the initial sessions request, you must include the new value in the order request. You must also include all additional amount fields that apply to the order and ensure the total amount equals the purchaseTotals_grandTotalAmount value. ")
  public String getSubTotalAmount() {
    return subTotalAmount;
  }

  public void setSubTotalAmount(String subTotalAmount) {
    this.subTotalAmount = subTotalAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsOrder handlingAmount(String handlingAmount) {
    this.handlingAmount = handlingAmount;
    return this;
  }

   /**
   * Aggregate handling charges for the transaction. If this amount has changed since the initial sessions request, you must include the new value in the order request. You must also include all additional amount fields that apply to the order and ensure the total amount equals the purchaseTotals_grandTotalAmount value. 
   * @return handlingAmount
  **/
  @ApiModelProperty(value = "Aggregate handling charges for the transaction. If this amount has changed since the initial sessions request, you must include the new value in the order request. You must also include all additional amount fields that apply to the order and ensure the total amount equals the purchaseTotals_grandTotalAmount value. ")
  public String getHandlingAmount() {
    return handlingAmount;
  }

  public void setHandlingAmount(String handlingAmount) {
    this.handlingAmount = handlingAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsOrder shippingAmount(String shippingAmount) {
    this.shippingAmount = shippingAmount;
    return this;
  }

   /**
   * Aggregate shipping charges for the transaction If this amount has changed since the initial sessions request, you must include the new value in the order request. You must also include all additional amount fields that apply to the order and ensure the total amount equals the purchaseTotals_grandTotalAmount value. 
   * @return shippingAmount
  **/
  @ApiModelProperty(value = "Aggregate shipping charges for the transaction If this amount has changed since the initial sessions request, you must include the new value in the order request. You must also include all additional amount fields that apply to the order and ensure the total amount equals the purchaseTotals_grandTotalAmount value. ")
  public String getShippingAmount() {
    return shippingAmount;
  }

  public void setShippingAmount(String shippingAmount) {
    this.shippingAmount = shippingAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsOrder shippingDiscountAmount(String shippingDiscountAmount) {
    this.shippingDiscountAmount = shippingDiscountAmount;
    return this;
  }

   /**
   * Shipping discount amount for the transaction. If this amount has changed since the initial sessions request, you must include the new value in the order request. You must also include all additional amount fields that apply to the order and ensure the total amount equals the purchaseTotals_grandTotalAmount value. 
   * @return shippingDiscountAmount
  **/
  @ApiModelProperty(value = "Shipping discount amount for the transaction. If this amount has changed since the initial sessions request, you must include the new value in the order request. You must also include all additional amount fields that apply to the order and ensure the total amount equals the purchaseTotals_grandTotalAmount value. ")
  public String getShippingDiscountAmount() {
    return shippingDiscountAmount;
  }

  public void setShippingDiscountAmount(String shippingDiscountAmount) {
    this.shippingDiscountAmount = shippingDiscountAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsOrder taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax amount. When the purchaseTotals_ taxAmount and ap_subtotalAmount fields are included in the request, do not include the tax amount as part of the subtotal amount calculation. 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total tax amount. When the purchaseTotals_ taxAmount and ap_subtotalAmount fields are included in the request, do not include the tax amount as part of the subtotal amount calculation. ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsOrder insuranceAmount(String insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
    return this;
  }

   /**
   * Amount being charged for the insurance fee. Only supported when the payment_method is set to paypal. 
   * @return insuranceAmount
  **/
  @ApiModelProperty(value = "Amount being charged for the insurance fee. Only supported when the payment_method is set to paypal. ")
  public String getInsuranceAmount() {
    return insuranceAmount;
  }

  public void setInsuranceAmount(String insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsOrder giftWrapAmount(String giftWrapAmount) {
    this.giftWrapAmount = giftWrapAmount;
    return this;
  }

   /**
   * Amount being charged as gift wrap fee.            
   * @return giftWrapAmount
  **/
  @ApiModelProperty(value = "Amount being charged as gift wrap fee.            ")
  public String getGiftWrapAmount() {
    return giftWrapAmount;
  }

  public void setGiftWrapAmount(String giftWrapAmount) {
    this.giftWrapAmount = giftWrapAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformationAmountDetailsOrder ptsv2paymentsOrderInformationAmountDetailsOrder = (Ptsv2paymentsOrderInformationAmountDetailsOrder) o;
    return Objects.equals(this.totalAmount, ptsv2paymentsOrderInformationAmountDetailsOrder.totalAmount) &&
        Objects.equals(this.currency, ptsv2paymentsOrderInformationAmountDetailsOrder.currency) &&
        Objects.equals(this.subTotalAmount, ptsv2paymentsOrderInformationAmountDetailsOrder.subTotalAmount) &&
        Objects.equals(this.handlingAmount, ptsv2paymentsOrderInformationAmountDetailsOrder.handlingAmount) &&
        Objects.equals(this.shippingAmount, ptsv2paymentsOrderInformationAmountDetailsOrder.shippingAmount) &&
        Objects.equals(this.shippingDiscountAmount, ptsv2paymentsOrderInformationAmountDetailsOrder.shippingDiscountAmount) &&
        Objects.equals(this.taxAmount, ptsv2paymentsOrderInformationAmountDetailsOrder.taxAmount) &&
        Objects.equals(this.insuranceAmount, ptsv2paymentsOrderInformationAmountDetailsOrder.insuranceAmount) &&
        Objects.equals(this.giftWrapAmount, ptsv2paymentsOrderInformationAmountDetailsOrder.giftWrapAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, currency, subTotalAmount, handlingAmount, shippingAmount, shippingDiscountAmount, taxAmount, insuranceAmount, giftWrapAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformationAmountDetailsOrder {\n");
    
    if (totalAmount != null) sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    if (currency != null) sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    if (subTotalAmount != null) sb.append("    subTotalAmount: ").append(toIndentedString(subTotalAmount)).append("\n");
    if (handlingAmount != null) sb.append("    handlingAmount: ").append(toIndentedString(handlingAmount)).append("\n");
    if (shippingAmount != null) sb.append("    shippingAmount: ").append(toIndentedString(shippingAmount)).append("\n");
    if (shippingDiscountAmount != null) sb.append("    shippingDiscountAmount: ").append(toIndentedString(shippingDiscountAmount)).append("\n");
    if (taxAmount != null) sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    if (insuranceAmount != null) sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
    if (giftWrapAmount != null) sb.append("    giftWrapAmount: ").append(toIndentedString(giftWrapAmount)).append("\n");
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

