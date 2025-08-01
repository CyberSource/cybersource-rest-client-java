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
 * TmsBinLookupPaymentAccountInformationCardBrands
 */

public class TmsBinLookupPaymentAccountInformationCardBrands {
  @SerializedName("type")
  private String type = null;

  @SerializedName("brandName")
  private String brandName = null;

  public TmsBinLookupPaymentAccountInformationCardBrands type(String type) {
    this.type = type;
    return this;
  }

   /**
   * This field contains a 3-digit numeric value that indicates the card type within Cybersource eco-system. Possible values from BIN Lookup Service (based on availability and enablement): - &#x60;000&#x60;: Unsupported Card Type - &#x60;001&#x60;: Visa - &#x60;002&#x60;: Mastercard - &#x60;003&#x60;: American Express - &#x60;004&#x60;: Discover - &#x60;005&#x60;: Diners Club - &#x60;007&#x60;: JCB - &#x60;036&#x60;: Cartes Bancaire - &#x60;042&#x60;: Maestro - &#x60;054&#x60;: Elo - &#x60;058&#x60;: Carnet - &#x60;060&#x60;: MADA - &#x60;061&#x60;: RuPay - &#x60;062&#x60;: China UnionPay - &#x60;064&#x60;: Prompt Card - &#x60;067&#x60;: Meeza - &#x60;068&#x60;: PayPak - &#x60;070&#x60;: EFTPOS - &#x60;081&#x60;: Jaywan - &#x60;082&#x60;: TPN  Glossary of possible values in the payments ecosystem: - &#x60;001&#x60;: Visa - &#x60;002&#x60;: Mastercard - &#x60;003&#x60;: American Express - &#x60;004&#x60;: Discover - &#x60;005&#x60;: Diners Club - &#x60;006&#x60;: Carte Blanche - &#x60;007&#x60;: JCB - &#x60;008&#x60;: Optima - &#x60;009&#x60;: GE Private Label - &#x60;010&#x60;: Beneficial Private Label - &#x60;011&#x60;: Twinpay Credit Card - &#x60;012&#x60;: Twinpay Debit Card - &#x60;013&#x60;: Walmart - &#x60;014&#x60;: EnRoute - &#x60;015&#x60;: Lowe&#39;s Consumer - &#x60;016&#x60;: Home Depot Consumer - &#x60;017&#x60;: MBNA - &#x60;018&#x60;: Dick&#39;s Sportwear - &#x60;019&#x60;: Casual Corner - &#x60;020&#x60;: Sears - &#x60;021&#x60;: JAL - &#x60;023&#x60;: Disney Card - &#x60;024&#x60;: Switch/Solo - &#x60;025&#x60;: Sam&#39;s Club Consumer - &#x60;026&#x60;: Sam&#39;s Club Business - &#x60;027&#x60;: Nico&#39;s - &#x60;028&#x60;: Paymentech Bill Me Later - &#x60;029&#x60;: Bebe - &#x60;030&#x60;: Restoration Hardware - &#x60;031&#x60;: Delta Online - &#x60;032&#x60;: Solo - &#x60;033&#x60;: Visa Electron - &#x60;034&#x60;: Dankort - &#x60;035&#x60;: Laser - &#x60;036&#x60;: Cartes Bancaire - &#x60;037&#x60;: Carta Si - &#x60;040&#x60;: UATP - &#x60;041&#x60;: HOUSEHOLD - &#x60;042&#x60;: Maestro - &#x60;043&#x60;: GE MONEY - &#x60;044&#x60;: Korean Cards - &#x60;045&#x60;: Style Cards - &#x60;046&#x60;: J.Crew - &#x60;047&#x60;: Payeasecn eWallet - &#x60;048&#x60;: Payeasecn Bank Transfer - &#x60;049&#x60;: Meijer - &#x60;050&#x60;: Hipercard - &#x60;051&#x60;: Aura - &#x60;052&#x60;: Redecard - &#x60;053&#x60;: Orico Card - &#x60;054&#x60;: Elo - &#x60;055&#x60;: Capital One Private Label - &#x60;057&#x60;: Costco Private Label - &#x60;058&#x60;: Carnet - &#x60;059&#x60;: ValueLink - &#x60;060&#x60;: MADA - &#x60;061&#x60;: RuPay - &#x60;062&#x60;: China UnionPay - &#x60;063&#x60;: Falabella Private Label - &#x60;064&#x60;: Prompt Card - &#x60;065&#x60;: Korean Domestic - &#x60;066&#x60;: Banricompras - &#x60;067&#x60;: Meeza - &#x60;068&#x60;: PayPak - &#x60;070&#x60;: EFTPOS - &#x60;071&#x60;: Codensa - &#x60;072&#x60;: Olimpica - &#x60;073&#x60;: Colsubsidio - &#x60;074&#x60;: Tuya - &#x60;075&#x60;: Sodexo - &#x60;076&#x60;: Naranja - &#x60;077&#x60;: Cabal - &#x60;078&#x60;: DINELCO - &#x60;079&#x60;: PANAL - &#x60;080&#x60;: EPM - &#x60;081&#x60;: Jaywan - &#x60;082&#x60;: TPN 
   * @return type
  **/
  @ApiModelProperty(value = "This field contains a 3-digit numeric value that indicates the card type within Cybersource eco-system. Possible values from BIN Lookup Service (based on availability and enablement): - `000`: Unsupported Card Type - `001`: Visa - `002`: Mastercard - `003`: American Express - `004`: Discover - `005`: Diners Club - `007`: JCB - `036`: Cartes Bancaire - `042`: Maestro - `054`: Elo - `058`: Carnet - `060`: MADA - `061`: RuPay - `062`: China UnionPay - `064`: Prompt Card - `067`: Meeza - `068`: PayPak - `070`: EFTPOS - `081`: Jaywan - `082`: TPN  Glossary of possible values in the payments ecosystem: - `001`: Visa - `002`: Mastercard - `003`: American Express - `004`: Discover - `005`: Diners Club - `006`: Carte Blanche - `007`: JCB - `008`: Optima - `009`: GE Private Label - `010`: Beneficial Private Label - `011`: Twinpay Credit Card - `012`: Twinpay Debit Card - `013`: Walmart - `014`: EnRoute - `015`: Lowe's Consumer - `016`: Home Depot Consumer - `017`: MBNA - `018`: Dick's Sportwear - `019`: Casual Corner - `020`: Sears - `021`: JAL - `023`: Disney Card - `024`: Switch/Solo - `025`: Sam's Club Consumer - `026`: Sam's Club Business - `027`: Nico's - `028`: Paymentech Bill Me Later - `029`: Bebe - `030`: Restoration Hardware - `031`: Delta Online - `032`: Solo - `033`: Visa Electron - `034`: Dankort - `035`: Laser - `036`: Cartes Bancaire - `037`: Carta Si - `040`: UATP - `041`: HOUSEHOLD - `042`: Maestro - `043`: GE MONEY - `044`: Korean Cards - `045`: Style Cards - `046`: J.Crew - `047`: Payeasecn eWallet - `048`: Payeasecn Bank Transfer - `049`: Meijer - `050`: Hipercard - `051`: Aura - `052`: Redecard - `053`: Orico Card - `054`: Elo - `055`: Capital One Private Label - `057`: Costco Private Label - `058`: Carnet - `059`: ValueLink - `060`: MADA - `061`: RuPay - `062`: China UnionPay - `063`: Falabella Private Label - `064`: Prompt Card - `065`: Korean Domestic - `066`: Banricompras - `067`: Meeza - `068`: PayPak - `070`: EFTPOS - `071`: Codensa - `072`: Olimpica - `073`: Colsubsidio - `074`: Tuya - `075`: Sodexo - `076`: Naranja - `077`: Cabal - `078`: DINELCO - `079`: PANAL - `080`: EPM - `081`: Jaywan - `082`: TPN ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TmsBinLookupPaymentAccountInformationCardBrands brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

   /**
   * This field contains the card brand name.   Some of the possible values (not an exhaustive list) are -    - VISA   - MASTERCARD   - AMERICAN EXPRESS   - DISCOVER   - DINERS CLUB   - CARTE BLANCHE   - JCB   - OPTIMA   - TWINPAY CREDIT CARD   - TWINPAY DEBIT CARD   - WALMART   - ENROUTE   - LOWES CONSUMER   - HOME DEPOT CONSUMER   - MBNA   - DICKS SPORTWEAR   - CASUAL CORNER   - SEARS   - JAL   - DISNEY CARD   - SWITCH/SOLO   - SAMS CLUB CONSUMER   - SAMS CLUB BUSINESS   - NICOS HOUSE CARD   - BEBE   - RESTORATION HARDWARE   - DELTA ONLINE   - SOLO   - VISA ELECTRON   - DANKORT   - LASER   - CARTE BANCAIRE   - CARTA SI   - ENCODED ACCOUNT   - UATP   - HOUSEHOLD   - MAESTRO   - GE CAPITAL   - KOREAN CARDS   - STYLE CARDS   - JCREW   - MEIJER   - HIPERCARD   - AURA   - REDECARD   - ORICO HOUSE CARD   - MADA   - ELO   - CAPITAL ONE PRIVATE LABEL   - CARNET   - RUPAY   - CHINA UNION PAY   - FALABELLA PRIVATE LABEL   - PROMPTCARD   - KOREAN DOMESTIC   - BANRICOMPRAS   - MEEZA   - PAYPAK   - JAYWAN   - TPN 
   * @return brandName
  **/
  @ApiModelProperty(value = "This field contains the card brand name.   Some of the possible values (not an exhaustive list) are -    - VISA   - MASTERCARD   - AMERICAN EXPRESS   - DISCOVER   - DINERS CLUB   - CARTE BLANCHE   - JCB   - OPTIMA   - TWINPAY CREDIT CARD   - TWINPAY DEBIT CARD   - WALMART   - ENROUTE   - LOWES CONSUMER   - HOME DEPOT CONSUMER   - MBNA   - DICKS SPORTWEAR   - CASUAL CORNER   - SEARS   - JAL   - DISNEY CARD   - SWITCH/SOLO   - SAMS CLUB CONSUMER   - SAMS CLUB BUSINESS   - NICOS HOUSE CARD   - BEBE   - RESTORATION HARDWARE   - DELTA ONLINE   - SOLO   - VISA ELECTRON   - DANKORT   - LASER   - CARTE BANCAIRE   - CARTA SI   - ENCODED ACCOUNT   - UATP   - HOUSEHOLD   - MAESTRO   - GE CAPITAL   - KOREAN CARDS   - STYLE CARDS   - JCREW   - MEIJER   - HIPERCARD   - AURA   - REDECARD   - ORICO HOUSE CARD   - MADA   - ELO   - CAPITAL ONE PRIVATE LABEL   - CARNET   - RUPAY   - CHINA UNION PAY   - FALABELLA PRIVATE LABEL   - PROMPTCARD   - KOREAN DOMESTIC   - BANRICOMPRAS   - MEEZA   - PAYPAK   - JAYWAN   - TPN ")
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsBinLookupPaymentAccountInformationCardBrands tmsBinLookupPaymentAccountInformationCardBrands = (TmsBinLookupPaymentAccountInformationCardBrands) o;
    return Objects.equals(this.type, tmsBinLookupPaymentAccountInformationCardBrands.type) &&
        Objects.equals(this.brandName, tmsBinLookupPaymentAccountInformationCardBrands.brandName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, brandName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsBinLookupPaymentAccountInformationCardBrands {\n");
    
    if (type != null) sb.append("    type: ").append(toIndentedString(type)).append("\n");
    if (brandName != null) sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
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

