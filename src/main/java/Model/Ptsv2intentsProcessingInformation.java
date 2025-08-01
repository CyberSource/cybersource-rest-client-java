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
import Model.Ptsv2intentsProcessingInformationAuthorizationOptions;
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
 * Ptsv2intentsProcessingInformation
 */

public class Ptsv2intentsProcessingInformation {
  @SerializedName("processingInstruction")
  private String processingInstruction = null;

  @SerializedName("authorizationOptions")
  private Ptsv2intentsProcessingInformationAuthorizationOptions authorizationOptions = null;

  @SerializedName("actionList")
  private List<String> actionList = null;

  @SerializedName("highRiskTransactionFlag")
  private String highRiskTransactionFlag = null;

  @SerializedName("transactionRetry")
  private String transactionRetry = null;

  @SerializedName("lastOneHrTransactionCount")
  private String lastOneHrTransactionCount = null;

  @SerializedName("lastOneDayTransactionCount")
  private String lastOneDayTransactionCount = null;

  @SerializedName("lastThreeMonthsTxnCount")
  private String lastThreeMonthsTxnCount = null;

  @SerializedName("totalTransactionCount")
  private String totalTransactionCount = null;

  @SerializedName("pinVerification")
  private String pinVerification = null;

  @SerializedName("faceIdVerification")
  private String faceIdVerification = null;

  @SerializedName("userPassedVerification")
  private String userPassedVerification = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("transactionDate")
  private String transactionDate = null;

  @SerializedName("tangible")
  private String tangible = null;

  public Ptsv2intentsProcessingInformation processingInstruction(String processingInstruction) {
    this.processingInstruction = processingInstruction;
    return this;
  }

   /**
   * The instruction to process an order. - default value: &#39;NO_INSTRUCTION&#39; - &#39;ORDER_SAVED_EXPLICITLY&#39; 
   * @return processingInstruction
  **/
  @ApiModelProperty(value = "The instruction to process an order. - default value: 'NO_INSTRUCTION' - 'ORDER_SAVED_EXPLICITLY' ")
  public String getProcessingInstruction() {
    return processingInstruction;
  }

  public void setProcessingInstruction(String processingInstruction) {
    this.processingInstruction = processingInstruction;
  }

  public Ptsv2intentsProcessingInformation authorizationOptions(Ptsv2intentsProcessingInformationAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
    return this;
  }

   /**
   * Get authorizationOptions
   * @return authorizationOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2intentsProcessingInformationAuthorizationOptions getAuthorizationOptions() {
    return authorizationOptions;
  }

  public void setAuthorizationOptions(Ptsv2intentsProcessingInformationAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
  }

  public Ptsv2intentsProcessingInformation actionList(List<String> actionList) {
    this.actionList = actionList;
    return this;
  }

  public Ptsv2intentsProcessingInformation addActionListItem(String actionListItem) {
    if (this.actionList == null) {
      this.actionList = new ArrayList<String>();
    }
    this.actionList.add(actionListItem);
    return this;
  }

   /**
   * Array of actions (one or more) to be included in the order to invoke bundled services along with order. Possible values: - &#x60;AP_ORDER&#x60;: Use this when Alternative Payment Order service is requested. 
   * @return actionList
  **/
  @ApiModelProperty(value = "Array of actions (one or more) to be included in the order to invoke bundled services along with order. Possible values: - `AP_ORDER`: Use this when Alternative Payment Order service is requested. ")
  public List<String> getActionList() {
    return actionList;
  }

  public void setActionList(List<String> actionList) {
    this.actionList = actionList;
  }

  public Ptsv2intentsProcessingInformation highRiskTransactionFlag(String highRiskTransactionFlag) {
    this.highRiskTransactionFlag = highRiskTransactionFlag;
    return this;
  }

   /**
   * Indicates if the transaction is flagged as high risk. 
   * @return highRiskTransactionFlag
  **/
  @ApiModelProperty(value = "Indicates if the transaction is flagged as high risk. ")
  public String getHighRiskTransactionFlag() {
    return highRiskTransactionFlag;
  }

  public void setHighRiskTransactionFlag(String highRiskTransactionFlag) {
    this.highRiskTransactionFlag = highRiskTransactionFlag;
  }

  public Ptsv2intentsProcessingInformation transactionRetry(String transactionRetry) {
    this.transactionRetry = transactionRetry;
    return this;
  }

   /**
   * Indicates if the transaction is a retry. 
   * @return transactionRetry
  **/
  @ApiModelProperty(value = "Indicates if the transaction is a retry. ")
  public String getTransactionRetry() {
    return transactionRetry;
  }

