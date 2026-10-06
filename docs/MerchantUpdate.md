
# MerchantUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantName** | **String** | Doing business as (DBA) name |  [optional]
**merchantUrl** | **String** | Base URL of the merchant&#39;s domain. Must use HTTPS and be unique — raises 409 if already registered. |  [optional]
**cryptogramType** | **String** | Authentication cryptogram type used for payment credential generation.  Possible values: - TAVV - DAVV |  [optional]
**paymentPayloadType** | **String** | Credential delivery format. Set to ***ENCRYPTED*** to enable JWE-encrypted payload delivery — requires an active encryption key. Returns 400 if no active key exists.  Possible values: - ENCRYPTED - UNENCRYPTED |  [optional]
**acceptanceRelationships** | **List&lt;String&gt;** | List of payment network acceptance relationships (e.g., \&quot;Visa\&quot;). |  [optional]
**protocolInteractions** | [**List&lt;Iccv1merchantsProtocolInteractions&gt;**](Iccv1merchantsProtocolInteractions.md) | List of protocol interaction configurations defining the merchant&#39;s endpoint for each supported protocol (ucp, acp, x402). |  [optional]
**webIntegrations** | [**MerchantRegistrationResponse201WebIntegrations**](MerchantRegistrationResponse201WebIntegrations.md) |  |  [optional]
**apiIntegrations** | [**MerchantRegistrationResponse201ApiIntegrations**](MerchantRegistrationResponse201ApiIntegrations.md) |  |  [optional]



