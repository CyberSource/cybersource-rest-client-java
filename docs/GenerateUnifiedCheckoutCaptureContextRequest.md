
# GenerateUnifiedCheckoutCaptureContextRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientVersion** | **String** | Specify the version of Unified Checkout that you want to use. |  [optional]
**targetOrigins** | **List&lt;String&gt;** | The [target origin](https://developer.mozilla.org/en-US/docs/Glossary/Origin) of the website on which you will be launching Unified Checkout is defined by the scheme (protocol), hostname (domain) and port number (if used).    You must use https://hostname (unless you use http://localhost) Wildcards are NOT supported.  Ensure that subdomains are included. Any valid top-level domain is supported (e.g. .com, .co.uk, .gov.br etc)  Examples:   - https://example.com   - https://subdomain.example.com   - https://example.com:8080&lt;br&gt;&lt;br&gt;  If you are embedding within multiple nested iframes you need to specify the origins of all the browser contexts used, for example:    targetOrigins: [     \&quot;https://example.com\&quot;,     \&quot;https://basket.example.com\&quot;,     \&quot;https://ecom.example.com\&quot;   ]  |  [optional]
**allowedCardNetworks** | **List&lt;String&gt;** | The list of card networks you want to use for this Unified Checkout transaction.  Unified Checkout currently supports the following card networks:     - VISA     - MASTERCARD     - AMEX     - CARNET     - CARTESBANCAIRES     - CUP     - DINERSCLUB     - DISCOVER     - EFTPOS     - ELO     - JCB     - JCREW     - MADA     - MAESTRO     - MEEZA  |  [optional]
**allowedPaymentTypes** | **List&lt;String&gt;** | The payment types that are allowed for the merchant.    Possible values when launching Unified Checkout:   - PANENTRY                 - GOOGLEPAY   - SRC   - CHECK &lt;br&gt;&lt;br&gt;  Possible values when launching Unified Checkout with Checkout API: - PANENTRY               - SRC &lt;br&gt;&lt;br&gt;  Possible values when launching Click To Pay Drop-In UI: - CLICKTOPAY &lt;br&gt;&lt;br&gt;  **Important:**    - SRC and CLICKTOPAY are only available for Visa, Mastercard and AMEX.  |  [optional]
**country** | **String** | Country the purchase is originating from (e.g. country of the merchant).  Use the two-character ISO Standard  |  [optional]
**locale** | **String** | Localization of the User experience conforming to the ISO 639-1 language standards and two-character ISO Standard Country Code.  Please refer to list of [supported locales through Unified Checkout](https://developer.cybersource.com/docs/cybs/en-us/unified-checkout/developer/all/rest/unified-checkout/uc-appendix-languages.html)  |  [optional]
**captureMandate** | [**Upv1capturecontextsCaptureMandate**](Upv1capturecontextsCaptureMandate.md) |  |  [optional]
**orderInformation** | [**Upv1capturecontextsOrderInformation**](Upv1capturecontextsOrderInformation.md) |  |  [optional]
**checkoutApiInitialization** | [**Upv1capturecontextsCheckoutApiInitialization**](Upv1capturecontextsCheckoutApiInitialization.md) |  |  [optional]