  public void setTransactionRetry(String transactionRetry) {
    this.transactionRetry = transactionRetry;
  }

  public Ptsv2intentsProcessingInformation lastOneHrTransactionCount(String lastOneHrTransactionCount) {
    this.lastOneHrTransactionCount = lastOneHrTransactionCount;
    return this;
  }

   /**
   * The number of transactions in the last one hour. 
   * @return lastOneHrTransactionCount
  **/
  @ApiModelProperty(value = "The number of transactions in the last one hour. ")
  public String getLastOneHrTransactionCount() {
    return lastOneHrTransactionCount;
  }

  public void setLastOneHrTransactionCount(String lastOneHrTransactionCount) {
    this.lastOneHrTransactionCount = lastOneHrTransactionCount;
  }

  public Ptsv2intentsProcessingInformation lastOneDayTransactionCount(String lastOneDayTransactionCount) {
    this.lastOneDayTransactionCount = lastOneDayTransactionCount;
    return this;
  }

   /**
   * The number of transactions in the last one day. 
   * @return lastOneDayTransactionCount
  **/
  @ApiModelProperty(value = "The number of transactions in the last one day. ")
  public String getLastOneDayTransactionCount() {
    return lastOneDayTransactionCount;
  }

  public void setLastOneDayTransactionCount(String lastOneDayTransactionCount) {
    this.lastOneDayTransactionCount = lastOneDayTransactionCount;
  }

  public Ptsv2intentsProcessingInformation lastThreeMonthsTxnCount(String lastThreeMonthsTxnCount) {
    this.lastThreeMonthsTxnCount = lastThreeMonthsTxnCount;
    return this;
  }

   /**
   * The number of transactions in the last three months. 
   * @return lastThreeMonthsTxnCount
  **/
  @ApiModelProperty(value = "The number of transactions in the last three months. ")
  public String getLastThreeMonthsTxnCount() {
    return lastThreeMonthsTxnCount;
  }

  public void setLastThreeMonthsTxnCount(String lastThreeMonthsTxnCount) {
    this.lastThreeMonthsTxnCount = lastThreeMonthsTxnCount;
  }

  public Ptsv2intentsProcessingInformation totalTransactionCount(String totalTransactionCount) {
    this.totalTransactionCount = totalTransactionCount;
    return this;
  }

   /**
   * The total number of transactions. 
   * @return totalTransactionCount
  **/
  @ApiModelProperty(value = "The total number of transactions. ")
  public String getTotalTransactionCount() {
    return totalTransactionCount;
  }

  public void setTotalTransactionCount(String totalTransactionCount) {
    this.totalTransactionCount = totalTransactionCount;
  }

  public Ptsv2intentsProcessingInformation pinVerification(String pinVerification) {
    this.pinVerification = pinVerification;
    return this;
  }

   /**
   * Indicates if PIN verification is required. 
   * @return pinVerification
  **/
  @ApiModelProperty(value = "Indicates if PIN verification is required. ")
  public String getPinVerification() {
    return pinVerification;
  }

  public void setPinVerification(String pinVerification) {
    this.pinVerification = pinVerification;
  }

  public Ptsv2intentsProcessingInformation faceIdVerification(String faceIdVerification) {
    this.faceIdVerification = faceIdVerification;
    return this;
  }

   /**
   * Indicates if face ID verification is required. 
   * @return faceIdVerification
  **/
  @ApiModelProperty(value = "Indicates if face ID verification is required. ")
  public String getFaceIdVerification() {
    return faceIdVerification;
  }

  public void setFaceIdVerification(String faceIdVerification) {
    this.faceIdVerification = faceIdVerification;
  }

  public Ptsv2intentsProcessingInformation userPassedVerification(String userPassedVerification) {
    this.userPassedVerification = userPassedVerification;
    return this;
  }

   /**
   * Indicates if the user passed verification. 
   * @return userPassedVerification
  **/
  @ApiModelProperty(value = "Indicates if the user passed verification. ")
  public String getUserPassedVerification() {
    return userPassedVerification;
  }

  public void setUserPassedVerification(String userPassedVerification) {
    this.userPassedVerification = userPassedVerification;
  }

  public Ptsv2intentsProcessingInformation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The IP address of the user. 
   * @return ipAddress
  **/
  @ApiModelProperty(value = "The IP address of the user. ")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Ptsv2intentsProcessingInformation transactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * The date of the transaction. 
   * @return transactionDate
  **/
  @ApiModelProperty(value = "The date of the transaction. ")
  public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Ptsv2intentsProcessingInformation tangible(String tangible) {
    this.tangible = tangible;
    return this;
  }

