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
 * Riskv1authenticationresultsConsumerAuthenticationInformation
 */

public class Riskv1authenticationresultsConsumerAuthenticationInformation {
  @SerializedName("authenticationTransactionId")
  private String authenticationTransactionId = null;

  @SerializedName("authenticationTransactionContext")
  private String authenticationTransactionContext = null;

  @SerializedName("otpToken")
  private String otpToken = null;

  @SerializedName("responseAccessToken")
  private String responseAccessToken = null;

  @SerializedName("signedParesStatusReason")
  private String signedParesStatusReason = null;

  @SerializedName("signedPares")
  private String signedPares = null;

  @SerializedName("whiteListStatus")
  private String whiteListStatus = null;

  @SerializedName("credentialEncrypted")
  private String credentialEncrypted = null;

  public Riskv1authenticationresultsConsumerAuthenticationInformation authenticationTransactionId(String authenticationTransactionId) {
    this.authenticationTransactionId = authenticationTransactionId;
    return this;
  }

   /**
   * Payer authentication transaction identifier passed to link the check enrollment and validate authentication messages.For Rupay,this is passed only in Re-Send OTP usecase. **Note**: Required for Standard integration, Rupay Seamless server to server integration for enroll service. Required for Hybrid integration for validate service. 
   * @return authenticationTransactionId
  **/
  @ApiModelProperty(required = true, value = "Payer authentication transaction identifier passed to link the check enrollment and validate authentication messages.For Rupay,this is passed only in Re-Send OTP usecase. **Note**: Required for Standard integration, Rupay Seamless server to server integration for enroll service. Required for Hybrid integration for validate service. ")
  public String getAuthenticationTransactionId() {
    return authenticationTransactionId;
  }

