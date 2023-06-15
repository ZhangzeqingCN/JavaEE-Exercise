# OpenAPI definition


**简介**:OpenAPI definition


**HOST**:http://localhost:8080


**联系人**:


**Version**:v0


**接口路径**:/v3/api-docs/zzq


[TOC]






# auth-controller


## deleFrom


**接口地址**:`/auth/deleteFrom`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||query|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## deleTo


**接口地址**:`/auth/deleteTo`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||query|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## login


**接口地址**:`/auth/login`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求示例**:


```javascript
{
  "username": "",
  "password": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|loginDomain|LoginDomain|body|true|LoginDomain|LoginDomain|
|&emsp;&emsp;username|||false|string||
|&emsp;&emsp;password|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## logout


**接口地址**:`/auth/logout`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## logout_2


**接口地址**:`/auth/logout`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## logout_3


**接口地址**:`/auth/logout`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## logout_5


**接口地址**:`/auth/logout`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## logout_4


**接口地址**:`/auth/logout`


**请求方式**:`PATCH`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## logout_6


**接口地址**:`/auth/logout`


**请求方式**:`OPTIONS`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## logout_1


**接口地址**:`/auth/logout`


**请求方式**:`HEAD`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## register


**接口地址**:`/auth/register`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求示例**:


```javascript
{
  "username": "",
  "password": "",
  "email": "",
  "phone": "",
  "gender": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|registerDomain|RegisterDomain|body|true|RegisterDomain|RegisterDomain|
|&emsp;&emsp;username|||false|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;email|||false|string||
|&emsp;&emsp;phone|||false|string||
|&emsp;&emsp;gender|可用值:未知,男,女||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## saveFrom


**接口地址**:`/auth/saveFrom`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求示例**:


```javascript
{
  "fromPeople": "",
  "fromPhone": "",
  "fromAddrSelect": "",
  "fromAddrDetail": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|saveFromPeople|saveFromPeople|body|true|saveFromPeople|saveFromPeople|
|&emsp;&emsp;fromPeople|||false|string||
|&emsp;&emsp;fromPhone|||false|string||
|&emsp;&emsp;fromAddrSelect|||false|string||
|&emsp;&emsp;fromAddrDetail|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## saveTo


**接口地址**:`/auth/saveTo`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求示例**:


```javascript
{
  "toPeople": "",
  "toPhone": "",
  "toAddrSelect": "",
  "toAddrDetail": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|saveToPeople|saveToPeople|body|true|saveToPeople|saveToPeople|
|&emsp;&emsp;toPeople|||false|string||
|&emsp;&emsp;toPhone|||false|string||
|&emsp;&emsp;toAddrSelect|||false|string||
|&emsp;&emsp;toAddrDetail|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## showFromPeople


**接口地址**:`/auth/showFromPeople`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## showToPeople


**接口地址**:`/auth/showToPeople`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


# commodity-controller


## findByUsername


**接口地址**:`/commodity/of-user`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## findByPrice


**接口地址**:`/commodity/price`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


# commodity-entity-controller


## getCollectionResource-commodity-get_1


**接口地址**:`/commodities`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-commodity</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page|Zero-based page index (0..N)|query|false|integer||
|size|The size of the page to be returned|query|false|integer||
|sort|Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.|query|false|array|string|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|PagedModelEntityModelCommodity|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|_embedded||PagedModelEntityModelCommodity__embedded|PagedModelEntityModelCommodity__embedded|
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||
|page||PageMetadata|PageMetadata|
|&emsp;&emsp;size||integer(int64)||
|&emsp;&emsp;totalElements||integer(int64)||
|&emsp;&emsp;totalPages||integer(int64)||
|&emsp;&emsp;number||integer(int64)||


**响应示例**:
```javascript
{
	"_embedded": {
		"commodities": [
			{
				"type": "",
				"weight": 0,
				"insuranceOrNot": true,
				"notes": "",
				"_links": {}
			}
		]
	},
	"_links": {},
	"page": {
		"size": 0,
		"totalElements": 0,
		"totalPages": 0,
		"number": 0
	}
}
```


## postCollectionResource-commodity-post


**接口地址**:`/commodities`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>create-commodity</p>



**请求示例**:


```javascript
{
  "id": 0,
  "type": "",
  "weight": 0,
  "insuranceOrNot": true,
  "notes": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|commodityRequestBody|CommodityRequestBody|body|true|CommodityRequestBody|CommodityRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;type|||false|string||
|&emsp;&emsp;weight|||false|number(float)||
|&emsp;&emsp;insuranceOrNot|||false|boolean||
|&emsp;&emsp;notes|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|201|Created|EntityModelCommodity|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|type||string||
|weight||number(float)|number(float)|
|insuranceOrNot||boolean||
|notes||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"type": "",
	"weight": 0,
	"insuranceOrNot": true,
	"notes": "",
	"_links": {}
}
```


## getItemResource-commodity-get


**接口地址**:`/commodities/{id}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-commodity</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelCommodity|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|type||string||
|weight||number(float)|number(float)|
|insuranceOrNot||boolean||
|notes||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"type": "",
	"weight": 0,
	"insuranceOrNot": true,
	"notes": "",
	"_links": {}
}
```


## putItemResource-commodity-put


**接口地址**:`/commodities/{id}`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>update-commodity</p>



**请求示例**:


```javascript
{
  "id": 0,
  "type": "",
  "weight": 0,
  "insuranceOrNot": true,
  "notes": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|commodityRequestBody|CommodityRequestBody|body|true|CommodityRequestBody|CommodityRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;type|||false|string||
|&emsp;&emsp;weight|||false|number(float)||
|&emsp;&emsp;insuranceOrNot|||false|boolean||
|&emsp;&emsp;notes|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelCommodity|
|201|Created|EntityModelCommodity|
|204|No Content||


**响应状态码-200**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|type||string||
|weight||number(float)|number(float)|
|insuranceOrNot||boolean||
|notes||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"type": "",
	"weight": 0,
	"insuranceOrNot": true,
	"notes": "",
	"_links": {}
}
```


**响应状态码-201**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|type||string||
|weight||number(float)|number(float)|
|insuranceOrNot||boolean||
|notes||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"type": "",
	"weight": 0,
	"insuranceOrNot": true,
	"notes": "",
	"_links": {}
}
```


## deleteItemResource-commodity-delete


**接口地址**:`/commodities/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-commodity</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## patchItemResource-commodity-patch


**接口地址**:`/commodities/{id}`


**请求方式**:`PATCH`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>patch-commodity</p>



**请求示例**:


```javascript
{
  "id": 0,
  "type": "",
  "weight": 0,
  "insuranceOrNot": true,
  "notes": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|commodityRequestBody|CommodityRequestBody|body|true|CommodityRequestBody|CommodityRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;type|||false|string||
|&emsp;&emsp;weight|||false|number(float)||
|&emsp;&emsp;insuranceOrNot|||false|boolean||
|&emsp;&emsp;notes|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelCommodity|
|204|No Content||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|type||string||
|weight||number(float)|number(float)|
|insuranceOrNot||boolean||
|notes||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"type": "",
	"weight": 0,
	"insuranceOrNot": true,
	"notes": "",
	"_links": {}
}
```


# dev-user-controller


## create


**接口地址**:`/dev/commodity`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求示例**:


```javascript
{
  "name": "",
  "password": "",
  "gender": "",
  "email": "",
  "phone": "",
  "address": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|user|User|body|true|User|User|
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;gender|可用值:未知,男,女||false|string||
|&emsp;&emsp;email|||false|string||
|&emsp;&emsp;phone|||false|string||
|&emsp;&emsp;address|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## one


**接口地址**:`/dev/commodity/{name}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|name||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## delete


**接口地址**:`/dev/commodity/{name}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|name||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## all


**接口地址**:`/dev/commodity/all`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


# development-controller


## testMessage_1


**接口地址**:`/dev`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## testResponse


**接口地址**:`/dev`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求示例**:


```javascript
{}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|object|object|body|true|object|object|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||


**响应参数**:


暂无


**响应示例**:
```javascript

```


# from-people-entity-controller


## getCollectionResource-frompeople-get_1


**接口地址**:`/fromPeoples`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-frompeople</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page|Zero-based page index (0..N)|query|false|integer||
|size|The size of the page to be returned|query|false|integer||
|sort|Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.|query|false|array|string|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|PagedModelEntityModelFromPeople|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|_embedded||PagedModelEntityModelFromPeople__embedded|PagedModelEntityModelFromPeople__embedded|
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||
|page||PageMetadata|PageMetadata|
|&emsp;&emsp;size||integer(int64)||
|&emsp;&emsp;totalElements||integer(int64)||
|&emsp;&emsp;totalPages||integer(int64)||
|&emsp;&emsp;number||integer(int64)||


**响应示例**:
```javascript
{
	"_embedded": {
		"fromPeoples": [
			{
				"fromUser": "",
				"fromPhone": "",
				"fromAddressSelect": "",
				"fromAddressDetail": "",
				"_links": {}
			}
		]
	},
	"_links": {},
	"page": {
		"size": 0,
		"totalElements": 0,
		"totalPages": 0,
		"number": 0
	}
}
```


## postCollectionResource-frompeople-post


**接口地址**:`/fromPeoples`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>create-frompeople</p>



**请求示例**:


```javascript
{
  "id": 0,
  "user": "",
  "fromUser": "",
  "fromPhone": "",
  "fromAddressSelect": "",
  "fromAddressDetail": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|fromPeopleRequestBody|FromPeopleRequestBody|body|true|FromPeopleRequestBody|FromPeopleRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;user|||false|string||
|&emsp;&emsp;fromUser|||false|string||
|&emsp;&emsp;fromPhone|||false|string||
|&emsp;&emsp;fromAddressSelect|||false|string||
|&emsp;&emsp;fromAddressDetail|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|201|Created|EntityModelFromPeople|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|fromUser||string||
|fromPhone||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"fromUser": "",
	"fromPhone": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"_links": {}
}
```


## getItemResource-frompeople-get


**接口地址**:`/fromPeoples/{id}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-frompeople</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelFromPeople|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|fromUser||string||
|fromPhone||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"fromUser": "",
	"fromPhone": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"_links": {}
}
```


## putItemResource-frompeople-put


**接口地址**:`/fromPeoples/{id}`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>update-frompeople</p>



**请求示例**:


```javascript
{
  "id": 0,
  "user": "",
  "fromUser": "",
  "fromPhone": "",
  "fromAddressSelect": "",
  "fromAddressDetail": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|fromPeopleRequestBody|FromPeopleRequestBody|body|true|FromPeopleRequestBody|FromPeopleRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;user|||false|string||
|&emsp;&emsp;fromUser|||false|string||
|&emsp;&emsp;fromPhone|||false|string||
|&emsp;&emsp;fromAddressSelect|||false|string||
|&emsp;&emsp;fromAddressDetail|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelFromPeople|
|201|Created|EntityModelFromPeople|
|204|No Content||


**响应状态码-200**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|fromUser||string||
|fromPhone||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"fromUser": "",
	"fromPhone": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"_links": {}
}
```


**响应状态码-201**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|fromUser||string||
|fromPhone||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"fromUser": "",
	"fromPhone": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"_links": {}
}
```


## deleteItemResource-frompeople-delete


**接口地址**:`/fromPeoples/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-frompeople</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## patchItemResource-frompeople-patch


