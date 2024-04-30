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
 * Ptsv2billingagreementsidProcessingInformation
 */

public class Ptsv2billingagreementsidProcessingInformation {
  @SerializedName("commerceIndicator")
  private String commerceIndicator = null;

  @SerializedName("actionList")
  private List<String> actionList = null;

  public Ptsv2billingagreementsidProcessingInformation commerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
    return this;
  }

   /**
   * Type of transaction. Used to determine fees based on channel.  Possible values:    - aesk: American Express SafeKey authentication was successful.   - aesk_attempted: American Express SafeKey authentication was attempted but did not succeed. • install: Installment payment.   - install_internet: Non-U.S. e-commerce (Internet) installment payment. This value is supported only on Visa Platform Connect.   - internet (default for authorizations): E-commerce order placed using a web site.   - js: JCB J/Secure authentication was successful.   - js_attempted: JCB J/Secure authentication was attempted but did not succeed.   - moto: Mail order or telephone order.   - moto_cc: Mail order or telephone order from a call center. This value is supported only on the Asia, Middle East, and Africa Gateway.   - pb: ProtectBuy authentication was successful.   - pb_attempted: ProtectBuy authentication was attempted but did not succeed.   - recurring: Recurring payment that is a U.S. transaction or non-U.S. mail order / telephone order (MOTO) transaction.   - recurring_internet: Recurring payment that is a non-U.S. e-commerce (Internet) transaction.   - retail: Card-present transaction.   - spa: For Mastercard Identity Check: Authentication was successful or was attempted but did not succeed. The e-commerce indicator for all Mastercard Identity Check transactions, including authentication attempts, must be set to spa.   - spa_attempted: Authentication for a co-badged Mastercard and Cartes Bancaires card was attempted but did not succeed.   - spa_failure: – For Mastercard Identity Check: Authentication failed. This value is supported only on Elavon, HSBC, and Streamline.   - vbv: – For Visa Secure: Authentication was successful.   - vbv_attempted: – For Visa Secure: Authentication was attempted but did not succeed.   - vbv_failure: – For Visa Secure: Authentication failed. This value is supported only on HSBC and Streamline. 
   * @return commerceIndicator
  **/
  @ApiModelProperty(value = "Type of transaction. Used to determine fees based on channel.  Possible values:    - aesk: American Express SafeKey authentication was successful.   - aesk_attempted: American Express SafeKey authentication was attempted but did not succeed. • install: Installment payment.   - install_internet: Non-U.S. e-commerce (Internet) installment payment. This value is supported only on Visa Platform Connect.   - internet (default for authorizations): E-commerce order placed using a web site.   - js: JCB J/Secure authentication was successful.   - js_attempted: JCB J/Secure authentication was attempted but did not succeed.   - moto: Mail order or telephone order.   - moto_cc: Mail order or telephone order from a call center. This value is supported only on the Asia, Middle East, and Africa Gateway.   - pb: ProtectBuy authentication was successful.   - pb_attempted: ProtectBuy authentication was attempted but did not succeed.   - recurring: Recurring payment that is a U.S. transaction or non-U.S. mail order / telephone order (MOTO) transaction.   - recurring_internet: Recurring payment that is a non-U.S. e-commerce (Internet) transaction.   - retail: Card-present transaction.   - spa: For Mastercard Identity Check: Authentication was successful or was attempted but did not succeed. The e-commerce indicator for all Mastercard Identity Check transactions, including authentication attempts, must be set to spa.   - spa_attempted: Authentication for a co-badged Mastercard and Cartes Bancaires card was attempted but did not succeed.   - spa_failure: – For Mastercard Identity Check: Authentication failed. This value is supported only on Elavon, HSBC, and Streamline.   - vbv: – For Visa Secure: Authentication was successful.   - vbv_attempted: – For Visa Secure: Authentication was attempted but did not succeed.   - vbv_failure: – For Visa Secure: Authentication failed. This value is supported only on HSBC and Streamline. ")
  public String getCommerceIndicator() {
    return commerceIndicator;
  }

  public void setCommerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
  }

  public Ptsv2billingagreementsidProcessingInformation actionList(List<String> actionList) {
    this.actionList = actionList;
    return this;
  }

  public Ptsv2billingagreementsidProcessingInformation addActionListItem(String actionListItem) {
    if (this.actionList == null) {
      this.actionList = new ArrayList<String>();
    }
    this.actionList.add(actionListItem);
    return this;
  }

   /**
   * - Use &#x60;CONSUMER_AUTHENTICATION&#x60; to use Payer Authentication along with Decision Manager. For any other value, only Decision Manager will run. - Use &#x60;WATCHLIST_SCREENING&#x60;  when you want to call Watchlist Screening service. - Use &#x60;BILLING_AGREEMENT_CREATE&#x60; when Paypal billing agreements service is requested. - Use &#x60;UPDATE_AGREEMENT&#x60; - Use &#x60;CANCEL_AGREEMENT&#x60; - Use &#x60;AP_UPDATE_AGREEMENT&#x60; when Alternative Payment update mandate service is requested. - Use &#x60;AP_CANCEL_AGREEMENT&#x60; when Alternative Payment revoke mandate service is requested. - Use &#x60;AP_REFRESH_AGREEMENT_STATUS&#x60; when Alternative Payment mandate status service is requested. 
   * @return actionList
  **/
  @ApiModelProperty(value = "- Use `CONSUMER_AUTHENTICATION` to use Payer Authentication along with Decision Manager. For any other value, only Decision Manager will run. - Use `WATCHLIST_SCREENING`  when you want to call Watchlist Screening service. - Use `BILLING_AGREEMENT_CREATE` when Paypal billing agreements service is requested. - Use `UPDATE_AGREEMENT` - Use `CANCEL_AGREEMENT` - Use `AP_UPDATE_AGREEMENT` when Alternative Payment update mandate service is requested. - Use `AP_CANCEL_AGREEMENT` when Alternative Payment revoke mandate service is requested. - Use `AP_REFRESH_AGREEMENT_STATUS` when Alternative Payment mandate status service is requested. ")
  public List<String> getActionList() {
    return actionList;
  }

  public void setActionList(List<String> actionList) {
    this.actionList = actionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2billingagreementsidProcessingInformation ptsv2billingagreementsidProcessingInformation = (Ptsv2billingagreementsidProcessingInformation) o;
    return Objects.equals(this.commerceIndicator, ptsv2billingagreementsidProcessingInformation.commerceIndicator) &&
        Objects.equals(this.actionList, ptsv2billingagreementsidProcessingInformation.actionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commerceIndicator, actionList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2billingagreementsidProcessingInformation {\n");
    
    sb.append("    commerceIndicator: ").append(toIndentedString(commerceIndicator)).append("\n");
    sb.append("    actionList: ").append(toIndentedString(actionList)).append("\n");
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
