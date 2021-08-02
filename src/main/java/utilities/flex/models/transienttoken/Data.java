
package utilities.flex.models.transienttoken;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Data {

    @SerializedName("targetOrigins")
    @Expose
    private List<String> targetOrigins = null;
    @SerializedName("mfOrigin")
    @Expose
    private String mfOrigin;

    public List<String> getTargetOrigins() {
        return targetOrigins;
    }

    public void setTargetOrigins(List<String> targetOrigins) {
        this.targetOrigins = targetOrigins;
    }

    public String getMfOrigin() {
        return mfOrigin;
    }

    public void setMfOrigin(String mfOrigin) {
        this.mfOrigin = mfOrigin;
    }

}
