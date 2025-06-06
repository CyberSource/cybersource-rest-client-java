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
import Model.InlineResponse2001EmbeddedCapture;
import Model.InlineResponse2001EmbeddedReversal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * This object includes either a capture or reversal object. They each has the status of the action and link to the GET method to the following-on capture transaction or reversal transaction. 
 */
@ApiModel(description = "This object includes either a capture or reversal object. They each has the status of the action and link to the GET method to the following-on capture transaction or reversal transaction. ")

public class InlineResponse2001Embedded {
  @SerializedName("capture")
  private InlineResponse2001EmbeddedCapture capture = null;

  @SerializedName("reversal")
  private InlineResponse2001EmbeddedReversal reversal = null;

  public InlineResponse2001Embedded capture(InlineResponse2001EmbeddedCapture capture) {
    this.capture = capture;
    return this;
  }

   /**
   * Get capture
   * @return capture
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2001EmbeddedCapture getCapture() {
    return capture;
  }

  public void setCapture(InlineResponse2001EmbeddedCapture capture) {
    this.capture = capture;
  }

  public InlineResponse2001Embedded reversal(InlineResponse2001EmbeddedReversal reversal) {
    this.reversal = reversal;
    return this;
  }

   /**
   * Get reversal
   * @return reversal
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2001EmbeddedReversal getReversal() {
    return reversal;
  }

  public void setReversal(InlineResponse2001EmbeddedReversal reversal) {
    this.reversal = reversal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Embedded inlineResponse2001Embedded = (InlineResponse2001Embedded) o;
    return Objects.equals(this.capture, inlineResponse2001Embedded.capture) &&
        Objects.equals(this.reversal, inlineResponse2001Embedded.reversal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capture, reversal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Embedded {\n");
    
    if (capture != null) sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
    if (reversal != null) sb.append("    reversal: ").append(toIndentedString(reversal)).append("\n");
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

