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
 * WebhooksRegisterCallbackUrlRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhooksRegisterCallbackUrlRequest {
  public static final String SERIALIZED_NAME_CALLBACK_URL = "callback_url";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_API_APPLICATION_ID = "api_application_id";
  @SerializedName(SERIALIZED_NAME_API_APPLICATION_ID)
  private UUID apiApplicationId;

  public WebhooksRegisterCallbackUrlRequest() {
  }

  public WebhooksRegisterCallbackUrlRequest callbackUrl(String callbackUrl) {
    
    
    
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * URL that we will post document events to.
   * @return callbackUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "URL that we will post document events to.")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    
    
    
    this.callbackUrl = callbackUrl;
  }


  public WebhooksRegisterCallbackUrlRequest apiApplicationId(UUID apiApplicationId) {
    
    
    
    
    this.apiApplicationId = apiApplicationId;
    return this;
  }

   /**
   * Unique identifier for the API Application.
   * @return apiApplicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the API Application.")

  public UUID getApiApplicationId() {
    return apiApplicationId;
  }


  public void setApiApplicationId(UUID apiApplicationId) {
    
    
    
    this.apiApplicationId = apiApplicationId;
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
   * @return the WebhooksRegisterCallbackUrlRequest instance itself
   */
  public WebhooksRegisterCallbackUrlRequest putAdditionalProperty(String key, Object value) {
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
    WebhooksRegisterCallbackUrlRequest webhooksRegisterCallbackUrlRequest = (WebhooksRegisterCallbackUrlRequest) o;
    return Objects.equals(this.callbackUrl, webhooksRegisterCallbackUrlRequest.callbackUrl) &&
        Objects.equals(this.apiApplicationId, webhooksRegisterCallbackUrlRequest.apiApplicationId)&&
        Objects.equals(this.additionalProperties, webhooksRegisterCallbackUrlRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, apiApplicationId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksRegisterCallbackUrlRequest {\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    apiApplicationId: ").append(toIndentedString(apiApplicationId)).append("\n");
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
    openapiFields.add("callback_url");
    openapiFields.add("api_application_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("callback_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhooksRegisterCallbackUrlRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhooksRegisterCallbackUrlRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhooksRegisterCallbackUrlRequest is not found in the empty JSON string", WebhooksRegisterCallbackUrlRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhooksRegisterCallbackUrlRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("callback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callback_url").toString()));
      }
      if ((jsonObj.get("api_application_id") != null && !jsonObj.get("api_application_id").isJsonNull()) && !jsonObj.get("api_application_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_application_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_application_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhooksRegisterCallbackUrlRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhooksRegisterCallbackUrlRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhooksRegisterCallbackUrlRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhooksRegisterCallbackUrlRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhooksRegisterCallbackUrlRequest>() {
           @Override
           public void write(JsonWriter out, WebhooksRegisterCallbackUrlRequest value) throws IOException {
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
           public WebhooksRegisterCallbackUrlRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhooksRegisterCallbackUrlRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhooksRegisterCallbackUrlRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhooksRegisterCallbackUrlRequest
  * @throws IOException if the JSON string is invalid with respect to WebhooksRegisterCallbackUrlRequest
  */
  public static WebhooksRegisterCallbackUrlRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhooksRegisterCallbackUrlRequest.class);
  }

 /**
  * Convert an instance of WebhooksRegisterCallbackUrlRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

