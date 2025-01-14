/*
 * Resources and endpoints
 * When I started SignWell in 2019, I saw there was a need for an alternative to the hard-to-use and expensive e-signature software already out there. Documents can be complicated enough, but getting a document signed shouldn't be complicated too.  At SignWell, we pride ourselves not only on the ease and affordability of our e-signature process but also on our personalized and industry-leading customer support — whether it's for individual use or larger team accounts, SignWell is here to help you feel comfortable and confident getting your documents signed.  The SignWell mission? Simplify how documents get signed for millions of people and businesses. We're excited to help you continue to move toward the future of paperless document signing.  Ruben Gamez Founder, SignWell
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * DocumentTemplateUpdateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DocumentTemplateUpdateRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  private Boolean draft = false;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Integer expiresIn;

  public static final String SERIALIZED_NAME_REMINDERS = "reminders";
  @SerializedName(SERIALIZED_NAME_REMINDERS)
  private Boolean reminders = true;

  public static final String SERIALIZED_NAME_APPLY_SIGNING_ORDER = "apply_signing_order";
  @SerializedName(SERIALIZED_NAME_APPLY_SIGNING_ORDER)
  private Boolean applySigningOrder = false;

  public static final String SERIALIZED_NAME_API_APPLICATION_ID = "api_application_id";
  @SerializedName(SERIALIZED_NAME_API_APPLICATION_ID)
  private UUID apiApplicationId;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_ALLOW_DECLINE = "allow_decline";
  @SerializedName(SERIALIZED_NAME_ALLOW_DECLINE)
  private Boolean allowDecline = true;

  public static final String SERIALIZED_NAME_ALLOW_REASSIGN = "allow_reassign";
  @SerializedName(SERIALIZED_NAME_ALLOW_REASSIGN)
  private Boolean allowReassign = true;

  public static final String SERIALIZED_NAME_DECLINE_REDIRECT_URL = "decline_redirect_url";
  @SerializedName(SERIALIZED_NAME_DECLINE_REDIRECT_URL)
  private String declineRedirectUrl;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public DocumentTemplateUpdateRequest() {
  }

  public DocumentTemplateUpdateRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the template.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the template.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public DocumentTemplateUpdateRequest subject(String subject) {
    
    
    
    
    this.subject = subject;
    return this;
  }

   /**
   * Email subject for the signature request that recipients will see. Defaults to the default system subject or a template subject (if the document is created from a template).
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email subject for the signature request that recipients will see. Defaults to the default system subject or a template subject (if the document is created from a template).")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    
    
    
    this.subject = subject;
  }


  public DocumentTemplateUpdateRequest message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Email message for the signature request that recipients will see. Defaults to the default system message or a template message (if the document is created from a template).
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email message for the signature request that recipients will see. Defaults to the default system message or a template message (if the document is created from a template).")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public DocumentTemplateUpdateRequest draft(Boolean draft) {
    
    
    
    
    this.draft = draft;
    return this;
  }

   /**
   * Whether the template can still be updated before it is ready for usage. If set to &#x60;false&#x60; the template is marked as &#x60;Available&#x60; and it will be ready for use. Defaults to &#x60;false&#x60;.
   * @return draft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the template can still be updated before it is ready for usage. If set to `false` the template is marked as `Available` and it will be ready for use. Defaults to `false`.")

  public Boolean getDraft() {
    return draft;
  }


  public void setDraft(Boolean draft) {
    
    
    
    this.draft = draft;
  }


  public DocumentTemplateUpdateRequest expiresIn(Integer expiresIn) {
    if (expiresIn != null && expiresIn < 1) {
      throw new IllegalArgumentException("Invalid value for expiresIn. Must be greater than or equal to 1.");
    }
    
    
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Number of days before the signature request expires. Defaults to the account expiration setting or template expiration (if the document is created from a template).
   * minimum: 1
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of days before the signature request expires. Defaults to the account expiration setting or template expiration (if the document is created from a template).")

  public Integer getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Integer expiresIn) {
    if (expiresIn != null && expiresIn < 1) {
      throw new IllegalArgumentException("Invalid value for expiresIn. Must be greater than or equal to 1.");
    }
    
    
    this.expiresIn = expiresIn;
  }


  public DocumentTemplateUpdateRequest reminders(Boolean reminders) {
    
    
    
    
    this.reminders = reminders;
    return this;
  }

   /**
   * Whether to send signing reminders to recipients. Reminders are sent on day 3, day 6, and day 10 if set to &#x60;true&#x60;. Defaults to &#x60;true&#x60;.
   * @return reminders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to send signing reminders to recipients. Reminders are sent on day 3, day 6, and day 10 if set to `true`. Defaults to `true`.")

  public Boolean getReminders() {
    return reminders;
  }


  public void setReminders(Boolean reminders) {
    
    
    
    this.reminders = reminders;
  }


  public DocumentTemplateUpdateRequest applySigningOrder(Boolean applySigningOrder) {
    
    
    
    
    this.applySigningOrder = applySigningOrder;
    return this;
  }

   /**
   * When set to &#x60;true&#x60; recipients will sign one at a time in the order of the &#x60;recipients&#x60; collection of this request.
   * @return applySigningOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "When set to `true` recipients will sign one at a time in the order of the `recipients` collection of this request.")

  public Boolean getApplySigningOrder() {
    return applySigningOrder;
  }


  public void setApplySigningOrder(Boolean applySigningOrder) {
    
    
    
    this.applySigningOrder = applySigningOrder;
  }


  public DocumentTemplateUpdateRequest apiApplicationId(UUID apiApplicationId) {
    
    
    
    
    this.apiApplicationId = apiApplicationId;
    return this;
  }

   /**
   * Unique identifier for API Application settings to use. API Applications are optional and mainly used when isolating OAuth apps or for more control over embedded API settings
   * @return apiApplicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for API Application settings to use. API Applications are optional and mainly used when isolating OAuth apps or for more control over embedded API settings")

  public UUID getApiApplicationId() {
    return apiApplicationId;
  }


  public void setApiApplicationId(UUID apiApplicationId) {
    
    
    
    this.apiApplicationId = apiApplicationId;
  }


  public DocumentTemplateUpdateRequest redirectUrl(String redirectUrl) {
    
    
    
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * A URL that recipients are redirected to after successfully signing a document.
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URL that recipients are redirected to after successfully signing a document.")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    
    
    
    this.redirectUrl = redirectUrl;
  }


  public DocumentTemplateUpdateRequest allowDecline(Boolean allowDecline) {
    
    
    
    
    this.allowDecline = allowDecline;
    return this;
  }

   /**
   * Whether to allow recipients the option to decline signing a document. If multiple signers are involved in a document, any single recipient can cancel the entire document signing process by declining to sign.
   * @return allowDecline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to allow recipients the option to decline signing a document. If multiple signers are involved in a document, any single recipient can cancel the entire document signing process by declining to sign.")

  public Boolean getAllowDecline() {
    return allowDecline;
  }


  public void setAllowDecline(Boolean allowDecline) {
    
    
    
    this.allowDecline = allowDecline;
  }


  public DocumentTemplateUpdateRequest allowReassign(Boolean allowReassign) {
    
    
    
    
    this.allowReassign = allowReassign;
    return this;
  }

   /**
   * In some cases a signer is not the right person to sign and may need to reassign their signing responsibilities to another person. This feature allows them to reassign the document to someone else.
   * @return allowReassign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "In some cases a signer is not the right person to sign and may need to reassign their signing responsibilities to another person. This feature allows them to reassign the document to someone else.")

  public Boolean getAllowReassign() {
    return allowReassign;
  }


  public void setAllowReassign(Boolean allowReassign) {
    
    
    
    this.allowReassign = allowReassign;
  }


  public DocumentTemplateUpdateRequest declineRedirectUrl(String declineRedirectUrl) {
    
    
    
    
    this.declineRedirectUrl = declineRedirectUrl;
    return this;
  }

   /**
   * A URL that recipients are redirected to if the document is declined.
   * @return declineRedirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URL that recipients are redirected to if the document is declined.")

  public String getDeclineRedirectUrl() {
    return declineRedirectUrl;
  }


  public void setDeclineRedirectUrl(String declineRedirectUrl) {
    
    
    
    this.declineRedirectUrl = declineRedirectUrl;
  }


  public DocumentTemplateUpdateRequest metadata(Object metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Optional key-value data that can be associated with the document. If set, will be available every time the document data is returned.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional key-value data that can be associated with the document. If set, will be available every time the document data is returned.")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    
    
    
    this.metadata = metadata;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the DocumentTemplateUpdateRequest instance itself
   */
  public DocumentTemplateUpdateRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTemplateUpdateRequest documentTemplateUpdateRequest = (DocumentTemplateUpdateRequest) o;
    return Objects.equals(this.name, documentTemplateUpdateRequest.name) &&
        Objects.equals(this.subject, documentTemplateUpdateRequest.subject) &&
        Objects.equals(this.message, documentTemplateUpdateRequest.message) &&
        Objects.equals(this.draft, documentTemplateUpdateRequest.draft) &&
        Objects.equals(this.expiresIn, documentTemplateUpdateRequest.expiresIn) &&
        Objects.equals(this.reminders, documentTemplateUpdateRequest.reminders) &&
        Objects.equals(this.applySigningOrder, documentTemplateUpdateRequest.applySigningOrder) &&
        Objects.equals(this.apiApplicationId, documentTemplateUpdateRequest.apiApplicationId) &&
        Objects.equals(this.redirectUrl, documentTemplateUpdateRequest.redirectUrl) &&
        Objects.equals(this.allowDecline, documentTemplateUpdateRequest.allowDecline) &&
        Objects.equals(this.allowReassign, documentTemplateUpdateRequest.allowReassign) &&
        Objects.equals(this.declineRedirectUrl, documentTemplateUpdateRequest.declineRedirectUrl) &&
        Objects.equals(this.metadata, documentTemplateUpdateRequest.metadata)&&
        Objects.equals(this.additionalProperties, documentTemplateUpdateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subject, message, draft, expiresIn, reminders, applySigningOrder, apiApplicationId, redirectUrl, allowDecline, allowReassign, declineRedirectUrl, metadata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTemplateUpdateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    reminders: ").append(toIndentedString(reminders)).append("\n");
    sb.append("    applySigningOrder: ").append(toIndentedString(applySigningOrder)).append("\n");
    sb.append("    apiApplicationId: ").append(toIndentedString(apiApplicationId)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    allowDecline: ").append(toIndentedString(allowDecline)).append("\n");
    sb.append("    allowReassign: ").append(toIndentedString(allowReassign)).append("\n");
    sb.append("    declineRedirectUrl: ").append(toIndentedString(declineRedirectUrl)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("subject");
    openapiFields.add("message");
    openapiFields.add("draft");
    openapiFields.add("expires_in");
    openapiFields.add("reminders");
    openapiFields.add("apply_signing_order");
    openapiFields.add("api_application_id");
    openapiFields.add("redirect_url");
    openapiFields.add("allow_decline");
    openapiFields.add("allow_reassign");
    openapiFields.add("decline_redirect_url");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentTemplateUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocumentTemplateUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentTemplateUpdateRequest is not found in the empty JSON string", DocumentTemplateUpdateRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("api_application_id") != null && !jsonObj.get("api_application_id").isJsonNull()) && !jsonObj.get("api_application_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_application_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_application_id").toString()));
      }
      if ((jsonObj.get("redirect_url") != null && !jsonObj.get("redirect_url").isJsonNull()) && !jsonObj.get("redirect_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirect_url").toString()));
      }
      if ((jsonObj.get("decline_redirect_url") != null && !jsonObj.get("decline_redirect_url").isJsonNull()) && !jsonObj.get("decline_redirect_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decline_redirect_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decline_redirect_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentTemplateUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentTemplateUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentTemplateUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentTemplateUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentTemplateUpdateRequest>() {
           @Override
           public void write(JsonWriter out, DocumentTemplateUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentTemplateUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DocumentTemplateUpdateRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentTemplateUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentTemplateUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to DocumentTemplateUpdateRequest
  */
  public static DocumentTemplateUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentTemplateUpdateRequest.class);
  }

 /**
  * Convert an instance of DocumentTemplateUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

