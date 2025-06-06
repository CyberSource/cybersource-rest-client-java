
# RiskV1AuthenticationSetupsPost201Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**PtsV2IncrementalAuthorizationPatch201ResponseLinks**](PtsV2IncrementalAuthorizationPatch201ResponseLinks.md) |  |  [optional]
**id** | **String** | An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response.  |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services.  |  [optional]
**status** | **String** | The status for payerAuthentication 201 setup calls. Possible value is: - COMPLETED - FAILED  |  [optional]
**consumerAuthenticationInformation** | [**RiskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation**](RiskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation.md) |  |  [optional]
**clientReferenceInformation** | [**RiskV1DecisionsPost201ResponseClientReferenceInformation**](RiskV1DecisionsPost201ResponseClientReferenceInformation.md) |  |  [optional]
**errorInformation** | [**RiskV1AuthenticationSetupsPost201ResponseErrorInformation**](RiskV1AuthenticationSetupsPost201ResponseErrorInformation.md) |  |  [optional]



