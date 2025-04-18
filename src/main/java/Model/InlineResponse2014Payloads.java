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
import Model.InlineResponse2014PayloadsTestPayload;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse2014Payloads
 */

public class InlineResponse2014Payloads {
  @SerializedName("testPayload")
  private InlineResponse2014PayloadsTestPayload testPayload = null;

  public InlineResponse2014Payloads testPayload(InlineResponse2014PayloadsTestPayload testPayload) {
    this.testPayload = testPayload;
    return this;
  }

   /**
   * Get testPayload
   * @return testPayload
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2014PayloadsTestPayload getTestPayload() {
    return testPayload;
  }

  public void setTestPayload(InlineResponse2014PayloadsTestPayload testPayload) {
    this.testPayload = testPayload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2014Payloads inlineResponse2014Payloads = (InlineResponse2014Payloads) o;
    return Objects.equals(this.testPayload, inlineResponse2014Payloads.testPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testPayload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2014Payloads {\n");
    
    if (testPayload != null) sb.append("    testPayload: ").append(toIndentedString(testPayload)).append("\n");
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

