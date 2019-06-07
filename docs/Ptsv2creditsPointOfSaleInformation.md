
# Ptsv2creditsPointOfSaleInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emv** | [**Ptsv2creditsPointOfSaleInformationEmv**](Ptsv2creditsPointOfSaleInformationEmv.md) |  |  [optional]
**partnerSdkVersion** | **String** | Version of the software installed on the POS terminal. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX.  |  [optional]
**storeAndForwardIndicator** | **String** | When connectivity is unavailable, the client software that is installed on the POS terminal can store a transaction in its memory and send it for authorization when connectivity is restored. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  Possible values: - Y: Transaction was stored and then forwarded. - N (default): Transaction was not stored and then forwarded.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX.  |  [optional]
**cardholderVerificationMethod** | **List&lt;String&gt;** |  |  [optional]
**terminalInputCapability** | **List&lt;String&gt;** |  |  [optional]
**terminalSerialNumber** | **String** | Terminal serial number assigned by the hardware manufacturer. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX.  For details, see the &#x60;terminal_serial_number&#x60; field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  |  [optional]
**terminalCardCaptureCapability** | **String** | Indicates whether the terminal can capture the card.  Possible values: - 1: Terminal can capture card. - 0: Terminal cannot capture card.  This field is supported only on American Express Direct.  |  [optional]
**terminalOutputCapability** | **String** | Indicates whether the terminal can print or display messages.  Possible values: - 1: Neither - 2: Print only - 3: Display only - 4: Print and display  This field is supported only on American Express Direct.  |  [optional]
**terminalPinCapability** | **Integer** | Maximum PIN length that the terminal can capture.  Possible values: -  0: No PIN capture capability -  1: PIN capture capability unknown -  4: Four characters -  5: Five characters -  6: Six characters -  7: Seven characters -  8: Eight characters -  9: Nine characters - 10: Ten characters - 11: Eleven characters - 12: Twelve characters  This field is supported only on American Express Direct and SIX.  |  [optional]
**deviceId** | **String** | Value created by the client software that uniquely identifies the POS device. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX.  |  [optional]



