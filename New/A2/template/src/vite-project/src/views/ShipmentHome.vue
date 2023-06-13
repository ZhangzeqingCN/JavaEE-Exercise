<template>
    <div class="whole">
        <el-container class="whole">
            <el-header class="header" style="height: 50px;">
                <div class="header-left">
                    <div class="logo-box">
                        <div class="logo"><img src="@/assets/images/logo.png" width="40px" height="40px" class="img" />
                        </div>
                        <span class="system-name text">xxx物流运输系统</span>
                    </div>

                </div>
                <div class="header-right">
                    <div class="header-user-con">
                        <!-- 客服聊天 -->
                        <div style="cursor: pointer; font-size: 16px" @click="contact" class="text text-shadow">联系客服</div>
                        <!-- 用户头像 -->
                        <div class="user-avator"><img src="@/assets/images/R.jpg" /></div>
                        <!-- 用户名下拉菜单 -->
                        <el-dropdown class="user-name text-shadow " trigger="click" @command="handleCommand">
                            <span class="el-dropdown-link text">
                                {{ username }}
                                <i class="el-icon-caret-bottom"></i>
                            </span>
                            <el-dropdown-menu slot="dropdown">
                                <el-dropdown-item class="text-shadow2">修改密码</el-dropdown-item>
                                <el-dropdown-item @click.native="personal" class="text-shadow2">个人中心</el-dropdown-item>
                                <el-dropdown-item @click.native="personal" class="text-shadow2">管理寄/收件人信息</el-dropdown-item>
                                <el-dropdown-item command="loginout" class="text-shadow2">退出登录</el-dropdown-item>
                            </el-dropdown-menu>
                        </el-dropdown>
                    </div>
                    <!-- <div class="header-user-con" v-else>
                    <el-button type="text" class="login-brt" style="margin-right: 10px;color: aliceblue;">关于我们</el-button>
                    <i class="el-icon-question login-brt" style="margin-right: 10px;"></i>
                    <el-button type="text"  class="login-brt" @click="login">登录</el-button>
                    <el-button type="text" class="login-brt" @click="register">注册</el-button>
                </div> -->
                </div>
            </el-header>
            <el-container class="aside">
                <el-main class="main">
                    <div style="position: relative;">
                        <div>
                            <el-tabs v-model="activeName" @tab-click="handleClick">
                                <el-tab-pane label="物流追踪" name="first">
                                    <div class="search-whole">
                                        <div class="search">
                                            <span style="margin-right: 10px;font-weight: 550;">快递单号</span>
                                            <el-input style="width: 300px;margin-right: 10px;"
                                                v-model="parcelID"></el-input>
                                            <!-- <el-button icon="el-icon-search" circle></el-button> -->
                                            <!-- <span style="margin-right: 10px;font-weight: 550;">承运商</span>
                        <el-select v-model="carrier" placeholder="请选择">
                            <el-option
                            v-for="item in options"
                            :key="item.value"
                            :label="item.label"
                            :value="item.value">
                            </el-option>
                        </el-select> -->
                                            <el-button icon="el-icon-search" circle style="margin-left:10px"></el-button>
                                        </div>
                                    </div>
                                    <div>
                                        <div>
                                            <el-table
                                                :data="tableData.slice((currentPage - 1) * pageSize, currentPage * pageSize)"
                                                style="width: 100%" @selection-change="handleSelectionChange"
                                                :header-row-style="{ height: '30px' }"
                                                :header-cell-style="{ background: '#f5f7fa', padding: '0px', textAlign: 'center' }"
                                                :row-style="{ height: '40px' }"
                                                :cell-style="{ padding: '0px', textAlign: 'center' }" size='small'>
                                                <!--排序、操作按钮、下拉详情tableData.slice((currentPage-1)*pageSize,currentPage*pageSize)-->
                                                <el-table-column type="expand">
                                                    <template slot-scope="props">
                                                        <el-form label-position="left" inline class="demo-table-expand">
                                                            <el-form-item label="物流信息">
                                                                <span>{{ props.row.parcelTrace }}</span>
                                                            </el-form-item>
                                                        </el-form>
                                                    </template>
                                                </el-table-column>
                                                <el-table-column prop="id" label="运输单号">
                                                </el-table-column>
                                                <el-table-column prop="fromUser" label="发件人">
                                                </el-table-column>
                                                <el-table-column prop="fromPhone" label="发件人电话">
                                                </el-table-column>
                                                <el-table-column prop="fromAddress" label="发货地址"></el-table-column>
                                                <el-table-column prop="toUser" label="收件人">
                                                </el-table-column>
                                                <el-table-column prop="toPhone" label="收件人电话">
                                                </el-table-column>
                                                <el-table-column prop="toAddress" label="收货地址">
                                                </el-table-column>
                                                <!-- <el-table-column prop="carrier"  label="承运商" >
                                </el-table-column>
                                <el-table-column prop="cost" label="运费" >
                                </el-table-column> -->
                                                <el-table-column prop="weight" label="重量(kg)">
                                                </el-table-column>
                                                <el-table-column prop="volume" label="体积(平方米)">
                                                </el-table-column>
                                            </el-table>
                                            <el-pagination align='center' @size-change="handleSizeChange"
                                                @current-change="handleCurrentChange" :current-page="currentPage"
                                                :page-sizes="[5, 10, 20]" :page-size="pageSize"
                                                layout="total, sizes, prev, pager, next, jumper" :total="tableData.length"
                                                style="margin-top: 7px;">
                                            </el-pagination>
                                        </div>
                                    </div>
                                </el-tab-pane>
                                <el-tab-pane label="我要寄件" name="second">
                                    <div>
                                        <el-form :model="parcel" ref="parcel" :rules="rules"
                                            style="padding: 0px; height: 300px; " label-width="90px">
                                            <div>
                                                <div style="  display: flex;
                                                justify-content: center;
                                                align-items: center;">

                                                    <!-- <el-form-item label-width="70px" prop="parcelID" style="margin-top: 0%; display: inline-block;">
                <span slot="label"  style="color: #403b3b;font-size: 16px;">承运商</span>
                <el-select v-model="parcel.carrier" placeholder="请选择">
                    <el-option
                    v-for="item in options"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value">
                    </el-option>
                </el-select>
                </el-form-item> -->
                                                    <el-form-item label-width="200px"
                                                        style="width: 300px;margin-top: 0%; display: inline-block;">
                                                        <span slot="label"
                                                            style="color: #403b3b;font-size: 16px;">包裹重量(kg单位)</span>
                                                        <el-input v-model="parcel.weight" autocomplete="off"></el-input>

                                                    </el-form-item>
                                                    <el-form-item label-width="200px"
                                                        style="width: 300px;margin-top: 0%; display: inline-block;">
                                                        <span slot="label"
                                                            style="color: #403b3b;font-size: 16px;">包裹体积(平方米单位)</span>
                                                        <el-input v-model="parcel.volume" autocomplete="off"></el-input>

                                                    </el-form-item>
                                                </div>
                                                <el-card style="float: left; width: 450px;margin-left: 100px;">
                                                    <div slot="header" class="clearfix">
                                                        <span>寄件人信息</span>
                                                        <el-button style="float: right; padding: 3px 0"
                                                            type="text">保存寄件人</el-button>
                                                    </div>

                                                    <el-form-item label="发货人" style="margin: 13px;">
                                                        <el-input v-model="parcel.fromPeople" placeholder="姓名（校验是否要中文）"
                                                            autocomplete="off"></el-input>
                                                    </el-form-item>
                                                    <el-form-item label="发货人电话" style="margin: 13px;">
                                                        <el-input v-model="parcel.fromPhone" autocomplete="off"></el-input>
                                                    </el-form-item>
                                                    <el-form-item label="省/s市/区"
                                                        style="margin: 13px;"><!-- :options="options"-->
                                                        <el-cascader :options="optionsCity" v-model="parcel.fromAddrSelect"
                                                            @change="handleChange">
                                                        </el-cascader>
                                                    </el-form-item>
                                                    <el-form-item label="详细地址" style="margin: 13px;margin-top: 18px;">
                                                        <el-input v-model="parcel.fromAddrDetail" autocomplete="off"
                                                            type="textarea"></el-input>
                                                    </el-form-item>
                                                </el-card>

                                                <el-card style="float:right;width: 450px;margin-right: 100px;">
                                                    <div slot="header" class="clearfix">
                                                        <span>收件人信息</span>
                                                        <el-button style="float: right; padding: 3px 0"
                                                            type="text">保存收件人</el-button>
                                                    </div>
                                                    <el-form-item label=" 收货人" style="margin: 13px;">
                                                        <el-input v-model="parcel.toPeople" placeholder="姓名（校验是否要中文）"
                                                            autocomplete="off"></el-input>
                                                    </el-form-item>
                                                    <el-form-item label="收货人电话" style="margin: 13px;">
                                                        <el-input v-model="parcel.toPhone" autocomplete="off"></el-input>
                                                    </el-form-item>
                                                    <el-form-item label="省/市/区" style="margin: 13px;">
                                                        <el-cascader size="small" :options="optionsCity"
                                                            v-model="parcel.toAddrSelect" @change="handleChange">
                                                        </el-cascader>
                                                    </el-form-item>
                                                    <el-form-item label="详细地址" style="margin: 13px;margin-top: 18px;">
                                                        <el-input v-model="parcel.toAddrDetail" autocomplete="off"
                                                            type="textarea"></el-input>
                                                    </el-form-item>
                                                </el-card>
                                            </div>
                                        </el-form>
                                        <div slot="footer" style="padding: 0px;margin-top: 20px;float: right;">
                                            <el-button @click="clearForm('parcel')">取 消</el-button>
                                            <el-button type="primary" @click="sureAdd('parcel')">确 定</el-button>
                                        </div>
                                    </div>
                                    <!-- <div v-else>
                   <el-empty description="请先进行登录"></el-empty>
                </div> -->
                                </el-tab-pane>
                            </el-tabs>
                        </div>
                    </div>
                    <el-dialog title="确认订单" :visible.sync="dialogVisible" width="30%" :before-close="handleClose">
                        <span>是否确认订单</span>
                        <span slot="footer" class="dialog-footer">
                            <el-button @click="dialogVisible = false">取 消</el-button>
                            <el-button type="primary" @click="addOrder">确 定</el-button>
                        </span>
                    </el-dialog>
                    <!-- <transition name="slide-fade">
                <router-view v-if="isRouterAlive"></router-view>
            </transition> -->
                </el-main>
            </el-container>
        </el-container>
    </div>
