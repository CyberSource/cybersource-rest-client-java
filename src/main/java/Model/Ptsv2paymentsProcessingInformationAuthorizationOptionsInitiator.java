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
import Model.Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator
 */

public class Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator {
  @SerializedName("type")
  private String type = null;

  @SerializedName("credentialStoredOnFile")
  private Boolean credentialStoredOnFile = null;

  @SerializedName("storedCredentialUsed")
  private Boolean storedCredentialUsed = null;

  @SerializedName("merchantInitiatedTransaction")
  private Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction merchantInitiatedTransaction = null;

  public Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator type(String type) {
    this.type = type;
    return this;
  }

   /**
   * This field indicates whether the transaction is a merchant-initiated transaction or customer-initiated transaction.  Valid values: - **customer** - **merchant** 
   * @return type
  **/
  @ApiModelProperty(value = "This field indicates whether the transaction is a merchant-initiated transaction or customer-initiated transaction.  Valid values: - **customer** - **merchant** ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator credentialStoredOnFile(Boolean credentialStoredOnFile) {
    this.credentialStoredOnFile = credentialStoredOnFile;
    return this;
  }

   /**
   * Indicates to the issuing bank two things: - The merchant has received consent from the cardholder to store their card details on file - The merchant wants the issuing bank to check out the card details before the merchant initiates their first transaction for this cardholder. The purpose of the merchant-initiated transaction is to ensure that the cardholder&#39;s credentials are valid (that the card is not stolen or has restrictions) and that the card details are good to be stored on the merchant&#39;s file for future transactions.  Valid values: - &#x60;true&#x60; means merchant will use this transaction to store payment credentials for follow-up merchant-initiated transactions. - &#x60;false&#x60; means merchant will not use this transaction to store payment credentials for follow-up merchant-initiated transactions.  **NOTE:** The value for this field does not correspond to any data in the TC 33 capture file5.  This field is supported only for Visa transactions on CyberSource through VisaNet. 
   * @return credentialStoredOnFile
  **/
  @ApiModelProperty(value = "Indicates to the issuing bank two things: - The merchant has received consent from the cardholder to store their card details on file - The merchant wants the issuing bank to check out the card details before the merchant initiates their first transaction for this cardholder. The purpose of the merchant-initiated transaction is to ensure that the cardholder's credentials are valid (that the card is not stolen or has restrictions) and that the card details are good to be stored on the merchant's file for future transactions.  Valid values: - `true` means merchant will use this transaction to store payment credentials for follow-up merchant-initiated transactions. - `false` means merchant will not use this transaction to store payment credentials for follow-up merchant-initiated transactions.  **NOTE:** The value for this field does not correspond to any data in the TC 33 capture file5.  This field is supported only for Visa transactions on CyberSource through VisaNet. ")
  public Boolean CredentialStoredOnFile() {
    return credentialStoredOnFile;
  }

  public void setCredentialStoredOnFile(Boolean credentialStoredOnFile) {
    this.credentialStoredOnFile = credentialStoredOnFile;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator storedCredentialUsed(Boolean storedCredentialUsed) {
    this.storedCredentialUsed = storedCredentialUsed;
    return this;
  }

   /**
   * Indicates to an issuing bank whether a merchant-initiated transaction came from a card that was already stored on file.  Possible values: - **true** means the merchant-initiated transaction came from a card that was already stored on file. - **false**  means the merchant-initiated transaction came from a card that was not stored on file. 
   * @return storedCredentialUsed
  **/
  @ApiModelProperty(value = "Indicates to an issuing bank whether a merchant-initiated transaction came from a card that was already stored on file.  Possible values: - **true** means the merchant-initiated transaction came from a card that was already stored on file. - **false**  means the merchant-initiated transaction came from a card that was not stored on file. ")
  public Boolean StoredCredentialUsed() {
    return storedCredentialUsed;
  }

  public void setStoredCredentialUsed(Boolean storedCredentialUsed) {
    this.storedCredentialUsed = storedCredentialUsed;
  }

  public Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator merchantInitiatedTransaction(Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction merchantInitiatedTransaction) {
    this.merchantInitiatedTransaction = merchantInitiatedTransaction;
    return this;
  }

   /**
   * Get merchantInitiatedTransaction
   * @return merchantInitiatedTransaction
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction getMerchantInitiatedTransaction() {
    return merchantInitiatedTransaction;
  }

  public void setMerchantInitiatedTransaction(Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction merchantInitiatedTransaction) {
    this.merchantInitiatedTransaction = merchantInitiatedTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator = (Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator) o;
    return Objects.equals(this.type, ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator.type) &&
        Objects.equals(this.credentialStoredOnFile, ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator.credentialStoredOnFile) &&
        Objects.equals(this.storedCredentialUsed, ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator.storedCredentialUsed) &&
        Objects.equals(this.merchantInitiatedTransaction, ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator.merchantInitiatedTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, credentialStoredOnFile, storedCredentialUsed, merchantInitiatedTransaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsProcessingInformationAuthorizationOptionsInitiator {\n");
    
    if (type != null) sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (credentialStoredOnFile != null) sb.append("    credentialStoredOnFile: ").append(toIndentedString(credentialStoredOnFile)).append("\n");
    if (storedCredentialUsed != null) sb.append("    storedCredentialUsed: ").append(toIndentedString(storedCredentialUsed)).append("\n");
    if (merchantInitiatedTransaction != null) sb.append("    merchantInitiatedTransaction: ").append(toIndentedString(merchantInitiatedTransaction)).append("\n");
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

