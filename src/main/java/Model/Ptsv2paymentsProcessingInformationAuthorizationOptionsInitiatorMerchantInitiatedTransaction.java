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
 * Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction
 */

public class Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction {
  @SerializedName("reason")
  private String reason = null;

  @SerializedName("previousTransactionId")
  private String previousTransactionId = null;

  @SerializedName("originalAuthorizedAmount")
  private String originalAuthorizedAmount = null;

  @SerializedName("agreementId")
  private String agreementId = null;

  public Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason for the merchant-initiated transaction or incremental authorization. Possible values: - &#x60;1&#x60;: Resubmission - &#x60;2&#x60;: Delayed charge - &#x60;3&#x60;: Reauthorization for split shipment - &#x60;4&#x60;: No show - &#x60;5&#x60;: Account top up This field is required only for the five kinds of transactions in the preceding list. This field is supported only for merchant-initiated transactions and incremental authorizations.  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR0 - Position: 160-163 - Field: Message Reason Code 
   * @return reason
  **/
  @ApiModelProperty(value = "Reason for the merchant-initiated transaction or incremental authorization. Possible values: - `1`: Resubmission - `2`: Delayed charge - `3`: Reauthorization for split shipment - `4`: No show - `5`: Account top up This field is required only for the five kinds of transactions in the preceding list. This field is supported only for merchant-initiated transactions and incremental authorizations.  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR0 - Position: 160-163 - Field: Message Reason Code ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction previousTransactionId(String previousTransactionId) {
    this.previousTransactionId = previousTransactionId;
    return this;
  }

   /**
   * Network transaction identifier that was returned in the payment response field _processorInformation.transactionID_ in the reply message for either the original merchant-initiated payment in the series or the previous merchant-initiated payment in the series.  If the current payment request includes a token instead of an account number, the following time limits apply for the value of this field: - For a **resubmission**, the transaction ID must be less than 14 days old. - For a **delayed charge** or **reauthorization**, the transaction ID must be less than 30 days old.  **NOTE**: The value for this field does not correspond to any data in the TC 33 capture file5. This field is supported only for Visa transactions on CyberSource through VisaNet. 
   * @return previousTransactionId
  **/
  @ApiModelProperty(value = "Network transaction identifier that was returned in the payment response field _processorInformation.transactionID_ in the reply message for either the original merchant-initiated payment in the series or the previous merchant-initiated payment in the series.  If the current payment request includes a token instead of an account number, the following time limits apply for the value of this field: - For a **resubmission**, the transaction ID must be less than 14 days old. - For a **delayed charge** or **reauthorization**, the transaction ID must be less than 30 days old.  **NOTE**: The value for this field does not correspond to any data in the TC 33 capture file5. This field is supported only for Visa transactions on CyberSource through VisaNet. ")
  public String getPreviousTransactionId() {
    return previousTransactionId;
  }

  public void setPreviousTransactionId(String previousTransactionId) {
    this.previousTransactionId = previousTransactionId;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction originalAuthorizedAmount(String originalAuthorizedAmount) {
    this.originalAuthorizedAmount = originalAuthorizedAmount;
    return this;
  }

   /**
   * Amount of the original authorization.  This field is supported only for Apple Pay, Google Pay, and Samsung Pay transactions with Discover on FDC Nashville Global and Chase Paymentech. 
   * @return originalAuthorizedAmount
  **/
  @ApiModelProperty(value = "Amount of the original authorization.  This field is supported only for Apple Pay, Google Pay, and Samsung Pay transactions with Discover on FDC Nashville Global and Chase Paymentech. ")
  public String getOriginalAuthorizedAmount() {
    return originalAuthorizedAmount;
  }

  public void setOriginalAuthorizedAmount(String originalAuthorizedAmount) {
    this.originalAuthorizedAmount = originalAuthorizedAmount;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction agreementId(String agreementId) {
    this.agreementId = agreementId;
    return this;
  }

   /**
   * An API to carry the agreement ID generated for recurring and unscheduled Card on file transaction. the merchant generates this per card holder or per payment agreement and shares the generated unique ID in the subsequent transactions. This can contain foreign/arabic character set also. Cybersource forwards this value to the Saudi Payment processor. 
   * @return agreementId
  **/
  @ApiModelProperty(value = "An API to carry the agreement ID generated for recurring and unscheduled Card on file transaction. the merchant generates this per card holder or per payment agreement and shares the generated unique ID in the subsequent transactions. This can contain foreign/arabic character set also. Cybersource forwards this value to the Saudi Payment processor. ")
  public String getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction = (Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction) o;
    return Objects.equals(this.reason, ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.reason) &&
        Objects.equals(this.previousTransactionId, ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.previousTransactionId) &&
        Objects.equals(this.originalAuthorizedAmount, ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.originalAuthorizedAmount) &&
        Objects.equals(this.agreementId, ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.agreementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, previousTransactionId, originalAuthorizedAmount, agreementId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction {\n");
    
    if (reason != null) sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    if (previousTransactionId != null) sb.append("    previousTransactionId: ").append(toIndentedString(previousTransactionId)).append("\n");
    if (originalAuthorizedAmount != null) sb.append("    originalAuthorizedAmount: ").append(toIndentedString(originalAuthorizedAmount)).append("\n");
    if (agreementId != null) sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
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

