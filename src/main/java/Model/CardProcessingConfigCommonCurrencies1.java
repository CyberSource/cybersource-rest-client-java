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
 * CardProcessingConfigCommonCurrencies1
 */

public class CardProcessingConfigCommonCurrencies1 {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("enabledCardPresent")
  private Boolean enabledCardPresent = null;

  @SerializedName("enabledCardNotPresent")
  private Boolean enabledCardNotPresent = null;

  @SerializedName("merchantId")
  private Object merchantId = null;

  @SerializedName("terminalId")
  private Object terminalId = null;

  @SerializedName("terminalIds")
  private List<String> terminalIds = null;

  @SerializedName("serviceEnablementNumber")
  private Object serviceEnablementNumber = null;

  public CardProcessingConfigCommonCurrencies1 enabled(Boolean enabled) {
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

  public CardProcessingConfigCommonCurrencies1 enabledCardPresent(Boolean enabledCardPresent) {
    this.enabledCardPresent = enabledCardPresent;
    return this;
  }

   /**
   * Indicates whether the card-present transaction is activated for the selected currency. If both enabledCardPresent and enabledCardNotPresent are set to null, then enabledCardPresent will have the value of enabled. 
   * @return enabledCardPresent
  **/
  @ApiModelProperty(value = "Indicates whether the card-present transaction is activated for the selected currency. If both enabledCardPresent and enabledCardNotPresent are set to null, then enabledCardPresent will have the value of enabled. ")
  public Boolean EnabledCardPresent() {
    return enabledCardPresent;
  }

  public void setEnabledCardPresent(Boolean enabledCardPresent) {
    this.enabledCardPresent = enabledCardPresent;
  }

  public CardProcessingConfigCommonCurrencies1 enabledCardNotPresent(Boolean enabledCardNotPresent) {
    this.enabledCardNotPresent = enabledCardNotPresent;
    return this;
  }

   /**
   * Indicates whether the card-present transaction is activated for the selected currency. If both enabledCardPresent and enabledCardNotPresent are set to null, then enabledCardNotPresent will have the value of enabled. 
   * @return enabledCardNotPresent
  **/
  @ApiModelProperty(value = "Indicates whether the card-present transaction is activated for the selected currency. If both enabledCardPresent and enabledCardNotPresent are set to null, then enabledCardNotPresent will have the value of enabled. ")
  public Boolean EnabledCardNotPresent() {
    return enabledCardNotPresent;
  }

  public void setEnabledCardNotPresent(Boolean enabledCardNotPresent) {
    this.enabledCardNotPresent = enabledCardNotPresent;
  }

  public CardProcessingConfigCommonCurrencies1 merchantId(Object merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Merchant ID assigned by an acquirer or a processor. Should not be overriden by any other party.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;Barclays&lt;/td&gt;&lt;td&gt;cp, cnp, hybrid&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;11&lt;/td&gt;&lt;td&gt;^[0-9a-zA-Z]+$&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return merchantId
  **/
  @ApiModelProperty(value = "Merchant ID assigned by an acquirer or a processor. Should not be overriden by any other party.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>Barclays</td><td>cp, cnp, hybrid</td><td>Yes</td><td>1</td><td>11</td><td>^[0-9a-zA-Z]+$</td></tr> </table> ")
  public Object getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(Object merchantId) {
    this.merchantId = merchantId;
  }

  public CardProcessingConfigCommonCurrencies1 terminalId(Object terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * The &#39;Terminal Id&#39; aka TID, is an identifier used for with your payments processor. Depending on the processor and payment acceptance type this may also be the default Terminal ID used for Card Present and Virtual Terminal transactions.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;Barclays&lt;/td&gt;&lt;td&gt;cp, cnp, hybrid&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;td&gt;8&lt;/td&gt;&lt;td&gt;8&lt;/td&gt;&lt;td&gt;^[0-9]+$&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return terminalId
  **/
  @ApiModelProperty(value = "The 'Terminal Id' aka TID, is an identifier used for with your payments processor. Depending on the processor and payment acceptance type this may also be the default Terminal ID used for Card Present and Virtual Terminal transactions.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>Barclays</td><td>cp, cnp, hybrid</td><td>Yes</td><td>8</td><td>8</td><td>^[0-9]+$</td></tr> </table> ")
  public Object getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(Object terminalId) {
    this.terminalId = terminalId;
  }

  public CardProcessingConfigCommonCurrencies1 terminalIds(List<String> terminalIds) {
    this.terminalIds = terminalIds;
    return this;
  }

  public CardProcessingConfigCommonCurrencies1 addTerminalIdsItem(String terminalIdsItem) {
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

  public CardProcessingConfigCommonCurrencies1 serviceEnablementNumber(Object serviceEnablementNumber) {
    this.serviceEnablementNumber = serviceEnablementNumber;
    return this;
  }

   /**
   * Service Establishment Number (a.k.a. SE Number) is a unique ten-digit number assigned by American Express to a merchant that accepts American Express cards. 10 digit number provided by acquirer currency. This may be unique for each currency, however it depends on the way the processor is set up for the merchant.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cp, cnp, hybrid&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;td&gt;10&lt;/td&gt;&lt;td&gt;10&lt;/td&gt;&lt;td&gt;^[0-9]+$&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return serviceEnablementNumber
  **/
  @ApiModelProperty(value = "Service Establishment Number (a.k.a. SE Number) is a unique ten-digit number assigned by American Express to a merchant that accepts American Express cards. 10 digit number provided by acquirer currency. This may be unique for each currency, however it depends on the way the processor is set up for the merchant.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>American Express Direct</td><td>cp, cnp, hybrid</td><td>Yes</td><td>10</td><td>10</td><td>^[0-9]+$</td></tr> </table> ")
  public Object getServiceEnablementNumber() {
    return serviceEnablementNumber;
  }

  public void setServiceEnablementNumber(Object serviceEnablementNumber) {
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
    CardProcessingConfigCommonCurrencies1 cardProcessingConfigCommonCurrencies1 = (CardProcessingConfigCommonCurrencies1) o;
    return Objects.equals(this.enabled, cardProcessingConfigCommonCurrencies1.enabled) &&
        Objects.equals(this.enabledCardPresent, cardProcessingConfigCommonCurrencies1.enabledCardPresent) &&
        Objects.equals(this.enabledCardNotPresent, cardProcessingConfigCommonCurrencies1.enabledCardNotPresent) &&
        Objects.equals(this.merchantId, cardProcessingConfigCommonCurrencies1.merchantId) &&
        Objects.equals(this.terminalId, cardProcessingConfigCommonCurrencies1.terminalId) &&
        Objects.equals(this.terminalIds, cardProcessingConfigCommonCurrencies1.terminalIds) &&
        Objects.equals(this.serviceEnablementNumber, cardProcessingConfigCommonCurrencies1.serviceEnablementNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, enabledCardPresent, enabledCardNotPresent, merchantId, terminalId, terminalIds, serviceEnablementNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardProcessingConfigCommonCurrencies1 {\n");
    
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

