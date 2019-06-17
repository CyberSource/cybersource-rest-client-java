
# FileDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | Unique identifier of a file |  [optional]
**name** | **String** | Name of the file |  [optional]
**createdTime** | [**DateTime**](DateTime.md) | Date and time for the file in PST |  [optional]
**lastModifiedTime** | [**DateTime**](DateTime.md) | Date and time for the file in PST |  [optional]
**date** | [**LocalDate**](LocalDate.md) | Date and time for the file in PST |  [optional]
**mimeType** | [**MimeTypeEnum**](#MimeTypeEnum) | File extension |  [optional]
**size** | **Integer** | Size of the file in bytes |  [optional]


<a name="MimeTypeEnum"></a>
## Enum: MimeTypeEnum
Name | Value
---- | -----
APPLICATION_XML | &quot;application/xml&quot;
TEXT_CSV | &quot;text/csv&quot;
APPLICATION_PDF | &quot;application/pdf&quot;
APPLICATION_OCTET_STREAM | &quot;application/octet-stream&quot;



