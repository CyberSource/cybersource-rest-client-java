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
 * PblPaymentLinksPost201ResponseLinks
 */

public class PblPaymentLinksPost201ResponseLinks {
  @SerializedName("self")
  private PtsV2PaymentsPost201ResponseLinksSelf self = null;

  @SerializedName("update")
  private PtsV2PaymentsPost201ResponseLinksSelf update = null;

  public PblPaymentLinksPost201ResponseLinks self(PtsV2PaymentsPost201ResponseLinksSelf self) {
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

  public PblPaymentLinksPost201ResponseLinks update(PtsV2PaymentsPost201ResponseLinksSelf update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getUpdate() {
    return update;
  }

  public void setUpdate(PtsV2PaymentsPost201ResponseLinksSelf update) {
    this.update = update;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PblPaymentLinksPost201ResponseLinks pblPaymentLinksPost201ResponseLinks = (PblPaymentLinksPost201ResponseLinks) o;
    return Objects.equals(this.self, pblPaymentLinksPost201ResponseLinks.self) &&
        Objects.equals(this.update, pblPaymentLinksPost201ResponseLinks.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PblPaymentLinksPost201ResponseLinks {\n");
    
    if (self != null) sb.append("    self: ").append(toIndentedString(self)).append("\n");
    if (update != null) sb.append("    update: ").append(toIndentedString(update)).append("\n");
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

