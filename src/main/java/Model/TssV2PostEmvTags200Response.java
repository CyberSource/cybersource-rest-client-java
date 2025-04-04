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
import Model.TssV2PostEmvTags200ResponseParsedEMVTagsList;
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
 * TssV2PostEmvTags200Response
 */

public class TssV2PostEmvTags200Response {
  @SerializedName("parsedEMVTagsList")
  private List<TssV2PostEmvTags200ResponseParsedEMVTagsList> parsedEMVTagsList = null;

  public TssV2PostEmvTags200Response parsedEMVTagsList(List<TssV2PostEmvTags200ResponseParsedEMVTagsList> parsedEMVTagsList) {
    this.parsedEMVTagsList = parsedEMVTagsList;
    return this;
  }

  public TssV2PostEmvTags200Response addParsedEMVTagsListItem(TssV2PostEmvTags200ResponseParsedEMVTagsList parsedEMVTagsListItem) {
    if (this.parsedEMVTagsList == null) {
      this.parsedEMVTagsList = new ArrayList<TssV2PostEmvTags200ResponseParsedEMVTagsList>();
    }
    this.parsedEMVTagsList.add(parsedEMVTagsListItem);
    return this;
  }

   /**
   * An array of objects (one per object in the passed emvDetailsList), each of which contains a fully parsed EMV string 
   * @return parsedEMVTagsList
  **/
  @ApiModelProperty(value = "An array of objects (one per object in the passed emvDetailsList), each of which contains a fully parsed EMV string ")
  public List<TssV2PostEmvTags200ResponseParsedEMVTagsList> getParsedEMVTagsList() {
    return parsedEMVTagsList;
  }

  public void setParsedEMVTagsList(List<TssV2PostEmvTags200ResponseParsedEMVTagsList> parsedEMVTagsList) {
    this.parsedEMVTagsList = parsedEMVTagsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2PostEmvTags200Response tssV2PostEmvTags200Response = (TssV2PostEmvTags200Response) o;
    return Objects.equals(this.parsedEMVTagsList, tssV2PostEmvTags200Response.parsedEMVTagsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parsedEMVTagsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2PostEmvTags200Response {\n");
    
    if (parsedEMVTagsList != null) sb.append("    parsedEMVTagsList: ").append(toIndentedString(parsedEMVTagsList)).append("\n");
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

