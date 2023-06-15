import request from '@/requestAndSecurity/request'

export default {

    // 1.注册
    register(param){
        return request({
            url: '/auth/register',
            method: 'post',
            data: param
          })
    },

    // 2.登陆
    login(param){
        return request({
            url: '/auth/login',
            method: 'post',
            data: param
        })
    }
}