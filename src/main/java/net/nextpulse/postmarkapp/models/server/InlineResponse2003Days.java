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

/**
 * InlineResponse2003Days
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class InlineResponse2003Days {
  @JsonProperty("Date")
  private String date = null;

  @JsonProperty("Desktop")
  private Integer desktop = null;

  @JsonProperty("WebMail")
  private Integer webMail = null;

  @JsonProperty("Mobile")
  private Integer mobile = null;

  @JsonProperty("Unknown")
  private Integer unknown = null;

  public InlineResponse2003Days date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public InlineResponse2003Days desktop(Integer desktop) {
    this.desktop = desktop;
    return this;
  }

   /**
   * Get desktop
   * @return desktop
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDesktop() {
    return desktop;
  }

  public void setDesktop(Integer desktop) {
    this.desktop = desktop;
  }

  public InlineResponse2003Days webMail(Integer webMail) {
    this.webMail = webMail;
    return this;
  }

   /**
   * Get webMail
   * @return webMail
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getWebMail() {
    return webMail;
  }

  public void setWebMail(Integer webMail) {
    this.webMail = webMail;
  }

  public InlineResponse2003Days mobile(Integer mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMobile() {
    return mobile;
  }

  public void setMobile(Integer mobile) {
    this.mobile = mobile;
  }

  public InlineResponse2003Days unknown(Integer unknown) {
    this.unknown = unknown;
    return this;
  }

   /**
   * Get unknown
   * @return unknown
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getUnknown() {
    return unknown;
  }

  public void setUnknown(Integer unknown) {
    this.unknown = unknown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003Days inlineResponse2003Days = (InlineResponse2003Days) o;
    return Objects.equals(this.date, inlineResponse2003Days.date) &&
        Objects.equals(this.desktop, inlineResponse2003Days.desktop) &&
        Objects.equals(this.webMail, inlineResponse2003Days.webMail) &&
        Objects.equals(this.mobile, inlineResponse2003Days.mobile) &&
        Objects.equals(this.unknown, inlineResponse2003Days.unknown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, desktop, webMail, mobile, unknown);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Days {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
    sb.append("    webMail: ").append(toIndentedString(webMail)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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

