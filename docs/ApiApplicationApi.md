# ApiApplicationApi

All URIs are relative to *https://www.signwell.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteById**](ApiApplicationApi.md#deleteById) | **DELETE** /api/v1/api_applications/{id} | Delete API Application |
| [**getDetails**](ApiApplicationApi.md#getDetails) | **GET** /api/v1/api_applications/{id} | Get API Application |


<a name="deleteById"></a>
# **deleteById**
> deleteById(id).execute();

Delete API Application

Deletes an API Application from an account. Supply the unique Application ID from either the Create API Application response or the API Application edit page

### Example
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

<a name="getDetails"></a>
# **getDetails**
> ApiApplicationGetDetailsResponse getDetails(id).execute();

Get API Application

Gets the details of a specific API Application within an account. Supply the unique Application ID from either the Create API Application response or the API Application edit page.

### Example
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
      ApiApplicationGetDetailsResponse result = client
              .apiApplication
              .getDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCallbackUrls());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getName());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getOwner());
      System.out.println(result.getPreferences());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiApplicationApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApiApplicationGetDetailsResponse> response = client
              .apiApplication
              .getDetails(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiApplicationApi#getDetails");
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

[**ApiApplicationGetDetailsResponse**](ApiApplicationGetDetailsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |

