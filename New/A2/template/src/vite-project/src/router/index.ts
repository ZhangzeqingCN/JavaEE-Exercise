// @ts-ignore
import { createRouter, createWebHistory, type NavigationGuardNext, type RouteLocationNormalized } from 'vue-router';
// @ts-ignore
import HomeView from '../views/HomeView.vue';
import { getStoreToken } from "@/api/store";

// @ts-ignore


const router = createRouter({
    // @ts-ignore
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: '/',
            name: 'home',
            component: HomeView
        },
        {
            path: '/about',
            name: 'about',
            // route level code-splitting
            // this generates a separate chunk (About.[hash].js) for this route
            // which is lazy-loaded when the route is visited.
            // @ts-ignore
            component: () => import('../views/AboutView.vue')
        },
        {
            path: '/login',
            name: 'login',
            // @ts-ignore
            component: () => import('../views/LoginView.vue')
        },
        {
            path: '/test',
            name: 'test',
            // @ts-ignore
            component: () => import('../views/test/TestView.vue')
        },
        {
            path: '/testToken',
            name: 'testToken',
            // @ts-ignore
            component: () => import('../views/test/TestTokenView.vue')
        },
        {
            path: '/testStore',
            name: 'testStore',
            // @ts-ignore
            component: () => import('../views/test/TestStoreView.vue')
        },
        {
            path: '/testPinia',
            name: 'testPinia',
            // @ts-ignore
            component: () => import('../views/test/TestPiniaView.vue')
        },
        {
            path: '/clearToken',
            name: 'clearToken',
            // @ts-ignore
            component: () => import('../views/test/ClearTokenView.vue')
        },
        {
            path:'/shipmentHome',
            name:'shipmentHome',
            // @ts-ignore
            component: () => import('../views/ShipmentHome.vue')
        }
    ]
});


router.beforeEach(function (to: RouteLocationNormalized, from: RouteLocationNormalized, next: NavigationGuardNext) {
    next();
});


export default router;
