package com.boxboat.simpletracker.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contract data for update or creation
 */

@Schema(name = "contractPatch", description = "Contract data for update or creation")
@JsonTypeName("contractPatch")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-07T14:16:30.773327-08:00[America/Los_Angeles]")
public class ContractPatch {

  @JsonProperty("clientId")
  private Integer clientId;

  @JsonProperty("type")
  private String type;

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("endDate")
  private String endDate;

  @JsonProperty("tech")
  @Valid
  private List<String> tech = null;

  public ContractPatch clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
  */
  
  @Schema(name = "clientId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public ContractPatch type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ContractPatch startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ContractPatch endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ContractPatch tech(List<String> tech) {
    this.tech = tech;
    return this;
  }

  public ContractPatch addTechItem(String techItem) {
    if (this.tech == null) {
      this.tech = new ArrayList<>();
    }
    this.tech.add(techItem);
    return this;
  }

  /**
   * Get tech
   * @return tech
  */
  
  @Schema(name = "tech", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<String> getTech() {
    return tech;
  }

  public void setTech(List<String> tech) {
    this.tech = tech;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractPatch contractPatch = (ContractPatch) o;
    return Objects.equals(this.clientId, contractPatch.clientId) &&
        Objects.equals(this.type, contractPatch.type) &&
        Objects.equals(this.startDate, contractPatch.startDate) &&
        Objects.equals(this.endDate, contractPatch.endDate) &&
        Objects.equals(this.tech, contractPatch.tech);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, type, startDate, endDate, tech);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractPatch {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    tech: ").append(toIndentedString(tech)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

