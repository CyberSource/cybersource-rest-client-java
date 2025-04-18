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
import Model.PtsV2PaymentsPost201ResponseTokenInformationCustomer;
import Model.PtsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier;
import Model.PtsV2PaymentsPost201ResponseTokenInformationPaymentInstrument;
import Model.PtsV2PaymentsPost201ResponseTokenInformationShippingAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponseTokenInformation
 */

public class PtsV2PaymentsPost201ResponseTokenInformation {
  @SerializedName("instrumentidentifierNew")
  private Boolean instrumentidentifierNew = null;

  @SerializedName("customer")
  private PtsV2PaymentsPost201ResponseTokenInformationCustomer customer = null;

  @SerializedName("paymentInstrument")
  private PtsV2PaymentsPost201ResponseTokenInformationPaymentInstrument paymentInstrument = null;

  @SerializedName("shippingAddress")
  private PtsV2PaymentsPost201ResponseTokenInformationShippingAddress shippingAddress = null;

  @SerializedName("instrumentIdentifier")
  private PtsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier instrumentIdentifier = null;

  public PtsV2PaymentsPost201ResponseTokenInformation instrumentidentifierNew(Boolean instrumentidentifierNew) {
    this.instrumentidentifierNew = instrumentidentifierNew;
    return this;
  }

   /**
   * A value of true means the card number or bank account used to create an Instrument Identifier was new and did not already exist in the token vault. A value of false means the card number or bank account used to create an Instrument Identifier already existed in the token vault. 
   * @return instrumentidentifierNew
  **/
  @ApiModelProperty(value = "A value of true means the card number or bank account used to create an Instrument Identifier was new and did not already exist in the token vault. A value of false means the card number or bank account used to create an Instrument Identifier already existed in the token vault. ")
  public Boolean InstrumentidentifierNew() {
    return instrumentidentifierNew;
  }

  public void setInstrumentidentifierNew(Boolean instrumentidentifierNew) {
    this.instrumentidentifierNew = instrumentidentifierNew;
  }

  public PtsV2PaymentsPost201ResponseTokenInformation customer(PtsV2PaymentsPost201ResponseTokenInformationCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseTokenInformationCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(PtsV2PaymentsPost201ResponseTokenInformationCustomer customer) {
    this.customer = customer;
  }

  public PtsV2PaymentsPost201ResponseTokenInformation paymentInstrument(PtsV2PaymentsPost201ResponseTokenInformationPaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * Get paymentInstrument
   * @return paymentInstrument
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseTokenInformationPaymentInstrument getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(PtsV2PaymentsPost201ResponseTokenInformationPaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  public PtsV2PaymentsPost201ResponseTokenInformation shippingAddress(PtsV2PaymentsPost201ResponseTokenInformationShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseTokenInformationShippingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(PtsV2PaymentsPost201ResponseTokenInformationShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public PtsV2PaymentsPost201ResponseTokenInformation instrumentIdentifier(PtsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
    return this;
  }

   /**
   * Get instrumentIdentifier
   * @return instrumentIdentifier
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier getInstrumentIdentifier() {
    return instrumentIdentifier;
  }

  public void setInstrumentIdentifier(PtsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier instrumentIdentifier) {
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
    PtsV2PaymentsPost201ResponseTokenInformation ptsV2PaymentsPost201ResponseTokenInformation = (PtsV2PaymentsPost201ResponseTokenInformation) o;
    return Objects.equals(this.instrumentidentifierNew, ptsV2PaymentsPost201ResponseTokenInformation.instrumentidentifierNew) &&
        Objects.equals(this.customer, ptsV2PaymentsPost201ResponseTokenInformation.customer) &&
        Objects.equals(this.paymentInstrument, ptsV2PaymentsPost201ResponseTokenInformation.paymentInstrument) &&
        Objects.equals(this.shippingAddress, ptsV2PaymentsPost201ResponseTokenInformation.shippingAddress) &&
        Objects.equals(this.instrumentIdentifier, ptsV2PaymentsPost201ResponseTokenInformation.instrumentIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentidentifierNew, customer, paymentInstrument, shippingAddress, instrumentIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseTokenInformation {\n");
    
    if (instrumentidentifierNew != null) sb.append("    instrumentidentifierNew: ").append(toIndentedString(instrumentidentifierNew)).append("\n");
    if (customer != null) sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    if (paymentInstrument != null) sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    if (shippingAddress != null) sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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

