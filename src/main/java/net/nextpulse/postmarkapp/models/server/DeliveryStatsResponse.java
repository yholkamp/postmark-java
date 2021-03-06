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
import net.nextpulse.postmarkapp.models.server.BounceCountElement;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class DeliveryStatsResponse {
  @JsonProperty("InactiveMails")
  private Integer inactiveMails = null;

  @JsonProperty("Bounces")
  private List<BounceCountElement> bounces = new ArrayList<BounceCountElement>();

  public DeliveryStatsResponse inactiveMails(Integer inactiveMails) {
    this.inactiveMails = inactiveMails;
    return this;
  }

   /**
   * Get inactiveMails
   * @return inactiveMails
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getInactiveMails() {
    return inactiveMails;
  }

  public void setInactiveMails(Integer inactiveMails) {
    this.inactiveMails = inactiveMails;
  }

  public DeliveryStatsResponse bounces(List<BounceCountElement> bounces) {
    this.bounces = bounces;
    return this;
  }

  public DeliveryStatsResponse addBouncesItem(BounceCountElement bouncesItem) {
    this.bounces.add(bouncesItem);
    return this;
  }

   /**
   * Get bounces
   * @return bounces
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BounceCountElement> getBounces() {
    return bounces;
  }

  public void setBounces(List<BounceCountElement> bounces) {
    this.bounces = bounces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryStatsResponse deliveryStatsResponse = (DeliveryStatsResponse) o;
    return Objects.equals(this.inactiveMails, deliveryStatsResponse.inactiveMails) &&
        Objects.equals(this.bounces, deliveryStatsResponse.bounces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inactiveMails, bounces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryStatsResponse {\n");
    
    sb.append("    inactiveMails: ").append(toIndentedString(inactiveMails)).append("\n");
    sb.append("    bounces: ").append(toIndentedString(bounces)).append("\n");
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

