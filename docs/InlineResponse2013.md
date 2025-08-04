
# InlineResponse2013

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**submitTimeUtc** | [**DateTime**](DateTime.md) | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | **String** | The status of Registration request Possible Values:   - &#39;INITIALIZED&#39;   - &#39;RECEIVED&#39;   - &#39;PROCESSING&#39;   - &#39;SUCCESS&#39;   - &#39;FAILURE&#39;   - &#39;PARTIAL&#39;  |  [optional]
**registrationInformation** | [**InlineResponse2013RegistrationInformation**](InlineResponse2013RegistrationInformation.md) |  |  [optional]
**integrationInformation** | [**InlineResponse2013IntegrationInformation**](InlineResponse2013IntegrationInformation.md) |  |  [optional]
**organizationInformation** | [**InlineResponse2013OrganizationInformation**](InlineResponse2013OrganizationInformation.md) |  |  [optional]
**productInformationSetups** | [**List&lt;InlineResponse2013ProductInformationSetups&gt;**](InlineResponse2013ProductInformationSetups.md) |  |  [optional]
**message** | **String** |  |  [optional]
**details** | [**Map&lt;String, List&lt;Object&gt;&gt;**](List.md) |  |  [optional]



