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
 * InlineResponse2008Links
 */

public class InlineResponse2008Links {
  @SerializedName("rel")
  private String rel = null;

  @SerializedName("href")
  private String href = null;

  public InlineResponse2008Links rel(String rel) {
    this.rel = rel;
    return this;
  }

   /**
   * Valid Values:   * self   * first   * last   * prev   * next 
   * @return rel
  **/
  @ApiModelProperty(value = "Valid Values:   * self   * first   * last   * prev   * next ")
  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public InlineResponse2008Links href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(example = "https://api.cybersource.com/accountupdater/v1/batches?offset=0&limit=20", value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Links inlineResponse2008Links = (InlineResponse2008Links) o;
    return Objects.equals(this.rel, inlineResponse2008Links.rel) &&
        Objects.equals(this.href, inlineResponse2008Links.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel, href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Links {\n");
    
    if (rel != null) sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    if (href != null) sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

