@echo off

rd /s /q ..\src\main\java\Api
rd /s /q ..\src\main\java\Invokers
rd /s /q ..\src\main\java\Model
rd /s /q ..\src\test
rd /s /q ..\target
rd /s /q ..\docs

java -jar swagger-codegen-cli-2.2.3.jar generate -t cybersource-java-template\libraries\okhttp-gson -i cybersource-rest-spec.json -l java -o ../ -c cybersource-java-config.json

powershell -Command "(Get-Content ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.java) |  ForEach-Object {​​​​ $_ -creplace 'Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction', 'Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedMerchantInitiatedTransaction'}​​​​  | Set-Content ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.java"

powershell -Command "(Get-Content ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.java) |  ForEach-Object {​​​​ $_ -creplace 'tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction', 'tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedMerchantInitiatedTransaction'}​​​​  | Set-Content ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.java"

powershell Rename-Item ..\src\main\java\Model\Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformationAuthorizationOptionsInitiatorMerchantInitiatedTransaction.java Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedMerchantInitiatedTransaction.java

powershell -Command " Set-Content ..\src\main\java\Api\SecureFileShareApi.java ((get-content ..\src\main\java\Api\SecureFileShareApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarContentTypes = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarContentTypes = {\"*/*\"};') "

git checkout ..\pom.xml
git checkout ..\README.md