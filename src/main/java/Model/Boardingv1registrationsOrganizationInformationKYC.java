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
import Model.Boardingv1registrationsOrganizationInformationKYCDepositBankAccount;
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
 * Boardingv1registrationsOrganizationInformationKYC
 */

public class Boardingv1registrationsOrganizationInformationKYC {
  @SerializedName("whenIsCustomerCharged")
  private String whenIsCustomerCharged = null;

  @SerializedName("whenIsCustomerChargedDescription")
  private String whenIsCustomerChargedDescription = null;

  @SerializedName("offerSubscriptions")
  private Boolean offerSubscriptions = null;

  @SerializedName("monthlySubscriptionPercent")
  private BigDecimal monthlySubscriptionPercent = null;

  @SerializedName("quarterlySubscriptionPercent")
  private BigDecimal quarterlySubscriptionPercent = null;

  @SerializedName("semiAnnualSubscriptionPercent")
  private BigDecimal semiAnnualSubscriptionPercent = null;

  @SerializedName("annualSubscriptionPercent")
  private BigDecimal annualSubscriptionPercent = null;

  @SerializedName("timeToProductDelivery")
  private String timeToProductDelivery = null;

  @SerializedName("estimatedMonthlySales")
  private BigDecimal estimatedMonthlySales = null;

  @SerializedName("averageOrderAmount")
  private BigDecimal averageOrderAmount = null;

  @SerializedName("largestExpectedOrderAmount")
  private BigDecimal largestExpectedOrderAmount = null;

  @SerializedName("depositBankAccount")
  private Boardingv1registrationsOrganizationInformationKYCDepositBankAccount depositBankAccount = null;

  public Boardingv1registrationsOrganizationInformationKYC whenIsCustomerCharged(String whenIsCustomerCharged) {
    this.whenIsCustomerCharged = whenIsCustomerCharged;
    return this;
  }

   /**
   * Possible values: - ONETIMEBEFORE - ONETIMEAFTER - OTHER
   * @return whenIsCustomerCharged
  **/
  @ApiModelProperty(example = "ONETIMEBEFORE", required = true, value = "Possible values: - ONETIMEBEFORE - ONETIMEAFTER - OTHER")
  public String getWhenIsCustomerCharged() {
    return whenIsCustomerCharged;
  }

  public void setWhenIsCustomerCharged(String whenIsCustomerCharged) {
    this.whenIsCustomerCharged = whenIsCustomerCharged;
  }

  public Boardingv1registrationsOrganizationInformationKYC whenIsCustomerChargedDescription(String whenIsCustomerChargedDescription) {
    this.whenIsCustomerChargedDescription = whenIsCustomerChargedDescription;
    return this;
  }

   /**
   * Get whenIsCustomerChargedDescription
   * @return whenIsCustomerChargedDescription
  **/
  @ApiModelProperty(value = "")
  public String getWhenIsCustomerChargedDescription() {
    return whenIsCustomerChargedDescription;
  }

  public void setWhenIsCustomerChargedDescription(String whenIsCustomerChargedDescription) {
    this.whenIsCustomerChargedDescription = whenIsCustomerChargedDescription;
  }

  public Boardingv1registrationsOrganizationInformationKYC offerSubscriptions(Boolean offerSubscriptions) {
    this.offerSubscriptions = offerSubscriptions;
    return this;
  }

   /**
   * Get offerSubscriptions
   * @return offerSubscriptions
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  public Boolean OfferSubscriptions() {
    return offerSubscriptions;
  }

  public void setOfferSubscriptions(Boolean offerSubscriptions) {
    this.offerSubscriptions = offerSubscriptions;
  }

  public Boardingv1registrationsOrganizationInformationKYC monthlySubscriptionPercent(BigDecimal monthlySubscriptionPercent) {
    this.monthlySubscriptionPercent = monthlySubscriptionPercent;
    return this;
  }

   /**
   * Get monthlySubscriptionPercent
   * @return monthlySubscriptionPercent
  **/
  @ApiModelProperty(example = "30.0", value = "")
  public BigDecimal getMonthlySubscriptionPercent() {
    return monthlySubscriptionPercent;
  }

  public void setMonthlySubscriptionPercent(BigDecimal monthlySubscriptionPercent) {
    this.monthlySubscriptionPercent = monthlySubscriptionPercent;
  }

  public Boardingv1registrationsOrganizationInformationKYC quarterlySubscriptionPercent(BigDecimal quarterlySubscriptionPercent) {
    this.quarterlySubscriptionPercent = quarterlySubscriptionPercent;
    return this;
  }

