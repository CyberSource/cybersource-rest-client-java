
# InlineResponse2007

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalCount** | **Integer** | Total number of results. |  [optional]
**offset** | **Integer** | Controls the starting point within the collection of results, which defaults to 0. The first item in the collection is retrieved by setting a zero offset.  For example, if you have a collection of 15 items to be retrieved from a resource and you specify limit&#x3D;5, you can retrieve the entire set of results in 3 successive requests by varying the offset value like this:  &#x60;offset&#x3D;0&#x60; &#x60;offset&#x3D;5&#x60; &#x60;offset&#x3D;10&#x60;  **Note:** If an offset larger than the number of results is provided, this will result in no embedded object being returned.  |  [optional]
**limit** | **Integer** | Controls the maximum number of items that may be returned for a single request. The default is 20, the maximum is 2500.  |  [optional]
**sort** | **String** | A comma separated list of the following form:  &#x60;terminalCreationDate:desc or serialNumber or terminalUpdationDate&#x60;  |  [optional]
**count** | **Integer** | Results for this page, this could be below the limit. |  [optional]
**devices** | [**List&lt;InlineResponse2007Devices&gt;**](InlineResponse2007Devices.md) | A collection of devices |  [optional]



