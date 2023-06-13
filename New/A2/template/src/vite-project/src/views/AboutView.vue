<script setup lang="ts">
import { useCounterStore } from '@/stores/counter';
import { storeToRefs } from 'pinia';
import { watch } from 'vue';

const counterStore = useCounterStore();

const { count, doubleCount } = storeToRefs(counterStore);

watch(() => count, function (newValue, oldValue) {
  console.log(oldValue, "=>", newValue);
})

</script>


<template>
  <div>{{ count }}</div>
  <el-button @click="count++">+</el-button>
  <el-button @click="count--">-</el-button>
  <div class="about">
    <h1>This is an about page</h1>
  </div>
</template>

<style>
@media (min-width: 1024px) {
  .about {
    min-height: 100vh;
    display: flex;
    align-items: center;
  }
}
</style>
