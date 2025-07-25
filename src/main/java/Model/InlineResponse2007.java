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
import Model.InlineResponse2007Devices;
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
 * InlineResponse2007
 */

public class InlineResponse2007 {
  @SerializedName("totalCount")
  private Integer totalCount = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("sort")
  private String sort = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("devices")
  private List<InlineResponse2007Devices> devices = null;

  public InlineResponse2007 totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of results.
   * @return totalCount
  **/
  @ApiModelProperty(value = "Total number of results.")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public InlineResponse2007 offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Controls the starting point within the collection of results, which defaults to 0. The first item in the collection is retrieved by setting a zero offset.  For example, if you have a collection of 15 items to be retrieved from a resource and you specify limit&#x3D;5, you can retrieve the entire set of results in 3 successive requests by varying the offset value like this:  &#x60;offset&#x3D;0&#x60; &#x60;offset&#x3D;5&#x60; &#x60;offset&#x3D;10&#x60;  **Note:** If an offset larger than the number of results is provided, this will result in no embedded object being returned. 
   * @return offset
  **/
  @ApiModelProperty(value = "Controls the starting point within the collection of results, which defaults to 0. The first item in the collection is retrieved by setting a zero offset.  For example, if you have a collection of 15 items to be retrieved from a resource and you specify limit=5, you can retrieve the entire set of results in 3 successive requests by varying the offset value like this:  `offset=0` `offset=5` `offset=10`  **Note:** If an offset larger than the number of results is provided, this will result in no embedded object being returned. ")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public InlineResponse2007 limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Controls the maximum number of items that may be returned for a single request. The default is 20, the maximum is 2500. 
   * @return limit
  **/
  @ApiModelProperty(value = "Controls the maximum number of items that may be returned for a single request. The default is 20, the maximum is 2500. ")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public InlineResponse2007 sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * A comma separated list of the following form:  &#x60;terminalCreationDate:desc or serialNumber or terminalUpdationDate&#x60; 
   * @return sort
  **/
  @ApiModelProperty(value = "A comma separated list of the following form:  `terminalCreationDate:desc or serialNumber or terminalUpdationDate` ")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public InlineResponse2007 count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Results for this page, this could be below the limit.
   * @return count
  **/
  @ApiModelProperty(value = "Results for this page, this could be below the limit.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public InlineResponse2007 devices(List<InlineResponse2007Devices> devices) {
    this.devices = devices;
    return this;
  }

  public InlineResponse2007 addDevicesItem(InlineResponse2007Devices devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<InlineResponse2007Devices>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * A collection of devices
   * @return devices
  **/
  @ApiModelProperty(value = "A collection of devices")
  public List<InlineResponse2007Devices> getDevices() {
    return devices;
  }

  public void setDevices(List<InlineResponse2007Devices> devices) {
    this.devices = devices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.totalCount, inlineResponse2007.totalCount) &&
        Objects.equals(this.offset, inlineResponse2007.offset) &&
        Objects.equals(this.limit, inlineResponse2007.limit) &&
        Objects.equals(this.sort, inlineResponse2007.sort) &&
        Objects.equals(this.count, inlineResponse2007.count) &&
        Objects.equals(this.devices, inlineResponse2007.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, offset, limit, sort, count, devices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    if (totalCount != null) sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    if (offset != null) sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    if (limit != null) sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    if (sort != null) sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    if (count != null) sb.append("    count: ").append(toIndentedString(count)).append("\n");
    if (devices != null) sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

