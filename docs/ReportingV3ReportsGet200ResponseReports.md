
# ReportingV3ReportsGet200ResponseReports

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportDefinitionId** | **String** | Unique Report Identifier of each report type |  [optional]
**reportName** | **String** | Name of the report specified by merchant while creating the report |  [optional]
**reportMimeType** | [**ReportMimeTypeEnum**](#ReportMimeTypeEnum) | Format of the report to get generated |  [optional]
**reportFrequency** | [**ReportFrequencyEnum**](#ReportFrequencyEnum) | Frequency of the report to get generated |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the report |  [optional]
**reportStartTime** | [**DateTime**](DateTime.md) | Specifies the report start time in ISO 8601 format |  [optional]
**reportEndTime** | [**DateTime**](DateTime.md) | Specifies the report end time in ISO 8601 format |  [optional]
**timezone** | **String** | Time Zone |  [optional]
**reportId** | **String** | Unique identifier generated for every reports |  [optional]
**organizationId** | **String** | CyberSource Merchant Id |  [optional]
**queuedTime** | [**DateTime**](DateTime.md) | Specifies the time of the report in queued  in ISO 8601 format |  [optional]
**reportGeneratingTime** | [**DateTime**](DateTime.md) | Specifies the time of the report started to generate  in ISO 8601 format |  [optional]
**reportCompletedTime** | [**DateTime**](DateTime.md) | Specifies the time of the report completed the generation  in ISO 8601 format |  [optional]
**subscriptionType** | **String** | Specifies whether the subscription created is either Custom, Standard or Classic  |  [optional]
**groupId** | **String** | Id for selected group. |  [optional]


<a name="ReportMimeTypeEnum"></a>
## Enum: ReportMimeTypeEnum
Name | Value
---- | -----
APPLICATION_XML | &quot;application/xml&quot;
TEXT_CSV | &quot;text/csv&quot;


<a name="ReportFrequencyEnum"></a>
## Enum: ReportFrequencyEnum
Name | Value
---- | -----
DAILY | &quot;DAILY&quot;
WEEKLY | &quot;WEEKLY&quot;
MONTHLY | &quot;MONTHLY&quot;
ADHOC | &quot;ADHOC&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
COMPLETED | &quot;COMPLETED&quot;
PENDING | &quot;PENDING&quot;
QUEUED | &quot;QUEUED&quot;
RUNNING | &quot;RUNNING&quot;
ERROR | &quot;ERROR&quot;
NO_DATA | &quot;NO_DATA&quot;



