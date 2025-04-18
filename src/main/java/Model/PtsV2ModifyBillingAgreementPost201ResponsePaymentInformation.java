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
import Model.PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank;
import Model.PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationEWallet;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2ModifyBillingAgreementPost201ResponsePaymentInformation
 */

public class PtsV2ModifyBillingAgreementPost201ResponsePaymentInformation {
  @SerializedName("eWallet")
  private PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationEWallet eWallet = null;

  @SerializedName("bank")
  private PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank bank = null;

  public PtsV2ModifyBillingAgreementPost201ResponsePaymentInformation eWallet(PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationEWallet eWallet) {
    this.eWallet = eWallet;
    return this;
  }

   /**
   * Get eWallet
   * @return eWallet
  **/
  @ApiModelProperty(value = "")
  public PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationEWallet getEWallet() {
    return eWallet;
  }

  public void setEWallet(PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationEWallet eWallet) {
    this.eWallet = eWallet;
  }

  public PtsV2ModifyBillingAgreementPost201ResponsePaymentInformation bank(PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank getBank() {
    return bank;
  }

  public void setBank(PtsV2ModifyBillingAgreementPost201ResponsePaymentInformationBank bank) {
    this.bank = bank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2ModifyBillingAgreementPost201ResponsePaymentInformation ptsV2ModifyBillingAgreementPost201ResponsePaymentInformation = (PtsV2ModifyBillingAgreementPost201ResponsePaymentInformation) o;
    return Objects.equals(this.eWallet, ptsV2ModifyBillingAgreementPost201ResponsePaymentInformation.eWallet) &&
        Objects.equals(this.bank, ptsV2ModifyBillingAgreementPost201ResponsePaymentInformation.bank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eWallet, bank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2ModifyBillingAgreementPost201ResponsePaymentInformation {\n");
    
    if (eWallet != null) sb.append("    eWallet: ").append(toIndentedString(eWallet)).append("\n");
    if (bank != null) sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
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

