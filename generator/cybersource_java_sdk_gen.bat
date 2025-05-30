@echo off

rd /s /q ..\src\main\java\Api
rd /s /q ..\src\main\java\Invokers
rd /s /q ..\src\main\java\Model
rd /s /q ..\src\test
rd /s /q ..\target
rd /s /q ..\docs

setlocal enabledelayedexpansion
python replaceFieldNamesForPaths.py -i cybersource-rest-spec.json > replaceFieldLogs.log
del replaceFieldLogs.log
endlocal

java -jar swagger-codegen-cli-2.4.38.jar generate -t cybersource-java-template\libraries\okhttp-gson -i cybersource-rest-spec-java.json -l java -o ../ -c cybersource-java-config.json

powershell -Command " Set-Content ..\src\main\java\Api\SecureFileShareApi.java ((get-content ..\src\main\java\Api\SecureFileShareApi.java -raw) -replace '\*_\/_\*;charset=utf-8', '*/*;charset=utf-8') "
powershell -Command " Set-Content ..\src\main\java\Api\DeviceDeAssociationV3Api.java ((get-content ..\src\main\java\Api\DeviceDeAssociationV3Api.java -raw) -replace 'List<DeviceDeAssociateV3Request>\.class\.getSimpleName\(\)', 'DeviceDeAssociateV3Request.class.getSimpleName()') "
@REM replace sdkLinks fieldName to links for supporting links field name in request/response body
echo "starting of replacing the links keyword in PblPaymentLinksAllGet200Response.java model"
powershell -Command " Set-Content ..\src\main\java\Model\PblPaymentLinksAllGet200Response.java ((get-content ..\src\main\java\Model\PblPaymentLinksAllGet200Response.java -raw) -replace '@SerializedName\(\"sdkLinks\"\)', '@SerializedName(\"links\")')"
echo "completed the task of replacing the links keyword in PblPaymentLinksAllGet200Response.java model"

git checkout ..\src\main\java\Api\OAuthApi.java
git checkout ..\src\main\java\Model\AccessTokenResponse.java
git checkout ..\src\main\java\Model\CreateAccessTokenRequest.java

git checkout ..\pom.xml
git checkout ..\README.md
git checkout ..\.gitignore

del ..\gradle*
del ..\git_push.sh
rd /s /q ..\gradle
