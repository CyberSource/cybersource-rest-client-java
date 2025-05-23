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
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation
 */

public class Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation {
  @SerializedName("merchantDescriptor")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor merchantDescriptor = null;

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation merchantDescriptor(Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
    return this;
  }

   /**
   * Get merchantDescriptor
   * @return merchantDescriptor
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor getMerchantDescriptor() {
    return merchantDescriptor;
  }

  public void setMerchantDescriptor(Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformationMerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation = (Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation) o;
    return Objects.equals(this.merchantDescriptor, tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation.merchantDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantDescriptor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentMerchantInformation {\n");
    
    if (merchantDescriptor != null) sb.append("    merchantDescriptor: ").append(toIndentedString(merchantDescriptor)).append("\n");
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

