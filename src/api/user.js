import request from '@/requestAndSecurity/request'

export default {
    register(param){
        return request({
            url: '/user/register',
            method: 'post',
            data: param
          })
    },
    login(param){
        return request({
            url: '/user/login',
            method: 'post',
            data: param
        })
    }
}