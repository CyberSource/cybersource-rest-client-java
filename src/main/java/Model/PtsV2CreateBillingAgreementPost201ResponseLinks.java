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
import Model.PtsV2PaymentsPost201ResponseLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2CreateBillingAgreementPost201ResponseLinks
 */

public class PtsV2CreateBillingAgreementPost201ResponseLinks {
  @SerializedName("self")
  private PtsV2PaymentsPost201ResponseLinksSelf self = null;

  @SerializedName("updateAgreement")
  private PtsV2PaymentsPost201ResponseLinksSelf updateAgreement = null;

  @SerializedName("revokeAgreement")
  private PtsV2PaymentsPost201ResponseLinksSelf revokeAgreement = null;

  @SerializedName("status")
  private PtsV2PaymentsPost201ResponseLinksSelf status = null;

  public PtsV2CreateBillingAgreementPost201ResponseLinks self(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getSelf() {
    return self;
  }

  public void setSelf(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
  }

  public PtsV2CreateBillingAgreementPost201ResponseLinks updateAgreement(PtsV2PaymentsPost201ResponseLinksSelf updateAgreement) {
    this.updateAgreement = updateAgreement;
    return this;
  }

   /**
   * Get updateAgreement
   * @return updateAgreement
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getUpdateAgreement() {
    return updateAgreement;
  }

  public void setUpdateAgreement(PtsV2PaymentsPost201ResponseLinksSelf updateAgreement) {
    this.updateAgreement = updateAgreement;
  }

  public PtsV2CreateBillingAgreementPost201ResponseLinks revokeAgreement(PtsV2PaymentsPost201ResponseLinksSelf revokeAgreement) {
    this.revokeAgreement = revokeAgreement;
    return this;
  }

   /**
   * Get revokeAgreement
   * @return revokeAgreement
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getRevokeAgreement() {
    return revokeAgreement;
  }

  public void setRevokeAgreement(PtsV2PaymentsPost201ResponseLinksSelf revokeAgreement) {
    this.revokeAgreement = revokeAgreement;
  }

  public PtsV2CreateBillingAgreementPost201ResponseLinks status(PtsV2PaymentsPost201ResponseLinksSelf status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getStatus() {
    return status;
  }

  public void setStatus(PtsV2PaymentsPost201ResponseLinksSelf status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2CreateBillingAgreementPost201ResponseLinks ptsV2CreateBillingAgreementPost201ResponseLinks = (PtsV2CreateBillingAgreementPost201ResponseLinks) o;
    return Objects.equals(this.self, ptsV2CreateBillingAgreementPost201ResponseLinks.self) &&
        Objects.equals(this.updateAgreement, ptsV2CreateBillingAgreementPost201ResponseLinks.updateAgreement) &&
        Objects.equals(this.revokeAgreement, ptsV2CreateBillingAgreementPost201ResponseLinks.revokeAgreement) &&
        Objects.equals(this.status, ptsV2CreateBillingAgreementPost201ResponseLinks.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, updateAgreement, revokeAgreement, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2CreateBillingAgreementPost201ResponseLinks {\n");
    
    if (self != null) sb.append("    self: ").append(toIndentedString(self)).append("\n");
    if (updateAgreement != null) sb.append("    updateAgreement: ").append(toIndentedString(updateAgreement)).append("\n");
    if (revokeAgreement != null) sb.append("    revokeAgreement: ").append(toIndentedString(revokeAgreement)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

