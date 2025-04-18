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
import Model.PtsV2PaymentsPost201ResponseLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetAllPlansResponseLinks
 */

public class GetAllPlansResponseLinks {
  @SerializedName("self")
  private PtsV2PaymentsPost201ResponseLinksSelf self = null;

  @SerializedName("next")
  private PtsV2PaymentsPost201ResponseLinksSelf next = null;

  @SerializedName("previous")
  private PtsV2PaymentsPost201ResponseLinksSelf previous = null;

  public GetAllPlansResponseLinks self(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getSelf() {
    return self;
  }

  public void setSelf(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
  }

  public GetAllPlansResponseLinks next(PtsV2PaymentsPost201ResponseLinksSelf next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getNext() {
    return next;
  }

  public void setNext(PtsV2PaymentsPost201ResponseLinksSelf next) {
    this.next = next;
  }

  public GetAllPlansResponseLinks previous(PtsV2PaymentsPost201ResponseLinksSelf previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getPrevious() {
    return previous;
  }

  public void setPrevious(PtsV2PaymentsPost201ResponseLinksSelf previous) {
    this.previous = previous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllPlansResponseLinks getAllPlansResponseLinks = (GetAllPlansResponseLinks) o;
    return Objects.equals(this.self, getAllPlansResponseLinks.self) &&
        Objects.equals(this.next, getAllPlansResponseLinks.next) &&
        Objects.equals(this.previous, getAllPlansResponseLinks.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, next, previous);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllPlansResponseLinks {\n");
    
    if (self != null) sb.append("    self: ").append(toIndentedString(self)).append("\n");
    if (next != null) sb.append("    next: ").append(toIndentedString(next)).append("\n");
    if (previous != null) sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

