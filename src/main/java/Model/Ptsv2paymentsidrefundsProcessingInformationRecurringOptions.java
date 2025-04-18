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
 * Ptsv2paymentsidrefundsProcessingInformationRecurringOptions
 */

public class Ptsv2paymentsidrefundsProcessingInformationRecurringOptions {
  @SerializedName("loanPayment")
  private Boolean loanPayment = false;

  public Ptsv2paymentsidrefundsProcessingInformationRecurringOptions loanPayment(Boolean loanPayment) {
    this.loanPayment = loanPayment;
    return this;
  }

   /**
   * Flag that indicates whether this is a payment towards an existing contractual loan.  Possible values: - &#x60;true&#x60;: Loan payment - &#x60;false&#x60;: (default) Not a loan payment 
   * @return loanPayment
  **/
  @ApiModelProperty(value = "Flag that indicates whether this is a payment towards an existing contractual loan.  Possible values: - `true`: Loan payment - `false`: (default) Not a loan payment ")
  public Boolean LoanPayment() {
    return loanPayment;
  }

  public void setLoanPayment(Boolean loanPayment) {
    this.loanPayment = loanPayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidrefundsProcessingInformationRecurringOptions ptsv2paymentsidrefundsProcessingInformationRecurringOptions = (Ptsv2paymentsidrefundsProcessingInformationRecurringOptions) o;
    return Objects.equals(this.loanPayment, ptsv2paymentsidrefundsProcessingInformationRecurringOptions.loanPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanPayment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidrefundsProcessingInformationRecurringOptions {\n");
    
    if (loanPayment != null) sb.append("    loanPayment: ").append(toIndentedString(loanPayment)).append("\n");
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