**接口地址**:`/fromPeoples/{id}`


**请求方式**:`PATCH`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>patch-frompeople</p>



**请求示例**:


```javascript
{
  "id": 0,
  "user": "",
  "fromUser": "",
  "fromPhone": "",
  "fromAddressSelect": "",
  "fromAddressDetail": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|fromPeopleRequestBody|FromPeopleRequestBody|body|true|FromPeopleRequestBody|FromPeopleRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;user|||false|string||
|&emsp;&emsp;fromUser|||false|string||
|&emsp;&emsp;fromPhone|||false|string||
|&emsp;&emsp;fromAddressSelect|||false|string||
|&emsp;&emsp;fromAddressDetail|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelFromPeople|
|204|No Content||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|fromUser||string||
|fromPhone||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"fromUser": "",
	"fromPhone": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"_links": {}
}
```


# from-people-property-reference-controller


## followPropertyReference-frompeople-get_1


**接口地址**:`/fromPeoples/{id}/user`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-user-by-frompeople-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


## createPropertyReference-frompeople-put


**接口地址**:`/fromPeoples/{id}/user`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json,application/x-spring-data-compact+json,text/uri-list`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>update-user-by-frompeople-Id</p>



**请求示例**:


```javascript
{
  "_embedded": {
    "objects": []
  },
  "_links": {}
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|collectionModelObject|CollectionModelObject|body|true|CollectionModelObject|CollectionModelObject|
|&emsp;&emsp;_embedded|||false|object||
|&emsp;&emsp;_links|||false|Links|Links|
|&emsp;&emsp;&emsp;&emsp;additionalProperty1|||false|Link|Link|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|201|Created|EntityModelUser|
|204|No Content||


**响应状态码-200**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


**响应状态码-201**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


## deletePropertyReference-frompeople-delete


**接口地址**:`/fromPeoples/{id}/user`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-user-by-frompeople-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## createPropertyReference-frompeople-patch


**接口地址**:`/fromPeoples/{id}/user`


**请求方式**:`PATCH`


**请求数据类型**:`application/x-www-form-urlencoded,application/json,application/x-spring-data-compact+json,text/uri-list`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>patch-user-by-frompeople-Id</p>



**请求示例**:


```javascript
{
  "_embedded": {
    "objects": []
  },
  "_links": {}
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|collectionModelObject|CollectionModelObject|body|true|CollectionModelObject|CollectionModelObject|
|&emsp;&emsp;_embedded|||false|object||
|&emsp;&emsp;_links|||false|Links|Links|
|&emsp;&emsp;&emsp;&emsp;additionalProperty1|||false|Link|Link|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|204|No Content||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


## followPropertyReference-frompeople-get


**接口地址**:`/fromPeoples/{id}/user/{propertyId}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-user-by-frompeople-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|propertyId||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


## deletePropertyReferenceId-frompeople-delete


**接口地址**:`/fromPeoples/{id}/user/{propertyId}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-user-by-frompeople-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|propertyId||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


# from-people-search-controller


## executeSearch-frompeople-get


**接口地址**:`/fromPeoples/search/findByUser`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|user||query|false|User|User|
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;gender|可用值:未知,男,女||false|string||
|&emsp;&emsp;email|||false|string||
|&emsp;&emsp;phone|||false|string||
|&emsp;&emsp;address|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelFromPeople|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|fromUser||string||
|fromPhone||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"fromUser": "",
	"fromPhone": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"_links": {}
}
```


# my-test-controller


## testMessage


**接口地址**:`/test`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## error


**接口地址**:`/test/error`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


# order-controller


## addNewOrder


**接口地址**:`/order/addOrder`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求示例**:


```javascript
{
  "fromPeople": {
    "fromPeople": "",
    "fromPhone": "",
    "fromAddrSelect": "",
    "fromAddrDetail": ""
  },
  "toPeople": {
    "toPeople": "",
    "toPhone": "",
    "toAddrSelect": "",
    "toAddrDetail": ""
  },
  "item": {
    "type": "",
    "weight": "",
    "insuranceOrNot": true,
    "notes": ""
  },
  "placeAnOrderTime": "",
  "chooseCourier": "",
  "paymentMethod": "",
  "estimatedCost": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|addNewOrderDomain|addNewOrderDomain|body|true|addNewOrderDomain|addNewOrderDomain|
|&emsp;&emsp;fromPeople|||false|saveFromPeople|saveFromPeople|
|&emsp;&emsp;&emsp;&emsp;fromPeople|||false|string||
|&emsp;&emsp;&emsp;&emsp;fromPhone|||false|string||
|&emsp;&emsp;&emsp;&emsp;fromAddrSelect|||false|string||
|&emsp;&emsp;&emsp;&emsp;fromAddrDetail|||false|string||
|&emsp;&emsp;toPeople|||false|saveToPeople|saveToPeople|
|&emsp;&emsp;&emsp;&emsp;toPeople|||false|string||
|&emsp;&emsp;&emsp;&emsp;toPhone|||false|string||
|&emsp;&emsp;&emsp;&emsp;toAddrSelect|||false|string||
|&emsp;&emsp;&emsp;&emsp;toAddrDetail|||false|string||
|&emsp;&emsp;item|||false|item|item|
|&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;weight|||false|string||
|&emsp;&emsp;&emsp;&emsp;insuranceOrNot|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;notes|||false|string||
|&emsp;&emsp;placeAnOrderTime|||false|string||
|&emsp;&emsp;chooseCourier|||false|string||
|&emsp;&emsp;paymentMethod|||false|string||
|&emsp;&emsp;estimatedCost|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## checkOrderByShipmentCode


**接口地址**:`/order/checkOrderByShipmentCode`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|ShipmentCode||query|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## getAllOrders


**接口地址**:`/order/getAllOrders`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


## addOrder


**接口地址**:`/order/showOrderDetail`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|shipmentCode||query|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|success||boolean||
|code||integer(int32)|integer(int32)|
|message||string||
|data||object||
|errors||array||
|devMessages||array||


**响应示例**:
```javascript
{
	"success": true,
	"code": 0,
	"message": "",
	"data": {},
	"errors": [],
	"devMessages": []
}
```


# parcel-trace-entity-controller


## getCollectionResource-parceltrace-get_1


**接口地址**:`/parcelTraces`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-parceltrace</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page|Zero-based page index (0..N)|query|false|integer||
|size|The size of the page to be returned|query|false|integer||
|sort|Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.|query|false|array|string|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|PagedModelEntityModelParcelTrace|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|_embedded||PagedModelEntityModelParcelTrace__embedded|PagedModelEntityModelParcelTrace__embedded|
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||
|page||PageMetadata|PageMetadata|
|&emsp;&emsp;size||integer(int64)||
|&emsp;&emsp;totalElements||integer(int64)||
|&emsp;&emsp;totalPages||integer(int64)||
|&emsp;&emsp;number||integer(int64)||


**响应示例**:
```javascript
{
	"_embedded": {
		"parcelTraces": [
			{
				"siteName": "",
				"arriveTime": "",
				"leaveTime": "",
				"attribute": "",
				"_links": {}
			}
		]
	},
	"_links": {},
	"page": {
		"size": 0,
		"totalElements": 0,
		"totalPages": 0,
		"number": 0
	}
}
```


## postCollectionResource-parceltrace-post


**接口地址**:`/parcelTraces`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>create-parceltrace</p>



**请求示例**:


```javascript
{
  "id": 0,
  "shipment": "",
  "siteName": "",
  "arriveTime": "",
  "leaveTime": "",
  "attribute": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|parcelTraceRequestBody|ParcelTraceRequestBody|body|true|ParcelTraceRequestBody|ParcelTraceRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;shipment|||false|string||
|&emsp;&emsp;siteName|||false|string||
|&emsp;&emsp;arriveTime|||false|string||
|&emsp;&emsp;leaveTime|||false|string||
|&emsp;&emsp;attribute|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|201|Created|EntityModelParcelTrace|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|siteName||string||
|arriveTime||string||
|leaveTime||string||
|attribute||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"siteName": "",
	"arriveTime": "",
	"leaveTime": "",
	"attribute": "",
	"_links": {}
}
```


## getItemResource-parceltrace-get


**接口地址**:`/parcelTraces/{id}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-parceltrace</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelParcelTrace|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|siteName||string||
|arriveTime||string||
|leaveTime||string||
|attribute||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"siteName": "",
	"arriveTime": "",
	"leaveTime": "",
	"attribute": "",
	"_links": {}
}
```


## putItemResource-parceltrace-put


**接口地址**:`/parcelTraces/{id}`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>update-parceltrace</p>



**请求示例**:


```javascript
{
  "id": 0,
  "shipment": "",
  "siteName": "",
  "arriveTime": "",
  "leaveTime": "",
  "attribute": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|parcelTraceRequestBody|ParcelTraceRequestBody|body|true|ParcelTraceRequestBody|ParcelTraceRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;shipment|||false|string||
|&emsp;&emsp;siteName|||false|string||
|&emsp;&emsp;arriveTime|||false|string||
|&emsp;&emsp;leaveTime|||false|string||
|&emsp;&emsp;attribute|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelParcelTrace|
|201|Created|EntityModelParcelTrace|
|204|No Content||


**响应状态码-200**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|siteName||string||
|arriveTime||string||
|leaveTime||string||
|attribute||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"siteName": "",
	"arriveTime": "",
	"leaveTime": "",
	"attribute": "",
	"_links": {}
}
```


**响应状态码-201**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|siteName||string||
|arriveTime||string||
|leaveTime||string||
|attribute||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"siteName": "",
	"arriveTime": "",
	"leaveTime": "",
	"attribute": "",
	"_links": {}
}
```


