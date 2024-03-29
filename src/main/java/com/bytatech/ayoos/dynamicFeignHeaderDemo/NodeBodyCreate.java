package com.bytatech.ayoos.dynamicFeignHeaderDemo;

import java.util.Objects;
/*import com.bytatech.ayoos.client.dms_core.model.AssociationBody;
import com.bytatech.ayoos.client.dms_core.model.ChildAssociationBody;*/
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NodeBodyCreate
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-04T11:46:25.045+05:30[Asia/Kolkata]")

public class NodeBodyCreate   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nodeType")
  private String nodeType = null;

  @JsonProperty("aspectNames")
  @Valid
  private List<String> aspectNames = null;

  @JsonProperty("properties")
  @Valid
  private Map<String, String> properties = null;

  @JsonProperty("relativePath")
  private String relativePath = null;

  @JsonProperty("association")
  private Object association = null;

  @JsonProperty("secondaryChildren")
  @Valid
  private List<ChildAssociationBody> secondaryChildren = null;

  @JsonProperty("targets")
  @Valid
  private List<AssociationBody> targets = null;

  public NodeBodyCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |. The character . must not be used at the end of the name. 
   * @return name
  **/
  //@ApiModelProperty(required = true, value = "The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |. The character . must not be used at the end of the name. ")
  @NotNull

@Pattern(regexp="^(?!(.*[\\\"\\*\\\\\\>\\<\\?/\\:\\|]+.*)|(.*[\\.]?.*[\\.]+$)|(.*[ ]+$))") 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NodeBodyCreate nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

  /**
   * Get nodeType
   * @return nodeType
  **/
 // @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public NodeBodyCreate aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public NodeBodyCreate addAspectNamesItem(String aspectNamesItem) {
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

  public NodeBodyCreate properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public NodeBodyCreate putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
  **/
  //@ApiModelProperty(value = "")


  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public NodeBodyCreate relativePath(String relativePath) {
    this.relativePath = relativePath;
    return this;
  }

  /**
   * Get relativePath
   * @return relativePath
  **/
 // @ApiModelProperty(value = "")


  public String getRelativePath() {
    return relativePath;
  }

  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  public NodeBodyCreate association(Object association) {
    this.association = association;
    return this;
  }

  /**
   * Get association
   * @return association
  **/
 // @ApiModelProperty(value = "")


  public Object getAssociation() {
    return association;
  }

  public void setAssociation(Object association) {
    this.association = association;
  }

  public NodeBodyCreate secondaryChildren(List<ChildAssociationBody> secondaryChildren) {
    this.secondaryChildren = secondaryChildren;
    return this;
  }

  public NodeBodyCreate addSecondaryChildrenItem(ChildAssociationBody secondaryChildrenItem) {
    if (this.secondaryChildren == null) {
      this.secondaryChildren = new ArrayList<ChildAssociationBody>();
    }
    this.secondaryChildren.add(secondaryChildrenItem);
    return this;
  }

  /**
   * Get secondaryChildren
   * @return secondaryChildren
  **/
 // @ApiModelProperty(value = "")

  @Valid

  public List<ChildAssociationBody> getSecondaryChildren() {
    return secondaryChildren;
  }

  public void setSecondaryChildren(List<ChildAssociationBody> secondaryChildren) {
    this.secondaryChildren = secondaryChildren;
  }

  public NodeBodyCreate targets(List<AssociationBody> targets) {
    this.targets = targets;
    return this;
  }

  public NodeBodyCreate addTargetsItem(AssociationBody targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<AssociationBody>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Get targets
   * @return targets
  **/
//  @ApiModelProperty(value = "")

  @Valid

  public List<AssociationBody> getTargets() {
    return targets;
  }

  public void setTargets(List<AssociationBody> targets) {
    this.targets = targets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeBodyCreate nodeBodyCreate = (NodeBodyCreate) o;
    return Objects.equals(this.name, nodeBodyCreate.name) &&
        Objects.equals(this.nodeType, nodeBodyCreate.nodeType) &&
        Objects.equals(this.aspectNames, nodeBodyCreate.aspectNames) &&
        Objects.equals(this.properties, nodeBodyCreate.properties) &&
        Objects.equals(this.relativePath, nodeBodyCreate.relativePath) &&
        Objects.equals(this.association, nodeBodyCreate.association) &&
        Objects.equals(this.secondaryChildren, nodeBodyCreate.secondaryChildren) &&
        Objects.equals(this.targets, nodeBodyCreate.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nodeType, aspectNames, properties, relativePath, association, secondaryChildren, targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeBodyCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    aspectNames: ").append(toIndentedString(aspectNames)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
    sb.append("    secondaryChildren: ").append(toIndentedString(secondaryChildren)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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

