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
 * SAConfigNotificationsMerchantNotifications
 */

public class SAConfigNotificationsMerchantNotifications {
  @SerializedName("backofficePostEnabled")
  private Boolean backofficePostEnabled = null;

  @SerializedName("backofficeEmailAddress")
  private String backofficeEmailAddress = null;

  @SerializedName("backofficeEmailEnabled")
  private Boolean backofficeEmailEnabled = null;

  @SerializedName("backofficePostUrl")
  private String backofficePostUrl = null;

  @SerializedName("cardNumberFormat")
  private String cardNumberFormat = null;

  public SAConfigNotificationsMerchantNotifications backofficePostEnabled(Boolean backofficePostEnabled) {
    this.backofficePostEnabled = backofficePostEnabled;
    return this;
  }

   /**
   * Enables Webhook transaction confirmation messages sent to URL defined in backofficePostUrl. Usually enabled by web developers integrating to Secure Acceptance.
   * @return backofficePostEnabled
  **/
  @ApiModelProperty(value = "Enables Webhook transaction confirmation messages sent to URL defined in backofficePostUrl. Usually enabled by web developers integrating to Secure Acceptance.")
  public Boolean isBackofficePostEnabled() {
    return backofficePostEnabled;
  }

  public void setBackofficePostEnabled(Boolean backofficePostEnabled) {
    this.backofficePostEnabled = backofficePostEnabled;
  }

  public SAConfigNotificationsMerchantNotifications backofficeEmailAddress(String backofficeEmailAddress) {
    this.backofficeEmailAddress = backofficeEmailAddress;
    return this;
  }

   /**
   * Email address to receive transaction confirmation messages.
   * @return backofficeEmailAddress
  **/
  @ApiModelProperty(value = "Email address to receive transaction confirmation messages.")
  public String getBackofficeEmailAddress() {
    return backofficeEmailAddress;
  }

  public void setBackofficeEmailAddress(String backofficeEmailAddress) {
    this.backofficeEmailAddress = backofficeEmailAddress;
  }

  public SAConfigNotificationsMerchantNotifications backofficeEmailEnabled(Boolean backofficeEmailEnabled) {
    this.backofficeEmailEnabled = backofficeEmailEnabled;
    return this;
  }

   /**
   * Enables email transaction confirmation messages, sent to the address specified in backofficeEmailAddress.
   * @return backofficeEmailEnabled
  **/
  @ApiModelProperty(value = "Enables email transaction confirmation messages, sent to the address specified in backofficeEmailAddress.")
  public Boolean isBackofficeEmailEnabled() {
    return backofficeEmailEnabled;
  }

  public void setBackofficeEmailEnabled(Boolean backofficeEmailEnabled) {
    this.backofficeEmailEnabled = backofficeEmailEnabled;
  }

  public SAConfigNotificationsMerchantNotifications backofficePostUrl(String backofficePostUrl) {
    this.backofficePostUrl = backofficePostUrl;
    return this;
  }

   /**
   * Webhook URL to which transaction confirmation is sent. Usually completed by the web developers integrating to Secure Acceptance.
   * @return backofficePostUrl
  **/
  @ApiModelProperty(value = "Webhook URL to which transaction confirmation is sent. Usually completed by the web developers integrating to Secure Acceptance.")
  public String getBackofficePostUrl() {
    return backofficePostUrl;
  }

  public void setBackofficePostUrl(String backofficePostUrl) {
    this.backofficePostUrl = backofficePostUrl;
  }

  public SAConfigNotificationsMerchantNotifications cardNumberFormat(String cardNumberFormat) {
    this.cardNumberFormat = cardNumberFormat;
    return this;
  }

   /**
   * Format in which the card number should be masked in the notifications.   Valid values: &#x60;1&#x60; - Display first 6 digits only (e.g. \&quot;444433**********\&quot;)  &#x60;2&#x60; - Display last four digits only (e.g. \&quot;************1111\&quot;)  &#x60;3&#x60; - Display First six and last four digits (e.g. \&quot;444433******1111\&quot;) 
   * @return cardNumberFormat
  **/
  @ApiModelProperty(value = "Format in which the card number should be masked in the notifications.   Valid values: `1` - Display first 6 digits only (e.g. \"444433**********\")  `2` - Display last four digits only (e.g. \"************1111\")  `3` - Display First six and last four digits (e.g. \"444433******1111\") ")
  public String getCardNumberFormat() {
    return cardNumberFormat;
  }

  public void setCardNumberFormat(String cardNumberFormat) {
    this.cardNumberFormat = cardNumberFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAConfigNotificationsMerchantNotifications saConfigNotificationsMerchantNotifications = (SAConfigNotificationsMerchantNotifications) o;
    return Objects.equals(this.backofficePostEnabled, saConfigNotificationsMerchantNotifications.backofficePostEnabled) &&
        Objects.equals(this.backofficeEmailAddress, saConfigNotificationsMerchantNotifications.backofficeEmailAddress) &&
        Objects.equals(this.backofficeEmailEnabled, saConfigNotificationsMerchantNotifications.backofficeEmailEnabled) &&
        Objects.equals(this.backofficePostUrl, saConfigNotificationsMerchantNotifications.backofficePostUrl) &&
        Objects.equals(this.cardNumberFormat, saConfigNotificationsMerchantNotifications.cardNumberFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backofficePostEnabled, backofficeEmailAddress, backofficeEmailEnabled, backofficePostUrl, cardNumberFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAConfigNotificationsMerchantNotifications {\n");
    
    sb.append("    backofficePostEnabled: ").append(toIndentedString(backofficePostEnabled)).append("\n");
    sb.append("    backofficeEmailAddress: ").append(toIndentedString(backofficeEmailAddress)).append("\n");
    sb.append("    backofficeEmailEnabled: ").append(toIndentedString(backofficeEmailEnabled)).append("\n");
    sb.append("    backofficePostUrl: ").append(toIndentedString(backofficePostUrl)).append("\n");
    sb.append("    cardNumberFormat: ").append(toIndentedString(cardNumberFormat)).append("\n");
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