## deleteItemResource-parceltrace-delete


**接口地址**:`/parcelTraces/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-parceltrace</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## patchItemResource-parceltrace-patch


**接口地址**:`/parcelTraces/{id}`


**请求方式**:`PATCH`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>patch-parceltrace</p>



**请求示例**:


```javascript
{
  "id": 0,
  "shipment": "",
  "siteName": "",
  "arriveTime": "",
  "leaveTime": "",
  "attribute": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|parcelTraceRequestBody|ParcelTraceRequestBody|body|true|ParcelTraceRequestBody|ParcelTraceRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;shipment|||false|string||
|&emsp;&emsp;siteName|||false|string||
|&emsp;&emsp;arriveTime|||false|string||
|&emsp;&emsp;leaveTime|||false|string||
|&emsp;&emsp;attribute|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelParcelTrace|
|204|No Content||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|siteName||string||
|arriveTime||string||
|leaveTime||string||
|attribute||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"siteName": "",
	"arriveTime": "",
	"leaveTime": "",
	"attribute": "",
	"_links": {}
}
```


# parcel-trace-property-reference-controller


## followPropertyReference-parceltrace-get_1


**接口地址**:`/parcelTraces/{id}/shipment`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-shipment-by-parceltrace-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelShipment|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id||integer(int32)|integer(int32)|
|fromUser||string||
|toUser||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|toAddressSelect||string||
|toAddressDetail||string||
|toPhone||string||
|fromPhone||string||
|commodity||Commodity|Commodity|
|&emsp;&emsp;id||integer(int32)||
|&emsp;&emsp;type||string||
|&emsp;&emsp;weight||number(float)||
|&emsp;&emsp;insuranceOrNot||boolean||
|&emsp;&emsp;notes||string||
|parcelTrace||string||
|placeAnOrderTime||string||
|chooseCourier||string||
|paymentMethod||string||
|estimatedCost||string||
|shippingCode||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"id": 0,
	"fromUser": "",
	"toUser": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"toPhone": "",
	"fromPhone": "",
	"commodity": {
		"id": 0,
		"type": "",
		"weight": 0,
		"insuranceOrNot": true,
		"notes": ""
	},
	"parcelTrace": "",
	"placeAnOrderTime": "",
	"chooseCourier": "",
	"paymentMethod": "",
	"estimatedCost": "",
	"shippingCode": "",
	"_links": {}
}
```


## createPropertyReference-parceltrace-put


