import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import '@/assets/background/padding.css'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import {ArrowDown} from "@element-plus/icons";
import zhCn from 'element-plus/es/locale/lang/zh-cn'



createApp(App).use(store).use(router).use(ElementPlus).mount('#app').use(ElementPlus, {
    locale: zhCn,
})

