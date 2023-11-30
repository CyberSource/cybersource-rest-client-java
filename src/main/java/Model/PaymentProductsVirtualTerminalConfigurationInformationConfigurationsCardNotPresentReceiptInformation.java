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
import Model.PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationEmailReceipt;
import Model.PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationHeader;
import Model.PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationOrderInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformation
 */

public class PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformation {
  @SerializedName("header")
  private PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationHeader header = null;

  @SerializedName("orderInformation")
  private PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationOrderInformation orderInformation = null;

  @SerializedName("emailReceipt")
  private PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationEmailReceipt emailReceipt = null;

  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformation header(PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationHeader header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(value = "")
  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationHeader getHeader() {
    return header;
  }

  public void setHeader(PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationHeader header) {
    this.header = header;
  }

  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformation orderInformation(PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformation emailReceipt(PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationEmailReceipt emailReceipt) {
    this.emailReceipt = emailReceipt;
    return this;
  }

   /**
   * Get emailReceipt
   * @return emailReceipt
  **/
  @ApiModelProperty(value = "")
  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationEmailReceipt getEmailReceipt() {
    return emailReceipt;
  }

  public void setEmailReceipt(PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformationEmailReceipt emailReceipt) {
    this.emailReceipt = emailReceipt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformation paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformation = (PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformation) o;
    return Objects.equals(this.header, paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformation.header) &&
        Objects.equals(this.orderInformation, paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformation.orderInformation) &&
        Objects.equals(this.emailReceipt, paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformation.emailReceipt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, orderInformation, emailReceipt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentReceiptInformation {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    emailReceipt: ").append(toIndentedString(emailReceipt)).append("\n");
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
