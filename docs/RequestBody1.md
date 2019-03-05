
# RequestBody1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationId** | **String** | Valid CyberSource organizationId |  [optional]
**reportDefinitionName** | **String** | Valid Report Definition Name | 
**reportFields** | **List&lt;String&gt;** |  | 
**reportMimeType** | [**ReportMimeTypeEnum**](#ReportMimeTypeEnum) |  | 
**reportFrequency** | [**ReportFrequencyEnum**](#ReportFrequencyEnum) | The frequency for which subscription is created. | 
**reportName** | **String** |  | 
**timezone** | **String** |  | 
**startTime** | **String** | The hour at which the report generation should start. It should be in hhmm format. | 
**startDay** | **Integer** | This is the start day if the frequency is WEEKLY or MONTHLY. The value varies from 1-7 for WEEKLY and 1-31 for MONTHLY. For WEEKLY 1 means Sunday and 7 means Saturday. By default the value is 1. |  [optional]
**reportFilters** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | List of filters to apply |  [optional]
**reportPreferences** | [**ReportingV3ReportsIdGet200ResponseReportPreferences**](ReportingV3ReportsIdGet200ResponseReportPreferences.md) |  |  [optional]
**groupName** | **String** | Valid GroupName |  [optional]


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