**接口地址**:`/parcelTraces/{id}/shipment`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json,application/x-spring-data-compact+json,text/uri-list`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>update-shipment-by-parceltrace-Id</p>



**请求示例**:


```javascript
{
  "_embedded": {
    "objects": []
  },
  "_links": {}
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|collectionModelObject|CollectionModelObject|body|true|CollectionModelObject|CollectionModelObject|
|&emsp;&emsp;_embedded|||false|object||
|&emsp;&emsp;_links|||false|Links|Links|
|&emsp;&emsp;&emsp;&emsp;additionalProperty1|||false|Link|Link|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelShipment|
|201|Created|EntityModelShipment|
|204|No Content||


**响应状态码-200**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id||integer(int32)|integer(int32)|
|fromUser||string||
|toUser||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|toAddressSelect||string||
|toAddressDetail||string||
|toPhone||string||
|fromPhone||string||
|commodity||Commodity|Commodity|
|&emsp;&emsp;id||integer(int32)||
|&emsp;&emsp;type||string||
|&emsp;&emsp;weight||number(float)||
|&emsp;&emsp;insuranceOrNot||boolean||
|&emsp;&emsp;notes||string||
|parcelTrace||string||
|placeAnOrderTime||string||
|chooseCourier||string||
|paymentMethod||string||
|estimatedCost||string||
|shippingCode||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"id": 0,
	"fromUser": "",
	"toUser": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"toPhone": "",
	"fromPhone": "",
	"commodity": {
		"id": 0,
		"type": "",
		"weight": 0,
		"insuranceOrNot": true,
		"notes": ""
	},
	"parcelTrace": "",
	"placeAnOrderTime": "",
	"chooseCourier": "",
	"paymentMethod": "",
	"estimatedCost": "",
	"shippingCode": "",
	"_links": {}
}
```


**响应状态码-201**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id||integer(int32)|integer(int32)|
|fromUser||string||
|toUser||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|toAddressSelect||string||
|toAddressDetail||string||
|toPhone||string||
|fromPhone||string||
|commodity||Commodity|Commodity|
|&emsp;&emsp;id||integer(int32)||
|&emsp;&emsp;type||string||
|&emsp;&emsp;weight||number(float)||
|&emsp;&emsp;insuranceOrNot||boolean||
|&emsp;&emsp;notes||string||
|parcelTrace||string||
|placeAnOrderTime||string||
|chooseCourier||string||
|paymentMethod||string||
|estimatedCost||string||
|shippingCode||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"id": 0,
	"fromUser": "",
	"toUser": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"toPhone": "",
	"fromPhone": "",
	"commodity": {
		"id": 0,
		"type": "",
		"weight": 0,
		"insuranceOrNot": true,
		"notes": ""
	},
	"parcelTrace": "",
	"placeAnOrderTime": "",
	"chooseCourier": "",
	"paymentMethod": "",
	"estimatedCost": "",
	"shippingCode": "",
	"_links": {}
}
```


## deletePropertyReference-parceltrace-delete


**接口地址**:`/parcelTraces/{id}/shipment`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-shipment-by-parceltrace-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## createPropertyReference-parceltrace-patch


**接口地址**:`/parcelTraces/{id}/shipment`


**请求方式**:`PATCH`


**请求数据类型**:`application/x-www-form-urlencoded,application/json,application/x-spring-data-compact+json,text/uri-list`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>patch-shipment-by-parceltrace-Id</p>



**请求示例**:


```javascript
{
  "_embedded": {
    "objects": []
  },
  "_links": {}
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|collectionModelObject|CollectionModelObject|body|true|CollectionModelObject|CollectionModelObject|
|&emsp;&emsp;_embedded|||false|object||
|&emsp;&emsp;_links|||false|Links|Links|
|&emsp;&emsp;&emsp;&emsp;additionalProperty1|||false|Link|Link|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelShipment|
|204|No Content||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id||integer(int32)|integer(int32)|
|fromUser||string||
|toUser||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|toAddressSelect||string||
|toAddressDetail||string||
|toPhone||string||
|fromPhone||string||
|commodity||Commodity|Commodity|
|&emsp;&emsp;id||integer(int32)||
|&emsp;&emsp;type||string||
|&emsp;&emsp;weight||number(float)||
|&emsp;&emsp;insuranceOrNot||boolean||
|&emsp;&emsp;notes||string||
|parcelTrace||string||
|placeAnOrderTime||string||
|chooseCourier||string||
|paymentMethod||string||
|estimatedCost||string||
|shippingCode||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"id": 0,
	"fromUser": "",
	"toUser": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"toPhone": "",
	"fromPhone": "",
	"commodity": {
		"id": 0,
		"type": "",
		"weight": 0,
		"insuranceOrNot": true,
		"notes": ""
	},
	"parcelTrace": "",
	"placeAnOrderTime": "",
	"chooseCourier": "",
	"paymentMethod": "",
	"estimatedCost": "",
	"shippingCode": "",
	"_links": {}
}
```


## followPropertyReference-parceltrace-get


**接口地址**:`/parcelTraces/{id}/shipment/{propertyId}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-shipment-by-parceltrace-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|propertyId||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelShipment|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id||integer(int32)|integer(int32)|
|fromUser||string||
|toUser||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|toAddressSelect||string||
|toAddressDetail||string||
|toPhone||string||
|fromPhone||string||
|commodity||Commodity|Commodity|
|&emsp;&emsp;id||integer(int32)||
|&emsp;&emsp;type||string||
|&emsp;&emsp;weight||number(float)||
|&emsp;&emsp;insuranceOrNot||boolean||
|&emsp;&emsp;notes||string||
|parcelTrace||string||
|placeAnOrderTime||string||
|chooseCourier||string||
|paymentMethod||string||
|estimatedCost||string||
|shippingCode||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"id": 0,
	"fromUser": "",
	"toUser": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"toPhone": "",
	"fromPhone": "",
	"commodity": {
		"id": 0,
		"type": "",
		"weight": 0,
		"insuranceOrNot": true,
		"notes": ""
	},
	"parcelTrace": "",
	"placeAnOrderTime": "",
	"chooseCourier": "",
	"paymentMethod": "",
	"estimatedCost": "",
	"shippingCode": "",
	"_links": {}
}
```


## deletePropertyReferenceId-parceltrace-delete


**接口地址**:`/parcelTraces/{id}/shipment/{propertyId}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-shipment-by-parceltrace-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|propertyId||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


# parcel-trace-search-controller


## executeSearch-parceltrace-get


**接口地址**:`/parcelTraces/search/findByShipment`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|ship||query|false|shipment|shipment|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;fromUser|||false|string||
|&emsp;&emsp;toUser|||false|string||
|&emsp;&emsp;fromAddressSelect|||false|string||
|&emsp;&emsp;fromAddressDetail|||false|string||
|&emsp;&emsp;toAddressSelect|||false|string||
|&emsp;&emsp;toAddressDetail|||false|string||
|&emsp;&emsp;toPhone|||false|string||
|&emsp;&emsp;fromPhone|||false|string||
|&emsp;&emsp;commodity|||false|Commodity|Commodity|
|&emsp;&emsp;&emsp;&emsp;id|||false|integer||
|&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;weight|||false|number||
|&emsp;&emsp;&emsp;&emsp;insuranceOrNot|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;notes|||false|string||
|&emsp;&emsp;parcelTrace|||false|string||
|&emsp;&emsp;placeAnOrderTime|||false|string||
|&emsp;&emsp;chooseCourier|||false|string||
|&emsp;&emsp;paymentMethod|||false|string||
|&emsp;&emsp;estimatedCost|||false|string||
|&emsp;&emsp;shippingCode|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelParcelTrace|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|siteName||string||
|arriveTime||string||
|leaveTime||string||
|attribute||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"siteName": "",
	"arriveTime": "",
	"leaveTime": "",
	"attribute": "",
	"_links": {}
}
```


