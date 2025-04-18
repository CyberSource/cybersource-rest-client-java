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
 * SearchRequest
 */

public class SearchRequest {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("roleId")
  private String roleId = null;

  @SerializedName("permissionId")
  private String permissionId = null;

  public SearchRequest organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * This is the orgId of the organization which the user belongs to.
   * @return organizationId
  **/
  @ApiModelProperty(example = "merchantId", value = "This is the orgId of the organization which the user belongs to.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public SearchRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * User ID of the user you want to get details on.
   * @return userName
  **/
  @ApiModelProperty(example = "userName", value = "User ID of the user you want to get details on.")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public SearchRequest roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * role of the user you are trying to search on.
   * @return roleId
  **/
  @ApiModelProperty(example = "custom", value = "role of the user you are trying to search on.")
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public SearchRequest permissionId(String permissionId) {
    this.permissionId = permissionId;
    return this;
  }

   /**
   * permission that you are trying to search user on.
   * @return permissionId
  **/
  @ApiModelProperty(example = "CustomerProfileViewPermission", value = "permission that you are trying to search user on.")
  public String getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(String permissionId) {
    this.permissionId = permissionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequest searchRequest = (SearchRequest) o;
    return Objects.equals(this.organizationId, searchRequest.organizationId) &&
        Objects.equals(this.userName, searchRequest.userName) &&
        Objects.equals(this.roleId, searchRequest.roleId) &&
        Objects.equals(this.permissionId, searchRequest.permissionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, userName, roleId, permissionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequest {\n");
    
    if (organizationId != null) sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    if (userName != null) sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    if (roleId != null) sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    if (permissionId != null) sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
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

