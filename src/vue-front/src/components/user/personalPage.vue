<template>
  <div class="whole">
    <el-container class="whole">
      <!--  头部区域        -->
      <el-header class="header" style="height: 50px;">
        <div class="header-left">
          <div class="logo-box">
            <div class="logo"><img src="@/assets/images/logo.png" width="40px" height="40px"  class="img"/></div>
            <span class="system-name text">xxx物流运输系统</span>
          </div>
        </div>
        <div class="header-right">
          <div class="header-user-con" >
            <!-- 客服聊天 -->
            <div style="cursor: pointer; font-size: 16px" @click="dialogVisible_contract = true" class="text text-shadow">联系客服</div>
            <el-dialog width="35%" title="联系客服" :visible.sync="dialogVisible_contract">
              <el-form >
                <el-form-item label="客服电话:">13308291127</el-form-item>
                <el-form-item label="工作时间:">工作日8：00 - 17：00</el-form-item>
              </el-form>
              <div slot="footer">
                <el-button type="primary" @click="dialogVisible_contract = false">确 定</el-button>
              </div>
            </el-dialog>
            <!-- 用户头像 -->
            <div class="user-avator"><img src="@/assets/images/R.jpg" /></div>
            <!-- 用户名下拉菜单 -->
            <el-dropdown class="user-name text-shadow " trigger="click" @command="handleCommand" >
                        <span class="el-dropdown-link text" >
                            {{ username }}
                            <i class="el-icon-caret-bottom"></i>
                        </span>
              <el-dropdown-menu slot="dropdown">
                <!--                            <el-dropdown-item  class="text-shadow2">修改密码</el-dropdown-item>-->
<!--                <el-dropdown-item @click.native="personal" class="text-shadow2">个人中心</el-dropdown-item>-->
                <el-dropdown-item @click.native="home" class="text-shadow2">返回主页</el-dropdown-item>
                <el-dropdown-item command="loginout" class="text-shadow2">退出登录</el-dropdown-item>
              </el-dropdown-menu>
            </el-dropdown>
          </div>
        </div>
      </el-header>
      <!--  主要页面        -->
      <el-container class="aside"  >
        <el-main class="main">
          <div style="position: relative;">
            <div>
              <!-- 寄件人信息 -->
              <el-card style="float: left; width:90%; margin-left: 5%; margin-top: 10px">
                <div slot="header" class="clearfix">
                  <span>寄件人信息</span>
                </div>
                <div>
                  <el-table :data="tableDataFrom.slice((currentPage-1)*pageSize,currentPage*pageSize)" style="width: 100%" @selection-change="handleSelectionChange"
                            :header-row-style="{height:'30px'}"
                            :header-cell-style="{background:'#f5f7fa',padding:'0px',textAlign: 'center'}"
                            :row-style="{height:'40px'}" :cell-style="{padding:'0px', textAlign: 'center' }"
                            size='small'
                  >
                    <!-- 表格信息 -->
                    <el-table-column fixed prop="fromPeople" label="寄件人姓名">
                    </el-table-column>
                    <el-table-column prop="fromPhone" label="寄件人电话">
                    </el-table-column>
                    <el-table-column prop="fromAddrSelect" label="寄件人省市区">
                    </el-table-column>
                    <el-table-column prop="fromAddrDetail" label="寄件人详细地址">
                    </el-table-column>
                    <el-table-column label="操作">
                      <template slot-scope="scope">
                        <el-button @click="deleteFrom(scope.row)" type="text" style="flex: auto" size="small" >删除</el-button>
                      </template>
                    </el-table-column>
                  </el-table>
                </div>
              </el-card>
              <!-- 收件人信息 -->
              <el-card style="float: left; width:90%; margin-left: 5%; margin-top: 10px">
                <div slot="header" class="clearfix">
                  <span>收件人信息</span>
                </div>
                <el-table :data="tableDataTo.slice((currentPage-1)*pageSize,currentPage*pageSize)" style="width: 100%" @selection-change="handleSelectionChange"
                          :header-row-style="{height:'30px'}"
                          :header-cell-style="{background:'#f5f7fa',padding:'0px',textAlign: 'center'}"
                          :row-style="{height:'40px'}" :cell-style="{padding:'0px', textAlign: 'center' }"
                          size='small'
                >
                  <!-- 表格信息 -->
                  <el-table-column fixed prop="toPeople" label="收件人姓名">
                  </el-table-column>
                  <el-table-column prop="toPhone" label="收件人电话">
                  </el-table-column>
                  <el-table-column prop="toAddrSelect" label="收件人省市区">
                  </el-table-column>
                  <el-table-column prop="toAddrDetail" label="收件人详细地址">
                  </el-table-column>
                  <el-table-column label="操作">
                    <template slot-scope="scope">
                      <el-button @click="deleteTo(scope.row)" type="text" style="flex: auto" size="small" >删除</el-button>
                    </template>
                  </el-table-column>
                </el-table>
              </el-card>
            </div>
          </div>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
