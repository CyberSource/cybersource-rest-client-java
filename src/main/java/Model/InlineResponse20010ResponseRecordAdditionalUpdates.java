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
 * InlineResponse20010ResponseRecordAdditionalUpdates
 */

public class InlineResponse20010ResponseRecordAdditionalUpdates {
  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("paymentInstrumentId")
  private String paymentInstrumentId = null;

  @SerializedName("creator")
  private String creator = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("message")
  private String message = null;

  public InlineResponse20010ResponseRecordAdditionalUpdates customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(example = "C064DE56213D0DB0E053AF598E0A52AA", value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public InlineResponse20010ResponseRecordAdditionalUpdates paymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * Get paymentInstrumentId
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(example = "C064FBFEB64060AAE053AF598E0A3EE6", value = "")
  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }

  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }

  public InlineResponse20010ResponseRecordAdditionalUpdates creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(example = "mid", value = "")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public InlineResponse20010ResponseRecordAdditionalUpdates state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Valid Values:   * ACTIVE   * CLOSED 
   * @return state
  **/
  @ApiModelProperty(value = "Valid Values:   * ACTIVE   * CLOSED ")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public InlineResponse20010ResponseRecordAdditionalUpdates message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "This Payment Instrument contains the source card number, which is now closed. If required, you can update manually or through the AU REST API.", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010ResponseRecordAdditionalUpdates inlineResponse20010ResponseRecordAdditionalUpdates = (InlineResponse20010ResponseRecordAdditionalUpdates) o;
    return Objects.equals(this.customerId, inlineResponse20010ResponseRecordAdditionalUpdates.customerId) &&
        Objects.equals(this.paymentInstrumentId, inlineResponse20010ResponseRecordAdditionalUpdates.paymentInstrumentId) &&
        Objects.equals(this.creator, inlineResponse20010ResponseRecordAdditionalUpdates.creator) &&
        Objects.equals(this.state, inlineResponse20010ResponseRecordAdditionalUpdates.state) &&
        Objects.equals(this.message, inlineResponse20010ResponseRecordAdditionalUpdates.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, paymentInstrumentId, creator, state, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010ResponseRecordAdditionalUpdates {\n");
    
    if (customerId != null) sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    if (paymentInstrumentId != null) sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    if (creator != null) sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    if (state != null) sb.append("    state: ").append(toIndentedString(state)).append("\n");
    if (message != null) sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

