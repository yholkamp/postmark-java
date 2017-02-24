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

import net.nextpulse.postmarkapp.models.account.SenderSignatureExtendedInformation;
import net.nextpulse.postmarkapp.models.account.StandardPostmarkResponse;
import net.nextpulse.postmarkapp.models.account.SenderSignatureCreationModel;
import net.nextpulse.postmarkapp.models.account.SenderSignatureEditingModel;
import net.nextpulse.postmarkapp.models.account.SenderListingResults;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:30.269+01:00")
public class SenderSignaturesAPIApi {
  private ApiClient apiClient;

  public SenderSignaturesAPIApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SenderSignaturesAPIApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Sender Signature
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param body  (optional)
   * @return SenderSignatureExtendedInformation
   * @throws ApiException if fails to make API call
   */
  public SenderSignatureExtendedInformation createSenderSignature(String xPostmarkAccountToken, SenderSignatureCreationModel body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling createSenderSignature");
    }
    
    // create path and map variables
    String localVarPath = "/senders".replaceAll("\\{format\\}","json");

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

    GenericType<SenderSignatureExtendedInformation> localVarReturnType = new GenericType<SenderSignatureExtendedInformation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a Sender Signature
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param signatureid The ID for the Sender Signature that should be deleted by the request. (required)
   * @return StandardPostmarkResponse
   * @throws ApiException if fails to make API call
   */
  public StandardPostmarkResponse deleteSenderSignature(String xPostmarkAccountToken, Integer signatureid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling deleteSenderSignature");
    }
    
    // verify the required parameter 'signatureid' is set
    if (signatureid == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureid' when calling deleteSenderSignature");
    }
    
    // create path and map variables
    String localVarPath = "/senders/{signatureid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "signatureid" + "\\}", apiClient.escapeString(signatureid.toString()));

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
   * Update a Sender Signature
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param signatureid The ID for the Sender Signature that should be modified by the request. (required)
   * @param body  (optional)
   * @return SenderSignatureExtendedInformation
   * @throws ApiException if fails to make API call
   */
  public SenderSignatureExtendedInformation editSenderSignature(String xPostmarkAccountToken, Integer signatureid, SenderSignatureEditingModel body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling editSenderSignature");
    }
    
    // verify the required parameter 'signatureid' is set
    if (signatureid == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureid' when calling editSenderSignature");
    }
    
    // create path and map variables
    String localVarPath = "/senders/{signatureid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "signatureid" + "\\}", apiClient.escapeString(signatureid.toString()));

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

    GenericType<SenderSignatureExtendedInformation> localVarReturnType = new GenericType<SenderSignatureExtendedInformation>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a Sender Signature
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param signatureid The ID for the Sender Signature that should be retrieved. (required)
   * @return SenderSignatureExtendedInformation
   * @throws ApiException if fails to make API call
   */
  public SenderSignatureExtendedInformation getSenderSignature(String xPostmarkAccountToken, Integer signatureid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling getSenderSignature");
    }
    
    // verify the required parameter 'signatureid' is set
    if (signatureid == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureid' when calling getSenderSignature");
    }
    
    // create path and map variables
    String localVarPath = "/senders/{signatureid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "signatureid" + "\\}", apiClient.escapeString(signatureid.toString()));

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

    GenericType<SenderSignatureExtendedInformation> localVarReturnType = new GenericType<SenderSignatureExtendedInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List Sender Signatures
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param count Number of records to return per request. Max 500. (required)
   * @param offset Number of records to skip (required)
   * @return SenderListingResults
   * @throws ApiException if fails to make API call
   */
  public SenderListingResults listSenderSignatures(String xPostmarkAccountToken, Integer count, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling listSenderSignatures");
    }
    
    // verify the required parameter 'count' is set
    if (count == null) {
      throw new ApiException(400, "Missing the required parameter 'count' when calling listSenderSignatures");
    }
    
    // verify the required parameter 'offset' is set
    if (offset == null) {
      throw new ApiException(400, "Missing the required parameter 'offset' when calling listSenderSignatures");
    }
    
    // create path and map variables
    String localVarPath = "/senders".replaceAll("\\{format\\}","json");

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

    GenericType<SenderListingResults> localVarReturnType = new GenericType<SenderListingResults>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Request a new DKIM Key
   * Requests a new DKIM key to be created. Until the DNS entries are confirmed,  the new values will be in the &#x60;DKIMPendingHost&#x60; and &#x60;DKIMPendingTextValue&#x60; fields.  After the new DKIM value is verified in DNS, the pending values will migrate to  &#x60;DKIMTextValue&#x60; and &#x60;DKIMPendingTextValue&#x60; and Postmark will begin to sign emails  with the new DKIM key. 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param signatureid The ID for the Sender Signature for which a new DKIM Key should be generated. (required)
   * @return StandardPostmarkResponse
   * @throws ApiException if fails to make API call
   */
  public StandardPostmarkResponse requestNewDKIMKeyForSenderSignature(String xPostmarkAccountToken, Integer signatureid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling requestNewDKIMKeyForSenderSignature");
    }
    
    // verify the required parameter 'signatureid' is set
    if (signatureid == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureid' when calling requestNewDKIMKeyForSenderSignature");
    }
    
    // create path and map variables
    String localVarPath = "/senders/{signatureid}/requestnewdkim".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "signatureid" + "\\}", apiClient.escapeString(signatureid.toString()));

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Request DNS Verification for SPF
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param signatureid The ID for the Sender Signature for which SPF DNS records should be verified. (required)
   * @return SenderSignatureExtendedInformation
   * @throws ApiException if fails to make API call
   */
  public SenderSignatureExtendedInformation requestSPFVerificationForSenderSignature(String xPostmarkAccountToken, Integer signatureid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling requestSPFVerificationForSenderSignature");
    }
    
    // verify the required parameter 'signatureid' is set
    if (signatureid == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureid' when calling requestSPFVerificationForSenderSignature");
    }
    
    // create path and map variables
    String localVarPath = "/senders/{signatureid}/verifyspf".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "signatureid" + "\\}", apiClient.escapeString(signatureid.toString()));

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

    GenericType<SenderSignatureExtendedInformation> localVarReturnType = new GenericType<SenderSignatureExtendedInformation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Resend Signature Confirmation Email
   * 
   * @param xPostmarkAccountToken The token associated with the Account on which this request will operate. (required)
   * @param signatureid The ID for the Sender Signature that should have its confirmation email resent. (required)
   * @return StandardPostmarkResponse
   * @throws ApiException if fails to make API call
   */
  public StandardPostmarkResponse resendSenderSignatureConfirmationEmail(String xPostmarkAccountToken, Integer signatureid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkAccountToken' is set
    if (xPostmarkAccountToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkAccountToken' when calling resendSenderSignatureConfirmationEmail");
    }
    
    // verify the required parameter 'signatureid' is set
    if (signatureid == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureid' when calling resendSenderSignatureConfirmationEmail");
    }
    
    // create path and map variables
    String localVarPath = "/senders/{signatureid}/resend".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "signatureid" + "\\}", apiClient.escapeString(signatureid.toString()));

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}