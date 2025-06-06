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
import Model.Riskv1authenticationresultsPaymentInformationCard;
import Model.Riskv1authenticationresultsPaymentInformationFluidData;
import Model.Riskv1authenticationresultsPaymentInformationTokenizedCard;
import Model.Riskv1authenticationsPaymentInformationCustomer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1authenticationresultsPaymentInformation
 */

public class Riskv1authenticationresultsPaymentInformation {
  @SerializedName("card")
  private Riskv1authenticationresultsPaymentInformationCard card = null;

  @SerializedName("tokenizedCard")
  private Riskv1authenticationresultsPaymentInformationTokenizedCard tokenizedCard = null;

  @SerializedName("fluidData")
  private Riskv1authenticationresultsPaymentInformationFluidData fluidData = null;

  @SerializedName("customer")
  private Riskv1authenticationsPaymentInformationCustomer customer = null;

  public Riskv1authenticationresultsPaymentInformation card(Riskv1authenticationresultsPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationresultsPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Riskv1authenticationresultsPaymentInformationCard card) {
    this.card = card;
  }

  public Riskv1authenticationresultsPaymentInformation tokenizedCard(Riskv1authenticationresultsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationresultsPaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(Riskv1authenticationresultsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public Riskv1authenticationresultsPaymentInformation fluidData(Riskv1authenticationresultsPaymentInformationFluidData fluidData) {
    this.fluidData = fluidData;
    return this;
  }

   /**
   * Get fluidData
   * @return fluidData
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationresultsPaymentInformationFluidData getFluidData() {
    return fluidData;
  }

  public void setFluidData(Riskv1authenticationresultsPaymentInformationFluidData fluidData) {
    this.fluidData = fluidData;
  }

  public Riskv1authenticationresultsPaymentInformation customer(Riskv1authenticationsPaymentInformationCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsPaymentInformationCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(Riskv1authenticationsPaymentInformationCustomer customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationresultsPaymentInformation riskv1authenticationresultsPaymentInformation = (Riskv1authenticationresultsPaymentInformation) o;
    return Objects.equals(this.card, riskv1authenticationresultsPaymentInformation.card) &&
        Objects.equals(this.tokenizedCard, riskv1authenticationresultsPaymentInformation.tokenizedCard) &&
        Objects.equals(this.fluidData, riskv1authenticationresultsPaymentInformation.fluidData) &&
        Objects.equals(this.customer, riskv1authenticationresultsPaymentInformation.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, tokenizedCard, fluidData, customer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationresultsPaymentInformation {\n");
    
    if (card != null) sb.append("    card: ").append(toIndentedString(card)).append("\n");
    if (tokenizedCard != null) sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    if (fluidData != null) sb.append("    fluidData: ").append(toIndentedString(fluidData)).append("\n");
    if (customer != null) sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

