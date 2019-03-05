
# ReportingV3ReportSubscriptionsGet200ResponseSubscriptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationId** | **String** | Selected Organization Id |  [optional]
**reportDefinitionId** | **String** | Report Definition Id |  [optional]
**reportDefinitionName** | **String** | Report Definition Class |  [optional]
**reportMimeType** | [**ReportMimeTypeEnum**](#ReportMimeTypeEnum) | Report Format |  [optional]
**reportFrequency** | [**ReportFrequencyEnum**](#ReportFrequencyEnum) | Report Frequency |  [optional]
**reportName** | **String** | Report Name |  [optional]
**timezone** | **String** | Time Zone |  [optional]
**startTime** | [**DateTime**](DateTime.md) | Start Time |  [optional]
**startDay** | **Integer** | Start Day |  [optional]
**reportFields** | **List&lt;String&gt;** | List of all fields String values |  [optional]
**reportFilters** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | List of filters to apply |  [optional]
**reportPreferences** | [**ReportingV3ReportsIdGet200ResponseReportPreferences**](ReportingV3ReportsIdGet200ResponseReportPreferences.md) |  |  [optional]
**groupId** | **String** | Id for the selected group. |  [optional]


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



