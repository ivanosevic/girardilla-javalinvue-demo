<template id="side-navbar">
  <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
    <div class="position-sticky pt-3">
      <ul class="nav flex-column">
        <side-navbar-heading name="Main"></side-navbar-heading>
        <side-navbar-item name="Suppliers" to="/suppliers"></side-navbar-item>
        <side-navbar-item name="Wines" to="/suppliers"></side-navbar-item>
        <side-navbar-item name="Orders" to="/suppliers"></side-navbar-item>
        <side-navbar-heading name="Reports"></side-navbar-heading>
        <side-navbar-item name="Sales Last Month" to="/reports/last-month-sales"></side-navbar-item>
      </ul>
    </div>
  </nav>
</template>
<script>
Vue.component("side-navbar", {template: "#side-navbar"});
</script>
<style>
.sidebar {
  position: fixed;
  top: 0;
  /* rtl:raw:
  right: 0;
  */
  bottom: 0;
  /* rtl:remove */
  left: 0;
  z-index: 100; /* Behind the navbar */
  padding: 48px 0 0; /* Height of navbar */
  box-shadow: inset -1px 0 0 rgba(0, 0, 0, .1);
}

@media (max-width: 767.98px) {
  .sidebar {
    top: 5rem;
  }
}

.sidebar-sticky {
  position: relative;
  top: 0;
  height: calc(100vh - 48px);
  padding-top: .5rem;
  overflow-x: hidden;
  overflow-y: auto; /* Scrollable contents if viewport is shorter than content. */
}

.sidebar-heading {
  font-size: .75rem;
  text-transform: uppercase;
}
</style>