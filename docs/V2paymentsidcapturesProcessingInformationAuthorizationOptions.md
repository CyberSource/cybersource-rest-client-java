
# V2paymentsidcapturesProcessingInformationAuthorizationOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authType** | **String** | Authorization type. Possible values:   - **AUTOCAPTURE**: automatic capture.  - **STANDARDCAPTURE**: standard capture.  - **VERBAL**: forced capture. Include it in the payment request for a forced capture. Include it in the capture  request for a verbal payment.  For processor-specific information, see the auth_type field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**verbalAuthCode** | **String** | Authorization code.  **Forced Capture**  Use this field to send the authorization code you received from a payment that you authorized outside the CyberSource system.  **Verbal Authorization**  Use this field in CAPTURE API to send the verbally received authorization code.  For processor-specific information, see the auth_code field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  |  [optional]
**verbalAuthTransactionId** | **String** | Transaction ID (TID). |  [optional]



