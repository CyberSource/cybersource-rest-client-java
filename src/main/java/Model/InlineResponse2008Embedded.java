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
import Model.InlineResponse2008EmbeddedBatches;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2008Embedded
 */

public class InlineResponse2008Embedded {
  @SerializedName("batches")
  private List<InlineResponse2008EmbeddedBatches> batches = null;

  public InlineResponse2008Embedded batches(List<InlineResponse2008EmbeddedBatches> batches) {
    this.batches = batches;
    return this;
  }

  public InlineResponse2008Embedded addBatchesItem(InlineResponse2008EmbeddedBatches batchesItem) {
    if (this.batches == null) {
      this.batches = new ArrayList<InlineResponse2008EmbeddedBatches>();
    }
    this.batches.add(batchesItem);
    return this;
  }

   /**
   * Get batches
   * @return batches
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2008EmbeddedBatches> getBatches() {
    return batches;
  }

  public void setBatches(List<InlineResponse2008EmbeddedBatches> batches) {
    this.batches = batches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Embedded inlineResponse2008Embedded = (InlineResponse2008Embedded) o;
    return Objects.equals(this.batches, inlineResponse2008Embedded.batches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Embedded {\n");
    
    if (batches != null) sb.append("    batches: ").append(toIndentedString(batches)).append("\n");
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

