<script setup lang="ts">

import { getStoreToken } from "@/api/store";
import { computed } from "@vue/reactivity";
import axios from "axios";
// @ts-ignore
import { ElMessage } from "element-plus";
import { result } from "lodash";
import { ref } from "vue";

const token = computed(function () {
    return getStoreToken()
})

function onLogin() {
    axios.post('http://localhost:8080/auth/login', {
        username: 'ZZQ',
        password: '123'
    }).then(function (response) {

        console.log(response);
        
        const reult = response.data

        // @ts-ignore
        if (result.success) {
            ElMessage.success('登陆成功')
        } else {
            // @ts-ignore
            ElMessage.error(result.message)
        }
        
    })
}

</script>

<template>
    <el-button @click="onLogin">login</el-button>
</template>

<style scoped></style>