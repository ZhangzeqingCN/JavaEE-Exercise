import {createRouter, createWebHistory} from 'vue-router'
// @ts-ignore
import HomeView from '../views/HomeView.vue'

// @ts-ignore

const router = createRouter({
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
        }
    ]
})

export default router
