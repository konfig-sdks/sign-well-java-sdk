package com.konfigthis.client;

import com.konfigthis.client.api.ApiApplicationApi;
import com.konfigthis.client.api.BulkSendApi;
import com.konfigthis.client.api.DocumentApi;
import com.konfigthis.client.api.MeApi;
import com.konfigthis.client.api.TemplateApi;
import com.konfigthis.client.api.WebhooksApi;

public class SignWell {
    private ApiClient apiClient;
    public final ApiApplicationApi apiApplication;
    public final BulkSendApi bulkSend;
    public final DocumentApi document;
    public final MeApi me;
    public final TemplateApi template;
    public final WebhooksApi webhooks;

    public SignWell() {
        this(null);
    }

    public SignWell(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.apiApplication = new ApiApplicationApi(this.apiClient);
        this.bulkSend = new BulkSendApi(this.apiClient);
        this.document = new DocumentApi(this.apiClient);
        this.me = new MeApi(this.apiClient);
        this.template = new TemplateApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
    }

}
