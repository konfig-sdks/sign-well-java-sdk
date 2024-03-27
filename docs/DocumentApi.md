# DocumentApi

All URIs are relative to *https://www.signwell.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFromTemplate**](DocumentApi.md#createFromTemplate) | **POST** /api/v1/document_templates/documents | Create Document from Template |
| [**createNewDocument**](DocumentApi.md#createNewDocument) | **POST** /api/v1/documents | Create Document |
| [**deleteDocument**](DocumentApi.md#deleteDocument) | **DELETE** /api/v1/documents/{id} | Delete Document |
| [**getCompletedPdf**](DocumentApi.md#getCompletedPdf) | **GET** /api/v1/documents/{id}/completed_pdf | Completed PDF |
| [**getDocumentData**](DocumentApi.md#getDocumentData) | **GET** /api/v1/documents/{id} | Get Document |
| [**sendReminder**](DocumentApi.md#sendReminder) | **POST** /api/v1/documents/{id}/remind | Send Reminder |
| [**updateAndSend**](DocumentApi.md#updateAndSend) | **POST** /api/v1/documents/{id}/send | Update and Send Document |


<a name="createFromTemplate"></a>
# **createFromTemplate**
> DocumentCreateFromTemplateResponse createFromTemplate().documentFromTemplateRequest(documentFromTemplateRequest).execute();

Create Document from Template

Creates and optionally sends a new document for signing. If &#x60;draft&#x60; is set to false the document will not be sent.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.signwell.com";
    
    configuration.apiKey  = "YOUR API KEY";
    SignWell client = new SignWell(configuration);
    List<TemplateRecipientsMapInner> recipients = Arrays.asList(); // Document recipients are people that must complete and/or sign a document. Recipients of the document must be assigned to a placeholder of the template. Recipients will inherit all placeholder fields and settings.
    Boolean testMode = false; // Set to `true` to enable Test Mode. Documents created with Test Mode do not count towards API billing and are not legally binding. Defaults to `false`
    UUID templateId = UUID.randomUUID(); // Use when you have to create a document from a single template. Either :template_id or :template_ids must be present in the request, not both.
    List<String> templateIds = Arrays.asList(); // Use when you have to create a document from multiple templates. Either :template_id or :template_ids must be present in the request, not both.
    String name = "name_example"; // The name of the document.
    String subject = "subject_example"; // Email subject for the signature request that recipients will see. Defaults to the default system subject or a template subject (if the document is created from a template).
    String message = "message_example"; // Email message for the signature request that recipients will see. Defaults to the default system message or a template message (if the document is created from a template).
    Boolean draft = false; // Whether the document can still be updated before sending a signature request. If set to `false` the document is sent for signing as part of this request. Defaults to `false`.
    Boolean withSignaturePage = false; // When set to `true` the document will have a signature page added to the end, and all signers will be required to add their signature on that page.
    Integer expiresIn = 56; // Number of days before the signature request expires. Defaults to the account expiration setting or template expiration (if the document is created from a template).
    Boolean reminders = true; // Whether to send signing reminders to recipients. Reminders are sent on day 3, day 6, and day 10 if set to `true`. Defaults to `true`.
    Boolean applySigningOrder = false; // When set to `true` recipients will sign one at a time in the order of the `recipients` collection of this request.
    UUID apiApplicationId = UUID.randomUUID(); // Unique identifier for API Application settings to use. API Applications are optional and mainly used when isolating OAuth apps or for more control over embedded API settings
    Boolean embeddedSigning = false; // When set to `true` it enables embedded signing in your website/web application. Embedded functionality works with an iFrame and email authentication is disabled. :embedded_signinig defaults to `false`.
    Boolean embeddedSigningNotifications = false; // On embedding signing, document owners (and CC'd contacts) do not get a notification email when documents have been completed. Setting this param to `true` will send out those final completed notifications. Default is `false`
    Boolean textTags = false; // An alternative way (if you can’t use the recommended way) of placing fields in specific locations of your document by using special text tags. Useful when changing the content of your files changes the location of fields. See API documentation for “Text Tags” for details. Defaults to false.
    String customRequesterName = "customRequesterName_example"; // Sets the custom requester name for the document. When set, this is the name used for all email communications, signing notifications, and in the audit file.
    String customRequesterEmail = "customRequesterEmail_example"; // Sets the custom requester email for the document. When set, this is the email used for all email communications, signing notifications, and in the audit file.
    String redirectUrl = "redirectUrl_example"; // A URL that recipients are redirected to after successfully signing a document.
    Boolean allowDecline = true; // Whether to allow recipients the option to decline signing a document. If multiple signers are involved in a document, any single recipient can cancel the entire document signing process by declining to sign.
    Boolean allowReassign = true; // In some cases a signer is not the right person to sign and may need to reassign their signing responsibilities to another person. This feature allows them to reassign the document to someone else.
    String declineRedirectUrl = "declineRedirectUrl_example"; // A URL that recipients are redirected to if the document is declined.
    Object metadata = null; // Optional key-value data that can be associated with the document. If set, will be available every time the document data is returned.
    List<TemplateFieldsMapInner> templateFields = Arrays.asList(); // Fields of your template(s) that you can prepopulate with values. Signature and Initials fields cannot be signed through the API.
    List<AdditionalFilesMapInner> files = Arrays.asList();
    List<List<AdditionalFieldsMapInnerInner>> fields = Arrays.asList(new ArrayList<>()); // Fields to be added to any appended files (not existing files). Document fields placed on a document for collecting data or signatures from recipients. Field data should be sent as a 2-dimensional JSON array. One array of fields is needed for each file in the files array. An array of fields can be empty if you have a file that does not contain any fields.
    List<AttachmentRequestsMapInner> attachmentRequests = Arrays.asList(); // Attachments that a recipient must upload to complete the signing process. Attachment requests are shown after all document fields have been completed.
    List<CopiedContactsMapInner> copiedContacts = Arrays.asList(); // Copied contacts are emailed the final document once it has been completed by all recipients.
    try {
      DocumentCreateFromTemplateResponse result = client
              .document
              .createFromTemplate(recipients)
              .testMode(testMode)
              .templateId(templateId)
              .templateIds(templateIds)
              .name(name)
              .subject(subject)
              .message(message)
              .draft(draft)
              .withSignaturePage(withSignaturePage)
              .expiresIn(expiresIn)
              .reminders(reminders)
              .applySigningOrder(applySigningOrder)
              .apiApplicationId(apiApplicationId)
              .embeddedSigning(embeddedSigning)
              .embeddedSigningNotifications(embeddedSigningNotifications)
              .textTags(textTags)
              .customRequesterName(customRequesterName)
              .customRequesterEmail(customRequesterEmail)
              .redirectUrl(redirectUrl)
              .allowDecline(allowDecline)
              .allowReassign(allowReassign)
              .declineRedirectUrl(declineRedirectUrl)
              .metadata(metadata)
              .templateFields(templateFields)
              .files(files)
              .fields(fields)
              .attachmentRequests(attachmentRequests)
              .copiedContacts(copiedContacts)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getArchived());
      System.out.println(result.getCopiedContacts());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCustomRequesterEmail());
      System.out.println(result.getCustomRequesterName());
      System.out.println(result.getDeclineRedirectUrl());
      System.out.println(result.getEmbeddedEditUrl());
      System.out.println(result.getEmbeddedPreviewUrl());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getFields());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getRecipients());
      System.out.println(result.getSubject());
      System.out.println(result.getTestMode());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getDeclineMessage());
      System.out.println(result.getApiApplicationId());
      System.out.println(result.getAllowDecline());
      System.out.println(result.getAllowReassign());
      System.out.println(result.getApplySigningOrder());
      System.out.println(result.getEmbeddedSigning());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getMessage());
      System.out.println(result.getReminders());
      System.out.println(result.getRequesterEmailAddress());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getTemplateIds());
      System.out.println(result.getFiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#createFromTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentCreateFromTemplateResponse> response = client
              .document
              .createFromTemplate(recipients)
              .testMode(testMode)
              .templateId(templateId)
              .templateIds(templateIds)
              .name(name)
              .subject(subject)
              .message(message)
              .draft(draft)
              .withSignaturePage(withSignaturePage)
              .expiresIn(expiresIn)
              .reminders(reminders)
              .applySigningOrder(applySigningOrder)
              .apiApplicationId(apiApplicationId)
              .embeddedSigning(embeddedSigning)
              .embeddedSigningNotifications(embeddedSigningNotifications)
              .textTags(textTags)
              .customRequesterName(customRequesterName)
              .customRequesterEmail(customRequesterEmail)
              .redirectUrl(redirectUrl)
              .allowDecline(allowDecline)
              .allowReassign(allowReassign)
              .declineRedirectUrl(declineRedirectUrl)
              .metadata(metadata)
              .templateFields(templateFields)
              .files(files)
              .fields(fields)
              .attachmentRequests(attachmentRequests)
              .copiedContacts(copiedContacts)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#createFromTemplate");
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
| **documentFromTemplateRequest** | [**DocumentFromTemplateRequest**](DocumentFromTemplateRequest.md)|  | [optional] |

### Return type

[**DocumentCreateFromTemplateResponse**](DocumentCreateFromTemplateResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  -  |

<a name="createNewDocument"></a>
# **createNewDocument**
> DocumentCreateNewDocumentResponse createNewDocument().documentRequest(documentRequest).execute();

Create Document

Creates and optionally sends a new document for signing. If &#x60;draft&#x60; is set to false the document will not be sent.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentApi;
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
    List<DocumentRecipientsMapInner> recipients = Arrays.asList(); // Document recipients are people that must complete and/or sign a document.
    Boolean testMode = false; // Set to `true` to enable Test Mode. Documents created with Test Mode do not count towards API billing and are not legally binding. Defaults to `false`
    String name = "name_example"; // The name of the document.
    String subject = "subject_example"; // Email subject for the signature request that recipients will see. Defaults to the default system subject or a template subject (if the document is created from a template).
    String message = "message_example"; // Email message for the signature request that recipients will see. Defaults to the default system message or a template message (if the document is created from a template).
    Boolean draft = false; // Whether the document can still be updated before sending a signature request. If set to `false` the document is sent for signing as part of this request. Defaults to `false`.
    Boolean withSignaturePage = false; // When set to `true` the document will have a signature page added to the end, and all signers will be required to add their signature on that page.
    Integer expiresIn = 56; // Number of days before the signature request expires. Defaults to the account expiration setting or template expiration (if the document is created from a template).
    Boolean reminders = true; // Whether to send signing reminders to recipients. Reminders are sent on day 3, day 6, and day 10 if set to `true`. Defaults to `true`.
    Boolean applySigningOrder = false; // When set to `true` recipients will sign one at a time in the order of the `recipients` collection of this request.
    UUID apiApplicationId = UUID.randomUUID(); // Unique identifier for API Application settings to use. API Applications are optional and mainly used when isolating OAuth apps or for more control over embedded API settings
    Boolean embeddedSigning = false; // When set to `true` it enables embedded signing in your website/web application. Embedded functionality works with an iFrame and email authentication is disabled. :embedded_signinig defaults to `false`.
    Boolean embeddedSigningNotifications = false; // On embedding signing, document owners (and CC'd contacts) do not get a notification email when documents have been completed. Setting this param to `true` will send out those final completed notifications. Default is `false`
    Boolean textTags = false; // An alternative way (if you can’t use the recommended way) of placing fields in specific locations of your document by using special text tags. Useful when changing the content of your files changes the location of fields. See API documentation for “Text Tags” for details. Defaults to false.
    String customRequesterName = "customRequesterName_example"; // Sets the custom requester name for the document. When set, this is the name used for all email communications, signing notifications, and in the audit file.
    String customRequesterEmail = "customRequesterEmail_example"; // Sets the custom requester email for the document. When set, this is the email used for all email communications, signing notifications, and in the audit file.
    String redirectUrl = "redirectUrl_example"; // A URL that recipients are redirected to after successfully signing a document.
    Boolean allowDecline = true; // Whether to allow recipients the option to decline signing a document. If multiple signers are involved in a document, any single recipient can cancel the entire document signing process by declining to sign.
    Boolean allowReassign = true; // In some cases a signer is not the right person to sign and may need to reassign their signing responsibilities to another person. This feature allows them to reassign the document to someone else.
    String declineRedirectUrl = "declineRedirectUrl_example"; // A URL that recipients are redirected to if the document is declined.
    Object metadata = null; // Optional key-value data that can be associated with the document. If set, will be available every time the document data is returned.
    List<List<FieldsMapInnerInner>> fields = Arrays.asList(new ArrayList<>()); // Document fields placed on a document for collecting data or signatures from recipients. At least one field must be present in the Create Document request if `draft` is `false` (unless adding a signature page by using `with_signature_page`). Field data should be sent as a 2-dimensional JSON array. One array of fields is needed for each file in the files array. An array of fields can be empty if you have a file that does not contain any fields.
    List<AttachmentRequestsMapInner> attachmentRequests = Arrays.asList(); // Attachments that a recipient must upload to complete the signing process. Attachment requests are shown after all document fields have been completed.
    List<CopiedContactsMapInner> copiedContacts = Arrays.asList(); // Copied contacts are emailed the final document once it has been completed by all recipients.
    try {
      DocumentCreateNewDocumentResponse result = client
              .document
              .createNewDocument(files, recipients)
              .testMode(testMode)
              .name(name)
              .subject(subject)
              .message(message)
              .draft(draft)
              .withSignaturePage(withSignaturePage)
              .expiresIn(expiresIn)
              .reminders(reminders)
              .applySigningOrder(applySigningOrder)
              .apiApplicationId(apiApplicationId)
              .embeddedSigning(embeddedSigning)
              .embeddedSigningNotifications(embeddedSigningNotifications)
              .textTags(textTags)
              .customRequesterName(customRequesterName)
              .customRequesterEmail(customRequesterEmail)
              .redirectUrl(redirectUrl)
              .allowDecline(allowDecline)
              .allowReassign(allowReassign)
              .declineRedirectUrl(declineRedirectUrl)
              .metadata(metadata)
              .fields(fields)
              .attachmentRequests(attachmentRequests)
              .copiedContacts(copiedContacts)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getArchived());
      System.out.println(result.getCopiedContacts());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCustomRequesterEmail());
      System.out.println(result.getCustomRequesterName());
      System.out.println(result.getDeclineRedirectUrl());
      System.out.println(result.getEmbeddedEditUrl());
      System.out.println(result.getEmbeddedPreviewUrl());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getFields());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getRecipients());
      System.out.println(result.getSubject());
      System.out.println(result.getTestMode());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getDeclineMessage());
      System.out.println(result.getApiApplicationId());
      System.out.println(result.getAllowDecline());
      System.out.println(result.getAllowReassign());
      System.out.println(result.getApplySigningOrder());
      System.out.println(result.getEmbeddedSigning());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getMessage());
      System.out.println(result.getReminders());
      System.out.println(result.getRequesterEmailAddress());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getFiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#createNewDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentCreateNewDocumentResponse> response = client
              .document
              .createNewDocument(files, recipients)
              .testMode(testMode)
              .name(name)
              .subject(subject)
              .message(message)
              .draft(draft)
              .withSignaturePage(withSignaturePage)
              .expiresIn(expiresIn)
              .reminders(reminders)
              .applySigningOrder(applySigningOrder)
              .apiApplicationId(apiApplicationId)
              .embeddedSigning(embeddedSigning)
              .embeddedSigningNotifications(embeddedSigningNotifications)
              .textTags(textTags)
              .customRequesterName(customRequesterName)
              .customRequesterEmail(customRequesterEmail)
              .redirectUrl(redirectUrl)
              .allowDecline(allowDecline)
              .allowReassign(allowReassign)
              .declineRedirectUrl(declineRedirectUrl)
              .metadata(metadata)
              .fields(fields)
              .attachmentRequests(attachmentRequests)
              .copiedContacts(copiedContacts)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#createNewDocument");
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
| **documentRequest** | [**DocumentRequest**](DocumentRequest.md)|  | [optional] |

