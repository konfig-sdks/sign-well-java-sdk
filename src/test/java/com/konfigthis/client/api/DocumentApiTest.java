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
import com.konfigthis.client.model.AdditionalFilesMapInner;
import com.konfigthis.client.model.AttachmentRequestsMapInner;
import com.konfigthis.client.model.CopiedContactsMapInner;
import com.konfigthis.client.model.DocumentCreateFromTemplateResponse;
import com.konfigthis.client.model.DocumentCreateNewDocumentResponse;
import com.konfigthis.client.model.DocumentFromTemplateRequest;
import com.konfigthis.client.model.DocumentGetDocumentDataResponse;
import com.konfigthis.client.model.DocumentRecipientsMapInner;
import com.konfigthis.client.model.DocumentRequest;
import com.konfigthis.client.model.DocumentSendReminderResponse;
import com.konfigthis.client.model.DocumentUpdateAndSendResponse;
import com.konfigthis.client.model.FilesMapInner;
import com.konfigthis.client.model.RemindRecipientsMapInner;
import com.konfigthis.client.model.SendReminderRequest;
import com.konfigthis.client.model.TemplateFieldsMapInner;
import com.konfigthis.client.model.TemplateRecipientsMapInner;
import java.util.UUID;
import com.konfigthis.client.model.UpdateDocumentAndSendRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentApi
 */
@Disabled
public class DocumentApiTest {

    private static DocumentApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DocumentApi(apiClient);
    }

    /**
     * Create Document from Template
     *
     * Creates and optionally sends a new document for signing. If &#x60;draft&#x60; is set to false the document will not be sent.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFromTemplateTest() throws ApiException {
        List<TemplateRecipientsMapInner> recipients = null;
        Boolean testMode = null;
        UUID templateId = null;
        List<String> templateIds = null;
        String name = null;
        String subject = null;
        String message = null;
        Boolean draft = null;
        Boolean withSignaturePage = null;
        Integer expiresIn = null;
        Boolean reminders = null;
        Boolean applySigningOrder = null;
        UUID apiApplicationId = null;
        Boolean embeddedSigning = null;
        Boolean embeddedSigningNotifications = null;
        Boolean textTags = null;
        String customRequesterName = null;
        String customRequesterEmail = null;
        String redirectUrl = null;
        Boolean allowDecline = null;
        Boolean allowReassign = null;
        String declineRedirectUrl = null;
        Object metadata = null;
        List<TemplateFieldsMapInner> templateFields = null;
        List<AdditionalFilesMapInner> files = null;
        List<List<AdditionalFieldsMapInnerInner>> fields = null;
        List<AttachmentRequestsMapInner> attachmentRequests = null;
        List<CopiedContactsMapInner> copiedContacts = null;
        DocumentCreateFromTemplateResponse response = api.createFromTemplate(recipients)
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
        // TODO: test validations
    }

    /**
     * Create Document
     *
     * Creates and optionally sends a new document for signing. If &#x60;draft&#x60; is set to false the document will not be sent.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewDocumentTest() throws ApiException {
        List<FilesMapInner> files = null;
        List<DocumentRecipientsMapInner> recipients = null;
        Boolean testMode = null;
        String name = null;
        String subject = null;
        String message = null;
        Boolean draft = null;
        Boolean withSignaturePage = null;
        Integer expiresIn = null;
        Boolean reminders = null;
        Boolean applySigningOrder = null;
        UUID apiApplicationId = null;
        Boolean embeddedSigning = null;
        Boolean embeddedSigningNotifications = null;
        Boolean textTags = null;
        String customRequesterName = null;
        String customRequesterEmail = null;
        String redirectUrl = null;
        Boolean allowDecline = null;
        Boolean allowReassign = null;
        String declineRedirectUrl = null;
        Object metadata = null;
        List<List<FieldsMapInnerInner>> fields = null;
        List<AttachmentRequestsMapInner> attachmentRequests = null;
        List<CopiedContactsMapInner> copiedContacts = null;
        DocumentCreateNewDocumentResponse response = api.createNewDocument(files, recipients)
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
        // TODO: test validations
    }

    /**
     * Delete Document
     *
     * Deletes a document. Deleting a document will also cancel document signing (if in progress).  Supply the unique document ID from either a Create Document request or document page URL.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDocumentTest() throws ApiException {
        UUID id = null;
        api.deleteDocument(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Completed PDF
     *
     * Gets a completed document PDF. Supply the unique document ID from either a document creation request or document page URL.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCompletedPdfTest() throws ApiException {
        UUID id = null;
        Boolean urlOnly = null;
        Boolean auditPage = null;
        Object response = api.getCompletedPdf(id)
                .urlOnly(urlOnly)
                .auditPage(auditPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Document
     *
     * Returns a document and all associated document data. Supply the unique document ID from either a document creation request or Document page URL.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDocumentDataTest() throws ApiException {
        UUID id = null;
        DocumentGetDocumentDataResponse response = api.getDocumentData(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Send Reminder
     *
     * Sends a reminder email to recipients that have not signed yet.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendReminderTest() throws ApiException {
        UUID id = null;
        List<RemindRecipientsMapInner> recipients = null;
        DocumentSendReminderResponse response = api.sendReminder(id)
                .recipients(recipients)
                .execute();
        // TODO: test validations
    }

    /**
     * Update and Send Document
     *
     * Updates a draft document and sends it to be signed by recipients.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAndSendTest() throws ApiException {
        UUID id = null;
        Boolean testMode = null;
        String name = null;
        String subject = null;
        String message = null;
        Integer expiresIn = null;
        Boolean reminders = null;
        Boolean applySigningOrder = null;
        UUID apiApplicationId = null;
        Boolean embeddedSigning = null;
        Boolean embeddedSigningNotifications = null;
        String customRequesterName = null;
        String customRequesterEmail = null;
        String redirectUrl = null;
        Boolean allowDecline = null;
        Boolean allowReassign = null;
        String declineRedirectUrl = null;
        Object metadata = null;
        DocumentUpdateAndSendResponse response = api.updateAndSend(id)
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
        // TODO: test validations
    }

}
