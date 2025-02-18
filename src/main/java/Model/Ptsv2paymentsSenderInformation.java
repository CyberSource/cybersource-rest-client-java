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
import Model.Ptsv2paymentsSenderInformationAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsSenderInformation
 */

public class Ptsv2paymentsSenderInformation {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("aliasName")
  private String aliasName = null;

  @SerializedName("referenceNumber")
  private String referenceNumber = null;

  @SerializedName("account")
  private Ptsv2paymentsSenderInformationAccount account = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  public Ptsv2paymentsSenderInformation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the sender. This field is applicable for AFT and OCT transactions.   Only alpha numeric values are supported.Special characters not in the standard ASCII character set, are not supported and will be stripped before being sent to the processor. 
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the sender. This field is applicable for AFT and OCT transactions.   Only alpha numeric values are supported.Special characters not in the standard ASCII character set, are not supported and will be stripped before being sent to the processor. ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Ptsv2paymentsSenderInformation middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Middle name of the sender. This field is applicable for AFT and OCT transactions.   Only alpha numeric values are supported. Special characters not in the standard ASCII character set, are not supported and will be stripped before being sent to sent to the processor. 
   * @return middleName
  **/
  @ApiModelProperty(value = "Middle name of the sender. This field is applicable for AFT and OCT transactions.   Only alpha numeric values are supported. Special characters not in the standard ASCII character set, are not supported and will be stripped before being sent to sent to the processor. ")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Ptsv2paymentsSenderInformation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the sender. This field is applicable for AFT and OCT transactions.  Only alpha numeric values are supported. Special characters not in the standard ASCII character set, are not supported and will be stripped before being sent to sent to the processor. 
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the sender. This field is applicable for AFT and OCT transactions.  Only alpha numeric values are supported. Special characters not in the standard ASCII character set, are not supported and will be stripped before being sent to sent to the processor. ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Ptsv2paymentsSenderInformation address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * The street address of the sender. This field is applicable for AFT transactions.     Only alpha numeric values are supported.  Special characters not in the standard ASCII character set are not supported and will be stripped before being sent to sent to the processor. 
   * @return address1
  **/
  @ApiModelProperty(value = "The street address of the sender. This field is applicable for AFT transactions.     Only alpha numeric values are supported.  Special characters not in the standard ASCII character set are not supported and will be stripped before being sent to sent to the processor. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Ptsv2paymentsSenderInformation locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * The city or locality of the sender. This field is applicable for AFT transactions.  Only alpha numeric values are supported.  Special characters not in the standard ASCII character set are not supported and will be stripped before being sent to sent to the processor. 
   * @return locality
  **/
  @ApiModelProperty(value = "The city or locality of the sender. This field is applicable for AFT transactions.  Only alpha numeric values are supported.  Special characters not in the standard ASCII character set are not supported and will be stripped before being sent to sent to the processor. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2paymentsSenderInformation administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * The state or province of the sender. This field is applicable for AFT transactions when the sender country is US or CA. Else it is optional.  Must be a two character value 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "The state or province of the sender. This field is applicable for AFT transactions when the sender country is US or CA. Else it is optional.  Must be a two character value ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Ptsv2paymentsSenderInformation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country associated with the address of the sender. This field is applicable for AFT transactions.   Must be a two character ISO country code.  For example, see [ISO Country Code](https://developer.cybersource.com/docs/cybs/en-us/country-codes/reference/all/na/country-codes/country-codes.html) 
   * @return countryCode
  **/
  @ApiModelProperty(value = "The country associated with the address of the sender. This field is applicable for AFT transactions.   Must be a two character ISO country code.  For example, see [ISO Country Code](https://developer.cybersource.com/docs/cybs/en-us/country-codes/reference/all/na/country-codes/country-codes.html) ")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Ptsv2paymentsSenderInformation aliasName(String aliasName) {
    this.aliasName = aliasName;
    return this;
  }

   /**
   * Sender&#39;s alias name.
   * @return aliasName
  **/
  @ApiModelProperty(value = "Sender's alias name.")
  public String getAliasName() {
    return aliasName;
  }

  public void setAliasName(String aliasName) {
    this.aliasName = aliasName;
  }

  public Ptsv2paymentsSenderInformation referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * This field is applicable for AFT transactions.   Contains a transaction reference number provided by the Merchant. Only alpha numeric values are supported. 
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "This field is applicable for AFT transactions.   Contains a transaction reference number provided by the Merchant. Only alpha numeric values are supported. ")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public Ptsv2paymentsSenderInformation account(Ptsv2paymentsSenderInformationAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsSenderInformationAccount getAccount() {
    return account;
  }

  public void setAccount(Ptsv2paymentsSenderInformationAccount account) {
    this.account = account;
  }

  public Ptsv2paymentsSenderInformation postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code of sender. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code of sender. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsSenderInformation ptsv2paymentsSenderInformation = (Ptsv2paymentsSenderInformation) o;
    return Objects.equals(this.firstName, ptsv2paymentsSenderInformation.firstName) &&
        Objects.equals(this.middleName, ptsv2paymentsSenderInformation.middleName) &&
        Objects.equals(this.lastName, ptsv2paymentsSenderInformation.lastName) &&
        Objects.equals(this.address1, ptsv2paymentsSenderInformation.address1) &&
        Objects.equals(this.locality, ptsv2paymentsSenderInformation.locality) &&
        Objects.equals(this.administrativeArea, ptsv2paymentsSenderInformation.administrativeArea) &&
        Objects.equals(this.countryCode, ptsv2paymentsSenderInformation.countryCode) &&
        Objects.equals(this.aliasName, ptsv2paymentsSenderInformation.aliasName) &&
        Objects.equals(this.referenceNumber, ptsv2paymentsSenderInformation.referenceNumber) &&
        Objects.equals(this.account, ptsv2paymentsSenderInformation.account) &&
        Objects.equals(this.postalCode, ptsv2paymentsSenderInformation.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, address1, locality, administrativeArea, countryCode, aliasName, referenceNumber, account, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsSenderInformation {\n");
    
    if (firstName != null) sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    if (middleName != null) sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    if (lastName != null) sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    if (address1 != null) sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    if (locality != null) sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    if (administrativeArea != null) sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    if (countryCode != null) sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    if (aliasName != null) sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
    if (referenceNumber != null) sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    if (account != null) sb.append("    account: ").append(toIndentedString(account)).append("\n");
    if (postalCode != null) sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

