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
 * BulkSendValidateCsvResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BulkSendValidateCsvResponse {
  public static final String SERIALIZED_NAME_BULK_SEND_CSV = "bulk_send_csv";
  @SerializedName(SERIALIZED_NAME_BULK_SEND_CSV)
  private String bulkSendCsv;

  public static final String SERIALIZED_NAME_TEMPLATE_IDS = "template_ids";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IDS)
  private List<String> templateIds = null;

  public static final String SERIALIZED_NAME_SKIP_ROW_ERRORS = "skip_row_errors";
  @SerializedName(SERIALIZED_NAME_SKIP_ROW_ERRORS)
  private Boolean skipRowErrors;

  public static final String SERIALIZED_NAME_API_APPLICATION_ID = "api_application_id";
  @SerializedName(SERIALIZED_NAME_API_APPLICATION_ID)
  private String apiApplicationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_APPLY_SIGNING_ORDER = "apply_signing_order";
  @SerializedName(SERIALIZED_NAME_APPLY_SIGNING_ORDER)
  private Boolean applySigningOrder;

  public BulkSendValidateCsvResponse() {
  }

  public BulkSendValidateCsvResponse bulkSendCsv(String bulkSendCsv) {
    
    
    
    
    this.bulkSendCsv = bulkSendCsv;
    return this;
  }

   /**
   * Get bulkSendCsv
   * @return bulkSendCsv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IkRvY3VtZW50IFNlbmRlciBFbWFpbCIsJ0RvY3VtZW50IFNlbmRlciBOYW1lJywvXERvY3VtZW50LSBTZW5kZXIgPUxhYmVsLEBSZWNpcGllbnRfIEVtYWlsLFJlY2lwaWVudCAqTmFtZSxgUmVjaXBpZW50fiFAIyQlXiYqKCl7fVtdPD4uPyBMYWJlbGAKc2VuZGVyQHNpZ253ZWxsLmNvbSxTZW5kZXIsU2VuZGVyLHJlY2lwaWVudEBzaWdud2VsbC5jb20sUmVjaXBpZW50LFJlY2lwaWVudAplbWFpbEBzb21lLmNvbSwsLGVtYWlsMkBzb21lLmNvbQo=", value = "")

  public String getBulkSendCsv() {
    return bulkSendCsv;
  }


  public void setBulkSendCsv(String bulkSendCsv) {
    
    
    
    this.bulkSendCsv = bulkSendCsv;
  }


  public BulkSendValidateCsvResponse templateIds(List<String> templateIds) {
    
    
    
    
    this.templateIds = templateIds;
    return this;
  }

  public BulkSendValidateCsvResponse addTemplateIdsItem(String templateIdsItem) {
    if (this.templateIds == null) {
      this.templateIds = new ArrayList<>();
    }
    this.templateIds.add(templateIdsItem);
    return this;
  }

   /**
   * Get templateIds
   * @return templateIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTemplateIds() {
    return templateIds;
  }


  public void setTemplateIds(List<String> templateIds) {
    
    
    
    this.templateIds = templateIds;
  }


  public BulkSendValidateCsvResponse skipRowErrors(Boolean skipRowErrors) {
    
    
    
    
    this.skipRowErrors = skipRowErrors;
    return this;
  }

   /**
   * Get skipRowErrors
   * @return skipRowErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getSkipRowErrors() {
    return skipRowErrors;
  }


  public void setSkipRowErrors(Boolean skipRowErrors) {
    
    
    
    this.skipRowErrors = skipRowErrors;
  }


  public BulkSendValidateCsvResponse apiApplicationId(String apiApplicationId) {
    
    
    
    
    this.apiApplicationId = apiApplicationId;
    return this;
  }

   /**
   * Get apiApplicationId
   * @return apiApplicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiApplicationId() {
    return apiApplicationId;
  }


  public void setApiApplicationId(String apiApplicationId) {
    
    
    
    this.apiApplicationId = apiApplicationId;
  }


  public BulkSendValidateCsvResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "relationship_ambiguous/placeat.pptx", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public BulkSendValidateCsvResponse subject(String subject) {
    
    
    
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Please complete relationship_ambiguous/placeat.pptx", value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    
    
    
    this.subject = subject;
  }


  public BulkSendValidateCsvResponse message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<p>Hey there,</p><p>&nbsp;</p><p>Please review and complete this document. You can click on the document below to get started.</p>", value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public BulkSendValidateCsvResponse applySigningOrder(Boolean applySigningOrder) {
    
    
    
    
    this.applySigningOrder = applySigningOrder;
    return this;
  }

   /**
   * Get applySigningOrder
   * @return applySigningOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getApplySigningOrder() {
    return applySigningOrder;
  }


  public void setApplySigningOrder(Boolean applySigningOrder) {
    
    
    
    this.applySigningOrder = applySigningOrder;
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
   * @return the BulkSendValidateCsvResponse instance itself
   */
  public BulkSendValidateCsvResponse putAdditionalProperty(String key, Object value) {
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
    BulkSendValidateCsvResponse bulkSendValidateCsvResponse = (BulkSendValidateCsvResponse) o;
    return Objects.equals(this.bulkSendCsv, bulkSendValidateCsvResponse.bulkSendCsv) &&
        Objects.equals(this.templateIds, bulkSendValidateCsvResponse.templateIds) &&
        Objects.equals(this.skipRowErrors, bulkSendValidateCsvResponse.skipRowErrors) &&
        Objects.equals(this.apiApplicationId, bulkSendValidateCsvResponse.apiApplicationId) &&
        Objects.equals(this.name, bulkSendValidateCsvResponse.name) &&
        Objects.equals(this.subject, bulkSendValidateCsvResponse.subject) &&
        Objects.equals(this.message, bulkSendValidateCsvResponse.message) &&
        Objects.equals(this.applySigningOrder, bulkSendValidateCsvResponse.applySigningOrder)&&
        Objects.equals(this.additionalProperties, bulkSendValidateCsvResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkSendCsv, templateIds, skipRowErrors, apiApplicationId, name, subject, message, applySigningOrder, additionalProperties);
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
    sb.append("class BulkSendValidateCsvResponse {\n");
    sb.append("    bulkSendCsv: ").append(toIndentedString(bulkSendCsv)).append("\n");
    sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
    sb.append("    skipRowErrors: ").append(toIndentedString(skipRowErrors)).append("\n");
    sb.append("    apiApplicationId: ").append(toIndentedString(apiApplicationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    applySigningOrder: ").append(toIndentedString(applySigningOrder)).append("\n");
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
    openapiFields.add("bulk_send_csv");
    openapiFields.add("template_ids");
    openapiFields.add("skip_row_errors");
    openapiFields.add("api_application_id");
    openapiFields.add("name");
    openapiFields.add("subject");
    openapiFields.add("message");
    openapiFields.add("apply_signing_order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BulkSendValidateCsvResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BulkSendValidateCsvResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkSendValidateCsvResponse is not found in the empty JSON string", BulkSendValidateCsvResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("bulk_send_csv") != null && !jsonObj.get("bulk_send_csv").isJsonNull()) && !jsonObj.get("bulk_send_csv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bulk_send_csv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bulk_send_csv").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("template_ids") != null && !jsonObj.get("template_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_ids` to be an array in the JSON string but got `%s`", jsonObj.get("template_ids").toString()));
      }
      if (!jsonObj.get("api_application_id").isJsonNull() && (jsonObj.get("api_application_id") != null && !jsonObj.get("api_application_id").isJsonNull()) && !jsonObj.get("api_application_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_application_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_application_id").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkSendValidateCsvResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkSendValidateCsvResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkSendValidateCsvResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkSendValidateCsvResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkSendValidateCsvResponse>() {
           @Override
           public void write(JsonWriter out, BulkSendValidateCsvResponse value) throws IOException {
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
           public BulkSendValidateCsvResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BulkSendValidateCsvResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BulkSendValidateCsvResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BulkSendValidateCsvResponse
  * @throws IOException if the JSON string is invalid with respect to BulkSendValidateCsvResponse
  */
  public static BulkSendValidateCsvResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkSendValidateCsvResponse.class);
  }

 /**
  * Convert an instance of BulkSendValidateCsvResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
