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
 * Ptsv2paymentsPaymentInformationEWallet
 */

public class Ptsv2paymentsPaymentInformationEWallet {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("fundingSource")
  private String fundingSource = null;

  public Ptsv2paymentsPaymentInformationEWallet accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the customer, passed in the return_url field by PayPal after customer approval.
   * @return accountId
  **/
  @ApiModelProperty(value = "The ID of the customer, passed in the return_url field by PayPal after customer approval.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Ptsv2paymentsPaymentInformationEWallet fundingSource(String fundingSource) {
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * Payment method for the unit purchase. Possible values: - &#x60;UNRESTRICTED (default)—this value is only available if configured by PayPal for the merchant.&#x60; - &#x60;INSTANT&#x60; 
   * @return fundingSource
  **/
  @ApiModelProperty(value = "Payment method for the unit purchase. Possible values: - `UNRESTRICTED (default)—this value is only available if configured by PayPal for the merchant.` - `INSTANT` ")
  public String getFundingSource() {
    return fundingSource;
  }

  public void setFundingSource(String fundingSource) {
    this.fundingSource = fundingSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPaymentInformationEWallet ptsv2paymentsPaymentInformationEWallet = (Ptsv2paymentsPaymentInformationEWallet) o;
    return Objects.equals(this.accountId, ptsv2paymentsPaymentInformationEWallet.accountId) &&
        Objects.equals(this.fundingSource, ptsv2paymentsPaymentInformationEWallet.fundingSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, fundingSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformationEWallet {\n");
    
    if (accountId != null) sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    if (fundingSource != null) sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
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

