<template id="side-navbar-item">
  <li class="nav-item">
    <a class="nav-link" v-bind:href="to">
      <span data-feather="file"></span>
      {{ name }}
    </a>
  </li>
</template>
<script>
Vue.component("side-navbar-item", {
  template: "#side-navbar-item",
  props: {
    name: String,
    to: String
  }
});
</script>
<style>
.nav-link {
  font-weight: 500;
  color: #333;
}

.nav-link .feather {
  margin-right: 4px;
  color: #727272;
}

.nav-link.active {
  color: #2470dc;
}

.nav-link:hover .feather,
.nav-link.active .feather {
  color: inherit;
}
</style>