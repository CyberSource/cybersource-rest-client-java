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
 * A merchant descriptor is the line of copy that identifies transactions on a cardholder&#39;s account activity and statement. If this information is not populated, the data will be retrieved from OMS.
 */
@ApiModel(description = "A merchant descriptor is the line of copy that identifies transactions on a cardholder's account activity and statement. If this information is not populated, the data will be retrieved from OMS.")

public class CardProcessingConfigCommonMerchantDescriptorInformation {
  @SerializedName("name")
  private String name = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("countryOfOrigin")
  private String countryOfOrigin = null;

  public CardProcessingConfigCommonMerchantDescriptorInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Applicable for TSYS (tsys), RUPAY, American Express Direct (amexdirect) and Elavon Americas (elavonamericas) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp, cp, hybrid&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;38&lt;/td&gt;&lt;td&gt;^[0-9a-zA-Z\\s]+$&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return name
  **/
  @ApiModelProperty(value = "Applicable for TSYS (tsys), RUPAY, American Express Direct (amexdirect) and Elavon Americas (elavonamericas) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>American Express Direct</td><td>cnp, cp, hybrid</td><td>Yes</td><td>1</td><td>38</td><td>^[0-9a-zA-Z\\s]+$</td></tr> </table> ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CardProcessingConfigCommonMerchantDescriptorInformation city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Applicable for American Express Direct (amexdirect), TSYS (tsys), RUPAY and Elavon Americas (elavonamericas) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp, cp, hybrid&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;21&lt;/td&gt;&lt;td&gt;^[0-9a-zA-Z\\s]+$&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return city
  **/
  @ApiModelProperty(value = "Applicable for American Express Direct (amexdirect), TSYS (tsys), RUPAY and Elavon Americas (elavonamericas) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>American Express Direct</td><td>cnp, cp, hybrid</td><td>Yes</td><td>1</td><td>21</td><td>^[0-9a-zA-Z\\s]+$</td></tr> </table> ")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CardProcessingConfigCommonMerchantDescriptorInformation country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Applicable for Six (six), Elavon Americas (elavonamericas), TSYS (tsys) and American Express Direct (amexdirect) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp, cp, hybrid&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;td&gt;3&lt;/td&gt;&lt;td&gt;3&lt;/td&gt;&lt;td&gt;^[A-Z]+$&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return country
  **/
  @ApiModelProperty(value = "Applicable for Six (six), Elavon Americas (elavonamericas), TSYS (tsys) and American Express Direct (amexdirect) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>American Express Direct</td><td>cnp, cp, hybrid</td><td>Yes</td><td>3</td><td>3</td><td>^[A-Z]+$</td></tr> </table> ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CardProcessingConfigCommonMerchantDescriptorInformation phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Applicable for RUPAY, Elavon Americas (elavonamericas), American Express Direct (amexdirect) and TSYS (tsys) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp, cp, hybrid&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;20&lt;/td&gt;&lt;td&gt;^[0-9a-zA-Z\\s]+$&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return phone
  **/
  @ApiModelProperty(value = "Applicable for RUPAY, Elavon Americas (elavonamericas), American Express Direct (amexdirect) and TSYS (tsys) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>American Express Direct</td><td>cnp, cp, hybrid</td><td>Yes</td><td>1</td><td>20</td><td>^[0-9a-zA-Z\\s]+$</td></tr> </table> ")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CardProcessingConfigCommonMerchantDescriptorInformation state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Applicable for RUPAY, TSYS (tsys), Elavon Americas (elavonamericas) and American Express Direct (amexdirect) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp, cp, hybrid&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;3&lt;/td&gt;&lt;td&gt;^[A-Z]+$&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return state
  **/
  @ApiModelProperty(value = "Applicable for RUPAY, TSYS (tsys), Elavon Americas (elavonamericas) and American Express Direct (amexdirect) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>American Express Direct</td><td>cnp, cp, hybrid</td><td>No</td><td>1</td><td>3</td><td>^[A-Z]+$</td></tr> </table> ")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public CardProcessingConfigCommonMerchantDescriptorInformation street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Applicable for American Express Direct (amexdirect), TSYS (tsys) and Elavon Americas (elavonamericas) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp, cp, hybrid&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;38&lt;/td&gt;&lt;td&gt;^[0-9a-zA-Z\\s]+$&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return street
  **/
  @ApiModelProperty(value = "Applicable for American Express Direct (amexdirect), TSYS (tsys) and Elavon Americas (elavonamericas) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>American Express Direct</td><td>cnp, cp, hybrid</td><td>Yes</td><td>1</td><td>38</td><td>^[0-9a-zA-Z\\s]+$</td></tr> </table> ")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public CardProcessingConfigCommonMerchantDescriptorInformation zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Applicable for Elavon Americas (elavonamericas), RUPAY, American Express Direct (amexdirect) and TSYS (tsys) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp, cp, hybrid&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;15&lt;/td&gt;&lt;td&gt;^[0-9a-zA-Z\\s]+$&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return zip
  **/
  @ApiModelProperty(value = "Applicable for Elavon Americas (elavonamericas), RUPAY, American Express Direct (amexdirect) and TSYS (tsys) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>American Express Direct</td><td>cnp, cp, hybrid</td><td>Yes</td><td>1</td><td>15</td><td>^[0-9a-zA-Z\\s]+$</td></tr> </table> ")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public CardProcessingConfigCommonMerchantDescriptorInformation url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Applicable for RUPAY and American Express Direct (amexdirect) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp, hybrid&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;40&lt;/td&gt;&lt;td&gt;URL&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cp&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;40&lt;/td&gt;&lt;td&gt;URL&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return url
  **/
  @ApiModelProperty(value = "Applicable for RUPAY and American Express Direct (amexdirect) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>American Express Direct</td><td>cnp, hybrid</td><td>Yes</td><td>1</td><td>40</td><td>URL</td></tr> <tr><td>American Express Direct</td><td>cp</td><td>No</td><td>1</td><td>40</td><td>URL</td></tr> </table> ")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CardProcessingConfigCommonMerchantDescriptorInformation countryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
    return this;
  }

   /**
   * Country Cf Origin of merchant is applicable for VPC Processors and is dependent on governmentControlled attribute.
   * @return countryOfOrigin
  **/
  @ApiModelProperty(value = "Country Cf Origin of merchant is applicable for VPC Processors and is dependent on governmentControlled attribute.")
  public String getCountryOfOrigin() {
    return countryOfOrigin;
  }

  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardProcessingConfigCommonMerchantDescriptorInformation cardProcessingConfigCommonMerchantDescriptorInformation = (CardProcessingConfigCommonMerchantDescriptorInformation) o;
    return Objects.equals(this.name, cardProcessingConfigCommonMerchantDescriptorInformation.name) &&
        Objects.equals(this.city, cardProcessingConfigCommonMerchantDescriptorInformation.city) &&
        Objects.equals(this.country, cardProcessingConfigCommonMerchantDescriptorInformation.country) &&
        Objects.equals(this.phone, cardProcessingConfigCommonMerchantDescriptorInformation.phone) &&
        Objects.equals(this.state, cardProcessingConfigCommonMerchantDescriptorInformation.state) &&
        Objects.equals(this.street, cardProcessingConfigCommonMerchantDescriptorInformation.street) &&
        Objects.equals(this.zip, cardProcessingConfigCommonMerchantDescriptorInformation.zip) &&
        Objects.equals(this.url, cardProcessingConfigCommonMerchantDescriptorInformation.url) &&
        Objects.equals(this.countryOfOrigin, cardProcessingConfigCommonMerchantDescriptorInformation.countryOfOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, city, country, phone, state, street, zip, url, countryOfOrigin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardProcessingConfigCommonMerchantDescriptorInformation {\n");
    
    if (name != null) sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (city != null) sb.append("    city: ").append(toIndentedString(city)).append("\n");
    if (country != null) sb.append("    country: ").append(toIndentedString(country)).append("\n");
    if (phone != null) sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    if (state != null) sb.append("    state: ").append(toIndentedString(state)).append("\n");
    if (street != null) sb.append("    street: ").append(toIndentedString(street)).append("\n");
    if (zip != null) sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    if (url != null) sb.append("    url: ").append(toIndentedString(url)).append("\n");
    if (countryOfOrigin != null) sb.append("    countryOfOrigin: ").append(toIndentedString(countryOfOrigin)).append("\n");
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

