import request from '@/requestAndSecurity/request'

export default {

    register(param){
        return request({
            url: '/register',
            method: 'post',
            data: param
          })
    },

    login(param){
        return request({
            url: '/login',
            method: 'post',
            data: param
        })
    }
}