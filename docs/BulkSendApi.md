# BulkSendApi

All URIs are relative to *https://www.signwell.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createValidationCsv**](BulkSendApi.md#createValidationCsv) | **POST** /api/v1/bulk_sends | Create Bulk Send |
| [**getCsvTemplate**](BulkSendApi.md#getCsvTemplate) | **GET** /api/v1/bulk_sends/csv_template | Get Bulk Send CSV Template |
| [**getDocuments**](BulkSendApi.md#getDocuments) | **GET** /api/v1/bulk_sends/{id}/documents | Get Bulk Send Documents |
| [**getInformation**](BulkSendApi.md#getInformation) | **GET** /api/v1/bulk_sends/{id} | Get Bulk Send |
| [**listBulkSendings**](BulkSendApi.md#listBulkSendings) | **GET** /api/v1/bulk_sends | List Bulk Sendings |
| [**validateCsv**](BulkSendApi.md#validateCsv) | **POST** /api/v1/bulk_sends/validate_csv | Validate Bulk Send CSV |


<a name="createValidationCsv"></a>
# **createValidationCsv**
> BulkSendCreateValidationCsvResponse createValidationCsv().createBulkSendRequest(createBulkSendRequest).execute();

Create Bulk Send

Creates a bulk send, and it validates the CSV file before creating the bulk send.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkSendApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.signwell.com";
    
    configuration.apiKey  = "YOUR API KEY";
    SignWell client = new SignWell(configuration);
    List<UUID> templateIds = Arrays.asList(); // Unique identifiers for a list of templates.
    byte[] bulkSendCsv = null; // A RFC 4648 base64 string of the template CSV file to be validated.
    Boolean skipRowErrors = false; // Whether to skip errors in the rows. Defaults to `false`.
    UUID apiApplicationId = UUID.randomUUID(); // Unique identifier for API Application settings to use. API Applications are optional and mainly used when isolating OAuth apps or for more control over embedded API settings
    String name = "name_example"; // The name of the Bulk Send. Will be used as the document name for each of the documents.
    String subject = "subject_example"; // Email subject for the signature request that recipients will see. Defaults to the default system subject or a template subject.
    String message = "message_example"; // Email message for the signature request that recipients will see. Defaults to the default system message or a template message.
    Boolean applySigningOrder = false; // When set to `true` recipients will sign one at a time in the order of the `recipients` collection of this request.
    String customRequesterName = "customRequesterName_example"; // Sets the custom requester name for the document. When set, this is the name used for all email communications, signing notifications, and in the audit file.
    String customRequesterEmail = "customRequesterEmail_example"; // Sets the custom requester email for the document. When set, this is the email used for all email communications, signing notifications, and in the audit file.
    try {
      BulkSendCreateValidationCsvResponse result = client
              .bulkSend
              .createValidationCsv(templateIds, bulkSendCsv)
              .skipRowErrors(skipRowErrors)
              .apiApplicationId(apiApplicationId)
              .name(name)
              .subject(subject)
              .message(message)
              .applySigningOrder(applySigningOrder)
              .customRequesterName(customRequesterName)
              .customRequesterEmail(customRequesterEmail)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getTemplateIds());
      System.out.println(result.getApiApplicationId());
      System.out.println(result.getDocumentsCount());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkSendApi#createValidationCsv");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BulkSendCreateValidationCsvResponse> response = client
              .bulkSend
              .createValidationCsv(templateIds, bulkSendCsv)
              .skipRowErrors(skipRowErrors)
              .apiApplicationId(apiApplicationId)
              .name(name)
              .subject(subject)
              .message(message)
              .applySigningOrder(applySigningOrder)
              .customRequesterName(customRequesterName)
              .customRequesterEmail(customRequesterEmail)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkSendApi#createValidationCsv");
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
| **createBulkSendRequest** | [**CreateBulkSendRequest**](CreateBulkSendRequest.md)|  | [optional] |

### Return type

[**BulkSendCreateValidationCsvResponse**](BulkSendCreateValidationCsvResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful |  -  |

<a name="getCsvTemplate"></a>
# **getCsvTemplate**
> BulkSendGetCsvTemplate200Response getCsvTemplate(templateIds).base64(base64).execute();

Get Bulk Send CSV Template

Fetches a CSV template that corresponds to the provided document template IDs. CSV templates are blank CSV files that have columns containing required and optional data that can be sent when creating a bulk send. Fields can be referenced by the field label. Example: [placeholder name]_[field label] could be something like customer_address or signer_company_name (if \&quot;Customer\&quot; and \&quot;Signer\&quot; were placeholder names for templates set up in SignWell).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkSendApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.signwell.com";
    
    configuration.apiKey  = "YOUR API KEY";
    SignWell client = new SignWell(configuration);
    List<UUID> templateIds = Arrays.asList();
    byte[] base64 = null;
    try {
      BulkSendGetCsvTemplate200Response result = client
              .bulkSend
              .getCsvTemplate(templateIds)
              .base64(base64)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkSendApi#getCsvTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BulkSendGetCsvTemplate200Response> response = client
              .bulkSend
              .getCsvTemplate(templateIds)
              .base64(base64)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkSendApi#getCsvTemplate");
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
| **templateIds** | [**List&lt;UUID&gt;**](UUID.md)|  | |
| **base64** | **byte[]**|  | [optional] |

### Return type

[**BulkSendGetCsvTemplate200Response**](BulkSendGetCsvTemplate200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="getDocuments"></a>
# **getDocuments**
> BulkSendGetDocumentsResponse getDocuments(id).limit(limit).page(page).execute();

Get Bulk Send Documents

Returns information about the Bulk Send.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkSendApi;
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
    Integer limit = 10;
    Integer page = 1;
    try {
      BulkSendGetDocumentsResponse result = client
              .bulkSend
              .getDocuments(id)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getApiApplicationId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getStatus());
      System.out.println(result.getDocuments());
      System.out.println(result.getCurrentPage());
      System.out.println(result.getNextPage());
      System.out.println(result.getPreviousPage());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkSendApi#getDocuments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BulkSendGetDocumentsResponse> response = client
              .bulkSend
              .getDocuments(id)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkSendApi#getDocuments");
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
| **limit** | **Integer**|  | [optional] [default to 10] |
| **page** | **Integer**|  | [optional] [default to 1] |

### Return type

[**BulkSendGetDocumentsResponse**](BulkSendGetDocumentsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="getInformation"></a>
# **getInformation**
> BulkSendGetInformationResponse getInformation(id).execute();

Get Bulk Send

Returns information about the Bulk Send.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkSendApi;
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
      BulkSendGetInformationResponse result = client
              .bulkSend
              .getInformation(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getApiApplicationId());
      System.out.println(result.getDocumentsCount());
      System.out.println(result.getDocumentsCompleted());
      System.out.println(result.getDocumentsNotCompleted());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getStatus());
      System.out.println(result.getTemplates());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkSendApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BulkSendGetInformationResponse> response = client
              .bulkSend
              .getInformation(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkSendApi#getInformation");
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

[**BulkSendGetInformationResponse**](BulkSendGetInformationResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="listBulkSendings"></a>
# **listBulkSendings**
> BulkSendListBulkSendingsResponse listBulkSendings().userEmail(userEmail).limit(limit).page(page).apiApplicationId(apiApplicationId).execute();

List Bulk Sendings

Returns information about the Bulk Send.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkSendApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.signwell.com";
    
    configuration.apiKey  = "YOUR API KEY";
    SignWell client = new SignWell(configuration);
    String userEmail = "userEmail_example";
    Integer limit = 10;
    Integer page = 1;
    UUID apiApplicationId = UUID.randomUUID();
    try {
      BulkSendListBulkSendingsResponse result = client
              .bulkSend
              .listBulkSendings()
              .userEmail(userEmail)
              .limit(limit)
              .page(page)
              .apiApplicationId(apiApplicationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getBulkSends());
      System.out.println(result.getCurrentPage());
      System.out.println(result.getNextPage());
      System.out.println(result.getPreviousPage());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkSendApi#listBulkSendings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BulkSendListBulkSendingsResponse> response = client
              .bulkSend
              .listBulkSendings()
              .userEmail(userEmail)
              .limit(limit)
              .page(page)
              .apiApplicationId(apiApplicationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkSendApi#listBulkSendings");
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
| **userEmail** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 10] |
| **page** | **Integer**|  | [optional] [default to 1] |
| **apiApplicationId** | **UUID**|  | [optional] |

### Return type

[**BulkSendListBulkSendingsResponse**](BulkSendListBulkSendingsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

<a name="validateCsv"></a>
# **validateCsv**
> BulkSendValidateCsvResponse validateCsv().bulkSendCsvRequest(bulkSendCsvRequest).execute();

Validate Bulk Send CSV

Validates a Bulk Send CSV file before creating the Bulk Send. It will check the structure of the CSV and the data it contains, and return any errors found.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkSendApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.signwell.com";
    
    configuration.apiKey  = "YOUR API KEY";
    SignWell client = new SignWell(configuration);
    List<UUID> templateIds = Arrays.asList(); // Specify one or more templates to generate a single blank CSV file that will contain available columns for your recipient data. The template_ids[] parameter is an array of template IDs (e.g.,`/?template_ids[]=5a67dbd7-928a-4ea0-a7e2-e476a0eb045f&template_ids[]=d7315111-c671-4b15-8354-c9a19bbaefa0`). Each ID should be a separate parameter in the query string.
    byte[] bulkSendCsv = null; // A RFC 4648 base64 string of the template CSV file to be validated.
    try {
      BulkSendValidateCsvResponse result = client
              .bulkSend
              .validateCsv(templateIds, bulkSendCsv)
              .execute();
      System.out.println(result);
      System.out.println(result.getBulkSendCsv());
      System.out.println(result.getTemplateIds());
      System.out.println(result.getSkipRowErrors());
      System.out.println(result.getApiApplicationId());
      System.out.println(result.getName());
      System.out.println(result.getSubject());
      System.out.println(result.getMessage());
      System.out.println(result.getApplySigningOrder());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkSendApi#validateCsv");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BulkSendValidateCsvResponse> response = client
              .bulkSend
              .validateCsv(templateIds, bulkSendCsv)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkSendApi#validateCsv");
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
| **bulkSendCsvRequest** | [**BulkSendCsvRequest**](BulkSendCsvRequest.md)|  | [optional] |

### Return type

[**BulkSendValidateCsvResponse**](BulkSendValidateCsvResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

