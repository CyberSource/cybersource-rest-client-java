# START GENAI
#!/bin/bash

set -e

rm -rf ../src/main/java/Api
rm -rf ../src/main/java/Invokers
rm -rf ../src/main/java/Model
rm -rf ../src/test
rm -rf ../target
rm -rf ../docs

python3 replaceFieldNamesForPaths.py -i cybersource-rest-spec.json > /dev/null

$JAVA_17_BIN -jar swagger-codegen-cli-2.4.38.jar generate \
    -t cybersource-java-template/libraries/okhttp-gson \
    -i cybersource-rest-spec-java.json \
    -l java \
    -o ../ \
    -c cybersource-java-config.json

sed -i 's/\*_\/_\*;charset=utf-8/\*\/\*;charset=utf-8/g' ../src/main/java/Api/SecureFileShareApi.java

sed -i 's/List<DeviceDeAssociateV3Request>\.class\.getSimpleName()/DeviceDeAssociateV3Request.class.getSimpleName()/g' ../src/main/java/Api/DeviceDeAssociationApi.java

sed -i 's/@SerializedName("sdkLinks")/@SerializedName("links")/g' ../src/main/java/Model/PblPaymentLinksAllGet200Response.java

git checkout ../src/main/java/Api/OAuthApi.java
git checkout ../src/main/java/Api/BatchUploadwithMTLSApi.java
git checkout ../src/main/java/Model/AccessTokenResponse.java
git checkout ../src/main/java/Model/CreateAccessTokenRequest.java
git checkout ../src/main/java/Invokers/HttpClientFactory.java
git checkout ../src/main/java/Invokers/HttpClientFactoryAdditionalSettings.java

git checkout ../pom.xml
git checkout ../README.md
git checkout ../.gitignore

rm -rf ../*gradle*
rm -f ../git_push.sh
rm -rf ../gradle
rm -rf ../.travis.yml
rm -rf ../.swagger-codegen-ignore

# END GENAI
