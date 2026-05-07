
# Java Client SDK for the CyberSource REST API

## Description

The CyberSource Java client provides convenient access to the [CyberSource REST API](https://developer.cybersource.com/api/reference/api-reference.html) from your Java application.

## System Requirements

This SDK is built using Java 1.8, and has been tested on Java LTS versions 8, 11, 17, 19, and 21, and is compatible with all Java versions starting from Java 8.

## Installation

* Maven Dependency:

    ```xml
            <dependency>
                <groupId>com.cybersource</groupId>
                <artifactId>cybersource-rest-client-java</artifactId>
                <version>[INSERT VERSION NUMBER HERE]</version>
            </dependency>
    ```

* Gradle Dependency

    ````gradle
    dependencies {
        compile 'com.cybersource:cybersource-rest-client-java:[INSERT VERSION NUMBER HERE]'
    }
    ````

***Please note that the version number to be used needs to be inserted in the placeholder mentioned above. Also, remove the square brackets as they are not required with the version number.***

For released versions of the SDK, please refer to [Releases](https://github.com/CyberSource/cybersource-rest-client-java/releases) or search on [mvnrepository](https://mvnrepository.com/artifact/com.cybersource/cybersource-rest-client-java) or [search.maven](https://search.maven.org/artifact/com.cybersource/cybersource-rest-client-java).

## Account Registration and Configuration

* Account Registration

Follow the first step mentioned in [Getting Started with CyberSource REST SDKs](https://developer.cybersource.com/hello-world/rest-api-sdks.html#gettingstarted) to create a sandbox account.

* Configuration

Follow the second step mentioned in [Getting Started with CyberSource REST SDKs](https://developer.cybersource.com/hello-world/rest-api-sdks.html#gettingstarted) to configure the SDK by inputting your credentials.

***Please note that this is for reference only. Ensure to store the credentials in a more secure manner.***

## How to Use

To get started using this SDK, it is highly recommended to download our sample code repository:

* [Cybersource Java Sample Code Repository (on GitHub)](https://github.com/CyberSource/cybersource-rest-samples-java)

In that respository, we have comprehensive sample code for all common uses of our API.

Additionally, you can find details and examples of how our API is structured in our API Reference Guide:

* [Developer Center API Reference](https://developer.cybersource.com/api/reference/api-reference.html)

The API Reference Guide provides examples of what information is needed for a particular request and how that information would be formatted. Using those examples, you can easily determine what methods would be necessary to include that information in a request using this SDK.


To learn more about how to use CyberSource's REST API SDKs, please use [Developer Center REST API SDKs](https://developer.cybersource.com/hello-world/rest-api-sdks.html)
.

## Security Guidance

* It is strongly recommended to use HTTPS for any proxy servers in your environment to protect secrets during transit.


### Example using Sample Code Application

* Add the [CyberSource REST Client SDK as a dependency](https://github.com/CyberSource/cybersource-rest-samples-java/blob/a34f25a384e1fa982f5bb336225e3e37ca3e245d/pom.xml#L20C3-L24C16) in your java project.

* Configure your credentials in a [Properties Object](https://github.com/CyberSource/cybersource-rest-samples-java/blob/a34f25a384e1fa982f5bb336225e3e37ca3e245d/src/main/java/Data/Configuration.java#L6C2-L55C3). For JWT with Shared Secret, see [JwtSharedSecretConfiguration](https://github.com/CyberSource/cybersource-rest-samples-java/tree/master/src/main/java/Data/JwtSharedSecretConfiguration.java) instead.

* Create an instance of [ApiClient](https://github.com/CyberSource/cybersource-rest-samples-java/blob/a34f25a384e1fa982f5bb336225e3e37ca3e245d/src/main/java/samples/Payments/Payments/SimpleAuthorizationInternet.java#L83C4-L85C46) and set the required properties in it.

* Use the created ApiClient instance to call CyberSource APIs. For example [SimpleAuthorizationInternet](https://github.com/CyberSource/cybersource-rest-samples-java/blob/a34f25a384e1fa982f5bb336225e3e37ca3e245d/src/main/java/samples/Payments/Payments/SimpleAuthorizationInternet.java#L87C4-L88C51)

For more detailed examples, refer to the [cybersource-rest-samples-java](https://github.com/CyberSource/cybersource-rest-samples-java) repository.

### Switching between Test environment and Production environment

CyberSource maintains a complete sandbox environment for testing and development purposes. This sandbox environment is an exact duplicate of our production environment with the transaction authorization and settlement process simulated. By default, this SDK is configured to communicate with the sandbox environment. To switch to the production environment, set the `runEnvironment` property in the SDK Configuration.  See our sample at <https://github.com/CyberSource/cybersource-rest-samples-java/blob/master/src/main/java/Data/Configuration.java>.

```java
    // For TESTING use
    props.setProperty("runEnvironment", "apitest.cybersource.com");
    // For PRODUCTION use
    //props.setProperty("runEnvironment", "api.cybersource.com");
```

To Use OAuth, use OAuth enabled URLs

```java
    // For TESTING use
    props.setProperty("runEnvironment", "api-matest.cybersource.com");
    // For PRODUCTION use
    //props.setProperty("runEnvironment", "api-ma.cybersource.com");
```

API credentials are different for each environment, so be sure to switch to the appropriate credentials when switching environments.

## Logging

[![Generic badge](https://img.shields.io/badge/LOGGING-NEW-GREEN.svg)](https://shields.io/)

Logging framework has been introduced in the SDK which makes use of log4j2 and standardizes the logging so that it can be integrated with the logging in the client application.

More information about this new logging framework can be found in this file : [Logging.md](Logging.md)

## Features

### Message Level Encryption (MLE) Feature
[![Generic badge](https://img.shields.io/badge/MLE-NEW-GREEN.svg)](https://shields.io/)

This feature provides an implementation of Message Level Encryption (MLE) for APIs provided by CyberSource, integrated within our SDK. This feature ensures secure communication by encrypting messages at the application level before they are sent over the network.

More information about this new MLE feature can be found in this file : [MLE.md](MLE.md)

### JWT Authentication with Symmetric Key (Shared Secret / HS256 HMAC-SHA256) Support

[![Generic badge](https://img.shields.io/badge/JWT_SHARED_SECRET-NEW-GREEN.svg)](https://shields.io/)

> **⚠️ HTTP Signature Deprecation Notice:** HTTP Signature authentication (`http_Signature`) is being deprecated. JWT with Shared Secret (HS256 / HMAC-SHA256) is the **recommended migration path** — it uses the **same** `merchantKeyId` and `merchantsecretKey` credentials, requires only two property changes, and enables MLE (Message Level Encryption) support that HTTP Signature does not provide.

JWT authentication now supports two key types, configurable via the `jwtKeyType` property:

| `jwtKeyType` | Algorithm | Credentials Required |
|---|---|---|
| `P12` (default) | RS256 (asymmetric, RSA-SHA256) | `keysDirectory`, `keyFileName`, `keyAlias`, `keyPass` |
| `SHARED_SECRET` | HS256 (symmetric, HMAC-SHA256) | `merchantKeyId`, `merchantsecretKey` |

The default value is `P12`, which preserves full backward compatibility with existing configurations.

#### Configuration for JWT with P12 (default — no changes needed)

```java
props.setProperty("authenticationType", "jwt");
props.setProperty("merchantID", "your_merchant_id");
props.setProperty("runEnvironment", "apitest.cybersource.com");
// jwtKeyType defaults to P12 if omitted
props.setProperty("keyAlias", "your_merchant_id");
props.setProperty("keyPass", "your_merchant_id");
props.setProperty("keyFileName", "your_merchant_id");
props.setProperty("keysDirectory", "path/to/p12/directory");
```

#### Configuration for JWT with Shared Secret

```java
props.setProperty("authenticationType", "jwt");
props.setProperty("merchantID", "your_merchant_id");
props.setProperty("runEnvironment", "apitest.cybersource.com");
props.setProperty("jwtKeyType", "SHARED_SECRET");
props.setProperty("merchantKeyId", "your_key_id");
props.setProperty("merchantsecretKey", "your_base64_encoded_shared_secret");
```

> **Note:** When `jwtKeyType` is set to `SHARED_SECRET`, the P12-related properties (`keysDirectory`, `keyFileName`, `keyAlias`, `keyPass`) are not required and will be ignored. Conversely, when using `P12`, the `merchantKeyId` and `merchantsecretKey` properties are not required for JWT authentication.

#### Migrating from HTTP Signature to JWT with Shared Secret (HS256 / HMAC-SHA256)

If you are currently using HTTP Signature authentication, migrating to JWT with Shared Secret (symmetric key, HS256 / HMAC-SHA256) requires only **two property changes** — your credentials remain the same:

```java
// BEFORE (HTTP Signature — deprecated)
props.setProperty("authenticationType", "http_Signature");
props.setProperty("merchantKeyId", "your_key_id");
props.setProperty("merchantsecretKey", "your_shared_secret");

// AFTER (JWT with Shared Secret / HS256 HMAC-SHA256 — recommended)
props.setProperty("authenticationType", "jwt");            // changed
props.setProperty("jwtKeyType", "SHARED_SECRET");           // added — uses HS256 (HMAC-SHA256)
props.setProperty("merchantKeyId", "your_key_id");          // same
props.setProperty("merchantsecretKey", "your_shared_secret"); // same
```

For a complete migration guide with sample code, see the [JWT Shared Secret Auth samples](https://github.com/CyberSource/cybersource-rest-samples-java/tree/master/src/main/java/samples/JwtSharedSecretAuth).

#### Using MLE with Shared Secret Credentials

MLE (Message Level Encryption) is fully supported with the `SHARED_SECRET` key type. This allows merchants who use shared secret credentials (instead of a P12 certificate) to still leverage MLE for secure communication.

When using `jwtKeyType=SHARED_SECRET` with MLE, you must provide the MLE public certificate separately via the `mleForRequestPublicCertPath` property, since there is no P12 file to auto-extract the MLE certificate from. The request MLE public certificate can be downloaded from the CyberSource Business Center:

- **Test**: <https://businesscentertest.cybersource.com/ebc2>
- **Production**: <https://businesscenter.cybersource.com/ebc2>

```java
props.setProperty("authenticationType", "jwt");
props.setProperty("merchantID", "your_merchant_id");
props.setProperty("runEnvironment", "apitest.cybersource.com");
props.setProperty("jwtKeyType", "SHARED_SECRET");
props.setProperty("merchantKeyId", "your_key_id");
props.setProperty("merchantsecretKey", "your_base64_encoded_shared_secret");

// Request MLE configuration
props.setProperty("enableRequestMLEForOptionalApisGlobally", "true");
props.setProperty("mleForRequestPublicCertPath", "/path/to/mle/public/cert.pem");

// Response MLE is also supported — see MLE.md for full configuration
// props.setProperty("enableResponseMleGlobally", "true");
// props.setProperty("responseMlePrivateKeyFilePath", "/path/to/private/key.p12");
// props.setProperty("responseMlePrivateKeyFilePassword", "password");
```

For more details on MLE configuration options (including Response MLE), see [MLE.md](MLE.md).

### MetaKey Support

A Meta Key is a single key that can be used by one, some, or all merchants (or accounts, if created by a Portfolio user) in the portfolio.

The Portfolio or Parent Account owns the key and is considered the transaction submitter when a Meta Key is used, while the merchant owns the transaction.

MIDs continue to be able to create keys for themselves, even if a Meta Key is generated.

MetaKey works with all three authentication types: HTTP Signature, JWT (P12), and JWT with Shared Secret.

#### MetaKey with HTTP Signature (⚠️ Deprecated)

```java
props.setProperty("authenticationType", "http_Signature");
props.setProperty("merchantID", "your_transacting_merchant_id");
props.setProperty("merchantKeyId", "your_metakey_portfolio_KeyId");
props.setProperty("merchantsecretKey", "your_metakey_portfolio_shared_secret_key");
props.setProperty("portfolioID", "your_portfolio_id");
props.setProperty("useMetaKey", "true");
```

#### MetaKey with JWT (P12)

```java
props.setProperty("authenticationType", "jwt");
props.setProperty("merchantID", "your_transacting_merchant_id");
props.setProperty("keyAlias", "your_portfolio_id");
props.setProperty("keyPass", "your_metakey_portfolio_p12File_password");
props.setProperty("keyFileName", "your_metakey_portfolio_p12FileName");
props.setProperty("keysDirectory", "path/to/p12/directory");
props.setProperty("portfolioID", "your_portfolio_id");
props.setProperty("useMetaKey", "true");
```

#### MetaKey with JWT Shared Secret (Recommended)

```java
props.setProperty("authenticationType", "jwt");
props.setProperty("jwtKeyType", "SHARED_SECRET");
props.setProperty("merchantID", "your_transacting_merchant_id");
props.setProperty("merchantKeyId", "your_metakey_portfolio_KeyId");
props.setProperty("merchantsecretKey", "your_metakey_portfolio_shared_secret_key");
props.setProperty("portfolioID", "your_portfolio_id");
props.setProperty("useMetaKey", "true");
```

> **Note:** MetaKey with JWT Shared Secret uses the same MetaKey credentials as HTTP Signature but authenticates via JWT, enabling MLE support.

#### Response MLE with MetaKey

When Response MLE is enabled (`enableResponseMleGlobally=true`) and MetaKey is in use (`useMetaKey=true`), the Response MLE configuration must use the **portfolio's** response MLE key — not the transacting merchant's. Specifically:

- `responseMlePrivateKeyFilePath` (or the `responseMlePrivateKey` object) must point to the **portfolio's** response MLE private key.
- `responseMleKID` — the KID value associated with the **portfolio's** response MLE certificate.
  - **Optional** when `responseMlePrivateKeyFilePath` points to a CyberSource-generated P12 file — the SDK will automatically fetch the KID from the P12 file.
  - **Required** when using PEM format files (`.pem`, `.key`, `.p8`) or when providing `responseMlePrivateKey` object directly.

```java
props.setProperty("authenticationType", "jwt");
props.setProperty("jwtKeyType", "SHARED_SECRET");
props.setProperty("merchantID", "your_transacting_merchant_id");
props.setProperty("merchantKeyId", "your_metakey_portfolio_KeyId");
props.setProperty("merchantsecretKey", "your_metakey_portfolio_shared_secret_key");
props.setProperty("portfolioID", "your_portfolio_id");
props.setProperty("useMetaKey", "true");

// Response MLE — use the portfolio's response MLE key, not the transacting merchant's
props.setProperty("enableResponseMleGlobally", "true");
props.setProperty("responseMlePrivateKeyFilePath", "/path/to/portfolio/response/mle/private/key.p12");
props.setProperty("responseMlePrivateKeyFilePassword", "portfolio_private_key_password");
// responseMleKID is optional when using a CyberSource-generated P12 file (auto-fetched from P12)
// Required when using PEM files or responseMlePrivateKey object
// props.setProperty("responseMleKID", "your_portfolio_response_mle_kid");
```

> **Important:** The response MLE private key (and KID, if applicable) must belong to the portfolio (parent account), since in MetaKey mode the portfolio is the transaction submitter and the response is encrypted using the portfolio's MLE certificate. See [MLE.md](MLE.md) for full details on when `responseMleKID` is required vs optional.

Further information on MetaKey can be found in [New Business Center User Guide](https://developer.cybersource.com/library/documentation/dev_guides/Business_Center/New_Business_Center_User_Guide.pdf).

### OAuth Support

OAuth enables service providers to securely share access to customer data without sharing password data.

The CyberSource OAuth2.0 Authorization Server (or API Auth Service) will issue access tokens (based on merchant user credentials) to CyberSource or third-party Applications. These applications can access CyberSource APIs on the merchant's behalf, using the access tokens.

During application registration, third-party application developers are issued a `client_id` and optionally a `client_secret` (if they can be considered a confidential client, for example a web application).

These values will be used when the merchant application wants to request an access token and/or a refresh token. This is explained in more detail in [Requesting the Access and Refresh Tokens](https://developer.cybersource.com/api/developer-guides/OAuth/cybs_extend_intro/obtaining_access_refresh_tokens.html).

For more detailed information on OAuth, refer to the documentation at [Cybersource OAuth 2.0](https://developer.cybersource.com/api/developer-guides/OAuth/cybs_extend_intro.html).

In order to use OAuth, set the run environment to OAuth enabled URLs. OAuth only works in these run environments.

```java
    // For TESTING use
    props.setProperty("runEnvironment", "api-matest.cybersource.com");
    // For PRODUCTION use
    //props.setProperty("runEnvironment", "api-ma.cybersource.com");
```

## How to Contribute

* Fork the repo and create your branch from `master`.
* If you've added code that should be tested, add tests.
* Ensure the test suite passes.
* Submit your pull request! (Ensure you have [synced your fork](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/working-with-forks/syncing-a-fork) with the original repository before initiating the PR).


## Need Help?

For any help, you can reach out to us at our [Discussion Forum](https://community.developer.cybersource.com/t5/cybersource-APIs/bd-p/api).

## Disclaimer

CyberSource may allow Customer to access, use, and/or test a CyberSource product or service that may still be in development or has not been market-tested (“Beta Product”) solely for the purpose of evaluating the functionality or marketability of the Beta Product (a “Beta Evaluation”). Notwithstanding any language to the contrary, the following terms shall apply with respect to Customer’s participation in any Beta Evaluation (and the Beta Product(s)) accessed thereunder): The Parties will enter into a separate form agreement detailing the scope of the Beta Evaluation, requirements, pricing, the length of the beta evaluation period (“Beta Product Form”). Beta Products are not, and may not become, Transaction Services and have not yet been publicly released and are offered for the sole purpose of internal testing and non-commercial evaluation. Customer’s use of the Beta Product shall be solely for the purpose of conducting the Beta Evaluation. Customer accepts all risks arising out of the access and use of the Beta Products. CyberSource may, in its sole discretion, at any time, terminate or discontinue the Beta Evaluation. Customer acknowledges and agrees that any Beta Product may still be in development and that Beta Product is provided “AS IS” and may not perform at the level of a commercially available service, may not operate as expected and may be modified prior to release. CYBERSOURCE SHALL NOT BE RESPONSIBLE OR LIABLE UNDER ANY CONTRACT, TORT (INCLUDING NEGLIGENCE), OR OTHERWISE RELATING TO A BETA PRODUCT OR THE BETA EVALUATION (A) FOR LOSS OR INACCURACY OF DATA OR COST OF PROCUREMENT OF SUBSTITUTE GOODS, SERVICES OR TECHNOLOGY, (B) ANY CLAIM, LOSSES, DAMAGES, OR CAUSE OF ACTION ARISING IN CONNECTION WITH THE BETA PRODUCT; OR (C) FOR ANY INDIRECT, INCIDENTAL OR CONSEQUENTIAL DAMAGES INCLUDING, BUT NOT LIMITED TO, LOSS OF REVENUES AND LOSS OF PROFITS.

## License

This repository is distributed under a proprietary license. See the provided [`LICENSE.txt`](/license.txt) file

