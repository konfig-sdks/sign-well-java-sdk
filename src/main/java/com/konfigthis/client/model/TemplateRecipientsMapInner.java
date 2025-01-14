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
 * TemplateRecipientsMapInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TemplateRecipientsMapInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PLACEHOLDER_NAME = "placeholder_name";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER_NAME)
  private String placeholderName;

  public static final String SERIALIZED_NAME_PASSCODE = "passcode";
  @SerializedName(SERIALIZED_NAME_PASSCODE)
  private String passcode;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SEND_EMAIL = "send_email";
  @SerializedName(SERIALIZED_NAME_SEND_EMAIL)
  private Boolean sendEmail = false;

  public static final String SERIALIZED_NAME_SEND_EMAIL_DELAY = "send_email_delay";
  @SerializedName(SERIALIZED_NAME_SEND_EMAIL_DELAY)
  private Integer sendEmailDelay = 0;

  public TemplateRecipientsMapInner() {
  }

  public TemplateRecipientsMapInner id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier that you will give to each recipient. We recommend numbering sequentially from 1 to X. IDs are required for associating recipients to fields and more.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique identifier that you will give to each recipient. We recommend numbering sequentially from 1 to X. IDs are required for associating recipients to fields and more.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public TemplateRecipientsMapInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the recipient.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the recipient.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public TemplateRecipientsMapInner email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Email address for the recipient.
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Email address for the recipient.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public TemplateRecipientsMapInner placeholderName(String placeholderName) {
    
    
    
    
    this.placeholderName = placeholderName;
    return this;
  }

   /**
   * The name of the placeholder you want this recipient assigned to.
   * @return placeholderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the placeholder you want this recipient assigned to.")

  public String getPlaceholderName() {
    return placeholderName;
  }


  public void setPlaceholderName(String placeholderName) {
    
    
    
    this.placeholderName = placeholderName;
  }


  public TemplateRecipientsMapInner passcode(String passcode) {
    
    
    
    
    this.passcode = passcode;
    return this;
  }

   /**
   * If set, signers assigned with a passcode will be required to enter the passcode before they’re able to view and complete the document.
   * @return passcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, signers assigned with a passcode will be required to enter the passcode before they’re able to view and complete the document.")

  public String getPasscode() {
    return passcode;
  }


  public void setPasscode(String passcode) {
    
    
    
    this.passcode = passcode;
  }


  public TemplateRecipientsMapInner subject(String subject) {
    
    
    
    
    this.subject = subject;
    return this;
  }

   /**
   * Email subject for the signature request that the recipient will see. Overrides the general subject for the template.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email subject for the signature request that the recipient will see. Overrides the general subject for the template.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    
    
    
    this.subject = subject;
  }


  public TemplateRecipientsMapInner message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Email message for the signature request that the recipient will see. Overrides the general message for the template.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email message for the signature request that the recipient will see. Overrides the general message for the template.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public TemplateRecipientsMapInner sendEmail(Boolean sendEmail) {
    
    
    
    
    this.sendEmail = sendEmail;
    return this;
  }

   /**
   * Applies on when &#x60;embedded_signing&#x60; is &#x60;true&#x60;. By default, recipients are not notified through email to sign when doing embedded signing. Setting this to &#x60;true&#x60;  will send a notification email to the recipient. Default is &#x60;false&#x60;.
   * @return sendEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Applies on when `embedded_signing` is `true`. By default, recipients are not notified through email to sign when doing embedded signing. Setting this to `true`  will send a notification email to the recipient. Default is `false`.")

  public Boolean getSendEmail() {
    return sendEmail;
  }


  public void setSendEmail(Boolean sendEmail) {
    
    
    
    this.sendEmail = sendEmail;
  }


  public TemplateRecipientsMapInner sendEmailDelay(Integer sendEmailDelay) {
    
    
    
    
    this.sendEmailDelay = sendEmailDelay;
    return this;
  }

   /**
   * If &#x60;send_email&#x60; is &#x60;true&#x60; recipients will receive a new document notification immediately. In the case of embedded signing, you can delay this notification to only send if the document is not completed within a few minutes. The email notification will not go out if the document is completed before the delay time is over. Valid values are in minutes ranging from &#x60;0&#x60; to &#x60;60&#x60;. Defaults to &#x60;0&#x60;.
   * @return sendEmailDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "If `send_email` is `true` recipients will receive a new document notification immediately. In the case of embedded signing, you can delay this notification to only send if the document is not completed within a few minutes. The email notification will not go out if the document is completed before the delay time is over. Valid values are in minutes ranging from `0` to `60`. Defaults to `0`.")

  public Integer getSendEmailDelay() {
    return sendEmailDelay;
  }


  public void setSendEmailDelay(Integer sendEmailDelay) {
    
    
    
    this.sendEmailDelay = sendEmailDelay;
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
   * @return the TemplateRecipientsMapInner instance itself
   */
  public TemplateRecipientsMapInner putAdditionalProperty(String key, Object value) {
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
    TemplateRecipientsMapInner templateRecipientsMapInner = (TemplateRecipientsMapInner) o;
    return Objects.equals(this.id, templateRecipientsMapInner.id) &&
        Objects.equals(this.name, templateRecipientsMapInner.name) &&
        Objects.equals(this.email, templateRecipientsMapInner.email) &&
        Objects.equals(this.placeholderName, templateRecipientsMapInner.placeholderName) &&
        Objects.equals(this.passcode, templateRecipientsMapInner.passcode) &&
        Objects.equals(this.subject, templateRecipientsMapInner.subject) &&
        Objects.equals(this.message, templateRecipientsMapInner.message) &&
        Objects.equals(this.sendEmail, templateRecipientsMapInner.sendEmail) &&
        Objects.equals(this.sendEmailDelay, templateRecipientsMapInner.sendEmailDelay)&&
        Objects.equals(this.additionalProperties, templateRecipientsMapInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, placeholderName, passcode, subject, message, sendEmail, sendEmailDelay, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateRecipientsMapInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    placeholderName: ").append(toIndentedString(placeholderName)).append("\n");
    sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
    sb.append("    sendEmailDelay: ").append(toIndentedString(sendEmailDelay)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("placeholder_name");
    openapiFields.add("passcode");
    openapiFields.add("subject");
    openapiFields.add("message");
    openapiFields.add("send_email");
    openapiFields.add("send_email_delay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("email");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateRecipientsMapInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TemplateRecipientsMapInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateRecipientsMapInner is not found in the empty JSON string", TemplateRecipientsMapInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TemplateRecipientsMapInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("placeholder_name") != null && !jsonObj.get("placeholder_name").isJsonNull()) && !jsonObj.get("placeholder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placeholder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placeholder_name").toString()));
      }
      if ((jsonObj.get("passcode") != null && !jsonObj.get("passcode").isJsonNull()) && !jsonObj.get("passcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passcode").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateRecipientsMapInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateRecipientsMapInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateRecipientsMapInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateRecipientsMapInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateRecipientsMapInner>() {
           @Override
           public void write(JsonWriter out, TemplateRecipientsMapInner value) throws IOException {
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
           public TemplateRecipientsMapInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TemplateRecipientsMapInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TemplateRecipientsMapInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateRecipientsMapInner
  * @throws IOException if the JSON string is invalid with respect to TemplateRecipientsMapInner
  */
  public static TemplateRecipientsMapInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateRecipientsMapInner.class);
  }

 /**
  * Convert an instance of TemplateRecipientsMapInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

