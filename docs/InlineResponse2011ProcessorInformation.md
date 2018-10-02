
# InlineResponse2011ProcessorInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Processor transaction ID.  This value identifies the transaction on a host system. This value is supported only for Moneris. It contains this information:   - Terminal used to process the transaction  - Shift during which the transaction took place  - Batch number  - Transaction number within the batch  You must store this value. If you give the customer a receipt, display this value on the receipt.  Example For the value 66012345001069003:   - Terminal ID &#x3D; 66012345  - Shift number &#x3D; 001  - Batch number &#x3D; 069  - Transaction number &#x3D; 003  |  [optional]
**responseCode** | **String** | For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  Important Do not use this field to evaluate the result of the authorization.  |  [optional]
**responseCategoryCode** | **String** | Processor-defined response category code. The associated detail error code is in the auth_auth_response field or the auth_reversal_auth_ response field depending on which service you requested.  This field is supported only for:   - Japanese issuers  - Domestic transactions in Japan  - Comercio Latinoâ€”processor transaction ID required for troubleshooting  **Maximum length for processors**:   - Comercio Latino: 32  - All other processors: 3  |  [optional]
**forwardedAcquirerCode** | **String** | Name of the Japanese acquirer that processed the transaction. Returned only for CCS (CAFIS) and JCN Gateway. Please contact the CyberSource Japan Support Group for more information.  |  [optional]
**masterCardServiceCode** | **String** | Mastercard service that was used for the transaction. Mastercard provides this value to CyberSource.  Possible value:  - 53: Mastercard card-on-file token service  |  [optional]
**masterCardServiceReplyCode** | **String** | Result of the Mastercard card-on-file token service. Mastercard provides this value to CyberSource.  Possible values:   - **C**: Service completed successfully.  - **F**: One of the following:    - Incorrect Mastercard POS entry mode. The Mastercard POS entry mode should be 81 for an authorization or      authorization reversal.    - Incorrect Mastercard POS entry mode. The Mastercard POS entry mode should be 01 for a tokenized request.    - Token requestor ID is missing or formatted incorrectly.  - **I**: One of the following:    - Invalid token requestor ID.    - Suspended or deactivated token.    - Invalid token (not in mapping table).  - **T**: Invalid combination of token requestor ID and token.  - **U**: Expired token.  - **W**: Primary account number (PAN) listed in electronic warning bulletin.  Note This field is returned only for **CyberSource through VisaNet**.  |  [optional]



