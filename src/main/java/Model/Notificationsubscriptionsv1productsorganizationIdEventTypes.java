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

/**
 * Notificationsubscriptionsv1productsorganizationIdEventTypes
 */

public class Notificationsubscriptionsv1productsorganizationIdEventTypes {
  @SerializedName("eventName")
  private String eventName = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("timeSensitivity")
  private Boolean timeSensitivity = false;

  @SerializedName("payloadEncryption")
  private Boolean payloadEncryption = false;

  public Notificationsubscriptionsv1productsorganizationIdEventTypes eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @ApiModelProperty(value = "")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Notificationsubscriptionsv1productsorganizationIdEventTypes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Notificationsubscriptionsv1productsorganizationIdEventTypes frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(value = "")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public Notificationsubscriptionsv1productsorganizationIdEventTypes timeSensitivity(Boolean timeSensitivity) {
    this.timeSensitivity = timeSensitivity;
    return this;
  }

   /**
   * Get timeSensitivity
   * @return timeSensitivity
  **/
  @ApiModelProperty(value = "")
  public Boolean getTimeSensitivity() {
    return timeSensitivity;
  }

  public void setTimeSensitivity(Boolean timeSensitivity) {
    this.timeSensitivity = timeSensitivity;
  }

  public Notificationsubscriptionsv1productsorganizationIdEventTypes payloadEncryption(Boolean payloadEncryption) {
    this.payloadEncryption = payloadEncryption;
    return this;
  }

   /**
   * Get payloadEncryption
   * @return payloadEncryption
  **/
  @ApiModelProperty(value = "")
  public Boolean getPayloadEncryption() {
    return payloadEncryption;
  }

  public void setPayloadEncryption(Boolean payloadEncryption) {
    this.payloadEncryption = payloadEncryption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notificationsubscriptionsv1productsorganizationIdEventTypes notificationsubscriptionsv1productsorganizationIdEventTypes = (Notificationsubscriptionsv1productsorganizationIdEventTypes) o;
    return Objects.equals(this.eventName, notificationsubscriptionsv1productsorganizationIdEventTypes.eventName) &&
        Objects.equals(this.displayName, notificationsubscriptionsv1productsorganizationIdEventTypes.displayName) &&
        Objects.equals(this.frequency, notificationsubscriptionsv1productsorganizationIdEventTypes.frequency) &&
        Objects.equals(this.timeSensitivity, notificationsubscriptionsv1productsorganizationIdEventTypes.timeSensitivity) &&
        Objects.equals(this.payloadEncryption, notificationsubscriptionsv1productsorganizationIdEventTypes.payloadEncryption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, displayName, frequency, timeSensitivity, payloadEncryption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificationsubscriptionsv1productsorganizationIdEventTypes {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    timeSensitivity: ").append(toIndentedString(timeSensitivity)).append("\n");
    sb.append("    payloadEncryption: ").append(toIndentedString(payloadEncryption)).append("\n");
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
