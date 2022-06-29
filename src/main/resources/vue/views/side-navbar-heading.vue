<template id="side-navbar-heading">
  <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
    <span>{{ name }}</span>
  </h6>
</template>
<script>
Vue.component("side-navbar-heading", {
  template: "#side-navbar-heading",
  props: {
    name: String
  }
});
</script>
<style>
.sidebar-heading {
  font-size: .75rem;
  text-transform: uppercase;
}
</style>