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
 * PtsV2PaymentsPost201Response1PaymentInformationEWallet
 */

public class PtsV2PaymentsPost201Response1PaymentInformationEWallet {
  @SerializedName("name")
  private String name = null;

  @SerializedName("fundingSource")
  private String fundingSource = null;

  public PtsV2PaymentsPost201Response1PaymentInformationEWallet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Valid Values: - CreditCard - BankTransfer - MobileTransfer - KakaoMoney - NaverPayPoint 
   * @return name
  **/
  @ApiModelProperty(value = "Valid Values: - CreditCard - BankTransfer - MobileTransfer - KakaoMoney - NaverPayPoint ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PtsV2PaymentsPost201Response1PaymentInformationEWallet fundingSource(String fundingSource) {
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * Valid Values: - PAYCO - Kakaopay - NaverPay - SSG Pay - L.Pay - Apple Pay - TOSS Pay - Samsung Pay 
   * @return fundingSource
  **/
  @ApiModelProperty(value = "Valid Values: - PAYCO - Kakaopay - NaverPay - SSG Pay - L.Pay - Apple Pay - TOSS Pay - Samsung Pay ")
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
    PtsV2PaymentsPost201Response1PaymentInformationEWallet ptsV2PaymentsPost201Response1PaymentInformationEWallet = (PtsV2PaymentsPost201Response1PaymentInformationEWallet) o;
    return Objects.equals(this.name, ptsV2PaymentsPost201Response1PaymentInformationEWallet.name) &&
        Objects.equals(this.fundingSource, ptsV2PaymentsPost201Response1PaymentInformationEWallet.fundingSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fundingSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201Response1PaymentInformationEWallet {\n");
    
    if (name != null) sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

