<script setup lang="ts">
import { getStoreToken, clearStoreToken } from '@/api/store';
import { computed } from '@vue/reactivity';
import { onMounted, ref } from 'vue';


const token = ref("")

function refreshToken() {
    const m = getStoreToken();
    token.value = m ? m : 'null'
}

onMounted(refreshToken)

function clear() {
    clearStoreToken()
    refreshToken()
}

</script>


<template>
    <div>{{ token }}</div>
    <el-button @click="clear">Clear Token</el-button>
</template>