### Return type

[**DocumentCreateNewDocumentResponse**](DocumentCreateNewDocumentResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  -  |

<a name="deleteDocument"></a>
# **deleteDocument**
> deleteDocument(id).execute();

Delete Document

Deletes a document. Deleting a document will also cancel document signing (if in progress).  Supply the unique document ID from either a Create Document request or document page URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentApi;
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
              .document
              .deleteDocument(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#deleteDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .document
              .deleteDocument(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#deleteDocument");
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

<a name="getCompletedPdf"></a>
# **getCompletedPdf**
> Object getCompletedPdf(id).urlOnly(urlOnly).auditPage(auditPage).execute();

Completed PDF

Gets a completed document PDF. Supply the unique document ID from either a document creation request or document page URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentApi;
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
    Boolean urlOnly = false;
    Boolean auditPage = true;
    try {
      Object result = client
              .document
              .getCompletedPdf(id)
              .urlOnly(urlOnly)
              .auditPage(auditPage)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getCompletedPdf");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .document
              .getCompletedPdf(id)
              .urlOnly(urlOnly)
              .auditPage(auditPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getCompletedPdf");
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
| **urlOnly** | **Boolean**|  | [optional] [default to false] |
| **auditPage** | **Boolean**|  | [optional] [default to true] |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful, returns the final completed PDF, or if url_only is set to true, a JSON object is returned. |  -  |

<a name="getDocumentData"></a>
# **getDocumentData**
> DocumentGetDocumentDataResponse getDocumentData(id).execute();

Get Document

Returns a document and all associated document data. Supply the unique document ID from either a document creation request or Document page URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentApi;
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
      DocumentGetDocumentDataResponse result = client
              .document
              .getDocumentData(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getArchived());
      System.out.println(result.getEmbeddedEditUrl());
      System.out.println(result.getEmbeddedPreviewUrl());
      System.out.println(result.getName());
      System.out.println(result.getRequesterEmailAddress());
      System.out.println(result.getStatus());
      System.out.println(result.getTestMode());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getDeclineMessage());
      System.out.println(result.getAllowDecline());
      System.out.println(result.getAllowReassign());
      System.out.println(result.getApiApplicationId());
      System.out.println(result.getCustomRequesterEmail());
      System.out.println(result.getCustomRequesterName());
      System.out.println(result.getDeclineRedirectUrl());
      System.out.println(result.getEmbeddedSigning());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getMetadata());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getReminders());
      System.out.println(result.getApplySigningOrder());
      System.out.println(result.getMessage());
      System.out.println(result.getSubject());
      System.out.println(result.getFields());
      System.out.println(result.getFiles());
      System.out.println(result.getCopiedContacts());
      System.out.println(result.getRecipients());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getDocumentData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentGetDocumentDataResponse> response = client
              .document
              .getDocumentData(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getDocumentData");
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

[**DocumentGetDocumentDataResponse**](DocumentGetDocumentDataResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="sendReminder"></a>
# **sendReminder**
> DocumentSendReminderResponse sendReminder(id).sendReminderRequest(sendReminderRequest).execute();

Send Reminder

Sends a reminder email to recipients that have not signed yet.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentApi;
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
    List<RemindRecipientsMapInner> recipients = Arrays.asList(); // Optional list if recipients within the document to send a reminder email to. If none are specified, all recipients that have not signed yet will receive a reminder email.
    try {
      DocumentSendReminderResponse result = client
              .document
              .sendReminder(id)
              .recipients(recipients)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getArchived());
      System.out.println(result.getEmbeddedEditUrl());
      System.out.println(result.getEmbeddedPreviewUrl());
      System.out.println(result.getName());
      System.out.println(result.getRequesterEmailAddress());
      System.out.println(result.getStatus());
      System.out.println(result.getTestMode());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getDeclineMessage());
      System.out.println(result.getAllowDecline());
      System.out.println(result.getAllowReassign());
      System.out.println(result.getApiApplicationId());
      System.out.println(result.getCustomRequesterEmail());
      System.out.println(result.getCustomRequesterName());
      System.out.println(result.getDeclineRedirectUrl());
      System.out.println(result.getEmbeddedSigning());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getMetadata());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getReminders());
      System.out.println(result.getApplySigningOrder());
      System.out.println(result.getMessage());
      System.out.println(result.getSubject());
      System.out.println(result.getFields());
      System.out.println(result.getFiles());
      System.out.println(result.getCopiedContacts());
      System.out.println(result.getRecipients());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#sendReminder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentSendReminderResponse> response = client
              .document
              .sendReminder(id)
              .recipients(recipients)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#sendReminder");
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
| **sendReminderRequest** | [**SendReminderRequest**](SendReminderRequest.md)|  | [optional] |

### Return type

[**DocumentSendReminderResponse**](DocumentSendReminderResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  -  |

<a name="updateAndSend"></a>
# **updateAndSend**
> DocumentUpdateAndSendResponse updateAndSend(id).updateDocumentAndSendRequest(updateDocumentAndSendRequest).execute();

Update and Send Document

Updates a draft document and sends it to be signed by recipients.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentApi;
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
    Boolean testMode = false; // Set to `true` to enable Test Mode. Documents created with Test Mode do not count towards API billing and are not legally binding. Defaults to `false`
    String name = "name_example"; // The name of the document.
    String subject = "subject_example"; // Email subject for the signature request that recipients will see. Defaults to the default system subject or a template subject (if the document is created from a template).
    String message = "message_example"; // Email message for the signature request that recipients will see. Defaults to the default system message or a template message (if the document is created from a template).
    Integer expiresIn = 56; // Number of days before the signature request expires. Defaults to the account expiration setting or template expiration (if the document is created from a template).
    Boolean reminders = true; // Whether to send signing reminders to recipients. Reminders are sent on day 3, day 6, and day 10 if set to `true`. Defaults to `true`.
    Boolean applySigningOrder = false; // When set to `true` recipients will sign one at a time in the order of the `recipients` collection of this request.
    UUID apiApplicationId = UUID.randomUUID(); // Unique identifier for API Application settings to use. API Applications are optional and mainly used when isolating OAuth apps or for more control over embedded API settings
    Boolean embeddedSigning = false; // When set to `true` it enables embedded signing in your website/web application. Embedded functionality works with an iFrame and email authentication is disabled. :embedded_signinig defaults to `false`.
    Boolean embeddedSigningNotifications = false; // On embedding signing, document owners (and CC'd contacts) do not get a notification email when documents have been completed. Setting this param to `true` will send out those final completed notifications. Default is `false`
    String customRequesterName = "customRequesterName_example"; // Sets the custom requester name for the document. When set, this is the name used for all email communications, signing notifications, and in the audit file.
    String customRequesterEmail = "customRequesterEmail_example"; // Sets the custom requester email for the document. When set, this is the email used for all email communications, signing notifications, and in the audit file.
    String redirectUrl = "redirectUrl_example"; // A URL that recipients are redirected to after successfully signing a document.
    Boolean allowDecline = true; // Whether to allow recipients the option to decline signing a document. If multiple signers are involved in a document, any single recipient can cancel the entire document signing process by declining to sign.
    Boolean allowReassign = true; // In some cases a signer is not the right person to sign and may need to reassign their signing responsibilities to another person. This feature allows them to reassign the document to someone else.
    String declineRedirectUrl = "declineRedirectUrl_example"; // A URL that recipients are redirected to if the document is declined.
    Object metadata = null; // Optional key-value data that can be associated with the document. If set, will be available every time the document data is returned.
    try {
      DocumentUpdateAndSendResponse result = client
              .document
              .updateAndSend(id)
              .testMode(testMode)
              .name(name)
              .subject(subject)
              .message(message)
              .expiresIn(expiresIn)
              .reminders(reminders)
              .applySigningOrder(applySigningOrder)
              .apiApplicationId(apiApplicationId)
              .embeddedSigning(embeddedSigning)
              .embeddedSigningNotifications(embeddedSigningNotifications)
              .customRequesterName(customRequesterName)
              .customRequesterEmail(customRequesterEmail)
              .redirectUrl(redirectUrl)
              .allowDecline(allowDecline)
              .allowReassign(allowReassign)
              .declineRedirectUrl(declineRedirectUrl)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getArchived());
      System.out.println(result.getCopiedContacts());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCustomRequesterEmail());
      System.out.println(result.getCustomRequesterName());
      System.out.println(result.getDeclineRedirectUrl());
      System.out.println(result.getEmbeddedEditUrl());
      System.out.println(result.getEmbeddedPreviewUrl());
      System.out.println(result.getErrorMessage());
      System.out.println(result.getFields());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getRecipients());
      System.out.println(result.getSubject());
      System.out.println(result.getTestMode());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getDeclineMessage());
      System.out.println(result.getApiApplicationId());
      System.out.println(result.getAllowDecline());
      System.out.println(result.getAllowReassign());
      System.out.println(result.getApplySigningOrder());
      System.out.println(result.getEmbeddedSigning());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getMessage());
      System.out.println(result.getReminders());
      System.out.println(result.getRequesterEmailAddress());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getFiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#updateAndSend");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentUpdateAndSendResponse> response = client
              .document
              .updateAndSend(id)
              .testMode(testMode)
              .name(name)
              .subject(subject)
              .message(message)
              .expiresIn(expiresIn)
              .reminders(reminders)
              .applySigningOrder(applySigningOrder)
              .apiApplicationId(apiApplicationId)
              .embeddedSigning(embeddedSigning)
              .embeddedSigningNotifications(embeddedSigningNotifications)
              .customRequesterName(customRequesterName)
              .customRequesterEmail(customRequesterEmail)
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
      System.err.println("Exception when calling DocumentApi#updateAndSend");
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
| **updateDocumentAndSendRequest** | [**UpdateDocumentAndSendRequest**](UpdateDocumentAndSendRequest.md)|  | [optional] |

### Return type

[**DocumentUpdateAndSendResponse**](DocumentUpdateAndSendResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  -  |

