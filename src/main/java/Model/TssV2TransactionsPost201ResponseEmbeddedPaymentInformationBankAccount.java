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
 * TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount
 */

public class TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount {
  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("prefix")
  private String prefix = null;

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Last four digits of the customer&#39;s payment account number. 
   * @return suffix
  **/
  @ApiModelProperty(value = "Last four digits of the customer's payment account number. ")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Bank Identification Number (BIN). This is the initial four to six numbers on a credit card account number. 
   * @return prefix
  **/
  @ApiModelProperty(value = "Bank Identification Number (BIN). This is the initial four to six numbers on a credit card account number. ")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount tssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount = (TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount) o;
    return Objects.equals(this.suffix, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount.suffix) &&
        Objects.equals(this.prefix, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suffix, prefix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount {\n");
    
    if (suffix != null) sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    if (prefix != null) sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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

