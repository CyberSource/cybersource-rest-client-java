
# TssV2PostEmvTags200ResponseParsedEMVTagsList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response.  |  [optional]
**totalTags** | **Integer** | Number of tags parsed  |  [optional]
**emvTagBreakdownList** | [**List&lt;TssV2PostEmvTags200ResponseEmvTagBreakdownList&gt;**](TssV2PostEmvTags200ResponseEmvTagBreakdownList.md) | An array of objects, where each object contains one parsed tag from the relevant EMV string.  |  [optional]