   /**
   * Get quarterlySubscriptionPercent
   * @return quarterlySubscriptionPercent
  **/
  @ApiModelProperty(example = "20.0", value = "")
  public BigDecimal getQuarterlySubscriptionPercent() {
    return quarterlySubscriptionPercent;
  }

  public void setQuarterlySubscriptionPercent(BigDecimal quarterlySubscriptionPercent) {
    this.quarterlySubscriptionPercent = quarterlySubscriptionPercent;
  }

  public Boardingv1registrationsOrganizationInformationKYC semiAnnualSubscriptionPercent(BigDecimal semiAnnualSubscriptionPercent) {
    this.semiAnnualSubscriptionPercent = semiAnnualSubscriptionPercent;
    return this;
  }

   /**
   * Get semiAnnualSubscriptionPercent
   * @return semiAnnualSubscriptionPercent
  **/
  @ApiModelProperty(example = "50.0", value = "")
  public BigDecimal getSemiAnnualSubscriptionPercent() {
    return semiAnnualSubscriptionPercent;
  }

  public void setSemiAnnualSubscriptionPercent(BigDecimal semiAnnualSubscriptionPercent) {
    this.semiAnnualSubscriptionPercent = semiAnnualSubscriptionPercent;
  }

  public Boardingv1registrationsOrganizationInformationKYC annualSubscriptionPercent(BigDecimal annualSubscriptionPercent) {
    this.annualSubscriptionPercent = annualSubscriptionPercent;
    return this;
  }

   /**
   * Get annualSubscriptionPercent
   * @return annualSubscriptionPercent
  **/
  @ApiModelProperty(example = "100.0", value = "")
  public BigDecimal getAnnualSubscriptionPercent() {
    return annualSubscriptionPercent;
  }

  public void setAnnualSubscriptionPercent(BigDecimal annualSubscriptionPercent) {
    this.annualSubscriptionPercent = annualSubscriptionPercent;
  }

  public Boardingv1registrationsOrganizationInformationKYC timeToProductDelivery(String timeToProductDelivery) {
    this.timeToProductDelivery = timeToProductDelivery;
    return this;
  }

   /**
   * Possible values: - INSTANT - UPTO2 - UPTO5 - UPTO10 - GREATERTHAN10
   * @return timeToProductDelivery
  **/
  @ApiModelProperty(required = true, value = "Possible values: - INSTANT - UPTO2 - UPTO5 - UPTO10 - GREATERTHAN10")
  public String getTimeToProductDelivery() {
    return timeToProductDelivery;
  }

  public void setTimeToProductDelivery(String timeToProductDelivery) {
    this.timeToProductDelivery = timeToProductDelivery;
  }

  public Boardingv1registrationsOrganizationInformationKYC estimatedMonthlySales(BigDecimal estimatedMonthlySales) {
    this.estimatedMonthlySales = estimatedMonthlySales;
    return this;
  }

   /**
   * Get estimatedMonthlySales
   * @return estimatedMonthlySales
  **/
  @ApiModelProperty(example = "10000.5", required = true, value = "")
  public BigDecimal getEstimatedMonthlySales() {
    return estimatedMonthlySales;
  }

  public void setEstimatedMonthlySales(BigDecimal estimatedMonthlySales) {
    this.estimatedMonthlySales = estimatedMonthlySales;
  }

  public Boardingv1registrationsOrganizationInformationKYC averageOrderAmount(BigDecimal averageOrderAmount) {
    this.averageOrderAmount = averageOrderAmount;
    return this;
  }

   /**
   * Get averageOrderAmount
   * @return averageOrderAmount
  **/
  @ApiModelProperty(example = "50.5", required = true, value = "")
  public BigDecimal getAverageOrderAmount() {
    return averageOrderAmount;
  }

  public void setAverageOrderAmount(BigDecimal averageOrderAmount) {
    this.averageOrderAmount = averageOrderAmount;
  }

  public Boardingv1registrationsOrganizationInformationKYC largestExpectedOrderAmount(BigDecimal largestExpectedOrderAmount) {
    this.largestExpectedOrderAmount = largestExpectedOrderAmount;
    return this;
  }

   /**
   * Get largestExpectedOrderAmount
   * @return largestExpectedOrderAmount
  **/
  @ApiModelProperty(example = "100.5", required = true, value = "")
  public BigDecimal getLargestExpectedOrderAmount() {
    return largestExpectedOrderAmount;
  }

  public void setLargestExpectedOrderAmount(BigDecimal largestExpectedOrderAmount) {
    this.largestExpectedOrderAmount = largestExpectedOrderAmount;
  }

  public Boardingv1registrationsOrganizationInformationKYC depositBankAccount(Boardingv1registrationsOrganizationInformationKYCDepositBankAccount depositBankAccount) {
    this.depositBankAccount = depositBankAccount;
    return this;
  }

