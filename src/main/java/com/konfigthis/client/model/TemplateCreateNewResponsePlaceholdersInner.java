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
import com.konfigthis.client.model.TemplateCreateNewResponsePlaceholdersInnerAttachmentRequestsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * TemplateCreateNewResponsePlaceholdersInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TemplateCreateNewResponsePlaceholdersInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PREASSIGNED_RECIPIENT_NAME = "preassigned_recipient_name";
  @SerializedName(SERIALIZED_NAME_PREASSIGNED_RECIPIENT_NAME)
  private String preassignedRecipientName;

  public static final String SERIALIZED_NAME_PREASSIGNED_RECIPIENT_EMAIL = "preassigned_recipient_email";
  @SerializedName(SERIALIZED_NAME_PREASSIGNED_RECIPIENT_EMAIL)
  private String preassignedRecipientEmail;

  public static final String SERIALIZED_NAME_SIGNING_ORDER = "signing_order";
  @SerializedName(SERIALIZED_NAME_SIGNING_ORDER)
  private Double signingOrder;

  public static final String SERIALIZED_NAME_ATTACHMENT_REQUESTS = "attachment_requests";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_REQUESTS)
  private List<TemplateCreateNewResponsePlaceholdersInnerAttachmentRequestsInner> attachmentRequests = null;

  public TemplateCreateNewResponsePlaceholdersInner() {
  }

  public TemplateCreateNewResponsePlaceholdersInner id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "placeholder_id_1", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public TemplateCreateNewResponsePlaceholdersInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Placeholder One", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public TemplateCreateNewResponsePlaceholdersInner subject(String subject) {
    
    
    
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    
    
    
    this.subject = subject;
  }


  public TemplateCreateNewResponsePlaceholdersInner message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public TemplateCreateNewResponsePlaceholdersInner preassignedRecipientName(String preassignedRecipientName) {
    
    
    
    
    this.preassignedRecipientName = preassignedRecipientName;
    return this;
  }

   /**
   * Get preassignedRecipientName
   * @return preassignedRecipientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "recipient 1", value = "")

  public String getPreassignedRecipientName() {
    return preassignedRecipientName;
  }


  public void setPreassignedRecipientName(String preassignedRecipientName) {
    
    
    
    this.preassignedRecipientName = preassignedRecipientName;
  }


  public TemplateCreateNewResponsePlaceholdersInner preassignedRecipientEmail(String preassignedRecipientEmail) {
    
    
    
    
    this.preassignedRecipientEmail = preassignedRecipientEmail;
    return this;
  }

   /**
   * Get preassignedRecipientEmail
   * @return preassignedRecipientEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "recipient1@domain.com", value = "")

  public String getPreassignedRecipientEmail() {
    return preassignedRecipientEmail;
  }


  public void setPreassignedRecipientEmail(String preassignedRecipientEmail) {
    
    
    
    this.preassignedRecipientEmail = preassignedRecipientEmail;
  }


  public TemplateCreateNewResponsePlaceholdersInner signingOrder(Double signingOrder) {
    
    
    
    
    this.signingOrder = signingOrder;
    return this;
  }

  public TemplateCreateNewResponsePlaceholdersInner signingOrder(Integer signingOrder) {
    
    
    
    
    this.signingOrder = signingOrder.doubleValue();
    return this;
  }

   /**
   * Get signingOrder
   * @return signingOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Double getSigningOrder() {
    return signingOrder;
  }


  public void setSigningOrder(Double signingOrder) {
    
    
    
    this.signingOrder = signingOrder;
  }


  public TemplateCreateNewResponsePlaceholdersInner attachmentRequests(List<TemplateCreateNewResponsePlaceholdersInnerAttachmentRequestsInner> attachmentRequests) {
    
    
    
    
    this.attachmentRequests = attachmentRequests;
    return this;
  }

  public TemplateCreateNewResponsePlaceholdersInner addAttachmentRequestsItem(TemplateCreateNewResponsePlaceholdersInnerAttachmentRequestsInner attachmentRequestsItem) {
    if (this.attachmentRequests == null) {
      this.attachmentRequests = new ArrayList<>();
    }
    this.attachmentRequests.add(attachmentRequestsItem);
    return this;
  }

   /**
   * Get attachmentRequests
   * @return attachmentRequests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TemplateCreateNewResponsePlaceholdersInnerAttachmentRequestsInner> getAttachmentRequests() {
    return attachmentRequests;
  }


  public void setAttachmentRequests(List<TemplateCreateNewResponsePlaceholdersInnerAttachmentRequestsInner> attachmentRequests) {
    
    
    
    this.attachmentRequests = attachmentRequests;
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
   * @return the TemplateCreateNewResponsePlaceholdersInner instance itself
   */
  public TemplateCreateNewResponsePlaceholdersInner putAdditionalProperty(String key, Object value) {
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
    TemplateCreateNewResponsePlaceholdersInner templateCreateNewResponsePlaceholdersInner = (TemplateCreateNewResponsePlaceholdersInner) o;
    return Objects.equals(this.id, templateCreateNewResponsePlaceholdersInner.id) &&
        Objects.equals(this.name, templateCreateNewResponsePlaceholdersInner.name) &&
        Objects.equals(this.subject, templateCreateNewResponsePlaceholdersInner.subject) &&
        Objects.equals(this.message, templateCreateNewResponsePlaceholdersInner.message) &&
        Objects.equals(this.preassignedRecipientName, templateCreateNewResponsePlaceholdersInner.preassignedRecipientName) &&
        Objects.equals(this.preassignedRecipientEmail, templateCreateNewResponsePlaceholdersInner.preassignedRecipientEmail) &&
        Objects.equals(this.signingOrder, templateCreateNewResponsePlaceholdersInner.signingOrder) &&
        Objects.equals(this.attachmentRequests, templateCreateNewResponsePlaceholdersInner.attachmentRequests)&&
        Objects.equals(this.additionalProperties, templateCreateNewResponsePlaceholdersInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, subject, message, preassignedRecipientName, preassignedRecipientEmail, signingOrder, attachmentRequests, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateCreateNewResponsePlaceholdersInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    preassignedRecipientName: ").append(toIndentedString(preassignedRecipientName)).append("\n");
    sb.append("    preassignedRecipientEmail: ").append(toIndentedString(preassignedRecipientEmail)).append("\n");
    sb.append("    signingOrder: ").append(toIndentedString(signingOrder)).append("\n");
    sb.append("    attachmentRequests: ").append(toIndentedString(attachmentRequests)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("subject");
    openapiFields.add("message");
    openapiFields.add("preassigned_recipient_name");
    openapiFields.add("preassigned_recipient_email");
    openapiFields.add("signing_order");
    openapiFields.add("attachment_requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateCreateNewResponsePlaceholdersInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TemplateCreateNewResponsePlaceholdersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateCreateNewResponsePlaceholdersInner is not found in the empty JSON string", TemplateCreateNewResponsePlaceholdersInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("subject").isJsonNull() && (jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if (!jsonObj.get("message").isJsonNull() && (jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("preassigned_recipient_name") != null && !jsonObj.get("preassigned_recipient_name").isJsonNull()) && !jsonObj.get("preassigned_recipient_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preassigned_recipient_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preassigned_recipient_name").toString()));
      }
      if ((jsonObj.get("preassigned_recipient_email") != null && !jsonObj.get("preassigned_recipient_email").isJsonNull()) && !jsonObj.get("preassigned_recipient_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preassigned_recipient_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preassigned_recipient_email").toString()));
      }
      if (jsonObj.get("attachment_requests") != null && !jsonObj.get("attachment_requests").isJsonNull()) {
        JsonArray jsonArrayattachmentRequests = jsonObj.getAsJsonArray("attachment_requests");
        if (jsonArrayattachmentRequests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachment_requests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachment_requests` to be an array in the JSON string but got `%s`", jsonObj.get("attachment_requests").toString()));
          }

          // validate the optional field `attachment_requests` (array)
          for (int i = 0; i < jsonArrayattachmentRequests.size(); i++) {
            TemplateCreateNewResponsePlaceholdersInnerAttachmentRequestsInner.validateJsonObject(jsonArrayattachmentRequests.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateCreateNewResponsePlaceholdersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateCreateNewResponsePlaceholdersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateCreateNewResponsePlaceholdersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateCreateNewResponsePlaceholdersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateCreateNewResponsePlaceholdersInner>() {
           @Override
           public void write(JsonWriter out, TemplateCreateNewResponsePlaceholdersInner value) throws IOException {
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
           public TemplateCreateNewResponsePlaceholdersInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TemplateCreateNewResponsePlaceholdersInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TemplateCreateNewResponsePlaceholdersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateCreateNewResponsePlaceholdersInner
  * @throws IOException if the JSON string is invalid with respect to TemplateCreateNewResponsePlaceholdersInner
  */
  public static TemplateCreateNewResponsePlaceholdersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateCreateNewResponsePlaceholdersInner.class);
  }

 /**
  * Convert an instance of TemplateCreateNewResponsePlaceholdersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

