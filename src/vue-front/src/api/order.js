import request from '@/requestAndSecurity/request'

export default {
    // 1，新增订单
    addOrder(param){
        return request({
            url: '/order/addOrder',
            method: 'post',
            data: param
          })
    },
    // 2.通过快递单号查询订单
    // 待修改
    checkOrderByShipmentCode(param){
        return request({
            url: '/order/checkOrderByShipmentCode/'+ param ,
            method: 'get',
            // params: {
            //     ShipmentCode:param
            // }
          })
    },
    // 3.获取所有订单
    getAllOrders(){
        return request({
            url: '/order/getAllOrders',
            method: 'get',
          })
    },
    // 4.获取单个包裹信息物流
    showOrderDetail(ShipmentCode){
        return request({
            url:'/order/showOrderDetail/{ShipmentCode}',
            method:'get'
        })
    }
}