   /**
   * Get depositBankAccount
   * @return depositBankAccount
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsOrganizationInformationKYCDepositBankAccount getDepositBankAccount() {
    return depositBankAccount;
  }

  public void setDepositBankAccount(Boardingv1registrationsOrganizationInformationKYCDepositBankAccount depositBankAccount) {
    this.depositBankAccount = depositBankAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsOrganizationInformationKYC boardingv1registrationsOrganizationInformationKYC = (Boardingv1registrationsOrganizationInformationKYC) o;
    return Objects.equals(this.whenIsCustomerCharged, boardingv1registrationsOrganizationInformationKYC.whenIsCustomerCharged) &&
        Objects.equals(this.whenIsCustomerChargedDescription, boardingv1registrationsOrganizationInformationKYC.whenIsCustomerChargedDescription) &&
        Objects.equals(this.offerSubscriptions, boardingv1registrationsOrganizationInformationKYC.offerSubscriptions) &&
        Objects.equals(this.monthlySubscriptionPercent, boardingv1registrationsOrganizationInformationKYC.monthlySubscriptionPercent) &&
        Objects.equals(this.quarterlySubscriptionPercent, boardingv1registrationsOrganizationInformationKYC.quarterlySubscriptionPercent) &&
        Objects.equals(this.semiAnnualSubscriptionPercent, boardingv1registrationsOrganizationInformationKYC.semiAnnualSubscriptionPercent) &&
        Objects.equals(this.annualSubscriptionPercent, boardingv1registrationsOrganizationInformationKYC.annualSubscriptionPercent) &&
        Objects.equals(this.timeToProductDelivery, boardingv1registrationsOrganizationInformationKYC.timeToProductDelivery) &&
        Objects.equals(this.estimatedMonthlySales, boardingv1registrationsOrganizationInformationKYC.estimatedMonthlySales) &&
        Objects.equals(this.averageOrderAmount, boardingv1registrationsOrganizationInformationKYC.averageOrderAmount) &&
        Objects.equals(this.largestExpectedOrderAmount, boardingv1registrationsOrganizationInformationKYC.largestExpectedOrderAmount) &&
        Objects.equals(this.depositBankAccount, boardingv1registrationsOrganizationInformationKYC.depositBankAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whenIsCustomerCharged, whenIsCustomerChargedDescription, offerSubscriptions, monthlySubscriptionPercent, quarterlySubscriptionPercent, semiAnnualSubscriptionPercent, annualSubscriptionPercent, timeToProductDelivery, estimatedMonthlySales, averageOrderAmount, largestExpectedOrderAmount, depositBankAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsOrganizationInformationKYC {\n");
    
    if (whenIsCustomerCharged != null) sb.append("    whenIsCustomerCharged: ").append(toIndentedString(whenIsCustomerCharged)).append("\n");
    if (whenIsCustomerChargedDescription != null) sb.append("    whenIsCustomerChargedDescription: ").append(toIndentedString(whenIsCustomerChargedDescription)).append("\n");
    if (offerSubscriptions != null) sb.append("    offerSubscriptions: ").append(toIndentedString(offerSubscriptions)).append("\n");
    if (monthlySubscriptionPercent != null) sb.append("    monthlySubscriptionPercent: ").append(toIndentedString(monthlySubscriptionPercent)).append("\n");
    if (quarterlySubscriptionPercent != null) sb.append("    quarterlySubscriptionPercent: ").append(toIndentedString(quarterlySubscriptionPercent)).append("\n");
    if (semiAnnualSubscriptionPercent != null) sb.append("    semiAnnualSubscriptionPercent: ").append(toIndentedString(semiAnnualSubscriptionPercent)).append("\n");
    if (annualSubscriptionPercent != null) sb.append("    annualSubscriptionPercent: ").append(toIndentedString(annualSubscriptionPercent)).append("\n");
    if (timeToProductDelivery != null) sb.append("    timeToProductDelivery: ").append(toIndentedString(timeToProductDelivery)).append("\n");
    if (estimatedMonthlySales != null) sb.append("    estimatedMonthlySales: ").append(toIndentedString(estimatedMonthlySales)).append("\n");
    if (averageOrderAmount != null) sb.append("    averageOrderAmount: ").append(toIndentedString(averageOrderAmount)).append("\n");
    if (largestExpectedOrderAmount != null) sb.append("    largestExpectedOrderAmount: ").append(toIndentedString(largestExpectedOrderAmount)).append("\n");
    if (depositBankAccount != null) sb.append("    depositBankAccount: ").append(toIndentedString(depositBankAccount)).append("\n");
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

