
# ReportingV3ReportsIdGet200Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationId** | **String** | CyberSource merchant id |  [optional]
**reportId** | **String** | Report ID Value |  [optional]
**reportDefinitionId** | **String** | Report definition Id |  [optional]
**reportName** | **String** | Report Name |  [optional]
**reportMimeType** | [**ReportMimeTypeEnum**](#ReportMimeTypeEnum) | Report Format |  [optional]
**reportFrequency** | [**ReportFrequencyEnum**](#ReportFrequencyEnum) | Report Frequency Value |  [optional]
**reportFields** | **List&lt;String&gt;** | List of Integer Values |  [optional]
**reportStatus** | [**ReportStatusEnum**](#ReportStatusEnum) | Report Status Value |  [optional]
**reportStartTime** | [**DateTime**](DateTime.md) | Report Start Time Value |  [optional]
**reportEndTime** | [**DateTime**](DateTime.md) | Report End Time Value |  [optional]
**timezone** | **String** | Time Zone Value |  [optional]
**reportFilters** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | List of filters to apply |  [optional]
**reportPreferences** | [**ReportingV3ReportsIdGet200ResponseReportPreferences**](ReportingV3ReportsIdGet200ResponseReportPreferences.md) |  |  [optional]
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


<a name="ReportStatusEnum"></a>
## Enum: ReportStatusEnum
Name | Value
---- | -----
COMPLETED | &quot;COMPLETED&quot;
PENDING | &quot;PENDING&quot;
QUEUED | &quot;QUEUED&quot;
RUNNING | &quot;RUNNING&quot;
ERROR | &quot;ERROR&quot;
NO_DATA | &quot;NO_DATA&quot;
RERUN | &quot;RERUN&quot;



