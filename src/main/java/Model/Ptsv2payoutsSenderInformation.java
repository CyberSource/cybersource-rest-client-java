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
import Model.Ptsv2payoutsSenderInformationAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2payoutsSenderInformation
 */

public class Ptsv2payoutsSenderInformation {
  @SerializedName("referenceNumber")
  private String referenceNumber = null;

  @SerializedName("account")
  private Ptsv2payoutsSenderInformationAccount account = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("middleInitial")
  private String middleInitial = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("dateOfBirth")
  private String dateOfBirth = null;

  @SerializedName("vatRegistrationNumber")
  private String vatRegistrationNumber = null;

  @SerializedName("personalIdType")
  private String personalIdType = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("identificationNumber")
  private String identificationNumber = null;

  @SerializedName("aliasName")
  private String aliasName = null;

  public Ptsv2payoutsSenderInformation referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Reference number generated by you that uniquely identifies the sender.
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "Reference number generated by you that uniquely identifies the sender.")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public Ptsv2payoutsSenderInformation account(Ptsv2payoutsSenderInformationAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsSenderInformationAccount getAccount() {
    return account;
  }

  public void setAccount(Ptsv2payoutsSenderInformationAccount account) {
    this.account = account;
  }

  public Ptsv2payoutsSenderInformation firstName(String firstName) {
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

  public Ptsv2payoutsSenderInformation middleInitial(String middleInitial) {
    this.middleInitial = middleInitial;
    return this;
  }

   /**
   * Recipient middle initial (Optional). 
   * @return middleInitial
  **/
  @ApiModelProperty(value = "Recipient middle initial (Optional). ")
  public String getMiddleInitial() {
    return middleInitial;
  }

  public void setMiddleInitial(String middleInitial) {
    this.middleInitial = middleInitial;
  }

  public Ptsv2payoutsSenderInformation middleName(String middleName) {
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

  public Ptsv2payoutsSenderInformation lastName(String lastName) {
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

  public Ptsv2payoutsSenderInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of sender.  **Funds Disbursement**  This value is the name of the originator sending the funds disbursement. * CTV, Paymentech (30) 
   * @return name
  **/
  @ApiModelProperty(value = "Name of sender.  **Funds Disbursement**  This value is the name of the originator sending the funds disbursement. * CTV, Paymentech (30) ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ptsv2payoutsSenderInformation address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Street address of sender.  **Funds Disbursement**  This value is the address of the originator sending the funds disbursement. 
   * @return address1
  **/
  @ApiModelProperty(value = "Street address of sender.  **Funds Disbursement**  This value is the address of the originator sending the funds disbursement. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Ptsv2payoutsSenderInformation locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of sender.  **Funds Disbursement**  This value is the city of the originator sending the funds disbursement. 
   * @return locality
  **/
  @ApiModelProperty(value = "City of sender.  **Funds Disbursement**  This value is the city of the originator sending the funds disbursement. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2payoutsSenderInformation administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * Sender&#39;s state. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf). 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "Sender's state. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf). ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Ptsv2payoutsSenderInformation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country of sender. Use the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf). * CTV (3) 
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country of sender. Use the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf). * CTV (3) ")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Ptsv2payoutsSenderInformation postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Sender&#39;s postal code. Required only for FDCCompass.
   * @return postalCode
  **/
  @ApiModelProperty(value = "Sender's postal code. Required only for FDCCompass.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Ptsv2payoutsSenderInformation phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Sender&#39;s phone number. Required only for FDCCompass.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Sender's phone number. Required only for FDCCompass.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Ptsv2payoutsSenderInformation dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Sender&#39;s date of birth in YYYYMMDD format. Required only for FDCCompass.
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Sender's date of birth in YYYYMMDD format. Required only for FDCCompass.")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Ptsv2payoutsSenderInformation vatRegistrationNumber(String vatRegistrationNumber) {
    this.vatRegistrationNumber = vatRegistrationNumber;
    return this;
  }

   /**
   * Customer&#39;s government-assigned tax identification number. 
   * @return vatRegistrationNumber
  **/
  @ApiModelProperty(value = "Customer's government-assigned tax identification number. ")
  public String getVatRegistrationNumber() {
    return vatRegistrationNumber;
  }

  public void setVatRegistrationNumber(String vatRegistrationNumber) {
    this.vatRegistrationNumber = vatRegistrationNumber;
  }

  public Ptsv2payoutsSenderInformation personalIdType(String personalIdType) {
    this.personalIdType = personalIdType;
    return this;
  }

   /**
   * #### Visa Platform Connect This tag will contain the type of sender identification. The valid values are: • BTHD (Date of birth) • CUID (Customer identification (unspecified)) • NTID (National identification) • PASN (Passport number) • DRLN (Driver license) • TXIN (Tax identification) • CPNY (Company registration number) • PRXY (Proxy identification) • SSNB (Social security number) • ARNB (Alien registration number) • LAWE (Law enforcement identification) • MILI (Military identification) • TRVL (Travel identification (non-passport)) • EMAL (Email) • PHON (Phone number) 
   * @return personalIdType
  **/
  @ApiModelProperty(value = "#### Visa Platform Connect This tag will contain the type of sender identification. The valid values are: • BTHD (Date of birth) • CUID (Customer identification (unspecified)) • NTID (National identification) • PASN (Passport number) • DRLN (Driver license) • TXIN (Tax identification) • CPNY (Company registration number) • PRXY (Proxy identification) • SSNB (Social security number) • ARNB (Alien registration number) • LAWE (Law enforcement identification) • MILI (Military identification) • TRVL (Travel identification (non-passport)) • EMAL (Email) • PHON (Phone number) ")
  public String getPersonalIdType() {
    return personalIdType;
  }

  public void setPersonalIdType(String personalIdType) {
    this.personalIdType = personalIdType;
  }

  public Ptsv2payoutsSenderInformation type(String type) {
    this.type = type;
    return this;
  }

   /**
   * #### Visa Platform Connect This tag will denote whether the tax ID is a business or individual tax ID when personal ID Type contains the value of TXIN (Tax identification).  The valid values are: • B (Business) • I (Individual) 
   * @return type
  **/
  @ApiModelProperty(value = "#### Visa Platform Connect This tag will denote whether the tax ID is a business or individual tax ID when personal ID Type contains the value of TXIN (Tax identification).  The valid values are: • B (Business) • I (Individual) ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv2payoutsSenderInformation identificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
    return this;
  }

   /**
   * #### Visa Platform Connect This tag will contain an acquirer-populated value associated with the API : senderInformation.personalIdType which will identify the personal ID type of the sender. 
   * @return identificationNumber
  **/
  @ApiModelProperty(value = "#### Visa Platform Connect This tag will contain an acquirer-populated value associated with the API : senderInformation.personalIdType which will identify the personal ID type of the sender. ")
  public String getIdentificationNumber() {
    return identificationNumber;
  }

  public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
  }

  public Ptsv2payoutsSenderInformation aliasName(String aliasName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2payoutsSenderInformation ptsv2payoutsSenderInformation = (Ptsv2payoutsSenderInformation) o;
    return Objects.equals(this.referenceNumber, ptsv2payoutsSenderInformation.referenceNumber) &&
        Objects.equals(this.account, ptsv2payoutsSenderInformation.account) &&
        Objects.equals(this.firstName, ptsv2payoutsSenderInformation.firstName) &&
        Objects.equals(this.middleInitial, ptsv2payoutsSenderInformation.middleInitial) &&
        Objects.equals(this.middleName, ptsv2payoutsSenderInformation.middleName) &&
        Objects.equals(this.lastName, ptsv2payoutsSenderInformation.lastName) &&
        Objects.equals(this.name, ptsv2payoutsSenderInformation.name) &&
        Objects.equals(this.address1, ptsv2payoutsSenderInformation.address1) &&
        Objects.equals(this.locality, ptsv2payoutsSenderInformation.locality) &&
        Objects.equals(this.administrativeArea, ptsv2payoutsSenderInformation.administrativeArea) &&
        Objects.equals(this.countryCode, ptsv2payoutsSenderInformation.countryCode) &&
        Objects.equals(this.postalCode, ptsv2payoutsSenderInformation.postalCode) &&
        Objects.equals(this.phoneNumber, ptsv2payoutsSenderInformation.phoneNumber) &&
        Objects.equals(this.dateOfBirth, ptsv2payoutsSenderInformation.dateOfBirth) &&
        Objects.equals(this.vatRegistrationNumber, ptsv2payoutsSenderInformation.vatRegistrationNumber) &&
        Objects.equals(this.personalIdType, ptsv2payoutsSenderInformation.personalIdType) &&
        Objects.equals(this.type, ptsv2payoutsSenderInformation.type) &&
        Objects.equals(this.identificationNumber, ptsv2payoutsSenderInformation.identificationNumber) &&
        Objects.equals(this.aliasName, ptsv2payoutsSenderInformation.aliasName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNumber, account, firstName, middleInitial, middleName, lastName, name, address1, locality, administrativeArea, countryCode, postalCode, phoneNumber, dateOfBirth, vatRegistrationNumber, personalIdType, type, identificationNumber, aliasName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2payoutsSenderInformation {\n");
    
    if (referenceNumber != null) sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    if (account != null) sb.append("    account: ").append(toIndentedString(account)).append("\n");
    if (firstName != null) sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    if (middleInitial != null) sb.append("    middleInitial: ").append(toIndentedString(middleInitial)).append("\n");
    if (middleName != null) sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    if (lastName != null) sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    if (name != null) sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (address1 != null) sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    if (locality != null) sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    if (administrativeArea != null) sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    if (countryCode != null) sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    if (postalCode != null) sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    if (phoneNumber != null) sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    if (dateOfBirth != null) sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    if (vatRegistrationNumber != null) sb.append("    vatRegistrationNumber: ").append(toIndentedString(vatRegistrationNumber)).append("\n");
    if (personalIdType != null) sb.append("    personalIdType: ").append(toIndentedString(personalIdType)).append("\n");
    if (type != null) sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (identificationNumber != null) sb.append("    identificationNumber: ").append(toIndentedString(identificationNumber)).append("\n");
    if (aliasName != null) sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
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

