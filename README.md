<div align="left">

[![Visit Signwell](./header.png)](https://signwell.com)

# [Signwell](https://signwell.com)

When I started SignWell in 2019, I saw there was a need for an alternative to the hard-to-use and expensive e-signature software already out there. Documents can be complicated enough, but getting a document signed shouldn't be complicated too.

At SignWell, we pride ourselves not only on the ease and affordability of our e-signature process but also on our personalized and industry-leading customer support — whether it's for individual use or larger team accounts, SignWell is here to help you feel comfortable and confident getting your documents signed.

The SignWell mission? Simplify how documents get signed for millions of people and businesses. We're excited to help you continue to move toward the future of paperless document signing.

Ruben Gamez
Founder, SignWell

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=SignWell&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>sign-well-java-sdk</artifactId>
  <version>1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:sign-well-java-sdk:1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/sign-well-java-sdk-1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApiApplicationApi;
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
              .apiApplication
              .deleteById(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiApplicationApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .apiApplication
              .deleteById(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiApplicationApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://www.signwell.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiApplicationApi* | [**deleteById**](docs/ApiApplicationApi.md#deleteById) | **DELETE** /api/v1/api_applications/{id} | Delete API Application
*ApiApplicationApi* | [**getDetails**](docs/ApiApplicationApi.md#getDetails) | **GET** /api/v1/api_applications/{id} | Get API Application
*BulkSendApi* | [**createValidationCsv**](docs/BulkSendApi.md#createValidationCsv) | **POST** /api/v1/bulk_sends | Create Bulk Send
*BulkSendApi* | [**getCsvTemplate**](docs/BulkSendApi.md#getCsvTemplate) | **GET** /api/v1/bulk_sends/csv_template | Get Bulk Send CSV Template
*BulkSendApi* | [**getDocuments**](docs/BulkSendApi.md#getDocuments) | **GET** /api/v1/bulk_sends/{id}/documents | Get Bulk Send Documents
*BulkSendApi* | [**getInformation**](docs/BulkSendApi.md#getInformation) | **GET** /api/v1/bulk_sends/{id} | Get Bulk Send
*BulkSendApi* | [**listBulkSendings**](docs/BulkSendApi.md#listBulkSendings) | **GET** /api/v1/bulk_sends | List Bulk Sendings
*BulkSendApi* | [**validateCsv**](docs/BulkSendApi.md#validateCsv) | **POST** /api/v1/bulk_sends/validate_csv | Validate Bulk Send CSV
*DocumentApi* | [**createFromTemplate**](docs/DocumentApi.md#createFromTemplate) | **POST** /api/v1/document_templates/documents | Create Document from Template
*DocumentApi* | [**createNewDocument**](docs/DocumentApi.md#createNewDocument) | **POST** /api/v1/documents | Create Document
*DocumentApi* | [**deleteDocument**](docs/DocumentApi.md#deleteDocument) | **DELETE** /api/v1/documents/{id} | Delete Document
*DocumentApi* | [**getCompletedPdf**](docs/DocumentApi.md#getCompletedPdf) | **GET** /api/v1/documents/{id}/completed_pdf | Completed PDF
*DocumentApi* | [**getDocumentData**](docs/DocumentApi.md#getDocumentData) | **GET** /api/v1/documents/{id} | Get Document
*DocumentApi* | [**sendReminder**](docs/DocumentApi.md#sendReminder) | **POST** /api/v1/documents/{id}/remind | Send Reminder
*DocumentApi* | [**updateAndSend**](docs/DocumentApi.md#updateAndSend) | **POST** /api/v1/documents/{id}/send | Update and Send Document
*MeApi* | [**getAccountInfo**](docs/MeApi.md#getAccountInfo) | **GET** /api/v1/me | Get credentials
*TemplateApi* | [**createNew**](docs/TemplateApi.md#createNew) | **POST** /api/v1/document_templates | Create Template
*TemplateApi* | [**deleteDocumentTemplate**](docs/TemplateApi.md#deleteDocumentTemplate) | **DELETE** /api/v1/document_templates/{id} | Delete Template
*TemplateApi* | [**getTemplateData**](docs/TemplateApi.md#getTemplateData) | **GET** /api/v1/document_templates/{id} | Get Template
*TemplateApi* | [**updateExistingTemplate**](docs/TemplateApi.md#updateExistingTemplate) | **PUT** /api/v1/document_templates/{id} | Update Template
*WebhooksApi* | [**deleteCallbackUrl**](docs/WebhooksApi.md#deleteCallbackUrl) | **DELETE** /api/v1/hooks/{id} | Delete Webhook
*WebhooksApi* | [**getAll**](docs/WebhooksApi.md#getAll) | **GET** /api/v1/hooks | List Webhooks
*WebhooksApi* | [**registerCallbackUrl**](docs/WebhooksApi.md#registerCallbackUrl) | **POST** /api/v1/hooks | Create Webhook


## Documentation for Models

 - [AdditionalFieldsMapInnerInner](docs/AdditionalFieldsMapInnerInner.md)
 - [AdditionalFilesMapInner](docs/AdditionalFilesMapInner.md)
 - [ApiApplicationGetDetailsResponse](docs/ApiApplicationGetDetailsResponse.md)
 - [ApiApplicationGetDetailsResponseOwner](docs/ApiApplicationGetDetailsResponseOwner.md)
 - [ApiApplicationGetDetailsResponsePreferences](docs/ApiApplicationGetDetailsResponsePreferences.md)
 - [AttachmentRequestsForTemplateMapInner](docs/AttachmentRequestsForTemplateMapInner.md)
 - [AttachmentRequestsMapInner](docs/AttachmentRequestsMapInner.md)
 - [BulkSendCreateValidationCsvResponse](docs/BulkSendCreateValidationCsvResponse.md)
 - [BulkSendCsvRequest](docs/BulkSendCsvRequest.md)
 - [BulkSendGetCsvTemplate200Response](docs/BulkSendGetCsvTemplate200Response.md)
 - [BulkSendGetDocumentsResponse](docs/BulkSendGetDocumentsResponse.md)
 - [BulkSendGetDocumentsResponseDocumentsInner](docs/BulkSendGetDocumentsResponseDocumentsInner.md)
 - [BulkSendGetDocumentsResponseDocumentsInnerCopiedContactsInner](docs/BulkSendGetDocumentsResponseDocumentsInnerCopiedContactsInner.md)
 - [BulkSendGetDocumentsResponseDocumentsInnerFieldsInnerInner](docs/BulkSendGetDocumentsResponseDocumentsInnerFieldsInnerInner.md)
 - [BulkSendGetDocumentsResponseDocumentsInnerFilesInner](docs/BulkSendGetDocumentsResponseDocumentsInnerFilesInner.md)
 - [BulkSendGetDocumentsResponseDocumentsInnerMetadata](docs/BulkSendGetDocumentsResponseDocumentsInnerMetadata.md)
 - [BulkSendGetDocumentsResponseDocumentsInnerRecipientsInner](docs/BulkSendGetDocumentsResponseDocumentsInnerRecipientsInner.md)
 - [BulkSendGetInformationResponse](docs/BulkSendGetInformationResponse.md)
 - [BulkSendGetInformationResponseTemplatesInner](docs/BulkSendGetInformationResponseTemplatesInner.md)
 - [BulkSendListBulkSendingsResponse](docs/BulkSendListBulkSendingsResponse.md)
 - [BulkSendListBulkSendingsResponseBulkSendsInner](docs/BulkSendListBulkSendingsResponseBulkSendsInner.md)
 - [BulkSendValidateCsvResponse](docs/BulkSendValidateCsvResponse.md)
 - [CopiedContactsMapInner](docs/CopiedContactsMapInner.md)
 - [CopiedPlaceholdersMapInner](docs/CopiedPlaceholdersMapInner.md)
 - [CreateBulkSendRequest](docs/CreateBulkSendRequest.md)
 - [DocumentCreateFromTemplateResponse](docs/DocumentCreateFromTemplateResponse.md)
 - [DocumentCreateFromTemplateResponseCopiedContactsInner](docs/DocumentCreateFromTemplateResponseCopiedContactsInner.md)
 - [DocumentCreateFromTemplateResponseFieldsInnerInner](docs/DocumentCreateFromTemplateResponseFieldsInnerInner.md)
 - [DocumentCreateFromTemplateResponseFilesInner](docs/DocumentCreateFromTemplateResponseFilesInner.md)
 - [DocumentCreateFromTemplateResponseMetadata](docs/DocumentCreateFromTemplateResponseMetadata.md)
 - [DocumentCreateFromTemplateResponseRecipientsInner](docs/DocumentCreateFromTemplateResponseRecipientsInner.md)
 - [DocumentCreateNewDocumentResponse](docs/DocumentCreateNewDocumentResponse.md)
 - [DocumentCreateNewDocumentResponseCopiedContactsInner](docs/DocumentCreateNewDocumentResponseCopiedContactsInner.md)
 - [DocumentCreateNewDocumentResponseFieldsInnerInner](docs/DocumentCreateNewDocumentResponseFieldsInnerInner.md)
 - [DocumentCreateNewDocumentResponseFilesInner](docs/DocumentCreateNewDocumentResponseFilesInner.md)
 - [DocumentCreateNewDocumentResponseMetadata](docs/DocumentCreateNewDocumentResponseMetadata.md)
 - [DocumentCreateNewDocumentResponseRecipientsInner](docs/DocumentCreateNewDocumentResponseRecipientsInner.md)
 - [DocumentFromTemplateRequest](docs/DocumentFromTemplateRequest.md)
 - [DocumentFromTemplateResponse](docs/DocumentFromTemplateResponse.md)
 - [DocumentFromTemplateResponseFieldsInnerInner](docs/DocumentFromTemplateResponseFieldsInnerInner.md)
 - [DocumentFromTemplateResponseFieldsInnerInnerRecipient](docs/DocumentFromTemplateResponseFieldsInnerInnerRecipient.md)
 - [DocumentFromTemplateResponseRecipientsInner](docs/DocumentFromTemplateResponseRecipientsInner.md)
 - [DocumentGetDocumentDataResponse](docs/DocumentGetDocumentDataResponse.md)
 - [DocumentGetDocumentDataResponseCopiedContactsInner](docs/DocumentGetDocumentDataResponseCopiedContactsInner.md)
 - [DocumentGetDocumentDataResponseFieldsInnerInner](docs/DocumentGetDocumentDataResponseFieldsInnerInner.md)
 - [DocumentGetDocumentDataResponseFilesInner](docs/DocumentGetDocumentDataResponseFilesInner.md)
 - [DocumentGetDocumentDataResponseMetadata](docs/DocumentGetDocumentDataResponseMetadata.md)
 - [DocumentGetDocumentDataResponseRecipientsInner](docs/DocumentGetDocumentDataResponseRecipientsInner.md)
 - [DocumentPdfJson](docs/DocumentPdfJson.md)
 - [DocumentRecipientsMapInner](docs/DocumentRecipientsMapInner.md)
 - [DocumentRequest](docs/DocumentRequest.md)
 - [DocumentResponse](docs/DocumentResponse.md)
 - [DocumentResponseAttachmentRequestsInner](docs/DocumentResponseAttachmentRequestsInner.md)
 - [DocumentResponseCopiedContactsInner](docs/DocumentResponseCopiedContactsInner.md)
 - [DocumentResponseFieldsInnerInner](docs/DocumentResponseFieldsInnerInner.md)
 - [DocumentResponseFieldsInnerInnerRecipient](docs/DocumentResponseFieldsInnerInnerRecipient.md)
 - [DocumentResponseFilesInner](docs/DocumentResponseFilesInner.md)
 - [DocumentResponseRecipientsInner](docs/DocumentResponseRecipientsInner.md)
 - [DocumentResponseRecipientsInnerAttachmentRequestsInner](docs/DocumentResponseRecipientsInnerAttachmentRequestsInner.md)
 - [DocumentSendReminderResponse](docs/DocumentSendReminderResponse.md)
 - [DocumentSendReminderResponseCopiedContactsInner](docs/DocumentSendReminderResponseCopiedContactsInner.md)
 - [DocumentSendReminderResponseFieldsInnerInner](docs/DocumentSendReminderResponseFieldsInnerInner.md)
 - [DocumentSendReminderResponseFilesInner](docs/DocumentSendReminderResponseFilesInner.md)
 - [DocumentSendReminderResponseMetadata](docs/DocumentSendReminderResponseMetadata.md)
 - [DocumentSendReminderResponseRecipientsInner](docs/DocumentSendReminderResponseRecipientsInner.md)
 - [DocumentTemplateRequest](docs/DocumentTemplateRequest.md)
 - [DocumentTemplateResponse](docs/DocumentTemplateResponse.md)
 - [DocumentTemplateResponseCopiedPlaceholdersInner](docs/DocumentTemplateResponseCopiedPlaceholdersInner.md)
 - [DocumentTemplateResponsePlaceholdersInner](docs/DocumentTemplateResponsePlaceholdersInner.md)
 - [DocumentTemplateUpdateRequest](docs/DocumentTemplateUpdateRequest.md)
 - [DocumentUpdateAndSendResponse](docs/DocumentUpdateAndSendResponse.md)
 - [DocumentUpdateAndSendResponseCopiedContactsInner](docs/DocumentUpdateAndSendResponseCopiedContactsInner.md)
 - [DocumentUpdateAndSendResponseFieldsInnerInner](docs/DocumentUpdateAndSendResponseFieldsInnerInner.md)
 - [DocumentUpdateAndSendResponseFilesInner](docs/DocumentUpdateAndSendResponseFilesInner.md)
 - [DocumentUpdateAndSendResponseMetadata](docs/DocumentUpdateAndSendResponseMetadata.md)
 - [DocumentUpdateAndSendResponseRecipientsInner](docs/DocumentUpdateAndSendResponseRecipientsInner.md)
 - [FieldsForTemplateMapInnerInner](docs/FieldsForTemplateMapInnerInner.md)
 - [FieldsMapInnerInner](docs/FieldsMapInnerInner.md)
 - [FilesMapInner](docs/FilesMapInner.md)
 - [MeGetAccountInfoResponse](docs/MeGetAccountInfoResponse.md)
 - [MeGetAccountInfoResponseAccount](docs/MeGetAccountInfoResponseAccount.md)
 - [MeGetAccountInfoResponseAccountActiveUsersInner](docs/MeGetAccountInfoResponseAccountActiveUsersInner.md)
 - [MeGetAccountInfoResponseContact](docs/MeGetAccountInfoResponseContact.md)
 - [MeGetAccountInfoResponseUser](docs/MeGetAccountInfoResponseUser.md)
 - [PlaceholdersMapInner](docs/PlaceholdersMapInner.md)
 - [RemindRecipientsMapInner](docs/RemindRecipientsMapInner.md)
 - [SendReminderRequest](docs/SendReminderRequest.md)
 - [TemplateCreateNewResponse](docs/TemplateCreateNewResponse.md)
 - [TemplateCreateNewResponseCopiedPlaceholdersInner](docs/TemplateCreateNewResponseCopiedPlaceholdersInner.md)
 - [TemplateCreateNewResponseFieldsInnerInner](docs/TemplateCreateNewResponseFieldsInnerInner.md)
 - [TemplateCreateNewResponseFilesInner](docs/TemplateCreateNewResponseFilesInner.md)
 - [TemplateCreateNewResponseMetadata](docs/TemplateCreateNewResponseMetadata.md)
 - [TemplateCreateNewResponsePlaceholdersInner](docs/TemplateCreateNewResponsePlaceholdersInner.md)
 - [TemplateCreateNewResponsePlaceholdersInnerAttachmentRequestsInner](docs/TemplateCreateNewResponsePlaceholdersInnerAttachmentRequestsInner.md)
 - [TemplateFieldsMapInner](docs/TemplateFieldsMapInner.md)
 - [TemplateGetTemplateDataResponse](docs/TemplateGetTemplateDataResponse.md)
 - [TemplateGetTemplateDataResponseCopiedPlaceholdersInner](docs/TemplateGetTemplateDataResponseCopiedPlaceholdersInner.md)
 - [TemplateGetTemplateDataResponseFieldsInnerInner](docs/TemplateGetTemplateDataResponseFieldsInnerInner.md)
 - [TemplateGetTemplateDataResponseFilesInner](docs/TemplateGetTemplateDataResponseFilesInner.md)
 - [TemplateGetTemplateDataResponsePlaceholdersInner](docs/TemplateGetTemplateDataResponsePlaceholdersInner.md)
 - [TemplateRecipientsMapInner](docs/TemplateRecipientsMapInner.md)
 - [TemplateUpdateExistingTemplateResponse](docs/TemplateUpdateExistingTemplateResponse.md)
 - [TemplateUpdateExistingTemplateResponseCopiedPlaceholdersInner](docs/TemplateUpdateExistingTemplateResponseCopiedPlaceholdersInner.md)
 - [TemplateUpdateExistingTemplateResponseFieldsInnerInner](docs/TemplateUpdateExistingTemplateResponseFieldsInnerInner.md)
 - [TemplateUpdateExistingTemplateResponseFilesInner](docs/TemplateUpdateExistingTemplateResponseFilesInner.md)
 - [TemplateUpdateExistingTemplateResponseMetadata](docs/TemplateUpdateExistingTemplateResponseMetadata.md)
 - [TemplateUpdateExistingTemplateResponsePlaceholdersInner](docs/TemplateUpdateExistingTemplateResponsePlaceholdersInner.md)
 - [UpdateDocumentAndSendRequest](docs/UpdateDocumentAndSendRequest.md)
 - [WebhooksGetAllResponseInner](docs/WebhooksGetAllResponseInner.md)
 - [WebhooksRegisterCallbackUrlRequest](docs/WebhooksRegisterCallbackUrlRequest.md)
 - [WebhooksRegisterCallbackUrlResponse](docs/WebhooksRegisterCallbackUrlResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
