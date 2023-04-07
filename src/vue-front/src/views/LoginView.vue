<template>
  <div class="login-container">
    <el-card class="login-card" shadow="hover">
      <div class="logo">
        <!--        <img src="./assets/logo.png" alt="logo"/>-->
        <h1>物流系统</h1>
      </div>
      <el-form label-width="80px" class="login-form" :model="form" :rules="rules" ref="form">
        <el-form-item label="用户名" prop="username">
          <el-input v-model="form.username" placeholder="请输入用户名"></el-input>
        </el-form-item>
        <el-form-item label="密码" prop="password">
          <el-input type="password" v-model="form.password" placeholder="请输入密码"></el-input>
        </el-form-item>
        <el-input prefix-icon="user" class="input-with-icon" v-model="form.password" placeholder="请输入内容">
        </el-input>
        <el-form-item>
          <el-button type="primary" @click="login">登录</el-button>
        </el-form-item>
      </el-form>
    </el-card>
  </div>
</template>

<script>
import {defineComponent} from 'vue'
import {ElButton, ElCard, ElForm, ElFormItem, ElInput} from 'element-plus'
import {Search} from "@element-plus/icons-vue";

export default defineComponent({
  components: {
    Search,
    ElForm,
    ElFormItem,
    ElInput,
    ElButton,
    ElCard,
  },
  data() {
    return {
      form: {
        username: '',
        password: '',
      },
      rules: {
        username: [{required: true, message: '请输入用户名', trigger: 'blur'}],
        password: [{required: true, message: '请输入密码', trigger: 'blur'}],
      },
    }
  },
  methods: {
    login() {
      this.$refs.form.validate(valid => {
        if (valid) {
          // 在这里实现登录逻辑
          console.log('登录成功')
        } else {
          console.log('验证失败')
        }
      })
    },
  },
})
</script>

<style scoped>
.login-container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100%;
  background-color: #f5f5f5;
}

.login-card {
  width: 400px;
}

.logo {
  display: flex;
  justify-content: center;
  align-items: center;
  margin-bottom: 20px;

img {
  width: 64px;
  height: 64px;
  margin-right: 10px;
}

h1 {
  font-size: 32px;
}

}

.login-form {
  max-width: 300px;
  margin: 0 auto;
}

.el-button {
  width: 100%;
}
</style>
