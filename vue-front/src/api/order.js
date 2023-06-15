import request from '@/requestAndSecurity/request'

export default {
    create(param){
        return request({
            url: '/shippingOrder/create',
            method: 'post',
            data: param
          })
    },
    retrieve(){
        return request({
            url: '/shippingOrder/retrieve',
            method: 'get',
            
          })
    },
    showAll(param){
        return request({
            url: '/shippingOrder/showAll',
            method: 'get',
          })
    },
}