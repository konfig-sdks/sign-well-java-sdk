

# BulkSendCsvRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**templateIds** | **List&lt;UUID&gt;** | Specify one or more templates to generate a single blank CSV file that will contain available columns for your recipient data. The template_ids[] parameter is an array of template IDs (e.g.,&#x60;/?template_ids[]&#x3D;5a67dbd7-928a-4ea0-a7e2-e476a0eb045f&amp;template_ids[]&#x3D;d7315111-c671-4b15-8354-c9a19bbaefa0&#x60;). Each ID should be a separate parameter in the query string. |  |
|**bulkSendCsv** | **byte[]** | A RFC 4648 base64 string of the template CSV file to be validated. |  |



