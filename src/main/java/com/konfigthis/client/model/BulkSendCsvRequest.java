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
import java.util.ArrayList;
import java.util.List;
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
 * BulkSendCsvRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BulkSendCsvRequest {
  public static final String SERIALIZED_NAME_TEMPLATE_IDS = "template_ids";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IDS)
  private List<UUID> templateIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_BULK_SEND_CSV = "bulk_send_csv";
  @SerializedName(SERIALIZED_NAME_BULK_SEND_CSV)
  private byte[] bulkSendCsv;

  public BulkSendCsvRequest() {
  }

  public BulkSendCsvRequest templateIds(List<UUID> templateIds) {
    
    
    
    
    this.templateIds = templateIds;
    return this;
  }

  public BulkSendCsvRequest addTemplateIdsItem(UUID templateIdsItem) {
    this.templateIds.add(templateIdsItem);
    return this;
  }

   /**
   * Specify one or more templates to generate a single blank CSV file that will contain available columns for your recipient data. The template_ids[] parameter is an array of template IDs (e.g.,&#x60;/?template_ids[]&#x3D;5a67dbd7-928a-4ea0-a7e2-e476a0eb045f&amp;template_ids[]&#x3D;d7315111-c671-4b15-8354-c9a19bbaefa0&#x60;). Each ID should be a separate parameter in the query string.
   * @return templateIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specify one or more templates to generate a single blank CSV file that will contain available columns for your recipient data. The template_ids[] parameter is an array of template IDs (e.g.,`/?template_ids[]=5a67dbd7-928a-4ea0-a7e2-e476a0eb045f&template_ids[]=d7315111-c671-4b15-8354-c9a19bbaefa0`). Each ID should be a separate parameter in the query string.")

  public List<UUID> getTemplateIds() {
    return templateIds;
  }


  public void setTemplateIds(List<UUID> templateIds) {
    
    
    
    this.templateIds = templateIds;
  }


  public BulkSendCsvRequest bulkSendCsv(byte[] bulkSendCsv) {
    
    
    
    
    this.bulkSendCsv = bulkSendCsv;
    return this;
  }

   /**
   * A RFC 4648 base64 string of the template CSV file to be validated.
   * @return bulkSendCsv
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A RFC 4648 base64 string of the template CSV file to be validated.")

  public byte[] getBulkSendCsv() {
    return bulkSendCsv;
  }


  public void setBulkSendCsv(byte[] bulkSendCsv) {
    
    
    
    this.bulkSendCsv = bulkSendCsv;
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
   * @return the BulkSendCsvRequest instance itself
   */
  public BulkSendCsvRequest putAdditionalProperty(String key, Object value) {
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
    BulkSendCsvRequest bulkSendCsvRequest = (BulkSendCsvRequest) o;
    return Objects.equals(this.templateIds, bulkSendCsvRequest.templateIds) &&
        Arrays.equals(this.bulkSendCsv, bulkSendCsvRequest.bulkSendCsv)&&
        Objects.equals(this.additionalProperties, bulkSendCsvRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateIds, Arrays.hashCode(bulkSendCsv), additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendCsvRequest {\n");
    sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
    sb.append("    bulkSendCsv: ").append(toIndentedString(bulkSendCsv)).append("\n");
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
    openapiFields.add("template_ids");
    openapiFields.add("bulk_send_csv");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("template_ids");
    openapiRequiredFields.add("bulk_send_csv");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BulkSendCsvRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BulkSendCsvRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkSendCsvRequest is not found in the empty JSON string", BulkSendCsvRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BulkSendCsvRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("template_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("template_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_ids` to be an array in the JSON string but got `%s`", jsonObj.get("template_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkSendCsvRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkSendCsvRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkSendCsvRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkSendCsvRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkSendCsvRequest>() {
           @Override
           public void write(JsonWriter out, BulkSendCsvRequest value) throws IOException {
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
           public BulkSendCsvRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BulkSendCsvRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BulkSendCsvRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BulkSendCsvRequest
  * @throws IOException if the JSON string is invalid with respect to BulkSendCsvRequest
  */
  public static BulkSendCsvRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkSendCsvRequest.class);
  }

 /**
  * Convert an instance of BulkSendCsvRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
