
# InlineResponse2011

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**submitTimeUtc** | [**LocalDate**](LocalDate.md) | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of Registration request Possible Values:   - &#39;INITIALIZED&#39;   - &#39;RECEIVED&#39;   - &#39;PROCESSING&#39;   - &#39;SUCCESS&#39;   - &#39;FAILURE&#39;   - &#39;PARTIAL&#39;  |  [optional]
**registrationInformation** | [**InlineResponse2011RegistrationInformation**](InlineResponse2011RegistrationInformation.md) |  |  [optional]
**integrationInformation** | [**InlineResponse2011IntegrationInformation**](InlineResponse2011IntegrationInformation.md) |  |  [optional]
**organizationInformation** | [**InlineResponse2011OrganizationInformation**](InlineResponse2011OrganizationInformation.md) |  |  [optional]
**productInformationSetups** | [**List&lt;InlineResponse2011ProductInformationSetups&gt;**](InlineResponse2011ProductInformationSetups.md) |  |  [optional]
**message** | **String** |  |  [optional]
**details** | [**Map&lt;String, List&lt;Object&gt;&gt;**](List.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INITIALIZED | &quot;INITIALIZED&quot;
RECEIVED | &quot;RECEIVED&quot;
PROCESSING | &quot;PROCESSING&quot;
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
PARTIAL | &quot;PARTIAL&quot;



