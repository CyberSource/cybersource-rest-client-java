
# AgentRegistrationResponse201

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique agent identifier (64-char SHA-256 hash of domain + email + tokenRequestorId) | 
**name** | **String** | Agent name | 
**domain** | **String** | Agent domain URL | 
**description** | **String** | Agent description |  [optional]
**contactEmail** | **String** | Contact email |  [optional]
**tokenRequestorId** | **String** | Unique token requestor identifier | 
**agentType** | **String** | Agent classification: &#39;trusted&#39; (commercially onboarded) or &#39;known&#39; (open-source/unverified)  Possible values: - trusted - known | 
**agentMetadata** | **Map&lt;String, String&gt;** | Additional agent metadata |  [optional]
**isActive** | **Boolean** | Whether the agent is active | 
**createdAt** | [**DateTime**](DateTime.md) | Creation timestamp | 
**updatedAt** | [**DateTime**](DateTime.md) | Last update timestamp | 
**keys** | [**List&lt;AgentRegistrationResponse201Keys&gt;**](AgentRegistrationResponse201Keys.md) | List of keys associated with the agent |  [optional]



