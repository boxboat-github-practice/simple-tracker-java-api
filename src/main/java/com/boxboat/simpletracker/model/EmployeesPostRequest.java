package com.boxboat.simpletracker.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EmployeesPostRequest
 */

@JsonTypeName("_employees_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-07T14:16:30.773327-08:00[America/Los_Angeles]")
public class EmployeesPostRequest {

  @JsonProperty("name")
  private String name;

  @JsonProperty("github")
  private String github;

  public EmployeesPostRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmployeesPostRequest github(String github) {
    this.github = github;
    return this;
  }

  /**
   * Get github
   * @return github
  */
  
  @Schema(name = "github", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getGithub() {
    return github;
  }

  public void setGithub(String github) {
    this.github = github;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeesPostRequest employeesPostRequest = (EmployeesPostRequest) o;
    return Objects.equals(this.name, employeesPostRequest.name) &&
        Objects.equals(this.github, employeesPostRequest.github);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, github);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeesPostRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    github: ").append(toIndentedString(github)).append("\n");
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

