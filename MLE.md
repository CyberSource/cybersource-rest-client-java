[![Generic badge](https://img.shields.io/badge/MLE-NEW-GREEN.svg)](https://shields.io/)

# Message Level Encryption (MLE) Feature

This feature provides an implementation of Message Level Encryption (MLE) for APIs provided by CyberSource, integrated within our SDK. This feature ensures secure communication by encrypting messages at the application level before they are sent over the network.

MLE supports both **Request Encryption** (encrypting outgoing request payloads) and **Response Decryption** (decrypting incoming response payloads).

## Authentication Requirements

- **Request MLE**: Only supported with `JWT (JSON Web Token)` authentication type
- **Response MLE**: Only supported with `JWT (JSON Web Token)` authentication type

<br/>

## Configuration

##  1. Request MLE Configuration 

#### 1.1 Global Request MLE Configuration

Configure global settings for request MLE using these properties in your `merchantConfig`:

##### (i) Primary Configuration

- **Variable**: `enableRequestMLEForOptionalApisGlobally`
- **Type**: `Boolean`
- **Default**: `false`
- **Description**: Enables request MLE globally for all APIs that have optional MLE support when set to `true`.

---

##### (ii) Deprecated Configuration (Backward Compatibility)

- **Variable**: `useMLEGlobally` ⚠️ **DEPRECATED**
- **Type**: `Boolean`
- **Default**: `false`
- **Description**: **DEPRECATED** - Use `enableRequestMLEForOptionalApisGlobally` instead. This field is maintained for backward compatibility and will be used as an alias for `enableRequestMLEForOptionalApisGlobally`.

---

##### (iii) Advanced Configuration

- **Variable**: `disableRequestMLEForMandatoryApisGlobally`
- **Type**: `Boolean`
- **Default**: `false`
- **Description**: Disables request MLE for APIs that have mandatory MLE requirement when set to `true`.

---

#### 1.2 Request MLE Certificate Configuration [Optional Params]

##### (i) Certificate File Path (Optional)

- **Variable**: `mleForRequestPublicCertPath`
- **Type**: `String`
- **Optional**: `true`
- **Description**: Path to the public certificate file used for request encryption. Supported formats: `.pem`, `.crt`. 
  - **Note**: This parameter is optional when using JWT authentication. If not provided, the request MLE certificate will be automatically fetched from the JWT authentication P12 file using the `requestMleKeyAlias`.

---

##### (ii) Key Alias Configuration (Optional)

- **Variable**: `requestMleKeyAlias`
- **Type**: `String`
- **Optional**: `true`
- **Default**: `CyberSource_SJC_US`
- **Description**: Key alias used to retrieve the MLE certificate from the certificate file. When `mleForRequestPublicCertPath` is not provided, this alias is used to fetch the certificate from the JWT authentication P12 file. If not specified, the SDK will automatically use the default value `CyberSource_SJC_US`.

---

##### (iii) Deprecated Key Alias (Backward Compatibility) (Optional)

- **Variable**: `mleKeyAlias` ⚠️ **DEPRECATED**
- **Type**: `String`
- **Optional**: `true`
- **Default**: `CyberSource_SJC_US`
- **Description**: **DEPRECATED** - Use `requestMleKeyAlias` instead. This field is maintained for backward compatibility and will be used as an alias for `requestMleKeyAlias`.

<br />

## 2. Response MLE Configuration

#### 2.1 Global Response MLE Configuration

- **Variable**: `enableResponseMleGlobally`
- **Type**: `Boolean`
- **Default**: `false`
- **Description**: Enables response MLE globally for all APIs that support MLE responses when set to `true`.

----

#### 2.2 Response MLE Private Key Configuration

##### (i) Option 1: Provide Private Key Object

- **Variable**: `responseMlePrivateKey`
- **Type**: `PrivateKey`
- **Description**: Direct private key object for response decryption.

---

##### (ii) Option 2: Provide Private Key File Path

- **Variable**: `responseMlePrivateKeyFilePath`
- **Type**: `String`
- **Description**: Path to the private key file. Supported formats: `.p12`, `.pfx`, `.pem`, `.key`, `.p8`. Recommendation use encrypted private Key (password protection) for MLE response.

---

##### (iii) Private Key File Password

- **Variable**: `responseMlePrivateKeyFilePassword`
- **Type**: `char[]`
- **Description**: Password for the private key file (required for `.p12/.pfx` files or encrypted private keys).
---
#### 2.3 Response MLE Additional Configuration

- **Variable**: `responseMleKID`
- **Type**: `String`
- **Optional**: `true` (when using CyberSource-generated P12 file)
- **Required**: `true` (when using PEM files or private key object)
- **Description**: Key ID value for the MLE response certificate (provided in merchant portal). 
  - **Note**: This parameter is optional when `responseMlePrivateKeyFilePath` points to a CyberSource-generated P12 file. If not provided, the SDK will automatically fetch the Key ID from the P12 file. If provided, the SDK will use the user-provided value instead of the auto-fetched value.
  - **Required** when using PEM format files (`.pem`, `.key`, `.p8`) or when providing `responseMlePrivateKey` object directly.

<br/>

## 3. API-level MLE Control for Request and Response MLE

### Map Configuration

- **Variable**: `mapToControlMLEonAPI`
- **Type**: `Map<String, String>`
- **Description**: Overrides global MLE settings for specific APIs. The key is the API function name, and the value controls both request and response MLE.
- **Example**: `Map<'apiFunctionName', 'true::true'>`

#### Structure of Values in Map:

(i) **"requestMLE::responseMLE"** - Control both request and response MLE
   - `"true::true"` - Enable both request and response MLE
   - `"false::false"` - Disable both request and response MLE
   - `"true::false"` - Enable request MLE, disable response MLE
   - `"false::true"` - Disable request MLE, enable response MLE
   - `"::true"` - Use global setting for request, enable response MLE
   - `"true::"` - Enable request MLE, use global setting for response
   - `"::false"` - Use global setting for request, disable response MLE
   - `"false::"` - Disable request MLE, use global setting for response

(ii) **"requestMLE"** - Control request MLE only (response uses global setting)
   - `"true"` - Enable request MLE
   - `"false"` - Disable request MLE

<br/>

## 4. Example Configurations

### (i) Minimal Request MLE Configuration

```java
// Properties-based configuration - Uses defaults (most common scenario)
Properties merchantProps = new Properties();
merchantProps.setProperty("enableRequestMLEForOptionalApisGlobally", "true");
// Both mleForRequestPublicCertPath and requestMleKeyAlias are optional
// SDK will use JWT P12 file with default alias "CyberSource_SJC_US"
```

### (ii) Request MLE with Deprecated Parameters (Backward Compatibility)

```java
// Using deprecated parameters - still supported but not recommended
Properties merchantProps = new Properties();
merchantProps.setProperty("useMLEGlobally", "true");  // Deprecated - use enableRequestMLEForOptionalApisGlobally
merchantProps.setProperty("mleKeyAlias", "Custom_Key_Alias");  // Deprecated - use requestMleKeyAlias
```

### (iii) Request MLE with Custom Key Alias

```java
// Properties-based configuration - With custom key alias only
Properties merchantProps = new Properties();
merchantProps.setProperty("enableRequestMLEForOptionalApisGlobally", "true");
merchantProps.setProperty("requestMleKeyAlias", "Custom_Key_Alias");
// Will fetch from JWT P12 file using custom alias
```

### (iv) Request MLE with Separate Certificate File

```java
// Properties-based configuration - With separate MLE certificate file
Properties merchantProps = new Properties();
merchantProps.setProperty("enableRequestMLEForOptionalApisGlobally", "true");
merchantProps.setProperty("mleForRequestPublicCertPath", "/path/to/public/cert.pem");
merchantProps.setProperty("requestMleKeyAlias", "Custom_Key_Alias");

// API-specific control
Map<String, String> mleControlMap = new HashMap<>();
mleControlMap.put("createPayment", "true");     // Enable request MLE for this API
mleControlMap.put("capturePayment", "false");   // Disable request MLE for this API
merchantProps.put("mapToControlMLEonAPI", mleControlMap);
```

### (v) Response MLE Configuration with Private Key File

```java
// Properties-based configuration with CyberSource-generated P12 file
Properties merchantProps = new Properties();
merchantProps.setProperty("enableResponseMleGlobally", "true");
merchantProps.setProperty("responseMlePrivateKeyFilePath", "/path/to/private/key.p12");
merchantProps.setProperty("responseMlePrivateKeyFilePassword", "password");
// responseMleKID is optional for CyberSource-generated P12 files - SDK will auto-fetch if not provided
// merchantProps.setProperty("responseMleKID", "your-key-id");  // Optional - overrides auto-fetched value

// API-specific control
Map<String, String> mleControlMap = new HashMap<>();
mleControlMap.put("createPayment", "::true");  // Enable response MLE only for this API
merchantProps.put("mapToControlMLEonAPI", mleControlMap);
```

```java
// Properties-based configuration with PEM file (responseMleKID is required)
Properties merchantProps = new Properties();
merchantProps.setProperty("enableResponseMleGlobally", "true");
merchantProps.setProperty("responseMlePrivateKeyFilePath", "/path/to/private/key.pem");
merchantProps.setProperty("responseMleKID", "your-key-id");  // Required for PEM files

// API-specific control
Map<String, String> mleControlMap = new HashMap<>();
mleControlMap.put("createPayment", "::true");  // Enable response MLE only for this API
merchantProps.put("mapToControlMLEonAPI", mleControlMap);
```

### (vi) Response MLE Configuration with Private Key Object

```java
// Load private key programmatically
PrivateKey privateKey = loadPrivateKeyFromSomewhere();

// Create MerchantConfig with private key object (responseMleKID is required)
Properties merchantProps = new Properties();
merchantProps.setProperty("enableResponseMleGlobally", "true");
merchantProps.setProperty("responseMleKID", "your-key-id");  // Required when using private key object

// Use constructor that accepts private key object
MerchantConfig merchantConfig = new MerchantConfig(merchantProps, privateKey);
```

### (vii) Both Request and Response MLE Configuration

```java
// Properties-based configuration
Properties merchantProps = new Properties();

// Request MLE settings (minimal - uses defaults)
merchantProps.setProperty("enableRequestMLEForOptionalApisGlobally", "true");

// Response MLE settings (with CyberSource-generated P12 file)
merchantProps.setProperty("enableResponseMleGlobally", "true");
merchantProps.setProperty("responseMlePrivateKeyFilePath", "/path/to/private/key.p12");
merchantProps.setProperty("responseMlePrivateKeyFilePassword", "password");
// responseMleKID is optional for CyberSource-generated P12 files
// merchantProps.setProperty("responseMleKID", "your-key-id");  // Optional - overrides auto-fetched value

// API-specific control for both request and response
Map<String, String> mleControlMap = new HashMap<>();
mleControlMap.put("createPayment", "true::true");     // Enable both request and response MLE for this API
mleControlMap.put("capturePayment", "false::true");    // Disable request, enable response MLE for this API
mleControlMap.put("refundPayment", "true::false");    // Enable request, disable response MLE for this API
mleControlMap.put("createCredit", "::true");            // Use global request setting, enable response MLE for this API
merchantProps.put("mapToControlMLEonAPI", mleControlMap);
```

### (viii) Mixed Configuration (New and Deprecated Parameters)

```java
// Example showing both new and deprecated parameters (deprecated will be used as aliases)
Properties merchantProps = new Properties();

// If both are set with same value, it works fine
merchantProps.setProperty("enableRequestMLEForOptionalApisGlobally", "true");
merchantProps.setProperty("useMLEGlobally", "true");  // Deprecated but same value

// If both are set with different values, it will cause ConfigException
// merchantProps.setProperty("enableRequestMLEForOptionalApisGlobally", "true");
// merchantProps.setProperty("useMLEGlobally", "false");  // This would cause an error

// Key alias - new parameter takes precedence if both are provided
merchantProps.setProperty("requestMleKeyAlias", "New_Alias");
merchantProps.setProperty("mleKeyAlias", "Old_Alias");  // This will be ignored
```

<br/>

## 5. JSON Configuration Examples

### (i) Minimal Request MLE

```json
{
  "merchantConfig": {
    "enableRequestMLEForOptionalApisGlobally": true
  }
}
```

### (ii) Request MLE with Deprecated Parameters

```json
{
  "merchantConfig": {
    "useMLEGlobally": true,
    "mleKeyAlias": "Custom_Key_Alias"
  }
}
```

### (iii) Request MLE with Custom Configuration

```json
{
  "merchantConfig": {
    "enableRequestMLEForOptionalApisGlobally": true,
    "mleForRequestPublicCertPath": "/path/to/public/cert.pem",
    "requestMleKeyAlias": "Custom_Key_Alias",
    "mapToControlMLEonAPI": {
      "createPayment": "true",
      "capturePayment": "false"
    }
  }
}
```

### (iv) Response MLE Only

```json
{
  "merchantConfig": {
    "enableResponseMleGlobally": true,
    "responseMlePrivateKeyFilePath": "/path/to/private/key.p12",
    "responseMlePrivateKeyFilePassword": "password",
    "// Note": "responseMleKID is optional for CyberSource-generated P12 files",
    "responseMleKID": "your-key-id",
    "mapToControlMLEonAPI": {
      "createPayment": "::true"
    }
  }
}
```

```json
{
  "merchantConfig": {
    "enableResponseMleGlobally": true,
    "responseMlePrivateKeyFilePath": "/path/to/private/key.pem",
    "// Note": "responseMleKID is required for PEM files",
    "responseMleKID": "your-key-id",
    "mapToControlMLEonAPI": {
      "createPayment": "::true"
    }
  }
}
```

### (v) Both Request and Response MLE

```json
{
  "merchantConfig": {
    "enableRequestMLEForOptionalApisGlobally": true,
    "enableResponseMleGlobally": true,
    "responseMlePrivateKeyFilePath": "/path/to/private/key.p12",
    "responseMlePrivateKeyFilePassword": "password",
    "// Note": "responseMleKID is optional for CyberSource-generated P12 files - SDK will auto-fetch if not provided",
    "responseMleKID": "your-key-id",
    "mapToControlMLEonAPI": {
      "createPayment": "true::true",
      "capturePayment": "false::true",
      "refundPayment": "true::false",
      "createCredit": "::true"
    }
  }
}
```
<br/>

## 6. Supported Private Key File Formats

For Response MLE private key files, the following formats are supported:

- **PKCS#12**: `.p12`, `.pfx` (requires password)
- **PEM**: `.pem`, `.key`, `.p8` (supports both encrypted and unencrypted)

<br/>

## 7. Important Notes

### (i) Request MLE
- Both `mleForRequestPublicCertPath` and `requestMleKeyAlias` are **optional** parameters
- If `mleForRequestPublicCertPath` is not provided, the SDK will automatically fetch the MLE certificate from the JWT authentication P12 file
- If `requestMleKeyAlias` is not provided, the SDK will use the default value `CyberSource_SJC_US`
- The SDK provides flexible configuration options: you can use defaults, customize the key alias only, or provide a separate certificate file
- If `enableRequestMLEForOptionalApisGlobally` is set to `true`, it enables request MLE for all APIs that have optional MLE support
- APIs with mandatory MLE requirements are enabled by default unless `disableRequestMLEForMandatoryApisGlobally` is set to `true`
- If `mapToControlMLEonAPI` doesn't contain a specific API, the global setting applies
- For HTTP Signature authentication, request MLE will fall back to non-encrypted requests with a warning

### (ii) Response MLE
- Response MLE requires either `responseMlePrivateKey` object OR `responseMlePrivateKeyFilePath` (not both)
- The `responseMleKID` parameter behavior:
  - **Optional** when `responseMlePrivateKeyFilePath` points to a CyberSource-generated P12 file (SDK auto-fetches from P12)
  - **Required** when using PEM format files (`.pem`, `.key`, `.p8`)
  - **Required** when using `responseMlePrivateKey` object directly
  - When both auto-fetched and user-provided values exist, the user-provided value takes precedence
- If an API expects a mandatory MLE response but the map specifies non-MLE response, the API might return an error
- Both the private key object and file path approaches are mutually exclusive

### (iii) Backward Compatibility
- `useMLEGlobally` is **deprecated** but still supported as an alias for `enableRequestMLEForOptionalApisGlobally`
- `mleKeyAlias` is **deprecated** but still supported as an alias for `requestMleKeyAlias`
- If both new and deprecated parameters are provided with the **same value**, it works fine
- If both new and deprecated parameters are provided with **different values**, it might cause a `ConfigException`
- When both new and deprecated parameters are provided, the **new parameter takes precedence**

### (iv) API-level Control Validation
- The `mapToControlMLEonAPI` values are validated for proper format
- Invalid formats (empty values, multiple separators, non-boolean values) will cause configuration errors
- Empty string after `::` separator will use global defaults
- The map also supports backward compatibility with `Map<String, Boolean>` format, which will be automatically converted to `Map<String, String>`

### (v) Configuration Validation
- The SDK performs comprehensive validation of MLE configuration parameters
- Conflicting values between new and deprecated parameters will result in `ConfigException`
- File path validation is performed for certificate and private key files
- Invalid boolean values in `mapToControlMLEonAPI` will cause parsing errors

<br/>

## 8. Error Handling

The SDK provides specific error messages for common MLE issues:
- Invalid private key for response decryption
- Missing certificates for request encryption
- Invalid file formats or paths
- Authentication type mismatches
- Configuration validation errors
- Conflicting parameter values between new and deprecated fields
- Invalid format in `mapToControlMLEonAPI` values

<br/>

## 9. Sample Code Repository

For comprehensive examples and sample implementations, please refer to:
[Cybersource Java Sample Code Repository (on GitHub)](https://github.com/CyberSource/cybersource-rest-samples-java)

<br/>

## 10. Additional Information

### (i) API Support
- MLE is designed to support specific APIs that have been enabled for encryption
- Support can be extended to additional APIs based on requirements and updates

### (ii) Using the SDK
To use the MLE feature in the SDK, configure the `merchantConfig` object as shown above and pass it to the SDK initialization. The SDK will automatically handle encryption and decryption based on your configuration.

### (iii) MerchantConfig Constructors
The SDK provides multiple constructors to accommodate different MLE configuration approaches:
- `MerchantConfig(Properties props)` - Standard configuration
- `MerchantConfig(Properties props, PrivateKey responseMlePrivateKey)` - With private key object
- `MerchantConfig(Properties props, Map<String, String> defaultHeaders, PrivateKey responseMlePrivateKey)` - Full configuration

### (iv) Migration from Deprecated Parameters

If you're currently using deprecated parameters, here's how to migrate:

```java
// OLD (Deprecated)
merchantProps.setProperty("useMLEGlobally", "true");
merchantProps.setProperty("mleKeyAlias", "Custom_Alias");

// NEW (Recommended)
merchantProps.setProperty("enableRequestMLEForOptionalApisGlobally", "true");
merchantProps.setProperty("requestMleKeyAlias", "Custom_Alias");
```

The deprecated parameters will continue to work but are not recommended for new implementations.

<br/>

## 11. Contact
For any issues or further assistance, please open an issue on the GitHub repository or contact our support team.
