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
import org.openapitools.client.model.PLANSTATUSINACTIVE;
import org.openapitools.client.model.USERACCOUNTCLOSED;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PlansPatch422DetailsInner
 */
@JsonPropertyOrder({
  PlansPatch422DetailsInner.JSON_PROPERTY_ISSUE,
  PlansPatch422DetailsInner.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("plans_patch_422_details_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-08T11:30:41.643502082Z[Atlantic/Reykjavik]")
public class PlansPatch422DetailsInner {
  /**
   * Gets or Sets issue
   */
  public enum IssueEnum {
    PLAN_STATUS_INACTIVE("PLAN_STATUS_INACTIVE");

    private String value;

    IssueEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IssueEnum fromValue(String value) {
      for (IssueEnum b : IssueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ISSUE = "issue";
  private IssueEnum issue;

  /**
   * Gets or Sets description
   */
  public enum DescriptionEnum {
    STATUS_UPDATE_IS_THE_ONLY_PATCHABLE_FILED_ON_AN_INACTIVE_PLAN_("Status update is the only patchable filed on an inactive plan.");

    private String value;

    DescriptionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DescriptionEnum fromValue(String value) {
      for (DescriptionEnum b : DescriptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private DescriptionEnum description;

  public PlansPatch422DetailsInner() {
  }

  public PlansPatch422DetailsInner issue(IssueEnum issue) {
    
    this.issue = issue;
    return this;
  }

   /**
   * Get issue
   * @return issue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IssueEnum getIssue() {
    return issue;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssue(IssueEnum issue) {
    this.issue = issue;
  }


  public PlansPatch422DetailsInner description(DescriptionEnum description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DescriptionEnum getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(DescriptionEnum description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlansPatch422DetailsInner plansPatch422DetailsInner = (PlansPatch422DetailsInner) o;
    return Objects.equals(this.issue, plansPatch422DetailsInner.issue) &&
        Objects.equals(this.description, plansPatch422DetailsInner.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issue, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlansPatch422DetailsInner {\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

    // add `issue` to the URL query string
    if (getIssue() != null) {
      try {
        joiner.add(String.format("%sissue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIssue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
