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
import Model.PtsV2PaymentsOrderPost201ResponseOrderInformationAmountDetails;
import Model.PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo;
import Model.PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo;
import Model.PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsOrderPost201ResponseOrderInformation
 */

public class PtsV2PaymentsOrderPost201ResponseOrderInformation {
  @SerializedName("billTo")
  private PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo billTo = null;

  @SerializedName("shipTo")
  private PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo shipTo = null;

  @SerializedName("amountDetails")
  private PtsV2PaymentsOrderPost201ResponseOrderInformationAmountDetails amountDetails = null;

  @SerializedName("shippingDetails")
  private PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails shippingDetails = null;

  public PtsV2PaymentsOrderPost201ResponseOrderInformation billTo(PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(PtsV2PaymentsOrderPost201ResponseOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformation shipTo(PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(PtsV2PaymentsOrderPost201ResponseOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformation amountDetails(PtsV2PaymentsOrderPost201ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsOrderPost201ResponseOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(PtsV2PaymentsOrderPost201ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public PtsV2PaymentsOrderPost201ResponseOrderInformation shippingDetails(PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
    return this;
  }

   /**
   * Get shippingDetails
   * @return shippingDetails
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  public void setShippingDetails(PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsOrderPost201ResponseOrderInformation ptsV2PaymentsOrderPost201ResponseOrderInformation = (PtsV2PaymentsOrderPost201ResponseOrderInformation) o;
    return Objects.equals(this.billTo, ptsV2PaymentsOrderPost201ResponseOrderInformation.billTo) &&
        Objects.equals(this.shipTo, ptsV2PaymentsOrderPost201ResponseOrderInformation.shipTo) &&
        Objects.equals(this.amountDetails, ptsV2PaymentsOrderPost201ResponseOrderInformation.amountDetails) &&
        Objects.equals(this.shippingDetails, ptsV2PaymentsOrderPost201ResponseOrderInformation.shippingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billTo, shipTo, amountDetails, shippingDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsOrderPost201ResponseOrderInformation {\n");
    
    if (billTo != null) sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    if (shipTo != null) sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    if (amountDetails != null) sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    if (shippingDetails != null) sb.append("    shippingDetails: ").append(toIndentedString(shippingDetails)).append("\n");
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

