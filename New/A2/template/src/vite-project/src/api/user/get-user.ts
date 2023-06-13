import { request } from "@/api";
import type { User } from "./user";
import type { AxiosResponse } from "axios";



export interface GetUserRes {
    success: boolean;
    message: string;
    data: User;
    errors: Record<string, unknown>[];
}

/** 
 * getUser
 * @returns
 */
export function getUser(): Promise<AxiosResponse<GetUserRes>> {
    return request.get(`/user`);
}