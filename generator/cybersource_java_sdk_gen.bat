java -jar swagger-codegen-cli-2.2.3.jar generate -t cybersource-java-template\libraries\okhttp-gson -i cybersource-rest-spec.json -l java -o ../ -c cybersource-java-config.json


powershell -Command " Set-Content ..\src\main\java\Api\CaptureApi.java ((get-content ..\src\main\java\Api\CaptureApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarAccepts = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarAccepts = {\"application/hal+json;charset=utf-8\"};') "


powershell -Command " Set-Content ..\src\main\java\Api\CreditApi.java ((get-content ..\src\main\java\Api\CreditApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarAccepts = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarAccepts = {\"application/hal+json;charset=utf-8\"};') "


powershell -Command " Set-Content ..\src\main\java\Api\PaymentsApi.java ((get-content ..\src\main\java\Api\PaymentsApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarAccepts = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarAccepts = {\"application/hal+json;charset=utf-8\"};') "


powershell -Command " Set-Content ..\src\main\java\Api\ProcessAPayoutApi.java ((get-content ..\src\main\java\Api\ProcessAPayoutApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarAccepts = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarAccepts = {\"application/hal+json;charset=utf-8\"};') "


powershell -Command " Set-Content ..\src\main\java\Api\RefundApi.java ((get-content ..\src\main\java\Api\RefundApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarAccepts = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarAccepts = {\"application/hal+json;charset=utf-8\"};') "



powershell -Command " Set-Content ..\src\main\java\Api\UserManagementApi.java ((get-content ..\src\main\java\Api\UserManagementApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarAccepts = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarAccepts = {\"application/hal+json;charset=utf-8\"};') "

powershell -Command " Set-Content ..\src\main\java\Api\VoidApi.java ((get-content ..\src\main\java\Api\VoidApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarAccepts = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarAccepts = {\"application\hal+json;charset=utf-8\"};') "



powershell -Command " Set-Content ..\src\main\java\Api\ReversalApi.java ((get-content ..\src\main\java\Api\ReversalApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarAccepts = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarAccepts = {\"application/hal+json;charset=utf-8\"};') "


powershell -Command " Set-Content ..\src\main\java\Api\TransactionDetailsApi.java ((get-content ..\src\main\java\Api\TransactionDetailsApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarAccepts = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarAccepts = {\"application/hal+json;charset=utf-8\"};') "



powershell -Command " Set-Content ..\src\main\java\Api\SecureFileShareApi.java ((get-content ..\src\main\java\Api\SecureFileShareApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarContentTypes = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarContentTypes = {\"*/*\"};') "



powershell -Command " Set-Content ..\src\main\java\Api\SearchTransactionsApi.java ((get-content ..\src\main\java\Api\SearchTransactionsApi.java -raw) -replace '(?m)(.*)^*final String\[\] localVarAccepts = {[\r\n\s]+\"application\/json;charset=utf-8\"[\r\n\s]+};', 'final String[] localVarAccepts ={\"*/*\"};') "

git checkout ..\pom.xml
git checkout ..\README.md