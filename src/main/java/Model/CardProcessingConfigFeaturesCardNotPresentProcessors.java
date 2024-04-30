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
import Model.CardProcessingConfigFeaturesCardNotPresentPayouts;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CardProcessingConfigFeaturesCardNotPresentProcessors
 */

public class CardProcessingConfigFeaturesCardNotPresentProcessors {
  @SerializedName("relaxAddressVerificationSystem")
  private Boolean relaxAddressVerificationSystem = null;

  @SerializedName("relaxAddressVerificationSystemAllowZipWithoutCountry")
  private Boolean relaxAddressVerificationSystemAllowZipWithoutCountry = null;

  @SerializedName("relaxAddressVerificationSystemAllowExpiredCard")
  private Boolean relaxAddressVerificationSystemAllowExpiredCard = null;

  @SerializedName("enableEmsTransactionRiskScore")
  private Boolean enableEmsTransactionRiskScore = null;

  @SerializedName("prestigiousPropertyIndicator")
  private String prestigiousPropertyIndicator = null;

  @SerializedName("payouts")
  private CardProcessingConfigFeaturesCardNotPresentPayouts payouts = null;

  public CardProcessingConfigFeaturesCardNotPresentProcessors relaxAddressVerificationSystem(Boolean relaxAddressVerificationSystem) {
    this.relaxAddressVerificationSystem = relaxAddressVerificationSystem;
    return this;
  }

   /**
   * Enables you to submit the payment transaction without one or more of the fields for the billTo or card_expiration. Applicable for Elavon Americas (elavonamericas), CB2A, Six (six), CMCIC (cmcic), GPX (gpx), GPN (gpn), VPC, Vero (vero), Fiserv (fiserv), American Express Direct (amexdirect), Chase Paymentech Salem (chasepaymentechsalem), RUPAY, FDI Global (fdiglobal) and Barclays HISO (barclayshiso) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Default Value&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;Barclays HISO&lt;/td&gt;&lt;td&gt;cp, cnp, hybrid&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cp&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;hybrid&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return relaxAddressVerificationSystem
  **/
  @ApiModelProperty(value = "Enables you to submit the payment transaction without one or more of the fields for the billTo or card_expiration. Applicable for Elavon Americas (elavonamericas), CB2A, Six (six), CMCIC (cmcic), GPX (gpx), GPN (gpn), VPC, Vero (vero), Fiserv (fiserv), American Express Direct (amexdirect), Chase Paymentech Salem (chasepaymentechsalem), RUPAY, FDI Global (fdiglobal) and Barclays HISO (barclayshiso) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Default Value</th></tr></thead> <tr><td>Barclays HISO</td><td>cp, cnp, hybrid</td><td>No</td><td>Yes</td></tr> <tr><td>American Express Direct</td><td>cnp</td><td>No</td><td>No</td></tr> <tr><td>American Express Direct</td><td>cp</td><td>No</td><td>Yes</td></tr> <tr><td>American Express Direct</td><td>hybrid</td><td>Yes</td><td>Yes</td></tr> </table> ")
  public Boolean isRelaxAddressVerificationSystem() {
    return relaxAddressVerificationSystem;
  }

  public void setRelaxAddressVerificationSystem(Boolean relaxAddressVerificationSystem) {
    this.relaxAddressVerificationSystem = relaxAddressVerificationSystem;
  }

  public CardProcessingConfigFeaturesCardNotPresentProcessors relaxAddressVerificationSystemAllowZipWithoutCountry(Boolean relaxAddressVerificationSystemAllowZipWithoutCountry) {
    this.relaxAddressVerificationSystemAllowZipWithoutCountry = relaxAddressVerificationSystemAllowZipWithoutCountry;
    return this;
  }

