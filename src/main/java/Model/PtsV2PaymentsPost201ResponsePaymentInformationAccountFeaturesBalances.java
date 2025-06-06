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
 * PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances
 */

public class PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances {
  @SerializedName("accountType")
  private String accountType = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("amountType")
  private String amountType = null;

  @SerializedName("currency")
  private String currency = null;

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Type of account.  This value is returned only if you request a balance inquiry.  Possible values:   - &#x60;00&#x60;: Not applicable or not specified  - &#x60;10&#x60;: Savings account  - &#x60;20&#x60;: Checking account  - &#x60;30&#x60;: Credit card account  - &#x60;40&#x60;: Universal account  Balance Account Types returned on EBT Debit card transactions:   - &#x60;96&#x60;: Cash Benefits Account (PIN Debit Gateway EBT only)  - &#x60;98&#x60;: Food Stamp Account (PIN Debit Gateway EBT only) 
   * @return accountType
  **/
  @ApiModelProperty(value = "Type of account.  This value is returned only if you request a balance inquiry.  Possible values:   - `00`: Not applicable or not specified  - `10`: Savings account  - `20`: Checking account  - `30`: Credit card account  - `40`: Universal account  Balance Account Types returned on EBT Debit card transactions:   - `96`: Cash Benefits Account (PIN Debit Gateway EBT only)  - `98`: Food Stamp Account (PIN Debit Gateway EBT only) ")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Remaining balance on the account. If the processor returns the sign, positive or negative, this sign is prefixed to the amount value as (+/-). 
   * @return amount
  **/
  @ApiModelProperty(value = "Remaining balance on the account. If the processor returns the sign, positive or negative, this sign is prefixed to the amount value as (+/-). ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances amountType(String amountType) {
    this.amountType = amountType;
    return this;
  }

   /**
   * Type of amount. This value is returned only if you request a balance inquiry. The issuer determines the value that is returned.  Possible values for deposit accounts:   - &#x60;01&#x60;: Current ledger (posted) balance.  - &#x60;02&#x60;: Current available balance, which is typically the ledger balance minus outstanding authorizations. Some  depository institutions also include pending deposits and the credit or overdraft line associated with the account.  Possible values for credit card accounts:   - &#x60;01&#x60;: Credit amount remaining for customer (open to buy).  - &#x60;02&#x60;: Credit limit. 
   * @return amountType
  **/
  @ApiModelProperty(value = "Type of amount. This value is returned only if you request a balance inquiry. The issuer determines the value that is returned.  Possible values for deposit accounts:   - `01`: Current ledger (posted) balance.  - `02`: Current available balance, which is typically the ledger balance minus outstanding authorizations. Some  depository institutions also include pending deposits and the credit or overdraft line associated with the account.  Possible values for credit card accounts:   - `01`: Credit amount remaining for customer (open to buy).  - `02`: Credit limit. ")
  public String getAmountType() {
    return amountType;
  }

  public void setAmountType(String amountType) {
    this.amountType = amountType;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the remaining balance on the account. 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency of the remaining balance on the account. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances ptsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances = (PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances) o;
    return Objects.equals(this.accountType, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances.accountType) &&
        Objects.equals(this.amount, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances.amount) &&
        Objects.equals(this.amountType, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances.amountType) &&
        Objects.equals(this.currency, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, amount, amountType, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances {\n");
    
    if (accountType != null) sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    if (amount != null) sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    if (amountType != null) sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    if (currency != null) sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

