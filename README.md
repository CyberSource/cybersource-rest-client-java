
# Java Client SDK for the CyberSource REST API

## Description

The CyberSource Java client provides convenient access to the [CyberSource REST API](https://developer.cybersource.com/api/reference/api-reference.html) from your Java application.

## System Requirements

This SDK has been built using Java 1.8.

It has been tested using LTS versions Java 11, Java 17 and Java 19.

**The SDK is guaranteed to work on all Java versions up to and including Java 19.**

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

In that respository, we have comprehensive sample code for all common uses of our API:

Additionally, you can find details and examples of how our API is structured in our API Reference Guide:

* [Developer Center API Reference](https://developer.cybersource.com/api/reference/api-reference.html)

The API Reference Guide provides examples of what information is needed for a particular request and how that information would be formatted. Using those examples, you can easily determine what methods would be necessary to include that information in a request using this SDK.


To learn more about how to use CyberSource's REST API SDKs, please use [Developer Center REST API SDKs](https://developer.cybersource.com/hello-world/rest-api-sdks.html)
.

### Example using Sample Code Application

* Add the [CyberSource REST client as a dependency](https://github.com/CyberSource/cybersource-rest-samples-java/blob/a34f25a384e1fa982f5bb336225e3e37ca3e245d/pom.xml#L20C3-L24C16) in your java project.
* Configure your credentials in a [Properties Object](https://github.com/CyberSource/cybersource-rest-samples-java/blob/a34f25a384e1fa982f5bb336225e3e37ca3e245d/src/main/java/Data/Configuration.java#L6C2-L55C3).
* Create an instance of [ApiClient](https://github.com/CyberSource/cybersource-rest-samples-java/blob/a34f25a384e1fa982f5bb336225e3e37ca3e245d/src/main/java/samples/Payments/Payments/SimpleAuthorizationInternet.java#L83C4-L85C46) and set the required properties in it.
* Use the created ApiClient instance to call CyberSource APIs. For example [SimpleAuthorizationInternet](https://github.com/CyberSource/cybersource-rest-samples-java/blob/a34f25a384e1fa982f5bb336225e3e37ca3e245d/src/main/java/samples/Payments/Payments/SimpleAuthorizationInternet.java#L87C4-L88C51)

For more detailed examples, refer to the [cybersource-rest-samples-java](https://github.com/CyberSource/cybersource-rest-samples-java) repository.

### Switching between Test environment and Production environment

Cybersource maintains a complete sandbox environment for testing and development purposes. This sandbox environment is an exact duplicate of our production environment with the transaction authorization and settlement process simulated. By default, this SDK is configured to communicate with the sandbox environment. To switch to the production environment, set the `runEnvironment` property in the SDK Configuration.  See our sample at <https://github.com/CyberSource/cybersource-rest-samples-java/blob/master/src/main/java/Data/Configuration.java>.

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

### MetaKey Support

A Meta Key is a single key that can be used by one, some, or all merchants (or accounts, if created by a Portfolio user) in the portfolio.

The Portfolio or Parent Account owns the key and is considered the transaction submitter when a Meta Key is used, while the merchant owns the transaction.

MIDs continue to be able to create keys for themselves, even if a Meta Key is generated.

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

Cybersource may allow Customer to access, use, and/or test a Cybersource product or service that may still be in development or has not been market-tested (“Beta Product”) solely for the purpose of evaluating the functionality or marketability of the Beta Product (a “Beta Evaluation”). Notwithstanding any language to the contrary, the following terms shall apply with respect to Customer’s participation in any Beta Evaluation (and the Beta Product(s)) accessed thereunder): The Parties will enter into a separate form agreement detailing the scope of the Beta Evaluation, requirements, pricing, the length of the beta evaluation period (“Beta Product Form”). Beta Products are not, and may not become, Transaction Services and have not yet been publicly released and are offered for the sole purpose of internal testing and non-commercial evaluation. Customer’s use of the Beta Product shall be solely for the purpose of conducting the Beta Evaluation. Customer accepts all risks arising out of the access and use of the Beta Products. Cybersource may, in its sole discretion, at any time, terminate or discontinue the Beta Evaluation. Customer acknowledges and agrees that any Beta Product may still be in development and that Beta Product is provided “AS IS” and may not perform at the level of a commercially available service, may not operate as expected and may be modified prior to release. CYBERSOURCE SHALL NOT BE RESPONSIBLE OR LIABLE UNDER ANY CONTRACT, TORT (INCLUDING NEGLIGENCE), OR OTHERWISE RELATING TO A BETA PRODUCT OR THE BETA EVALUATION (A) FOR LOSS OR INACCURACY OF DATA OR COST OF PROCUREMENT OF SUBSTITUTE GOODS, SERVICES OR TECHNOLOGY, (B) ANY CLAIM, LOSSES, DAMAGES, OR CAUSE OF ACTION ARISING IN CONNECTION WITH THE BETA PRODUCT; OR (C) FOR ANY INDIRECT, INCIDENTAL OR CONSEQUENTIAL DAMAGES INCLUDING, BUT NOT LIMITED TO, LOSS OF REVENUES AND LOSS OF PROFITS.

## License

This repository is distributed under a proprietary license. See the provided [`LICENSE.txt`](/LICENSE.txt) file

