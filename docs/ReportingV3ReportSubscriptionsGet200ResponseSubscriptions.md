
# ReportingV3ReportSubscriptionsGet200ResponseSubscriptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationId** | **String** | Selected Organization Id |  [optional]
**reportDefinitionId** | **String** | Report Definition Id |  [optional]
**reportDefinitionName** | **String** | Report Definition Class |  [optional]
**reportMimeType** | **String** | Report Format                          Valid values: - application/xml - text/csv  |  [optional]
**reportFrequency** | **String** | &#39;Report Frequency&#39;  Valid values: - DAILY - WEEKLY - MONTHLY - ADHOC  |  [optional]
**reportName** | **String** | Report Name |  [optional]
**timezone** | **String** | Time Zone |  [optional]
**startTime** | [**DateTime**](DateTime.md) | Start Time |  [optional]
**startDay** | **Integer** | Start Day |  [optional]
**reportFields** | **List&lt;String&gt;** | List of all fields String values |  [optional]
**reportFilters** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | List of filters to apply |  [optional]
**reportPreferences** | [**Reportingv3reportsReportPreferences**](Reportingv3reportsReportPreferences.md) |  |  [optional]
**groupId** | **String** | Id for the selected group. |  [optional]



