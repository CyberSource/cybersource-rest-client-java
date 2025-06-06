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
 * PtsV2PaymentsOrderPost201ResponsePaymentInformationEWallet
 */

public class PtsV2PaymentsOrderPost201ResponsePaymentInformationEWallet {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("fundingSource")
  private String fundingSource = null;

  @SerializedName("fundingSourceSale")
  private String fundingSourceSale = null;

  @SerializedName("userName")
  private String userName = null;

  public PtsV2PaymentsOrderPost201ResponsePaymentInformationEWallet accountId(String accountId) {
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

  public PtsV2PaymentsOrderPost201ResponsePaymentInformationEWallet fundingSource(String fundingSource) {
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * Payment mode for the authorization or order transaction.  INSTANT_TRANSFER  MANUAL_BANK_TRANSFER  DELAYED_TRANSFER  ECHECK  UNRESTRICTED (default)—this value is available only when configured by PayPal for the merchant. INSTANT
   * @return fundingSource
  **/
  @ApiModelProperty(value = "Payment mode for the authorization or order transaction.  INSTANT_TRANSFER  MANUAL_BANK_TRANSFER  DELAYED_TRANSFER  ECHECK  UNRESTRICTED (default)—this value is available only when configured by PayPal for the merchant. INSTANT")
  public String getFundingSource() {
    return fundingSource;
  }

  public void setFundingSource(String fundingSource) {
    this.fundingSource = fundingSource;
  }

  public PtsV2PaymentsOrderPost201ResponsePaymentInformationEWallet fundingSourceSale(String fundingSourceSale) {
    this.fundingSourceSale = fundingSourceSale;
    return this;
  }

   /**
   * Payment method for the unit purchase. Possible values: - &#x60;UNRESTRICTED (default)—this value is only available if configured by PayPal for the merchant.&#x60; - &#x60;INSTANT&#x60; 
   * @return fundingSourceSale
  **/
  @ApiModelProperty(value = "Payment method for the unit purchase. Possible values: - `UNRESTRICTED (default)—this value is only available if configured by PayPal for the merchant.` - `INSTANT` ")
  public String getFundingSourceSale() {
    return fundingSourceSale;
  }

  public void setFundingSourceSale(String fundingSourceSale) {
    this.fundingSourceSale = fundingSourceSale;
  }

  public PtsV2PaymentsOrderPost201ResponsePaymentInformationEWallet userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The Venmo user name chosen by the user, also know as a Venmo handle. 
   * @return userName
  **/
  @ApiModelProperty(value = "The Venmo user name chosen by the user, also know as a Venmo handle. ")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsOrderPost201ResponsePaymentInformationEWallet ptsV2PaymentsOrderPost201ResponsePaymentInformationEWallet = (PtsV2PaymentsOrderPost201ResponsePaymentInformationEWallet) o;
    return Objects.equals(this.accountId, ptsV2PaymentsOrderPost201ResponsePaymentInformationEWallet.accountId) &&
        Objects.equals(this.fundingSource, ptsV2PaymentsOrderPost201ResponsePaymentInformationEWallet.fundingSource) &&
        Objects.equals(this.fundingSourceSale, ptsV2PaymentsOrderPost201ResponsePaymentInformationEWallet.fundingSourceSale) &&
        Objects.equals(this.userName, ptsV2PaymentsOrderPost201ResponsePaymentInformationEWallet.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, fundingSource, fundingSourceSale, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsOrderPost201ResponsePaymentInformationEWallet {\n");
    
    if (accountId != null) sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    if (fundingSource != null) sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    if (fundingSourceSale != null) sb.append("    fundingSourceSale: ").append(toIndentedString(fundingSourceSale)).append("\n");
    if (userName != null) sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

