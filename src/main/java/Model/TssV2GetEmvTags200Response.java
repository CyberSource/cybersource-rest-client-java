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
import Model.TssV2GetEmvTags200ResponseEmvTagBreakdownList;
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
 * TssV2GetEmvTags200Response
 */

public class TssV2GetEmvTags200Response {
  @SerializedName("emvTagBreakdownList")
  private List<TssV2GetEmvTags200ResponseEmvTagBreakdownList> emvTagBreakdownList = null;

  public TssV2GetEmvTags200Response emvTagBreakdownList(List<TssV2GetEmvTags200ResponseEmvTagBreakdownList> emvTagBreakdownList) {
    this.emvTagBreakdownList = emvTagBreakdownList;
    return this;
  }

  public TssV2GetEmvTags200Response addEmvTagBreakdownListItem(TssV2GetEmvTags200ResponseEmvTagBreakdownList emvTagBreakdownListItem) {
    if (this.emvTagBreakdownList == null) {
      this.emvTagBreakdownList = new ArrayList<TssV2GetEmvTags200ResponseEmvTagBreakdownList>();
    }
    this.emvTagBreakdownList.add(emvTagBreakdownListItem);
    return this;
  }

   /**
   * An array of objects with each object containing a single EMV tag from the dictionary. 
   * @return emvTagBreakdownList
  **/
  @ApiModelProperty(value = "An array of objects with each object containing a single EMV tag from the dictionary. ")
  public List<TssV2GetEmvTags200ResponseEmvTagBreakdownList> getEmvTagBreakdownList() {
    return emvTagBreakdownList;
  }

  public void setEmvTagBreakdownList(List<TssV2GetEmvTags200ResponseEmvTagBreakdownList> emvTagBreakdownList) {
    this.emvTagBreakdownList = emvTagBreakdownList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2GetEmvTags200Response tssV2GetEmvTags200Response = (TssV2GetEmvTags200Response) o;
    return Objects.equals(this.emvTagBreakdownList, tssV2GetEmvTags200Response.emvTagBreakdownList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emvTagBreakdownList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2GetEmvTags200Response {\n");
    
    if (emvTagBreakdownList != null) sb.append("    emvTagBreakdownList: ").append(toIndentedString(emvTagBreakdownList)).append("\n");
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

