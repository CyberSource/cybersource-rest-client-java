
# InlineResponse20112Messages

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Message severity — &#x60;info&#x60; for informational, &#x60;error&#x60; for actionable errors.  Possible values: - info - error | 
**code** | **String** | Machine-readable error code. Present only when &#x60;type&#x60; is &#x60;error&#x60;. |  [optional]
**param** | **String** | JSONPath to the request field that caused the error. Present only on validation errors. |  [optional]
**contentType** | **String** | Format of the &#x60;content&#x60; field.  Possible values: - plain - markdown | 
**content** | **String** | Human-readable message text formatted according to &#x60;content_type&#x60;. | 



