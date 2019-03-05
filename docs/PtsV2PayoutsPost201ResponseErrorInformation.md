
# PtsV2PayoutsPost201ResponseErrorInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason of the status.  |  [optional]
**message** | **String** | The detail message related to the status and reason listed above. |  [optional]
**details** | [**List&lt;PtsV2PayoutsPost201ResponseErrorInformationDetails&gt;**](PtsV2PayoutsPost201ResponseErrorInformationDetails.md) |  |  [optional]


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
EXPIRED_CARD | &quot;EXPIRED_CARD&quot;
PROCESSOR_DECLINED | &quot;PROCESSOR_DECLINED&quot;
STOLEN_LOST_CARD | &quot;STOLEN_LOST_CARD&quot;
UNAUTHORIZED_CARD | &quot;UNAUTHORIZED_CARD&quot;
CVN_NOT_MATCH | &quot;CVN_NOT_MATCH&quot;
INVALID_CVN | &quot;INVALID_CVN&quot;
BLACKLISTED_CUSTOMER | &quot;BLACKLISTED_CUSTOMER&quot;
INVALID_ACCOUNT | &quot;INVALID_ACCOUNT&quot;
GENERAL_DECLINE | &quot;GENERAL_DECLINE&quot;
RISK_CONTROL_DECLINE | &quot;RISK_CONTROL_DECLINE&quot;
PROCESSOR_RISK_CONTROL_DECLINE | &quot;PROCESSOR_RISK_CONTROL_DECLINE&quot;



