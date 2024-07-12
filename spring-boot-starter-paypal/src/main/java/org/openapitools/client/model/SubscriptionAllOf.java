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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.LinkDescription;
import org.openapitools.client.model.Money;
import org.openapitools.client.model.Plan;
import org.openapitools.client.model.Subscriber;
import org.openapitools.client.model.SubscriptionBillingInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionAllOf
 */
@JsonPropertyOrder({
  SubscriptionAllOf.JSON_PROPERTY_ID,
  SubscriptionAllOf.JSON_PROPERTY_PLAN_ID,
  SubscriptionAllOf.JSON_PROPERTY_START_TIME,
  SubscriptionAllOf.JSON_PROPERTY_QUANTITY,
  SubscriptionAllOf.JSON_PROPERTY_SHIPPING_AMOUNT,
  SubscriptionAllOf.JSON_PROPERTY_SUBSCRIBER,
  SubscriptionAllOf.JSON_PROPERTY_BILLING_INFO,
  SubscriptionAllOf.JSON_PROPERTY_CREATE_TIME,
  SubscriptionAllOf.JSON_PROPERTY_UPDATE_TIME,
  SubscriptionAllOf.JSON_PROPERTY_CUSTOM_ID,
  SubscriptionAllOf.JSON_PROPERTY_PLAN_OVERRIDDEN,
  SubscriptionAllOf.JSON_PROPERTY_PLAN,
  SubscriptionAllOf.JSON_PROPERTY_LINKS
})
@JsonTypeName("subscription_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-08T11:30:41.643502082Z[Atlantic/Reykjavik]")
public class SubscriptionAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PLAN_ID = "plan_id";
  private String planId;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private String startTime;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private String quantity;

  public static final String JSON_PROPERTY_SHIPPING_AMOUNT = "shipping_amount";
  private Money shippingAmount;

  public static final String JSON_PROPERTY_SUBSCRIBER = "subscriber";
  private Subscriber subscriber;

  public static final String JSON_PROPERTY_BILLING_INFO = "billing_info";
  private SubscriptionBillingInfo billingInfo;

  public static final String JSON_PROPERTY_CREATE_TIME = "create_time";
  private String createTime;

  public static final String JSON_PROPERTY_UPDATE_TIME = "update_time";
  private String updateTime;

  public static final String JSON_PROPERTY_CUSTOM_ID = "custom_id";
  private String customId;

  public static final String JSON_PROPERTY_PLAN_OVERRIDDEN = "plan_overridden";
  private Boolean planOverridden;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private Plan plan;

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<LinkDescription> links;

  public SubscriptionAllOf() {
  }

  @JsonCreator
  public SubscriptionAllOf(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_PLAN_OVERRIDDEN) Boolean planOverridden, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<LinkDescription> links
  ) {
    this();
    this.id = id;
    this.planOverridden = planOverridden;
    this.links = links;
  }

   /**
   * The PayPal-generated ID for the subscription.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public SubscriptionAllOf planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * The ID of the plan.
   * @return planId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanId() {
    return planId;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public SubscriptionAllOf startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
   * @return startTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public SubscriptionAllOf quantity(String quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the product in the subscription.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  public SubscriptionAllOf shippingAmount(Money shippingAmount) {
    
    this.shippingAmount = shippingAmount;
    return this;
  }

   /**
   * Get shippingAmount
   * @return shippingAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Money getShippingAmount() {
    return shippingAmount;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAmount(Money shippingAmount) {
    this.shippingAmount = shippingAmount;
  }


  public SubscriptionAllOf subscriber(Subscriber subscriber) {
    
    this.subscriber = subscriber;
    return this;
  }

   /**
   * Get subscriber
   * @return subscriber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Subscriber getSubscriber() {
    return subscriber;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriber(Subscriber subscriber) {
    this.subscriber = subscriber;
  }


  public SubscriptionAllOf billingInfo(SubscriptionBillingInfo billingInfo) {
    
    this.billingInfo = billingInfo;
    return this;
  }

   /**
   * Get billingInfo
   * @return billingInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionBillingInfo getBillingInfo() {
    return billingInfo;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingInfo(SubscriptionBillingInfo billingInfo) {
    this.billingInfo = billingInfo;
  }


  public SubscriptionAllOf createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
   * @return createTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public SubscriptionAllOf updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdateTime() {
    return updateTime;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public SubscriptionAllOf customId(String customId) {
    
    this.customId = customId;
    return this;
  }

   /**
   * The custom id for the subscription. Can be invoice id.
   * @return customId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomId() {
    return customId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomId(String customId) {
    this.customId = customId;
  }


   /**
   * Indicates whether the subscription has overridden any plan attributes.
   * @return planOverridden
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_OVERRIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPlanOverridden() {
    return planOverridden;
  }




  public SubscriptionAllOf plan(Plan plan) {
    
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Plan getPlan() {
    return plan;
  }


  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlan(Plan plan) {
    this.plan = plan;
  }


   /**
   * An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
   * @return links
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LinkDescription> getLinks() {
    return links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionAllOf subscriptionAllOf = (SubscriptionAllOf) o;
    return Objects.equals(this.id, subscriptionAllOf.id) &&
        Objects.equals(this.planId, subscriptionAllOf.planId) &&
        Objects.equals(this.startTime, subscriptionAllOf.startTime) &&
        Objects.equals(this.quantity, subscriptionAllOf.quantity) &&
        Objects.equals(this.shippingAmount, subscriptionAllOf.shippingAmount) &&
        Objects.equals(this.subscriber, subscriptionAllOf.subscriber) &&
        Objects.equals(this.billingInfo, subscriptionAllOf.billingInfo) &&
        Objects.equals(this.createTime, subscriptionAllOf.createTime) &&
        Objects.equals(this.updateTime, subscriptionAllOf.updateTime) &&
        Objects.equals(this.customId, subscriptionAllOf.customId) &&
        Objects.equals(this.planOverridden, subscriptionAllOf.planOverridden) &&
        Objects.equals(this.plan, subscriptionAllOf.plan) &&
        Objects.equals(this.links, subscriptionAllOf.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, planId, startTime, quantity, shippingAmount, subscriber, billingInfo, createTime, updateTime, customId, planOverridden, plan, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shippingAmount: ").append(toIndentedString(shippingAmount)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    planOverridden: ").append(toIndentedString(planOverridden)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plan_id` to the URL query string
    if (getPlanId() != null) {
      try {
        joiner.add(String.format("%splan_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlanId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `start_time` to the URL query string
    if (getStartTime() != null) {
      try {
        joiner.add(String.format("%sstart_time%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quantity` to the URL query string
    if (getQuantity() != null) {
      try {
        joiner.add(String.format("%squantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shipping_amount` to the URL query string
    if (getShippingAmount() != null) {
      joiner.add(getShippingAmount().toUrlQueryString(prefix + "shipping_amount" + suffix));
    }

    // add `subscriber` to the URL query string
    if (getSubscriber() != null) {
      joiner.add(getSubscriber().toUrlQueryString(prefix + "subscriber" + suffix));
    }

    // add `billing_info` to the URL query string
    if (getBillingInfo() != null) {
      joiner.add(getBillingInfo().toUrlQueryString(prefix + "billing_info" + suffix));
    }

    // add `create_time` to the URL query string
    if (getCreateTime() != null) {
      try {
        joiner.add(String.format("%screate_time%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `update_time` to the URL query string
    if (getUpdateTime() != null) {
      try {
        joiner.add(String.format("%supdate_time%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdateTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `custom_id` to the URL query string
    if (getCustomId() != null) {
      try {
        joiner.add(String.format("%scustom_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plan_overridden` to the URL query string
    if (getPlanOverridden() != null) {
      try {
        joiner.add(String.format("%splan_overridden%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlanOverridden()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plan` to the URL query string
    if (getPlan() != null) {
      joiner.add(getPlan().toUrlQueryString(prefix + "plan" + suffix));
    }

    // add `links` to the URL query string
    if (getLinks() != null) {
      for (int i = 0; i < getLinks().size(); i++) {
        if (getLinks().get(i) != null) {
          joiner.add(getLinks().get(i).toUrlQueryString(String.format("%slinks%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}
