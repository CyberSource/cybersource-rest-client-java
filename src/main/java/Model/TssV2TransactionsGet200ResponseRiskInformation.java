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
import Model.TssV2TransactionsGet200ResponseRiskInformationProfile;
import Model.TssV2TransactionsGet200ResponseRiskInformationRules;
import Model.TssV2TransactionsGet200ResponseRiskInformationScore;
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

/**
 * TssV2TransactionsGet200ResponseRiskInformation
 */

public class TssV2TransactionsGet200ResponseRiskInformation {
  @SerializedName("profile")
  private TssV2TransactionsGet200ResponseRiskInformationProfile profile = null;

  @SerializedName("rules")
  private List<TssV2TransactionsGet200ResponseRiskInformationRules> rules = null;

  @SerializedName("passiveProfile")
  private TssV2TransactionsGet200ResponseRiskInformationProfile passiveProfile = null;

  @SerializedName("passiveRules")
  private List<TssV2TransactionsGet200ResponseRiskInformationRules> passiveRules = null;

  @SerializedName("score")
  private TssV2TransactionsGet200ResponseRiskInformationScore score = null;

  @SerializedName("localTime")
  private String localTime = null;

  public TssV2TransactionsGet200ResponseRiskInformation profile(TssV2TransactionsGet200ResponseRiskInformationProfile profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseRiskInformationProfile getProfile() {
    return profile;
  }

  public void setProfile(TssV2TransactionsGet200ResponseRiskInformationProfile profile) {
    this.profile = profile;
  }

  public TssV2TransactionsGet200ResponseRiskInformation rules(List<TssV2TransactionsGet200ResponseRiskInformationRules> rules) {
    this.rules = rules;
    return this;
  }

  public TssV2TransactionsGet200ResponseRiskInformation addRulesItem(TssV2TransactionsGet200ResponseRiskInformationRules rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<TssV2TransactionsGet200ResponseRiskInformationRules>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")
  public List<TssV2TransactionsGet200ResponseRiskInformationRules> getRules() {
    return rules;
  }

  public void setRules(List<TssV2TransactionsGet200ResponseRiskInformationRules> rules) {
    this.rules = rules;
  }

  public TssV2TransactionsGet200ResponseRiskInformation passiveProfile(TssV2TransactionsGet200ResponseRiskInformationProfile passiveProfile) {
    this.passiveProfile = passiveProfile;
    return this;
  }

   /**
   * Get passiveProfile
   * @return passiveProfile
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseRiskInformationProfile getPassiveProfile() {
    return passiveProfile;
  }

  public void setPassiveProfile(TssV2TransactionsGet200ResponseRiskInformationProfile passiveProfile) {
    this.passiveProfile = passiveProfile;
  }

  public TssV2TransactionsGet200ResponseRiskInformation passiveRules(List<TssV2TransactionsGet200ResponseRiskInformationRules> passiveRules) {
    this.passiveRules = passiveRules;
    return this;
  }

  public TssV2TransactionsGet200ResponseRiskInformation addPassiveRulesItem(TssV2TransactionsGet200ResponseRiskInformationRules passiveRulesItem) {
    if (this.passiveRules == null) {
      this.passiveRules = new ArrayList<TssV2TransactionsGet200ResponseRiskInformationRules>();
    }
    this.passiveRules.add(passiveRulesItem);
    return this;
  }

   /**
   * Get passiveRules
   * @return passiveRules
  **/
  @ApiModelProperty(value = "")
  public List<TssV2TransactionsGet200ResponseRiskInformationRules> getPassiveRules() {
    return passiveRules;
  }

  public void setPassiveRules(List<TssV2TransactionsGet200ResponseRiskInformationRules> passiveRules) {
    this.passiveRules = passiveRules;
  }

  public TssV2TransactionsGet200ResponseRiskInformation score(TssV2TransactionsGet200ResponseRiskInformationScore score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseRiskInformationScore getScore() {
    return score;
  }

  public void setScore(TssV2TransactionsGet200ResponseRiskInformationScore score) {
    this.score = score;
  }

  public TssV2TransactionsGet200ResponseRiskInformation localTime(String localTime) {
    this.localTime = localTime;
    return this;
  }

   /**
   * Time that the transaction was submitted in local time. Generated by Cybersource.
   * @return localTime
  **/
  @ApiModelProperty(value = "Time that the transaction was submitted in local time. Generated by Cybersource.")
  public String getLocalTime() {
    return localTime;
  }

  public void setLocalTime(String localTime) {
    this.localTime = localTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseRiskInformation tssV2TransactionsGet200ResponseRiskInformation = (TssV2TransactionsGet200ResponseRiskInformation) o;
    return Objects.equals(this.profile, tssV2TransactionsGet200ResponseRiskInformation.profile) &&
        Objects.equals(this.rules, tssV2TransactionsGet200ResponseRiskInformation.rules) &&
        Objects.equals(this.passiveProfile, tssV2TransactionsGet200ResponseRiskInformation.passiveProfile) &&
        Objects.equals(this.passiveRules, tssV2TransactionsGet200ResponseRiskInformation.passiveRules) &&
        Objects.equals(this.score, tssV2TransactionsGet200ResponseRiskInformation.score) &&
        Objects.equals(this.localTime, tssV2TransactionsGet200ResponseRiskInformation.localTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, rules, passiveProfile, passiveRules, score, localTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseRiskInformation {\n");
    
    if (profile != null) sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    if (rules != null) sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    if (passiveProfile != null) sb.append("    passiveProfile: ").append(toIndentedString(passiveProfile)).append("\n");
    if (passiveRules != null) sb.append("    passiveRules: ").append(toIndentedString(passiveRules)).append("\n");
    if (score != null) sb.append("    score: ").append(toIndentedString(score)).append("\n");
    if (localTime != null) sb.append("    localTime: ").append(toIndentedString(localTime)).append("\n");
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

