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
 * Settlement Service Data object for additional transaction requirements when the transaction indicates domestic national settlement. 
 */
@ApiModel(description = "Settlement Service Data object for additional transaction requirements when the transaction indicates domestic national settlement. ")

public class PushFunds201ResponseProcessingInformationDomesticNationalNet {
  @SerializedName("reimbursementFeeBaseAmount")
  private String reimbursementFeeBaseAmount = null;

  public PushFunds201ResponseProcessingInformationDomesticNationalNet reimbursementFeeBaseAmount(String reimbursementFeeBaseAmount) {
    this.reimbursementFeeBaseAmount = reimbursementFeeBaseAmount;
    return this;
  }

   /**
   * National Net Interchange Reimbursement Fee (IRF) calculation base amount. This must be less than the transaction amount.  Format:  Minimum Value: 0  Maximum value: 999999999.99  Allowed fractional digits: 3.  Note: If a currency has three decimal places, the last digit of this field must be zero.  Required for Columbia National Net Settlement Service (NNSS) transactions. 
   * @return reimbursementFeeBaseAmount
  **/
  @ApiModelProperty(value = "National Net Interchange Reimbursement Fee (IRF) calculation base amount. This must be less than the transaction amount.  Format:  Minimum Value: 0  Maximum value: 999999999.99  Allowed fractional digits: 3.  Note: If a currency has three decimal places, the last digit of this field must be zero.  Required for Columbia National Net Settlement Service (NNSS) transactions. ")
  public String getReimbursementFeeBaseAmount() {
    return reimbursementFeeBaseAmount;
  }

  public void setReimbursementFeeBaseAmount(String reimbursementFeeBaseAmount) {
    this.reimbursementFeeBaseAmount = reimbursementFeeBaseAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushFunds201ResponseProcessingInformationDomesticNationalNet pushFunds201ResponseProcessingInformationDomesticNationalNet = (PushFunds201ResponseProcessingInformationDomesticNationalNet) o;
    return Objects.equals(this.reimbursementFeeBaseAmount, pushFunds201ResponseProcessingInformationDomesticNationalNet.reimbursementFeeBaseAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reimbursementFeeBaseAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFunds201ResponseProcessingInformationDomesticNationalNet {\n");
    
    sb.append("    reimbursementFeeBaseAmount: ").append(toIndentedString(reimbursementFeeBaseAmount)).append("\n");
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
