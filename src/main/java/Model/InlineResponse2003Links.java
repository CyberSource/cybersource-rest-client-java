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
import Model.InlineResponse2003LinksReport;
import Model.InlineResponse202LinksStatus;
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
 * InlineResponse2003Links
 */

public class InlineResponse2003Links {
  @SerializedName("self")
  private InlineResponse202LinksStatus self = null;

  @SerializedName("report")
  private List<InlineResponse2003LinksReport> report = null;

  public InlineResponse2003Links self(InlineResponse202LinksStatus self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public InlineResponse202LinksStatus getSelf() {
    return self;
  }

  public void setSelf(InlineResponse202LinksStatus self) {
    this.self = self;
  }

  public InlineResponse2003Links report(List<InlineResponse2003LinksReport> report) {
    this.report = report;
    return this;
  }

  public InlineResponse2003Links addReportItem(InlineResponse2003LinksReport reportItem) {
    if (this.report == null) {
      this.report = new ArrayList<InlineResponse2003LinksReport>();
    }
    this.report.add(reportItem);
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2003LinksReport> getReport() {
    return report;
  }

  public void setReport(List<InlineResponse2003LinksReport> report) {
    this.report = report;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003Links inlineResponse2003Links = (InlineResponse2003Links) o;
    return Objects.equals(this.self, inlineResponse2003Links.self) &&
        Objects.equals(this.report, inlineResponse2003Links.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, report);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Links {\n");
    
    if (self != null) sb.append("    self: ").append(toIndentedString(self)).append("\n");
    if (report != null) sb.append("    report: ").append(toIndentedString(report)).append("\n");
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