# profile-controller


## listAllFormsOfMetadata_1


**接口地址**:`/profile`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|RepresentationModelObject|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"_links": {}
}
```


## descriptor_1_1_1


**接口地址**:`/profile/commodities`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## descriptor_1_1_2


**接口地址**:`/profile/fromPeoples`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## descriptor_1_1_3


**接口地址**:`/profile/parcelTraces`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## descriptor_1_1_4


**接口地址**:`/profile/shipments`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## descriptor_1_1_5


**接口地址**:`/profile/toPeoples`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## descriptor_1_1_6


**接口地址**:`/profile/users`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||


**响应参数**:


暂无


**响应示例**:
```javascript

```


# shipment-entity-controller


## getCollectionResource-shipment-get_1


**接口地址**:`/shipments`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-shipment</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page|Zero-based page index (0..N)|query|false|integer||
|size|The size of the page to be returned|query|false|integer||
|sort|Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.|query|false|array|string|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|PagedModelEntityModelShipment|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|_embedded||PagedModelEntityModelShipment__embedded|PagedModelEntityModelShipment__embedded|
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||
|page||PageMetadata|PageMetadata|
|&emsp;&emsp;size||integer(int64)||
|&emsp;&emsp;totalElements||integer(int64)||
|&emsp;&emsp;totalPages||integer(int64)||
|&emsp;&emsp;number||integer(int64)||


**响应示例**:
```javascript
{
	"_embedded": {
		"shipments": [
			{
				"id": 0,
				"fromUser": "",
				"toUser": "",
				"fromAddressSelect": "",
				"fromAddressDetail": "",
				"toAddressSelect": "",
				"toAddressDetail": "",
				"toPhone": "",
				"fromPhone": "",
				"commodity": {
					"id": 0,
					"type": "",
					"weight": 0,
					"insuranceOrNot": true,
					"notes": ""
				},
				"parcelTrace": "",
				"placeAnOrderTime": "",
				"chooseCourier": "",
				"paymentMethod": "",
				"estimatedCost": "",
				"shippingCode": "",
				"_links": {}
			}
		]
	},
	"_links": {},
	"page": {
		"size": 0,
		"totalElements": 0,
		"totalPages": 0,
		"number": 0
	}
}
```


## postCollectionResource-shipment-post


**接口地址**:`/shipments`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>create-shipment</p>



**请求示例**:


```javascript
{
  "id": 0,
  "fromUser": "",
  "toUser": "",
  "fromAddressSelect": "",
  "fromAddressDetail": "",
  "toAddressSelect": "",
  "toAddressDetail": "",
  "toPhone": "",
  "fromPhone": "",
  "commodity": "",
  "parcelTrace": "",
  "placeAnOrderTime": "",
  "chooseCourier": "",
  "paymentMethod": "",
  "estimatedCost": "",
  "shippingCode": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|shipmentRequestBody|shipmentRequestBody|body|true|shipmentRequestBody|shipmentRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;fromUser|||false|string||
|&emsp;&emsp;toUser|||false|string||
|&emsp;&emsp;fromAddressSelect|||false|string||
|&emsp;&emsp;fromAddressDetail|||false|string||
|&emsp;&emsp;toAddressSelect|||false|string||
|&emsp;&emsp;toAddressDetail|||false|string||
|&emsp;&emsp;toPhone|||false|string||
|&emsp;&emsp;fromPhone|||false|string||
|&emsp;&emsp;commodity|||false|string||
|&emsp;&emsp;parcelTrace|||false|string||
|&emsp;&emsp;placeAnOrderTime|||false|string||
|&emsp;&emsp;chooseCourier|||false|string||
|&emsp;&emsp;paymentMethod|||false|string||
|&emsp;&emsp;estimatedCost|||false|string||
|&emsp;&emsp;shippingCode|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|201|Created|EntityModelShipment|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id||integer(int32)|integer(int32)|
|fromUser||string||
|toUser||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|toAddressSelect||string||
|toAddressDetail||string||
|toPhone||string||
|fromPhone||string||
|commodity||Commodity|Commodity|
|&emsp;&emsp;id||integer(int32)||
|&emsp;&emsp;type||string||
|&emsp;&emsp;weight||number(float)||
|&emsp;&emsp;insuranceOrNot||boolean||
|&emsp;&emsp;notes||string||
|parcelTrace||string||
|placeAnOrderTime||string||
|chooseCourier||string||
|paymentMethod||string||
|estimatedCost||string||
|shippingCode||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"id": 0,
	"fromUser": "",
	"toUser": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"toPhone": "",
	"fromPhone": "",
	"commodity": {
		"id": 0,
		"type": "",
		"weight": 0,
		"insuranceOrNot": true,
		"notes": ""
	},
	"parcelTrace": "",
	"placeAnOrderTime": "",
	"chooseCourier": "",
	"paymentMethod": "",
	"estimatedCost": "",
	"shippingCode": "",
	"_links": {}
}
```


## getItemResource-shipment-get


**接口地址**:`/shipments/{id}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-shipment</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelShipment|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id||integer(int32)|integer(int32)|
|fromUser||string||
|toUser||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|toAddressSelect||string||
|toAddressDetail||string||
|toPhone||string||
|fromPhone||string||
|commodity||Commodity|Commodity|
|&emsp;&emsp;id||integer(int32)||
|&emsp;&emsp;type||string||
|&emsp;&emsp;weight||number(float)||
|&emsp;&emsp;insuranceOrNot||boolean||
|&emsp;&emsp;notes||string||
|parcelTrace||string||
|placeAnOrderTime||string||
|chooseCourier||string||
|paymentMethod||string||
|estimatedCost||string||
|shippingCode||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"id": 0,
	"fromUser": "",
	"toUser": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"toPhone": "",
	"fromPhone": "",
	"commodity": {
		"id": 0,
		"type": "",
		"weight": 0,
		"insuranceOrNot": true,
		"notes": ""
	},
	"parcelTrace": "",
	"placeAnOrderTime": "",
	"chooseCourier": "",
	"paymentMethod": "",
	"estimatedCost": "",
	"shippingCode": "",
	"_links": {}
}
```


## putItemResource-shipment-put


**接口地址**:`/shipments/{id}`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>update-shipment</p>



**请求示例**:


```javascript
{
  "id": 0,
  "fromUser": "",
  "toUser": "",
  "fromAddressSelect": "",
  "fromAddressDetail": "",
  "toAddressSelect": "",
  "toAddressDetail": "",
  "toPhone": "",
  "fromPhone": "",
  "commodity": "",
  "parcelTrace": "",
  "placeAnOrderTime": "",
  "chooseCourier": "",
  "paymentMethod": "",
  "estimatedCost": "",
  "shippingCode": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|shipmentRequestBody|shipmentRequestBody|body|true|shipmentRequestBody|shipmentRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;fromUser|||false|string||
|&emsp;&emsp;toUser|||false|string||
|&emsp;&emsp;fromAddressSelect|||false|string||
|&emsp;&emsp;fromAddressDetail|||false|string||
|&emsp;&emsp;toAddressSelect|||false|string||
|&emsp;&emsp;toAddressDetail|||false|string||
|&emsp;&emsp;toPhone|||false|string||
|&emsp;&emsp;fromPhone|||false|string||
|&emsp;&emsp;commodity|||false|string||
|&emsp;&emsp;parcelTrace|||false|string||
|&emsp;&emsp;placeAnOrderTime|||false|string||
|&emsp;&emsp;chooseCourier|||false|string||
|&emsp;&emsp;paymentMethod|||false|string||
|&emsp;&emsp;estimatedCost|||false|string||
|&emsp;&emsp;shippingCode|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelShipment|
|201|Created|EntityModelShipment|
|204|No Content||


**响应状态码-200**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id||integer(int32)|integer(int32)|
|fromUser||string||
|toUser||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|toAddressSelect||string||
|toAddressDetail||string||
|toPhone||string||
|fromPhone||string||
|commodity||Commodity|Commodity|
|&emsp;&emsp;id||integer(int32)||
|&emsp;&emsp;type||string||
|&emsp;&emsp;weight||number(float)||
|&emsp;&emsp;insuranceOrNot||boolean||
|&emsp;&emsp;notes||string||
|parcelTrace||string||
|placeAnOrderTime||string||
|chooseCourier||string||
|paymentMethod||string||
|estimatedCost||string||
|shippingCode||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"id": 0,
	"fromUser": "",
	"toUser": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"toPhone": "",
	"fromPhone": "",
	"commodity": {
		"id": 0,
		"type": "",
		"weight": 0,
		"insuranceOrNot": true,
		"notes": ""
	},
	"parcelTrace": "",
	"placeAnOrderTime": "",
	"chooseCourier": "",
	"paymentMethod": "",
	"estimatedCost": "",
	"shippingCode": "",
	"_links": {}
}
```


**响应状态码-201**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id||integer(int32)|integer(int32)|
|fromUser||string||
|toUser||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|toAddressSelect||string||
|toAddressDetail||string||
|toPhone||string||
|fromPhone||string||
|commodity||Commodity|Commodity|
|&emsp;&emsp;id||integer(int32)||
|&emsp;&emsp;type||string||
|&emsp;&emsp;weight||number(float)||
|&emsp;&emsp;insuranceOrNot||boolean||
|&emsp;&emsp;notes||string||
|parcelTrace||string||
|placeAnOrderTime||string||
|chooseCourier||string||
|paymentMethod||string||
|estimatedCost||string||
|shippingCode||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"id": 0,
	"fromUser": "",
	"toUser": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"toPhone": "",
	"fromPhone": "",
	"commodity": {
		"id": 0,
		"type": "",
		"weight": 0,
		"insuranceOrNot": true,
		"notes": ""
	},
	"parcelTrace": "",
	"placeAnOrderTime": "",
	"chooseCourier": "",
	"paymentMethod": "",
	"estimatedCost": "",
	"shippingCode": "",
	"_links": {}
}
```


