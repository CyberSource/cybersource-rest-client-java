
# PtsV2PaymentsPost201ResponseErrorInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason of the status.  Possible values:  - AVS_FAILED  - CONTACT_PROCESSOR  - EXPIRED_CARD  - PROCESSOR_DECLINED  - INSUFFICIENT_FUND  - STOLEN_LOST_CARD  - ISSUER_UNAVAILABLE  - UNAUTHORIZED_CARD  - CVN_NOT_MATCH  - EXCEEDS_CREDIT_LIMIT  - INVALID_CVN  - DECLINED_CHECK  - BLACKLISTED_CUSTOMER  - SUSPENDED_ACCOUNT  - PAYMENT_REFUSED  - CV_FAILED  - INVALID_ACCOUNT  - GENERAL_DECLINE  - INVALID_MERCHANT_CONFIGURATION  - DECISION_PROFILE_REJECT  - SCORE_EXCEEDS_THRESHOLD  |  [optional]
**message** | **String** | The detail message related to the status and reason listed above. |  [optional]
**details** | [**List&lt;PtsV2PaymentsPost201ResponseErrorInformationDetails&gt;**](PtsV2PaymentsPost201ResponseErrorInformationDetails.md) |  |  [optional]


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
AVS_FAILED | &quot;AVS_FAILED&quot;
CONTACT_PROCESSOR | &quot;CONTACT_PROCESSOR&quot;
CV_FAILED | &quot;CV_FAILED&quot;
EXPIRED_CARD | &quot;EXPIRED_CARD&quot;
PROCESSOR_DECLINED | &quot;PROCESSOR_DECLINED&quot;
INSUFFICIENT_FUND | &quot;INSUFFICIENT_FUND&quot;
STOLEN_LOST_CARD | &quot;STOLEN_LOST_CARD&quot;
ISSUER_UNAVAILABLE | &quot;ISSUER_UNAVAILABLE&quot;
UNAUTHORIZED_CARD | &quot;UNAUTHORIZED_CARD&quot;
CVN_NOT_MATCH | &quot;CVN_NOT_MATCH&quot;
EXCEEDS_CREDIT_LIMIT | &quot;EXCEEDS_CREDIT_LIMIT&quot;
INVALID_CVN | &quot;INVALID_CVN&quot;
PAYMENT_REFUSED | &quot;PAYMENT_REFUSED&quot;
INVALID_ACCOUNT | &quot;INVALID_ACCOUNT&quot;
GENERAL_DECLINE | &quot;GENERAL_DECLINE&quot;
DECISION_PROFILE_REJECT | &quot;DECISION_PROFILE_REJECT&quot;
SCORE_EXCEEDS_THRESHOLD | &quot;SCORE_EXCEEDS_THRESHOLD&quot;



