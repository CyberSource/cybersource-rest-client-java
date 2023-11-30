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
import Model.PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonCurrencies;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonPaymentTypes
 */

public class PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonPaymentTypes {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("currencies")
  private Map<String, PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonCurrencies> currencies = null;

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonPaymentTypes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonPaymentTypes currencies(Map<String, PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonCurrencies> currencies) {
    this.currencies = currencies;
    return this;
  }

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonPaymentTypes putCurrenciesItem(String key, PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonCurrencies currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new HashMap<String, PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonCurrencies>();
    }
    this.currencies.put(key, currenciesItem);
    return this;
  }

   /**
   * Three-character [ISO 4217 ALPHA-3 Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)
   * @return currencies
  **/
  @ApiModelProperty(value = "Three-character [ISO 4217 ALPHA-3 Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)")
  public Map<String, PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonCurrencies> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(Map<String, PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonCurrencies> currencies) {
    this.currencies = currencies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonPaymentTypes paymentProductsCardProcessingConfigurationInformationConfigurationsCommonPaymentTypes = (PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonPaymentTypes) o;
    return Objects.equals(this.enabled, paymentProductsCardProcessingConfigurationInformationConfigurationsCommonPaymentTypes.enabled) &&
        Objects.equals(this.currencies, paymentProductsCardProcessingConfigurationInformationConfigurationsCommonPaymentTypes.currencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, currencies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProductsCardProcessingConfigurationInformationConfigurationsCommonPaymentTypes {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
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
