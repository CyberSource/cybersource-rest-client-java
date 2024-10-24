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
import Model.Tmsv2TokenizedCardMetadataCardArtCombinedAssetLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tmsv2TokenizedCardMetadataCardArtCombinedAssetLinks
 */

public class Tmsv2TokenizedCardMetadataCardArtCombinedAssetLinks {
  @SerializedName("self")
  private Tmsv2TokenizedCardMetadataCardArtCombinedAssetLinksSelf self = null;

  public Tmsv2TokenizedCardMetadataCardArtCombinedAssetLinks self(Tmsv2TokenizedCardMetadataCardArtCombinedAssetLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public Tmsv2TokenizedCardMetadataCardArtCombinedAssetLinksSelf getSelf() {
    return self;
  }

  public void setSelf(Tmsv2TokenizedCardMetadataCardArtCombinedAssetLinksSelf self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2TokenizedCardMetadataCardArtCombinedAssetLinks tmsv2TokenizedCardMetadataCardArtCombinedAssetLinks = (Tmsv2TokenizedCardMetadataCardArtCombinedAssetLinks) o;
    return Objects.equals(this.self, tmsv2TokenizedCardMetadataCardArtCombinedAssetLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2TokenizedCardMetadataCardArtCombinedAssetLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

