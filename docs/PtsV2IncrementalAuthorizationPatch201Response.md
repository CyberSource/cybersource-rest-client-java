
# PtsV2IncrementalAuthorizationPatch201Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**PtsV2IncrementalAuthorizationPatch201ResponseLinks**](PtsV2IncrementalAuthorizationPatch201ResponseLinks.md) |  |  [optional]
**id** | **String** | An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response.  |  [optional]
**submitTimeUtc** | **String** | Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services.  |  [optional]
**status** | **String** | The status of the submitted transaction.  Possible values:  - AUTHORIZED  - AUTHORIZED_PENDING_REVIEW  - DECLINED  |  [optional]
**reconciliationId** | **String** | Reference number for the transaction. Depending on how your Cybersource account is configured, this value could either be provided in the API request or generated by CyberSource. The actual value used in the request to the processor is provided back to you by Cybersource in the response.  |  [optional]
**errorInformation** | [**PtsV2IncrementalAuthorizationPatch201ResponseErrorInformation**](PtsV2IncrementalAuthorizationPatch201ResponseErrorInformation.md) |  |  [optional]
**clientReferenceInformation** | [**PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation**](PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation.md) |  |  [optional]
**processorInformation** | [**PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation**](PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation.md) |  |  [optional]
**paymentInformation** | [**PtsV2IncrementalAuthorizationPatch201ResponsePaymentInformation**](PtsV2IncrementalAuthorizationPatch201ResponsePaymentInformation.md) |  |  [optional]
**orderInformation** | [**PtsV2IncrementalAuthorizationPatch201ResponseOrderInformation**](PtsV2IncrementalAuthorizationPatch201ResponseOrderInformation.md) |  |  [optional]



