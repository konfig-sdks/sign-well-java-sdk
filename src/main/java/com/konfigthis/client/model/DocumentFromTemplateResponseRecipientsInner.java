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
import com.konfigthis.client.model.DocumentResponseRecipientsInnerAttachmentRequestsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * DocumentFromTemplateResponseRecipientsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DocumentFromTemplateResponseRecipientsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_ATTACHMENT_REQUESTS = "attachment_requests";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_REQUESTS)
  private List<DocumentResponseRecipientsInnerAttachmentRequestsInner> attachmentRequests = null;

  public static final String SERIALIZED_NAME_PASSCODE = "passcode";
  @SerializedName(SERIALIZED_NAME_PASSCODE)
  private String passcode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public DocumentFromTemplateResponseRecipientsInner() {
  }

  public DocumentFromTemplateResponseRecipientsInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public DocumentFromTemplateResponseRecipientsInner email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public DocumentFromTemplateResponseRecipientsInner role(String role) {
    
    
    
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    
    
    
    this.role = role;
  }


  public DocumentFromTemplateResponseRecipientsInner attachmentRequests(List<DocumentResponseRecipientsInnerAttachmentRequestsInner> attachmentRequests) {
    
    
    
    
    this.attachmentRequests = attachmentRequests;
    return this;
  }

  public DocumentFromTemplateResponseRecipientsInner addAttachmentRequestsItem(DocumentResponseRecipientsInnerAttachmentRequestsInner attachmentRequestsItem) {
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

  public List<DocumentResponseRecipientsInnerAttachmentRequestsInner> getAttachmentRequests() {
    return attachmentRequests;
  }


  public void setAttachmentRequests(List<DocumentResponseRecipientsInnerAttachmentRequestsInner> attachmentRequests) {
    
    
    
    this.attachmentRequests = attachmentRequests;
  }


  public DocumentFromTemplateResponseRecipientsInner passcode(String passcode) {
    
    
    
    
    this.passcode = passcode;
    return this;
  }

   /**
   * Get passcode
   * @return passcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasscode() {
    return passcode;
  }


  public void setPasscode(String passcode) {
    
    
    
    this.passcode = passcode;
  }


  public DocumentFromTemplateResponseRecipientsInner status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
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
   * @return the DocumentFromTemplateResponseRecipientsInner instance itself
   */
  public DocumentFromTemplateResponseRecipientsInner putAdditionalProperty(String key, Object value) {
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
    DocumentFromTemplateResponseRecipientsInner documentFromTemplateResponseRecipientsInner = (DocumentFromTemplateResponseRecipientsInner) o;
    return Objects.equals(this.name, documentFromTemplateResponseRecipientsInner.name) &&
        Objects.equals(this.email, documentFromTemplateResponseRecipientsInner.email) &&
        Objects.equals(this.role, documentFromTemplateResponseRecipientsInner.role) &&
        Objects.equals(this.attachmentRequests, documentFromTemplateResponseRecipientsInner.attachmentRequests) &&
        Objects.equals(this.passcode, documentFromTemplateResponseRecipientsInner.passcode) &&
        Objects.equals(this.status, documentFromTemplateResponseRecipientsInner.status)&&
        Objects.equals(this.additionalProperties, documentFromTemplateResponseRecipientsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, role, attachmentRequests, passcode, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentFromTemplateResponseRecipientsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    attachmentRequests: ").append(toIndentedString(attachmentRequests)).append("\n");
    sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("role");
    openapiFields.add("attachment_requests");
    openapiFields.add("passcode");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentFromTemplateResponseRecipientsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocumentFromTemplateResponseRecipientsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentFromTemplateResponseRecipientsInner is not found in the empty JSON string", DocumentFromTemplateResponseRecipientsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocumentFromTemplateResponseRecipientsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
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
            DocumentResponseRecipientsInnerAttachmentRequestsInner.validateJsonObject(jsonArrayattachmentRequests.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("passcode") != null && !jsonObj.get("passcode").isJsonNull()) && !jsonObj.get("passcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passcode").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentFromTemplateResponseRecipientsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentFromTemplateResponseRecipientsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentFromTemplateResponseRecipientsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentFromTemplateResponseRecipientsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentFromTemplateResponseRecipientsInner>() {
           @Override
           public void write(JsonWriter out, DocumentFromTemplateResponseRecipientsInner value) throws IOException {
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
           public DocumentFromTemplateResponseRecipientsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DocumentFromTemplateResponseRecipientsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocumentFromTemplateResponseRecipientsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentFromTemplateResponseRecipientsInner
  * @throws IOException if the JSON string is invalid with respect to DocumentFromTemplateResponseRecipientsInner
  */
  public static DocumentFromTemplateResponseRecipientsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentFromTemplateResponseRecipientsInner.class);
  }

 /**
  * Convert an instance of DocumentFromTemplateResponseRecipientsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

