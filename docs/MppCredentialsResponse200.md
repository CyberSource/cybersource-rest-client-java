
# MppCredentialsResponse200

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** | Base64-encoded RSA-OAEP encrypted token ciphertext. Must not be parsed by client/server — forwarded opaquely to the Server Enabler. | 
**network** | **String** | Card network. Possible values:   - &#x60;visa&#x60;   - &#x60;mastercard&#x60;   - &#x60;amex&#x60;   - &#x60;discover&#x60;  | 
**lastFour** | **String** | Last four digits of the card number as displayed to cardholder. | 
**expirationMonth** | **String** | Token expiration month (e.g., &#39;06&#39;). Display only. | 
**expirationYear** | **String** | Token expiration year, four digits (e.g., &#39;2028&#39;). Display only. | 
**dynamicData** | **String** | Base64-encoded cryptogram from TSP. Present only for network_token type. Display only. | 
**eci** | **String** | Electronic Commerce Indicator (e.g., &#39;05&#39;, &#39;07&#39;). Present only for network_token type. Display only. | 
**paymentAccountReference** | **String** | Payment Account Reference — a stable reference to the underlying funding account. | 



