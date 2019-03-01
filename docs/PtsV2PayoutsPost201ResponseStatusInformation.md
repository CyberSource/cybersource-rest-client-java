
# PtsV2PayoutsPost201ResponseStatusInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason of the status.  |  [optional]
**message** | **String** | The detail message related to the status and reason listed above. Possible value is:    - Transaction was successful.   - You must call the issuing bank to proceed with the transaction.  |  [optional]


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
CONTACT_PROCESSOR | &quot;CONTACT_PROCESSOR&quot;



