<template id="dashboard-layout">
  <section class="dashboard-layout">
    <top-navbar></top-navbar>
    <div class="container-fluid">
      <div class="row">
        <side-navbar></side-navbar>
        <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
          <slot></slot>
        </main>
      </div>
    </div>
  </section>
</template>
<script>
Vue.component("dashboard-layout", {template: "#dashboard-layout"});
</script>
<style>
body {
  font-size: .875rem;
}
</style>