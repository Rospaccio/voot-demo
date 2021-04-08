import { createWebHistory, createRouter } from "vue-router";
import HelloWorld from "../components/HelloWorld";
import Diagnostic from "../components/Diagnostic";

const routes = [
    {
        path: "/voot-vue",
        name: "HelloWorld",
        component: HelloWorld
    },
    {
        path: "/voot-vue/diag",
        name :"Diagnostic",
        component: Diagnostic
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;