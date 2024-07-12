/*
 * Payments
 * <blockquote><strong>Deprecation notice:</strong> The <code>/v1/payments</code> endpoint is deprecated. Use the <code>/v2/payments</code> endpoint instead. For details, see <a href=\"/docs/checkout/integrate/\">PayPal Checkout Basic Integration</a>.</blockquote>Use the Payments REST API to easily and securely accept online and mobile payments. The payments name space contains resource collections for payments, sales, refunds, authorizations, captures, and orders.<blockquote><strong>Important:</strong> The use of the PayPal REST <code>/payments</code> APIs to accept credit card payments is restricted. Instead, you can accept credit card payments with <a href=\"https://www.braintreepayments.com/products/braintree-direct\">Braintree Direct</a>.</blockquote>You can enable customers to make PayPal and credit card payments with only a few clicks, depending on the country. You can accept an immediate payment or authorize a payment and capture it later. You can show details for completed payments, refunds, and authorizations. You can make full or partial refunds. You also can void or re-authorize authorizations. For more information, see the <a href=\"/docs/integration/direct/payments/\">Payments overview</a>.
 *
 * The version of the OpenAPI document: 1.12
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

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Patch;
import org.openapitools.client.model.Payment;
import org.openapitools.client.model.PaymentExecution;
import org.openapitools.client.model.PaymentHistory;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-11T03:56:12.691299337Z[Atlantic/Reykjavik]")
public class PaymentApi {


  private ApiClient apiClient;

  public PaymentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create payment
   * &lt;blockquote&gt;&lt;strong&gt;Deprecation notice:&lt;/strong&gt; The &lt;code&gt;/v1/payments&lt;/code&gt; endpoint is deprecated. Use the &lt;code&gt;/v2/payments&lt;/code&gt; endpoint instead. For details, see &lt;a href&#x3D;\&quot;/docs/checkout/integrate/\&quot;&gt;PayPal Checkout Basic Integration&lt;/a&gt;.&lt;/blockquote&gt;Creates a sale, an authorized payment to be captured later, or an order. To create a sale, authorization, or order, include the payment details in the JSON request body. Set the &lt;code&gt;intent&lt;/code&gt; to &lt;code&gt;sale&lt;/code&gt;, &lt;code&gt;authorize&lt;/code&gt;, or &lt;code&gt;order&lt;/code&gt;. &lt;blockquote&gt;&lt;strong&gt;Note: &lt;/strong&gt;TPP Clients (Third Party Providers in the context of PSD2 regulation) are restricted from using &lt;code&gt;authorize&lt;/code&gt; and &lt;code&gt;order&lt;/code&gt; intents.&lt;/blockquote&gt; Include payer, transaction details, and, for PayPal payments only, redirect URLs. The combination of the &lt;code&gt;payment_method&lt;/code&gt; and &lt;code&gt;funding_instrument&lt;/code&gt; determines the type of payment that is created. For more information, see &lt;a href&#x3D;\&quot;/docs/integration/direct/payments/\&quot;&gt;Payments REST API&lt;/a&gt;.
   * @param payPalPartnerAttributionId  (optional)
   * @param payment  (optional)
   * @return Payment
   * @throws ApiException if fails to make API call
   */
  public Payment paymentCreate(String payPalPartnerAttributionId, Payment payment) throws ApiException {
    return this.paymentCreate(payPalPartnerAttributionId, payment, Collections.emptyMap());
  }


  /**
   * Create payment
   * &lt;blockquote&gt;&lt;strong&gt;Deprecation notice:&lt;/strong&gt; The &lt;code&gt;/v1/payments&lt;/code&gt; endpoint is deprecated. Use the &lt;code&gt;/v2/payments&lt;/code&gt; endpoint instead. For details, see &lt;a href&#x3D;\&quot;/docs/checkout/integrate/\&quot;&gt;PayPal Checkout Basic Integration&lt;/a&gt;.&lt;/blockquote&gt;Creates a sale, an authorized payment to be captured later, or an order. To create a sale, authorization, or order, include the payment details in the JSON request body. Set the &lt;code&gt;intent&lt;/code&gt; to &lt;code&gt;sale&lt;/code&gt;, &lt;code&gt;authorize&lt;/code&gt;, or &lt;code&gt;order&lt;/code&gt;. &lt;blockquote&gt;&lt;strong&gt;Note: &lt;/strong&gt;TPP Clients (Third Party Providers in the context of PSD2 regulation) are restricted from using &lt;code&gt;authorize&lt;/code&gt; and &lt;code&gt;order&lt;/code&gt; intents.&lt;/blockquote&gt; Include payer, transaction details, and, for PayPal payments only, redirect URLs. The combination of the &lt;code&gt;payment_method&lt;/code&gt; and &lt;code&gt;funding_instrument&lt;/code&gt; determines the type of payment that is created. For more information, see &lt;a href&#x3D;\&quot;/docs/integration/direct/payments/\&quot;&gt;Payments REST API&lt;/a&gt;.
   * @param payPalPartnerAttributionId  (optional)
   * @param payment  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Payment
   * @throws ApiException if fails to make API call
   */
  public Payment paymentCreate(String payPalPartnerAttributionId, Payment payment, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = payment;
    
    // create path and map variables
    String localVarPath = "/v1/payments/payment";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (payPalPartnerAttributionId != null)
      localVarHeaderParams.put("PayPal-Partner-Attribution-Id", apiClient.parameterToString(payPalPartnerAttributionId));

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

    TypeReference<Payment> localVarReturnType = new TypeReference<Payment>() {};
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
   * Execute approved PayPal payment
   * &lt;blockquote&gt;&lt;strong&gt;Deprecation notice:&lt;/strong&gt; The &lt;code&gt;/v1/payments&lt;/code&gt; endpoint is deprecated. Use the &lt;code&gt;/v2/payments&lt;/code&gt; endpoint instead. For details, see &lt;a href&#x3D;\&quot;/docs/checkout/integrate/\&quot;&gt;PayPal Checkout Basic Integration&lt;/a&gt;.&lt;/blockquote&gt;Executes a PayPal payment that the customer has approved. You can optionally update one or more transactions when you execute the payment.&lt;blockquote&gt;&lt;strong&gt;Important:&lt;/strong&gt; This call works only after a customer has approved the payment. For more information, learn about &lt;a href&#x3D;\&quot;/docs/integration/direct/payments/paypal-payments/\&quot;&gt;PayPal payments&lt;/a&gt;.&lt;/blockquote&gt;
   * @param paymentId The ID of the payment to execute. (required)
   * @param payPalRequestId The server stores keys for 30 days. (optional)
   * @param payPalPartnerAttributionId  (optional)
   * @param paymentExecution  (optional)
   * @return Payment
   * @throws ApiException if fails to make API call
   */
  public Payment paymentExecute(String paymentId, String payPalRequestId, String payPalPartnerAttributionId, PaymentExecution paymentExecution) throws ApiException {
    return this.paymentExecute(paymentId, payPalRequestId, payPalPartnerAttributionId, paymentExecution, Collections.emptyMap());
  }


  /**
   * Execute approved PayPal payment
   * &lt;blockquote&gt;&lt;strong&gt;Deprecation notice:&lt;/strong&gt; The &lt;code&gt;/v1/payments&lt;/code&gt; endpoint is deprecated. Use the &lt;code&gt;/v2/payments&lt;/code&gt; endpoint instead. For details, see &lt;a href&#x3D;\&quot;/docs/checkout/integrate/\&quot;&gt;PayPal Checkout Basic Integration&lt;/a&gt;.&lt;/blockquote&gt;Executes a PayPal payment that the customer has approved. You can optionally update one or more transactions when you execute the payment.&lt;blockquote&gt;&lt;strong&gt;Important:&lt;/strong&gt; This call works only after a customer has approved the payment. For more information, learn about &lt;a href&#x3D;\&quot;/docs/integration/direct/payments/paypal-payments/\&quot;&gt;PayPal payments&lt;/a&gt;.&lt;/blockquote&gt;
   * @param paymentId The ID of the payment to execute. (required)
   * @param payPalRequestId The server stores keys for 30 days. (optional)
   * @param payPalPartnerAttributionId  (optional)
   * @param paymentExecution  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return Payment
   * @throws ApiException if fails to make API call
   */
  public Payment paymentExecute(String paymentId, String payPalRequestId, String payPalPartnerAttributionId, PaymentExecution paymentExecution, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentExecution;
    
    // verify the required parameter 'paymentId' is set
    if (paymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentId' when calling paymentExecute");
    }
    
    // create path and map variables
    String localVarPath = "/v1/payments/payment/{payment_id}/execute"
      .replaceAll("\\{" + "payment_id" + "\\}", apiClient.escapeString(paymentId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (payPalRequestId != null)
      localVarHeaderParams.put("PayPal-Request-Id", apiClient.parameterToString(payPalRequestId));
if (payPalPartnerAttributionId != null)
      localVarHeaderParams.put("PayPal-Partner-Attribution-Id", apiClient.parameterToString(payPalPartnerAttributionId));

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

    TypeReference<Payment> localVarReturnType = new TypeReference<Payment>() {};
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
   * Show payment details
   * &lt;blockquote&gt;&lt;strong&gt;Deprecation notice:&lt;/strong&gt; The &lt;code&gt;/v1/payments&lt;/code&gt; endpoint is deprecated. Use the &lt;code&gt;/v2/payments&lt;/code&gt; endpoint instead. For details, see &lt;a href&#x3D;\&quot;/docs/checkout/integrate/\&quot;&gt;PayPal Checkout Basic Integration&lt;/a&gt;.&lt;/blockquote&gt;Shows details for a payment, by ID, that has yet to complete. For example, shows details for a payment that was created, approved, or failed.
   * @param paymentId The ID of the payment to execute. (required)
   * @return Payment
   * @throws ApiException if fails to make API call
   */
  public Payment paymentGet(String paymentId) throws ApiException {
    return this.paymentGet(paymentId, Collections.emptyMap());
  }


  /**
   * Show payment details
   * &lt;blockquote&gt;&lt;strong&gt;Deprecation notice:&lt;/strong&gt; The &lt;code&gt;/v1/payments&lt;/code&gt; endpoint is deprecated. Use the &lt;code&gt;/v2/payments&lt;/code&gt; endpoint instead. For details, see &lt;a href&#x3D;\&quot;/docs/checkout/integrate/\&quot;&gt;PayPal Checkout Basic Integration&lt;/a&gt;.&lt;/blockquote&gt;Shows details for a payment, by ID, that has yet to complete. For example, shows details for a payment that was created, approved, or failed.
   * @param paymentId The ID of the payment to execute. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Payment
   * @throws ApiException if fails to make API call
   */
  public Payment paymentGet(String paymentId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'paymentId' is set
    if (paymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentId' when calling paymentGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/payments/payment/{payment_id}"
      .replaceAll("\\{" + "payment_id" + "\\}", apiClient.escapeString(paymentId.toString()));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    TypeReference<Payment> localVarReturnType = new TypeReference<Payment>() {};
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
   * List payments
   * &lt;blockquote&gt;&lt;strong&gt;Deprecation notice:&lt;/strong&gt; The &lt;code&gt;/v1/payments&lt;/code&gt; endpoint is deprecated. Use the &lt;code&gt;/v2/payments&lt;/code&gt; endpoint instead. For details, see &lt;a href&#x3D;\&quot;/docs/checkout/integrate/\&quot;&gt;PayPal Checkout Basic Integration&lt;/a&gt;.&lt;/blockquote&gt;Lists payments that are completed. Payments that you just created with the &lt;a href&#x3D;\&quot;/docs/api/payments/v1/#payment_create\&quot;&gt;create payment&lt;/a&gt; call do not appear in the list.&lt;br/&gt;&lt;br/&gt;The list shows the payments that are made to the merchant who makes the call. To filter the payments that appear in the response, you can specify one or more optional query and pagination parameters. See &lt;a href&#x3D;\&quot;/docs/api/reference/api-requests/#query-parameters\&quot;&gt;Filtering and pagination&lt;/a&gt;.
   * @param count The number of items to list in the response. (optional, default to 10)
   * @param startId The ID of the starting resource in the response. When results are paged, you can use the &#x60;next_id&#x60; value as the &#x60;start_id&#x60; to continue with the next set of results. (optional)
   * @param startIndex The start index of the payments to list. Typically, you use the &#x60;start_index&#x60; to jump to a specific position in the resource history based on its cart. For example, to start at the second item in a list of results, specify &#x60;?start_index&#x3D;2&#x60;. (optional)
   * @param startTime The start date and time for the range to show in the response, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). For example, &#x60;start_time&#x3D;2016-03-06T11:00:00Z&#x60;. (optional)
   * @param endTime The end date and time for the range to show in the response, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). For example, &#x60;end_time&#x3D;2016-03-06T11:00:00Z&#x60;. (optional)
   * @param payeeId Filters the payments in the response by a PayPal-assigned merchant ID that identifies the payee. (optional)
   * @param sortBy Sorts the payments in the response by a create time. (optional)
   * @param sortOrder Sorts the payments in the response in descending order. (optional)
   * @return PaymentHistory
   * @throws ApiException if fails to make API call
   */
  public PaymentHistory paymentList(Integer count, String startId, Integer startIndex, String startTime, String endTime, String payeeId, String sortBy, String sortOrder) throws ApiException {
    return this.paymentList(count, startId, startIndex, startTime, endTime, payeeId, sortBy, sortOrder, Collections.emptyMap());
  }


  /**
   * List payments
   * &lt;blockquote&gt;&lt;strong&gt;Deprecation notice:&lt;/strong&gt; The &lt;code&gt;/v1/payments&lt;/code&gt; endpoint is deprecated. Use the &lt;code&gt;/v2/payments&lt;/code&gt; endpoint instead. For details, see &lt;a href&#x3D;\&quot;/docs/checkout/integrate/\&quot;&gt;PayPal Checkout Basic Integration&lt;/a&gt;.&lt;/blockquote&gt;Lists payments that are completed. Payments that you just created with the &lt;a href&#x3D;\&quot;/docs/api/payments/v1/#payment_create\&quot;&gt;create payment&lt;/a&gt; call do not appear in the list.&lt;br/&gt;&lt;br/&gt;The list shows the payments that are made to the merchant who makes the call. To filter the payments that appear in the response, you can specify one or more optional query and pagination parameters. See &lt;a href&#x3D;\&quot;/docs/api/reference/api-requests/#query-parameters\&quot;&gt;Filtering and pagination&lt;/a&gt;.
   * @param count The number of items to list in the response. (optional, default to 10)
   * @param startId The ID of the starting resource in the response. When results are paged, you can use the &#x60;next_id&#x60; value as the &#x60;start_id&#x60; to continue with the next set of results. (optional)
   * @param startIndex The start index of the payments to list. Typically, you use the &#x60;start_index&#x60; to jump to a specific position in the resource history based on its cart. For example, to start at the second item in a list of results, specify &#x60;?start_index&#x3D;2&#x60;. (optional)
   * @param startTime The start date and time for the range to show in the response, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). For example, &#x60;start_time&#x3D;2016-03-06T11:00:00Z&#x60;. (optional)
   * @param endTime The end date and time for the range to show in the response, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). For example, &#x60;end_time&#x3D;2016-03-06T11:00:00Z&#x60;. (optional)
   * @param payeeId Filters the payments in the response by a PayPal-assigned merchant ID that identifies the payee. (optional)
   * @param sortBy Sorts the payments in the response by a create time. (optional)
   * @param sortOrder Sorts the payments in the response in descending order. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return PaymentHistory
   * @throws ApiException if fails to make API call
   */
  public PaymentHistory paymentList(Integer count, String startId, Integer startIndex, String startTime, String endTime, String payeeId, String sortBy, String sortOrder, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/payments/payment";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
    localVarQueryParams.addAll(apiClient.parameterToPair("start_id", startId));
    localVarQueryParams.addAll(apiClient.parameterToPair("start_index", startIndex));
    localVarQueryParams.addAll(apiClient.parameterToPair("start_time", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPair("payee_id", payeeId));
    localVarQueryParams.addAll(apiClient.parameterToPair("sort_by", sortBy));
    localVarQueryParams.addAll(apiClient.parameterToPair("sort_order", sortOrder));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Oauth2" };

    TypeReference<PaymentHistory> localVarReturnType = new TypeReference<PaymentHistory>() {};
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
   * Partially update payment
   * &lt;blockquote&gt;&lt;strong&gt;Deprecation notice:&lt;/strong&gt; The &lt;code&gt;/v1/payments&lt;/code&gt; endpoint is deprecated. Use the &lt;code&gt;/v2/payments&lt;/code&gt; endpoint instead. For details, see &lt;a href&#x3D;\&quot;/docs/checkout/integrate/\&quot;&gt;PayPal Checkout Basic Integration&lt;/a&gt;.&lt;/blockquote&gt;Partially updates a payment, by ID. You can update the amount, shipping address, invoice ID, and custom data. You cannot update a payment after the payment executes. &lt;blockquote&gt;&lt;strong&gt;Note: &lt;/strong&gt;TPP Clients (Third Party Providers in the context of PSD2 regulation) are restricted from patching amount once authorized.&lt;/blockquote&gt;
   * @param paymentId The ID of the payment to execute. (required)
   * @param patch  (optional
   * @return Payment
   * @throws ApiException if fails to make API call
   */
  public Payment paymentUpdate(String paymentId, List<Patch> patch) throws ApiException {
    return this.paymentUpdate(paymentId, patch, Collections.emptyMap());
  }


  /**
   * Partially update payment
   * &lt;blockquote&gt;&lt;strong&gt;Deprecation notice:&lt;/strong&gt; The &lt;code&gt;/v1/payments&lt;/code&gt; endpoint is deprecated. Use the &lt;code&gt;/v2/payments&lt;/code&gt; endpoint instead. For details, see &lt;a href&#x3D;\&quot;/docs/checkout/integrate/\&quot;&gt;PayPal Checkout Basic Integration&lt;/a&gt;.&lt;/blockquote&gt;Partially updates a payment, by ID. You can update the amount, shipping address, invoice ID, and custom data. You cannot update a payment after the payment executes. &lt;blockquote&gt;&lt;strong&gt;Note: &lt;/strong&gt;TPP Clients (Third Party Providers in the context of PSD2 regulation) are restricted from patching amount once authorized.&lt;/blockquote&gt;
   * @param paymentId The ID of the payment to execute. (required)
   * @param patch  (optional
   * @param additionalHeaders additionalHeaders for this call
   * @return Payment
   * @throws ApiException if fails to make API call
   */
  public Payment paymentUpdate(String paymentId, List<Patch> patch, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = patch;
    
    // verify the required parameter 'paymentId' is set
    if (paymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentId' when calling paymentUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/payments/payment/{payment_id}"
      .replaceAll("\\{" + "payment_id" + "\\}", apiClient.escapeString(paymentId.toString()));

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

    TypeReference<Payment> localVarReturnType = new TypeReference<Payment>() {};
    return apiClient.invokeAPI(
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
        localVarReturnType
    );
  }

}