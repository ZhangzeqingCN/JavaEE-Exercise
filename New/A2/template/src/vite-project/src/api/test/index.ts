// 响应接口
import { request } from "@/api";
import axios, { type AxiosResponse } from "axios";

export interface GetTestMessageRes {
    success: boolean;
    message: string;
    data: string;
    errors: Record<string, unknown>[];
}

/**
 * getTestMessage
 * @returns
 */
export function getTestMessage(): Promise<AxiosResponse<GetTestMessageRes>> {
    return request.get(`/test`);
}

// 参数接口

// 响应接口
export interface GetGreetMessageWithHeadersTokenRes {
    success: boolean;
    message: string;
    data: string;
    errors: Record<string, unknown>[];
  }
  
  /** 
   * getGreetMessageWithHeadersToken
   * @returns
   */
  export function getGreetMessageWithHeadersToken(): Promise<AxiosResponse<GetGreetMessageWithHeadersTokenRes>> {
    return request.get(`/test/getGreetMessageWithHeadersToken`);
  }

  // 响应接口
export interface GetGreetMessageWithUsernameAttributeRes {
    success: boolean;
    message: string;
    data: string;
    errors: Record<string, unknown>[];
  }
  
  /** 
   * getGreetMessageWithUsernameAttribute
   * @returns
   */
  export function getGreetMessageWithUsernameAttribute(): Promise<AxiosResponse<GetGreetMessageWithUsernameAttributeRes>> {
    return request.get(`/test/getGreetMessageWithUsernameAttribute`);
  }