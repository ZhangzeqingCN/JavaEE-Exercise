<script setup lang="ts">

import { login } from "@/api/auth/login";
import { getStoreToken, setStoreToken } from "@/api/store";
import router from "@/router";
// @ts-ignore
import { ElMessage } from 'element-plus';
import { onMounted, ref } from "vue";

const username = ref("")
const password = ref("")

function onLogin() {
    login({
        username: username.value,
        password: password.value
    }).then(function (response) {
        const result = response.data
        if (result.success) {
            ElMessage.success('登陆成功');
            setStoreToken(result.data.token);
        } else {
            ElMessage.error(result.message);
        }
    }).catch(function (e) {
        console.error(e);
    })
}

onMounted(function () {
    const token = getStoreToken();
    if (token) {
        ElMessage.success('您已登录，可直接跳转到主页');
        // router.push('/');
    } else {
        ElMessage.success('Welcome');
    }
});

</script>
<template>
    <div class="container">
        <div class="login-box">
            <h1>Login</h1>
            <div>
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input v-model="username" type="text" id="username" name="username" />
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input v-model="password" type="password" id="password" name="password" />
                </div>
                <button @click="onLogin">Login</button>
            </div>
        </div>
    </div>
</template>

<style scoped>
.container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 60vh;
    background-color: #f5f5f5;
    color: #181818;
}

.login-box {
    width: 400px;
    background-color: #fff;
    border-radius: 5px;
    padding: 30px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
}

h1 {
    text-align: center;
    margin-bottom: 20px;
}

.form-group {
    margin-bottom: 20px;
}

label {
    display: block;
    margin-bottom: 5px;
}

input {
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    font-size: 16px;
    outline: none;
}

button {
    display: block;
    width: 100%;
    padding: 10px;
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    cursor: pointer;
}
</style>