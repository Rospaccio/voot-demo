import { createApp } from 'vue'
import App from './App.vue'

// Bootstrap v.5
import 'bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

// Router
import router from "./router/index"

//Font Awesome
import { library } from '@fortawesome/fontawesome-svg-core'
import {fas} from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import { dom } from '@fortawesome/fontawesome-svg-core'

dom.watch();
library.add(fas);

createApp(App)
    .use(router)
    .mount('#app')
