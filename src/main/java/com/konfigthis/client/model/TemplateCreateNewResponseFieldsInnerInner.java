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
 * TemplateCreateNewResponseFieldsInnerInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TemplateCreateNewResponseFieldsInnerInner {
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

  public static final String SERIALIZED_NAME_DATE_FORMAT = "date_format";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_FORMULA = "formula";
  @SerializedName(SERIALIZED_NAME_FORMULA)
  private String formula;

  public static final String SERIALIZED_NAME_LOCK_SIGN_DATE = "lock_sign_date";
  @SerializedName(SERIALIZED_NAME_LOCK_SIGN_DATE)
  private Boolean lockSignDate;

  public static final String SERIALIZED_NAME_PLACEHOLDER_NAME = "placeholder_name";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER_NAME)
  private String placeholderName;

  public static final String SERIALIZED_NAME_FIXED_WIDTH = "fixed_width";
  @SerializedName(SERIALIZED_NAME_FIXED_WIDTH)
  private Boolean fixedWidth;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_VALIDATION = "validation";
  @SerializedName(SERIALIZED_NAME_VALIDATION)
  private String validation;

  public TemplateCreateNewResponseFieldsInnerInner() {
  }

  public TemplateCreateNewResponseFieldsInnerInner apiId(String apiId) {
    
    
    
    
    this.apiId = apiId;
    return this;
  }

   /**
   * Get apiId
   * @return apiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DateField_1", value = "")

  public String getApiId() {
    return apiId;
  }


  public void setApiId(String apiId) {
    
    
    
    this.apiId = apiId;
  }


  public TemplateCreateNewResponseFieldsInnerInner height(String height) {
    
    
    
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19.0", value = "")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    
    
    
    this.height = height;
  }


  public TemplateCreateNewResponseFieldsInnerInner page(Double page) {
    
    
    
    
    this.page = page;
    return this;
  }

  public TemplateCreateNewResponseFieldsInnerInner page(Integer page) {
    
    
    
    
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


  public TemplateCreateNewResponseFieldsInnerInner required(Boolean required) {
    
    
    
    
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


  public TemplateCreateNewResponseFieldsInnerInner type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "date", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public TemplateCreateNewResponseFieldsInnerInner value(String value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021/05/06", value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    
    
    
    this.value = value;
  }


  public TemplateCreateNewResponseFieldsInnerInner width(String width) {
    
    
    
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "86.0", value = "")

  public String getWidth() {
    return width;
  }


  public void setWidth(String width) {
    
    
    
    this.width = width;
  }


  public TemplateCreateNewResponseFieldsInnerInner x(Double x) {
    
    
    
    
    this.x = x;
    return this;
  }

  public TemplateCreateNewResponseFieldsInnerInner x(Integer x) {
    
    
    
    
    this.x = x.doubleValue();
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "230", value = "")

  public Double getX() {
    return x;
  }


  public void setX(Double x) {
    
    
    
    this.x = x;
  }


  public TemplateCreateNewResponseFieldsInnerInner y(Double y) {
    
    
    
    
    this.y = y;
    return this;
  }

  public TemplateCreateNewResponseFieldsInnerInner y(Integer y) {
    
    
    
    
    this.y = y.doubleValue();
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60", value = "")

  public Double getY() {
    return y;
  }


  public void setY(Double y) {
    
    
    
    this.y = y;
  }


  public TemplateCreateNewResponseFieldsInnerInner dateFormat(String dateFormat) {
    
    
    
    
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "YYYY/MM/DD", value = "")

  public String getDateFormat() {
    return dateFormat;
  }


  public void setDateFormat(String dateFormat) {
    
    
    
    this.dateFormat = dateFormat;
  }


  public TemplateCreateNewResponseFieldsInnerInner formula(String formula) {
    
    
    
    
    this.formula = formula;
    return this;
  }

   /**
   * Get formula
   * @return formula
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getFormula() {
    return formula;
  }


  public void setFormula(String formula) {
    
    
    
    this.formula = formula;
  }


  public TemplateCreateNewResponseFieldsInnerInner lockSignDate(Boolean lockSignDate) {
    
    
    
    
    this.lockSignDate = lockSignDate;
    return this;
  }

   /**
   * Get lockSignDate
   * @return lockSignDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getLockSignDate() {
    return lockSignDate;
  }


  public void setLockSignDate(Boolean lockSignDate) {
    
    
    
    this.lockSignDate = lockSignDate;
  }


  public TemplateCreateNewResponseFieldsInnerInner placeholderName(String placeholderName) {
    
    
    
    
    this.placeholderName = placeholderName;
    return this;
  }

   /**
   * Get placeholderName
   * @return placeholderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Placeholder One", value = "")

  public String getPlaceholderName() {
    return placeholderName;
  }


  public void setPlaceholderName(String placeholderName) {
    
    
    
    this.placeholderName = placeholderName;
  }


  public TemplateCreateNewResponseFieldsInnerInner fixedWidth(Boolean fixedWidth) {
    
    
    
    
    this.fixedWidth = fixedWidth;
    return this;
  }

   /**
   * Get fixedWidth
   * @return fixedWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getFixedWidth() {
    return fixedWidth;
  }


  public void setFixedWidth(Boolean fixedWidth) {
    
    
    
    this.fixedWidth = fixedWidth;
  }


  public TemplateCreateNewResponseFieldsInnerInner label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "label", value = "")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
  }


  public TemplateCreateNewResponseFieldsInnerInner validation(String validation) {
    
    
    
    
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "numbers", value = "")

  public String getValidation() {
    return validation;
  }


  public void setValidation(String validation) {
    
    
    
    this.validation = validation;
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
   * @return the TemplateCreateNewResponseFieldsInnerInner instance itself
   */
  public TemplateCreateNewResponseFieldsInnerInner putAdditionalProperty(String key, Object value) {
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
    TemplateCreateNewResponseFieldsInnerInner templateCreateNewResponseFieldsInnerInner = (TemplateCreateNewResponseFieldsInnerInner) o;
    return Objects.equals(this.apiId, templateCreateNewResponseFieldsInnerInner.apiId) &&
        Objects.equals(this.height, templateCreateNewResponseFieldsInnerInner.height) &&
        Objects.equals(this.page, templateCreateNewResponseFieldsInnerInner.page) &&
        Objects.equals(this.required, templateCreateNewResponseFieldsInnerInner.required) &&
        Objects.equals(this.type, templateCreateNewResponseFieldsInnerInner.type) &&
        Objects.equals(this.value, templateCreateNewResponseFieldsInnerInner.value) &&
        Objects.equals(this.width, templateCreateNewResponseFieldsInnerInner.width) &&
        Objects.equals(this.x, templateCreateNewResponseFieldsInnerInner.x) &&
        Objects.equals(this.y, templateCreateNewResponseFieldsInnerInner.y) &&
        Objects.equals(this.dateFormat, templateCreateNewResponseFieldsInnerInner.dateFormat) &&
        Objects.equals(this.formula, templateCreateNewResponseFieldsInnerInner.formula) &&
        Objects.equals(this.lockSignDate, templateCreateNewResponseFieldsInnerInner.lockSignDate) &&
        Objects.equals(this.placeholderName, templateCreateNewResponseFieldsInnerInner.placeholderName) &&
        Objects.equals(this.fixedWidth, templateCreateNewResponseFieldsInnerInner.fixedWidth) &&
        Objects.equals(this.label, templateCreateNewResponseFieldsInnerInner.label) &&
        Objects.equals(this.validation, templateCreateNewResponseFieldsInnerInner.validation)&&
        Objects.equals(this.additionalProperties, templateCreateNewResponseFieldsInnerInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiId, height, page, required, type, value, width, x, y, dateFormat, formula, lockSignDate, placeholderName, fixedWidth, label, validation, additionalProperties);
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
    sb.append("class TemplateCreateNewResponseFieldsInnerInner {\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    lockSignDate: ").append(toIndentedString(lockSignDate)).append("\n");
    sb.append("    placeholderName: ").append(toIndentedString(placeholderName)).append("\n");
    sb.append("    fixedWidth: ").append(toIndentedString(fixedWidth)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
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
    openapiFields.add("date_format");
    openapiFields.add("formula");
    openapiFields.add("lock_sign_date");
    openapiFields.add("placeholder_name");
    openapiFields.add("fixed_width");
    openapiFields.add("label");
    openapiFields.add("validation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateCreateNewResponseFieldsInnerInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TemplateCreateNewResponseFieldsInnerInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateCreateNewResponseFieldsInnerInner is not found in the empty JSON string", TemplateCreateNewResponseFieldsInnerInner.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("date_format") != null && !jsonObj.get("date_format").isJsonNull()) && !jsonObj.get("date_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_format").toString()));
      }
      if ((jsonObj.get("formula") != null && !jsonObj.get("formula").isJsonNull()) && !jsonObj.get("formula").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formula` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formula").toString()));
      }
      if ((jsonObj.get("placeholder_name") != null && !jsonObj.get("placeholder_name").isJsonNull()) && !jsonObj.get("placeholder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placeholder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placeholder_name").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("validation") != null && !jsonObj.get("validation").isJsonNull()) && !jsonObj.get("validation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateCreateNewResponseFieldsInnerInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateCreateNewResponseFieldsInnerInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateCreateNewResponseFieldsInnerInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateCreateNewResponseFieldsInnerInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateCreateNewResponseFieldsInnerInner>() {
           @Override
           public void write(JsonWriter out, TemplateCreateNewResponseFieldsInnerInner value) throws IOException {
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
           public TemplateCreateNewResponseFieldsInnerInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TemplateCreateNewResponseFieldsInnerInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TemplateCreateNewResponseFieldsInnerInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateCreateNewResponseFieldsInnerInner
  * @throws IOException if the JSON string is invalid with respect to TemplateCreateNewResponseFieldsInnerInner
  */
  public static TemplateCreateNewResponseFieldsInnerInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateCreateNewResponseFieldsInnerInner.class);
  }

 /**
  * Convert an instance of TemplateCreateNewResponseFieldsInnerInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

