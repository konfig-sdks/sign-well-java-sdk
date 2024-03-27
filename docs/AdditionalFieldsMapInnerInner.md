

# AdditionalFieldsMapInnerInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**x** | **Float** | Horizontal value in the coordinates of the field (in pixels). Coordinates are specific to the page where fields are located. |  |
|**y** | **Float** | Vertical value in the coordinates of the field (in pixels). Coordinates are specific to the page where fields are located. |  |
|**page** | **Integer** | The page number within the file. If the page does not exist within the file then the field won&#39;t be created. |  |
|**recipientId** | **String** | Unique identifier of the recipient assigned to the field. Recipients assigned to fields will be the only ones that will see and be able to complete those fields. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Field type of the field. Valid field types: initials, signatures, checkbox, date, and text. To autofill fields with contact data, use an autofill field type. |  |
|**required** | **Boolean** | Whether the field must be completed by the recipient. Defaults to &#x60;true&#x60; except for checkbox type fields. |  [optional] |
|**label** | **String** | Text and Date fields only: label that is displayed when the field is empty. |  [optional] |
|**value** | **Object** | Varies according to the field type. Text fields accept strings or numbers. Date fields accept Iso8601 date strings. CheckBoxes accept booleans. Signature and Initials fields can&#39;t be signed through API requests. Autofill text fields accept strings or numbers. |  [optional] |
|**apiId** | **String** | Unique identifier of the field. Useful when needing to reference specific field values or update a document and its fields. |  [optional] |
|**validation** | [**ValidationEnum**](#ValidationEnum) | Text fields only: optional validation for field values. Valid values: numbers, letters, email_address, us_phone_number, us_zip_code, us_ssn, us_age, alphanumeric, us_bank_routing_number, us_bank_account. |  [optional] |
|**fixedWidth** | **Boolean** | Text fields only: whether the field width will stay fixed and text will display in multiple lines, rather than one long line. If set to &#x60;false&#x60; the field width will automatically grow horizontally to fit text on one line. Defaults to &#x60;false&#x60;. |  [optional] |
|**lockSignDate** | **Boolean** | Date fields only: makes fields readonly and automatically populates with the date the recipient signed. Defaults to &#x60;false&#x60;. |  [optional] |
|**dateFormat** | [**DateFormatEnum**](#DateFormatEnum) | Date fields only: date format to use for the field. Valid values: MM/DD/YYYY, DD/MM/YYYY, YYYY/MM/DD, Month DD, YYYY, and MM/DD/YYYY hh:mm:ss a. Defaults to MM/DD/YYYY. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INITIALS | &quot;initials&quot; |
| SIGNATURE | &quot;signature&quot; |
| CHECKBOX | &quot;checkbox&quot; |
| DATE | &quot;date&quot; |
| TEXT | &quot;text&quot; |
| AUTOFILL_COMPANY | &quot;autofill_company&quot; |
| AUTOFILL_EMAIL | &quot;autofill_email&quot; |
| AUTOFILL_FIRST_NAME | &quot;autofill_first_name&quot; |
| AUTOFILL_LAST_NAME | &quot;autofill_last_name&quot; |
| AUTOFILL_NAME | &quot;autofill_name&quot; |
| AUTOFILL_PHONE | &quot;autofill_phone&quot; |
| AUTOFILL_TITLE | &quot;autofill_title&quot; |
| AUTOFILL_DATE_SIGNED | &quot;autofill_date_signed&quot; |



## Enum: ValidationEnum

| Name | Value |
|---- | -----|
| NO_TEXT_VALIDATION | &quot;no_text_validation&quot; |
| NUMBERS | &quot;numbers&quot; |
| LETTERS | &quot;letters&quot; |
| EMAIL_ADDRESS | &quot;email_address&quot; |
| US_PHONE_NUMBER | &quot;us_phone_number&quot; |
| US_ZIP_CODE | &quot;us_zip_code&quot; |
| US_SSN | &quot;us_ssn&quot; |
| US_AGE | &quot;us_age&quot; |
| ALPHANUMERIC | &quot;alphanumeric&quot; |
| US_BANK_ROUTING_NUMBER | &quot;us_bank_routing_number&quot; |
| US_BANK_ACCOUNT_NUMBER | &quot;us_bank_account_number&quot; |



## Enum: DateFormatEnum

| Name | Value |
|---- | -----|
| MM_DD_YYYY | &quot;MM/DD/YYYY&quot; |
| DD_MM_YYYY | &quot;DD/MM/YYYY&quot; |
| YYYY_MM_DD | &quot;YYYY/MM/DD&quot; |
| MONTH_DD_YYYY | &quot;Month DD, YYYY&quot; |
| MM_DD_YYYY_HH_MM_SS_A | &quot;MM/DD/YYYY hh:mm:ss a&quot; |



