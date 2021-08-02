
package utilities.flex.models.transienttoken;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class JwtResponseModel {

    @SerializedName("flx")
    @Expose
    private Flx flx;
    @SerializedName("ctx")
    @Expose
    private List<Ctx> ctx = null;
    @SerializedName("iss")
    @Expose
    private String iss;
    @SerializedName("exp")
    @Expose
    private Integer exp;
    @SerializedName("iat")
    @Expose
    private Integer iat;
    @SerializedName("jti")
    @Expose
    private String jti;

    public Flx getFlx() {
        return flx;
    }

    public void setFlx(Flx flx) {
        this.flx = flx;
    }

    public List<Ctx> getCtx() {
        return ctx;
    }

    public void setCtx(List<Ctx> ctx) {
        this.ctx = ctx;
    }

    public String getIss() {
        return iss;
    }

    public void setIss(String iss) {
        this.iss = iss;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getIat() {
        return iat;
    }

    public void setIat(Integer iat) {
        this.iat = iat;
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }

}
