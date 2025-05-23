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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Retry policy for the individual webhooks that are a part of your subscription. If a message fails to deliver, it will execute through this retry policy.  Automatic suspend and resume:  If you experience downtime and have &#x60;deactivateFlag &#x3D; true&#x60; any new messages will be held in a \&quot;SUSPENDED\&quot; status. When your healthCheckUrl returns healthy again, the subscription will automatically be re-enabled and your messages will be sent. We will ping your healthCheckUrl routinely using a POST call with an empty payload to check availability. If your endpoint returns an unhealthy status of !&#x3D; 200, we will check the healthCheckUrl at a more frequent rate until it is healthy again.  If you experience downtime and have &#x60;deactivateFlag &#x3D; false&#x60; and your message exhausts all retry attempts the message will go to a \&quot;FAILED\&quot; status. Support will be notified and will reach out to suggest you execute the \&quot;REPLAY\&quot; endpoint at a later date when your server is healthy.   Reference the below values for formulas and calculations related to the frequency of retries depending on algorithm and configuration. 
 */
@ApiModel(description = "Retry policy for the individual webhooks that are a part of your subscription. If a message fails to deliver, it will execute through this retry policy.  Automatic suspend and resume:  If you experience downtime and have `deactivateFlag = true` any new messages will be held in a \"SUSPENDED\" status. When your healthCheckUrl returns healthy again, the subscription will automatically be re-enabled and your messages will be sent. We will ping your healthCheckUrl routinely using a POST call with an empty payload to check availability. If your endpoint returns an unhealthy status of != 200, we will check the healthCheckUrl at a more frequent rate until it is healthy again.  If you experience downtime and have `deactivateFlag = false` and your message exhausts all retry attempts the message will go to a \"FAILED\" status. Support will be notified and will reach out to suggest you execute the \"REPLAY\" endpoint at a later date when your server is healthy.   Reference the below values for formulas and calculations related to the frequency of retries depending on algorithm and configuration. ")

public class Notificationsubscriptionsv2webhooksRetryPolicy {
  @SerializedName("algorithm")
  private String algorithm = null;

  @SerializedName("firstRetry")
  private Integer firstRetry = null;

  @SerializedName("interval")
  private Integer interval = null;

  @SerializedName("numberOfRetries")
  private Integer numberOfRetries = null;

  @SerializedName("deactivateFlag")
  private String deactivateFlag = null;

  @SerializedName("repeatSequenceCount")
  private Integer repeatSequenceCount = null;

  @SerializedName("repeatSequenceWaitTime")
  private Integer repeatSequenceWaitTime = null;

  @SerializedName("additionalAttributes")
  private List<Map<String, String>> additionalAttributes = null;

  public Notificationsubscriptionsv2webhooksRetryPolicy algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * This is used to calculate the Retry Sequence.  Sample calculations using firstRetry&#x3D;10, interval&#x3D;30, maxNumberOfRetries&#x3D;3 Arithmetic &#x3D; a+r(n-1) Retry 1 - 10 minutes Retry 2 - 10+30x1 &#x3D; 40 minutes Retry 3 - 10+30x2 &#x3D; 70 minutes  Geometric &#x3D; ar^(n-1) Retry 1 - 10 minutes Retry 2 - 10x30^1 &#x3D; 300 minutes Retry 3 - 10x30^2 &#x3D; 9,000 minutes 
   * @return algorithm
  **/
  @ApiModelProperty(value = "This is used to calculate the Retry Sequence.  Sample calculations using firstRetry=10, interval=30, maxNumberOfRetries=3 Arithmetic = a+r(n-1) Retry 1 - 10 minutes Retry 2 - 10+30x1 = 40 minutes Retry 3 - 10+30x2 = 70 minutes  Geometric = ar^(n-1) Retry 1 - 10 minutes Retry 2 - 10x30^1 = 300 minutes Retry 3 - 10x30^2 = 9,000 minutes ")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public Notificationsubscriptionsv2webhooksRetryPolicy firstRetry(Integer firstRetry) {
    this.firstRetry = firstRetry;
    return this;
  }

   /**
   * When to initiate first retry, after the initial call failed. (in mins).
   * @return firstRetry
  **/
  @ApiModelProperty(value = "When to initiate first retry, after the initial call failed. (in mins).")
  public Integer getFirstRetry() {
    return firstRetry;
  }

  public void setFirstRetry(Integer firstRetry) {
    this.firstRetry = firstRetry;
  }

  public Notificationsubscriptionsv2webhooksRetryPolicy interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * The interval between retries (in mins).
   * @return interval
  **/
  @ApiModelProperty(value = "The interval between retries (in mins).")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public Notificationsubscriptionsv2webhooksRetryPolicy numberOfRetries(Integer numberOfRetries) {
    this.numberOfRetries = numberOfRetries;
    return this;
  }

   /**
   * The number of retries per sequence.
   * @return numberOfRetries
  **/
  @ApiModelProperty(value = "The number of retries per sequence.")
  public Integer getNumberOfRetries() {
    return numberOfRetries;
  }

  public void setNumberOfRetries(Integer numberOfRetries) {
    this.numberOfRetries = numberOfRetries;
  }

  public Notificationsubscriptionsv2webhooksRetryPolicy deactivateFlag(String deactivateFlag) {
    this.deactivateFlag = deactivateFlag;
    return this;
  }