## deleteItemResource-shipment-delete


**接口地址**:`/shipments/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-shipment</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## patchItemResource-shipment-patch


**接口地址**:`/shipments/{id}`


**请求方式**:`PATCH`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>patch-shipment</p>



**请求示例**:


```javascript
{
  "id": 0,
  "fromUser": "",
  "toUser": "",
  "fromAddressSelect": "",
  "fromAddressDetail": "",
  "toAddressSelect": "",
  "toAddressDetail": "",
  "toPhone": "",
  "fromPhone": "",
  "commodity": "",
  "parcelTrace": "",
  "placeAnOrderTime": "",
  "chooseCourier": "",
  "paymentMethod": "",
  "estimatedCost": "",
  "shippingCode": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|shipmentRequestBody|shipmentRequestBody|body|true|shipmentRequestBody|shipmentRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;fromUser|||false|string||
|&emsp;&emsp;toUser|||false|string||
|&emsp;&emsp;fromAddressSelect|||false|string||
|&emsp;&emsp;fromAddressDetail|||false|string||
|&emsp;&emsp;toAddressSelect|||false|string||
|&emsp;&emsp;toAddressDetail|||false|string||
|&emsp;&emsp;toPhone|||false|string||
|&emsp;&emsp;fromPhone|||false|string||
|&emsp;&emsp;commodity|||false|string||
|&emsp;&emsp;parcelTrace|||false|string||
|&emsp;&emsp;placeAnOrderTime|||false|string||
|&emsp;&emsp;chooseCourier|||false|string||
|&emsp;&emsp;paymentMethod|||false|string||
|&emsp;&emsp;estimatedCost|||false|string||
|&emsp;&emsp;shippingCode|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelShipment|
|204|No Content||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id||integer(int32)|integer(int32)|
|fromUser||string||
|toUser||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|toAddressSelect||string||
|toAddressDetail||string||
|toPhone||string||
|fromPhone||string||
|commodity||Commodity|Commodity|
|&emsp;&emsp;id||integer(int32)||
|&emsp;&emsp;type||string||
|&emsp;&emsp;weight||number(float)||
|&emsp;&emsp;insuranceOrNot||boolean||
|&emsp;&emsp;notes||string||
|parcelTrace||string||
|placeAnOrderTime||string||
|chooseCourier||string||
|paymentMethod||string||
|estimatedCost||string||
|shippingCode||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"id": 0,
	"fromUser": "",
	"toUser": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"toPhone": "",
	"fromPhone": "",
	"commodity": {
		"id": 0,
		"type": "",
		"weight": 0,
		"insuranceOrNot": true,
		"notes": ""
	},
	"parcelTrace": "",
	"placeAnOrderTime": "",
	"chooseCourier": "",
	"paymentMethod": "",
	"estimatedCost": "",
	"shippingCode": "",
	"_links": {}
}
```


# shipment-property-reference-controller


## followPropertyReference-shipment-get_1


**接口地址**:`/shipments/{id}/commodity`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-commodity-by-shipment-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelCommodity|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|type||string||
|weight||number(float)|number(float)|
|insuranceOrNot||boolean||
|notes||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"type": "",
	"weight": 0,
	"insuranceOrNot": true,
	"notes": "",
	"_links": {}
}
```


## createPropertyReference-shipment-put


**接口地址**:`/shipments/{id}/commodity`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json,application/x-spring-data-compact+json,text/uri-list`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>update-commodity-by-shipment-Id</p>



**请求示例**:


```javascript
{
  "_embedded": {
    "objects": []
  },
  "_links": {}
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|collectionModelObject|CollectionModelObject|body|true|CollectionModelObject|CollectionModelObject|
|&emsp;&emsp;_embedded|||false|object||
|&emsp;&emsp;_links|||false|Links|Links|
|&emsp;&emsp;&emsp;&emsp;additionalProperty1|||false|Link|Link|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelCommodity|
|201|Created|EntityModelCommodity|
|204|No Content||


**响应状态码-200**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|type||string||
|weight||number(float)|number(float)|
|insuranceOrNot||boolean||
|notes||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"type": "",
	"weight": 0,
	"insuranceOrNot": true,
	"notes": "",
	"_links": {}
}
```


**响应状态码-201**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|type||string||
|weight||number(float)|number(float)|
|insuranceOrNot||boolean||
|notes||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"type": "",
	"weight": 0,
	"insuranceOrNot": true,
	"notes": "",
	"_links": {}
}
```


## deletePropertyReference-shipment-delete


**接口地址**:`/shipments/{id}/commodity`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-commodity-by-shipment-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## createPropertyReference-shipment-patch


**接口地址**:`/shipments/{id}/commodity`


**请求方式**:`PATCH`


**请求数据类型**:`application/x-www-form-urlencoded,application/json,application/x-spring-data-compact+json,text/uri-list`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>patch-commodity-by-shipment-Id</p>



**请求示例**:


```javascript
{
  "_embedded": {
    "objects": []
  },
  "_links": {}
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|collectionModelObject|CollectionModelObject|body|true|CollectionModelObject|CollectionModelObject|
|&emsp;&emsp;_embedded|||false|object||
|&emsp;&emsp;_links|||false|Links|Links|
|&emsp;&emsp;&emsp;&emsp;additionalProperty1|||false|Link|Link|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelCommodity|
|204|No Content||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|type||string||
|weight||number(float)|number(float)|
|insuranceOrNot||boolean||
|notes||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"type": "",
	"weight": 0,
	"insuranceOrNot": true,
	"notes": "",
	"_links": {}
}
```


## followPropertyReference-shipment-get


