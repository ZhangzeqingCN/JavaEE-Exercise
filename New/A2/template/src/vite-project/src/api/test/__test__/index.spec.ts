import { assert, beforeAll, describe, it } from "vitest";

import {  getGreetMessageWithHeadersToken, getGreetMessageWithUsernameAttribute, getTestMessage } from "@/api/test";

import type { GetTestMessageRes } from "@/api/test";
import type { AxiosResponse } from "axios";
import { setStoreToken } from "@/api/store";

const testToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhdXRoZW50aWNhdGlvbiIsInQtdXNlcm5hbWUiOiJaWlEiLCJpc3MiOiJpc3N1ZXIiLCJleHAiOjM4MzQwNjU1NDYsImlhdCI6MTY4NjU4MTg5OX0.YlalGUUUR1bnz4u1ZRA_l8NCqOgXCV17P3sTuGCYoN8";

describe('api-test', function () {
    beforeAll(function () {
        setStoreToken(testToken)
    })

    it.concurrent('getTestMessage', async function () {
        const response: AxiosResponse<GetTestMessageRes> = await getTestMessage()
        const result: GetTestMessageRes = response.data
        console.log(result)
    });

    it('getGreetMessageWithHeadersToken', async function () {
        const response = await getGreetMessageWithHeadersToken()
        console.log(response.data);
    })

    it('getGreetMessageWithUsernameAttribute', async function () {
        const response = await getGreetMessageWithUsernameAttribute()
        console.log(response.data);
    })
})