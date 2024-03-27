# WebhooksApi

All URIs are relative to *https://www.signwell.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCallbackUrl**](WebhooksApi.md#deleteCallbackUrl) | **DELETE** /api/v1/hooks/{id} | Delete Webhook |
| [**getAll**](WebhooksApi.md#getAll) | **GET** /api/v1/hooks | List Webhooks |
| [**registerCallbackUrl**](WebhooksApi.md#registerCallbackUrl) | **POST** /api/v1/hooks | Create Webhook |


<a name="deleteCallbackUrl"></a>
# **deleteCallbackUrl**
> deleteCallbackUrl(id).execute();

Delete Webhook

Deletes a registered callback URL that we are posting document events to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
              .webhooks
              .deleteCallbackUrl(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#deleteCallbackUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhooks
              .deleteCallbackUrl(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#deleteCallbackUrl");
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

<a name="getAll"></a>
# **getAll**
> List&lt;WebhooksGetAllResponseInner&gt; getAll().execute();

List Webhooks

List all the webhooks in the account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.signwell.com";
    
    configuration.apiKey  = "YOUR API KEY";
    SignWell client = new SignWell(configuration);
    try {
      List<WebhooksGetAllResponseInner> result = client
              .webhooks
              .getAll()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<WebhooksGetAllResponseInner>> response = client
              .webhooks
              .getAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;WebhooksGetAllResponseInner&gt;**](WebhooksGetAllResponseInner.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |

<a name="registerCallbackUrl"></a>
# **registerCallbackUrl**
> WebhooksRegisterCallbackUrlResponse registerCallbackUrl().webhooksRegisterCallbackUrlRequest(webhooksRegisterCallbackUrlRequest).execute();

Create Webhook

Register a callback URL that we will post document events to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SignWell;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.signwell.com";
    
    configuration.apiKey  = "YOUR API KEY";
    SignWell client = new SignWell(configuration);
    String callbackUrl = "callbackUrl_example"; // URL that we will post document events to.
    UUID apiApplicationId = UUID.randomUUID(); // Unique identifier for the API Application.
    try {
      WebhooksRegisterCallbackUrlResponse result = client
              .webhooks
              .registerCallbackUrl(callbackUrl)
              .apiApplicationId(apiApplicationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCallbackUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#registerCallbackUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhooksRegisterCallbackUrlResponse> response = client
              .webhooks
              .registerCallbackUrl(callbackUrl)
              .apiApplicationId(apiApplicationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#registerCallbackUrl");
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
| **webhooksRegisterCallbackUrlRequest** | [**WebhooksRegisterCallbackUrlRequest**](WebhooksRegisterCallbackUrlRequest.md)|  | [optional] |

### Return type

[**WebhooksRegisterCallbackUrlResponse**](WebhooksRegisterCallbackUrlResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  -  |