   /**
   * Allows Zip code without country. Applicable for American Express Direct (amexdirect), GPX (gpx), VPC, FDI Global (fdiglobal), Elavon Americas (elavonamericas), Chase Paymentech Salem (chasepaymentechsalem), RUPAY, GPN (gpn) and Barclays HISO (barclayshiso) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Default Value&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;Barclays HISO&lt;/td&gt;&lt;td&gt;cp, cnp, both&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cp, hybrid&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return relaxAddressVerificationSystemAllowZipWithoutCountry
  **/
  @ApiModelProperty(value = "Allows Zip code without country. Applicable for American Express Direct (amexdirect), GPX (gpx), VPC, FDI Global (fdiglobal), Elavon Americas (elavonamericas), Chase Paymentech Salem (chasepaymentechsalem), RUPAY, GPN (gpn) and Barclays HISO (barclayshiso) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Default Value</th></tr></thead> <tr><td>Barclays HISO</td><td>cp, cnp, both</td><td>No</td><td>Yes</td></tr> <tr><td>American Express Direct</td><td>cp, hybrid</td><td>No</td><td>Yes</td></tr> <tr><td>American Express Direct</td><td>cnp</td><td>No</td><td>No</td></tr> </table> ")
  public Boolean isRelaxAddressVerificationSystemAllowZipWithoutCountry() {
    return relaxAddressVerificationSystemAllowZipWithoutCountry;
  }

  public void setRelaxAddressVerificationSystemAllowZipWithoutCountry(Boolean relaxAddressVerificationSystemAllowZipWithoutCountry) {
    this.relaxAddressVerificationSystemAllowZipWithoutCountry = relaxAddressVerificationSystemAllowZipWithoutCountry;
  }

  public CardProcessingConfigFeaturesCardNotPresentProcessors relaxAddressVerificationSystemAllowExpiredCard(Boolean relaxAddressVerificationSystemAllowExpiredCard) {
    this.relaxAddressVerificationSystemAllowExpiredCard = relaxAddressVerificationSystemAllowExpiredCard;
    return this;
  }

   /**
   * Allows transactions that use an expired card. Applicable for American Express Direct (amexdirect), GPN (gpn), Barclays HISO (barclayshiso), Elavon Americas (elavonamericas), VPC, FDI Global (fdiglobal), GPX (gpx), RUPAY, Six (six), Chase Paymentech Salem (chasepaymentechsalem) and CB2A processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Default Value&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;Barclays HISO&lt;/td&gt;&lt;td&gt;cp, cnp, hybrid&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cp, hybrid&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return relaxAddressVerificationSystemAllowExpiredCard
  **/
  @ApiModelProperty(value = "Allows transactions that use an expired card. Applicable for American Express Direct (amexdirect), GPN (gpn), Barclays HISO (barclayshiso), Elavon Americas (elavonamericas), VPC, FDI Global (fdiglobal), GPX (gpx), RUPAY, Six (six), Chase Paymentech Salem (chasepaymentechsalem) and CB2A processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Default Value</th></tr></thead> <tr><td>Barclays HISO</td><td>cp, cnp, hybrid</td><td>No</td><td>Yes</td></tr> <tr><td>American Express Direct</td><td>cp, hybrid</td><td>No</td><td>Yes</td></tr> <tr><td>American Express Direct</td><td>cnp</td><td>No</td><td>No</td></tr> </table> ")
  public Boolean isRelaxAddressVerificationSystemAllowExpiredCard() {
    return relaxAddressVerificationSystemAllowExpiredCard;
  }

  public void setRelaxAddressVerificationSystemAllowExpiredCard(Boolean relaxAddressVerificationSystemAllowExpiredCard) {
    this.relaxAddressVerificationSystemAllowExpiredCard = relaxAddressVerificationSystemAllowExpiredCard;
  }

  public CardProcessingConfigFeaturesCardNotPresentProcessors enableEmsTransactionRiskScore(Boolean enableEmsTransactionRiskScore) {
    this.enableEmsTransactionRiskScore = enableEmsTransactionRiskScore;
    return this;
  }

   /**
   * MasterCard Expert Monitoring Solutions (EMS) provides a predictive, behavior-based fraud score in real time during authorizations for card-not-present (CNP) transactions on cards issued in the U.S. Applicable for GPX (gpx) and VPC processors.
   * @return enableEmsTransactionRiskScore
  **/
  @ApiModelProperty(value = "MasterCard Expert Monitoring Solutions (EMS) provides a predictive, behavior-based fraud score in real time during authorizations for card-not-present (CNP) transactions on cards issued in the U.S. Applicable for GPX (gpx) and VPC processors.")
  public Boolean isEnableEmsTransactionRiskScore() {
    return enableEmsTransactionRiskScore;
  }

