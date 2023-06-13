<script setup lang="ts">
import { useCounterStore } from '@/stores/counter';
import { storeToRefs } from 'pinia';

const counterStore = useCounterStore();

const { count, doubleCount } = storeToRefs(counterStore);

</script>

<template>
    <div>Hello</div>
    <label>{{ count }}</label>
    <el-button @click="count++">+</el-button>
    <el-button @click="count--">-</el-button>
    <el-button @click="counterStore.increment()">increment()</el-button>
</template>

<style scoped></style>