# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import Invokers.*;
import Invokers.auth.*;
import Model.*;
import Api.CaptureApi;

import java.io.File;
import java.util.*;

public class CaptureApiExample {

    public static void main(String[] args) {
        
        CaptureApi apiInstance = new CaptureApi();
        CapturePaymentRequest capturePaymentRequest = new CapturePaymentRequest(); // CapturePaymentRequest | 
        String id = "id_example"; // String | The payment ID returned from a previous payment request. This ID links the capture to the payment. 
        try {
            InlineResponse2012 result = apiInstance.capturePayment(capturePaymentRequest, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CaptureApi#capturePayment");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cybersource.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CaptureApi* | [**capturePayment**](docs/CaptureApi.md#capturePayment) | **POST** /v2/payments/{id}/captures | Capture a Payment
*CaptureApi* | [**getCapture**](docs/CaptureApi.md#getCapture) | **GET** /v2/captures/{id} | Retrieve a Capture
*CreditApi* | [**createCredit**](docs/CreditApi.md#createCredit) | **POST** /v2/credits/ | Process a Credit
*CreditApi* | [**getCredit**](docs/CreditApi.md#getCredit) | **GET** /v2/credits/{id} | Retrieve a Credit
*DefaultApi* | [**octCreatePayment**](docs/DefaultApi.md#octCreatePayment) | **POST** /v2/payouts/ | Process a Payout
*InstrumentIdentifierApi* | [**instrumentidentifiersPost**](docs/InstrumentIdentifierApi.md#instrumentidentifiersPost) | **POST** /instrumentidentifiers | Create an Instrument Identifier
*InstrumentIdentifierApi* | [**instrumentidentifiersTokenIdDelete**](docs/InstrumentIdentifierApi.md#instrumentidentifiersTokenIdDelete) | **DELETE** /instrumentidentifiers/{tokenId} | Delete an Instrument Identifier
*InstrumentIdentifierApi* | [**instrumentidentifiersTokenIdGet**](docs/InstrumentIdentifierApi.md#instrumentidentifiersTokenIdGet) | **GET** /instrumentidentifiers/{tokenId} | Retrieve an Instrument Identifier
*InstrumentIdentifierApi* | [**instrumentidentifiersTokenIdPatch**](docs/InstrumentIdentifierApi.md#instrumentidentifiersTokenIdPatch) | **PATCH** /instrumentidentifiers/{tokenId} | Update a Instrument Identifier
*InstrumentIdentifierApi* | [**instrumentidentifiersTokenIdPaymentinstrumentsGet**](docs/InstrumentIdentifierApi.md#instrumentidentifiersTokenIdPaymentinstrumentsGet) | **GET** /instrumentidentifiers/{tokenId}/paymentinstruments | Retrieve all Payment Instruments associated with an Instrument Identifier
*KeyGenerationApi* | [**generatePublicKey**](docs/KeyGenerationApi.md#generatePublicKey) | **POST** /payments/flex/v1/keys/ | Generate Key
*PaymentApi* | [**createPayment**](docs/PaymentApi.md#createPayment) | **POST** /v2/payments/ | Process a Payment
*PaymentApi* | [**getPayment**](docs/PaymentApi.md#getPayment) | **GET** /v2/payments/{id} | Retrieve a Payment
*PaymentInstrumentApi* | [**paymentinstrumentsPost**](docs/PaymentInstrumentApi.md#paymentinstrumentsPost) | **POST** /paymentinstruments | Create a Payment Instrument
*PaymentInstrumentApi* | [**paymentinstrumentsTokenIdDelete**](docs/PaymentInstrumentApi.md#paymentinstrumentsTokenIdDelete) | **DELETE** /paymentinstruments/{tokenId} | Delete a Payment Instrument
*PaymentInstrumentApi* | [**paymentinstrumentsTokenIdGet**](docs/PaymentInstrumentApi.md#paymentinstrumentsTokenIdGet) | **GET** /paymentinstruments/{tokenId} | Retrieve a Payment Instrument
*PaymentInstrumentApi* | [**paymentinstrumentsTokenIdPatch**](docs/PaymentInstrumentApi.md#paymentinstrumentsTokenIdPatch) | **PATCH** /paymentinstruments/{tokenId} | Update a Payment Instrument
*RefundApi* | [**getRefund**](docs/RefundApi.md#getRefund) | **GET** /v2/refunds/{id} | Retrieve a Refund
*RefundApi* | [**refundCapture**](docs/RefundApi.md#refundCapture) | **POST** /v2/captures/{id}/refunds | Refund a Capture
*RefundApi* | [**refundPayment**](docs/RefundApi.md#refundPayment) | **POST** /v2/payments/{id}/refunds | Refund a Payment
*ReversalApi* | [**authReversal**](docs/ReversalApi.md#authReversal) | **POST** /v2/payments/{id}/reversals | Process an Authorization Reversal
*ReversalApi* | [**getAuthReversal**](docs/ReversalApi.md#getAuthReversal) | **GET** /v2/reversals/{id} | Retrieve an Authorization Reversal
*TokenizationApi* | [**tokenize**](docs/TokenizationApi.md#tokenize) | **POST** /payments/flex/v1/tokens/ | Tokenize card
*VoidApi* | [**getVoid**](docs/VoidApi.md#getVoid) | **GET** /v2/voids/{id} | Retrieve A Void
*VoidApi* | [**voidCapture**](docs/VoidApi.md#voidCapture) | **POST** /v2/captures/{id}/voids | Void a Capture
*VoidApi* | [**voidCredit**](docs/VoidApi.md#voidCredit) | **POST** /v2/credits/{id}/voids | Void a Credit
*VoidApi* | [**voidPayment**](docs/VoidApi.md#voidPayment) | **POST** /v2/payments/{id}/voids | Void a Payment
*VoidApi* | [**voidRefund**](docs/VoidApi.md#voidRefund) | **POST** /v2/refunds/{id}/voids | Void a Refund


## Documentation for Models

 - [AuthReversalRequest](docs/AuthReversalRequest.md)
 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body2](docs/Body2.md)
 - [Body3](docs/Body3.md)
 - [CapturePaymentRequest](docs/CapturePaymentRequest.md)
 - [CardInfo](docs/CardInfo.md)
 - [CreateCreditRequest](docs/CreateCreditRequest.md)
 - [CreatePaymentRequest](docs/CreatePaymentRequest.md)
 - [DerPublicKey](docs/DerPublicKey.md)
 - [Error](docs/Error.md)
 - [ErrorLinks](docs/ErrorLinks.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [GeneratePublicKeyRequest](docs/GeneratePublicKeyRequest.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2002BuyerInformation](docs/InlineResponse2002BuyerInformation.md)
 - [InlineResponse2002DeviceInformation](docs/InlineResponse2002DeviceInformation.md)
 - [InlineResponse2002MerchantInformation](docs/InlineResponse2002MerchantInformation.md)
 - [InlineResponse2002OrderInformation](docs/InlineResponse2002OrderInformation.md)
 - [InlineResponse2002OrderInformationAmountDetails](docs/InlineResponse2002OrderInformationAmountDetails.md)
 - [InlineResponse2002OrderInformationBillTo](docs/InlineResponse2002OrderInformationBillTo.md)
 - [InlineResponse2002OrderInformationInvoiceDetails](docs/InlineResponse2002OrderInformationInvoiceDetails.md)
 - [InlineResponse2002OrderInformationLineItems](docs/InlineResponse2002OrderInformationLineItems.md)
 - [InlineResponse2002OrderInformationShipTo](docs/InlineResponse2002OrderInformationShipTo.md)
 - [InlineResponse2002PaymentInformation](docs/InlineResponse2002PaymentInformation.md)
 - [InlineResponse2002PaymentInformationCard](docs/InlineResponse2002PaymentInformationCard.md)
 - [InlineResponse2002PaymentInformationTokenizedCard](docs/InlineResponse2002PaymentInformationTokenizedCard.md)
 - [InlineResponse2002ProcessingInformation](docs/InlineResponse2002ProcessingInformation.md)
 - [InlineResponse2002ProcessorInformation](docs/InlineResponse2002ProcessorInformation.md)
 - [InlineResponse2002ProcessorInformationAvs](docs/InlineResponse2002ProcessorInformationAvs.md)
 - [InlineResponse2002ProcessorInformationCardVerification](docs/InlineResponse2002ProcessorInformationCardVerification.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2004DeviceInformation](docs/InlineResponse2004DeviceInformation.md)
 - [InlineResponse2004OrderInformation](docs/InlineResponse2004OrderInformation.md)
 - [InlineResponse2004OrderInformationAmountDetails](docs/InlineResponse2004OrderInformationAmountDetails.md)
 - [InlineResponse2004OrderInformationInvoiceDetails](docs/InlineResponse2004OrderInformationInvoiceDetails.md)
 - [InlineResponse2004OrderInformationShipTo](docs/InlineResponse2004OrderInformationShipTo.md)
 - [InlineResponse2004ProcessingInformation](docs/InlineResponse2004ProcessingInformation.md)
 - [InlineResponse2004ProcessingInformationAuthorizationOptions](docs/InlineResponse2004ProcessingInformationAuthorizationOptions.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2008Links](docs/InlineResponse2008Links.md)
 - [InlineResponse2008LinksFirst](docs/InlineResponse2008LinksFirst.md)
 - [InlineResponse2008LinksLast](docs/InlineResponse2008LinksLast.md)
 - [InlineResponse2008LinksNext](docs/InlineResponse2008LinksNext.md)
 - [InlineResponse2008LinksPrev](docs/InlineResponse2008LinksPrev.md)
 - [InlineResponse2008LinksSelf](docs/InlineResponse2008LinksSelf.md)
 - [InlineResponse200Der](docs/InlineResponse200Der.md)
 - [InlineResponse200Jwk](docs/InlineResponse200Jwk.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [InlineResponse2011](docs/InlineResponse2011.md)
 - [InlineResponse2011AuthorizationInformation](docs/InlineResponse2011AuthorizationInformation.md)
 - [InlineResponse2011ProcessorInformation](docs/InlineResponse2011ProcessorInformation.md)
 - [InlineResponse2011ReversalAmountDetails](docs/InlineResponse2011ReversalAmountDetails.md)
 - [InlineResponse2012](docs/InlineResponse2012.md)
 - [InlineResponse2012Links](docs/InlineResponse2012Links.md)
 - [InlineResponse2012OrderInformation](docs/InlineResponse2012OrderInformation.md)
 - [InlineResponse2012OrderInformationAmountDetails](docs/InlineResponse2012OrderInformationAmountDetails.md)
 - [InlineResponse2012ProcessorInformation](docs/InlineResponse2012ProcessorInformation.md)
 - [InlineResponse2013](docs/InlineResponse2013.md)
 - [InlineResponse2013Links](docs/InlineResponse2013Links.md)
 - [InlineResponse2013OrderInformation](docs/InlineResponse2013OrderInformation.md)
 - [InlineResponse2013ProcessorInformation](docs/InlineResponse2013ProcessorInformation.md)
 - [InlineResponse2013RefundAmountDetails](docs/InlineResponse2013RefundAmountDetails.md)
 - [InlineResponse2014](docs/InlineResponse2014.md)
 - [InlineResponse2014CreditAmountDetails](docs/InlineResponse2014CreditAmountDetails.md)
 - [InlineResponse2015](docs/InlineResponse2015.md)
 - [InlineResponse2015VoidAmountDetails](docs/InlineResponse2015VoidAmountDetails.md)
 - [InlineResponse2016](docs/InlineResponse2016.md)
 - [InlineResponse201ClientReferenceInformation](docs/InlineResponse201ClientReferenceInformation.md)
 - [InlineResponse201Embedded](docs/InlineResponse201Embedded.md)
 - [InlineResponse201EmbeddedCapture](docs/InlineResponse201EmbeddedCapture.md)
 - [InlineResponse201EmbeddedCaptureLinks](docs/InlineResponse201EmbeddedCaptureLinks.md)
 - [InlineResponse201ErrorInformation](docs/InlineResponse201ErrorInformation.md)
 - [InlineResponse201ErrorInformationDetails](docs/InlineResponse201ErrorInformationDetails.md)
 - [InlineResponse201Links](docs/InlineResponse201Links.md)
 - [InlineResponse201LinksSelf](docs/InlineResponse201LinksSelf.md)
 - [InlineResponse201OrderInformation](docs/InlineResponse201OrderInformation.md)
 - [InlineResponse201OrderInformationAmountDetails](docs/InlineResponse201OrderInformationAmountDetails.md)
 - [InlineResponse201OrderInformationInvoiceDetails](docs/InlineResponse201OrderInformationInvoiceDetails.md)
 - [InlineResponse201PaymentInformation](docs/InlineResponse201PaymentInformation.md)
 - [InlineResponse201PaymentInformationAccountFeatures](docs/InlineResponse201PaymentInformationAccountFeatures.md)
 - [InlineResponse201PaymentInformationCard](docs/InlineResponse201PaymentInformationCard.md)
 - [InlineResponse201PaymentInformationTokenizedCard](docs/InlineResponse201PaymentInformationTokenizedCard.md)
 - [InlineResponse201PointOfSaleInformation](docs/InlineResponse201PointOfSaleInformation.md)
 - [InlineResponse201PointOfSaleInformationEmv](docs/InlineResponse201PointOfSaleInformationEmv.md)
 - [InlineResponse201ProcessorInformation](docs/InlineResponse201ProcessorInformation.md)
 - [InlineResponse201ProcessorInformationAvs](docs/InlineResponse201ProcessorInformationAvs.md)
 - [InlineResponse201ProcessorInformationCardVerification](docs/InlineResponse201ProcessorInformationCardVerification.md)
 - [InlineResponse201ProcessorInformationConsumerAuthenticationResponse](docs/InlineResponse201ProcessorInformationConsumerAuthenticationResponse.md)
 - [InlineResponse201ProcessorInformationCustomer](docs/InlineResponse201ProcessorInformationCustomer.md)
 - [InlineResponse201ProcessorInformationElectronicVerificationResults](docs/InlineResponse201ProcessorInformationElectronicVerificationResults.md)
 - [InlineResponse201ProcessorInformationIssuer](docs/InlineResponse201ProcessorInformationIssuer.md)
 - [InlineResponse201ProcessorInformationMerchantAdvice](docs/InlineResponse201ProcessorInformationMerchantAdvice.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InlineResponse4001](docs/InlineResponse4001.md)
 - [InlineResponse4002](docs/InlineResponse4002.md)
 - [InlineResponse4003](docs/InlineResponse4003.md)
 - [InlineResponse4004](docs/InlineResponse4004.md)
 - [InlineResponse4005](docs/InlineResponse4005.md)
 - [InlineResponse4006](docs/InlineResponse4006.md)
 - [InlineResponse409](docs/InlineResponse409.md)
 - [InlineResponse409Links](docs/InlineResponse409Links.md)
 - [InlineResponse409LinksPaymentInstruments](docs/InlineResponse409LinksPaymentInstruments.md)
 - [InlineResponse502](docs/InlineResponse502.md)
 - [InlineResponseDefault](docs/InlineResponseDefault.md)
 - [InlineResponseDefaultLinks](docs/InlineResponseDefaultLinks.md)
 - [InlineResponseDefaultLinksNext](docs/InlineResponseDefaultLinksNext.md)
 - [InlineResponseDefaultResponseStatus](docs/InlineResponseDefaultResponseStatus.md)
 - [InlineResponseDefaultResponseStatusDetails](docs/InlineResponseDefaultResponseStatusDetails.md)
 - [InstrumentidentifiersBankAccount](docs/InstrumentidentifiersBankAccount.md)
 - [InstrumentidentifiersCard](docs/InstrumentidentifiersCard.md)
 - [InstrumentidentifiersDetails](docs/InstrumentidentifiersDetails.md)
 - [InstrumentidentifiersLinks](docs/InstrumentidentifiersLinks.md)
 - [InstrumentidentifiersLinksSelf](docs/InstrumentidentifiersLinksSelf.md)
 - [InstrumentidentifiersMetadata](docs/InstrumentidentifiersMetadata.md)
 - [InstrumentidentifiersProcessingInformation](docs/InstrumentidentifiersProcessingInformation.md)
 - [InstrumentidentifiersProcessingInformationAuthorizationOptions](docs/InstrumentidentifiersProcessingInformationAuthorizationOptions.md)
 - [InstrumentidentifiersProcessingInformationAuthorizationOptionsInitiator](docs/InstrumentidentifiersProcessingInformationAuthorizationOptionsInitiator.md)
 - [InstrumentidentifiersProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction](docs/InstrumentidentifiersProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.md)
 - [JsonWebKey](docs/JsonWebKey.md)
 - [KeyParameters](docs/KeyParameters.md)
 - [KeyResult](docs/KeyResult.md)
 - [Link](docs/Link.md)
 - [Links](docs/Links.md)
 - [OctCreatePaymentRequest](docs/OctCreatePaymentRequest.md)
 - [PaymentinstrumentsBankAccount](docs/PaymentinstrumentsBankAccount.md)
 - [PaymentinstrumentsBillTo](docs/PaymentinstrumentsBillTo.md)
 - [PaymentinstrumentsBuyerInformation](docs/PaymentinstrumentsBuyerInformation.md)
 - [PaymentinstrumentsBuyerInformationIssuedBy](docs/PaymentinstrumentsBuyerInformationIssuedBy.md)
 - [PaymentinstrumentsBuyerInformationPersonalIdentification](docs/PaymentinstrumentsBuyerInformationPersonalIdentification.md)
 - [PaymentinstrumentsCard](docs/PaymentinstrumentsCard.md)
 - [PaymentinstrumentsInstrumentIdentifier](docs/PaymentinstrumentsInstrumentIdentifier.md)
 - [PaymentinstrumentsMerchantInformation](docs/PaymentinstrumentsMerchantInformation.md)
 - [PaymentinstrumentsMerchantInformationMerchantDescriptor](docs/PaymentinstrumentsMerchantInformationMerchantDescriptor.md)
 - [PaymentinstrumentsProcessingInformation](docs/PaymentinstrumentsProcessingInformation.md)
 - [PaymentinstrumentsProcessingInformationBankTransferOptions](docs/PaymentinstrumentsProcessingInformationBankTransferOptions.md)
 - [Paymentsflexv1tokensCardInfo](docs/Paymentsflexv1tokensCardInfo.md)
 - [RefundCaptureRequest](docs/RefundCaptureRequest.md)
 - [RefundPaymentRequest](docs/RefundPaymentRequest.md)
 - [ResponseStatus](docs/ResponseStatus.md)
 - [ResponseStatusDetails](docs/ResponseStatusDetails.md)
 - [TokenizeParameters](docs/TokenizeParameters.md)
 - [TokenizeRequest](docs/TokenizeRequest.md)
 - [TokenizeResult](docs/TokenizeResult.md)
 - [V2creditsPointOfSaleInformation](docs/V2creditsPointOfSaleInformation.md)
 - [V2creditsPointOfSaleInformationEmv](docs/V2creditsPointOfSaleInformationEmv.md)
 - [V2creditsProcessingInformation](docs/V2creditsProcessingInformation.md)
 - [V2paymentsAggregatorInformation](docs/V2paymentsAggregatorInformation.md)
 - [V2paymentsAggregatorInformationSubMerchant](docs/V2paymentsAggregatorInformationSubMerchant.md)
 - [V2paymentsBuyerInformation](docs/V2paymentsBuyerInformation.md)
 - [V2paymentsBuyerInformationPersonalIdentification](docs/V2paymentsBuyerInformationPersonalIdentification.md)
 - [V2paymentsClientReferenceInformation](docs/V2paymentsClientReferenceInformation.md)
 - [V2paymentsConsumerAuthenticationInformation](docs/V2paymentsConsumerAuthenticationInformation.md)
 - [V2paymentsDeviceInformation](docs/V2paymentsDeviceInformation.md)
 - [V2paymentsMerchantDefinedInformation](docs/V2paymentsMerchantDefinedInformation.md)
 - [V2paymentsMerchantInformation](docs/V2paymentsMerchantInformation.md)
 - [V2paymentsMerchantInformationMerchantDescriptor](docs/V2paymentsMerchantInformationMerchantDescriptor.md)
 - [V2paymentsOrderInformation](docs/V2paymentsOrderInformation.md)
 - [V2paymentsOrderInformationAmountDetails](docs/V2paymentsOrderInformationAmountDetails.md)
 - [V2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts](docs/V2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts.md)
 - [V2paymentsOrderInformationAmountDetailsSurcharge](docs/V2paymentsOrderInformationAmountDetailsSurcharge.md)
 - [V2paymentsOrderInformationAmountDetailsTaxDetails](docs/V2paymentsOrderInformationAmountDetailsTaxDetails.md)
 - [V2paymentsOrderInformationBillTo](docs/V2paymentsOrderInformationBillTo.md)
 - [V2paymentsOrderInformationInvoiceDetails](docs/V2paymentsOrderInformationInvoiceDetails.md)
 - [V2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum](docs/V2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum.md)
 - [V2paymentsOrderInformationLineItems](docs/V2paymentsOrderInformationLineItems.md)
 - [V2paymentsOrderInformationShipTo](docs/V2paymentsOrderInformationShipTo.md)
 - [V2paymentsOrderInformationShippingDetails](docs/V2paymentsOrderInformationShippingDetails.md)
 - [V2paymentsPaymentInformation](docs/V2paymentsPaymentInformation.md)
 - [V2paymentsPaymentInformationCard](docs/V2paymentsPaymentInformationCard.md)
 - [V2paymentsPaymentInformationCustomer](docs/V2paymentsPaymentInformationCustomer.md)
 - [V2paymentsPaymentInformationFluidData](docs/V2paymentsPaymentInformationFluidData.md)
 - [V2paymentsPaymentInformationTokenizedCard](docs/V2paymentsPaymentInformationTokenizedCard.md)
 - [V2paymentsPointOfSaleInformation](docs/V2paymentsPointOfSaleInformation.md)
 - [V2paymentsPointOfSaleInformationEmv](docs/V2paymentsPointOfSaleInformationEmv.md)
 - [V2paymentsProcessingInformation](docs/V2paymentsProcessingInformation.md)
 - [V2paymentsProcessingInformationAuthorizationOptions](docs/V2paymentsProcessingInformationAuthorizationOptions.md)
 - [V2paymentsProcessingInformationAuthorizationOptionsInitiator](docs/V2paymentsProcessingInformationAuthorizationOptionsInitiator.md)
 - [V2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction](docs/V2paymentsProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.md)
 - [V2paymentsProcessingInformationCaptureOptions](docs/V2paymentsProcessingInformationCaptureOptions.md)
 - [V2paymentsProcessingInformationIssuer](docs/V2paymentsProcessingInformationIssuer.md)
 - [V2paymentsProcessingInformationRecurringOptions](docs/V2paymentsProcessingInformationRecurringOptions.md)
 - [V2paymentsRecipientInformation](docs/V2paymentsRecipientInformation.md)
 - [V2paymentsidcapturesAggregatorInformation](docs/V2paymentsidcapturesAggregatorInformation.md)
 - [V2paymentsidcapturesAggregatorInformationSubMerchant](docs/V2paymentsidcapturesAggregatorInformationSubMerchant.md)
 - [V2paymentsidcapturesBuyerInformation](docs/V2paymentsidcapturesBuyerInformation.md)
 - [V2paymentsidcapturesMerchantInformation](docs/V2paymentsidcapturesMerchantInformation.md)
 - [V2paymentsidcapturesOrderInformation](docs/V2paymentsidcapturesOrderInformation.md)
 - [V2paymentsidcapturesOrderInformationAmountDetails](docs/V2paymentsidcapturesOrderInformationAmountDetails.md)
 - [V2paymentsidcapturesOrderInformationBillTo](docs/V2paymentsidcapturesOrderInformationBillTo.md)
 - [V2paymentsidcapturesOrderInformationInvoiceDetails](docs/V2paymentsidcapturesOrderInformationInvoiceDetails.md)
 - [V2paymentsidcapturesOrderInformationShipTo](docs/V2paymentsidcapturesOrderInformationShipTo.md)
 - [V2paymentsidcapturesOrderInformationShippingDetails](docs/V2paymentsidcapturesOrderInformationShippingDetails.md)
 - [V2paymentsidcapturesPaymentInformation](docs/V2paymentsidcapturesPaymentInformation.md)
 - [V2paymentsidcapturesPointOfSaleInformation](docs/V2paymentsidcapturesPointOfSaleInformation.md)
 - [V2paymentsidcapturesPointOfSaleInformationEmv](docs/V2paymentsidcapturesPointOfSaleInformationEmv.md)
 - [V2paymentsidcapturesProcessingInformation](docs/V2paymentsidcapturesProcessingInformation.md)
 - [V2paymentsidcapturesProcessingInformationAuthorizationOptions](docs/V2paymentsidcapturesProcessingInformationAuthorizationOptions.md)
 - [V2paymentsidcapturesProcessingInformationCaptureOptions](docs/V2paymentsidcapturesProcessingInformationCaptureOptions.md)
 - [V2paymentsidrefundsMerchantInformation](docs/V2paymentsidrefundsMerchantInformation.md)
 - [V2paymentsidrefundsOrderInformation](docs/V2paymentsidrefundsOrderInformation.md)
 - [V2paymentsidrefundsOrderInformationLineItems](docs/V2paymentsidrefundsOrderInformationLineItems.md)
 - [V2paymentsidrefundsPaymentInformation](docs/V2paymentsidrefundsPaymentInformation.md)
 - [V2paymentsidrefundsPaymentInformationCard](docs/V2paymentsidrefundsPaymentInformationCard.md)
 - [V2paymentsidrefundsPointOfSaleInformation](docs/V2paymentsidrefundsPointOfSaleInformation.md)
 - [V2paymentsidrefundsProcessingInformation](docs/V2paymentsidrefundsProcessingInformation.md)
 - [V2paymentsidrefundsProcessingInformationRecurringOptions](docs/V2paymentsidrefundsProcessingInformationRecurringOptions.md)
 - [V2paymentsidreversalsClientReferenceInformation](docs/V2paymentsidreversalsClientReferenceInformation.md)
 - [V2paymentsidreversalsOrderInformation](docs/V2paymentsidreversalsOrderInformation.md)
 - [V2paymentsidreversalsOrderInformationLineItems](docs/V2paymentsidreversalsOrderInformationLineItems.md)
 - [V2paymentsidreversalsPointOfSaleInformation](docs/V2paymentsidreversalsPointOfSaleInformation.md)
 - [V2paymentsidreversalsProcessingInformation](docs/V2paymentsidreversalsProcessingInformation.md)
 - [V2paymentsidreversalsReversalInformation](docs/V2paymentsidreversalsReversalInformation.md)
 - [V2paymentsidreversalsReversalInformationAmountDetails](docs/V2paymentsidreversalsReversalInformationAmountDetails.md)
 - [V2payoutsMerchantInformation](docs/V2payoutsMerchantInformation.md)
 - [V2payoutsMerchantInformationMerchantDescriptor](docs/V2payoutsMerchantInformationMerchantDescriptor.md)
 - [V2payoutsOrderInformation](docs/V2payoutsOrderInformation.md)
 - [V2payoutsOrderInformationAmountDetails](docs/V2payoutsOrderInformationAmountDetails.md)
 - [V2payoutsOrderInformationBillTo](docs/V2payoutsOrderInformationBillTo.md)
 - [V2payoutsPaymentInformation](docs/V2payoutsPaymentInformation.md)
 - [V2payoutsPaymentInformationCard](docs/V2payoutsPaymentInformationCard.md)
 - [V2payoutsProcessingInformation](docs/V2payoutsProcessingInformation.md)
 - [V2payoutsProcessingInformationPayoutsOptions](docs/V2payoutsProcessingInformationPayoutsOptions.md)
 - [V2payoutsRecipientInformation](docs/V2payoutsRecipientInformation.md)
 - [V2payoutsSenderInformation](docs/V2payoutsSenderInformation.md)
 - [V2payoutsSenderInformationAccount](docs/V2payoutsSenderInformationAccount.md)
 - [VoidCaptureRequest](docs/VoidCaptureRequest.md)
 - [VoidCreditRequest](docs/VoidCreditRequest.md)
 - [VoidPaymentRequest](docs/VoidPaymentRequest.md)
 - [VoidRefundRequest](docs/VoidRefundRequest.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



