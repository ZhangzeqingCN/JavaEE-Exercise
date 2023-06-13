const storeTokenKey = 'ZZQ-vite-project-token';

/**
 * 
 * @param token 存储在localStorage中的token
 */
export function setStoreToken(token: string) {
    localStorage.setItem(storeTokenKey, token)
}

/**
 * 
 * @returns 存储在localStorage中的token
 */
export function getStoreToken(): string | null {
    return localStorage.getItem(storeTokenKey)
}
export function clearStoreToken() {
    localStorage.removeItem(storeTokenKey)
}