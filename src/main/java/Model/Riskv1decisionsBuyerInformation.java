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
import Model.Ptsv2paymentsBuyerInformationPersonalIdentification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains information about the buyer.
 */
@ApiModel(description = "Contains information about the buyer.")

public class Riskv1decisionsBuyerInformation {
  @SerializedName("merchantCustomerId")
  private String merchantCustomerId = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("hashedPassword")
  private String hashedPassword = null;

  @SerializedName("dateOfBirth")
  private String dateOfBirth = null;

  @SerializedName("personalIdentification")
  private List<Ptsv2paymentsBuyerInformationPersonalIdentification> personalIdentification = null;

  public Riskv1decisionsBuyerInformation merchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
    return this;
  }

   /**
   * Your identifier for the customer.  When a subscription or customer profile is being created, the maximum length for this field for most processors is 30. Otherwise, the maximum length is 100.  #### Comercio Latino For recurring payments in Mexico, the value is the customer&#39;s contract number. Note Before you request the authorization, you must inform the issuer of the customer contract numbers that will be used for recurring transactions.  #### Worldpay VAP For a follow-on credit with Worldpay VAP, CyberSource checks the following locations, in the order given, for a customer account ID value and uses the first value it finds: 1. &#x60;customer_account_id&#x60; value in the follow-on credit request 2. Customer account ID value that was used for the capture that is being credited 3. Customer account ID value that was used for the original authorization If a customer account ID value cannot be found in any of these locations, then no value is used. 
   * @return merchantCustomerId
  **/
  @ApiModelProperty(value = "Your identifier for the customer.  When a subscription or customer profile is being created, the maximum length for this field for most processors is 30. Otherwise, the maximum length is 100.  #### Comercio Latino For recurring payments in Mexico, the value is the customer's contract number. Note Before you request the authorization, you must inform the issuer of the customer contract numbers that will be used for recurring transactions.  #### Worldpay VAP For a follow-on credit with Worldpay VAP, CyberSource checks the following locations, in the order given, for a customer account ID value and uses the first value it finds: 1. `customer_account_id` value in the follow-on credit request 2. Customer account ID value that was used for the capture that is being credited 3. Customer account ID value that was used for the original authorization If a customer account ID value cannot be found in any of these locations, then no value is used. ")
  public String getMerchantCustomerId() {
    return merchantCustomerId;
  }

  public void setMerchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
  }

  public Riskv1decisionsBuyerInformation username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Specifies the customer account user name.
   * @return username
  **/
  @ApiModelProperty(value = "Specifies the customer account user name.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Riskv1decisionsBuyerInformation hashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
    return this;
  }

   /**
   * The merchant&#39;s password that CyberSource hashes and stores as a hashed password. 
   * @return hashedPassword
  **/
  @ApiModelProperty(value = "The merchant's password that CyberSource hashes and stores as a hashed password. ")
  public String getHashedPassword() {
    return hashedPassword;
  }

  public void setHashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
  }

  public Riskv1decisionsBuyerInformation dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Recipient&#39;s date of birth. **Format**: &#x60;YYYYMMDD&#x60;.  This field is a &#x60;pass-through&#x60;, which means that CyberSource ensures that the value is eight numeric characters but otherwise does not verify the value or modify it in any way before sending it to the processor. If the field is not required for the transaction, CyberSource does not forward it to the processor. 
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Recipient's date of birth. **Format**: `YYYYMMDD`.  This field is a `pass-through`, which means that CyberSource ensures that the value is eight numeric characters but otherwise does not verify the value or modify it in any way before sending it to the processor. If the field is not required for the transaction, CyberSource does not forward it to the processor. ")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Riskv1decisionsBuyerInformation personalIdentification(List<Ptsv2paymentsBuyerInformationPersonalIdentification> personalIdentification) {
    this.personalIdentification = personalIdentification;
    return this;
  }

  public Riskv1decisionsBuyerInformation addPersonalIdentificationItem(Ptsv2paymentsBuyerInformationPersonalIdentification personalIdentificationItem) {
    if (this.personalIdentification == null) {
      this.personalIdentification = new ArrayList<Ptsv2paymentsBuyerInformationPersonalIdentification>();
    }
    this.personalIdentification.add(personalIdentificationItem);
    return this;
  }

   /**
   * Get personalIdentification
   * @return personalIdentification
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsBuyerInformationPersonalIdentification> getPersonalIdentification() {
    return personalIdentification;
  }

  public void setPersonalIdentification(List<Ptsv2paymentsBuyerInformationPersonalIdentification> personalIdentification) {
    this.personalIdentification = personalIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsBuyerInformation riskv1decisionsBuyerInformation = (Riskv1decisionsBuyerInformation) o;
    return Objects.equals(this.merchantCustomerId, riskv1decisionsBuyerInformation.merchantCustomerId) &&
        Objects.equals(this.username, riskv1decisionsBuyerInformation.username) &&
        Objects.equals(this.hashedPassword, riskv1decisionsBuyerInformation.hashedPassword) &&
        Objects.equals(this.dateOfBirth, riskv1decisionsBuyerInformation.dateOfBirth) &&
        Objects.equals(this.personalIdentification, riskv1decisionsBuyerInformation.personalIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantCustomerId, username, hashedPassword, dateOfBirth, personalIdentification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsBuyerInformation {\n");
    
    if (merchantCustomerId != null) sb.append("    merchantCustomerId: ").append(toIndentedString(merchantCustomerId)).append("\n");
    if (username != null) sb.append("    username: ").append(toIndentedString(username)).append("\n");
    if (hashedPassword != null) sb.append("    hashedPassword: ").append(toIndentedString(hashedPassword)).append("\n");
    if (dateOfBirth != null) sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    if (personalIdentification != null) sb.append("    personalIdentification: ").append(toIndentedString(personalIdentification)).append("\n");
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

