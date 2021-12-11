# Java Client SDK for the CyberSource REST API

The CyberSource Java client provides convenient access to the [CyberSource REST API](https://developer.cybersource.com/api/reference/api-reference.html) from your Java application.

## IMPORTANT NOTE:

***Due to restrictions on Log4j2 v2.15.0, masking/hiding of sensitive data will not work for the time being.***

***We will work to include it again in future versions.***

## Requirements

Java 1.8.

***Support for higher versions of JDK (>= 1.9.0) has not been made available.***

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

## Registration & Configuration

Use of this SDK and the CyberSource APIs requires having an account on our system. You can find details of getting a test account and creating your keys [here](https://developer.cybersource.com/api/developer-guides/dita-gettingstarted/registration.html).

Remember this SDK is for use in server-side Java applications that access the CyberSource REST API and credentials should always be securely stored and accessed appropriately.

## SDK Usage Examples and Sample Code

To get started using this SDK, it is highly recommended to download our sample code repository:

* [Cybersource Java Sample Code Repository (on GitHub)](https://github.com/CyberSource/cybersource-rest-samples-java)

In that respository, we have comprehensive sample code for all common uses of our API:

Additionally, you can find details and examples of how our API is structured in our API Reference Guide:

* [Developer Center API Reference](https://developer.cybersource.com/api/reference/api-reference.html)

The API Reference Guide provides examples of what information is needed for a particular request and how that information would be formatted. Using those examples, you can easily determine what methods would be necessary to include that information in a request using this SDK.

## MetaKey Support

A Meta Key is a single key that can be used by one, some, or all merchants (or accounts, if created by a Portfolio user) in the portfolio.

The Portfolio or Parent Account owns the key and is considered the transaction submitter when a Meta Key is used, while the merchant owns the transaction.

MIDs continue to be able to create keys for themselves, even if a Meta Key is generated.

Further information on MetaKey can be found in [New Business Center User Guide](https://developer.cybersource.com/library/documentation/dev_guides/Business_Center/New_Business_Center_User_Guide.pdf).

## OAuth Support

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

### Switching between the sandbox environment and the production environment

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

## License

This repository is distributed under a proprietary license. See the provided [`LICENSE.txt`](/LICENSE.txt) file.
