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
import Model.TmsBinLookupIssuerInformation;
import Model.TmsBinLookupPaymentAccountInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Bin Information of the PAN provided by BinLookUp Service. This is only retrieved when retrieveBinDetails&#x3D;true is passed as a query parameter. 
 */
@ApiModel(description = "Bin Information of the PAN provided by BinLookUp Service. This is only retrieved when retrieveBinDetails=true is passed as a query parameter. ")

public class TmsBinLookup {
  @SerializedName("paymentAccountInformation")
  private TmsBinLookupPaymentAccountInformation paymentAccountInformation = null;

  @SerializedName("issuerInformation")
  private TmsBinLookupIssuerInformation issuerInformation = null;

  public TmsBinLookup paymentAccountInformation(TmsBinLookupPaymentAccountInformation paymentAccountInformation) {
    this.paymentAccountInformation = paymentAccountInformation;
    return this;
  }

   /**
   * Get paymentAccountInformation
   * @return paymentAccountInformation
  **/
  @ApiModelProperty(value = "")
  public TmsBinLookupPaymentAccountInformation getPaymentAccountInformation() {
    return paymentAccountInformation;
  }

  public void setPaymentAccountInformation(TmsBinLookupPaymentAccountInformation paymentAccountInformation) {
    this.paymentAccountInformation = paymentAccountInformation;
  }

  public TmsBinLookup issuerInformation(TmsBinLookupIssuerInformation issuerInformation) {
    this.issuerInformation = issuerInformation;
    return this;
  }

   /**
   * Get issuerInformation
   * @return issuerInformation
  **/
  @ApiModelProperty(value = "")
  public TmsBinLookupIssuerInformation getIssuerInformation() {
    return issuerInformation;
  }

  public void setIssuerInformation(TmsBinLookupIssuerInformation issuerInformation) {
    this.issuerInformation = issuerInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsBinLookup tmsBinLookup = (TmsBinLookup) o;
    return Objects.equals(this.paymentAccountInformation, tmsBinLookup.paymentAccountInformation) &&
        Objects.equals(this.issuerInformation, tmsBinLookup.issuerInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentAccountInformation, issuerInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsBinLookup {\n");
    
    if (paymentAccountInformation != null) sb.append("    paymentAccountInformation: ").append(toIndentedString(paymentAccountInformation)).append("\n");
    if (issuerInformation != null) sb.append("    issuerInformation: ").append(toIndentedString(issuerInformation)).append("\n");
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

