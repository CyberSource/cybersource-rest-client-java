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
import Model.Ptsv2paymentsPaymentInformationDirectDebitMandate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsPaymentInformationDirectDebit
 */

public class Ptsv2paymentsPaymentInformationDirectDebit {
  @SerializedName("mandate")
  private Ptsv2paymentsPaymentInformationDirectDebitMandate mandate = null;

  public Ptsv2paymentsPaymentInformationDirectDebit mandate(Ptsv2paymentsPaymentInformationDirectDebitMandate mandate) {
    this.mandate = mandate;
    return this;
  }

   /**
   * Get mandate
   * @return mandate
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationDirectDebitMandate getMandate() {
    return mandate;
  }

  public void setMandate(Ptsv2paymentsPaymentInformationDirectDebitMandate mandate) {
    this.mandate = mandate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPaymentInformationDirectDebit ptsv2paymentsPaymentInformationDirectDebit = (Ptsv2paymentsPaymentInformationDirectDebit) o;
    return Objects.equals(this.mandate, ptsv2paymentsPaymentInformationDirectDebit.mandate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformationDirectDebit {\n");
    
    sb.append("    mandate: ").append(toIndentedString(mandate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
