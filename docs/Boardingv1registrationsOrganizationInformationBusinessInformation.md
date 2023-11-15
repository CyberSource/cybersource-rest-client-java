
# Boardingv1registrationsOrganizationInformationBusinessInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**doingBusinessAs** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) | &#x60;Format: YYYY-MM-DD&#x60; Example 2016-08-11 equals August 11, 2016  |  [optional]
**address** | [**Boardingv1registrationsOrganizationInformationBusinessInformationAddress**](Boardingv1registrationsOrganizationInformationBusinessInformationAddress.md) |  |  [optional]
**timeZone** | [**TimeZoneEnum**](#TimeZoneEnum) | Merchant perferred time zone Possible Values: - &#39;Pacific/Pago_Pago&#39; - &#39;Pacific/Honolulu&#39; - &#39;America/Anchorage&#39; - &#39;America/Vancouver&#39; - &#39;America/Los_Angeles&#39; - &#39;America/Phoenix&#39; - &#39;America/Edmonton&#39; - &#39;America/Denver&#39; - &#39;America/Winnipeg&#39; - &#39;America/Mexico_City&#39; - &#39;America/Chicago&#39; - &#39;America/Bogota&#39; - &#39;America/Indianapolis&#39; - &#39;America/New_York&#39; - &#39;America/La_Paz&#39; - &#39;America/Halifax&#39; - &#39;America/St_Johns&#39; - &#39;America/Buenos_Aires&#39; - &#39;America/Godthab&#39; - &#39;America/Sao_Paulo&#39; - &#39;America/Noronha&#39; - &#39;Atlantic/Cape_Verde&#39; - &#39;GMT&#39; - &#39;Europe/Dublin&#39; - &#39;Europe/Lisbon&#39; - &#39;Europe/London&#39; - &#39;Africa/Tunis&#39; - &#39;Europe/Vienna&#39; - &#39;Europe/Brussels&#39; - &#39;Europe/Zurich&#39; - &#39;Europe/Prague&#39; - &#39;Europe/Berlin&#39; - &#39;Europe/Copenhagen&#39; - &#39;Europe/Madrid&#39; - &#39;Europe/Budapest&#39; - &#39;Europe/Rome&#39; - &#39;Africa/Tripoli&#39; - &#39;Europe/Monaco&#39; - &#39;Europe/Malta&#39; - &#39;Europe/Amsterdam&#39; - &#39;Europe/Oslo&#39; - &#39;Europe/Warsaw&#39; - &#39;Europe/Stockholm&#39; - &#39;Europe/Belgrade&#39; - &#39;Europe/Paris&#39; - &#39;Africa/Johannesburg&#39; - &#39;Europe/Minsk&#39; - &#39;Africa/Cairo&#39; - &#39;Europe/Helsinki&#39; - &#39;Europe/Athens&#39; - &#39;Asia/Jerusalem&#39; - &#39;Europe/Riga&#39; - &#39;Europe/Bucharest&#39; - &#39;Europe/Istanbul&#39; - &#39;Asia/Riyadh&#39; - &#39;Europe/Moscow&#39; - &#39;Asia/Dubai&#39; - &#39;Asia/Baku&#39; - &#39;Asia/Tbilisi&#39; - &#39;Asia/Calcutta&#39; - &#39;Asia/Katmandu&#39; - &#39;Asia/Dacca&#39; - &#39;Asia/Rangoon&#39; - &#39;Asia/Jakarta&#39; - &#39;Asia/Saigon&#39; - &#39;Asia/Bangkok&#39; - &#39;Australia/Perth&#39; - &#39;Asia/Hong_Kong&#39; - &#39;Asia/Macao&#39; - &#39;Asia/Kuala_Lumpur&#39; - &#39;Asia/Manila&#39; - &#39;Asia/Singapore&#39; - &#39;Asia/Taipei&#39; - &#39;Asia/Shanghai&#39; - &#39;Asia/Seoul&#39; - &#39;Asia/Tokyo&#39; - &#39;Asia/Yakutsk&#39; - &#39;Australia/Adelaide&#39; - &#39;Australia/Brisbane&#39; - &#39;Australia/Broken_Hill&#39; - &#39;Australia/Darwin&#39; - &#39;Australia/Eucla&#39; - &#39;Australia/Hobart&#39; - &#39;Australia/Lindeman&#39; - &#39;Australia/Sydney&#39; - &#39;Australia/Lord_Howe&#39; - &#39;Australia/Melbourne&#39; - &#39;Asia/Magadan&#39; - &#39;Pacific/Norfolk&#39; - &#39;Pacific/Auckland&#39;  |  [optional]
**websiteUrl** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Business type Possible Values:   - &#39;PARTNERSHIP&#39;   - &#39;SOLE_PROPRIETORSHIP&#39;   - &#39;CORPORATION&#39;   - &#39;LLC&#39;   - &#39;NON_PROFIT&#39;   - &#39;TRUST&#39;  |  [optional]
**taxId** | **String** |  |  [optional]
**phoneNumber** | **String** |  |  [optional]
**businessContact** | [**Boardingv1registrationsOrganizationInformationBusinessInformationBusinessContact**](Boardingv1registrationsOrganizationInformationBusinessInformationBusinessContact.md) |  |  [optional]
**technicalContact** | [**Boardingv1registrationsOrganizationInformationBusinessInformationBusinessContact**](Boardingv1registrationsOrganizationInformationBusinessInformationBusinessContact.md) |  |  [optional]
**emergencyContact** | [**Boardingv1registrationsOrganizationInformationBusinessInformationBusinessContact**](Boardingv1registrationsOrganizationInformationBusinessInformationBusinessContact.md) |  |  [optional]
**merchantCategoryCode** | **String** | Industry standard Merchant Category Code (MCC) |  [optional]


<a name="TimeZoneEnum"></a>
## Enum: TimeZoneEnum
Name | Value
---- | -----
PACIFIC_PAGO_PAGO | &quot;Pacific/Pago_Pago&quot;
PACIFIC_HONOLULU | &quot;Pacific/Honolulu&quot;
AMERICA_ANCHORAGE | &quot;America/Anchorage&quot;
AMERICA_VANCOUVER | &quot;America/Vancouver&quot;
AMERICA_LOS_ANGELES | &quot;America/Los_Angeles&quot;
AMERICA_PHOENIX | &quot;America/Phoenix&quot;
AMERICA_EDMONTON | &quot;America/Edmonton&quot;
AMERICA_DENVER | &quot;America/Denver&quot;
AMERICA_WINNIPEG | &quot;America/Winnipeg&quot;
AMERICA_MEXICO_CITY | &quot;America/Mexico_City&quot;
AMERICA_CHICAGO | &quot;America/Chicago&quot;
AMERICA_BOGOTA | &quot;America/Bogota&quot;
AMERICA_INDIANAPOLIS | &quot;America/Indianapolis&quot;
AMERICA_NEW_YORK | &quot;America/New_York&quot;
AMERICA_LA_PAZ | &quot;America/La_Paz&quot;
AMERICA_HALIFAX | &quot;America/Halifax&quot;
AMERICA_ST_JOHNS | &quot;America/St_Johns&quot;
AMERICA_BUENOS_AIRES | &quot;America/Buenos_Aires&quot;
AMERICA_GODTHAB | &quot;America/Godthab&quot;
AMERICA_SAO_PAULO | &quot;America/Sao_Paulo&quot;
AMERICA_NORONHA | &quot;America/Noronha&quot;
ATLANTIC_CAPE_VERDE | &quot;Atlantic/Cape_Verde&quot;
GMT | &quot;GMT&quot;
EUROPE_DUBLIN | &quot;Europe/Dublin&quot;
EUROPE_LISBON | &quot;Europe/Lisbon&quot;
EUROPE_LONDON | &quot;Europe/London&quot;
AFRICA_TUNIS | &quot;Africa/Tunis&quot;
EUROPE_VIENNA | &quot;Europe/Vienna&quot;
EUROPE_BRUSSELS | &quot;Europe/Brussels&quot;
EUROPE_ZURICH | &quot;Europe/Zurich&quot;
EUROPE_PRAGUE | &quot;Europe/Prague&quot;
EUROPE_BERLIN | &quot;Europe/Berlin&quot;
EUROPE_COPENHAGEN | &quot;Europe/Copenhagen&quot;
EUROPE_MADRID | &quot;Europe/Madrid&quot;
EUROPE_BUDAPEST | &quot;Europe/Budapest&quot;
EUROPE_ROME | &quot;Europe/Rome&quot;
AFRICA_TRIPOLI | &quot;Africa/Tripoli&quot;
EUROPE_MONACO | &quot;Europe/Monaco&quot;
EUROPE_MALTA | &quot;Europe/Malta&quot;
EUROPE_AMSTERDAM | &quot;Europe/Amsterdam&quot;
EUROPE_OSLO | &quot;Europe/Oslo&quot;
EUROPE_WARSAW | &quot;Europe/Warsaw&quot;
EUROPE_STOCKHOLM | &quot;Europe/Stockholm&quot;
EUROPE_BELGRADE | &quot;Europe/Belgrade&quot;
EUROPE_PARIS | &quot;Europe/Paris&quot;
AFRICA_JOHANNESBURG | &quot;Africa/Johannesburg&quot;
EUROPE_MINSK | &quot;Europe/Minsk&quot;
AFRICA_CAIRO | &quot;Africa/Cairo&quot;
EUROPE_HELSINKI | &quot;Europe/Helsinki&quot;
EUROPE_ATHENS | &quot;Europe/Athens&quot;
ASIA_JERUSALEM | &quot;Asia/Jerusalem&quot;
EUROPE_RIGA | &quot;Europe/Riga&quot;
EUROPE_BUCHAREST | &quot;Europe/Bucharest&quot;
EUROPE_ISTANBUL | &quot;Europe/Istanbul&quot;
ASIA_RIYADH | &quot;Asia/Riyadh&quot;
EUROPE_MOSCOW | &quot;Europe/Moscow&quot;
ASIA_DUBAI | &quot;Asia/Dubai&quot;
ASIA_BAKU | &quot;Asia/Baku&quot;
ASIA_TBILISI | &quot;Asia/Tbilisi&quot;
ASIA_CALCUTTA | &quot;Asia/Calcutta&quot;
ASIA_KATMANDU | &quot;Asia/Katmandu&quot;
ASIA_DACCA | &quot;Asia/Dacca&quot;
ASIA_RANGOON | &quot;Asia/Rangoon&quot;
ASIA_JAKARTA | &quot;Asia/Jakarta&quot;
ASIA_SAIGON | &quot;Asia/Saigon&quot;
ASIA_BANGKOK | &quot;Asia/Bangkok&quot;
AUSTRALIA_PERTH | &quot;Australia/Perth&quot;
ASIA_HONG_KONG | &quot;Asia/Hong_Kong&quot;
ASIA_MACAO | &quot;Asia/Macao&quot;
ASIA_KUALA_LUMPUR | &quot;Asia/Kuala_Lumpur&quot;
ASIA_MANILA | &quot;Asia/Manila&quot;
ASIA_SINGAPORE | &quot;Asia/Singapore&quot;
ASIA_TAIPEI | &quot;Asia/Taipei&quot;
ASIA_SHANGHAI | &quot;Asia/Shanghai&quot;
ASIA_SEOUL | &quot;Asia/Seoul&quot;
ASIA_TOKYO | &quot;Asia/Tokyo&quot;
ASIA_YAKUTSK | &quot;Asia/Yakutsk&quot;
AUSTRALIA_ADELAIDE | &quot;Australia/Adelaide&quot;
AUSTRALIA_BRISBANE | &quot;Australia/Brisbane&quot;
AUSTRALIA_BROKEN_HILL | &quot;Australia/Broken_Hill&quot;
AUSTRALIA_DARWIN | &quot;Australia/Darwin&quot;
AUSTRALIA_EUCLA | &quot;Australia/Eucla&quot;
AUSTRALIA_HOBART | &quot;Australia/Hobart&quot;
AUSTRALIA_LINDEMAN | &quot;Australia/Lindeman&quot;
AUSTRALIA_SYDNEY | &quot;Australia/Sydney&quot;
AUSTRALIA_LORD_HOWE | &quot;Australia/Lord_Howe&quot;
AUSTRALIA_MELBOURNE | &quot;Australia/Melbourne&quot;
ASIA_MAGADAN | &quot;Asia/Magadan&quot;
PACIFIC_NORFOLK | &quot;Pacific/Norfolk&quot;
PACIFIC_AUCKLAND | &quot;Pacific/Auckland&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PARTNERSHIP | &quot;PARTNERSHIP&quot;
SOLE_PROPRIETORSHIP | &quot;SOLE_PROPRIETORSHIP&quot;
CORPORATION | &quot;CORPORATION&quot;
LLC | &quot;LLC&quot;
NON_PROFIT | &quot;NON_PROFIT&quot;
TRUST | &quot;TRUST&quot;



