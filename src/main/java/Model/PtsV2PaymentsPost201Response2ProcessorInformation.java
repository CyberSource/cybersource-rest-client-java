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
 * PtsV2PaymentsPost201Response2ProcessorInformation
 */

public class PtsV2PaymentsPost201Response2ProcessorInformation {
  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("paymentUrl")
  private String paymentUrl = null;

  @SerializedName("responseDetails")
  private String responseDetails = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("responseCode")
  private String responseCode = null;

  public PtsV2PaymentsPost201Response2ProcessorInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Network transaction identifier (TID). You can use this value to identify a specific transaction when you are discussing the transaction with your processor. Not all processors provide this value.  Returned by the authorization service.  #### PIN debit Transaction identifier generated by the processor.  Returned by PIN debit credit.  #### GPX Processor transaction ID.  #### Cielo For Cielo, this value is the non-sequential unit (NSU) and is supported for all transactions. The value is generated by Cielo or the issuing bank.  #### Comercio Latino For Comercio Latino, this value is the proof of sale or non-sequential unit (NSU) number generated by the acquirers Cielo and Rede, or the issuing bank.  #### CyberSource through VisaNet and GPN For details about this value for CyberSource through VisaNet and GPN, see \&quot;Network Transaction Identifiers\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Moneris This value identifies the transaction on a host system. It contains the following information: - Terminal used to process the transaction - Shift during which the transaction took place - Batch number - Transaction number within the batch You must store this value. If you give the customer a receipt, display this value on the receipt.  **Example** For the value 66012345001069003: - Terminal ID &#x3D; 66012345 - Shift number &#x3D; 001 - Batch number &#x3D; 069 - Transaction number &#x3D; 003 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Network transaction identifier (TID). You can use this value to identify a specific transaction when you are discussing the transaction with your processor. Not all processors provide this value.  Returned by the authorization service.  #### PIN debit Transaction identifier generated by the processor.  Returned by PIN debit credit.  #### GPX Processor transaction ID.  #### Cielo For Cielo, this value is the non-sequential unit (NSU) and is supported for all transactions. The value is generated by Cielo or the issuing bank.  #### Comercio Latino For Comercio Latino, this value is the proof of sale or non-sequential unit (NSU) number generated by the acquirers Cielo and Rede, or the issuing bank.  #### CyberSource through VisaNet and GPN For details about this value for CyberSource through VisaNet and GPN, see \"Network Transaction Identifiers\" in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Moneris This value identifies the transaction on a host system. It contains the following information: - Terminal used to process the transaction - Shift during which the transaction took place - Batch number - Transaction number within the batch You must store this value. If you give the customer a receipt, display this value on the receipt.  **Example** For the value 66012345001069003: - Terminal ID = 66012345 - Shift number = 001 - Batch number = 069 - Transaction number = 003 ")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PtsV2PaymentsPost201Response2ProcessorInformation paymentUrl(String paymentUrl) {
    this.paymentUrl = paymentUrl;
    return this;
  }

   /**
   * Direct the customer to this URL to complete the payment.
   * @return paymentUrl
  **/
  @ApiModelProperty(value = "Direct the customer to this URL to complete the payment.")
  public String getPaymentUrl() {
    return paymentUrl;
  }

  public void setPaymentUrl(String paymentUrl) {
    this.paymentUrl = paymentUrl;
  }

  public PtsV2PaymentsPost201Response2ProcessorInformation responseDetails(String responseDetails) {
    this.responseDetails = responseDetails;
    return this;
  }

   /**
   * This field might contain information about a decline. This field is supported only for **CyberSource through VisaNet**. 
   * @return responseDetails
  **/
  @ApiModelProperty(value = "This field might contain information about a decline. This field is supported only for **CyberSource through VisaNet**. ")
  public String getResponseDetails() {
    return responseDetails;
  }

  public void setResponseDetails(String responseDetails) {
    this.responseDetails = responseDetails;
  }

  public PtsV2PaymentsPost201Response2ProcessorInformation token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Payment gateway/processor assigned session token. 
   * @return token
  **/
  @ApiModelProperty(value = "Payment gateway/processor assigned session token. ")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public PtsV2PaymentsPost201Response2ProcessorInformation responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Transaction status from the processor. 
   * @return responseCode
  **/
  @ApiModelProperty(value = "Transaction status from the processor. ")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201Response2ProcessorInformation ptsV2PaymentsPost201Response2ProcessorInformation = (PtsV2PaymentsPost201Response2ProcessorInformation) o;
    return Objects.equals(this.transactionId, ptsV2PaymentsPost201Response2ProcessorInformation.transactionId) &&
        Objects.equals(this.paymentUrl, ptsV2PaymentsPost201Response2ProcessorInformation.paymentUrl) &&
        Objects.equals(this.responseDetails, ptsV2PaymentsPost201Response2ProcessorInformation.responseDetails) &&
        Objects.equals(this.token, ptsV2PaymentsPost201Response2ProcessorInformation.token) &&
        Objects.equals(this.responseCode, ptsV2PaymentsPost201Response2ProcessorInformation.responseCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, paymentUrl, responseDetails, token, responseCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201Response2ProcessorInformation {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    paymentUrl: ").append(toIndentedString(paymentUrl)).append("\n");
    sb.append("    responseDetails: ").append(toIndentedString(responseDetails)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
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