</template>

<script lang="js">
import { regionData } from 'element-china-area-data'

export default {
    provide() {
        return {
            reload: this.reload
        };
    },
    data() {
        return {
            username: 'HYT',
            isRouterAlive: true,
            isLogin: true,
            activeName: 'first',
            dialogVisible: false,
            parcelID: '',//查询Param
            // carrier:'',//查询Param
            tableData: [{}],
            parcel: {
                fromPeople: "",
                fromPhone: "",
                fromAddrSelect: [],
                fromAddrDetail: "",
                toPeople: "",
                toPhone: "",
                toAddrSelect: [],
                toAddrDetail: "",
                // carrier: "",
                // cost: "10元",
                weight: "",
                volume: ''
            },
            parcelSend: {
                from_user: "",
                from_phone: "",
                from_addr: "",
                to_user: "",
                to_phone: "",
                to_addr: "",
                // carrier: "",
                // cost: "",
                weight: "",
                volume: ''
            },
            optionsCity: regionData,
            // options: [{
            //   value: '中通快递',
            //   label: '中通快递'
            // }, {
            //   value: '韵达快递',
            //   label: '韵达快递'
            // }, {
            //   value: '顺丰速运',
            //   label: '顺丰速运'
            // }, {
            //   value: '圆通快递',
            //   label: '圆通快递'
            // }, {
            //   value: '申通快递',
            //   label: '申通快递'
            // }],
            value: '',
            currentPage: 1, // 当前页码
            total: 20, // 总条数
            rules: [],
            pageSize: 5 // 每页的数据条数
        };
    },
    methods: {
        handleChange() { },
        //每页条数改变时触发 选择一页显示多少行
        handleSizeChange(val) {
            console.log(`每页 ${val} 条`);
            this.currentPage = 1;
            this.pageSize = val;
        },
        handleSelectionChange() { },
        //当前页改变时触发 跳转其他页
        handleCurrentChange(val) {
            console.log(`当前页: ${val}`);
            this.currentPage = val;
        },
        reload() {
            this.isRouterAlive = false;
            this.$nextTick(function () {
                this.isRouterAlive = true;
            });
        },
        handleClick() { },
        handleOpen(key, keyPath) {
            console.log(key, keyPath);
        },
        handleClose(key, keyPath) {
            console.log(key, keyPath);
        },
        // 用户名下拉菜单选择事件
        handleCommand(command) {
            if (command == 'loginout') {
                localStorage.removeItem('ms_username');
                this.$router.push('/login');
            }
        },
        // 联系客服
        contact() {
            this.$router.push('/contact');//跳转
        },
        personal() {
            this.$router.push('/personalPage')
        },
        //添加订单
        sureAdd(formName) {
            //表单验证
            //计算费用
            this.dialogVisible = true
        },
        //支付后添加
        addOrder() {
            //发送请求
            //成功后跳转到首页
            this.activeName = 'first'
            this.dialogVisible = false
        }


    },
    created() {
        this.username = window.sessionStorage.getItem('username')
    },
    mounted() {
        console.log('mounted');
    }
}
</script>


<style scoped>
/**-----------------------------中间层------------------------------------ */
.search-whole {
    width: 100%;
    height: 250px;
    background-image: url('@/assets/images/团队-2-2.png');
    background-size: cover;
    opacity: 0.9;
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
    padding: 10px;
    background-color: aliceblue;
}

/* --------------- 左侧导航栏 --------------------- */

.aside {
    height: 100%;
}

/* --------------- 顶层导航栏 --------------------- */
.login-brt:hover {
    color: coral
}

.login-brt {
    color: aliceblue;

}

.text {
    color: aliceblue;
}

.header {
    height: 50px;
    background-color: #4481eb;
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
    position: absolute;
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
</style>