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
import java.util.ArrayList;
import java.util.List;

/**
 * CardProcessingConfigCommonCurrencies
 */

public class CardProcessingConfigCommonCurrencies {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("enabledCardPresent")
  private Boolean enabledCardPresent = null;

  @SerializedName("enabledCardNotPresent")
  private Boolean enabledCardNotPresent = null;

  @SerializedName("merchantId")
  private String merchantId = null;

  @SerializedName("terminalId")
  private String terminalId = null;

  @SerializedName("terminalIds")
  private List<String> terminalIds = null;

  @SerializedName("serviceEnablementNumber")
  private String serviceEnablementNumber = null;

  public CardProcessingConfigCommonCurrencies enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean Enabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CardProcessingConfigCommonCurrencies enabledCardPresent(Boolean enabledCardPresent) {
    this.enabledCardPresent = enabledCardPresent;
    return this;
  }

   /**
   * Indicates whether the card-present transaction is activated for the selected currency. If both enabledCardPresent and enabledCardNotPresent are set to null, then enabledCardPresent will have the value of enabled.
   * @return enabledCardPresent
  **/
  @ApiModelProperty(value = "Indicates whether the card-present transaction is activated for the selected currency. If both enabledCardPresent and enabledCardNotPresent are set to null, then enabledCardPresent will have the value of enabled.")
  public Boolean EnabledCardPresent() {
    return enabledCardPresent;
  }

  public void setEnabledCardPresent(Boolean enabledCardPresent) {
    this.enabledCardPresent = enabledCardPresent;
  }

  public CardProcessingConfigCommonCurrencies enabledCardNotPresent(Boolean enabledCardNotPresent) {
    this.enabledCardNotPresent = enabledCardNotPresent;
    return this;
  }

   /**
   * Indicates whether the card-not-present transaction is activated for the selected currency. If both enabledCardPresent and enabledCardNotPresent are set to null, then enabledCardNotPresent will have the value of enabled.
   * @return enabledCardNotPresent
  **/
  @ApiModelProperty(value = "Indicates whether the card-not-present transaction is activated for the selected currency. If both enabledCardPresent and enabledCardNotPresent are set to null, then enabledCardNotPresent will have the value of enabled.")
  public Boolean EnabledCardNotPresent() {
    return enabledCardNotPresent;
  }

  public void setEnabledCardNotPresent(Boolean enabledCardNotPresent) {
    this.enabledCardNotPresent = enabledCardNotPresent;
  }

  public CardProcessingConfigCommonCurrencies merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Merchant ID assigned by an acquirer or a processor. Should not be overridden by any other party.
   * @return merchantId
  **/
  @ApiModelProperty(value = "Merchant ID assigned by an acquirer or a processor. Should not be overridden by any other party.")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public CardProcessingConfigCommonCurrencies terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * The &#39;Terminal Id&#39; aka TID, is an identifier used for with your payments processor. Depending on the processor and payment acceptance type this may also be the default Terminal ID used for Card Present and Virtual Terminal transactions. 
   * @return terminalId
  **/
  @ApiModelProperty(value = "The 'Terminal Id' aka TID, is an identifier used for with your payments processor. Depending on the processor and payment acceptance type this may also be the default Terminal ID used for Card Present and Virtual Terminal transactions. ")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public CardProcessingConfigCommonCurrencies terminalIds(List<String> terminalIds) {
    this.terminalIds = terminalIds;
    return this;
  }

  public CardProcessingConfigCommonCurrencies addTerminalIdsItem(String terminalIdsItem) {
    if (this.terminalIds == null) {
      this.terminalIds = new ArrayList<String>();
    }
    this.terminalIds.add(terminalIdsItem);
    return this;
  }

   /**
   * Applicable for Prisma (prisma) processor.
   * @return terminalIds
  **/
  @ApiModelProperty(value = "Applicable for Prisma (prisma) processor.")
  public List<String> getTerminalIds() {
    return terminalIds;
  }

  public void setTerminalIds(List<String> terminalIds) {
    this.terminalIds = terminalIds;
  }

  public CardProcessingConfigCommonCurrencies serviceEnablementNumber(String serviceEnablementNumber) {
    this.serviceEnablementNumber = serviceEnablementNumber;
    return this;
  }

   /**
   * Service Establishment Number (a.k.a. SE Number) is a unique ten-digit number assigned by American Express to a merchant that accepts American Express cards. 10 digit number provided by acquirer currency. This may be unique for each currency, however it depends on the way the processor is set up for the merchant. 
   * @return serviceEnablementNumber
  **/
  @ApiModelProperty(value = "Service Establishment Number (a.k.a. SE Number) is a unique ten-digit number assigned by American Express to a merchant that accepts American Express cards. 10 digit number provided by acquirer currency. This may be unique for each currency, however it depends on the way the processor is set up for the merchant. ")
  public String getServiceEnablementNumber() {
    return serviceEnablementNumber;
  }

  public void setServiceEnablementNumber(String serviceEnablementNumber) {
    this.serviceEnablementNumber = serviceEnablementNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardProcessingConfigCommonCurrencies cardProcessingConfigCommonCurrencies = (CardProcessingConfigCommonCurrencies) o;
    return Objects.equals(this.enabled, cardProcessingConfigCommonCurrencies.enabled) &&
        Objects.equals(this.enabledCardPresent, cardProcessingConfigCommonCurrencies.enabledCardPresent) &&
        Objects.equals(this.enabledCardNotPresent, cardProcessingConfigCommonCurrencies.enabledCardNotPresent) &&
        Objects.equals(this.merchantId, cardProcessingConfigCommonCurrencies.merchantId) &&
        Objects.equals(this.terminalId, cardProcessingConfigCommonCurrencies.terminalId) &&
        Objects.equals(this.terminalIds, cardProcessingConfigCommonCurrencies.terminalIds) &&
        Objects.equals(this.serviceEnablementNumber, cardProcessingConfigCommonCurrencies.serviceEnablementNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, enabledCardPresent, enabledCardNotPresent, merchantId, terminalId, terminalIds, serviceEnablementNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardProcessingConfigCommonCurrencies {\n");
    
    if (enabled != null) sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    if (enabledCardPresent != null) sb.append("    enabledCardPresent: ").append(toIndentedString(enabledCardPresent)).append("\n");
    if (enabledCardNotPresent != null) sb.append("    enabledCardNotPresent: ").append(toIndentedString(enabledCardNotPresent)).append("\n");
    if (merchantId != null) sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    if (terminalId != null) sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    if (terminalIds != null) sb.append("    terminalIds: ").append(toIndentedString(terminalIds)).append("\n");
    if (serviceEnablementNumber != null) sb.append("    serviceEnablementNumber: ").append(toIndentedString(serviceEnablementNumber)).append("\n");
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

