
# Acpv1mppcredentialsChallenge

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique challenge identifier issued by the merchant server. | 
**realm** | **String** | Merchant realm (typically the API domain). | 
**amount** | **String** | Amount in the smallest currency unit (e.g., &#39;4999&#39; &#x3D; $49.99). | 
**currency** | **String** | Three-letter ISO 4217 currency code, lowercase (e.g., &#39;usd&#39;). | 
**acceptedNetworks** | **List&lt;String&gt;** | Card networks accepted by the merchant (e.g., [&#39;visa&#39;, &#39;mastercard&#39;]). | 
**merchantId** | **String** | Merchant identifier (maps to &#39;recipient&#39; in MPP spec request object). | 
**merchantName** | **String** | Human-readable merchant name. | 
**encryptionJwk** | [**Acpv1mppcredentialsChallengeEncryptionJwk**](Acpv1mppcredentialsChallengeEncryptionJwk.md) |  | 



