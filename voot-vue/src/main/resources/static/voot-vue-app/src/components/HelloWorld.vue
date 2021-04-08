<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <p>
      Voot: a handy Spring Boot application template with an unopinionated configurable Vue.js front end
    </p>
    <p class="alert alert-info">Exactly what you were looking for!</p>

    <div>
      <router-link to="/voot-vue/diag">
        <button class="btn btn-success">Click here to see how Vue Router works</button>
      </router-link>
    </div>

  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
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
