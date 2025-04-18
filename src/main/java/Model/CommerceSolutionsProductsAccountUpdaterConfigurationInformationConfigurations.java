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
import Model.CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex;
import Model.CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsMasterCard;
import Model.CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations
 */

public class CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations {
  @SerializedName("masterCard")
  private CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsMasterCard masterCard = null;

  @SerializedName("visa")
  private CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa visa = null;

  @SerializedName("amex")
  private CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex amex = null;

  @SerializedName("preferredDay")
  private BigDecimal preferredDay = null;

  @SerializedName("daysWindow")
  private BigDecimal daysWindow = null;

  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations masterCard(CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsMasterCard masterCard) {
    this.masterCard = masterCard;
    return this;
  }

   /**
   * Get masterCard
   * @return masterCard
  **/
  @ApiModelProperty(value = "")
  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsMasterCard getMasterCard() {
    return masterCard;
  }

  public void setMasterCard(CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsMasterCard masterCard) {
    this.masterCard = masterCard;
  }

  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations visa(CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa visa) {
    this.visa = visa;
    return this;
  }

   /**
   * Get visa
   * @return visa
  **/
  @ApiModelProperty(value = "")
  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa getVisa() {
    return visa;
  }

  public void setVisa(CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsVisa visa) {
    this.visa = visa;
  }

  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations amex(CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex amex) {
    this.amex = amex;
    return this;
  }

   /**
   * Get amex
   * @return amex
  **/
  @ApiModelProperty(value = "")
  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex getAmex() {
    return amex;
  }

  public void setAmex(CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex amex) {
    this.amex = amex;
  }

  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations preferredDay(BigDecimal preferredDay) {
    this.preferredDay = preferredDay;
    return this;
  }

   /**
   * Get preferredDay
   * minimum: 1
   * maximum: 28
   * @return preferredDay
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPreferredDay() {
    return preferredDay;
  }

  public void setPreferredDay(BigDecimal preferredDay) {
    this.preferredDay = preferredDay;
  }

  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations daysWindow(BigDecimal daysWindow) {
    this.daysWindow = daysWindow;
    return this;
  }

   /**
   * Get daysWindow
   * minimum: 1
   * maximum: 3650
   * @return daysWindow
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDaysWindow() {
    return daysWindow;
  }

  public void setDaysWindow(BigDecimal daysWindow) {
    this.daysWindow = daysWindow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations = (CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations) o;
    return Objects.equals(this.masterCard, commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations.masterCard) &&
        Objects.equals(this.visa, commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations.visa) &&
        Objects.equals(this.amex, commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations.amex) &&
        Objects.equals(this.preferredDay, commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations.preferredDay) &&
        Objects.equals(this.daysWindow, commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations.daysWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterCard, visa, amex, preferredDay, daysWindow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurations {\n");
    
    if (masterCard != null) sb.append("    masterCard: ").append(toIndentedString(masterCard)).append("\n");
    if (visa != null) sb.append("    visa: ").append(toIndentedString(visa)).append("\n");
    if (amex != null) sb.append("    amex: ").append(toIndentedString(amex)).append("\n");
    if (preferredDay != null) sb.append("    preferredDay: ").append(toIndentedString(preferredDay)).append("\n");
    if (daysWindow != null) sb.append("    daysWindow: ").append(toIndentedString(daysWindow)).append("\n");
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

