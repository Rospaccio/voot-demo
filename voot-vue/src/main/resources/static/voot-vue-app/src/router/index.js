import { createWebHistory, createRouter } from "vue-router";
import HelloWorld from "../components/HelloWorld";
import Diagnostic from "../components/Diagnostic";

const routes = [
    {
        path: "/",
        name: "HelloWorld",
        component: HelloWorld
    },
    {
        path: "/diag",
        name :"Diagnostic",
        component: Diagnostic
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;