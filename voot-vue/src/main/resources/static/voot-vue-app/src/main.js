import { createApp } from 'vue'
import App from './App.vue'

// Bootstrap v.5
import 'bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

// Router
import router from "./router/index"

//Font Awesome
import { library } from '@fortawesome/fontawesome-svg-core'
import { fas } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import { dom } from '@fortawesome/fontawesome-svg-core'

// Internationalization
import { createI18n } from "vue-i18n";
import { DictoI18nConfig } from './i18n.messages.js';

const i18n = createI18n(DictoI18nConfig)

dom.watch();
library.add(fas);

createApp(App)
    .use(i18n)
    .use(router)
    .mount('#app')

export const Dictionaries = i18n;