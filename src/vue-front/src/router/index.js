import Vue from 'vue'
import VueRouter from 'vue-router'
import loginAndRegister from '@/components/user/loginAndRegister.vue'
import Home from '@/components/order/Home.vue'
import personalPage from "@/components/user/personalPage.vue"

Vue.use(VueRouter)

const routes = [
  { path: '/Home', component: Home},
  { path: '/', redirect: '/loginAndRegister' },
  { path: '/loginAndRegister', component: loginAndRegister},
  { path: '/personalPage',component: personalPage }
]

const router = new VueRouter({
  routes
})

// 路由守卫
// router.beforeEach((to, from, next) => {
//   if(to.path == '/loginAndRegister'|| to.path == '/welcome' || to.path  == '/'){
//       next()
//   }else {
//     // let token = JSON.parse(window.localStorage.getItem("Token"))
//     let token = localStorage.getItem('token')
//     console.log(token)
//     if (  token == null || token === '' ){
//       alert("请先进行登录操作")
//       next('/loginAndRegister')
//     }else {
//       next()
//     }
//   }
// })
export default router