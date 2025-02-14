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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.AttachmentRequestsForTemplateMapInner;
import com.konfigthis.client.model.CopiedPlaceholdersMapInner;
import com.konfigthis.client.model.DocumentTemplateRequest;
import com.konfigthis.client.model.DocumentTemplateUpdateRequest;
import com.konfigthis.client.model.FilesMapInner;
import com.konfigthis.client.model.PlaceholdersMapInner;
import com.konfigthis.client.model.TemplateCreateNewResponse;
import com.konfigthis.client.model.TemplateGetTemplateDataResponse;
import com.konfigthis.client.model.TemplateUpdateExistingTemplateResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplateApi
 */
@Disabled
public class TemplateApiTest {

    private static TemplateApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TemplateApi(apiClient);
    }

    /**
     * Create Template
     *
     * Creates a new template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewTest() throws ApiException {
        List<FilesMapInner> files = null;
        List<PlaceholdersMapInner> placeholders = null;
        String name = null;
        String subject = null;
        String message = null;
        List<CopiedPlaceholdersMapInner> copiedPlaceholders = null;
        Boolean draft = null;
        Integer expiresIn = null;
        Boolean reminders = null;
        Boolean applySigningOrder = null;
        UUID apiApplicationId = null;
        Boolean textTags = null;
        String redirectUrl = null;
        Boolean allowDecline = null;
        Boolean allowReassign = null;
        String declineRedirectUrl = null;
        Object metadata = null;
        List<List<FieldsForTemplateMapInnerInner>> fields = null;
        List<AttachmentRequestsForTemplateMapInner> attachmentRequests = null;
        TemplateCreateNewResponse response = api.createNew(files, placeholders)
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
        // TODO: test validations
    }

    /**
     * Delete Template
     *
     * Deletes a template. Supply the unique template ID from either a Create Template request or template page URL.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDocumentTemplateTest() throws ApiException {
        UUID id = null;
        api.deleteDocumentTemplate(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Template
     *
     * Returns a template and all associated template data. Supply the unique template ID from either a Create Template request or template page URL.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTemplateDataTest() throws ApiException {
        UUID id = null;
        TemplateGetTemplateDataResponse response = api.getTemplateData(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Template
     *
     * Updates an existing template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateExistingTemplateTest() throws ApiException {
        UUID id = null;
        String name = null;
        String subject = null;
        String message = null;
        Boolean draft = null;
        Integer expiresIn = null;
        Boolean reminders = null;
        Boolean applySigningOrder = null;
        UUID apiApplicationId = null;
        String redirectUrl = null;
        Boolean allowDecline = null;
        Boolean allowReassign = null;
        String declineRedirectUrl = null;
        Object metadata = null;
        TemplateUpdateExistingTemplateResponse response = api.updateExistingTemplate(id)
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
        // TODO: test validations
    }

}
