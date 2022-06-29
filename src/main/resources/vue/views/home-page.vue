<template id="home-page">
  <section class="home-page">
    <top-navbar></top-navbar>
    <div class="container-fluid">
      <div class="row">
        <side-navbar></side-navbar>
      </div>
    </div>
  </section>
</template>
<script>
Vue.component("home-page", {template: "#home-page"});
</script>
<style>
.hello-world {
  color: goldenrod;
}
</style>