**接口地址**:`/shipments/{id}/commodity/{propertyId}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-commodity-by-shipment-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|propertyId||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelCommodity|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|type||string||
|weight||number(float)|number(float)|
|insuranceOrNot||boolean||
|notes||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"type": "",
	"weight": 0,
	"insuranceOrNot": true,
	"notes": "",
	"_links": {}
}
```


## deletePropertyReferenceId-shipment-delete


**接口地址**:`/shipments/{id}/commodity/{propertyId}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-commodity-by-shipment-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|propertyId||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


# shipment-search-controller


## executeSearch-shipment-get


**接口地址**:`/shipments/search/findByFromPhone`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|fromPhone||query|false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelShipment|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id||integer(int32)|integer(int32)|
|fromUser||string||
|toUser||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|toAddressSelect||string||
|toAddressDetail||string||
|toPhone||string||
|fromPhone||string||
|commodity||Commodity|Commodity|
|&emsp;&emsp;id||integer(int32)||
|&emsp;&emsp;type||string||
|&emsp;&emsp;weight||number(float)||
|&emsp;&emsp;insuranceOrNot||boolean||
|&emsp;&emsp;notes||string||
|parcelTrace||string||
|placeAnOrderTime||string||
|chooseCourier||string||
|paymentMethod||string||
|estimatedCost||string||
|shippingCode||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"id": 0,
	"fromUser": "",
	"toUser": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"toPhone": "",
	"fromPhone": "",
	"commodity": {
		"id": 0,
		"type": "",
		"weight": 0,
		"insuranceOrNot": true,
		"notes": ""
	},
	"parcelTrace": "",
	"placeAnOrderTime": "",
	"chooseCourier": "",
	"paymentMethod": "",
	"estimatedCost": "",
	"shippingCode": "",
	"_links": {}
}
```


## executeSearch-shipment-get_1


**接口地址**:`/shipments/search/findByToPhone`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|toPhone||query|false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelShipment|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|id||integer(int32)|integer(int32)|
|fromUser||string||
|toUser||string||
|fromAddressSelect||string||
|fromAddressDetail||string||
|toAddressSelect||string||
|toAddressDetail||string||
|toPhone||string||
|fromPhone||string||
|commodity||Commodity|Commodity|
|&emsp;&emsp;id||integer(int32)||
|&emsp;&emsp;type||string||
|&emsp;&emsp;weight||number(float)||
|&emsp;&emsp;insuranceOrNot||boolean||
|&emsp;&emsp;notes||string||
|parcelTrace||string||
|placeAnOrderTime||string||
|chooseCourier||string||
|paymentMethod||string||
|estimatedCost||string||
|shippingCode||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"id": 0,
	"fromUser": "",
	"toUser": "",
	"fromAddressSelect": "",
	"fromAddressDetail": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"toPhone": "",
	"fromPhone": "",
	"commodity": {
		"id": 0,
		"type": "",
		"weight": 0,
		"insuranceOrNot": true,
		"notes": ""
	},
	"parcelTrace": "",
	"placeAnOrderTime": "",
	"chooseCourier": "",
	"paymentMethod": "",
	"estimatedCost": "",
	"shippingCode": "",
	"_links": {}
}
```


# to-people-entity-controller


## getCollectionResource-topeople-get_1


**接口地址**:`/toPeoples`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-topeople</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page|Zero-based page index (0..N)|query|false|integer||
|size|The size of the page to be returned|query|false|integer||
|sort|Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.|query|false|array|string|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|PagedModelEntityModelToPeople|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|_embedded||PagedModelEntityModelToPeople__embedded|PagedModelEntityModelToPeople__embedded|
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||
|page||PageMetadata|PageMetadata|
|&emsp;&emsp;size||integer(int64)||
|&emsp;&emsp;totalElements||integer(int64)||
|&emsp;&emsp;totalPages||integer(int64)||
|&emsp;&emsp;number||integer(int64)||


**响应示例**:
```javascript
{
	"_embedded": {
		"toPeoples": [
			{
				"toUser": "",
				"toPhone": "",
				"toAddressSelect": "",
				"toAddressDetail": "",
				"_links": {}
			}
		]
	},
	"_links": {},
	"page": {
		"size": 0,
		"totalElements": 0,
		"totalPages": 0,
		"number": 0
	}
}
```


## postCollectionResource-topeople-post


**接口地址**:`/toPeoples`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>create-topeople</p>



**请求示例**:


```javascript
{
  "id": 0,
  "user": "",
  "toUser": "",
  "toPhone": "",
  "toAddressSelect": "",
  "toAddressDetail": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|toPeopleRequestBody|ToPeopleRequestBody|body|true|ToPeopleRequestBody|ToPeopleRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;user|||false|string||
|&emsp;&emsp;toUser|||false|string||
|&emsp;&emsp;toPhone|||false|string||
|&emsp;&emsp;toAddressSelect|||false|string||
|&emsp;&emsp;toAddressDetail|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|201|Created|EntityModelToPeople|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|toUser||string||
|toPhone||string||
|toAddressSelect||string||
|toAddressDetail||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"toUser": "",
	"toPhone": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"_links": {}
}
```


## getItemResource-topeople-get


**接口地址**:`/toPeoples/{id}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-topeople</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelToPeople|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|toUser||string||
|toPhone||string||
|toAddressSelect||string||
|toAddressDetail||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"toUser": "",
	"toPhone": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"_links": {}
}
```


## putItemResource-topeople-put


**接口地址**:`/toPeoples/{id}`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>update-topeople</p>



**请求示例**:


```javascript
{
  "id": 0,
  "user": "",
  "toUser": "",
  "toPhone": "",
  "toAddressSelect": "",
  "toAddressDetail": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|toPeopleRequestBody|ToPeopleRequestBody|body|true|ToPeopleRequestBody|ToPeopleRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;user|||false|string||
|&emsp;&emsp;toUser|||false|string||
|&emsp;&emsp;toPhone|||false|string||
|&emsp;&emsp;toAddressSelect|||false|string||
|&emsp;&emsp;toAddressDetail|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelToPeople|
|201|Created|EntityModelToPeople|
|204|No Content||


**响应状态码-200**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|toUser||string||
|toPhone||string||
|toAddressSelect||string||
|toAddressDetail||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"toUser": "",
	"toPhone": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"_links": {}
}
```


**响应状态码-201**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|toUser||string||
|toPhone||string||
|toAddressSelect||string||
|toAddressDetail||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"toUser": "",
	"toPhone": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"_links": {}
}
```


## deleteItemResource-topeople-delete


**接口地址**:`/toPeoples/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-topeople</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## patchItemResource-topeople-patch


**接口地址**:`/toPeoples/{id}`


**请求方式**:`PATCH`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>patch-topeople</p>



**请求示例**:


```javascript
{
  "id": 0,
  "user": "",
  "toUser": "",
  "toPhone": "",
  "toAddressSelect": "",
  "toAddressDetail": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|toPeopleRequestBody|ToPeopleRequestBody|body|true|ToPeopleRequestBody|ToPeopleRequestBody|
|&emsp;&emsp;id|||false|integer(int32)||
|&emsp;&emsp;user|||false|string||
|&emsp;&emsp;toUser|||false|string||
|&emsp;&emsp;toPhone|||false|string||
|&emsp;&emsp;toAddressSelect|||false|string||
|&emsp;&emsp;toAddressDetail|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelToPeople|
|204|No Content||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|toUser||string||
|toPhone||string||
|toAddressSelect||string||
|toAddressDetail||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"toUser": "",
	"toPhone": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"_links": {}
}
```


# to-people-property-reference-controller


## followPropertyReference-topeople-get_1


**接口地址**:`/toPeoples/{id}/user`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-user-by-topeople-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


## createPropertyReference-topeople-put


**接口地址**:`/toPeoples/{id}/user`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json,application/x-spring-data-compact+json,text/uri-list`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>update-user-by-topeople-Id</p>



**请求示例**:


