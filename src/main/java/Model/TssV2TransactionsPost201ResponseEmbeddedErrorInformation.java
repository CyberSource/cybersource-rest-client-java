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
 * TssV2TransactionsPost201ResponseEmbeddedErrorInformation
 */

public class TssV2TransactionsPost201ResponseEmbeddedErrorInformation {
  @SerializedName("reason")
  private String reason = null;

  public TssV2TransactionsPost201ResponseEmbeddedErrorInformation reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Description of why a request failed. Note: This field may not be returned for all transactions. 
   * @return reason
  **/
  @ApiModelProperty(value = "Description of why a request failed. Note: This field may not be returned for all transactions. ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedErrorInformation tssV2TransactionsPost201ResponseEmbeddedErrorInformation = (TssV2TransactionsPost201ResponseEmbeddedErrorInformation) o;
    return Objects.equals(this.reason, tssV2TransactionsPost201ResponseEmbeddedErrorInformation.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedErrorInformation {\n");
    
    if (reason != null) sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

