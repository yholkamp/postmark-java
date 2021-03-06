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

package net.nextpulse.postmarkapp.api.account;

import com.sun.jersey.api.client.GenericType;

import net.nextpulse.postmarkapp.api.ApiException;
import net.nextpulse.postmarkapp.api.ApiClient;
import net.nextpulse.postmarkapp.api.Configuration;
import net.nextpulse.postmarkapp.models.account.*;
import net.nextpulse.postmarkapp.api.Pair;

import net.nextpulse.postmarkapp.models.account.DomainCreationModel;
import net.nextpulse.postmarkapp.models.account.StandardPostmarkResponse;
import net.nextpulse.postmarkapp.models.account.DomainExtendedInformation;
import net.nextpulse.postmarkapp.models.account.DomainEditingModel;
import net.nextpulse.postmarkapp.models.account.DomainListingResults;
import net.nextpulse.postmarkapp.models.account.DomainSPFResult;
import net.nextpulse.postmarkapp.models.account.DKIMRotationResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:30.269+01:00")
public class DomainsAPIApi {
  private ApiClient apiClient;

  public DomainsAPIApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DomainsAPIApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Domain
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param body  (optional)
   * @return DomainExtendedInformation
   * @throws ApiException if fails to make API call
   */
  public DomainExtendedInformation createDomain(String xPostmarkAccountToken, DomainCreationModel body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling createDomain");
    }
    
    // create path and map variables
    String localVarPath = "/domains".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xPostmarkAccountToken != null)
      localVarHeaderParams.put("X-Postmark-Account-Token", apiClient.parameterToString(xPostmarkAccountToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DomainExtendedInformation> localVarReturnType = new GenericType<DomainExtendedInformation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a Domain
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param domainid The ID for the Domain that should be deleted by the request. (required)
   * @return StandardPostmarkResponse
   * @throws ApiException if fails to make API call
   */
  public StandardPostmarkResponse deleteDomain(String xPostmarkAccountToken, Integer domainid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling deleteDomain");
    }
    
    // verify the required parameter 'domainid' is set
    if (domainid == null) {
      throw new ApiException(400, "Missing the required parameter 'domainid' when calling deleteDomain");
    }
    
    // create path and map variables
    String localVarPath = "/domains/{domainid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domainid" + "\\}", apiClient.escapeString(domainid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xPostmarkAccountToken != null)
      localVarHeaderParams.put("X-Postmark-Account-Token", apiClient.parameterToString(xPostmarkAccountToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<StandardPostmarkResponse> localVarReturnType = new GenericType<StandardPostmarkResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a Domain
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param domainid The ID for the Domain that should be modified by the request. (required)
   * @param body  (optional)
   * @return DomainExtendedInformation
   * @throws ApiException if fails to make API call
   */
  public DomainExtendedInformation editDomain(String xPostmarkAccountToken, Integer domainid, DomainEditingModel body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling editDomain");
    }
    
    // verify the required parameter 'domainid' is set
    if (domainid == null) {
      throw new ApiException(400, "Missing the required parameter 'domainid' when calling editDomain");
    }
    
    // create path and map variables
    String localVarPath = "/domains/{domainid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domainid" + "\\}", apiClient.escapeString(domainid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xPostmarkAccountToken != null)
      localVarHeaderParams.put("X-Postmark-Account-Token", apiClient.parameterToString(xPostmarkAccountToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DomainExtendedInformation> localVarReturnType = new GenericType<DomainExtendedInformation>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a Domain
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param domainid The ID for the Domain that should be retrieved. (required)
   * @return DomainExtendedInformation
   * @throws ApiException if fails to make API call
   */
  public DomainExtendedInformation getDomain(String xPostmarkAccountToken, Integer domainid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling getDomain");
    }
    
    // verify the required parameter 'domainid' is set
    if (domainid == null) {
      throw new ApiException(400, "Missing the required parameter 'domainid' when calling getDomain");
    }
    
    // create path and map variables
    String localVarPath = "/domains/{domainid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domainid" + "\\}", apiClient.escapeString(domainid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xPostmarkAccountToken != null)
      localVarHeaderParams.put("X-Postmark-Account-Token", apiClient.parameterToString(xPostmarkAccountToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DomainExtendedInformation> localVarReturnType = new GenericType<DomainExtendedInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Domains
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param count Number of records to return per request. Max 500. (required)
   * @param offset Number of records to skip (required)
   * @return DomainListingResults
   * @throws ApiException if fails to make API call
   */
  public DomainListingResults listDomains(String xPostmarkAccountToken, Integer count, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling listDomains");
    }
    
    // verify the required parameter 'count' is set
    if (count == null) {
      throw new ApiException(400, "Missing the required parameter 'count' when calling listDomains");
    }
    
    // verify the required parameter 'offset' is set
    if (offset == null) {
      throw new ApiException(400, "Missing the required parameter 'offset' when calling listDomains");
    }
    
    // create path and map variables
    String localVarPath = "/domains".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    if (xPostmarkAccountToken != null)
      localVarHeaderParams.put("X-Postmark-Account-Token", apiClient.parameterToString(xPostmarkAccountToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DomainListingResults> localVarReturnType = new GenericType<DomainListingResults>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Request DNS Verification for SPF
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param domainid The ID for the Domain for which SPF DNS records should be verified. (required)
   * @return DomainSPFResult
   * @throws ApiException if fails to make API call
   */
  public DomainSPFResult requestSPFVerificationForDomain(String xPostmarkAccountToken, Integer domainid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling requestSPFVerificationForDomain");
    }
    
    // verify the required parameter 'domainid' is set
    if (domainid == null) {
      throw new ApiException(400, "Missing the required parameter 'domainid' when calling requestSPFVerificationForDomain");
    }
    
    // create path and map variables
    String localVarPath = "/domains/{domainid}/verifyspf".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domainid" + "\\}", apiClient.escapeString(domainid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xPostmarkAccountToken != null)
      localVarHeaderParams.put("X-Postmark-Account-Token", apiClient.parameterToString(xPostmarkAccountToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DomainSPFResult> localVarReturnType = new GenericType<DomainSPFResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Rotate DKIM Key
   * Creates a new DKIM key to replace your current key. Until the DNS entries are confirmed,  the new values will be in the &#x60;DKIMPendingHost&#x60; and &#x60;DKIMPendingTextValue&#x60; fields.  After the new DKIM value is verified in DNS, the pending values will migrate to  &#x60;DKIMTextValue&#x60; and &#x60;DKIMPendingTextValue&#x60; and Postmark will begin to sign emails  with the new DKIM key. 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param domainid The ID for the Sender Signature for which a new DKIM Key should be generated. (required)
   * @return DKIMRotationResponse
   * @throws ApiException if fails to make API call
   */
  public DKIMRotationResponse rotateDKIMKeyForDomain(String xPostmarkAccountToken, Integer domainid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling rotateDKIMKeyForDomain");
    }
    
    // verify the required parameter 'domainid' is set
    if (domainid == null) {
      throw new ApiException(400, "Missing the required parameter 'domainid' when calling rotateDKIMKeyForDomain");
    }
    
    // create path and map variables
    String localVarPath = "/domains/{domainid}/rotatedkim".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domainid" + "\\}", apiClient.escapeString(domainid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xPostmarkAccountToken != null)
      localVarHeaderParams.put("X-Postmark-Account-Token", apiClient.parameterToString(xPostmarkAccountToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DKIMRotationResponse> localVarReturnType = new GenericType<DKIMRotationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
