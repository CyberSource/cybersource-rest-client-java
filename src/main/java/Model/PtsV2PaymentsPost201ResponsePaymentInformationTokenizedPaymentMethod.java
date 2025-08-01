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
 * PtsV2PaymentsPost201ResponsePaymentInformationTokenizedPaymentMethod
 */

public class PtsV2PaymentsPost201ResponsePaymentInformationTokenizedPaymentMethod {
  @SerializedName("id")
  private String id = null;

  @SerializedName("status")
  private String status = null;

  public PtsV2PaymentsPost201ResponsePaymentInformationTokenizedPaymentMethod id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The PayPal-generated ID for the token. 
   * @return id
  **/
  @ApiModelProperty(value = "The PayPal-generated ID for the token. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationTokenizedPaymentMethod status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The vault status.   Possible Values:   - &#x60;VAULTED&#x60;   - &#x60;CREATED&#x60;   - &#x60;APPROVED&#x60; 
   * @return status
  **/
  @ApiModelProperty(value = "The vault status.   Possible Values:   - `VAULTED`   - `CREATED`   - `APPROVED` ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInformationTokenizedPaymentMethod ptsV2PaymentsPost201ResponsePaymentInformationTokenizedPaymentMethod = (PtsV2PaymentsPost201ResponsePaymentInformationTokenizedPaymentMethod) o;
    return Objects.equals(this.id, ptsV2PaymentsPost201ResponsePaymentInformationTokenizedPaymentMethod.id) &&
        Objects.equals(this.status, ptsV2PaymentsPost201ResponsePaymentInformationTokenizedPaymentMethod.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInformationTokenizedPaymentMethod {\n");
    
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

