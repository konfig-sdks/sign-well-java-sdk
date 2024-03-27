# TemplateApi

All URIs are relative to *https://www.signwell.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNew**](TemplateApi.md#createNew) | **POST** /api/v1/document_templates | Create Template |
| [**deleteDocumentTemplate**](TemplateApi.md#deleteDocumentTemplate) | **DELETE** /api/v1/document_templates/{id} | Delete Template |
| [**getTemplateData**](TemplateApi.md#getTemplateData) | **GET** /api/v1/document_templates/{id} | Get Template |
| [**updateExistingTemplate**](TemplateApi.md#updateExistingTemplate) | **PUT** /api/v1/document_templates/{id} | Update Template |


<a name="createNew"></a>
# **createNew**
> TemplateCreateNewResponse createNew().documentTemplateRequest(documentTemplateRequest).execute();

Create Template

Creates a new template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.signwell.com";
    
    configuration.apiKey  = "YOUR API KEY";
    SignWell client = new SignWell(configuration);
    List<FilesMapInner> files = Arrays.asList();
    List<PlaceholdersMapInner> placeholders = Arrays.asList(); // Placeholders are generally job roles that must complete and/or sign the document. For example, a placeholder might be “Client” or “Legal Department”. When a document is created from the template, you assign a person to each placeholder.
    String name = "name_example"; // The name of the template.
    String subject = "subject_example"; // Email subject for the signature request that recipients will see. Defaults to the default system subject or a template subject (if the document is created from a template).
    String message = "message_example"; // Email message for the signature request that recipients will see. Defaults to the default system message or a template message (if the document is created from a template).
    List<CopiedPlaceholdersMapInner> copiedPlaceholders = Arrays.asList(); // Copied placeholders are emailed the final document once it has been completed by all recipients.
    Boolean draft = false; // Whether the template can still be updated before it is ready for usage. If set to `false` the template is marked as `Available` and it will be ready for use. Defaults to `false`.
    Integer expiresIn = 56; // Number of days before the signature request expires. Defaults to the account expiration setting or template expiration (if the document is created from a template).
    Boolean reminders = true; // Whether to send signing reminders to recipients. Reminders are sent on day 3, day 6, and day 10 if set to `true`. Defaults to `true`.
    Boolean applySigningOrder = false; // When set to `true` recipients will sign one at a time in the order of the `recipients` collection of this request.
    UUID apiApplicationId = UUID.randomUUID(); // Unique identifier for API Application settings to use. API Applications are optional and mainly used when isolating OAuth apps or for more control over embedded API settings
    Boolean textTags = false; // An alternative way (if you can’t use the recommended way) of placing fields in specific locations of your document by using special text tags. Useful when changing the content of your files changes the location of fields. See API documentation for “Text Tags” for details. Defaults to false.
    String redirectUrl = "redirectUrl_example"; // A URL that recipients are redirected to after successfully signing a document.
    Boolean allowDecline = true; // Whether to allow recipients the option to decline signing a document. If multiple signers are involved in a document, any single recipient can cancel the entire document signing process by declining to sign.
    Boolean allowReassign = true; // In some cases a signer is not the right person to sign and may need to reassign their signing responsibilities to another person. This feature allows them to reassign the document to someone else.
    String declineRedirectUrl = "declineRedirectUrl_example"; // A URL that recipients are redirected to if the document is declined.
    Object metadata = null; // Optional key-value data that can be associated with the document. If set, will be available every time the document data is returned.
    List<List<FieldsForTemplateMapInnerInner>> fields = Arrays.asList(new ArrayList<>()); // Document fields placed on a document for collecting data or signatures from recipients. At least one field must be present in the Create Document request if `draft` is `false` (unless adding a signature page by using `with_signature_page`). Field data should be sent as a 2-dimensional JSON array. One array of fields is needed for each file in the files array. An array of fields can be empty if you have a file that does not contain any fields.
    List<AttachmentRequestsForTemplateMapInner> attachmentRequests = Arrays.asList(); // Attachments that a recipient must upload to complete the signing process. Attachment requests are shown after all document fields have been completed.
    try {
      TemplateCreateNewResponse result = client
              .template
              .createNew(files, placeholders)
              .name(name)
              .subject(subject)
              .message(message)
              .copiedPlaceholders(copiedPlaceholders)
              .draft(draft)
              .expiresIn(expiresIn)
              .reminders(reminders)
              .applySigningOrder(applySigningOrder)
              .apiApplicationId(apiApplicationId)
              .textTags(textTags)
              .redirectUrl(redirectUrl)
              .allowDecline(allowDecline)
              .allowReassign(allowReassign)
              .declineRedirectUrl(declineRedirectUrl)
              .metadata(metadata)
              .fields(fields)
              .attachmentRequests(attachmentRequests)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getArchived());
      System.out.println(result.getEmbeddedEditUrl());
      System.out.println(result.getName());
      System.out.println(result.getRequesterEmailAddress());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getTemplateLink());
      System.out.println(result.getAllowDecline());
      System.out.println(result.getAllowReassign());
      System.out.println(result.getApiApplicationId());
      System.out.println(result.getDeclineRedirectUrl());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getReminders());
      System.out.println(result.getMetadata());
      System.out.println(result.getApplySigningOrder());
      System.out.println(result.getMessage());
      System.out.println(result.getSubject());
      System.out.println(result.getFields());
      System.out.println(result.getFiles());
      System.out.println(result.getCopiedPlaceholders());
      System.out.println(result.getPlaceholders());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateCreateNewResponse> response = client
              .template
              .createNew(files, placeholders)
              .name(name)
              .subject(subject)
              .message(message)
              .copiedPlaceholders(copiedPlaceholders)
              .draft(draft)
              .expiresIn(expiresIn)
              .reminders(reminders)
              .applySigningOrder(applySigningOrder)
              .apiApplicationId(apiApplicationId)
              .textTags(textTags)
              .redirectUrl(redirectUrl)
              .allowDecline(allowDecline)
              .allowReassign(allowReassign)
              .declineRedirectUrl(declineRedirectUrl)
              .metadata(metadata)
              .fields(fields)
              .attachmentRequests(attachmentRequests)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentTemplateRequest** | [**DocumentTemplateRequest**](DocumentTemplateRequest.md)|  | [optional] |

### Return type

[**TemplateCreateNewResponse**](TemplateCreateNewResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  -  |

<a name="deleteDocumentTemplate"></a>
# **deleteDocumentTemplate**
> deleteDocumentTemplate(id).execute();

Delete Template

Deletes a template. Supply the unique template ID from either a Create Template request or template page URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.signwell.com";
    
    configuration.apiKey  = "YOUR API KEY";
    SignWell client = new SignWell(configuration);
    UUID id = UUID.randomUUID();
    try {
      client
              .template
              .deleteDocumentTemplate(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#deleteDocumentTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .template
              .deleteDocumentTemplate(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#deleteDocumentTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no content |  -  |

<a name="getTemplateData"></a>
# **getTemplateData**
> TemplateGetTemplateDataResponse getTemplateData(id).execute();

Get Template

Returns a template and all associated template data. Supply the unique template ID from either a Create Template request or template page URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.signwell.com";
    
    configuration.apiKey  = "YOUR API KEY";
    SignWell client = new SignWell(configuration);
    UUID id = UUID.randomUUID();
    try {
      TemplateGetTemplateDataResponse result = client
              .template
              .getTemplateData(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getArchived());
      System.out.println(result.getEmbeddedEditUrl());
      System.out.println(result.getName());
      System.out.println(result.getRequesterEmailAddress());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getTemplateLink());
      System.out.println(result.getAllowDecline());
      System.out.println(result.getAllowReassign());
      System.out.println(result.getApiApplicationId());
      System.out.println(result.getDeclineRedirectUrl());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getReminders());
      System.out.println(result.getMetadata());
      System.out.println(result.getApplySigningOrder());
      System.out.println(result.getMessage());
      System.out.println(result.getSubject());
      System.out.println(result.getFields());
      System.out.println(result.getFiles());
      System.out.println(result.getCopiedPlaceholders());
      System.out.println(result.getPlaceholders());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getTemplateData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateGetTemplateDataResponse> response = client
              .template
              .getTemplateData(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getTemplateData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**TemplateGetTemplateDataResponse**](TemplateGetTemplateDataResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="updateExistingTemplate"></a>
# **updateExistingTemplate**
> TemplateUpdateExistingTemplateResponse updateExistingTemplate(id).documentTemplateUpdateRequest(documentTemplateUpdateRequest).execute();

Update Template

Updates an existing template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.signwell.com";
    
    configuration.apiKey  = "YOUR API KEY";
    SignWell client = new SignWell(configuration);
    UUID id = UUID.randomUUID();
    String name = "name_example"; // The name of the template.
    String subject = "subject_example"; // Email subject for the signature request that recipients will see. Defaults to the default system subject or a template subject (if the document is created from a template).
    String message = "message_example"; // Email message for the signature request that recipients will see. Defaults to the default system message or a template message (if the document is created from a template).
    Boolean draft = false; // Whether the template can still be updated before it is ready for usage. If set to `false` the template is marked as `Available` and it will be ready for use. Defaults to `false`.
    Integer expiresIn = 56; // Number of days before the signature request expires. Defaults to the account expiration setting or template expiration (if the document is created from a template).
    Boolean reminders = true; // Whether to send signing reminders to recipients. Reminders are sent on day 3, day 6, and day 10 if set to `true`. Defaults to `true`.
    Boolean applySigningOrder = false; // When set to `true` recipients will sign one at a time in the order of the `recipients` collection of this request.
    UUID apiApplicationId = UUID.randomUUID(); // Unique identifier for API Application settings to use. API Applications are optional and mainly used when isolating OAuth apps or for more control over embedded API settings
    String redirectUrl = "redirectUrl_example"; // A URL that recipients are redirected to after successfully signing a document.
    Boolean allowDecline = true; // Whether to allow recipients the option to decline signing a document. If multiple signers are involved in a document, any single recipient can cancel the entire document signing process by declining to sign.
    Boolean allowReassign = true; // In some cases a signer is not the right person to sign and may need to reassign their signing responsibilities to another person. This feature allows them to reassign the document to someone else.
    String declineRedirectUrl = "declineRedirectUrl_example"; // A URL that recipients are redirected to if the document is declined.
    Object metadata = null; // Optional key-value data that can be associated with the document. If set, will be available every time the document data is returned.
    try {
      TemplateUpdateExistingTemplateResponse result = client
              .template
              .updateExistingTemplate(id)
              .name(name)
              .subject(subject)
              .message(message)
              .draft(draft)
              .expiresIn(expiresIn)
              .reminders(reminders)
              .applySigningOrder(applySigningOrder)
              .apiApplicationId(apiApplicationId)
              .redirectUrl(redirectUrl)
              .allowDecline(allowDecline)
              .allowReassign(allowReassign)
              .declineRedirectUrl(declineRedirectUrl)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getArchived());
      System.out.println(result.getEmbeddedEditUrl());
      System.out.println(result.getName());
      System.out.println(result.getRequesterEmailAddress());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getTemplateLink());
      System.out.println(result.getAllowDecline());
      System.out.println(result.getAllowReassign());
      System.out.println(result.getApiApplicationId());
      System.out.println(result.getDeclineRedirectUrl());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getReminders());
      System.out.println(result.getMetadata());
      System.out.println(result.getApplySigningOrder());
      System.out.println(result.getMessage());
      System.out.println(result.getSubject());
      System.out.println(result.getFields());
      System.out.println(result.getFiles());
      System.out.println(result.getCopiedPlaceholders());
      System.out.println(result.getPlaceholders());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#updateExistingTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateUpdateExistingTemplateResponse> response = client
              .template
              .updateExistingTemplate(id)
              .name(name)
              .subject(subject)
              .message(message)
              .draft(draft)
              .expiresIn(expiresIn)
              .reminders(reminders)
              .applySigningOrder(applySigningOrder)
              .apiApplicationId(apiApplicationId)
              .redirectUrl(redirectUrl)
              .allowDecline(allowDecline)
              .allowReassign(allowReassign)
              .declineRedirectUrl(declineRedirectUrl)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#updateExistingTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **documentTemplateUpdateRequest** | [**DocumentTemplateUpdateRequest**](DocumentTemplateUpdateRequest.md)|  | [optional] |

### Return type

[**TemplateUpdateExistingTemplateResponse**](TemplateUpdateExistingTemplateResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |

