<template>
    <Header/>

  <div style="display: flex">
    <Side/>
    <div>
      <router-view style="flex: 1"/>
    </div>
  </div>


</template>

<style>

</style>

<script >
import Header from "@/components/Header";
import Side from "@/components/Side";
import {ArrowDown} from "@element-plus/icons";

export default {
  name: "layout",
  components:{
   Header,
    Side,
    ArrowDown
  }
}
</script>