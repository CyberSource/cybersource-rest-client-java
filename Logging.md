[![Generic badge](https://img.shields.io/badge/LOGGING-NEW-GREEN.svg)](https://shields.io/)

# Logging in CyberSource REST Client SDK (JAVA)
Logging framework has been introduced in the SDK which makes use of log4j2 and standardizes the logging so that it can be integrated with the logging in the client application.

## Setup
In order to leverage the new logging framework, the following configuration settings may be added to the merchant configuration as part of LogConfiguration:

* enableLog
* logDirectory
* logFilename
* logMaximumSize

Have to be replaced by the following values:
* props.setProperty("enableLog", "true"); // Logging to be enabled or not.
* props.setProperty("logDirectory", "logs"); // Log directory Path
* props.setProperty("logFilename", "cybs");
* props.setProperty("logMaximumSize", "5M"); // Log file size in KB

where **`enableLog, logDirectory, logFilename, logMaximumSize`** are variables to be provided


# Log4j Configuration

### Sample log4j.xml File

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!-- ################################################################################################################ -->
<!-- 	For information on how to change this configuration file,  -->
<!-- 	refer to https://logging.apache.org/log4j/2.x/manual/configuration.html -->
	
<!-- 	To enable masking of sensitive data, replace `%m` with `%maskedMessage` in the patterns below -->
<!-- ################################################################################################################  -->

<Configuration status="warn">
	<Properties>
		<Property name="log-path">./logs</Property>
		<Property name="logFileName">application</Property>
	</Properties>
	<Appenders>
		<Console name="LogToConsole" target="SYSTEM_OUT">
			<PatternLayout pattern="%d{MM/dd/yy HH:mm:ss,SS:} [%t] %5p (%C{1}:%-1L) - %m%n"/>
		</Console>
		<RollingFile name="RollingFile"
			fileName="${log-path}/${logFileName}.log"
			filePattern="${log-path}/${logFileName}-%d{yyyy-MM-dd}-%i.log">
			<PatternLayout>
				<pattern>%d{MM/dd/yy HH:mm:ss,SS:} [%t] %5p (%C{1}:%-1L) - %m%n</pattern>
			</PatternLayout>
			<Policies>
				<TimeBasedTriggeringPolicy interval="1" modulate="true"/>
			</Policies>
			<DefaultRolloverStrategy max="4"/>
		</RollingFile>
	</Appenders>
	<Loggers>		
		<Logger name="com.cybersource" level="error" additivity="true">
			<AppenderRef ref="LogToConsole" level="error" />
		</Logger>
		<Logger name="Api" level="error" additivity="true">
			<AppenderRef ref="LogToConsole" level="error" />
		</Logger>
		<Logger name="Invoker" level="error" additivity="true">
			<AppenderRef ref="LogToConsole" level="error" />
		</Logger>
		<Logger name="samples" level="error" additivity="true">
			<AppenderRef ref="LogToConsole" level="error" />
		</Logger>
		<Root level="info" additivity="true">
			<AppenderRef ref="RollingFile" />
		</Root>
		<Logger name="com.cybersource" level="info" additivity="true">
			<AppenderRef ref="LogToConsole" level="info" />
		</Logger>
		<Logger name="Api" level="info" additivity="true">
			<AppenderRef ref="LogToConsole" level="info" />
		</Logger>
		<Logger name="Invoker" level="info" additivity="true">
			<AppenderRef ref="LogToConsole" level="info" />
		</Logger>
		<Logger name="samples" level="info" additivity="true">
			<AppenderRef ref="LogToConsole" level="info" />
		</Logger>
	</Loggers>
</Configuration>
```

### Important Notes
* To enable masking of sensitive data i.e. sensitive data in the request/response should be hidden/masked, then  replace `%m` with `%maskedMessage` in the patterns below -->
  
  <PatternLayout pattern="%d{MM/dd/yy HH:mm:ss,SS:} [%t] %5p (%C{1}:%-1L) - %m%n"/>
  
                                    replace with
  
  <PatternLayout pattern="%d{MM/dd/yy HH:mm:ss,SS:} [%t] %5p (%C{1}:%-1L) - %maskedMessage%n"/>


* Sensitive data fields are listed below:
	* Card Security Code
	* Card Number
	* Any field with number in the name
	* Card Expiration Month
	* Card Expiration Year
	* Account
	* Routing Number
	* Email
	* First Name & Last Name
	* Phone Number
	* Type
	* Token
	* Signature