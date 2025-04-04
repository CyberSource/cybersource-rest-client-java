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
 * PtsV2PaymentsPost201ResponseProcessorInformationAvs
 */

public class PtsV2PaymentsPost201ResponseProcessorInformationAvs {
  @SerializedName("code")
  private String code = null;

  @SerializedName("codeRaw")
  private String codeRaw = null;

  public PtsV2PaymentsPost201ResponseProcessorInformationAvs code(String code) {
    this.code = code;
    return this;
  }

   /**
   * AVS result code.  Returned by authorization service. 
   * @return code
  **/
  @ApiModelProperty(value = "AVS result code.  Returned by authorization service. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationAvs codeRaw(String codeRaw) {
    this.codeRaw = codeRaw;
    return this;
  }

   /**
   * AVS result code sent directly from the processor. Returned only when the processor returns this value. **Important** Do not use this field to evaluate the result of AVS. Use for debugging purposes only.  Returned by authorization service. 
   * @return codeRaw
  **/
  @ApiModelProperty(value = "AVS result code sent directly from the processor. Returned only when the processor returns this value. **Important** Do not use this field to evaluate the result of AVS. Use for debugging purposes only.  Returned by authorization service. ")
  public String getCodeRaw() {
    return codeRaw;
  }

  public void setCodeRaw(String codeRaw) {
    this.codeRaw = codeRaw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseProcessorInformationAvs ptsV2PaymentsPost201ResponseProcessorInformationAvs = (PtsV2PaymentsPost201ResponseProcessorInformationAvs) o;
    return Objects.equals(this.code, ptsV2PaymentsPost201ResponseProcessorInformationAvs.code) &&
        Objects.equals(this.codeRaw, ptsV2PaymentsPost201ResponseProcessorInformationAvs.codeRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeRaw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseProcessorInformationAvs {\n");
    
    if (code != null) sb.append("    code: ").append(toIndentedString(code)).append("\n");
    if (codeRaw != null) sb.append("    codeRaw: ").append(toIndentedString(codeRaw)).append("\n");
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

