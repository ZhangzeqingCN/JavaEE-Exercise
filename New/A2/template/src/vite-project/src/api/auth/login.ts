import type { AxiosResponse } from "axios";
import { request } from "@/api";

// 参数接口
export interface LoginParams {
    username: string;
    password: string;
}

// 响应接口
export interface LoginRes {
    success: boolean;
    message: string;
    data: {
        token: string;
        refreshToken: string;
    };
    errors: Record<string, unknown>[];
}

/** 
 * login
 * @param {object} params LoginDomain
 * @param {string} params.username username
 * @param {string} params.password password
 * @returns
 */
export function login(params: LoginParams): Promise<AxiosResponse<LoginRes>> {
    return request.post(`/auth/login`, params);
}