  public void setAuthenticationTransactionId(String authenticationTransactionId) {
    this.authenticationTransactionId = authenticationTransactionId;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation authenticationTransactionContext(String authenticationTransactionContext) {
    this.authenticationTransactionContext = authenticationTransactionContext;
    return this;
  }

   /**
   * Authentication transaction context is used as a unique identifier to link enroll and validate call. 
   * @return authenticationTransactionContext
  **/
  @ApiModelProperty(value = "Authentication transaction context is used as a unique identifier to link enroll and validate call. ")
  public String getAuthenticationTransactionContext() {
    return authenticationTransactionContext;
  }

  public void setAuthenticationTransactionContext(String authenticationTransactionContext) {
    this.authenticationTransactionContext = authenticationTransactionContext;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation otpToken(String otpToken) {
    this.otpToken = otpToken;
    return this;
  }

   /**
   * OTP entered by the card holder. 
   * @return otpToken
  **/
  @ApiModelProperty(value = "OTP entered by the card holder. ")
  public String getOtpToken() {
    return otpToken;
  }

  public void setOtpToken(String otpToken) {
    this.otpToken = otpToken;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation responseAccessToken(String responseAccessToken) {
    this.responseAccessToken = responseAccessToken;
    return this;
  }

   /**
   * JWT returned by the 3D Secure provider when the authentication is complete. Required for Hybrid integration if you use the Cybersource-generated access token. Note: Max. length of this field is 2048 characters. 
   * @return responseAccessToken
  **/
  @ApiModelProperty(value = "JWT returned by the 3D Secure provider when the authentication is complete. Required for Hybrid integration if you use the Cybersource-generated access token. Note: Max. length of this field is 2048 characters. ")
  public String getResponseAccessToken() {
    return responseAccessToken;
  }

  public void setResponseAccessToken(String responseAccessToken) {
    this.responseAccessToken = responseAccessToken;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation signedParesStatusReason(String signedParesStatusReason) {
    this.signedParesStatusReason = signedParesStatusReason;
    return this;
  }

   /**
   * Provides additional information as to why the PAResStatus has a specific value. 
   * @return signedParesStatusReason
  **/
  @ApiModelProperty(value = "Provides additional information as to why the PAResStatus has a specific value. ")
  public String getSignedParesStatusReason() {
    return signedParesStatusReason;
  }

  public void setSignedParesStatusReason(String signedParesStatusReason) {
    this.signedParesStatusReason = signedParesStatusReason;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation signedPares(String signedPares) {
    this.signedPares = signedPares;
    return this;
  }

   /**
   * Payer authentication result (PARes) message returned by the card-issuing bank. If you need to show proof of enrollment checking, you may need to decrypt and parse the string for the information required by the payment card company. For more information, see \&quot;Storing Payer Authentication Data,\&quot; page 160. Important The value is in base64. You must remove all carriage returns and line feeds before adding the PARes to the request. 
   * @return signedPares
  **/
  @ApiModelProperty(value = "Payer authentication result (PARes) message returned by the card-issuing bank. If you need to show proof of enrollment checking, you may need to decrypt and parse the string for the information required by the payment card company. For more information, see \"Storing Payer Authentication Data,\" page 160. Important The value is in base64. You must remove all carriage returns and line feeds before adding the PARes to the request. ")
  public String getSignedPares() {
    return signedPares;
  }

  public void setSignedPares(String signedPares) {
    this.signedPares = signedPares;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation whiteListStatus(String whiteListStatus) {
    this.whiteListStatus = whiteListStatus;
    return this;
  }

   /**
   * Enables the communication of trusted beneficiary/whitelist status between the ACS, the DS and the 3DS Requestor.  Possible Values:  Y - 3DS Requestor is whitelisted by cardholder  N - 3DS Requestor is not whitelisted by cardholder 
   * @return whiteListStatus
  **/
  @ApiModelProperty(value = "Enables the communication of trusted beneficiary/whitelist status between the ACS, the DS and the 3DS Requestor.  Possible Values:  Y - 3DS Requestor is whitelisted by cardholder  N - 3DS Requestor is not whitelisted by cardholder ")
  public String getWhiteListStatus() {
    return whiteListStatus;
  }

  public void setWhiteListStatus(String whiteListStatus) {
    this.whiteListStatus = whiteListStatus;
  }

  public Riskv1authenticationresultsConsumerAuthenticationInformation credentialEncrypted(String credentialEncrypted) {
    this.credentialEncrypted = credentialEncrypted;
    return this;
  }

   /**
   * A flag to indicate if the passed credential has been encrypted by the Merchant.
   * @return credentialEncrypted
  **/
  @ApiModelProperty(value = "A flag to indicate if the passed credential has been encrypted by the Merchant.")
  public String getCredentialEncrypted() {
    return credentialEncrypted;
  }

  public void setCredentialEncrypted(String credentialEncrypted) {
    this.credentialEncrypted = credentialEncrypted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationresultsConsumerAuthenticationInformation riskv1authenticationresultsConsumerAuthenticationInformation = (Riskv1authenticationresultsConsumerAuthenticationInformation) o;
    return Objects.equals(this.authenticationTransactionId, riskv1authenticationresultsConsumerAuthenticationInformation.authenticationTransactionId) &&
        Objects.equals(this.authenticationTransactionContext, riskv1authenticationresultsConsumerAuthenticationInformation.authenticationTransactionContext) &&
        Objects.equals(this.otpToken, riskv1authenticationresultsConsumerAuthenticationInformation.otpToken) &&
        Objects.equals(this.responseAccessToken, riskv1authenticationresultsConsumerAuthenticationInformation.responseAccessToken) &&
        Objects.equals(this.signedParesStatusReason, riskv1authenticationresultsConsumerAuthenticationInformation.signedParesStatusReason) &&
        Objects.equals(this.signedPares, riskv1authenticationresultsConsumerAuthenticationInformation.signedPares) &&
        Objects.equals(this.whiteListStatus, riskv1authenticationresultsConsumerAuthenticationInformation.whiteListStatus) &&
        Objects.equals(this.credentialEncrypted, riskv1authenticationresultsConsumerAuthenticationInformation.credentialEncrypted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationTransactionId, authenticationTransactionContext, otpToken, responseAccessToken, signedParesStatusReason, signedPares, whiteListStatus, credentialEncrypted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationresultsConsumerAuthenticationInformation {\n");
    
    if (authenticationTransactionId != null) sb.append("    authenticationTransactionId: ").append(toIndentedString(authenticationTransactionId)).append("\n");
    if (authenticationTransactionContext != null) sb.append("    authenticationTransactionContext: ").append(toIndentedString(authenticationTransactionContext)).append("\n");
    if (otpToken != null) sb.append("    otpToken: ").append(toIndentedString(otpToken)).append("\n");
    if (responseAccessToken != null) sb.append("    responseAccessToken: ").append(toIndentedString(responseAccessToken)).append("\n");
    if (signedParesStatusReason != null) sb.append("    signedParesStatusReason: ").append(toIndentedString(signedParesStatusReason)).append("\n");
    if (signedPares != null) sb.append("    signedPares: ").append(toIndentedString(signedPares)).append("\n");
    if (whiteListStatus != null) sb.append("    whiteListStatus: ").append(toIndentedString(whiteListStatus)).append("\n");
    if (credentialEncrypted != null) sb.append("    credentialEncrypted: ").append(toIndentedString(credentialEncrypted)).append("\n");
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

