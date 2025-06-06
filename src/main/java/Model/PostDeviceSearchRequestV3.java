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
 * PostDeviceSearchRequestV3
 */

public class PostDeviceSearchRequestV3 {
  @SerializedName("query")
  private String query = null;

  @SerializedName("sort")
  private String sort = null;

  @SerializedName("offset")
  private Long offset = null;

  @SerializedName("limit")
  private Long limit = null;

  public PostDeviceSearchRequestV3 query(String query) {
    this.query = query;
    return this;
  }

   /**
   * The Search Query to retrieve the Terminals.(Example :- serialNumber:456345234 AND readerId:509353f0-86ca-4af4-a1c9-c2702bfd7431  AND terminalId:7854922 AND status:Inactive AND statusChangeReason:Other AND organizationId:London Store)
   * @return query
  **/
  @ApiModelProperty(value = "The Search Query to retrieve the Terminals.(Example :- serialNumber:456345234 AND readerId:509353f0-86ca-4af4-a1c9-c2702bfd7431  AND terminalId:7854922 AND status:Inactive AND statusChangeReason:Other AND organizationId:London Store)")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public PostDeviceSearchRequestV3 sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * terminalCreationDate:desc (default) or serialNumber or terminalUpdationDate
   * @return sort
  **/
  @ApiModelProperty(value = "terminalCreationDate:desc (default) or serialNumber or terminalUpdationDate")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public PostDeviceSearchRequestV3 offset(Long offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The offset or page number.
   * @return offset
  **/
  @ApiModelProperty(value = "The offset or page number.")
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public PostDeviceSearchRequestV3 limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Number of devices to retrieve in one request.
   * @return limit
  **/
  @ApiModelProperty(value = "Number of devices to retrieve in one request.")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostDeviceSearchRequestV3 postDeviceSearchRequestV3 = (PostDeviceSearchRequestV3) o;
    return Objects.equals(this.query, postDeviceSearchRequestV3.query) &&
        Objects.equals(this.sort, postDeviceSearchRequestV3.sort) &&
        Objects.equals(this.offset, postDeviceSearchRequestV3.offset) &&
        Objects.equals(this.limit, postDeviceSearchRequestV3.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, sort, offset, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostDeviceSearchRequestV3 {\n");
    
    if (query != null) sb.append("    query: ").append(toIndentedString(query)).append("\n");
    if (sort != null) sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    if (offset != null) sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    if (limit != null) sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