   /**
   * Deactivate the subscription if your retries fail to deliver.  If this is set to &#x60;true&#x60;, the automatic suspend and resume feature will occur. This would prevent new webhooks from attempting to deliver and to queue up until your healthCheckUrl returns 200 again, then all messages will be sent.  If this is set to &#x60;false&#x60;, new individual messages will continue to retry and exhaust all failures, but the subscription will stay active. 
   * @return deactivateFlag
  **/
  @ApiModelProperty(value = "Deactivate the subscription if your retries fail to deliver.  If this is set to `true`, the automatic suspend and resume feature will occur. This would prevent new webhooks from attempting to deliver and to queue up until your healthCheckUrl returns 200 again, then all messages will be sent.  If this is set to `false`, new individual messages will continue to retry and exhaust all failures, but the subscription will stay active. ")
  public String getDeactivateFlag() {
    return deactivateFlag;
  }

  public void setDeactivateFlag(String deactivateFlag) {
    this.deactivateFlag = deactivateFlag;
  }

  public Notificationsubscriptionsv2webhooksRetryPolicy repeatSequenceCount(Integer repeatSequenceCount) {
    this.repeatSequenceCount = repeatSequenceCount;
    return this;
  }

   /**
   * The number of times to repeat the complete retry sequence. 0 &#x3D;&gt; don&#39;t repeat the retry sequence 1 &#x3D;&gt; repeat the retry sequence once (R1, R2, R3)+ (R1, R2, R3) 2 &#x3D;&gt; repeat the retry sequence twice (R1, R2, R3) + (R1, R2, R3) + (R1, R2, R3) 
   * @return repeatSequenceCount
  **/
  @ApiModelProperty(value = "The number of times to repeat the complete retry sequence. 0 => don't repeat the retry sequence 1 => repeat the retry sequence once (R1, R2, R3)+ (R1, R2, R3) 2 => repeat the retry sequence twice (R1, R2, R3) + (R1, R2, R3) + (R1, R2, R3) ")
  public Integer getRepeatSequenceCount() {
    return repeatSequenceCount;
  }

  public void setRepeatSequenceCount(Integer repeatSequenceCount) {
    this.repeatSequenceCount = repeatSequenceCount;
  }

  public Notificationsubscriptionsv2webhooksRetryPolicy repeatSequenceWaitTime(Integer repeatSequenceWaitTime) {
    this.repeatSequenceWaitTime = repeatSequenceWaitTime;
    return this;
  }

   /**
   * The time to wait to before repeating the complete retry sequence. Amount of time to wait between each sequence. Sample calculation using repeatSequenceWaitTime&#x3D;10 (R1, R2, R3) + (10) + (R1, R2, R3) + (10) + (R1, R2, R3) 
   * @return repeatSequenceWaitTime
  **/
  @ApiModelProperty(value = "The time to wait to before repeating the complete retry sequence. Amount of time to wait between each sequence. Sample calculation using repeatSequenceWaitTime=10 (R1, R2, R3) + (10) + (R1, R2, R3) + (10) + (R1, R2, R3) ")
  public Integer getRepeatSequenceWaitTime() {
    return repeatSequenceWaitTime;
  }

  public void setRepeatSequenceWaitTime(Integer repeatSequenceWaitTime) {
    this.repeatSequenceWaitTime = repeatSequenceWaitTime;
  }

  public Notificationsubscriptionsv2webhooksRetryPolicy additionalAttributes(List<Map<String, String>> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public Notificationsubscriptionsv2webhooksRetryPolicy addAdditionalAttributesItem(Map<String, String> additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<Map<String, String>>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

   /**
   * Additional data, if any.
   * @return additionalAttributes
  **/
  @ApiModelProperty(value = "Additional data, if any.")
  public List<Map<String, String>> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<Map<String, String>> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notificationsubscriptionsv2webhooksRetryPolicy notificationsubscriptionsv2webhooksRetryPolicy = (Notificationsubscriptionsv2webhooksRetryPolicy) o;
    return Objects.equals(this.algorithm, notificationsubscriptionsv2webhooksRetryPolicy.algorithm) &&
        Objects.equals(this.firstRetry, notificationsubscriptionsv2webhooksRetryPolicy.firstRetry) &&
        Objects.equals(this.interval, notificationsubscriptionsv2webhooksRetryPolicy.interval) &&
        Objects.equals(this.numberOfRetries, notificationsubscriptionsv2webhooksRetryPolicy.numberOfRetries) &&
        Objects.equals(this.deactivateFlag, notificationsubscriptionsv2webhooksRetryPolicy.deactivateFlag) &&
        Objects.equals(this.repeatSequenceCount, notificationsubscriptionsv2webhooksRetryPolicy.repeatSequenceCount) &&
        Objects.equals(this.repeatSequenceWaitTime, notificationsubscriptionsv2webhooksRetryPolicy.repeatSequenceWaitTime) &&
        Objects.equals(this.additionalAttributes, notificationsubscriptionsv2webhooksRetryPolicy.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, firstRetry, interval, numberOfRetries, deactivateFlag, repeatSequenceCount, repeatSequenceWaitTime, additionalAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificationsubscriptionsv2webhooksRetryPolicy {\n");
    
    if (algorithm != null) sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    if (firstRetry != null) sb.append("    firstRetry: ").append(toIndentedString(firstRetry)).append("\n");
    if (interval != null) sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    if (numberOfRetries != null) sb.append("    numberOfRetries: ").append(toIndentedString(numberOfRetries)).append("\n");
    if (deactivateFlag != null) sb.append("    deactivateFlag: ").append(toIndentedString(deactivateFlag)).append("\n");
    if (repeatSequenceCount != null) sb.append("    repeatSequenceCount: ").append(toIndentedString(repeatSequenceCount)).append("\n");
    if (repeatSequenceWaitTime != null) sb.append("    repeatSequenceWaitTime: ").append(toIndentedString(repeatSequenceWaitTime)).append("\n");
    if (additionalAttributes != null) sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
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

