
package utilities.flex.models.transienttoken;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Flx {

    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("jwk")
    @Expose
    private Jwk jwk;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Jwk getJwk() {
        return jwk;
    }

    public void setJwk(Jwk jwk) {
        this.jwk = jwk;
    }

}
