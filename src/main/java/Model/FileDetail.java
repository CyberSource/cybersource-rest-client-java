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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * FileDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-26T18:32:32.437+05:30")
public class FileDetail {
  @SerializedName("fileId")
  private String fileId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("createdTime")
  private DateTime createdTime = null;

  @SerializedName("lastModifiedTime")
  private DateTime lastModifiedTime = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("size")
  private Integer size = null;

  public FileDetail fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * Unique identifier of a file
   * @return fileId
  **/
  @ApiModelProperty(example = "AC855F9F42C90361EC78202F47CDE98D70BEAA6FB00FB56AE83EE9A9DAEE077B", value = "Unique identifier of a file")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public FileDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the file
   * @return name
  **/
  @ApiModelProperty(example = "MyTransactionDetailreport.xml", value = "Name of the file")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileDetail createdTime(DateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Date and time for the file in PST
   * @return createdTime
  **/
  @ApiModelProperty(example = "2017-10-01T00:00:00+05:00", value = "Date and time for the file in PST")
  public DateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(DateTime createdTime) {
    this.createdTime = createdTime;
  }

  public FileDetail lastModifiedTime(DateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * Date and time for the file in PST
   * @return lastModifiedTime
  **/
  @ApiModelProperty(example = "2017-10-01T00:00:00+05:00", value = "Date and time for the file in PST")
  public DateTime getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(DateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public FileDetail date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date and time for the file in PST
   * @return date
  **/
  @ApiModelProperty(example = "2017-10-05", value = "Date and time for the file in PST")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public FileDetail mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * &#39;File extension&#39;  Valid values: - &#39;application/xml&#39; - &#39;text/csv&#39; - &#39;application/pdf&#39; - &#39;application/octet-stream&#39; 
   * @return mimeType
  **/
  @ApiModelProperty(example = "application/xml", value = "'File extension'  Valid values: - 'application/xml' - 'text/csv' - 'application/pdf' - 'application/octet-stream' ")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public FileDetail size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Size of the file in bytes
   * @return size
  **/
  @ApiModelProperty(example = "2245397", value = "Size of the file in bytes")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDetail fileDetail = (FileDetail) o;
    return Objects.equals(this.fileId, fileDetail.fileId) &&
        Objects.equals(this.name, fileDetail.name) &&
        Objects.equals(this.createdTime, fileDetail.createdTime) &&
        Objects.equals(this.lastModifiedTime, fileDetail.lastModifiedTime) &&
        Objects.equals(this.date, fileDetail.date) &&
        Objects.equals(this.mimeType, fileDetail.mimeType) &&
        Objects.equals(this.size, fileDetail.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, name, createdTime, lastModifiedTime, date, mimeType, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDetail {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
