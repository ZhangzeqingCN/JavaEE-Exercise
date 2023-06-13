import { describe, test } from "vitest";


const testToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9";

describe('test-session', function () {
    test('set session token', function () {
        sessionStorage.setItem('token', testToken);
    });

    test('get session token', function () {
        const token = sessionStorage.getItem('token');
    });
});
