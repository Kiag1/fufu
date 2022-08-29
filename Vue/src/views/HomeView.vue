<template>
  <div style="padding: 10px">
    <div style="margin: 10px 0">
      <el-button style="margin: 5px 10px" type="primary" @click="add">增加</el-button>
    </div>
    <div class="home" style=" margin: 10px 0; padding: 20px">
      <el-table :data="tableData" border style="width: 100%">
        <el-table-column prop="stime" label="时长" width="180"/>
        <el-table-column prop="name" label="姓名" width="180"/>
        <el-table-column prop="sno" label="学号" width="180" sortable/>
        <el-table-column prop="department" label="学院" width="180"/>
        <el-table-column prop="tt" label="日期" width="180"/>
        <el-table-column label="操作"/>
      </el-table>
      <hr class="my-4"/>
      <div class="demo-pagination-block">
        <div class="demonstration"></div>
        <el-pagination
            v-model:currentPage="currentPage4"
            v-model:page-size="pageSize4"
            :page-sizes="[1, 10, 15, 20]"
            :small="small"
            :disabled="disabled"
            :background="background"
            layout="total, sizes, prev, pager, next, jumper"
            :total="100"
            @size-change="handleSizeChange"
            @current-change="handleCurrentChange"
        />
      </div>
      <el-dialog title="" v-model="dialogVisible" width="30%">
        <el-form :model="form" label-width="120px">
          <el-form-item label="姓名">
            <el-input v-model="form.name" style="width: 180px"/>
          </el-form-item>
          <el-form-item label="学院">
          <el-input v-model="form.department" style="width: 180px"/>
          </el-form-item>
          <el-form-item label="学号">
            <el-input v-model="form.sno" style="width: 180px"/>
          </el-form-item>
          <el-form-item label="时长">
            <el-input v-model="form.stime" style="width: 180px"/>
          </el-form-item>
          <el-form-item label="日期">
            <el-input v-model="form.tt" style="width: 180px"/>
          </el-form-item>
        </el-form>
        <template #footer>
        <span class="dialog-footer">
          <el-button @click="dialogVisible = false">取消</el-button>
          <el-button type="primary" @click="save">确定</el-button>
        </span>
        </template>
      </el-dialog>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src

import request from "@/utils/request";
import Axios from "axios"
Axios.defaults.baseURL='/api' //加上该行之后默认的url附带为/api
export default {
  name: 'HomeView',
  components: {},
  data() {
    return {
      form: {},
      dialogVisible: false,
      tableDate: [

      ]
    }
  },
  methods: {
    add() {
      this.dialogVisible = true
      this.from = {}
    },
    open() {
    },
    save() {
        request.post("user", this.from).then(res => {
        console.log(res)
      })
    }
  }
}
</script>
