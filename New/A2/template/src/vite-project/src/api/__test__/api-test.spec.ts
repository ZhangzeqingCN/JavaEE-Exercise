import { assert, describe, it } from "vitest";

import { getTestMessage } from "@/api/test";

import type { GetTestMessageRes } from "@/api/test";
import type { AxiosResponse } from "axios";

describe('api-test', function () {
    it.concurrent('输出', async function () {
        const response: AxiosResponse<GetTestMessageRes> = await getTestMessage()
        const result: GetTestMessageRes = response.data
        console.log(result)
    });
})