```javascript
{
  "_embedded": {
    "objects": []
  },
  "_links": {}
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|collectionModelObject|CollectionModelObject|body|true|CollectionModelObject|CollectionModelObject|
|&emsp;&emsp;_embedded|||false|object||
|&emsp;&emsp;_links|||false|Links|Links|
|&emsp;&emsp;&emsp;&emsp;additionalProperty1|||false|Link|Link|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|201|Created|EntityModelUser|
|204|No Content||


**响应状态码-200**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


**响应状态码-201**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


## deletePropertyReference-topeople-delete


**接口地址**:`/toPeoples/{id}/user`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-user-by-topeople-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## createPropertyReference-topeople-patch


**接口地址**:`/toPeoples/{id}/user`


**请求方式**:`PATCH`


**请求数据类型**:`application/x-www-form-urlencoded,application/json,application/x-spring-data-compact+json,text/uri-list`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>patch-user-by-topeople-Id</p>



**请求示例**:


```javascript
{
  "_embedded": {
    "objects": []
  },
  "_links": {}
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|collectionModelObject|CollectionModelObject|body|true|CollectionModelObject|CollectionModelObject|
|&emsp;&emsp;_embedded|||false|object||
|&emsp;&emsp;_links|||false|Links|Links|
|&emsp;&emsp;&emsp;&emsp;additionalProperty1|||false|Link|Link|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||
|&emsp;&emsp;&emsp;&emsp;href|||false|string||
|&emsp;&emsp;&emsp;&emsp;hreflang|||false|string||
|&emsp;&emsp;&emsp;&emsp;title|||false|string||
|&emsp;&emsp;&emsp;&emsp;type|||false|string||
|&emsp;&emsp;&emsp;&emsp;deprecation|||false|string||
|&emsp;&emsp;&emsp;&emsp;profile|||false|string||
|&emsp;&emsp;&emsp;&emsp;name|||false|string||
|&emsp;&emsp;&emsp;&emsp;templated|||false|boolean||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|204|No Content||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


## followPropertyReference-topeople-get


**接口地址**:`/toPeoples/{id}/user/{propertyId}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-user-by-topeople-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|propertyId||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


## deletePropertyReferenceId-topeople-delete


**接口地址**:`/toPeoples/{id}/user/{propertyId}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-user-by-topeople-Id</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|propertyId||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


# to-people-search-controller


## executeSearch-topeople-get


**接口地址**:`/toPeoples/search/deleteById`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||query|false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## executeSearch-topeople-get_1


**接口地址**:`/toPeoples/search/existsById`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||query|false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## executeSearch-topeople-get_2


**接口地址**:`/toPeoples/search/findByUser`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|user||query|false|User|User|
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;gender|可用值:未知,男,女||false|string||
|&emsp;&emsp;email|||false|string||
|&emsp;&emsp;phone|||false|string||
|&emsp;&emsp;address|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelToPeople|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|toUser||string||
|toPhone||string||
|toAddressSelect||string||
|toAddressDetail||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"toUser": "",
	"toPhone": "",
	"toAddressSelect": "",
	"toAddressDetail": "",
	"_links": {}
}
```


# user-entity-controller


## getCollectionResource-user-get_1


**接口地址**:`/users`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-user</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page|Zero-based page index (0..N)|query|false|integer||
|size|The size of the page to be returned|query|false|integer||
|sort|Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.|query|false|array|string|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|PagedModelEntityModelUser|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|_embedded||PagedModelEntityModelUser__embedded|PagedModelEntityModelUser__embedded|
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||
|page||PageMetadata|PageMetadata|
|&emsp;&emsp;size||integer(int64)||
|&emsp;&emsp;totalElements||integer(int64)||
|&emsp;&emsp;totalPages||integer(int64)||
|&emsp;&emsp;number||integer(int64)||


**响应示例**:
```javascript
{
	"_embedded": {
		"users": [
			{
				"password": "",
				"gender": "",
				"email": "",
				"phone": "",
				"address": "",
				"_links": {}
			}
		]
	},
	"_links": {},
	"page": {
		"size": 0,
		"totalElements": 0,
		"totalPages": 0,
		"number": 0
	}
}
```


## postCollectionResource-user-post


**接口地址**:`/users`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>create-user</p>



**请求示例**:


```javascript
{
  "name": "",
  "password": "",
  "gender": "",
  "email": "",
  "phone": "",
  "address": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userRequestBody|UserRequestBody|body|true|UserRequestBody|UserRequestBody|
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;gender|可用值:未知,男,女||false|string||
|&emsp;&emsp;email|||false|string||
|&emsp;&emsp;phone|||false|string||
|&emsp;&emsp;address|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|201|Created|EntityModelUser|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


## getItemResource-user-get


**接口地址**:`/users/{id}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>get-user</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


## putItemResource-user-put


**接口地址**:`/users/{id}`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>update-user</p>



**请求示例**:


```javascript
{
  "name": "",
  "password": "",
  "gender": "",
  "email": "",
  "phone": "",
  "address": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|userRequestBody|UserRequestBody|body|true|UserRequestBody|UserRequestBody|
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;gender|可用值:未知,男,女||false|string||
|&emsp;&emsp;email|||false|string||
|&emsp;&emsp;phone|||false|string||
|&emsp;&emsp;address|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|201|Created|EntityModelUser|
|204|No Content||


**响应状态码-200**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


**响应状态码-201**:


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


## deleteItemResource-user-delete


**接口地址**:`/users/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:<p>delete-user</p>



**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|204|No Content||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## patchItemResource-user-patch


**接口地址**:`/users/{id}`


**请求方式**:`PATCH`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`application/hal+json`


**接口描述**:<p>patch-user</p>



**请求示例**:


```javascript
{
  "name": "",
  "password": "",
  "gender": "",
  "email": "",
  "phone": "",
  "address": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|string||
|userRequestBody|UserRequestBody|body|true|UserRequestBody|UserRequestBody|
|&emsp;&emsp;name|||false|string||
|&emsp;&emsp;password|||false|string||
|&emsp;&emsp;gender|可用值:未知,男,女||false|string||
|&emsp;&emsp;email|||false|string||
|&emsp;&emsp;phone|||false|string||
|&emsp;&emsp;address|||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|204|No Content||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


# user-search-controller


## executeSearch-user-get


**接口地址**:`/users/search/deleteByName`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|name||query|false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## executeSearch-user-get_1


**接口地址**:`/users/search/existsByName`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|name||query|false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## executeSearch-user-get_2


**接口地址**:`/users/search/existsByNameAndPassword`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|name||query|false|string||
|password||query|false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||
|404|Not Found||


**响应参数**:


暂无


**响应示例**:
```javascript

```


## executeSearch-user-get_3


**接口地址**:`/users/search/findByName`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|name||query|false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```


## executeSearch-user-get_4


**接口地址**:`/users/search/findByNameAndPassword`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`application/hal+json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|name||query|false|string||
|password||query|false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|EntityModelUser|
|404|Not Found||


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|password||string||
|gender|可用值:未知,男,女|string||
|email||string||
|phone||string||
|address||string||
|_links||Links|Links|
|&emsp;&emsp;additionalProperty1||Link|Link|
|&emsp;&emsp;&emsp;&emsp;href||string||
|&emsp;&emsp;&emsp;&emsp;hreflang||string||
|&emsp;&emsp;&emsp;&emsp;title||string||
|&emsp;&emsp;&emsp;&emsp;type||string||
|&emsp;&emsp;&emsp;&emsp;deprecation||string||
|&emsp;&emsp;&emsp;&emsp;profile||string||
|&emsp;&emsp;&emsp;&emsp;name||string||
|&emsp;&emsp;&emsp;&emsp;templated||boolean||


**响应示例**:
```javascript
{
	"password": "",
	"gender": "",
	"email": "",
	"phone": "",
	"address": "",
	"_links": {}
}
```