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
import java.math.BigDecimal;

/**
 * RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode
 */

public class RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode {
  @SerializedName("value")
  private String value = null;

  @SerializedName("checkDigit")
  private BigDecimal checkDigit = null;

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Delivery point bar code determined from the input address.
   * @return value
  **/
  @ApiModelProperty(value = "Delivery point bar code determined from the input address.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode checkDigit(BigDecimal checkDigit) {
    this.checkDigit = checkDigit;
    return this;
  }

   /**
   * Check digit for the 11-digit delivery point bar code.
   * @return checkDigit
  **/
  @ApiModelProperty(value = "Check digit for the 11-digit delivery point bar code.")
  public BigDecimal getCheckDigit() {
    return checkDigit;
  }

  public void setCheckDigit(BigDecimal checkDigit) {
    this.checkDigit = checkDigit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode riskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode = (RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode) o;
    return Objects.equals(this.value, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode.value) &&
        Objects.equals(this.checkDigit, riskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode.checkDigit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, checkDigit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode {\n");
    
    if (value != null) sb.append("    value: ").append(toIndentedString(value)).append("\n");
    if (checkDigit != null) sb.append("    checkDigit: ").append(toIndentedString(checkDigit)).append("\n");
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

