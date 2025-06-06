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
import Model.Rbsv1subscriptionsClientReferenceInformation;
import Model.Rbsv1subscriptionsProcessingInformation;
import Model.Rbsv1subscriptionsidOrderInformation;
import Model.Rbsv1subscriptionsidPlanInformation;
import Model.Rbsv1subscriptionsidSubscriptionInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateSubscription
 */

public class UpdateSubscription {
  @SerializedName("clientReferenceInformation")
  private Rbsv1subscriptionsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processingInformation")
  private Rbsv1subscriptionsProcessingInformation processingInformation = null;

  @SerializedName("planInformation")
  private Rbsv1subscriptionsidPlanInformation planInformation = null;

  @SerializedName("subscriptionInformation")
  private Rbsv1subscriptionsidSubscriptionInformation subscriptionInformation = null;

  @SerializedName("orderInformation")
  private Rbsv1subscriptionsidOrderInformation orderInformation = null;

  public UpdateSubscription clientReferenceInformation(Rbsv1subscriptionsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Rbsv1subscriptionsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Rbsv1subscriptionsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public UpdateSubscription processingInformation(Rbsv1subscriptionsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Rbsv1subscriptionsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Rbsv1subscriptionsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public UpdateSubscription planInformation(Rbsv1subscriptionsidPlanInformation planInformation) {
    this.planInformation = planInformation;
    return this;
  }

   /**
   * Get planInformation
   * @return planInformation
  **/
  @ApiModelProperty(value = "")
  public Rbsv1subscriptionsidPlanInformation getPlanInformation() {
    return planInformation;
  }

  public void setPlanInformation(Rbsv1subscriptionsidPlanInformation planInformation) {
    this.planInformation = planInformation;
  }

  public UpdateSubscription subscriptionInformation(Rbsv1subscriptionsidSubscriptionInformation subscriptionInformation) {
    this.subscriptionInformation = subscriptionInformation;
    return this;
  }

   /**
   * Get subscriptionInformation
   * @return subscriptionInformation
  **/
  @ApiModelProperty(value = "")
  public Rbsv1subscriptionsidSubscriptionInformation getSubscriptionInformation() {
    return subscriptionInformation;
  }

  public void setSubscriptionInformation(Rbsv1subscriptionsidSubscriptionInformation subscriptionInformation) {
    this.subscriptionInformation = subscriptionInformation;
  }

  public UpdateSubscription orderInformation(Rbsv1subscriptionsidOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Rbsv1subscriptionsidOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Rbsv1subscriptionsidOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSubscription updateSubscription = (UpdateSubscription) o;
    return Objects.equals(this.clientReferenceInformation, updateSubscription.clientReferenceInformation) &&
        Objects.equals(this.processingInformation, updateSubscription.processingInformation) &&
        Objects.equals(this.planInformation, updateSubscription.planInformation) &&
        Objects.equals(this.subscriptionInformation, updateSubscription.subscriptionInformation) &&
        Objects.equals(this.orderInformation, updateSubscription.orderInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, processingInformation, planInformation, subscriptionInformation, orderInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSubscription {\n");
    
    if (clientReferenceInformation != null) sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    if (processingInformation != null) sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    if (planInformation != null) sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
    if (subscriptionInformation != null) sb.append("    subscriptionInformation: ").append(toIndentedString(subscriptionInformation)).append("\n");
    if (orderInformation != null) sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
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

