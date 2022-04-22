
# Kmsv2keyssymverifiKeyInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationId** | **String** | Merchant Id  | 
**referenceNumber** | **String** | Reference number is a unique identifier provided by the client along with the organization Id. This is an optional field provided solely for the client’s convenience. If client specifies value for this field in the request, it is expected to be available in the response.  |  [optional]
**digestAlgorithm** | [**DigestAlgorithmEnum**](#DigestAlgorithmEnum) | Algorithm for message signature authentication  |  [optional]


<a name="DigestAlgorithmEnum"></a>
## Enum: DigestAlgorithmEnum
Name | Value
---- | -----
HMACSHA1 | &quot;HMACSHA1&quot;
HMACSHA2 | &quot;HMACSHA2&quot;



