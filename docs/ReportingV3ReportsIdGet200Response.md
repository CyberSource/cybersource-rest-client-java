
# ReportingV3ReportsIdGet200Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationId** | **String** | CyberSource merchant id |  [optional]
**reportId** | **String** | Report ID Value |  [optional]
**reportDefinitionId** | **String** | Report definition Id |  [optional]
**reportName** | **String** | Report Name |  [optional]
**reportMimeType** | **String** | Report Format  Valid values: - application/xml - text/csv  |  [optional]
**reportFrequency** | **String** | Report Frequency Value  Valid values: - DAILY - WEEKLY - MONTHLY - ADHOC  |  [optional]
**reportFields** | **List&lt;String&gt;** | List of Integer Values |  [optional]
**reportStatus** | **String** | Report Status Value  Valid values: - COMPLETED - PENDING - QUEUED - RUNNING - ERROR - NO_DATA - RERUN  |  [optional]
**reportStartTime** | [**DateTime**](DateTime.md) | Report Start Time Value |  [optional]
**reportEndTime** | [**DateTime**](DateTime.md) | Report End Time Value |  [optional]
**timezone** | **String** | Time Zone Value |  [optional]
**reportFilters** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | List of filters to apply |  [optional]
**reportPreferences** | [**Reportingv3reportsReportPreferences**](Reportingv3reportsReportPreferences.md) |  |  [optional]
**groupId** | **String** | Id for selected group. |  [optional]



