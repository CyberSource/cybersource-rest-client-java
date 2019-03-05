
# UmsV1UsersGet200ResponseAccountInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userName** | **String** |  |  [optional]
**roleId** | **String** |  |  [optional]
**permissions** | **List&lt;String&gt;** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**createdTime** | [**DateTime**](DateTime.md) |  |  [optional]
**lastAccessTime** | [**DateTime**](DateTime.md) |  |  [optional]
**languagePreference** | **String** |  |  [optional]
**timezone** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
LOCKED | &quot;locked&quot;
DISABLED | &quot;disabled&quot;
FORGOTPASSWORD | &quot;forgotpassword&quot;
DELETED | &quot;deleted&quot;



