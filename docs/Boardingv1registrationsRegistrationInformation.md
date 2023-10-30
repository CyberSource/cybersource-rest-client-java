
# Boardingv1registrationsRegistrationInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boardingRegistrationId** | **String** |  |  [optional]
**submitTimeUtc** | [**LocalDate**](LocalDate.md) | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of Registration request Possible Values:   - &#39;PROCESSING&#39;: This status is for Registrations that are still in Progress, you can get the latest status by calling the GET endpoint using the Registration Id   - &#39;SUCCESS&#39;: This status is for Registrations that were successfull on every step of the on boarding process.   - &#39;FAILURE&#39;: This status is for Registrations that fail before the Organization was created; please refer to the details section in the reponse for more information.   - &#39;PARTIAL&#39;: This status is for Registrations that created the Organization successfully but fail in at least on step while configuring it; please refer to the details section in the response for more information.  |  [optional]
**boardingPackageId** | **String** |  |  [optional]
**boardingFlow** | [**BoardingFlowEnum**](#BoardingFlowEnum) | Determines the boarding flow for this registration. Possible Values:   - &#39;ENTERPRISE&#39;   - &#39;SMB&#39;   - &#39;ADDPRODUCT&#39;  |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | In case mode is not provided the API will use COMPLETE as default Possible Values:   - &#39;COMPLETE&#39;   - &#39;PARTIAL&#39;  |  [optional]
**salesRepId** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PROCESSING | &quot;PROCESSING&quot;
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
PARTIAL | &quot;PARTIAL&quot;


<a name="BoardingFlowEnum"></a>
## Enum: BoardingFlowEnum
Name | Value
---- | -----
ENTERPRISE | &quot;ENTERPRISE&quot;
SMB | &quot;SMB&quot;
ADDPRODUCT | &quot;ADDPRODUCT&quot;


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
COMPLETE | &quot;COMPLETE&quot;
PARTIAL | &quot;PARTIAL&quot;



