
# KmsV2KeysAsymDeletesPost200Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submitTimeUtc** | **String** | Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by authorization service.  #### PIN debit Time when the PIN debit credit, PIN debit purchase or PIN debit reversal was requested.  Returned by PIN debit credit, PIN debit purchase or PIN debit reversal.  |  [optional]
**clientReferenceInformation** | [**Kmsv2keyssymClientReferenceInformation**](Kmsv2keyssymClientReferenceInformation.md) |  |  [optional]
**keyInformation** | [**List&lt;KmsV2KeysAsymDeletesPost200ResponseKeyInformation&gt;**](KmsV2KeysAsymDeletesPost200ResponseKeyInformation.md) |  |  [optional]


