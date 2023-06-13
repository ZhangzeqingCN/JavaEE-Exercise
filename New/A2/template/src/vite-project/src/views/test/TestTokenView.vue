<script setup lang="ts">

import { getStoreToken } from "@/api/store";
import { computed } from "@vue/reactivity";
import { ref } from "vue";

const token = computed(function () {
    return getStoreToken()
})

</script>

<template>
    <div>{{ token }}</div>
</template>

<style scoped></style>