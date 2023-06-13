import { describe, test, assert } from "vitest";
import router from "..";


const testToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9";

describe('test-session', function () {
    test('set session token', function () {
        sessionStorage.setItem('token', testToken);
    });

    test('get session token', function () {
        const token = sessionStorage.getItem('token');
        assert(() => token === testToken)
    });

    test('router结构', function () {
        router.getRoutes().forEach(function(value,index){
            console.log(index,value);
        });
    });
});
