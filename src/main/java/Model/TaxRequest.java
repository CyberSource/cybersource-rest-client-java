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
import Model.Vasv2taxBuyerInformation;
import Model.Vasv2taxClientReferenceInformation;
import Model.Vasv2taxMerchantInformation;
import Model.Vasv2taxOrderInformation;
import Model.Vasv2taxTaxInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TaxRequest
 */

public class TaxRequest {
  @SerializedName("clientReferenceInformation")
  private Vasv2taxClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("taxInformation")
  private Vasv2taxTaxInformation taxInformation = null;

  @SerializedName("orderInformation")
  private Vasv2taxOrderInformation orderInformation = null;

  @SerializedName("merchantInformation")
  private Vasv2taxMerchantInformation merchantInformation = null;

  @SerializedName("buyerInformation")
  private Vasv2taxBuyerInformation buyerInformation = null;

  public TaxRequest clientReferenceInformation(Vasv2taxClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Vasv2taxClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public TaxRequest taxInformation(Vasv2taxTaxInformation taxInformation) {
    this.taxInformation = taxInformation;
    return this;
  }

   /**
   * Get taxInformation
   * @return taxInformation
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxTaxInformation getTaxInformation() {
    return taxInformation;
  }

  public void setTaxInformation(Vasv2taxTaxInformation taxInformation) {
    this.taxInformation = taxInformation;
  }

  public TaxRequest orderInformation(Vasv2taxOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Vasv2taxOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public TaxRequest merchantInformation(Vasv2taxMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(Vasv2taxMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public TaxRequest buyerInformation(Vasv2taxBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Vasv2taxBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRequest taxRequest = (TaxRequest) o;
    return Objects.equals(this.clientReferenceInformation, taxRequest.clientReferenceInformation) &&
        Objects.equals(this.taxInformation, taxRequest.taxInformation) &&
        Objects.equals(this.orderInformation, taxRequest.orderInformation) &&
        Objects.equals(this.merchantInformation, taxRequest.merchantInformation) &&
        Objects.equals(this.buyerInformation, taxRequest.buyerInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, taxInformation, orderInformation, merchantInformation, buyerInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRequest {\n");
    
    if (clientReferenceInformation != null) sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    if (taxInformation != null) sb.append("    taxInformation: ").append(toIndentedString(taxInformation)).append("\n");
    if (orderInformation != null) sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    if (merchantInformation != null) sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    if (buyerInformation != null) sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
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

