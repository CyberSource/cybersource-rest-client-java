
# ReportingV3NetFundingsGet200Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startTime** | [**DateTime**](DateTime.md) | Valid report Start Date in **ISO 8601 format**. Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example:** - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  |  [optional]
**endTime** | [**DateTime**](DateTime.md) | Valid report End Date in **ISO 8601 format** **Example date format:** - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  |  [optional]
**netFundingSummaries** | [**List&lt;ReportingV3NetFundingsGet200ResponseNetFundingSummaries&gt;**](ReportingV3NetFundingsGet200ResponseNetFundingSummaries.md) | List of Netfunding summary objects |  [optional]
**totalPurchases** | [**List&lt;ReportingV3NetFundingsGet200ResponseTotalPurchases&gt;**](ReportingV3NetFundingsGet200ResponseTotalPurchases.md) | List of total purchases currency wise |  [optional]
**totalRefunds** | [**List&lt;ReportingV3NetFundingsGet200ResponseTotalPurchases&gt;**](ReportingV3NetFundingsGet200ResponseTotalPurchases.md) | List of total refunds currency wise |  [optional]
**totalFees** | [**List&lt;ReportingV3NetFundingsGet200ResponseTotalPurchases&gt;**](ReportingV3NetFundingsGet200ResponseTotalPurchases.md) | List of total fees currency wise |  [optional]
**totalChargebacks** | [**List&lt;ReportingV3NetFundingsGet200ResponseTotalPurchases&gt;**](ReportingV3NetFundingsGet200ResponseTotalPurchases.md) | List of total chargebacks currency wise |  [optional]
**netTotal** | [**List&lt;ReportingV3NetFundingsGet200ResponseTotalPurchases&gt;**](ReportingV3NetFundingsGet200ResponseTotalPurchases.md) | List of new total currency wise |  [optional]



