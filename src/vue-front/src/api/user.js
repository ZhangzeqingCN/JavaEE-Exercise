import request from '@/requestAndSecurity/request'

export default {
    // 1.保存寄件人信息
    saveFrom(param){
        return request({
            url:'/auth/saveFrom',
            method:'post',
            data:param
        })
    },
    // 2.保存收件人信息
    saveTo(param){
        return request({
            url:'/auth/saveTo',
            method:'post',
            data:param
        })
    },
    // 3.获取所有寄件人信息
    showFromPeople(){
        return request({
            url:'/auth/showFromPeople',
            method:'get'
        })
    },
    // 4.获取所有收件人信息
    showToPeople(){
        return request({
            url:'/auth/showToPeople',
            method:'get'
        })
    },
    // 5.删除寄件人信息
    deleteFrom(data){
        return request({
            url:'/auth/deleteFrom',
            method:'delete',
            data:data
        })
    },
    // 6.删除收件人信息
    deleteTo(data){
        return request({
            url:'/auth/deleteTo',
            method:'delete',
            data:data
        })
    }
}