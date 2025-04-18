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
 * This object contains recurring payment information.
 */
@ApiModel(description = "This object contains recurring payment information.")

public class Ptsv2paymentsRecurringPaymentInformation {
  @SerializedName("endDate")
  private String endDate = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("numberOfPayments")
  private Integer numberOfPayments = null;

  @SerializedName("originalPurchaseDate")
  private String originalPurchaseDate = null;

  @SerializedName("sequenceNumber")
  private Integer sequenceNumber = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("occurrence")
  private String occurrence = null;

  @SerializedName("validationIndicator")
  private String validationIndicator = null;

  @SerializedName("amountType")
  private String amountType = null;

  @SerializedName("maximumAmount")
  private String maximumAmount = null;

  @SerializedName("referenceNumber")
  private String referenceNumber = null;

  public Ptsv2paymentsRecurringPaymentInformation endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date after which no further recurring authorizations should be performed. Format: &#x60;YYYY-MM-DD&#x60; **Note** This field is required for recurring transactions. 
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "The date after which no further recurring authorizations should be performed. Format: `YYYY-MM-DD` **Note** This field is required for recurring transactions. ")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public Ptsv2paymentsRecurringPaymentInformation frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Integer value indicating the minimum number of days between recurring authorizations. A frequency of monthly is indicated by the value 28. Multiple of 28 days will be used to indicate months.  Example: 6 months &#x3D; 168  Example values accepted (31 days): - 31 - 031 - 0031  **Note** This field is required for recurring transactions. 
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "Integer value indicating the minimum number of days between recurring authorizations. A frequency of monthly is indicated by the value 28. Multiple of 28 days will be used to indicate months.  Example: 6 months = 168  Example values accepted (31 days): - 31 - 031 - 0031  **Note** This field is required for recurring transactions. ")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public Ptsv2paymentsRecurringPaymentInformation numberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

   /**
   * Total number of payments for the duration of the recurring subscription. 
   * @return numberOfPayments
  **/
  @ApiModelProperty(value = "Total number of payments for the duration of the recurring subscription. ")
  public Integer getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public Ptsv2paymentsRecurringPaymentInformation originalPurchaseDate(String originalPurchaseDate) {
    this.originalPurchaseDate = originalPurchaseDate;
    return this;
  }

   /**
   * Date of original purchase. Required for recurring transactions. Format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60; **Note**: If this field is empty, the current date is used. 
   * @return originalPurchaseDate
  **/
  @ApiModelProperty(value = "Date of original purchase. Required for recurring transactions. Format: `YYYY-MM-DDTHH:MM:SSZ` **Note**: If this field is empty, the current date is used. ")
  public String getOriginalPurchaseDate() {
    return originalPurchaseDate;
  }

  public void setOriginalPurchaseDate(String originalPurchaseDate) {
    this.originalPurchaseDate = originalPurchaseDate;
  }

  public Ptsv2paymentsRecurringPaymentInformation sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * This field is mandatory for Cartes Bancaires recurring transactions on Credit Mutuel-CIC.       This field records recurring sequence, e.g. 1st for initial,  2 for subsequent, 3 etc 
   * @return sequenceNumber
  **/
  @ApiModelProperty(value = "This field is mandatory for Cartes Bancaires recurring transactions on Credit Mutuel-CIC.       This field records recurring sequence, e.g. 1st for initial,  2 for subsequent, 3 etc ")
  public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public Ptsv2paymentsRecurringPaymentInformation type(String type) {
    this.type = type;
    return this;
  }

   /**
   * This contains the type of recurring payment. Valid Values : 1 - Registration/First transaction 2 - Subsequent transaction 3 - Modification 4 - Cancellation 
   * @return type
  **/
  @ApiModelProperty(value = "This contains the type of recurring payment. Valid Values : 1 - Registration/First transaction 2 - Subsequent transaction 3 - Modification 4 - Cancellation ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv2paymentsRecurringPaymentInformation occurrence(String occurrence) {
    this.occurrence = occurrence;
    return this;
  }

   /**
   * This value indicates how often a recurring payment occurs. Valid Values : • 01 (Daily) • 02 (Twice weekly) • 03 (Weekly) • 04 (Ten days) • 05 (Fortnightly) • 06 (Monthly) • 07 (Every two months) • 08 (Trimester) • 09 (Quarterly) • 10 (Twice yearly) • 11 (Annually) • 12 (Unscheduled) 
   * @return occurrence
  **/
  @ApiModelProperty(value = "This value indicates how often a recurring payment occurs. Valid Values : • 01 (Daily) • 02 (Twice weekly) • 03 (Weekly) • 04 (Ten days) • 05 (Fortnightly) • 06 (Monthly) • 07 (Every two months) • 08 (Trimester) • 09 (Quarterly) • 10 (Twice yearly) • 11 (Annually) • 12 (Unscheduled) ")
  public String getOccurrence() {
    return occurrence;
  }

  public void setOccurrence(String occurrence) {
    this.occurrence = occurrence;
  }

  public Ptsv2paymentsRecurringPaymentInformation validationIndicator(String validationIndicator) {
    this.validationIndicator = validationIndicator;
    return this;
  }

   /**
   * This tag will contain a value that indicates whether or not the recurring payment transaction has been validated. Valid values : 0- Not validated 1- Validated 
   * @return validationIndicator
  **/
  @ApiModelProperty(value = "This tag will contain a value that indicates whether or not the recurring payment transaction has been validated. Valid values : 0- Not validated 1- Validated ")
  public String getValidationIndicator() {
    return validationIndicator;
  }

  public void setValidationIndicator(String validationIndicator) {
    this.validationIndicator = validationIndicator;
  }

  public Ptsv2paymentsRecurringPaymentInformation amountType(String amountType) {
    this.amountType = amountType;
    return this;
  }

   /**
   * Indicates recurring amount type agreed by the cardholder Valid Values : 1- Fixed amount recurring payment 2- Recurring payment with maximum amount 
   * @return amountType
  **/
  @ApiModelProperty(value = "Indicates recurring amount type agreed by the cardholder Valid Values : 1- Fixed amount recurring payment 2- Recurring payment with maximum amount ")
  public String getAmountType() {
    return amountType;
  }

  public void setAmountType(String amountType) {
    this.amountType = amountType;
  }

  public Ptsv2paymentsRecurringPaymentInformation maximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
    return this;
  }

   /**
   * This API field will contain the maximum amount agreed to by the cardholder. The currency of this amount will be specified in Field 49—Currency Code,Transaction. 
   * @return maximumAmount
  **/
  @ApiModelProperty(value = "This API field will contain the maximum amount agreed to by the cardholder. The currency of this amount will be specified in Field 49—Currency Code,Transaction. ")
  public String getMaximumAmount() {
    return maximumAmount;
  }

  public void setMaximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
  }

  public Ptsv2paymentsRecurringPaymentInformation referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * This will contain a unique reference number for the recurring payment transaction. 
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "This will contain a unique reference number for the recurring payment transaction. ")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsRecurringPaymentInformation ptsv2paymentsRecurringPaymentInformation = (Ptsv2paymentsRecurringPaymentInformation) o;
    return Objects.equals(this.endDate, ptsv2paymentsRecurringPaymentInformation.endDate) &&
        Objects.equals(this.frequency, ptsv2paymentsRecurringPaymentInformation.frequency) &&
        Objects.equals(this.numberOfPayments, ptsv2paymentsRecurringPaymentInformation.numberOfPayments) &&
        Objects.equals(this.originalPurchaseDate, ptsv2paymentsRecurringPaymentInformation.originalPurchaseDate) &&
        Objects.equals(this.sequenceNumber, ptsv2paymentsRecurringPaymentInformation.sequenceNumber) &&
        Objects.equals(this.type, ptsv2paymentsRecurringPaymentInformation.type) &&
        Objects.equals(this.occurrence, ptsv2paymentsRecurringPaymentInformation.occurrence) &&
        Objects.equals(this.validationIndicator, ptsv2paymentsRecurringPaymentInformation.validationIndicator) &&
        Objects.equals(this.amountType, ptsv2paymentsRecurringPaymentInformation.amountType) &&
        Objects.equals(this.maximumAmount, ptsv2paymentsRecurringPaymentInformation.maximumAmount) &&
        Objects.equals(this.referenceNumber, ptsv2paymentsRecurringPaymentInformation.referenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, frequency, numberOfPayments, originalPurchaseDate, sequenceNumber, type, occurrence, validationIndicator, amountType, maximumAmount, referenceNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsRecurringPaymentInformation {\n");
    
    if (endDate != null) sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    if (frequency != null) sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    if (numberOfPayments != null) sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    if (originalPurchaseDate != null) sb.append("    originalPurchaseDate: ").append(toIndentedString(originalPurchaseDate)).append("\n");
    if (sequenceNumber != null) sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    if (type != null) sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (occurrence != null) sb.append("    occurrence: ").append(toIndentedString(occurrence)).append("\n");
    if (validationIndicator != null) sb.append("    validationIndicator: ").append(toIndentedString(validationIndicator)).append("\n");
    if (amountType != null) sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    if (maximumAmount != null) sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
    if (referenceNumber != null) sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
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

