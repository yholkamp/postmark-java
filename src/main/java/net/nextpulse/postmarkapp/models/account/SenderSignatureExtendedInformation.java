/*
 * Postmark Account-level API
 * Postmark makes sending and receiving email  incredibly easy. The Account-level API allows users to configure all Servers, Domains, and Sender Signatures associated  with an Account. 
 *
 * OpenAPI spec version: 0.9.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.nextpulse.postmarkapp.models.account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:30.269+01:00")
public class SenderSignatureExtendedInformation {
  @JsonProperty("Domain")
  private String domain = null;

  @JsonProperty("EmailAddress")
  private String emailAddress = null;

  @JsonProperty("ReplyToEmailAddress")
  private String replyToEmailAddress = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Confirmed")
  private Boolean confirmed = null;

  @JsonProperty("SPFVerified")
  private Boolean sPFVerified = null;

  @JsonProperty("SPFHost")
  private String sPFHost = null;

  @JsonProperty("SPFTextValue")
  private String sPFTextValue = null;

  @JsonProperty("DKIMVerified")
  private Boolean dKIMVerified = null;

  @JsonProperty("WeakDKIM")
  private Boolean weakDKIM = null;

  @JsonProperty("DKIMHost")
  private String dKIMHost = null;

  @JsonProperty("DKIMTestValue")
  private String dKIMTestValue = null;

  @JsonProperty("DKIMPendingHost")
  private String dKIMPendingHost = null;

  @JsonProperty("DKIMPendingTextValue")
  private String dKIMPendingTextValue = null;

  @JsonProperty("DKIMRevokedHost")
  private String dKIMRevokedHost = null;

  @JsonProperty("DKIMRevokedTextValue")
  private String dKIMRevokedTextValue = null;

  @JsonProperty("SafeToRemoveRevokedKeyFromDNS")
  private Boolean safeToRemoveRevokedKeyFromDNS = null;

  @JsonProperty("DKIMUpdateStatus")
  private String dKIMUpdateStatus = null;

  @JsonProperty("ReturnPathDomain")
  private String returnPathDomain = null;

  @JsonProperty("ReturnPathDomainVerified")
  private Boolean returnPathDomainVerified = null;

  @JsonProperty("ReturnPathDomainCNAMEValue")
  private String returnPathDomainCNAMEValue = null;

  @JsonProperty("ID")
  private Long ID = null;

  public SenderSignatureExtendedInformation domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public SenderSignatureExtendedInformation emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public SenderSignatureExtendedInformation replyToEmailAddress(String replyToEmailAddress) {
    this.replyToEmailAddress = replyToEmailAddress;
    return this;
  }

   /**
   * Get replyToEmailAddress
   * @return replyToEmailAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReplyToEmailAddress() {
    return replyToEmailAddress;
  }

  public void setReplyToEmailAddress(String replyToEmailAddress) {
    this.replyToEmailAddress = replyToEmailAddress;
  }

  public SenderSignatureExtendedInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SenderSignatureExtendedInformation confirmed(Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }

  public SenderSignatureExtendedInformation sPFVerified(Boolean sPFVerified) {
    this.sPFVerified = sPFVerified;
    return this;
  }

   /**
   * Get sPFVerified
   * @return sPFVerified
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSPFVerified() {
    return sPFVerified;
  }

  public void setSPFVerified(Boolean sPFVerified) {
    this.sPFVerified = sPFVerified;
  }

  public SenderSignatureExtendedInformation sPFHost(String sPFHost) {
    this.sPFHost = sPFHost;
    return this;
  }

   /**
   * Get sPFHost
   * @return sPFHost
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSPFHost() {
    return sPFHost;
  }

  public void setSPFHost(String sPFHost) {
    this.sPFHost = sPFHost;
  }

  public SenderSignatureExtendedInformation sPFTextValue(String sPFTextValue) {
    this.sPFTextValue = sPFTextValue;
    return this;
  }

   /**
   * Get sPFTextValue
   * @return sPFTextValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSPFTextValue() {
    return sPFTextValue;
  }

  public void setSPFTextValue(String sPFTextValue) {
    this.sPFTextValue = sPFTextValue;
  }

  public SenderSignatureExtendedInformation dKIMVerified(Boolean dKIMVerified) {
    this.dKIMVerified = dKIMVerified;
    return this;
  }

   /**
   * Get dKIMVerified
   * @return dKIMVerified
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDKIMVerified() {
    return dKIMVerified;
  }

  public void setDKIMVerified(Boolean dKIMVerified) {
    this.dKIMVerified = dKIMVerified;
  }

  public SenderSignatureExtendedInformation weakDKIM(Boolean weakDKIM) {
    this.weakDKIM = weakDKIM;
    return this;
  }

   /**
   * Get weakDKIM
   * @return weakDKIM
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getWeakDKIM() {
    return weakDKIM;
  }

  public void setWeakDKIM(Boolean weakDKIM) {
    this.weakDKIM = weakDKIM;
  }

  public SenderSignatureExtendedInformation dKIMHost(String dKIMHost) {
    this.dKIMHost = dKIMHost;
    return this;
  }

   /**
   * Get dKIMHost
   * @return dKIMHost
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDKIMHost() {
    return dKIMHost;
  }

  public void setDKIMHost(String dKIMHost) {
    this.dKIMHost = dKIMHost;
  }

  public SenderSignatureExtendedInformation dKIMTestValue(String dKIMTestValue) {
    this.dKIMTestValue = dKIMTestValue;
    return this;
  }

   /**
   * Get dKIMTestValue
   * @return dKIMTestValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDKIMTestValue() {
    return dKIMTestValue;
  }

  public void setDKIMTestValue(String dKIMTestValue) {
    this.dKIMTestValue = dKIMTestValue;
  }

  public SenderSignatureExtendedInformation dKIMPendingHost(String dKIMPendingHost) {
    this.dKIMPendingHost = dKIMPendingHost;
    return this;
  }

   /**
   * Get dKIMPendingHost
   * @return dKIMPendingHost
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDKIMPendingHost() {
    return dKIMPendingHost;
  }

  public void setDKIMPendingHost(String dKIMPendingHost) {
    this.dKIMPendingHost = dKIMPendingHost;
  }

  public SenderSignatureExtendedInformation dKIMPendingTextValue(String dKIMPendingTextValue) {
    this.dKIMPendingTextValue = dKIMPendingTextValue;
    return this;
  }

   /**
   * Get dKIMPendingTextValue
   * @return dKIMPendingTextValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDKIMPendingTextValue() {
    return dKIMPendingTextValue;
  }

  public void setDKIMPendingTextValue(String dKIMPendingTextValue) {
    this.dKIMPendingTextValue = dKIMPendingTextValue;
  }

  public SenderSignatureExtendedInformation dKIMRevokedHost(String dKIMRevokedHost) {
    this.dKIMRevokedHost = dKIMRevokedHost;
    return this;
  }

   /**
   * Get dKIMRevokedHost
   * @return dKIMRevokedHost
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDKIMRevokedHost() {
    return dKIMRevokedHost;
  }

  public void setDKIMRevokedHost(String dKIMRevokedHost) {
    this.dKIMRevokedHost = dKIMRevokedHost;
  }

  public SenderSignatureExtendedInformation dKIMRevokedTextValue(String dKIMRevokedTextValue) {
    this.dKIMRevokedTextValue = dKIMRevokedTextValue;
    return this;
  }

   /**
   * Get dKIMRevokedTextValue
   * @return dKIMRevokedTextValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDKIMRevokedTextValue() {
    return dKIMRevokedTextValue;
  }

  public void setDKIMRevokedTextValue(String dKIMRevokedTextValue) {
    this.dKIMRevokedTextValue = dKIMRevokedTextValue;
  }

  public SenderSignatureExtendedInformation safeToRemoveRevokedKeyFromDNS(Boolean safeToRemoveRevokedKeyFromDNS) {
    this.safeToRemoveRevokedKeyFromDNS = safeToRemoveRevokedKeyFromDNS;
    return this;
  }

   /**
   * Get safeToRemoveRevokedKeyFromDNS
   * @return safeToRemoveRevokedKeyFromDNS
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSafeToRemoveRevokedKeyFromDNS() {
    return safeToRemoveRevokedKeyFromDNS;
  }

  public void setSafeToRemoveRevokedKeyFromDNS(Boolean safeToRemoveRevokedKeyFromDNS) {
    this.safeToRemoveRevokedKeyFromDNS = safeToRemoveRevokedKeyFromDNS;
  }

  public SenderSignatureExtendedInformation dKIMUpdateStatus(String dKIMUpdateStatus) {
    this.dKIMUpdateStatus = dKIMUpdateStatus;
    return this;
  }

   /**
   * Get dKIMUpdateStatus
   * @return dKIMUpdateStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDKIMUpdateStatus() {
    return dKIMUpdateStatus;
  }

  public void setDKIMUpdateStatus(String dKIMUpdateStatus) {
    this.dKIMUpdateStatus = dKIMUpdateStatus;
  }

  public SenderSignatureExtendedInformation returnPathDomain(String returnPathDomain) {
    this.returnPathDomain = returnPathDomain;
    return this;
  }

   /**
   * Get returnPathDomain
   * @return returnPathDomain
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReturnPathDomain() {
    return returnPathDomain;
  }

  public void setReturnPathDomain(String returnPathDomain) {
    this.returnPathDomain = returnPathDomain;
  }

  public SenderSignatureExtendedInformation returnPathDomainVerified(Boolean returnPathDomainVerified) {
    this.returnPathDomainVerified = returnPathDomainVerified;
    return this;
  }

   /**
   * Get returnPathDomainVerified
   * @return returnPathDomainVerified
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getReturnPathDomainVerified() {
    return returnPathDomainVerified;
  }

  public void setReturnPathDomainVerified(Boolean returnPathDomainVerified) {
    this.returnPathDomainVerified = returnPathDomainVerified;
  }

  public SenderSignatureExtendedInformation returnPathDomainCNAMEValue(String returnPathDomainCNAMEValue) {
    this.returnPathDomainCNAMEValue = returnPathDomainCNAMEValue;
    return this;
  }

   /**
   * Get returnPathDomainCNAMEValue
   * @return returnPathDomainCNAMEValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReturnPathDomainCNAMEValue() {
    return returnPathDomainCNAMEValue;
  }

  public void setReturnPathDomainCNAMEValue(String returnPathDomainCNAMEValue) {
    this.returnPathDomainCNAMEValue = returnPathDomainCNAMEValue;
  }

  public SenderSignatureExtendedInformation ID(Long ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getID() {
    return ID;
  }

  public void setID(Long ID) {
    this.ID = ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenderSignatureExtendedInformation senderSignatureExtendedInformation = (SenderSignatureExtendedInformation) o;
    return Objects.equals(this.domain, senderSignatureExtendedInformation.domain) &&
        Objects.equals(this.emailAddress, senderSignatureExtendedInformation.emailAddress) &&
        Objects.equals(this.replyToEmailAddress, senderSignatureExtendedInformation.replyToEmailAddress) &&
        Objects.equals(this.name, senderSignatureExtendedInformation.name) &&
        Objects.equals(this.confirmed, senderSignatureExtendedInformation.confirmed) &&
        Objects.equals(this.sPFVerified, senderSignatureExtendedInformation.sPFVerified) &&
        Objects.equals(this.sPFHost, senderSignatureExtendedInformation.sPFHost) &&
        Objects.equals(this.sPFTextValue, senderSignatureExtendedInformation.sPFTextValue) &&
        Objects.equals(this.dKIMVerified, senderSignatureExtendedInformation.dKIMVerified) &&
        Objects.equals(this.weakDKIM, senderSignatureExtendedInformation.weakDKIM) &&
        Objects.equals(this.dKIMHost, senderSignatureExtendedInformation.dKIMHost) &&
        Objects.equals(this.dKIMTestValue, senderSignatureExtendedInformation.dKIMTestValue) &&
        Objects.equals(this.dKIMPendingHost, senderSignatureExtendedInformation.dKIMPendingHost) &&
        Objects.equals(this.dKIMPendingTextValue, senderSignatureExtendedInformation.dKIMPendingTextValue) &&
        Objects.equals(this.dKIMRevokedHost, senderSignatureExtendedInformation.dKIMRevokedHost) &&
        Objects.equals(this.dKIMRevokedTextValue, senderSignatureExtendedInformation.dKIMRevokedTextValue) &&
        Objects.equals(this.safeToRemoveRevokedKeyFromDNS, senderSignatureExtendedInformation.safeToRemoveRevokedKeyFromDNS) &&
        Objects.equals(this.dKIMUpdateStatus, senderSignatureExtendedInformation.dKIMUpdateStatus) &&
        Objects.equals(this.returnPathDomain, senderSignatureExtendedInformation.returnPathDomain) &&
        Objects.equals(this.returnPathDomainVerified, senderSignatureExtendedInformation.returnPathDomainVerified) &&
        Objects.equals(this.returnPathDomainCNAMEValue, senderSignatureExtendedInformation.returnPathDomainCNAMEValue) &&
        Objects.equals(this.ID, senderSignatureExtendedInformation.ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, emailAddress, replyToEmailAddress, name, confirmed, sPFVerified, sPFHost, sPFTextValue, dKIMVerified, weakDKIM, dKIMHost, dKIMTestValue, dKIMPendingHost, dKIMPendingTextValue, dKIMRevokedHost, dKIMRevokedTextValue, safeToRemoveRevokedKeyFromDNS, dKIMUpdateStatus, returnPathDomain, returnPathDomainVerified, returnPathDomainCNAMEValue, ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderSignatureExtendedInformation {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    replyToEmailAddress: ").append(toIndentedString(replyToEmailAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    sPFVerified: ").append(toIndentedString(sPFVerified)).append("\n");
    sb.append("    sPFHost: ").append(toIndentedString(sPFHost)).append("\n");
    sb.append("    sPFTextValue: ").append(toIndentedString(sPFTextValue)).append("\n");
    sb.append("    dKIMVerified: ").append(toIndentedString(dKIMVerified)).append("\n");
    sb.append("    weakDKIM: ").append(toIndentedString(weakDKIM)).append("\n");
    sb.append("    dKIMHost: ").append(toIndentedString(dKIMHost)).append("\n");
    sb.append("    dKIMTestValue: ").append(toIndentedString(dKIMTestValue)).append("\n");
    sb.append("    dKIMPendingHost: ").append(toIndentedString(dKIMPendingHost)).append("\n");
    sb.append("    dKIMPendingTextValue: ").append(toIndentedString(dKIMPendingTextValue)).append("\n");
    sb.append("    dKIMRevokedHost: ").append(toIndentedString(dKIMRevokedHost)).append("\n");
    sb.append("    dKIMRevokedTextValue: ").append(toIndentedString(dKIMRevokedTextValue)).append("\n");
    sb.append("    safeToRemoveRevokedKeyFromDNS: ").append(toIndentedString(safeToRemoveRevokedKeyFromDNS)).append("\n");
    sb.append("    dKIMUpdateStatus: ").append(toIndentedString(dKIMUpdateStatus)).append("\n");
    sb.append("    returnPathDomain: ").append(toIndentedString(returnPathDomain)).append("\n");
    sb.append("    returnPathDomainVerified: ").append(toIndentedString(returnPathDomainVerified)).append("\n");
    sb.append("    returnPathDomainCNAMEValue: ").append(toIndentedString(returnPathDomainCNAMEValue)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
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

