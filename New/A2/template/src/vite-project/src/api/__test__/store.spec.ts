import { describe, test, assert } from "vitest";


const testToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9";

describe('store', function () {
    test('set session token', function () {
        sessionStorage.setItem('token', testToken);
    });

    test('get session token', function () {
        const token = sessionStorage.getItem('token');
        console.log(token);
        assert.equal(token, testToken)
    });
});
