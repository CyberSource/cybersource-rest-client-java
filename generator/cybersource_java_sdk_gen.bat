mkdir %~dp0JavaFile
cd %~dp0
java -jar swagger-codegen-cli-2.2.3.jar generate -t cybersource-java-template\libraries\okhttp-gson -i cybersource-rest-spec.json -l java -o JavaFile -c %~dp0cybersource-java-config.json

pause



