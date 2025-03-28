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
 * Ptsv2paymentsPaymentInformationBankAccount
 */

public class Ptsv2paymentsPaymentInformationBankAccount {
  @SerializedName("type")
  private String type = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("encoderId")
  private String encoderId = null;

  @SerializedName("checkNumber")
  private String checkNumber = null;

  @SerializedName("checkImageReferenceNumber")
  private String checkImageReferenceNumber = null;

  @SerializedName("iban")
  private String iban = null;

  public Ptsv2paymentsPaymentInformationBankAccount type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Account type.  Possible values:  - **C**: Checking.  - **G**: General ledger. This value is supported only on Wells Fargo ACH.  - **S**: Savings (U.S. dollars only).  - **X**: Corporate checking (U.S. dollars only). 
   * @return type
  **/
  @ApiModelProperty(value = "Account type.  Possible values:  - **C**: Checking.  - **G**: General ledger. This value is supported only on Wells Fargo ACH.  - **S**: Savings (U.S. dollars only).  - **X**: Corporate checking (U.S. dollars only). ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv2paymentsPaymentInformationBankAccount number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Account number.  When processing encoded account numbers, use this field for the encoded account number. 
   * @return number
  **/
  @ApiModelProperty(value = "Account number.  When processing encoded account numbers, use this field for the encoded account number. ")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Ptsv2paymentsPaymentInformationBankAccount encoderId(String encoderId) {
    this.encoderId = encoderId;
    return this;
  }

   /**
   * Identifier for the bank that provided the customer&#39;s encoded account number.  To obtain the bank identifier, contact your processor. 
   * @return encoderId
  **/
  @ApiModelProperty(value = "Identifier for the bank that provided the customer's encoded account number.  To obtain the bank identifier, contact your processor. ")
  public String getEncoderId() {
    return encoderId;
  }

  public void setEncoderId(String encoderId) {
    this.encoderId = encoderId;
  }

  public Ptsv2paymentsPaymentInformationBankAccount checkNumber(String checkNumber) {
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * Check number.  Chase Paymentech Solutions - Optional. CyberSource ACH Service - Not used. RBS WorldPay Atlanta - Optional on debits. Required on credits. TeleCheck - Strongly recommended on debit requests. Optional on credits. 
   * @return checkNumber
  **/
  @ApiModelProperty(value = "Check number.  Chase Paymentech Solutions - Optional. CyberSource ACH Service - Not used. RBS WorldPay Atlanta - Optional on debits. Required on credits. TeleCheck - Strongly recommended on debit requests. Optional on credits. ")
  public String getCheckNumber() {
    return checkNumber;
  }

  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }

  public Ptsv2paymentsPaymentInformationBankAccount checkImageReferenceNumber(String checkImageReferenceNumber) {
    this.checkImageReferenceNumber = checkImageReferenceNumber;
    return this;
  }

   /**
   * Image reference number associated with the check. You cannot include any special characters. 
   * @return checkImageReferenceNumber
  **/
  @ApiModelProperty(value = "Image reference number associated with the check. You cannot include any special characters. ")
  public String getCheckImageReferenceNumber() {
    return checkImageReferenceNumber;
  }

  public void setCheckImageReferenceNumber(String checkImageReferenceNumber) {
    this.checkImageReferenceNumber = checkImageReferenceNumber;
  }

  public Ptsv2paymentsPaymentInformationBankAccount iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * International Bank Account Number (IBAN) for the bank account. For some countries you can provide this number instead of the traditional bank account information. You can use this field only when scoring a direct debit transaction. 
   * @return iban
  **/
  @ApiModelProperty(value = "International Bank Account Number (IBAN) for the bank account. For some countries you can provide this number instead of the traditional bank account information. You can use this field only when scoring a direct debit transaction. ")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPaymentInformationBankAccount ptsv2paymentsPaymentInformationBankAccount = (Ptsv2paymentsPaymentInformationBankAccount) o;
    return Objects.equals(this.type, ptsv2paymentsPaymentInformationBankAccount.type) &&
        Objects.equals(this.number, ptsv2paymentsPaymentInformationBankAccount.number) &&
        Objects.equals(this.encoderId, ptsv2paymentsPaymentInformationBankAccount.encoderId) &&
        Objects.equals(this.checkNumber, ptsv2paymentsPaymentInformationBankAccount.checkNumber) &&
        Objects.equals(this.checkImageReferenceNumber, ptsv2paymentsPaymentInformationBankAccount.checkImageReferenceNumber) &&
        Objects.equals(this.iban, ptsv2paymentsPaymentInformationBankAccount.iban);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, number, encoderId, checkNumber, checkImageReferenceNumber, iban);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformationBankAccount {\n");
    
    if (type != null) sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (number != null) sb.append("    number: ").append(toIndentedString(number)).append("\n");
    if (encoderId != null) sb.append("    encoderId: ").append(toIndentedString(encoderId)).append("\n");
    if (checkNumber != null) sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    if (checkImageReferenceNumber != null) sb.append("    checkImageReferenceNumber: ").append(toIndentedString(checkImageReferenceNumber)).append("\n");
    if (iban != null) sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
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