   /**
   * Indicates if the transaction involves tangible goods. 
   * @return tangible
  **/
  @ApiModelProperty(value = "Indicates if the transaction involves tangible goods. ")
  public String getTangible() {
    return tangible;
  }

  public void setTangible(String tangible) {
    this.tangible = tangible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2intentsProcessingInformation ptsv2intentsProcessingInformation = (Ptsv2intentsProcessingInformation) o;
    return Objects.equals(this.processingInstruction, ptsv2intentsProcessingInformation.processingInstruction) &&
        Objects.equals(this.authorizationOptions, ptsv2intentsProcessingInformation.authorizationOptions) &&
        Objects.equals(this.actionList, ptsv2intentsProcessingInformation.actionList) &&
        Objects.equals(this.highRiskTransactionFlag, ptsv2intentsProcessingInformation.highRiskTransactionFlag) &&
        Objects.equals(this.transactionRetry, ptsv2intentsProcessingInformation.transactionRetry) &&
        Objects.equals(this.lastOneHrTransactionCount, ptsv2intentsProcessingInformation.lastOneHrTransactionCount) &&
        Objects.equals(this.lastOneDayTransactionCount, ptsv2intentsProcessingInformation.lastOneDayTransactionCount) &&
        Objects.equals(this.lastThreeMonthsTxnCount, ptsv2intentsProcessingInformation.lastThreeMonthsTxnCount) &&
        Objects.equals(this.totalTransactionCount, ptsv2intentsProcessingInformation.totalTransactionCount) &&
        Objects.equals(this.pinVerification, ptsv2intentsProcessingInformation.pinVerification) &&
        Objects.equals(this.faceIdVerification, ptsv2intentsProcessingInformation.faceIdVerification) &&
        Objects.equals(this.userPassedVerification, ptsv2intentsProcessingInformation.userPassedVerification) &&
        Objects.equals(this.ipAddress, ptsv2intentsProcessingInformation.ipAddress) &&
        Objects.equals(this.transactionDate, ptsv2intentsProcessingInformation.transactionDate) &&
        Objects.equals(this.tangible, ptsv2intentsProcessingInformation.tangible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processingInstruction, authorizationOptions, actionList, highRiskTransactionFlag, transactionRetry, lastOneHrTransactionCount, lastOneDayTransactionCount, lastThreeMonthsTxnCount, totalTransactionCount, pinVerification, faceIdVerification, userPassedVerification, ipAddress, transactionDate, tangible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2intentsProcessingInformation {\n");
    
    if (processingInstruction != null) sb.append("    processingInstruction: ").append(toIndentedString(processingInstruction)).append("\n");
    if (authorizationOptions != null) sb.append("    authorizationOptions: ").append(toIndentedString(authorizationOptions)).append("\n");
    if (actionList != null) sb.append("    actionList: ").append(toIndentedString(actionList)).append("\n");
    if (highRiskTransactionFlag != null) sb.append("    highRiskTransactionFlag: ").append(toIndentedString(highRiskTransactionFlag)).append("\n");
    if (transactionRetry != null) sb.append("    transactionRetry: ").append(toIndentedString(transactionRetry)).append("\n");
    if (lastOneHrTransactionCount != null) sb.append("    lastOneHrTransactionCount: ").append(toIndentedString(lastOneHrTransactionCount)).append("\n");
    if (lastOneDayTransactionCount != null) sb.append("    lastOneDayTransactionCount: ").append(toIndentedString(lastOneDayTransactionCount)).append("\n");
    if (lastThreeMonthsTxnCount != null) sb.append("    lastThreeMonthsTxnCount: ").append(toIndentedString(lastThreeMonthsTxnCount)).append("\n");
    if (totalTransactionCount != null) sb.append("    totalTransactionCount: ").append(toIndentedString(totalTransactionCount)).append("\n");
    if (pinVerification != null) sb.append("    pinVerification: ").append(toIndentedString(pinVerification)).append("\n");
    if (faceIdVerification != null) sb.append("    faceIdVerification: ").append(toIndentedString(faceIdVerification)).append("\n");
    if (userPassedVerification != null) sb.append("    userPassedVerification: ").append(toIndentedString(userPassedVerification)).append("\n");
    if (ipAddress != null) sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    if (transactionDate != null) sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    if (tangible != null) sb.append("    tangible: ").append(toIndentedString(tangible)).append("\n");
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

