
package utilities.flex.models.transienttoken;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Jwk {

    @SerializedName("kty")
    @Expose
    private String kty;
    @SerializedName("e")
    @Expose
    private String e;
    @SerializedName("use")
    @Expose
    private String use;
    @SerializedName("n")
    @Expose
    private String n;
    @SerializedName("kid")
    @Expose
    private String kid;

    public String getKty() {
        return kty;
    }

    public void setKty(String kty) {
        this.kty = kty;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

}
