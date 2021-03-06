/*
 * Postmark API
 * Postmark makes sending and receiving email incredibly easy. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.nextpulse.postmarkapp.models.server;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.nextpulse.postmarkapp.models.server.InlineResponse2001Days;

/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class InlineResponse2001 {
  @JsonProperty("Opens")
  private Integer opens = null;

  @JsonProperty("Unique")
  private Integer unique = null;

  @JsonProperty("Days")
  private List<InlineResponse2001Days> days = new ArrayList<InlineResponse2001Days>();

  public InlineResponse2001 opens(Integer opens) {
    this.opens = opens;
    return this;
  }

   /**
   * Get opens
   * @return opens
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOpens() {
    return opens;
  }

  public void setOpens(Integer opens) {
    this.opens = opens;
  }

  public InlineResponse2001 unique(Integer unique) {
    this.unique = unique;
    return this;
  }

   /**
   * Get unique
   * @return unique
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getUnique() {
    return unique;
  }

  public void setUnique(Integer unique) {
    this.unique = unique;
  }

  public InlineResponse2001 days(List<InlineResponse2001Days> days) {
    this.days = days;
    return this;
  }

  public InlineResponse2001 addDaysItem(InlineResponse2001Days daysItem) {
    this.days.add(daysItem);
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2001Days> getDays() {
    return days;
  }

  public void setDays(List<InlineResponse2001Days> days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.opens, inlineResponse2001.opens) &&
        Objects.equals(this.unique, inlineResponse2001.unique) &&
        Objects.equals(this.days, inlineResponse2001.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opens, unique, days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    unique: ").append(toIndentedString(unique)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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

