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
import Model.Binv1binlookupPaymentInformationCard;
import Model.GetAllSubscriptionsResponsePaymentInformationCustomer;
import Model.Ptsv2paymentsPaymentInformationInstrumentIdentifier;
import Model.Ptsv2paymentsPaymentInformationPaymentInstrument;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Binv1binlookupPaymentInformation
 */

public class Binv1binlookupPaymentInformation {
  @SerializedName("card")
  private Binv1binlookupPaymentInformationCard card = null;

  @SerializedName("customer")
  private GetAllSubscriptionsResponsePaymentInformationCustomer customer = null;

  @SerializedName("paymentInstrument")
  private Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument = null;

  @SerializedName("instrumentIdentifier")
  private Ptsv2paymentsPaymentInformationInstrumentIdentifier instrumentIdentifier = null;

  public Binv1binlookupPaymentInformation card(Binv1binlookupPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Binv1binlookupPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Binv1binlookupPaymentInformationCard card) {
    this.card = card;
  }

  public Binv1binlookupPaymentInformation customer(GetAllSubscriptionsResponsePaymentInformationCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public GetAllSubscriptionsResponsePaymentInformationCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(GetAllSubscriptionsResponsePaymentInformationCustomer customer) {
    this.customer = customer;
  }

  public Binv1binlookupPaymentInformation paymentInstrument(Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * Get paymentInstrument
   * @return paymentInstrument
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationPaymentInstrument getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  public Binv1binlookupPaymentInformation instrumentIdentifier(Ptsv2paymentsPaymentInformationInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
    return this;
  }

   /**
   * Get instrumentIdentifier
   * @return instrumentIdentifier
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationInstrumentIdentifier getInstrumentIdentifier() {
    return instrumentIdentifier;
  }

  public void setInstrumentIdentifier(Ptsv2paymentsPaymentInformationInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Binv1binlookupPaymentInformation binv1binlookupPaymentInformation = (Binv1binlookupPaymentInformation) o;
    return Objects.equals(this.card, binv1binlookupPaymentInformation.card) &&
        Objects.equals(this.customer, binv1binlookupPaymentInformation.customer) &&
        Objects.equals(this.paymentInstrument, binv1binlookupPaymentInformation.paymentInstrument) &&
        Objects.equals(this.instrumentIdentifier, binv1binlookupPaymentInformation.instrumentIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, customer, paymentInstrument, instrumentIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Binv1binlookupPaymentInformation {\n");
    
    if (card != null) sb.append("    card: ").append(toIndentedString(card)).append("\n");
    if (customer != null) sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    if (paymentInstrument != null) sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    if (instrumentIdentifier != null) sb.append("    instrumentIdentifier: ").append(toIndentedString(instrumentIdentifier)).append("\n");
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

