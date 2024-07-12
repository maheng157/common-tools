/*
 * Subscriptions
 * You can use billing plans and subscriptions to create subscriptions that process recurring PayPal payments for physical or digital goods, or services. A plan includes pricing and billing cycle information that defines the amount and frequency of charge for a subscription. You can also define a fixed plan, such as a $5 basic plan or a volume- or graduated-based plan with pricing tiers based on the quantity purchased. For more information, see <a href=\"/docs/subscriptions/\">Subscriptions Overview</a>.
 *
 * The version of the OpenAPI document: 1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.*;
import org.openapitools.client.Pair;

import org.openapitools.client.model.Error500;
import org.openapitools.client.model.ErrorDefault;
import org.openapitools.client.model.Patch;
import org.openapitools.client.model.PlansGet404Response;
import org.openapitools.client.model.PlansList401Response;
import org.openapitools.client.model.PlansList403Response;
import org.openapitools.client.model.Subscription;
import org.openapitools.client.model.SubscriptionActivateRequest;
import org.openapitools.client.model.SubscriptionCancelRequest;
import org.openapitools.client.model.SubscriptionCaptureRequest;
import org.openapitools.client.model.SubscriptionRequestPost;
import org.openapitools.client.model.SubscriptionReviseRequest;
import org.openapitools.client.model.SubscriptionReviseResponse;
import org.openapitools.client.model.SubscriptionSuspendRequest;
import org.openapitools.client.model.SubscriptionsActivate400Response;
import org.openapitools.client.model.SubscriptionsActivate422Response;
import org.openapitools.client.model.SubscriptionsCancel400Response;
import org.openapitools.client.model.SubscriptionsCancel422Response;
import org.openapitools.client.model.SubscriptionsCapture400Response;
import org.openapitools.client.model.SubscriptionsCapture422Response;
import org.openapitools.client.model.SubscriptionsCreate400Response;
import org.openapitools.client.model.SubscriptionsCreate422Response;
import org.openapitools.client.model.SubscriptionsPatch400Response;
import org.openapitools.client.model.SubscriptionsPatch422Response;
import org.openapitools.client.model.SubscriptionsRevise400Response;
import org.openapitools.client.model.SubscriptionsRevise404Response;
import org.openapitools.client.model.SubscriptionsRevise422Response;
import org.openapitools.client.model.SubscriptionsSuspend400Response;
import org.openapitools.client.model.SubscriptionsSuspend422Response;
import org.openapitools.client.model.SubscriptionsTransactions400Response;
import org.openapitools.client.model.Transaction;
import org.openapitools.client.model.TransactionsList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-08T11:30:41.643502082Z[Atlantic/Reykjavik]")
public class SubscriptionsApi {


  private ApiClient apiClient;

  public SubscriptionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubscriptionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Activate subscription
   * Activates the subscription.
   * @param id The ID of the subscription. (required)
   * @param subscriptionActivateRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public void subscriptionsActivate(String id, SubscriptionActivateRequest subscriptionActivateRequest) throws ApiException {
    this.subscriptionsActivate(id, subscriptionActivateRequest, Collections.emptyMap());
  }


  /**
   * Activate subscription
   * Activates the subscription.
   * @param id The ID of the subscription. (required)
   * @param subscriptionActivateRequest  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void subscriptionsActivate(String id, SubscriptionActivateRequest subscriptionActivateRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = subscriptionActivateRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsActivate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/billing/subscriptions/{id}/activate"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null
    );
  }

  /**
   * Cancel subscription
   * Cancels the subscription.
   * @param id The ID of the subscription. (required)
   * @param subscriptionCancelRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public void subscriptionsCancel(String id, SubscriptionCancelRequest subscriptionCancelRequest) throws ApiException {
    this.subscriptionsCancel(id, subscriptionCancelRequest, Collections.emptyMap());
  }


  /**
   * Cancel subscription
   * Cancels the subscription.
   * @param id The ID of the subscription. (required)
   * @param subscriptionCancelRequest  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void subscriptionsCancel(String id, SubscriptionCancelRequest subscriptionCancelRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = subscriptionCancelRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsCancel");
    }
    
    // create path and map variables
    String localVarPath = "/v1/billing/subscriptions/{id}/cancel"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null
    );
  }

  /**
   * Capture authorized payment on subscription
   * Captures an authorized payment from the subscriber on the subscription.
   * @param id The ID of the subscription. (required)
   * @param payPalRequestId The server stores keys for 72 hours. (optional)
   * @param subscriptionCaptureRequest  (optional)
   * @return Transaction
   * @throws ApiException if fails to make API call
   */
  public Transaction subscriptionsCapture(String id, String payPalRequestId, SubscriptionCaptureRequest subscriptionCaptureRequest) throws ApiException {
    return this.subscriptionsCapture(id, payPalRequestId, subscriptionCaptureRequest, Collections.emptyMap());
  }


  /**
   * Capture authorized payment on subscription
   * Captures an authorized payment from the subscriber on the subscription.
   * @param id The ID of the subscription. (required)
   * @param payPalRequestId The server stores keys for 72 hours. (optional)
   * @param subscriptionCaptureRequest  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Transaction
   * @throws ApiException if fails to make API call
   */
  public Transaction subscriptionsCapture(String id, String payPalRequestId, SubscriptionCaptureRequest subscriptionCaptureRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = subscriptionCaptureRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsCapture");
    }
    
    // create path and map variables
    String localVarPath = "/v1/billing/subscriptions/{id}/capture"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (payPalRequestId != null)
      localVarHeaderParams.put("PayPal-Request-Id", apiClient.parameterToString(payPalRequestId));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    TypeReference<Transaction> localVarReturnType = new TypeReference<Transaction>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Create subscription
   * Creates a subscription.
   * @param prefer The preferred server response upon successful completion of the request. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return&#x3D;minimal&lt;/code&gt;. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return&#x3D;representation&lt;/code&gt;. The server returns a complete resource representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt; (optional, default to return&#x3D;minimal)
   * @param payPalRequestId The server stores keys for 72 hours. (optional)
   * @param subscriptionRequestPost  (optional)
   * @return Subscription
   * @throws ApiException if fails to make API call
   */
  public Subscription subscriptionsCreate(String prefer, String payPalRequestId, SubscriptionRequestPost subscriptionRequestPost) throws ApiException {
    return this.subscriptionsCreate(prefer, payPalRequestId, subscriptionRequestPost, Collections.emptyMap());
  }


  /**
   * Create subscription
   * Creates a subscription.
   * @param prefer The preferred server response upon successful completion of the request. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return&#x3D;minimal&lt;/code&gt;. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return&#x3D;representation&lt;/code&gt;. The server returns a complete resource representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt; (optional, default to return&#x3D;minimal)
   * @param payPalRequestId The server stores keys for 72 hours. (optional)
   * @param subscriptionRequestPost  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Subscription
   * @throws ApiException if fails to make API call
   */
  public Subscription subscriptionsCreate(String prefer, String payPalRequestId, SubscriptionRequestPost subscriptionRequestPost, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = subscriptionRequestPost;
    
    // create path and map variables
    String localVarPath = "/v1/billing/subscriptions";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (prefer != null)
      localVarHeaderParams.put("Prefer", apiClient.parameterToString(prefer));
if (payPalRequestId != null)
      localVarHeaderParams.put("PayPal-Request-Id", apiClient.parameterToString(payPalRequestId));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    TypeReference<Subscription> localVarReturnType = new TypeReference<Subscription>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Show subscription details
   * Shows details for a subscription, by ID.
   * @param id The ID of the subscription. (required)
   * @param fields List of fields that are to be returned in the response. Possible value for fields are last_failed_payment and plan. (optional)
   * @return Subscription
   * @throws ApiException if fails to make API call
   */
  public Subscription subscriptionsGet(String id, String fields) throws ApiException {
    return this.subscriptionsGet(id, fields, Collections.emptyMap());
  }


  /**
   * Show subscription details
   * Shows details for a subscription, by ID.
   * @param id The ID of the subscription. (required)
   * @param fields List of fields that are to be returned in the response. Possible value for fields are last_failed_payment and plan. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Subscription
   * @throws ApiException if fails to make API call
   */
  public Subscription subscriptionsGet(String id, String fields, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/billing/subscriptions/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    TypeReference<Subscription> localVarReturnType = new TypeReference<Subscription>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Update subscription
   * Updates a subscription which could be in &lt;code&gt;ACTIVE&lt;/code&gt; or &lt;code&gt;SUSPENDED&lt;/code&gt; status. You can override plan level default attributes by providing customised values for plan path in the patch request.&lt;br /&gt; &lt;ul&gt; &lt;li&gt;You cannot update attributes that have already completed (Example - trial cycles can’t be updated if completed).&lt;/li&gt; &lt;li&gt;Once overridden, changes to plan resource will not impact subscription.&lt;/li&gt; &lt;li&gt;Any price update will not impact billing cycles within next 10 days (Applicable only for subscriptions funded by PayPal account).&lt;/li&gt; &lt;/ul&gt; Following are the fields eligible for patch.&lt;table&gt;&lt;thead&gt;&lt;tr&gt;&lt;th&gt;Attribute or object&lt;/th&gt;&lt;th&gt;Operations&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt;&lt;tbody&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;billing_info.outstanding_balance&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;custom_id&lt;/code&gt;&lt;/td&gt;&lt;td&gt;add,replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.billing_cycles[@sequence&#x3D;&#x3D;n].&lt;br/&gt;pricing_scheme.fixed_price&lt;/code&gt;&lt;/td&gt;&lt;td&gt;add,replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.billing_cycles[@sequence&#x3D;&#x3D;n].&lt;br/&gt;pricing_scheme.tiers&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.billing_cycles[@sequence&#x3D;&#x3D;n].&lt;br/&gt;total_cycles&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.payment_preferences.&lt;br/&gt;auto_bill_outstanding&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.payment_preferences.&lt;br/&gt;payment_failure_threshold&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.taxes.inclusive&lt;/code&gt;&lt;/td&gt;&lt;td&gt;add,replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.taxes.percentage&lt;/code&gt;&lt;/td&gt;&lt;td&gt;add,replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;shipping_amount&lt;/code&gt;&lt;/td&gt;&lt;td&gt;add,replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;start_time&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;subscriber.shipping_address&lt;/code&gt;&lt;/td&gt;&lt;td&gt;add,replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;subscriber.payment_source (for subscriptions funded&lt;br/&gt;by card payments)&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;/tbody&gt;&lt;/table&gt;
   * @param id The ID of the subscription. (required)
   * @param patch  (optional
   * @throws ApiException if fails to make API call
   */
  public void subscriptionsPatch(String id, List<Patch> patch) throws ApiException {
    this.subscriptionsPatch(id, patch, Collections.emptyMap());
  }


  /**
   * Update subscription
   * Updates a subscription which could be in &lt;code&gt;ACTIVE&lt;/code&gt; or &lt;code&gt;SUSPENDED&lt;/code&gt; status. You can override plan level default attributes by providing customised values for plan path in the patch request.&lt;br /&gt; &lt;ul&gt; &lt;li&gt;You cannot update attributes that have already completed (Example - trial cycles can’t be updated if completed).&lt;/li&gt; &lt;li&gt;Once overridden, changes to plan resource will not impact subscription.&lt;/li&gt; &lt;li&gt;Any price update will not impact billing cycles within next 10 days (Applicable only for subscriptions funded by PayPal account).&lt;/li&gt; &lt;/ul&gt; Following are the fields eligible for patch.&lt;table&gt;&lt;thead&gt;&lt;tr&gt;&lt;th&gt;Attribute or object&lt;/th&gt;&lt;th&gt;Operations&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt;&lt;tbody&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;billing_info.outstanding_balance&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;custom_id&lt;/code&gt;&lt;/td&gt;&lt;td&gt;add,replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.billing_cycles[@sequence&#x3D;&#x3D;n].&lt;br/&gt;pricing_scheme.fixed_price&lt;/code&gt;&lt;/td&gt;&lt;td&gt;add,replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.billing_cycles[@sequence&#x3D;&#x3D;n].&lt;br/&gt;pricing_scheme.tiers&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.billing_cycles[@sequence&#x3D;&#x3D;n].&lt;br/&gt;total_cycles&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.payment_preferences.&lt;br/&gt;auto_bill_outstanding&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.payment_preferences.&lt;br/&gt;payment_failure_threshold&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.taxes.inclusive&lt;/code&gt;&lt;/td&gt;&lt;td&gt;add,replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;plan.taxes.percentage&lt;/code&gt;&lt;/td&gt;&lt;td&gt;add,replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;shipping_amount&lt;/code&gt;&lt;/td&gt;&lt;td&gt;add,replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;start_time&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;subscriber.shipping_address&lt;/code&gt;&lt;/td&gt;&lt;td&gt;add,replace&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;subscriber.payment_source (for subscriptions funded&lt;br/&gt;by card payments)&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;/tr&gt;&lt;/tbody&gt;&lt;/table&gt;
   * @param id The ID of the subscription. (required)
   * @param patch  (optional
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void subscriptionsPatch(String id, List<Patch> patch, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = patch;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsPatch");
    }
    
    // create path and map variables
    String localVarPath = "/v1/billing/subscriptions/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    apiClient.invokeAPI(
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null
    );
  }

  /**
   * Revise plan or quantity of subscription
   * Updates the quantity of the product or service in a subscription. You can also use this method to switch the plan and update the &#x60;shipping_amount&#x60;, &#x60;shipping_address&#x60; values for the subscription. This type of update requires the buyer&#39;s consent.
   * @param id The ID of the subscription. (required)
   * @param subscriptionReviseRequest  (optional)
   * @return SubscriptionReviseResponse
   * @throws ApiException if fails to make API call
   */
  public SubscriptionReviseResponse subscriptionsRevise(String id, SubscriptionReviseRequest subscriptionReviseRequest) throws ApiException {
    return this.subscriptionsRevise(id, subscriptionReviseRequest, Collections.emptyMap());
  }


  /**
   * Revise plan or quantity of subscription
   * Updates the quantity of the product or service in a subscription. You can also use this method to switch the plan and update the &#x60;shipping_amount&#x60;, &#x60;shipping_address&#x60; values for the subscription. This type of update requires the buyer&#39;s consent.
   * @param id The ID of the subscription. (required)
   * @param subscriptionReviseRequest  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SubscriptionReviseResponse
   * @throws ApiException if fails to make API call
   */
  public SubscriptionReviseResponse subscriptionsRevise(String id, SubscriptionReviseRequest subscriptionReviseRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = subscriptionReviseRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsRevise");
    }
    
    // create path and map variables
    String localVarPath = "/v1/billing/subscriptions/{id}/revise"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    TypeReference<SubscriptionReviseResponse> localVarReturnType = new TypeReference<SubscriptionReviseResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Suspend subscription
   * Suspends the subscription.
   * @param id The ID of the subscription. (required)
   * @param subscriptionSuspendRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public void subscriptionsSuspend(String id, SubscriptionSuspendRequest subscriptionSuspendRequest) throws ApiException {
    this.subscriptionsSuspend(id, subscriptionSuspendRequest, Collections.emptyMap());
  }


  /**
   * Suspend subscription
   * Suspends the subscription.
   * @param id The ID of the subscription. (required)
   * @param subscriptionSuspendRequest  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void subscriptionsSuspend(String id, SubscriptionSuspendRequest subscriptionSuspendRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = subscriptionSuspendRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsSuspend");
    }
    
    // create path and map variables
    String localVarPath = "/v1/billing/subscriptions/{id}/suspend"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null
    );
  }

  /**
   * List transactions for subscription
   * Lists transactions for a subscription.
   * @param id The ID of the subscription. (required)
   * @param startTime The start time of the range of transactions to list. (required)
   * @param endTime The end time of the range of transactions to list. (required)
   * @return TransactionsList
   * @throws ApiException if fails to make API call
   */
  public TransactionsList subscriptionsTransactions(String id, String startTime, String endTime) throws ApiException {
    return this.subscriptionsTransactions(id, startTime, endTime, Collections.emptyMap());
  }


  /**
   * List transactions for subscription
   * Lists transactions for a subscription.
   * @param id The ID of the subscription. (required)
   * @param startTime The start time of the range of transactions to list. (required)
   * @param endTime The end time of the range of transactions to list. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return TransactionsList
   * @throws ApiException if fails to make API call
   */
  public TransactionsList subscriptionsTransactions(String id, String startTime, String endTime, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsTransactions");
    }
    
    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      throw new ApiException(400, "Missing the required parameter 'startTime' when calling subscriptionsTransactions");
    }
    
    // verify the required parameter 'endTime' is set
    if (endTime == null) {
      throw new ApiException(400, "Missing the required parameter 'endTime' when calling subscriptionsTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/v1/billing/subscriptions/{id}/transactions"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("start_time", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    TypeReference<TransactionsList> localVarReturnType = new TypeReference<TransactionsList>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

}