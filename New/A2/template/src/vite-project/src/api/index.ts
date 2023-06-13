import axios from "axios";
import type { AxiosInterceptorOptions, InternalAxiosRequestConfig } from "axios";
import { getStoreToken } from "./store";


export const request = axios.create({
    // most
    baseURL: "http://localhost:8080",
    withCredentials: false,
    xsrfCookieName: 'token'
});

const axiosInterceptorOptions: AxiosInterceptorOptions = {}

request.interceptors.request.use(function (configuration: InternalAxiosRequestConfig): (Promise<InternalAxiosRequestConfig> | InternalAxiosRequestConfig) {
    configuration.headers['token'] = getStoreToken()
    return configuration
}, function (error: any) {
    console.error(error)
}, axiosInterceptorOptions)
