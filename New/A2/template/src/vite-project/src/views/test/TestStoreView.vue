<script setup lang="ts">

import { ref } from "vue";

const sessionStorageMessage = ref("sessionStorageMessage")

function getSessionStorageMessage() {
    const m = sessionStorage.getItem('message');
    if (m) {
        sessionStorageMessage.value = m;
    }
}

function setSessionStorageMessage() {
    sessionStorage.setItem('message', sessionStorageMessage.value)
}


const localStorageMessage = ref("localStorageMessage")

function setLocalStorageMessage() {
    localStorage.setItem('message', localStorageMessage.value)
}

function getLocalStorageMessage() {
    const m = localStorage.getItem('message');
    if (m) {
        localStorageMessage.value = m;
    }
}

</script>

<template>
    <div>
        <h1>sessionStorage</h1>
        <label>{{ sessionStorageMessage }}</label>
        <el-input v-model="sessionStorageMessage"></el-input>
        <el-button @click="setSessionStorageMessage">setSessionStorageMessage</el-button>
        <el-button @click="getSessionStorageMessage">getSessionStorageMessage</el-button>
    </div>

    <div>
        <h1>localStorage</h1>
        <label>{{ localStorageMessage }}</label>
        <el-input v-model="localStorageMessage"></el-input>
        <el-button @click="setLocalStorageMessage">setSessionStorageMessage</el-button>
        <el-button @click="getLocalStorageMessage">getSessionStorageMessage</el-button>
    </div>
</template>

<style scoped></style>