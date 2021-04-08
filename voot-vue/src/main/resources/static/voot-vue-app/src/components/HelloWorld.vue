<template>
  <div class="container">
    <h1>{{ msg }}</h1>
    <p>
      {{ $t("misc.desc_1") }}
    </p>
    <p class="alert alert-info">
      <i class="fas fa-cogs"></i>
      Exactly what you were looking for!
      <i class="fas fa-cogs"></i>
    </p>

    <div class="row">
      <router-link to="/voot-vue/diag">
        <button class="btn btn-success">
          Click here to see how Vue Router works
        </button>
      </router-link>
    </div>
  </div>
</template>

<script>
import { Dictionaries } from "../main.js";

export default {
  name: "HelloWorld",
  props: {
    msg: String,
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
