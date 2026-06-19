
# Ucv1sessionsPaymentConfigurationsPAYPAL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vaultingEnabled** | **Boolean** | Enables PayPal&#39;s Vaulted Payments flow within Unified Checkout.  This provides a seamless checkout experience by storing payment methods for high-frequency and low average-order-value services such as rides, meal pickups, and other quick purchases.&lt;br&gt;&lt;br&gt;  The allowedPaymentTypes field must also include PAYPAL as shown below for the PayPal button to show in Unified Checkout:    \&quot;allowedPaymentTypes\&quot;: [\&quot;PAYPAL\&quot;] &lt;br&gt;&lt;br&gt;  Optional field:&lt;br&gt; This field cannot be configured through the Merchant Experience screens in the Business Center and must be provided on a per‑transaction basis in the uc/v1/sessions API request.  |  [optional]
**tokenizedPaymentMethod** | [**Ucv1sessionsPaymentConfigurationsPAYPALTokenizedPaymentMethod**](Ucv1sessionsPaymentConfigurationsPAYPALTokenizedPaymentMethod.md) |  |  [optional]
**industryType** | **String** | Indicates the industry type. &lt;br&gt;&lt;br&gt; Possible Values: - \&quot;Events\&quot; - \&quot;Ticketing\&quot; - \&quot;Fuel\&quot; - \&quot;GAMING\&quot; - \&quot;DIGITAL GOODS\&quot; - \&quot;TELCO\&quot; - \&quot;Token Service Providers\&quot; - \&quot;Gambling\&quot; - \&quot;CFDs\&quot; - \&quot;car rental\&quot; - \&quot;hotel\&quot; - \&quot;transportation\&quot; - \&quot;travel package\&quot; - \&quot;Cruise Line\&quot; - \&quot;P2P\&quot; - \&quot;Retail\&quot; - \&quot;Food\&quot; - \&quot;Groceries\&quot; - \&quot;Ride Sharing\&quot; - \&quot;Taxi\&quot; - \&quot;Remittance\&quot; - \&quot;Crypto\&quot; - \&quot;Marketplaces\&quot;&lt;br&gt;&lt;br&gt;  Required field:&lt;br&gt; This field cannot be configured through the Merchant Experience screens in the Business Center and must be provided on a per‑transaction basis in the uc/v1/sessions API request when using PayPal Vaulting.  |  [optional]



