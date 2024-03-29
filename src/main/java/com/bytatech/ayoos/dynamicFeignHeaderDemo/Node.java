package com.bytatech.ayoos.dynamicFeignHeaderDemo;

import java.util.Objects;
/*import com.bytatech.ayoos.client.custom_dms_core.model.ContentInfo;
import com.bytatech.ayoos.client.custom_dms_core.model.PathInfo;
import com.bytatech.ayoos.client.custom_dms_core.model.PermissionsInfo;
import com.bytatech.ayoos.client.custom_dms_core.model.UserInfo;*/
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;*/
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Node
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-04T15:51:38.542+05:30[Asia/Kolkata]")

public class Node   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nodeType")
  private String nodeType = null;

  @JsonProperty("isFolder")
  private Boolean isFolder = null;

  @JsonProperty("isFile")
  private Boolean isFile = null;

  @JsonProperty("isLocked")
  private Boolean isLocked = false;

  @JsonProperty("modifiedAt")
  private OffsetDateTime modifiedAt = null;

/*  @JsonProperty("modifiedByUser")
  private UserInfo modifiedByUser = null;
*/
  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  /*@JsonProperty("createdByUser")
  private UserInfo createdByUser = null;
*/
  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("isLink")
  private Boolean isLink = null;

  @JsonProperty("isFavorite")
  private Boolean isFavorite = null;

  /*@JsonProperty("content")
  private ContentInfo content = null;*/

  @JsonProperty("aspectNames")
  @Valid
  private List<String> aspectNames = null;

  @JsonProperty("properties")
  private Object properties = null;

  @JsonProperty("allowableOperations")
  @Valid
  private List<String> allowableOperations = null;

  /*@JsonProperty("path")
  private PathInfo path = null;

  @JsonProperty("permissions")
  private PermissionsInfo permissions = null;*/

  public Node id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
 // @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Node name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |. The character . must not be used at the end of the name. 
   * @return name
  **/
 // @ApiModelProperty(required = true, value = "The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |. The character . must not be used at the end of the name. ")
  @NotNull

@Pattern(regexp="^(?!(.*[\\\"\\*\\\\\\>\\<\\?/\\:\\|]+.*)|(.*[\\.]?.*[\\.]+$)|(.*[ ]+$))") 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Node nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

  /**
   * Get nodeType
   * @return nodeType
  **/
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public Node isFolder(Boolean isFolder) {
    this.isFolder = isFolder;
    return this;
  }

  /**
   * Get isFolder
   * @return isFolder
  **/
  //@ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsFolder() {
    return isFolder;
  }

  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }

  public Node isFile(Boolean isFile) {
    this.isFile = isFile;
    return this;
  }

  /**
   * Get isFile
   * @return isFile
  **/
//  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsFile() {
    return isFile;
  }

  public void setIsFile(Boolean isFile) {
    this.isFile = isFile;
  }

  public Node isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

  /**
   * Get isLocked
   * @return isLocked
  **/
  //@ApiModelProperty(value = "")


  public Boolean isIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public Node modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Get modifiedAt
   * @return modifiedAt
  **/
 // @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

 /* public Node modifiedByUser(UserInfo modifiedByUser) {
    this.modifiedByUser = modifiedByUser;
    return this;
  }*/

  /**
   * Get modifiedByUser
   * @return modifiedByUser
  **/
  //@ApiModelProperty(required = true, value = "")
