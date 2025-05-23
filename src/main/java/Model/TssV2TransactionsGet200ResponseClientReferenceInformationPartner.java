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
 * TssV2TransactionsGet200ResponseClientReferenceInformationPartner
 */

public class TssV2TransactionsGet200ResponseClientReferenceInformationPartner {
  @SerializedName("solutionId")
  private String solutionId = null;

  @SerializedName("thirdPartyCertificationNumber")
  private String thirdPartyCertificationNumber = null;

  public TssV2TransactionsGet200ResponseClientReferenceInformationPartner solutionId(String solutionId) {
    this.solutionId = solutionId;
    return this;
  }

   /**
   * Identifier for the partner that is integrated to CyberSource.  Send this value in all requests that are sent through the partner solution. CyberSource assigns the ID to the partner.  **Note** When you see a solutionId of 999 in reports, the solutionId that was submitted is incorrect. 
   * @return solutionId
  **/
  @ApiModelProperty(value = "Identifier for the partner that is integrated to CyberSource.  Send this value in all requests that are sent through the partner solution. CyberSource assigns the ID to the partner.  **Note** When you see a solutionId of 999 in reports, the solutionId that was submitted is incorrect. ")
  public String getSolutionId() {
    return solutionId;
  }

  public void setSolutionId(String solutionId) {
    this.solutionId = solutionId;
  }

  public TssV2TransactionsGet200ResponseClientReferenceInformationPartner thirdPartyCertificationNumber(String thirdPartyCertificationNumber) {
    this.thirdPartyCertificationNumber = thirdPartyCertificationNumber;
    return this;
  }

   /**
   * Value that identifies the application vendor and application version for a third party gateway. CyberSource provides you with this value during testing and validation. This field is supported only on CyberSource through VisaNet.  #### Used by **Authorization, Authorization Reversal, Capture, Credit, Incremental Authorization, and Void** Optional field.  #### PIN debit Required field for PIN debit credit, PIN debit purchase, or PIN debit reversal request. 
   * @return thirdPartyCertificationNumber
  **/
  @ApiModelProperty(value = "Value that identifies the application vendor and application version for a third party gateway. CyberSource provides you with this value during testing and validation. This field is supported only on CyberSource through VisaNet.  #### Used by **Authorization, Authorization Reversal, Capture, Credit, Incremental Authorization, and Void** Optional field.  #### PIN debit Required field for PIN debit credit, PIN debit purchase, or PIN debit reversal request. ")
  public String getThirdPartyCertificationNumber() {
    return thirdPartyCertificationNumber;
  }

  public void setThirdPartyCertificationNumber(String thirdPartyCertificationNumber) {
    this.thirdPartyCertificationNumber = thirdPartyCertificationNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseClientReferenceInformationPartner tssV2TransactionsGet200ResponseClientReferenceInformationPartner = (TssV2TransactionsGet200ResponseClientReferenceInformationPartner) o;
    return Objects.equals(this.solutionId, tssV2TransactionsGet200ResponseClientReferenceInformationPartner.solutionId) &&
        Objects.equals(this.thirdPartyCertificationNumber, tssV2TransactionsGet200ResponseClientReferenceInformationPartner.thirdPartyCertificationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solutionId, thirdPartyCertificationNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseClientReferenceInformationPartner {\n");
    
    if (solutionId != null) sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    if (thirdPartyCertificationNumber != null) sb.append("    thirdPartyCertificationNumber: ").append(toIndentedString(thirdPartyCertificationNumber)).append("\n");
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

