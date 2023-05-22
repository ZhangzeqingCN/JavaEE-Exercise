import Vue from 'vue'
import VueRouter from 'vue-router'
import loginAndRegister from '@/components/user/loginAndRegister.vue'
import Home from '@/components/order/Home.vue'

Vue.use(VueRouter)

const routes = [
  { path: '/welcome', component: Home},
//   { path: '/login', component: Login ,},
//   { path: '/register', component: Register },
  { path: '/', redirect: '/welcome' },
  { path: '/loginAndRegister', component: loginAndRegister}
//   {
//     path: '/home',
//     component: Home,
//     redirect: '/HomePage',
//     children: [
//       // 写子路由  显示在主区域
//       { path: '/enter', component: Enter },
//       { path: '/outer', component: Outer },
//       { path: '/personalPage', component: User},
//       { path: '/company', component: Company},
//       { path: '/addNewIn', component: addIn},
//       { path: '/outStock', component: outStock},
//       { path: '/area', component: Area},
//       { path: '/shelf', component: Shelf},
//       { path: '/parcel', component: Parcel},
//       { path: '/data', component: data},
//       { path: '/inStock', component: inStock },
//       { path: '/HomePage', component: HomePage}
//     ]
//   }
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