/*  @NotNull

  @Valid

  public UserInfo getModifiedByUser() {
    return modifiedByUser;
  }

  public void setModifiedByUser(UserInfo modifiedByUser) {
    this.modifiedByUser = modifiedByUser;
  }
*/
  public Node createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
 // @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /*public Node createdByUser(UserInfo createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }*/

  /**
   * Get createdByUser
   * @return createdByUser
  **/
 // @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

 /* public UserInfo getCreatedByUser() {
    return createdByUser;
  }*/

  /*public void setCreatedByUser(UserInfo createdByUser) {
    this.createdByUser = createdByUser;
  }
*/
  public Node parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  **/
 // @ApiModelProperty(value = "")


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Node isLink(Boolean isLink) {
    this.isLink = isLink;
    return this;
  }

  /**
   * Get isLink
   * @return isLink
  **/
 // @ApiModelProperty(value = "")


  public Boolean isIsLink() {
    return isLink;
  }

  public void setIsLink(Boolean isLink) {
    this.isLink = isLink;
  }

  public Node isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

  /**
   * Get isFavorite
   * @return isFavorite
  **/
  //@ApiModelProperty(value = "")


  public Boolean isIsFavorite() {
    return isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }

/*  public Node content(ContentInfo content) {
    this.content = content;
    return this;
  }*/

  /**
   * Get content
   * @return content
  **/
 // @ApiModelProperty(value = "")

  @Valid

 /* public ContentInfo getContent() {
    return content;
  }

  public void setContent(ContentInfo content) {
    this.content = content;
  }*/

  public Node aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public Node addAspectNamesItem(String aspectNamesItem) {
    if (this.aspectNames == null) {
      this.aspectNames = new ArrayList<String>();
    }
    this.aspectNames.add(aspectNamesItem);
    return this;
  }

  /**
   * Get aspectNames
   * @return aspectNames
  **/
 // @ApiModelProperty(value = "")


  public List<String> getAspectNames() {
    return aspectNames;
  }

  public void setAspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
  }

  public Node properties(Object properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
  **/
 // @ApiModelProperty(value = "")


  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }

  public Node allowableOperations(List<String> allowableOperations) {
    this.allowableOperations = allowableOperations;
    return this;
  }

  public Node addAllowableOperationsItem(String allowableOperationsItem) {
    if (this.allowableOperations == null) {
      this.allowableOperations = new ArrayList<String>();
    }
    this.allowableOperations.add(allowableOperationsItem);
    return this;
  }

  /**
   * Get allowableOperations
   * @return allowableOperations
  **/
  //@ApiModelProperty(value = "")


  public List<String> getAllowableOperations() {
    return allowableOperations;
  }

  public void setAllowableOperations(List<String> allowableOperations) {
    this.allowableOperations = allowableOperations;
  }

 /* public Node path(PathInfo path) {
    this.path = path;
    return this;
  }

  *//**
   * Get path
   * @return path
  **//*
  @ApiModelProperty(value = "")
*/
  //@Valid

/*  public PathInfo getPath() {
    return path;
  }

  public void setPath(PathInfo path) {
    this.path = path;
  }

  public Node permissions(PermissionsInfo permissions) {
    this.permissions = permissions;
    return this;
  }*/

  /**
   * Get permissions
   * @return permissions
  **/
 /* @ApiModelProperty(value = "")

  @Valid

  public PermissionsInfo getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsInfo permissions) {
    this.permissions = permissions;
  }
*/

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.id, node.id) &&
        Objects.equals(this.name, node.name) &&
        Objects.equals(this.nodeType, node.nodeType) &&
        Objects.equals(this.isFolder, node.isFolder) &&
        Objects.equals(this.isFile, node.isFile) &&
        Objects.equals(this.isLocked, node.isLocked) &&
        Objects.equals(this.modifiedAt, node.modifiedAt) &&
       
        Objects.equals(this.parentId, node.parentId) &&
        Objects.equals(this.isLink, node.isLink) &&
        Objects.equals(this.isFavorite, node.isFavorite) &&
       
        Objects.equals(this.aspectNames, node.aspectNames) &&
        Objects.equals(this.properties, node.properties) &&
        Objects.equals(this.allowableOperations, node.allowableOperations) 
       ;
  }

  /*@Override
  public int hashCode() {
    return Objects.hash(id, name, nodeType, isFolder, isFile, isLocked, modifiedAt, modifiedByUser, createdAt, createdByUser, parentId, isLink, isFavorite, content, aspectNames, properties, allowableOperations, path, permissions);
  }*/

 
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

