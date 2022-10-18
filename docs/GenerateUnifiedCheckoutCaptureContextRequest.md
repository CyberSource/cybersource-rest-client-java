
# GenerateUnifiedCheckoutCaptureContextRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**targetOrigins** | **List&lt;String&gt;** |  |  [optional]
**clientVersion** | **String** | verson number of Unified Checkout being used |  [optional]
**allowedCardNetworks** | **List&lt;String&gt;** |  |  [optional]
**allowedPaymentTypes** | **List&lt;String&gt;** |  |  [optional]
**country** | **String** | Country the purchase is originating from (e.g. country of the merchant). Use the two- character ISO Standard |  [optional]
**locale** | **String** | Localization of the User experience conforming to the ISO 639-1 language standards and two-character ISO Standard Country Code |  [optional]
**captureMandate** | [**Upv1capturecontextsCaptureMandate**](Upv1capturecontextsCaptureMandate.md) |  |  [optional]
**orderInformation** | [**Upv1capturecontextsOrderInformation**](Upv1capturecontextsOrderInformation.md) |  |  [optional]
**checkoutApiInitialization** | [**Upv1capturecontextsCheckoutApiInitialization**](Upv1capturecontextsCheckoutApiInitialization.md) |  |  [optional]



