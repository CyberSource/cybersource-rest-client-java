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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccessTokenResponse
 */

public class AccessTokenResponse {
    @SerializedName("access_token")
    private String accessToken = null;

    @SerializedName("token_type")
    private String tokenType = null;

    @SerializedName("expires_in")
    private Integer expiresIn = null;

    @SerializedName("scope")
    private String scope = null;

    @SerializedName("refresh_token")
    private String refreshToken = null;

    @SerializedName("refresh_token_expires_in")
    private Integer refreshTokenExpiresIn = null;

    @SerializedName("client_status")
    private String clientStatus = null;


    public AccessTokenResponse accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * @return accessToken
     **/
    @ApiModelProperty(value = "")
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public AccessTokenResponse tokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * @return tokenType
     **/
    @ApiModelProperty(value = "")
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public AccessTokenResponse scope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * @return scope
     **/
    @ApiModelProperty(value = "")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public AccessTokenResponse clientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
        return this;
    }

    /**
     * @return clientStatus
     **/
    @ApiModelProperty(value = "")
    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }

    public AccessTokenResponse refreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * @return refreshToken
     **/
    @ApiModelProperty(value = "")
    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public AccessTokenResponse expiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * @return expiresIn
     **/
    @ApiModelProperty(value = "")
    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public AccessTokenResponse refreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
        this.refreshTokenExpiresIn = refreshTokenExpiresIn;
        return this;
    }

    /**
     * @return refreshTokenExpiresIn
     **/
    @ApiModelProperty(value = "")
    public Integer getRefreshTokenExpiresIn() {
        return refreshTokenExpiresIn;
    }

    public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
        this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessTokenResponse accessTokenResponse = (AccessTokenResponse) o;
        return Objects.equals(this.clientStatus, accessTokenResponse.clientStatus) &&
                Objects.equals(this.accessToken, accessTokenResponse.accessToken) &&
                Objects.equals(this.refreshToken, accessTokenResponse.refreshToken) &&
                Objects.equals(this.expiresIn, accessTokenResponse.expiresIn) &&
                Objects.equals(this.refreshTokenExpiresIn, accessTokenResponse.refreshTokenExpiresIn) &&
                Objects.equals(this.scope, accessTokenResponse.scope) &&
                Objects.equals(this.tokenType, accessTokenResponse.tokenType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientStatus, accessToken, refreshToken, expiresIn, refreshTokenExpiresIn, scope, tokenType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessTokenResponse {\n");

        sb.append("    clientStatus: ").append(toIndentedString(clientStatus)).append("\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
        sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
        sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
