@echo off

rd /s /q ..\src
rd /s /q ..\target
rd /s /q ..\docs

java -jar swagger-codegen-cli-2.2.3.jar generate -t cybersource-java-template\libraries\okhttp-gson -i cybersource-rest-spec.json -l java -o ../ -c cybersource-java-config.json

powershell -Command " Set-Content ..\src\main\java\Api\SecureFileShareApi.java ((get-content ..\src\main\java\Api\SecureFileShareApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarContentTypes = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarContentTypes = {\"*/*\"};') "

git checkout ..\pom.xml
git checkout ..\README.md