
# MerchantRegistrationResponse201

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique merchant identifier (UUID) | 
**merchantName** | **String** | Doing business as (DBA) name | 
**merchantUrl** | **String** | Fully-qualified HTTPS URL of the merchant&#39;s domain | 
**vmid** | **String** | Visa Merchant ID (VMID) — unique identifier assigned by Visa |  [optional]
**cryptogramType** | **String** | Authentication cryptogram type used for payment credential generation: &#39;TAVV&#39; (Token Authentication Verification Value) or &#39;DAVV&#39; (Device Authentication Verification Value)  Possible values: - TAVV - DAVV |  [optional]
**paymentPayloadType** | **String** | Credential delivery format: &#39;ENCRYPTED&#39; (JWE-wrapped, requires an active encryption key) or &#39;UNENCRYPTED&#39;  Possible values: - ENCRYPTED - UNENCRYPTED |  [optional]
**indicator** | **String** | Transaction processing indicator: &#39;TAP&#39; (Trusted Agent Protocol), &#39;ACG&#39; (Agentic Checkout Gateway), or &#39;BOTH&#39;  Possible values: - TAP - ACG - BOTH | 
**merchantMetadata** | **Object** | Free-form metadata object for additional merchant context |  [optional]
**acceptanceRelationships** | **List&lt;String&gt;** | List of payment network acceptance relationships (e.g., \&quot;Visa\&quot;) |  [optional]
**protocolInteractions** | [**List&lt;Iccv1merchantsProtocolInteractions&gt;**](Iccv1merchantsProtocolInteractions.md) | List of protocol endpoint configurations defining how agents interact with this merchant (ucp, acp, x402) |  [optional]
**webIntegrations** | [**MerchantRegistrationResponse201WebIntegrations**](MerchantRegistrationResponse201WebIntegrations.md) |  |  [optional]
**apiIntegrations** | [**MerchantRegistrationResponse201ApiIntegrations**](MerchantRegistrationResponse201ApiIntegrations.md) |  |  [optional]
**isActive** | **Boolean** | Whether the merchant is active | 
**createdAt** | [**DateTime**](DateTime.md) | Creation timestamp | 
**updatedAt** | [**DateTime**](DateTime.md) | Last update timestamp | 
**keys** | [**List&lt;MerchantRegistrationResponse201Keys&gt;**](MerchantRegistrationResponse201Keys.md) | List of encryption keys associated with the merchant |  [optional]



