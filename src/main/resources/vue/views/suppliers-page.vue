<template id="suppliers-page">
  <dashboard-layout>
    <page-header title="New Supplier"></page-header>
    <supplier-form></supplier-form>
    <page-header title="Suppliers"></page-header>
    <supplier-list></supplier-list>
  </dashboard-layout>
</template>
<script>
Vue.component("suppliers-page", {template: "#suppliers-page"});
</script>
<style>

</style>