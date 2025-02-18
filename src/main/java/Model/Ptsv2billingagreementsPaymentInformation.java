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
import Model.Ptsv2billingagreementsPaymentInformationBank;
import Model.Ptsv2billingagreementsPaymentInformationCard;
import Model.Ptsv2billingagreementsPaymentInformationPaymentType;
import Model.Ptsv2billingagreementsPaymentInformationTokenizedCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2billingagreementsPaymentInformation
 */

public class Ptsv2billingagreementsPaymentInformation {
  @SerializedName("card")
  private Ptsv2billingagreementsPaymentInformationCard card = null;

  @SerializedName("tokenizedCard")
  private Ptsv2billingagreementsPaymentInformationTokenizedCard tokenizedCard = null;

  @SerializedName("paymentType")
  private Ptsv2billingagreementsPaymentInformationPaymentType paymentType = null;

  @SerializedName("bank")
  private Ptsv2billingagreementsPaymentInformationBank bank = null;

  public Ptsv2billingagreementsPaymentInformation card(Ptsv2billingagreementsPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Ptsv2billingagreementsPaymentInformationCard card) {
    this.card = card;
  }

  public Ptsv2billingagreementsPaymentInformation tokenizedCard(Ptsv2billingagreementsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsPaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(Ptsv2billingagreementsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public Ptsv2billingagreementsPaymentInformation paymentType(Ptsv2billingagreementsPaymentInformationPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsPaymentInformationPaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(Ptsv2billingagreementsPaymentInformationPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public Ptsv2billingagreementsPaymentInformation bank(Ptsv2billingagreementsPaymentInformationBank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public Ptsv2billingagreementsPaymentInformationBank getBank() {
    return bank;
  }

  public void setBank(Ptsv2billingagreementsPaymentInformationBank bank) {
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
    Ptsv2billingagreementsPaymentInformation ptsv2billingagreementsPaymentInformation = (Ptsv2billingagreementsPaymentInformation) o;
    return Objects.equals(this.card, ptsv2billingagreementsPaymentInformation.card) &&
        Objects.equals(this.tokenizedCard, ptsv2billingagreementsPaymentInformation.tokenizedCard) &&
        Objects.equals(this.paymentType, ptsv2billingagreementsPaymentInformation.paymentType) &&
        Objects.equals(this.bank, ptsv2billingagreementsPaymentInformation.bank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, tokenizedCard, paymentType, bank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2billingagreementsPaymentInformation {\n");
    
    if (card != null) sb.append("    card: ").append(toIndentedString(card)).append("\n");
    if (tokenizedCard != null) sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    if (paymentType != null) sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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

