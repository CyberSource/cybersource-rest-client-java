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
 * PtsV2PaymentsPost201ResponseRiskInformationProcessorResults
 */

public class PtsV2PaymentsPost201ResponseRiskInformationProcessorResults {
  @SerializedName("fraudDecision")
  private String fraudDecision = null;

  @SerializedName("fraudDecisionReason")
  private String fraudDecisionReason = null;

  public PtsV2PaymentsPost201ResponseRiskInformationProcessorResults fraudDecision(String fraudDecision) {
    this.fraudDecision = fraudDecision;
    return this;
  }

   /**
   * Type of filter. Possible values: - ACCEPT - PENDING - DENY - REPORT 
   * @return fraudDecision
  **/
  @ApiModelProperty(value = "Type of filter. Possible values: - ACCEPT - PENDING - DENY - REPORT ")
  public String getFraudDecision() {
    return fraudDecision;
  }

  public void setFraudDecision(String fraudDecision) {
    this.fraudDecision = fraudDecision;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationProcessorResults fraudDecisionReason(String fraudDecisionReason) {
    this.fraudDecisionReason = fraudDecisionReason;
    return this;
  }

   /**
   * possible values - AVS_NO_MATCH - AVS_PARTIAL_MATCH - AVS_UNAVAILABLE_OR_UNSUPPORTED - CARD_SECURITY_CODE_MISMATCH - MAXIMUM_TRANSACTION_AMOUNT - UNCONFIRMED_ADDRESS - COUNTRY_MONITOR - LARGE_ORDER_NUMBER - BILLING_OR_SHIPPING_ADDRESS_MISMATCH - RISKY_ZIP_CODE - SUSPECTED_FREIGHT_FORWARDER_CHECK - TOTAL_PURCHASE_PRICE_MINIMUM - IP_ADDRESS_VELOCITY - RISKY_EMAIL_ADDRESS_DOMAIN_CHECK - RISKY_BANK_IDENTIFICATION_NUMBER_CHECK, RISKY_IP_ADDRESS_RANGE - PAYPAL_FRAUD_MODEL 
   * @return fraudDecisionReason
  **/
  @ApiModelProperty(value = "possible values - AVS_NO_MATCH - AVS_PARTIAL_MATCH - AVS_UNAVAILABLE_OR_UNSUPPORTED - CARD_SECURITY_CODE_MISMATCH - MAXIMUM_TRANSACTION_AMOUNT - UNCONFIRMED_ADDRESS - COUNTRY_MONITOR - LARGE_ORDER_NUMBER - BILLING_OR_SHIPPING_ADDRESS_MISMATCH - RISKY_ZIP_CODE - SUSPECTED_FREIGHT_FORWARDER_CHECK - TOTAL_PURCHASE_PRICE_MINIMUM - IP_ADDRESS_VELOCITY - RISKY_EMAIL_ADDRESS_DOMAIN_CHECK - RISKY_BANK_IDENTIFICATION_NUMBER_CHECK, RISKY_IP_ADDRESS_RANGE - PAYPAL_FRAUD_MODEL ")
  public String getFraudDecisionReason() {
    return fraudDecisionReason;
  }

  public void setFraudDecisionReason(String fraudDecisionReason) {
    this.fraudDecisionReason = fraudDecisionReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseRiskInformationProcessorResults ptsV2PaymentsPost201ResponseRiskInformationProcessorResults = (PtsV2PaymentsPost201ResponseRiskInformationProcessorResults) o;
    return Objects.equals(this.fraudDecision, ptsV2PaymentsPost201ResponseRiskInformationProcessorResults.fraudDecision) &&
        Objects.equals(this.fraudDecisionReason, ptsV2PaymentsPost201ResponseRiskInformationProcessorResults.fraudDecisionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudDecision, fraudDecisionReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseRiskInformationProcessorResults {\n");
    
    if (fraudDecision != null) sb.append("    fraudDecision: ").append(toIndentedString(fraudDecision)).append("\n");
    if (fraudDecisionReason != null) sb.append("    fraudDecisionReason: ").append(toIndentedString(fraudDecisionReason)).append("\n");
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

