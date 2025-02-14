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
 * DocumentGetDocumentDataResponseFieldsInnerInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DocumentGetDocumentDataResponseFieldsInnerInner {
  public static final String SERIALIZED_NAME_API_ID = "api_id";
  @SerializedName(SERIALIZED_NAME_API_ID)
  private String apiId;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Double page;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private String width;

  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private Double x;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private Double y;

  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public DocumentGetDocumentDataResponseFieldsInnerInner() {
  }

  public DocumentGetDocumentDataResponseFieldsInnerInner apiId(String apiId) {
    
    
    
    
    this.apiId = apiId;
    return this;
  }

   /**
   * Get apiId
   * @return apiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Signature_1", value = "")

  public String getApiId() {
    return apiId;
  }


  public void setApiId(String apiId) {
    
    
    
    this.apiId = apiId;
  }


  public DocumentGetDocumentDataResponseFieldsInnerInner height(String height) {
    
    
    
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "32.0", value = "")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    
    
    
    this.height = height;
  }


  public DocumentGetDocumentDataResponseFieldsInnerInner page(Double page) {
    
    
    
    
    this.page = page;
    return this;
  }

  public DocumentGetDocumentDataResponseFieldsInnerInner page(Integer page) {
    
    
    
    
    this.page = page.doubleValue();
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Double getPage() {
    return page;
  }


  public void setPage(Double page) {
    
    
    
    this.page = page;
  }


  public DocumentGetDocumentDataResponseFieldsInnerInner required(Boolean required) {
    
    
    
    
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    
    
    
    this.required = required;
  }


  public DocumentGetDocumentDataResponseFieldsInnerInner type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "signature", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public DocumentGetDocumentDataResponseFieldsInnerInner value(String value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    
    
    
    this.value = value;
  }


  public DocumentGetDocumentDataResponseFieldsInnerInner width(String width) {
    
    
    
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "112.0", value = "")

  public String getWidth() {
    return width;
  }


  public void setWidth(String width) {
    
    
    
    this.width = width;
  }


  public DocumentGetDocumentDataResponseFieldsInnerInner x(Double x) {
    
    
    
    
    this.x = x;
    return this;
  }

  public DocumentGetDocumentDataResponseFieldsInnerInner x(Integer x) {
    
    
    
    
    this.x = x.doubleValue();
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.1", value = "")

  public Double getX() {
    return x;
  }


  public void setX(Double x) {
    
    
    
    this.x = x;
  }


  public DocumentGetDocumentDataResponseFieldsInnerInner y(Double y) {
    
    
    
    
    this.y = y;
    return this;
  }

  public DocumentGetDocumentDataResponseFieldsInnerInner y(Integer y) {
    
    
    
    
    this.y = y.doubleValue();
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.1", value = "")

  public Double getY() {
    return y;
  }


  public void setY(Double y) {
    
    
    
    this.y = y;
  }


  public DocumentGetDocumentDataResponseFieldsInnerInner recipientId(String recipientId) {
    
    
    
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Get recipientId
   * @return recipientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6cdc0bda-ab39-4a71-8eda-8d5cd29ef0b3", value = "")

  public String getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(String recipientId) {
    
    
    
    this.recipientId = recipientId;
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
   * @return the DocumentGetDocumentDataResponseFieldsInnerInner instance itself
   */
  public DocumentGetDocumentDataResponseFieldsInnerInner putAdditionalProperty(String key, Object value) {
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
    DocumentGetDocumentDataResponseFieldsInnerInner documentGetDocumentDataResponseFieldsInnerInner = (DocumentGetDocumentDataResponseFieldsInnerInner) o;
    return Objects.equals(this.apiId, documentGetDocumentDataResponseFieldsInnerInner.apiId) &&
        Objects.equals(this.height, documentGetDocumentDataResponseFieldsInnerInner.height) &&
        Objects.equals(this.page, documentGetDocumentDataResponseFieldsInnerInner.page) &&
        Objects.equals(this.required, documentGetDocumentDataResponseFieldsInnerInner.required) &&
        Objects.equals(this.type, documentGetDocumentDataResponseFieldsInnerInner.type) &&
        Objects.equals(this.value, documentGetDocumentDataResponseFieldsInnerInner.value) &&
        Objects.equals(this.width, documentGetDocumentDataResponseFieldsInnerInner.width) &&
        Objects.equals(this.x, documentGetDocumentDataResponseFieldsInnerInner.x) &&
        Objects.equals(this.y, documentGetDocumentDataResponseFieldsInnerInner.y) &&
        Objects.equals(this.recipientId, documentGetDocumentDataResponseFieldsInnerInner.recipientId)&&
        Objects.equals(this.additionalProperties, documentGetDocumentDataResponseFieldsInnerInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiId, height, page, required, type, value, width, x, y, recipientId, additionalProperties);
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
    sb.append("class DocumentGetDocumentDataResponseFieldsInnerInner {\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
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
    openapiFields.add("api_id");
    openapiFields.add("height");
    openapiFields.add("page");
    openapiFields.add("required");
    openapiFields.add("type");
    openapiFields.add("value");
    openapiFields.add("width");
    openapiFields.add("x");
    openapiFields.add("y");
    openapiFields.add("recipient_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentGetDocumentDataResponseFieldsInnerInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocumentGetDocumentDataResponseFieldsInnerInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentGetDocumentDataResponseFieldsInnerInner is not found in the empty JSON string", DocumentGetDocumentDataResponseFieldsInnerInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("api_id") != null && !jsonObj.get("api_id").isJsonNull()) && !jsonObj.get("api_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_id").toString()));
      }
      if ((jsonObj.get("height") != null && !jsonObj.get("height").isJsonNull()) && !jsonObj.get("height").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `height` to be a primitive type in the JSON string but got `%s`", jsonObj.get("height").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("value").isJsonNull() && (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("width") != null && !jsonObj.get("width").isJsonNull()) && !jsonObj.get("width").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `width` to be a primitive type in the JSON string but got `%s`", jsonObj.get("width").toString()));
      }
      if ((jsonObj.get("recipient_id") != null && !jsonObj.get("recipient_id").isJsonNull()) && !jsonObj.get("recipient_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentGetDocumentDataResponseFieldsInnerInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentGetDocumentDataResponseFieldsInnerInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentGetDocumentDataResponseFieldsInnerInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentGetDocumentDataResponseFieldsInnerInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentGetDocumentDataResponseFieldsInnerInner>() {
           @Override
           public void write(JsonWriter out, DocumentGetDocumentDataResponseFieldsInnerInner value) throws IOException {
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
           public DocumentGetDocumentDataResponseFieldsInnerInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DocumentGetDocumentDataResponseFieldsInnerInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocumentGetDocumentDataResponseFieldsInnerInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentGetDocumentDataResponseFieldsInnerInner
  * @throws IOException if the JSON string is invalid with respect to DocumentGetDocumentDataResponseFieldsInnerInner
  */
  public static DocumentGetDocumentDataResponseFieldsInnerInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentGetDocumentDataResponseFieldsInnerInner.class);
  }

 /**
  * Convert an instance of DocumentGetDocumentDataResponseFieldsInnerInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

