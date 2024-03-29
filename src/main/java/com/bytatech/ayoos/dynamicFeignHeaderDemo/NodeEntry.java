package com.bytatech.ayoos.dynamicFeignHeaderDemo;

import java.util.Objects;
//import com.bytatech.ayoos.client.custom_dms_core.model.Node;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;*/
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NodeEntry
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-04T15:51:38.542+05:30[Asia/Kolkata]")

public class NodeEntry   {
  @JsonProperty("entry")
  private Node entry = null;

  public NodeEntry entry(Node entry) {
    this.entry = entry;
    return this;
  }

  /**
   * Get entry
   * @return entry
  **/
  //@ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Node getEntry() {
    return entry;
  }

  public void setEntry(Node entry) {
    this.entry = entry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeEntry nodeEntry = (NodeEntry) o;
    return Objects.equals(this.entry, nodeEntry.entry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeEntry {\n");
    
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
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

