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
import Model.TmsCardArtBrandLogoAsset;
import Model.TmsCardArtCombinedAsset;
import Model.TmsCardArtIconAsset;
import Model.TmsCardArtIssuerLogoAsset;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Card art associated with the tokenized card. 
 */
@ApiModel(description = "Card art associated with the tokenized card. ")

public class TmsCardArt {
  @SerializedName("foregroundColor")
  private String foregroundColor = null;

  @SerializedName("combinedAsset")
  private TmsCardArtCombinedAsset combinedAsset = null;

  @SerializedName("brandLogoAsset")
  private TmsCardArtBrandLogoAsset brandLogoAsset = null;

  @SerializedName("issuerLogoAsset")
  private TmsCardArtIssuerLogoAsset issuerLogoAsset = null;

  @SerializedName("iconAsset")
  private TmsCardArtIconAsset iconAsset = null;

   /**
   * Card foreground color. 
   * @return foregroundColor
  **/
  @ApiModelProperty(value = "Card foreground color. ")
  public String getForegroundColor() {
    return foregroundColor;
  }

  public TmsCardArt combinedAsset(TmsCardArtCombinedAsset combinedAsset) {
    this.combinedAsset = combinedAsset;
    return this;
  }

   /**
   * Get combinedAsset
   * @return combinedAsset
  **/
  @ApiModelProperty(value = "")
  public TmsCardArtCombinedAsset getCombinedAsset() {
    return combinedAsset;
  }

  public void setCombinedAsset(TmsCardArtCombinedAsset combinedAsset) {
    this.combinedAsset = combinedAsset;
  }

  public TmsCardArt brandLogoAsset(TmsCardArtBrandLogoAsset brandLogoAsset) {
    this.brandLogoAsset = brandLogoAsset;
    return this;
  }

   /**
   * Get brandLogoAsset
   * @return brandLogoAsset
  **/
  @ApiModelProperty(value = "")
  public TmsCardArtBrandLogoAsset getBrandLogoAsset() {
    return brandLogoAsset;
  }

  public void setBrandLogoAsset(TmsCardArtBrandLogoAsset brandLogoAsset) {
    this.brandLogoAsset = brandLogoAsset;
  }

  public TmsCardArt issuerLogoAsset(TmsCardArtIssuerLogoAsset issuerLogoAsset) {
    this.issuerLogoAsset = issuerLogoAsset;
    return this;
  }

   /**
   * Get issuerLogoAsset
   * @return issuerLogoAsset
  **/
  @ApiModelProperty(value = "")
  public TmsCardArtIssuerLogoAsset getIssuerLogoAsset() {
    return issuerLogoAsset;
  }

  public void setIssuerLogoAsset(TmsCardArtIssuerLogoAsset issuerLogoAsset) {
    this.issuerLogoAsset = issuerLogoAsset;
  }

  public TmsCardArt iconAsset(TmsCardArtIconAsset iconAsset) {
    this.iconAsset = iconAsset;
    return this;
  }

   /**
   * Get iconAsset
   * @return iconAsset
  **/
  @ApiModelProperty(value = "")
  public TmsCardArtIconAsset getIconAsset() {
    return iconAsset;
  }

  public void setIconAsset(TmsCardArtIconAsset iconAsset) {
    this.iconAsset = iconAsset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsCardArt tmsCardArt = (TmsCardArt) o;
    return Objects.equals(this.foregroundColor, tmsCardArt.foregroundColor) &&
        Objects.equals(this.combinedAsset, tmsCardArt.combinedAsset) &&
        Objects.equals(this.brandLogoAsset, tmsCardArt.brandLogoAsset) &&
        Objects.equals(this.issuerLogoAsset, tmsCardArt.issuerLogoAsset) &&
        Objects.equals(this.iconAsset, tmsCardArt.iconAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foregroundColor, combinedAsset, brandLogoAsset, issuerLogoAsset, iconAsset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsCardArt {\n");
    
    if (foregroundColor != null) sb.append("    foregroundColor: ").append(toIndentedString(foregroundColor)).append("\n");
    if (combinedAsset != null) sb.append("    combinedAsset: ").append(toIndentedString(combinedAsset)).append("\n");
    if (brandLogoAsset != null) sb.append("    brandLogoAsset: ").append(toIndentedString(brandLogoAsset)).append("\n");
    if (issuerLogoAsset != null) sb.append("    issuerLogoAsset: ").append(toIndentedString(issuerLogoAsset)).append("\n");
    if (iconAsset != null) sb.append("    iconAsset: ").append(toIndentedString(iconAsset)).append("\n");
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

