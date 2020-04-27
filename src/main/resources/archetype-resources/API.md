#set($h1 = '#')
#set($h2 = '##')
#set($h3 = '###')
#set($h4 = '####')
#set($h5 = '#####')
#set($h6 = '######')
$h1 Chains

$h2 <chain-name>

<chain-description>

$h3 Request

$h4 Request parameters

|Parameter|Type|Description|
|:--------:|:---:|:----------:|
|messageMapId|String|Chain name|
|<param-name>|<type>|<description>|

$h4 Request example

```json
{
  "messageMapId": "<chain-map-id>"
}
```

$h3 Response

$h4 Response parameters

|Parameter|Type|Description|
|:--------:|:---:|:----------:|
|data|JSON object|Response data|
|errors|JSON array|Response errors|
|success|boolean|Status of requested operation|

$h4 Response example

$h5 Successful response

```json
{
  "data": {},
  "errors": [],
  "success": true
}
```

$h5 Failed response

```
{
   "data": {},
   "errors": ["<error-name>"],
   "success": false
}
```

$h6 Reasons for failure

<reason-name>: `<reason-error-string>`