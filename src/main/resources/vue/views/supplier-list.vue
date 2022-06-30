<template id="supplier-list">
  <section>
    <div v-if="suppliers.loading">
      <h2 class="text-center">Loading suppliers ...</h2>
    </div>
    <div v-if="suppliers.loadError">
      <h2 class="text-center">Failed to load suppliers ({{suppliers.loadError.text}})</h2>
    </div>
    <div v-if="suppliers.loaded">
      <div class="table-responsive">
        <table class="table table-striped table-sm">
          <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Fullname</th>
            <th scope="col">Email</th>
            <th scope="col">Delivery Time</th>
          </tr>
          </thead>
          <tbody>
          <tr v-for="supplier in suppliers.data">
            <td>{{ supplier.id }}</td>
            <td>{{ supplier.fullname }}</td>
            <td>{{ supplier.email }}</td>
            <td>{{ supplier.deliveryTime }}</td>
          </tr>
          </tbody>
        </table>
      </div>
    </div>
  </section>
</template>
<script>
Vue.component("supplier-list", {
  template: "#supplier-list",
  data: () => ({
    suppliers: new LoadableData("/api/suppliers"),
  })
});
</script>
<style>

</style>