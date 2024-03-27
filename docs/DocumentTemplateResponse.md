

# DocumentTemplateResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**apiApplicationId** | **UUID** |  |  [optional] |
|**requesterEmailAddress** | **String** |  |  [optional] |
|**customRequesterName** | **String** |  |  [optional] |
|**customRequesterEmail** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**subject** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**metadata** | **Object** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**placeholders** | [**List&lt;DocumentTemplateResponsePlaceholdersInner&gt;**](DocumentTemplateResponsePlaceholdersInner.md) |  |  [optional] |
|**copiedPlaceholders** | [**List&lt;DocumentTemplateResponseCopiedPlaceholdersInner&gt;**](DocumentTemplateResponseCopiedPlaceholdersInner.md) |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**reminders** | **Boolean** |  |  [optional] |
|**archived** | **Boolean** |  |  [optional] |
|**templateLink** | **String** |  |  [optional] |
|**applySigningOrder** | **Boolean** |  |  [optional] |
|**redirectUrl** | **String** |  |  [optional] |
|**declineRedirectUrl** | **String** |  |  [optional] |
|**expiresIn** | **Integer** |  |  [optional] |
|**files** | [**List&lt;DocumentResponseFilesInner&gt;**](DocumentResponseFilesInner.md) |  |  [optional] |
|**fields** | **List&lt;List&lt;DocumentResponseFieldsInnerInner&gt;&gt;** |  |  [optional] |
|**allowDecline** | **Boolean** |  |  [optional] |
|**allowReassign** | **Boolean** |  |  [optional] |



