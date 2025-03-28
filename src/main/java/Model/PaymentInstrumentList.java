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
import Model.PaymentInstrumentListEmbedded;
import Model.PaymentInstrumentListLinks;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentInstrumentList
 */

public class PaymentInstrumentList {
  @SerializedName("_links")
  private PaymentInstrumentListLinks links = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("_embedded")
  private PaymentInstrumentListEmbedded embedded = null;

  public PaymentInstrumentList links(PaymentInstrumentListLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentListLinks getLinks() {
    return links;
  }

  public void setLinks(PaymentInstrumentListLinks links) {
    this.links = links;
  }

   /**
   * The offset parameter supplied in the request.
   * @return offset
  **/
  @ApiModelProperty(example = "0", value = "The offset parameter supplied in the request.")
  public Integer getOffset() {
    return offset;
  }

   /**
   * The limit parameter supplied in the request.
   * @return limit
  **/
  @ApiModelProperty(example = "20", value = "The limit parameter supplied in the request.")
  public Integer getLimit() {
    return limit;
  }

   /**
   * The number of Payment Instruments returned in the array.
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "The number of Payment Instruments returned in the array.")
  public Integer getCount() {
    return count;
  }

   /**
   * The total number of Payment Instruments associated with the Customer or Instrument Identifier.
   * @return total
  **/
  @ApiModelProperty(example = "1", value = "The total number of Payment Instruments associated with the Customer or Instrument Identifier.")
  public Integer getTotal() {
    return total;
  }

  public PaymentInstrumentList embedded(PaymentInstrumentListEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentListEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(PaymentInstrumentListEmbedded embedded) {
    this.embedded = embedded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentList paymentInstrumentList = (PaymentInstrumentList) o;
    return Objects.equals(this.links, paymentInstrumentList.links) &&
        Objects.equals(this.offset, paymentInstrumentList.offset) &&
        Objects.equals(this.limit, paymentInstrumentList.limit) &&
        Objects.equals(this.count, paymentInstrumentList.count) &&
        Objects.equals(this.total, paymentInstrumentList.total) &&
        Objects.equals(this.embedded, paymentInstrumentList.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, offset, limit, count, total, embedded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentList {\n");
    
    if (links != null) sb.append("    links: ").append(toIndentedString(links)).append("\n");
    if (offset != null) sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    if (limit != null) sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    if (count != null) sb.append("    count: ").append(toIndentedString(count)).append("\n");
    if (total != null) sb.append("    total: ").append(toIndentedString(total)).append("\n");
    if (embedded != null) sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
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

