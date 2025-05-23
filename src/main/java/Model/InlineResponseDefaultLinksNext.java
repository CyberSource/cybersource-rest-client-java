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
 * InlineResponseDefaultLinksNext
 */

public class InlineResponseDefaultLinksNext {
  @SerializedName("href")
  private String href = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("method")
  private String method = null;

  public InlineResponseDefaultLinksNext href(String href) {
    this.href = href;
    return this;
  }

   /**
   * URI of the linked resource.
   * @return href
  **/
  @ApiModelProperty(value = "URI of the linked resource.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public InlineResponseDefaultLinksNext title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Label of the linked resource.
   * @return title
  **/
  @ApiModelProperty(value = "Label of the linked resource.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public InlineResponseDefaultLinksNext method(String method) {
    this.method = method;
    return this;
  }

   /**
   * HTTP method of the linked resource.
   * @return method
  **/
  @ApiModelProperty(value = "HTTP method of the linked resource.")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefaultLinksNext inlineResponseDefaultLinksNext = (InlineResponseDefaultLinksNext) o;
    return Objects.equals(this.href, inlineResponseDefaultLinksNext.href) &&
        Objects.equals(this.title, inlineResponseDefaultLinksNext.title) &&
        Objects.equals(this.method, inlineResponseDefaultLinksNext.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, title, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefaultLinksNext {\n");
    
    if (href != null) sb.append("    href: ").append(toIndentedString(href)).append("\n");
    if (title != null) sb.append("    title: ").append(toIndentedString(title)).append("\n");
    if (method != null) sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

