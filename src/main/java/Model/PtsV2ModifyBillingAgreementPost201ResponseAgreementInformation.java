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
 * PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation
 */

public class PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation {
  @SerializedName("id")
  private String id = null;

  @SerializedName("dateSigned")
  private String dateSigned = null;

  @SerializedName("dateCreated")
  private String dateCreated = null;

  @SerializedName("dateRevoked")
  private String dateRevoked = null;

  @SerializedName("encodedHtml")
  private String encodedHtml = null;

  @SerializedName("encodedHtmlPopup")
  private String encodedHtmlPopup = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  public PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier for the mandate. 
   * @return id
  **/
  @ApiModelProperty(value = "Identifier for the mandate. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation dateSigned(String dateSigned) {
    this.dateSigned = dateSigned;
    return this;
  }

   /**
   * Date the mandate has been signed.  Format YYYYMMdd
   * @return dateSigned
  **/
  @ApiModelProperty(value = "Date the mandate has been signed.  Format YYYYMMdd")
  public String getDateSigned() {
    return dateSigned;
  }

  public void setDateSigned(String dateSigned) {
    this.dateSigned = dateSigned;
  }

  public PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Date the mandate has been created.  Format YYYYMMdd
   * @return dateCreated
  **/
  @ApiModelProperty(value = "Date the mandate has been created.  Format YYYYMMdd")
  public String getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  public PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation dateRevoked(String dateRevoked) {
    this.dateRevoked = dateRevoked;
    return this;
  }

   /**
   * Date the mandate has been revoked.  Format YYYYMMdd
   * @return dateRevoked
  **/
  @ApiModelProperty(value = "Date the mandate has been revoked.  Format YYYYMMdd")
  public String getDateRevoked() {
    return dateRevoked;
  }

  public void setDateRevoked(String dateRevoked) {
    this.dateRevoked = dateRevoked;
  }

  public PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation encodedHtml(String encodedHtml) {
    this.encodedHtml = encodedHtml;
    return this;
  }

   /**
   * Base64 encoded html string
   * @return encodedHtml
  **/
  @ApiModelProperty(value = "Base64 encoded html string")
  public String getEncodedHtml() {
    return encodedHtml;
  }

  public void setEncodedHtml(String encodedHtml) {
    this.encodedHtml = encodedHtml;
  }

  public PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation encodedHtmlPopup(String encodedHtmlPopup) {
    this.encodedHtmlPopup = encodedHtmlPopup;
    return this;
  }

   /**
   * Base64 encoded popup html string
   * @return encodedHtmlPopup
  **/
  @ApiModelProperty(value = "Base64 encoded popup html string")
  public String getEncodedHtmlPopup() {
    return encodedHtmlPopup;
  }

  public void setEncodedHtmlPopup(String encodedHtmlPopup) {
    this.encodedHtmlPopup = encodedHtmlPopup;
  }

  public PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL for redirecting the customer for creating the mandate. 
   * @return url
  **/
  @ApiModelProperty(value = "URL for redirecting the customer for creating the mandate. ")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The Billing Agreement ID returned by processor (PayPal). 
   * @return transactionId
  **/
  @ApiModelProperty(value = "The Billing Agreement ID returned by processor (PayPal). ")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation ptsV2ModifyBillingAgreementPost201ResponseAgreementInformation = (PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation) o;
    return Objects.equals(this.id, ptsV2ModifyBillingAgreementPost201ResponseAgreementInformation.id) &&
        Objects.equals(this.dateSigned, ptsV2ModifyBillingAgreementPost201ResponseAgreementInformation.dateSigned) &&
        Objects.equals(this.dateCreated, ptsV2ModifyBillingAgreementPost201ResponseAgreementInformation.dateCreated) &&
        Objects.equals(this.dateRevoked, ptsV2ModifyBillingAgreementPost201ResponseAgreementInformation.dateRevoked) &&
        Objects.equals(this.encodedHtml, ptsV2ModifyBillingAgreementPost201ResponseAgreementInformation.encodedHtml) &&
        Objects.equals(this.encodedHtmlPopup, ptsV2ModifyBillingAgreementPost201ResponseAgreementInformation.encodedHtmlPopup) &&
        Objects.equals(this.url, ptsV2ModifyBillingAgreementPost201ResponseAgreementInformation.url) &&
        Objects.equals(this.transactionId, ptsV2ModifyBillingAgreementPost201ResponseAgreementInformation.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateSigned, dateCreated, dateRevoked, encodedHtml, encodedHtmlPopup, url, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2ModifyBillingAgreementPost201ResponseAgreementInformation {\n");
    
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (dateSigned != null) sb.append("    dateSigned: ").append(toIndentedString(dateSigned)).append("\n");
    if (dateCreated != null) sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    if (dateRevoked != null) sb.append("    dateRevoked: ").append(toIndentedString(dateRevoked)).append("\n");
    if (encodedHtml != null) sb.append("    encodedHtml: ").append(toIndentedString(encodedHtml)).append("\n");
    if (encodedHtmlPopup != null) sb.append("    encodedHtmlPopup: ").append(toIndentedString(encodedHtmlPopup)).append("\n");
    if (url != null) sb.append("    url: ").append(toIndentedString(url)).append("\n");
    if (transactionId != null) sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

