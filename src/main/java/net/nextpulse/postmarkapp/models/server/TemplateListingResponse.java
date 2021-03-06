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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import net.nextpulse.postmarkapp.models.server.TemplateRecordResponse;

/**
 * TemplateListingResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class TemplateListingResponse {
  @JsonProperty("TotalCount")
  private BigDecimal totalCount = null;

  @JsonProperty("Templates API")
  private List<TemplateRecordResponse> templatesAPI = new ArrayList<TemplateRecordResponse>();

  public TemplateListingResponse totalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of Templates API associated with this server.
   * @return totalCount
  **/
  @ApiModelProperty(example = "null", value = "The total number of Templates API associated with this server.")
  public BigDecimal getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
  }

  public TemplateListingResponse templatesAPI(List<TemplateRecordResponse> templatesAPI) {
    this.templatesAPI = templatesAPI;
    return this;
  }

  public TemplateListingResponse addTemplatesAPIItem(TemplateRecordResponse templatesAPIItem) {
    this.templatesAPI.add(templatesAPIItem);
    return this;
  }

   /**
   * Basic information for each Template returned from the query.
   * @return templatesAPI
  **/
  @ApiModelProperty(example = "null", value = "Basic information for each Template returned from the query.")
  public List<TemplateRecordResponse> getTemplatesAPI() {
    return templatesAPI;
  }

  public void setTemplatesAPI(List<TemplateRecordResponse> templatesAPI) {
    this.templatesAPI = templatesAPI;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateListingResponse templateListingResponse = (TemplateListingResponse) o;
    return Objects.equals(this.totalCount, templateListingResponse.totalCount) &&
        Objects.equals(this.templatesAPI, templateListingResponse.templatesAPI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, templatesAPI);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateListingResponse {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    templatesAPI: ").append(toIndentedString(templatesAPI)).append("\n");
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