import order from "@/api/order";
import user from "@/api/user";

export default{
  created(){
    this.username = window.sessionStorage.getItem('username')
    this.fetchNewTable()
  },
  provide() {
    return {
      reload: this.reload
    };
  },
  data() {
    return {
      username:'HYT',
      isLogin:true,
      activeName: 'first',
      dialogVisible: false,
      dialogVisible_item: false,
      dialogVisible_contract:false,
      dialogVisible_from:false,
      dialogVisible_to:false,
      currentPage: 1, // 当前页码
      total: 20, // 总条数
      pageSize: 5, // 每页的数据条数
      tableDataFrom:[{
        fromPeople:'yyz',
        fromPhone:'13533490877',
        fromAddrSelect:'北京市海淀区',
        fromAddrDetail:'北下关街道北京交通大学主校区南门'
      },{
        fromPeople:'lw',
        fromPhone:'13533490877',
        fromAddrSelect:'北京市海淀区',
        fromAddrDetail:'北下关街道北京交通大学主校区南门'
      }],
      tableDataTo:[{
        toPeople:'lwt',
        toPhone:'13302490877',
        toAddrSelect:'北京市海淀区',
        toAddrDetail:'北下关街道北京交通大学主校区南门'
      },{
        toPeople:'hyt',
        toPhone:'13793490877',
        toAddrSelect:'北京市海淀区',
        toAddrDetail:'北下关街道北京交通大学主校区南门'
      }]
    };
  },
  methods: {
    // 刷新表格
    fetchNewTable() {
      user.showFromPeople().then(res => {
        console.log("刷新表格")
        if (res.data.success == true) {
          this.tableDataFrom = res.data.data
        }
      })
      user.showToPeople().then(res =>{
        if (res.data.success == true) {
          this.tableDataTo = res.data.data
        }
      })
    },
    // 最上端tab页切换
    handleClick(tab,event){
      console.log(tab,event)
      if(tab.index == 1){
        // 网络请求1，获取所有快递信息
        order.showAll(this.username).then(res =>{
          console.log("获取"+this.username+"名下的全部快递信息")
          if(res.data.success == true) {
            this.tableData == res.data.data
            this.$message({
              message: "查询成功",
              type: "success"
            })
          } else {
            this.$message({
              message: res.data.message,
              type: "error"
            })
            console.log("错误原因: " + res.data.message)
          }
        })
      } else if(tab.index == 2){
        // 网络请求2
      } else{
        // 网络请求3
      }
    },
    // 用户名下拉菜单选择事件
    handleCommand(command) {
      if (command == 'loginout') {
        localStorage.removeItem('ms_username');
        this.$router.push('/login');
      }
    },
    // 返回主页
    home() {
      this.$router.push('/home')
    },
    // 关闭dialog
    handleClose(done) {
      this.$confirm('确认关闭？')
          .then(_ => {
            done();
          })
          .catch(_ => {
          });
    },
    //每页条数改变时触发 选择一页显示多少行
    handleSizeChange(val) {
      console.log(`每页 ${val} 条`);
      this.currentPage = 1;
      this.pageSize = val;
    },
    //当前页改变时触发 跳转其他页
    handleCurrentChange(val) {
      console.log(`当前页: ${val}`);
      this.currentPage = val;
    },
    // 该方法用于删除信息
    deleteFrom(row){
      console.log("触发删除信息，id: " +row.fromPeople)
      user.deleteFrom(row.fromPeople).then(res=>{
        if(res.data.success == true){
          this.fetchNewTable()
          this.$message({
            message:"删除成功",
            type:"success"
          })
        }else{
          this.$message({
            message:"删除异常",
            type:"error"
          })
        }
      })
    },
    deleteTo(row){
      console.log("触发删除信息，id: " +row.toPeople)
      user.deleteFrom(row.fromPeople).then(res=>{
        if(res.data.success == true){
          this.fetchNewTable()
          this.$message({
            message:"删除成功",
            type:"success"
          })
        }else{
          this.$message({
            message:"删除异常",
            type:"error"
          })
        }
      })
    },
  },

}
</script>

