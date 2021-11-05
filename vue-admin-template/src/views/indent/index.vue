<template>
     <div class="dashboard-container">
    <div class="app-container">
      <div class="cont-bod-box">
        <el-table :data="tableData" style="width: 100%">
          <el-table-column type="index" width="50" label="序号"></el-table-column>
          <el-table-column prop="theme" label="主题" sortable></el-table-column>
          <el-table-column prop="customerName" label="对应客户" sortable></el-table-column>
          <el-table-column prop="id" label="订单号" sortable></el-table-column>
          <el-table-column prop="totalMoney" label="总金额" sortable></el-table-column>
          <el-table-column prop="outMoney" label="发货金额" sortable></el-table-column>
          <el-table-column prop="returnedMoney" label="回款金额" sortable></el-table-column>
          <el-table-column prop="state" label="状态" sortable></el-table-column>
          <el-table-column prop="possessor" label="所有者" sortable></el-table-column>
          <el-table-column prop="indentDate" label="开始时间" sortable></el-table-column>
          <el-table-column prop="remark" label="备注" sortable></el-table-column>
          <el-table-column fixed="right" label="操作" align="center" width="100">
            <template slot-scope="scope">
              <router-link :to="{'path':'/social-securitys/detail/' + scope.row.id}" class="el-button el-button--text el-button--small">
                查看
              </router-link>
              <router-link :to="{'path':'/social-securitys/detail/' + scope.row.id}" class="el-button el-button--text el-button--small">
                删除
              </router-link>
            </template>
          </el-table-column>
        </el-table>
        <div class="page-list">
          <el-pagination
            @size-change="onPageSizeChange"
            @current-change="onPageChange"
            background
            :total="Number(total)"
            :page-sizes="[10,20,30,40,50]"
            layout="sizes, prev, pager, next, jumper"
          ></el-pagination>
        </div>
      </div>
    </div>
  </div>
 
</template>

<script>
import {getList} from "@/api/indent"

export default {
    data() {
        return {
            tableData:[],
            total: 100,
            selectParams:{}
        }
    },
    methods: {
        async init(){
            let{
                pageNum,
                pageSize,
                keyword,
                state,
                classify,
                customerName,
                possessor
            } = this.selectParams
            const {data:ListRes} = await getList({
                pageNum:pageNum,
                pageSize:pageSize,
                keyword:keyword,
                state:state,
                classify: classify,
                customerName: customerName,
                possessor: possessor 
            })
            this.tableData =ListRes.list
            this.total =ListRes.total
        },
        onPageSizeChange(pageSize){
            this.selectParams.pageSize = pageSize
            this.init()
        },
        onPageChange(page){
            this.selectParams.pageNum =page
            this.init()
        }
    },
    created(){
        this.selectParams.pageNum = 1
        this.selectParams.pageSize = 10
        this.init()
     },
    activated(){
        this.init()
    }
}
</script>

<style>
.cont-bod-box {
  padding: 20px;
  background: #fff;
  border-radius: 3px;
  margin-top: 15px;
  margin-bottom: 15px;
  border: 1px solid #ebeef5;
}
.page-list {
  text-align: center;
  margin-top: 10px;
}
</style>
