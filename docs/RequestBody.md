
# RequestBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationId** | **String** | Valid CyberSource Organization Id |  [optional]
**reportDefinitionName** | **String** |  |  [optional]
**reportFields** | **List&lt;String&gt;** | List of fields which needs to get included in a report |  [optional]
**reportMimeType** | [**ReportMimeTypeEnum**](#ReportMimeTypeEnum) |  Format of the report |  [optional]
**reportName** | **String** | Name of the report |  [optional]
**timezone** | **String** | Timezone of the report |  [optional]
**reportStartTime** | [**DateTime**](DateTime.md) | Start time of the report |  [optional]
**reportEndTime** | [**DateTime**](DateTime.md) | End time of the report |  [optional]
**reportFilters** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | List of filters to apply |  [optional]
**reportPreferences** | [**Reportingv3reportsReportPreferences**](Reportingv3reportsReportPreferences.md) |  |  [optional]
**groupName** | **String** | Specifies the group name |  [optional]


<a name="ReportMimeTypeEnum"></a>
## Enum: ReportMimeTypeEnum
Name | Value
---- | -----
APPLICATION_XML | &quot;application/xml&quot;
TEXT_CSV | &quot;text/csv&quot;



