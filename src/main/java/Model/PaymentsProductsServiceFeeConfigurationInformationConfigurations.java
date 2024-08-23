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
import Model.PaymentsProductsServiceFeeConfigurationInformationConfigurationsMerchantInformation;
import Model.PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation;
import Model.PaymentsProductsServiceFeeConfigurationInformationConfigurationsProducts;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PaymentsProductsServiceFeeConfigurationInformationConfigurations
 */

public class PaymentsProductsServiceFeeConfigurationInformationConfigurations {
  @SerializedName("products")
  private Map<String, PaymentsProductsServiceFeeConfigurationInformationConfigurationsProducts> products = null;

  @SerializedName("terminalId")
  private String terminalId = null;

  @SerializedName("merchantId")
  private String merchantId = null;

  @SerializedName("merchantInformation")
  private PaymentsProductsServiceFeeConfigurationInformationConfigurationsMerchantInformation merchantInformation = null;

  @SerializedName("paymentInformation")
  private List<PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation> paymentInformation = null;

  public PaymentsProductsServiceFeeConfigurationInformationConfigurations products(Map<String, PaymentsProductsServiceFeeConfigurationInformationConfigurationsProducts> products) {
    this.products = products;
    return this;
  }

  public PaymentsProductsServiceFeeConfigurationInformationConfigurations putProductsItem(String key, PaymentsProductsServiceFeeConfigurationInformationConfigurationsProducts productsItem) {
    if (this.products == null) {
      this.products = new HashMap<String, PaymentsProductsServiceFeeConfigurationInformationConfigurationsProducts>();
    }
    this.products.put(key, productsItem);
    return this;
  }

   /**
   * Products enabled for this account. The following values are supported: virtualTerminal paymentTokenizationOtp subscriptionsOtp virtualTerminalCp eCheck 
   * @return products
  **/
  @ApiModelProperty(value = "Products enabled for this account. The following values are supported: virtualTerminal paymentTokenizationOtp subscriptionsOtp virtualTerminalCp eCheck ")
  public Map<String, PaymentsProductsServiceFeeConfigurationInformationConfigurationsProducts> getProducts() {
    return products;
  }

  public void setProducts(Map<String, PaymentsProductsServiceFeeConfigurationInformationConfigurationsProducts> products) {
    this.products = products;
  }

  public PaymentsProductsServiceFeeConfigurationInformationConfigurations terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Identifier of the terminal at the retail location.
   * @return terminalId
  **/
  @ApiModelProperty(value = "Identifier of the terminal at the retail location.")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public PaymentsProductsServiceFeeConfigurationInformationConfigurations merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Identifier of a merchant account.
   * @return merchantId
  **/
  @ApiModelProperty(value = "Identifier of a merchant account.")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public PaymentsProductsServiceFeeConfigurationInformationConfigurations merchantInformation(PaymentsProductsServiceFeeConfigurationInformationConfigurationsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public PaymentsProductsServiceFeeConfigurationInformationConfigurationsMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(PaymentsProductsServiceFeeConfigurationInformationConfigurationsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public PaymentsProductsServiceFeeConfigurationInformationConfigurations paymentInformation(List<PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation> paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

  public PaymentsProductsServiceFeeConfigurationInformationConfigurations addPaymentInformationItem(PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation paymentInformationItem) {
    if (this.paymentInformation == null) {
      this.paymentInformation = new ArrayList<PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation>();
    }
    this.paymentInformation.add(paymentInformationItem);
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public List<PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation> getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(List<PaymentsProductsServiceFeeConfigurationInformationConfigurationsPaymentInformation> paymentInformation) {
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
    PaymentsProductsServiceFeeConfigurationInformationConfigurations paymentsProductsServiceFeeConfigurationInformationConfigurations = (PaymentsProductsServiceFeeConfigurationInformationConfigurations) o;
    return Objects.equals(this.products, paymentsProductsServiceFeeConfigurationInformationConfigurations.products) &&
        Objects.equals(this.terminalId, paymentsProductsServiceFeeConfigurationInformationConfigurations.terminalId) &&
        Objects.equals(this.merchantId, paymentsProductsServiceFeeConfigurationInformationConfigurations.merchantId) &&
        Objects.equals(this.merchantInformation, paymentsProductsServiceFeeConfigurationInformationConfigurations.merchantInformation) &&
        Objects.equals(this.paymentInformation, paymentsProductsServiceFeeConfigurationInformationConfigurations.paymentInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, terminalId, merchantId, merchantInformation, paymentInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsProductsServiceFeeConfigurationInformationConfigurations {\n");
    
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
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
