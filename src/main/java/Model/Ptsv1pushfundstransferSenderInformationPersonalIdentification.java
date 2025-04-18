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
 * Ptsv1pushfundstransferSenderInformationPersonalIdentification
 */

public class Ptsv1pushfundstransferSenderInformationPersonalIdentification {
  @SerializedName("id")
  private String id = null;

  @SerializedName("personalIdType")
  private String personalIdType = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("issuingCountry")
  private String issuingCountry = null;

  public Ptsv1pushfundstransferSenderInformationPersonalIdentification id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Processor(35) 
   * @return id
  **/
  @ApiModelProperty(value = "Processor(35) ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Ptsv1pushfundstransferSenderInformationPersonalIdentification personalIdType(String personalIdType) {
    this.personalIdType = personalIdType;
    return this;
  }

   /**
   * This tag will denote whether the tax ID is a business or individual tax ID when personal ID Type contains the value of TXIN (Tax identification).  The valid values are: - &#x60;B&#x60; (Business) - &#x60;I&#x60; (Individual) 
   * @return personalIdType
  **/
  @ApiModelProperty(value = "This tag will denote whether the tax ID is a business or individual tax ID when personal ID Type contains the value of TXIN (Tax identification).  The valid values are: - `B` (Business) - `I` (Individual) ")
  public String getPersonalIdType() {
    return personalIdType;
  }

  public void setPersonalIdType(String personalIdType) {
    this.personalIdType = personalIdType;
  }

  public Ptsv1pushfundstransferSenderInformationPersonalIdentification type(String type) {
    this.type = type;
    return this;
  }

   /**
   * This tag will contain the type of sender identification. The valid values are:  - &#x60;BTHD&#x60;: (Date of birth) - &#x60;CUID&#x60;: (Customer identification (unspecified)) - &#x60;NTID&#x60;: (National identification) - &#x60;PASN&#x60;: (Passport number) - &#x60;DRLN&#x60;: (Driver license) - &#x60;TXIN&#x60;: (Tax identification) - &#x60;CPNY&#x60;: (Company registration number) - &#x60;PRXY&#x60;: (Proxy identification) - &#x60;SSNB&#x60;: (Social security number) - &#x60;ARNB&#x60;: (Alien registration number) - &#x60;LAWE&#x60;: (Law enforcement identification) - &#x60;MILI&#x60;: (Military identification) - &#x60;TRVL&#x60;: (Travel identification (non-passport)) - &#x60;EMAL&#x60;: (Email) - &#x60;PHON&#x60;: (Phone number) 
   * @return type
  **/
  @ApiModelProperty(value = "This tag will contain the type of sender identification. The valid values are:  - `BTHD`: (Date of birth) - `CUID`: (Customer identification (unspecified)) - `NTID`: (National identification) - `PASN`: (Passport number) - `DRLN`: (Driver license) - `TXIN`: (Tax identification) - `CPNY`: (Company registration number) - `PRXY`: (Proxy identification) - `SSNB`: (Social security number) - `ARNB`: (Alien registration number) - `LAWE`: (Law enforcement identification) - `MILI`: (Military identification) - `TRVL`: (Travel identification (non-passport)) - `EMAL`: (Email) - `PHON`: (Phone number) ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv1pushfundstransferSenderInformationPersonalIdentification issuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
    return this;
  }

   /**
   * Issuing country of the identification. The field format should be a 2 character ISO 3166-1 alpha-2 country code. 
   * @return issuingCountry
  **/
  @ApiModelProperty(value = "Issuing country of the identification. The field format should be a 2 character ISO 3166-1 alpha-2 country code. ")
  public String getIssuingCountry() {
    return issuingCountry;
  }

  public void setIssuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv1pushfundstransferSenderInformationPersonalIdentification ptsv1pushfundstransferSenderInformationPersonalIdentification = (Ptsv1pushfundstransferSenderInformationPersonalIdentification) o;
    return Objects.equals(this.id, ptsv1pushfundstransferSenderInformationPersonalIdentification.id) &&
        Objects.equals(this.personalIdType, ptsv1pushfundstransferSenderInformationPersonalIdentification.personalIdType) &&
        Objects.equals(this.type, ptsv1pushfundstransferSenderInformationPersonalIdentification.type) &&
        Objects.equals(this.issuingCountry, ptsv1pushfundstransferSenderInformationPersonalIdentification.issuingCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, personalIdType, type, issuingCountry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferSenderInformationPersonalIdentification {\n");
    
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (personalIdType != null) sb.append("    personalIdType: ").append(toIndentedString(personalIdType)).append("\n");
    if (type != null) sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (issuingCountry != null) sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
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

