

# DocumentRecipientsMapInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier that you will give to each recipient. We recommend numbering sequentially from 1 to X. IDs are required for associating recipients to fields and more. |  |
|**name** | **String** | Name of the recipient. |  [optional] |
|**email** | **String** | Email address for the recipient. |  |
|**passcode** | **String** | If set, signers assigned with a passcode will be required to enter the passcode before they’re able to view and complete the document. |  [optional] |
|**subject** | **String** | Email subject for the signature request that the recipient will see. Overrides the general subject for the document. |  [optional] |
|**message** | **String** | Email message for the signature request that the recipient will see. Overrides the general message for the document. |  [optional] |
|**sendEmail** | **Boolean** | Applies on when &#x60;embedded_signing&#x60; is &#x60;true&#x60;. By default, recipients are not notified through email to sign when doing embedded signing. Setting this to &#x60;true&#x60;  will send a notification email to the recipient. Default is &#x60;false&#x60;. |  [optional] |
|**sendEmailDelay** | **Integer** | If &#x60;send_email&#x60; is &#x60;true&#x60; recipients will receive a new document notification immediately. In the case of embedded signing, you can delay this notification to only send if the document is not completed within a few minutes. The email notification will not go out if the document is completed before the delay time is over. Valid values are in minutes ranging from &#x60;0&#x60; to &#x60;60&#x60;. Defaults to &#x60;0&#x60;. |  [optional] |



