

# DocumentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testMode** | **Boolean** | Set to &#x60;true&#x60; to enable Test Mode. Documents created with Test Mode do not count towards API billing and are not legally binding. Defaults to &#x60;false&#x60; |  [optional] |
|**files** | [**List&lt;FilesMapInner&gt;**](FilesMapInner.md) |  |  |
|**name** | **String** | The name of the document. |  [optional] |
|**subject** | **String** | Email subject for the signature request that recipients will see. Defaults to the default system subject or a template subject (if the document is created from a template). |  [optional] |
|**message** | **String** | Email message for the signature request that recipients will see. Defaults to the default system message or a template message (if the document is created from a template). |  [optional] |
|**recipients** | [**List&lt;DocumentRecipientsMapInner&gt;**](DocumentRecipientsMapInner.md) | Document recipients are people that must complete and/or sign a document. |  |
|**draft** | **Boolean** | Whether the document can still be updated before sending a signature request. If set to &#x60;false&#x60; the document is sent for signing as part of this request. Defaults to &#x60;false&#x60;. |  [optional] |
|**withSignaturePage** | **Boolean** | When set to &#x60;true&#x60; the document will have a signature page added to the end, and all signers will be required to add their signature on that page. |  [optional] |
|**expiresIn** | **Integer** | Number of days before the signature request expires. Defaults to the account expiration setting or template expiration (if the document is created from a template). |  [optional] |
|**reminders** | **Boolean** | Whether to send signing reminders to recipients. Reminders are sent on day 3, day 6, and day 10 if set to &#x60;true&#x60;. Defaults to &#x60;true&#x60;. |  [optional] |
|**applySigningOrder** | **Boolean** | When set to &#x60;true&#x60; recipients will sign one at a time in the order of the &#x60;recipients&#x60; collection of this request. |  [optional] |
|**apiApplicationId** | **UUID** | Unique identifier for API Application settings to use. API Applications are optional and mainly used when isolating OAuth apps or for more control over embedded API settings |  [optional] |
|**embeddedSigning** | **Boolean** | When set to &#x60;true&#x60; it enables embedded signing in your website/web application. Embedded functionality works with an iFrame and email authentication is disabled. :embedded_signinig defaults to &#x60;false&#x60;. |  [optional] |
|**embeddedSigningNotifications** | **Boolean** | On embedding signing, document owners (and CC&#39;d contacts) do not get a notification email when documents have been completed. Setting this param to &#x60;true&#x60; will send out those final completed notifications. Default is &#x60;false&#x60; |  [optional] |
|**textTags** | **Boolean** | An alternative way (if you can’t use the recommended way) of placing fields in specific locations of your document by using special text tags. Useful when changing the content of your files changes the location of fields. See API documentation for “Text Tags” for details. Defaults to false. |  [optional] |
|**customRequesterName** | **String** | Sets the custom requester name for the document. When set, this is the name used for all email communications, signing notifications, and in the audit file. |  [optional] |
|**customRequesterEmail** | **String** | Sets the custom requester email for the document. When set, this is the email used for all email communications, signing notifications, and in the audit file. |  [optional] |
|**redirectUrl** | **String** | A URL that recipients are redirected to after successfully signing a document. |  [optional] |
|**allowDecline** | **Boolean** | Whether to allow recipients the option to decline signing a document. If multiple signers are involved in a document, any single recipient can cancel the entire document signing process by declining to sign. |  [optional] |
|**allowReassign** | **Boolean** | In some cases a signer is not the right person to sign and may need to reassign their signing responsibilities to another person. This feature allows them to reassign the document to someone else. |  [optional] |
|**declineRedirectUrl** | **String** | A URL that recipients are redirected to if the document is declined. |  [optional] |
|**metadata** | **Object** | Optional key-value data that can be associated with the document. If set, will be available every time the document data is returned. |  [optional] |
|**fields** | **List&lt;List&lt;FieldsMapInnerInner&gt;&gt;** | Document fields placed on a document for collecting data or signatures from recipients. At least one field must be present in the Create Document request if &#x60;draft&#x60; is &#x60;false&#x60; (unless adding a signature page by using &#x60;with_signature_page&#x60;). Field data should be sent as a 2-dimensional JSON array. One array of fields is needed for each file in the files array. An array of fields can be empty if you have a file that does not contain any fields. |  [optional] |
|**attachmentRequests** | [**List&lt;AttachmentRequestsMapInner&gt;**](AttachmentRequestsMapInner.md) | Attachments that a recipient must upload to complete the signing process. Attachment requests are shown after all document fields have been completed. |  [optional] |
|**copiedContacts** | [**List&lt;CopiedContactsMapInner&gt;**](CopiedContactsMapInner.md) | Copied contacts are emailed the final document once it has been completed by all recipients. |  [optional] |