<style lang="less" scoped>
/**-----------------------------中间层------------------------------------ */
.search-whole {
  width: 100%;
  height: 250px;
  background-image: url('@/assets/images/团队-2-2.png');
  background-size: cover; /* 使图片平铺满整个浏览器（从宽和高的最大需求方面来满足，会使某些部分无法显示在区域中） */
  // position: absolute; /* 不可缺少 */
  opacity: 0.9;
  // text-align: center;
  display: flex;
  justify-content: center;
  align-items: center;
}
.search {
  height: 100px;
  width: 750px;
  background-color: rgba(206, 223, 247, 0.742);
  border-radius: 20px;
  display: flex;
  justify-content: center;
  align-items: center;

}
.whole {
  height: 100%;
  width: 100%;
}
.main {
  height: 100%;
  width: 100%;
  box-sizing: border-box;
  padding:10px;//设置内部边缘距离
  // position: relative;
  background-color:aliceblue;
}
/* --------------- 左侧导航栏 --------------------- */

.aside {
  height: 100%;
}
/* --------------- 顶层导航栏 --------------------- */
.login-brt:hover{
  color:coral
}
.login-brt {
  color: aliceblue;

}
.text{
  color: aliceblue;
}
.header {
  height: 50px;//在此设置不管用，要在style里
  background-color:  #4481eb;
  // position: relative;//内部元素可以使用 top、bottom、left、right 属性来调整它的位置。
}
/* -------------左-------------*/
.logo-box {
  display: flex;
  align-items: center;
  height: 50px;
}
.system-name {
  margin-left: 10px;
  font-size: medium;
  font-style: italic;
}
.img {
  margin-left: 10px;
  border-radius: 20%;
}
.header-left {
  float: left;
  position: absolute;//相对于最近的已定位祖先元素进行定位。如果没有已定位的祖先元素，则相对于浏览器窗口进行定位
  left: 0px;
}

/* -------------右-------------*/
.header-right {
  float: right;
}
.header-user-con {
  margin-top: 5px;
  display: flex;
  align-items: center;
}
.user-avator {
  margin-left: 20px;
}
.user-avator img {
  display: block;
  width: 40px;
  height: 40px;
  border-radius: 50%;
}
.user-name {
  margin-left: 15px;

}
.el-dropdown-link {
  cursor: pointer;
}
.el-dropdown-menu__item {
  text-align: center;
}
.demo-table-expand {
  font-size: 0;
}
.demo-table-expand label {
  width: 90px;
  color: #99a9bf;
}
.demo-table-expand .el-form-item {
  margin-right: 0;
  margin-bottom: 0;
  width: 50%;
}
</style>