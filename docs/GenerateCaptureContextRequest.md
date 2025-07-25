
# GenerateCaptureContextRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientVersion** | **String** | Specify the version of Microform that you want to use.  |  [optional]
**targetOrigins** | **List&lt;String&gt;** | The [target origin](https://developer.mozilla.org/en-US/docs/Glossary/Origin) of the website on which you will be launching Microform is defined by the scheme (protocol), hostname (domain) and port number (if used).    You must use https://hostname (unless you use http://localhost) Wildcards are NOT supported.  Ensure that subdomains are included. Any valid top-level domain is supported (e.g. .com, .co.uk, .gov.br etc)  Examples:   - https://example.com   - https://subdomain.example.com   - https://example.com:8080&lt;br&gt;&lt;br&gt;  If you are embedding within multiple nested iframes you need to specify the origins of all the browser contexts used, for example:    targetOrigins: [     \&quot;https://example.com\&quot;,     \&quot;https://basket.example.com\&quot;,     \&quot;https://ecom.example.com\&quot;   ]&lt;br&gt;&lt;br&gt;  You can supply up to nine origins within the targetOrigins field for nested iframes. If the list of origins exceeds five ensure that you:   - Compare the list of origins in the v2/sessions targetOrigins field against the location.ancestorOrigins of the browser.    - Ensure that the count of origins and their content matches in both.  If any origins are absent or mismatched, the system will prevent Microform from loading and display a client-side error message.  |  [optional]
**allowedCardNetworks** | **List&lt;String&gt;** | The list of card networks you want to use for this Microform transaction.  Microform currently supports the following card networks: - VISA - MASTERCARD - AMEX - CARNET - CARTESBANCAIRES - CUP - DINERSCLUB - DISCOVER - EFTPOS - ELO - JCB - JCREW - MADA - MAESTRO - MEEZA - PAYPAK  **Important:**    - When integrating Microform (Card) at least one card network should be specified in the allowedCardNetworks field in the capture context request.   - When integrating Microform (ACH/eCheck) the allowedCardNetworks field is not required in the capture context request.   - When integrating both Microform (Card) and Microform (ACH/eCheck) at least one card network should be specified in the allowedCardNetworks field in the capture context request.  |  [optional]
**allowedPaymentTypes** | **List&lt;String&gt;** | The payment types that are allowed for the merchant.    Possible values when launching Microform: - CARD - CHECK &lt;br&gt;&lt;br&gt;  |  [optional]
**transientTokenResponseOptions** | [**Microformv2sessionsTransientTokenResponseOptions**](Microformv2sessionsTransientTokenResponseOptions.md) |  |  [optional]