  public void setEnableEmsTransactionRiskScore(Boolean enableEmsTransactionRiskScore) {
    this.enableEmsTransactionRiskScore = enableEmsTransactionRiskScore;
  }

  public CardProcessingConfigFeaturesCardNotPresentProcessors prestigiousPropertyIndicator(String prestigiousPropertyIndicator) {
    this.prestigiousPropertyIndicator = prestigiousPropertyIndicator;
    return this;
  }

   /**
   * Applicable for VPC processors.
   * @return prestigiousPropertyIndicator
  **/
  @ApiModelProperty(value = "Applicable for VPC processors.")
  public String getPrestigiousPropertyIndicator() {
    return prestigiousPropertyIndicator;
  }

  public void setPrestigiousPropertyIndicator(String prestigiousPropertyIndicator) {
    this.prestigiousPropertyIndicator = prestigiousPropertyIndicator;
  }

  public CardProcessingConfigFeaturesCardNotPresentProcessors payouts(CardProcessingConfigFeaturesCardNotPresentPayouts payouts) {
    this.payouts = payouts;
    return this;
  }

   /**
   * Get payouts
   * @return payouts
  **/
  @ApiModelProperty(value = "")
  public CardProcessingConfigFeaturesCardNotPresentPayouts getPayouts() {
    return payouts;
  }

  public void setPayouts(CardProcessingConfigFeaturesCardNotPresentPayouts payouts) {
    this.payouts = payouts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardProcessingConfigFeaturesCardNotPresentProcessors cardProcessingConfigFeaturesCardNotPresentProcessors = (CardProcessingConfigFeaturesCardNotPresentProcessors) o;
    return Objects.equals(this.relaxAddressVerificationSystem, cardProcessingConfigFeaturesCardNotPresentProcessors.relaxAddressVerificationSystem) &&
        Objects.equals(this.relaxAddressVerificationSystemAllowZipWithoutCountry, cardProcessingConfigFeaturesCardNotPresentProcessors.relaxAddressVerificationSystemAllowZipWithoutCountry) &&
        Objects.equals(this.relaxAddressVerificationSystemAllowExpiredCard, cardProcessingConfigFeaturesCardNotPresentProcessors.relaxAddressVerificationSystemAllowExpiredCard) &&
        Objects.equals(this.enableEmsTransactionRiskScore, cardProcessingConfigFeaturesCardNotPresentProcessors.enableEmsTransactionRiskScore) &&
        Objects.equals(this.prestigiousPropertyIndicator, cardProcessingConfigFeaturesCardNotPresentProcessors.prestigiousPropertyIndicator) &&
        Objects.equals(this.payouts, cardProcessingConfigFeaturesCardNotPresentProcessors.payouts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relaxAddressVerificationSystem, relaxAddressVerificationSystemAllowZipWithoutCountry, relaxAddressVerificationSystemAllowExpiredCard, enableEmsTransactionRiskScore, prestigiousPropertyIndicator, payouts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardProcessingConfigFeaturesCardNotPresentProcessors {\n");
    
    sb.append("    relaxAddressVerificationSystem: ").append(toIndentedString(relaxAddressVerificationSystem)).append("\n");
    sb.append("    relaxAddressVerificationSystemAllowZipWithoutCountry: ").append(toIndentedString(relaxAddressVerificationSystemAllowZipWithoutCountry)).append("\n");
    sb.append("    relaxAddressVerificationSystemAllowExpiredCard: ").append(toIndentedString(relaxAddressVerificationSystemAllowExpiredCard)).append("\n");
    sb.append("    enableEmsTransactionRiskScore: ").append(toIndentedString(enableEmsTransactionRiskScore)).append("\n");
    sb.append("    prestigiousPropertyIndicator: ").append(toIndentedString(prestigiousPropertyIndicator)).append("\n");
    sb.append("    payouts: ").append(toIndentedString(payouts)).append("\n");
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
