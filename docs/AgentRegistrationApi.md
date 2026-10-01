# AgentRegistrationApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateAgentKey**](AgentRegistrationApi.md#activateAgentKey) | **POST** /icc/v1/agents/{agentId}/keys/{keyId}/activate | Activate a key
[**addAgentKey**](AgentRegistrationApi.md#addAgentKey) | **POST** /icc/v1/agents/{agentId}/keys | Add a key to an agent
[**getAgent**](AgentRegistrationApi.md#getAgent) | **GET** /icc/v1/agents/{agentId} | Get an agent
[**getAgentKey**](AgentRegistrationApi.md#getAgentKey) | **GET** /icc/v1/agents/{agentId}/keys/{keyId} | Get a key by agent and key ID
[**listAgentKeys**](AgentRegistrationApi.md#listAgentKeys) | **GET** /icc/v1/agents/{agentId}/keys | List keys for an agent
[**registerAgent**](AgentRegistrationApi.md#registerAgent) | **POST** /icc/v1/agents | Register an agent
[**updateAgent**](AgentRegistrationApi.md#updateAgent) | **PUT** /icc/v1/agents/{agentId} | Update an agent
[**updateAgentKey**](AgentRegistrationApi.md#updateAgentKey) | **PUT** /icc/v1/agents/{agentId}/keys/{keyId} | Update a key


<a name="activateAgentKey"></a>
# **activateAgentKey**
> AddAgentKeyResponse201 activateAgentKey(agentId, keyId)

Activate a key

**Activate a Key**&lt;br&gt;Activates a deactivated public key, making it available for signature verification.&lt;br&gt;&lt;br&gt; Returns **404** if the agent or key is not found, **403** if the agent is deactivated. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentRegistrationApi;


AgentRegistrationApi apiInstance = new AgentRegistrationApi();
String agentId = "agentId_example"; // String | Unique agent identifier
String keyId = "keyId_example"; // String | Unique key identifier
try {
    AddAgentKeyResponse201 result = apiInstance.activateAgentKey(agentId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentRegistrationApi#activateAgentKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **keyId** | **String**| Unique key identifier |

### Return type

[**AddAgentKeyResponse201**](AddAgentKeyResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="addAgentKey"></a>
# **addAgentKey**
> AddAgentKeyResponse201 addAgentKey(agentId, keyRequest)

Add a key to an agent

**Add a Key to an Agent**&lt;br&gt;Uploads a new public key for the specified agent. The key is created in ***deactivated*** state and must be explicitly activated via &#x60;POST /agents/{agentId}/keys/{keyId}/activate&#x60; before it can be used.&lt;br&gt;&lt;br&gt; Returns **404** if the agent is not found, **403** if the agent is deactivated. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentRegistrationApi;


AgentRegistrationApi apiInstance = new AgentRegistrationApi();
String agentId = "agentId_example"; // String | Unique agent identifier
KeyRequest keyRequest = new KeyRequest(); // KeyRequest | Key creation request
try {
    AddAgentKeyResponse201 result = apiInstance.addAgentKey(agentId, keyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentRegistrationApi#addAgentKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **keyRequest** | [**KeyRequest**](KeyRequest.md)| Key creation request |

### Return type

[**AddAgentKeyResponse201**](AddAgentKeyResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getAgent"></a>
# **getAgent**
> AgentRegistrationResponse201 getAgent(agentId)

Get an agent

**Get an Agent**&lt;br&gt;Retrieves a single agent by its unique identifier, including all associated public keys.&lt;br&gt;&lt;br&gt; Returns **404** if the agent is not found. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentRegistrationApi;


AgentRegistrationApi apiInstance = new AgentRegistrationApi();
String agentId = "agentId_example"; // String | Unique agent identifier
try {
    AgentRegistrationResponse201 result = apiInstance.getAgent(agentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentRegistrationApi#getAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |

### Return type

[**AgentRegistrationResponse201**](AgentRegistrationResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="getAgentKey"></a>
# **getAgentKey**
> AddAgentKeyResponse201 getAgentKey(agentId, keyId)

Get a key by agent and key ID

**Get a Key**&lt;br&gt;Retrieves a specific public key by agent ID and key ID.&lt;br&gt;&lt;br&gt; Returns **404** if the agent or key is not found. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentRegistrationApi;


AgentRegistrationApi apiInstance = new AgentRegistrationApi();
String agentId = "agentId_example"; // String | Unique agent identifier
String keyId = "keyId_example"; // String | Unique key identifier
try {
    AddAgentKeyResponse201 result = apiInstance.getAgentKey(agentId, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentRegistrationApi#getAgentKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **keyId** | **String**| Unique key identifier |

### Return type

[**AddAgentKeyResponse201**](AddAgentKeyResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="listAgentKeys"></a>
# **listAgentKeys**
> ListAgentKeysResponse200 listAgentKeys(agentId, page, pageSize)

List keys for an agent

**List Keys for an Agent**&lt;br&gt;Returns a paginated list of all public keys associated with the specified agent.&lt;br&gt;&lt;br&gt; Returns **404** if the agent is not found. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentRegistrationApi;


AgentRegistrationApi apiInstance = new AgentRegistrationApi();
String agentId = "agentId_example"; // String | Unique agent identifier
Integer page = 1; // Integer | Page number (1-indexed)
Integer pageSize = 30; // Integer | Items per page (max 100)
try {
    ListAgentKeysResponse200 result = apiInstance.listAgentKeys(agentId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentRegistrationApi#listAgentKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **page** | **Integer**| Page number (1-indexed) | [optional] [default to 1]
 **pageSize** | **Integer**| Items per page (max 100) | [optional] [default to 30]

### Return type

[**ListAgentKeysResponse200**](ListAgentKeysResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="registerAgent"></a>
# **registerAgent**
> AgentRegistrationResponse201 registerAgent(agentRequest)

Register an agent

**Register an Agent**&lt;br&gt;Registers a new AI agent in the Visa Agent Registry Service (VARS). Once registered, the agent can upload public keys that merchants and Visa services use to verify request signatures.&lt;br&gt;&lt;br&gt; **Key Behavior**&lt;br&gt;If an optional &#x60;keys&#x60; array is included in the request, those keys are created alongside the agent registration in a single operation.&lt;br&gt; Returns **409 Conflict** if an agent with the same domain already exists. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentRegistrationApi;


AgentRegistrationApi apiInstance = new AgentRegistrationApi();
AgentRequest agentRequest = new AgentRequest(); // AgentRequest | Agent registration request
try {
    AgentRegistrationResponse201 result = apiInstance.registerAgent(agentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentRegistrationApi#registerAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentRequest** | [**AgentRequest**](AgentRequest.md)| Agent registration request |

### Return type

[**AgentRegistrationResponse201**](AgentRegistrationResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="updateAgent"></a>
# **updateAgent**
> AgentRegistrationResponse201 updateAgent(agentId, agentUpdate)

Update an agent

**Update an Agent**&lt;br&gt;Updates agent information. Only the following fields can be modified: &#x60;name&#x60;, &#x60;domain&#x60;, &#x60;description&#x60;, &#x60;contactEmail&#x60;, and &#x60;agentMetadata&#x60;.&lt;br&gt;&lt;br&gt; Submitting any other field (e.g., &#x60;tokenRequestorId&#x60;, &#x60;keys&#x60;) returns **422 Validation Error**.&lt;br&gt; Returns **404** if the agent is not found, **403** if the agent is deactivated, **409** if the new domain is already registered. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentRegistrationApi;


AgentRegistrationApi apiInstance = new AgentRegistrationApi();
String agentId = "agentId_example"; // String | Unique agent identifier
AgentUpdate agentUpdate = new AgentUpdate(); // AgentUpdate | Agent update request
try {
    AgentRegistrationResponse201 result = apiInstance.updateAgent(agentId, agentUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentRegistrationApi#updateAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **agentUpdate** | [**AgentUpdate**](AgentUpdate.md)| Agent update request |

### Return type

[**AgentRegistrationResponse201**](AgentRegistrationResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="updateAgentKey"></a>
# **updateAgentKey**
> AddAgentKeyResponse201 updateAgentKey(agentId, keyId, keyUpdate)

Update a key

**Update a Key**&lt;br&gt;Updates key information. The following fields can be modified: &#x60;keyName&#x60;, &#x60;publicKey&#x60;, &#x60;algorithm&#x60;, and &#x60;expirationDate&#x60;.&lt;br&gt;&lt;br&gt; **Note:** &#x60;publicKey&#x60; and &#x60;algorithm&#x60; must always be updated together.&lt;br&gt; Returns **404** if the agent or key is not found, **403** if the agent or key is deactivated, **409** if the new &#x60;keyName&#x60; already exists. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.AgentRegistrationApi;


AgentRegistrationApi apiInstance = new AgentRegistrationApi();
String agentId = "agentId_example"; // String | Unique agent identifier
String keyId = "keyId_example"; // String | Unique key identifier
KeyUpdate keyUpdate = new KeyUpdate(); // KeyUpdate | Key update request
try {
    AddAgentKeyResponse201 result = apiInstance.updateAgentKey(agentId, keyId, keyUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentRegistrationApi#updateAgentKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentId** | **String**| Unique agent identifier |
 **keyId** | **String**| Unique key identifier |
 **keyUpdate** | [**KeyUpdate**](KeyUpdate.md)| Key update request |

### Return type

[**AddAgentKeyResponse201**](AddAgentKeyResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

