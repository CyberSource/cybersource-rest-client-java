@echo off

rd /s /q ..\src\main\java\Api
rd /s /q ..\src\main\java\Invokers
rd /s /q ..\src\main\java\Model
rd /s /q ..\src\test
rd /s /q ..\target
rd /s /q ..\docs

java -jar swagger-codegen-cli-2.4.38.jar generate -t cybersource-java-template\libraries\okhttp-gson -i cybersource-rest-spec.json -l java -o ../ -c cybersource-java-config.json -DdateLibrary=joda

REM Changing in Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.java

powershell -Command "(Get-Content ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.java) |  ForEach-Object { $_ -creplace 'Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction', 'Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedMerchantInitiatedTransaction'}  | Set-Content ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.java"

powershell -Command "(Get-Content ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.java) |  ForEach-Object { $_ -creplace 'tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction', 'tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedMerchantInitiatedTransaction'}  | Set-Content ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.java"
 
REM Changing in Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiator.java

powershell -Command "(Get-Content ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiator.java) |  ForEach-Object { $_ -creplace 'Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction', 'Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedMerchantInitiatedTransaction'}  | Set-Content ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiator.java"

powershell -Command "(Get-Content ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiator.java) |  ForEach-Object { $_ -creplace 'tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction', 'tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedMerchantInitiatedTransaction'}  | Set-Content ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiator.java"
 
REM Renaming Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.java

powershell Rename-Item ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.java Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedMerchantInitiatedTransaction.java

powershell Rename-Item ..\docs\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.md Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedMerchantInitiatedTransaction.md

powershell -Command " Set-Content ..\src\main\java\Api\SecureFileShareApi.java ((get-content ..\src\main\java\Api\SecureFileShareApi.java -raw) -replace '\*_\/_\*;charset=utf-8', '*/*;charset=utf-8') "

git checkout ..\src\main\java\Api\OAuthApi.java
git checkout ..\src\main\java\Model\AccessTokenResponse.java
git checkout ..\src\main\java\Model\CreateAccessTokenRequest.java

git checkout ..\pom.xml
git checkout ..\README.md