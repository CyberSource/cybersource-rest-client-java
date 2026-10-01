
# AgentRegistrationResponse201

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique agent identifier (64-char SHA-256 hash of domain + email + tokenRequestorId) | 
**name** | **String** | Display name for the agent | 
**domain** | **String** | Fully-qualified HTTPS URL of the agent&#39;s home domain | 
**description** | **String** | Description of the agent&#39;s purpose or capabilities |  [optional]
**contactEmail** | **String** | Contact email for the team or individual responsible for this agent |  [optional]
**tokenRequestorId** | **String** | Token Requestor ID (TRID) assigned by Visa, shared with the parent trusted agent for OSAs | 
**agentType** | **String** | Agent classification: &#39;trusted&#39; (commercially onboarded via Visa) or &#39;known&#39; (open-source/community agent, unverified)  Possible values: - trusted - known | 
**agentMetadata** | **Object** | Free-form metadata object for agent context (e.g., AI framework, language, runtime). Max 10KB. |  [optional]
**isActive** | **Boolean** | Whether the agent is currently active. Deactivated agents cannot add or activate keys. | 
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 UTC timestamp when the agent was registered | 
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 UTC timestamp when the agent was last updated | 
**keys** | [**List&lt;AgentRegistrationResponse201Keys&gt;**](AgentRegistrationResponse201Keys.md) | List of public keys associated with the agent (both active and deactivated) |  [optional]



