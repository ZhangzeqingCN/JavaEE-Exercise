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
                            <el-dropdown-item @click.native="personal" class="text-shadow2">个人中心</el-dropdown-item>
                            <el-dropdown-item @click.native="personal" class="text-shadow2">管理寄/收件人信息</el-dropdown-item>
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
                <el-tabs v-model="activeName" @tab-click="handleClick">
                  <!-- 物流追踪 -->
                  <el-tab-pane label="物流追踪" name="first">
                    <div class="search-whole">
                      <div class="search">
                        <span style="margin-right: 10px;font-weight: 550;">快递单号</span>
                        <el-input style="width: 300px;margin-right: 10px;" v-model="parcelID"></el-input>
                        <el-button icon="el-icon-search" @click="checkOrder(parcelID)" circle style="margin-left:10px"></el-button>
                      </div>
                    </div>
                    <div>
                      <div >
                        <el-table :data="tableData.slice((currentPage-1)*pageSize,currentPage*pageSize)" style="width: 100%" @selection-change="handleSelectionChange"
                                  :header-row-style="{height:'30px'}"
                                  :header-cell-style="{background:'#f5f7fa',padding:'0px',textAlign: 'center'}"
                                  :row-style="{height:'40px'}" :cell-style="{padding:'0px', textAlign: 'center' }"
                                  size='small'
                        >
                          <!-- 排序、操作按钮、下拉详情tableData.slice((currentPage-1)*pageSize,currentPage*pageSize) -->
                          <!-- 物流信息 -->
<!--                          <el-table-column fixed type="expand" @click="getTrace(scope.row)">-->
<!--                            <template slot-scope="props">-->
<!--                              <el-form label-position="left" inline class="demo-table-expand">-->
<!--                                <el-form-item label="站点名称" prop="siteName">-->
<!--                                  <span>{{ trace.siteName }}</span>-->
<!--                                </el-form-item>-->
<!--                                <el-form-item label="站点性质" prop="siteAttribute">-->
<!--                                  <span>{{ trace.siteAttribute}}</span>-->
<!--                                </el-form-item>-->
<!--                                <el-form-item label="到达时间" prop="arriveTime">-->
<!--                                  <span>{{ trace.arriveTime}}</span>-->
<!--                                </el-form-item>-->
<!--                                <el-form-item label="离开时间" prop="leaveTime">-->
<!--                                  <span>{{ trace.leaveTime}}</span>-->
<!--                                </el-form-item>-->
<!--                              </el-form>-->
<!--                            </template>-->
<!--                          </el-table-column>-->
                          <!-- 表格信息 -->
                          <el-table-column fixed prop="shipmentCode" label="运输单号">
                          </el-table-column>
                          <el-table-column label="寄件人信息">
                            <template slot-scope="scope">
                              <el-popover trigger="hover" placement="top">
                                <p>寄件人: {{ scope.row.fromPeople}}</p>
                                <p>寄件人电话号码: {{ scope.row.fromPhone}}</p>
                                <p>寄件人省市区: {{ scope.row.fromAddrSelect}}</p>
                                <p>寄件人详细地址: {{ scope.row.fromAddrDetail}}</p>
                                <div slot="reference" class="name-wrapper">
                                  <el-tag size="medium">{{ scope.row.fromPeople }}</el-tag>
                                </div>
                              </el-popover>
                            </template>
                          </el-table-column>
                          <el-table-column label="收件人信息">
                            <template slot-scope="scope">
                              <el-popover trigger="hover" placement="top">
                                <p>收件人: {{ scope.row.toPeople}}</p>
                                <p>收件人电话号码: {{ scope.row.toPhone}}</p>
                                <p>收件人省市区: {{ scope.row.toAddrSelect}}</p>
                                <p>收件人详细地址: {{ scope.row.toAddrDetail}}</p>
                                <div slot="reference" class="name-wrapper">
                                  <el-tag size="medium">{{ scope.row.toPeople }}</el-tag>
                                </div>
                              </el-popover>
                            </template>
                          </el-table-column>
                          <el-table-column label="物品信息">
                            <template slot-scope="scope">
                              <el-popover trigger="hover" placement="top">
                                <p>物品类型: {{ scope.row.type}}</p>
                                <p>物品重量: {{ scope.row.weight}}</p>
                                <div slot="reference" class="name-wrapper">
                                  <el-tag size="medium">{{ scope.row.type }}</el-tag>
                                </div>
                              </el-popover>
                            </template>
                          </el-table-column>
                          <el-table-column label="快递员信息">
                            <template slot-scope="scope">
                              <el-popover trigger="hover" placement="top">
                                <p>快递员: {{ scope.row.courierName}}</p>
                                <p>快递员电话号码: {{ scope.row.courierPhone}}</p>
                                <div slot="reference" class="name-wrapper">
                                  <el-tag size="medium">{{ scope.row.courierName }}</el-tag>
                                </div>
                              </el-popover>
                            </template>
                          </el-table-column>
                          <el-table-column fixed label="下单时间">
                            <template slot-scope="scope">
                              <i class="el-icon-time"></i>
                              <span style="margin-left: 10px">{{ scope.row.placeAnOrderTime }}</span>
                            </template>
                          </el-table-column>
                          <el-table-column label="物流信息">
                            <template slot-scope="scope">
                              <el-popover trigger="click" placement="top">
                                <el-table :data="trace">
                                  <el-table-column property="siteName" label="站点名称"></el-table-column>
                                  <el-table-column property="siteAttribute" label="站点性质"></el-table-column>
                                  <el-table-column property="arriveTime" label="到达时间"></el-table-column>
                                  <el-table-column property="leaveTime" label="离开时间"></el-table-column>
                                </el-table>
                                <el-button type="text" @click="getTrace(scope.row)" slot="reference">点击查看</el-button>
                              </el-popover>
                            </template>
                          </el-table-column>
                        </el-table>
                        <el-pagination align='center'
                                       @size-change="handleSizeChange"
                                       @current-change="handleCurrentChange"
                                       :current-page="currentPage"
                                       :page-sizes="[5,10,20]"
                                       :page-size="pageSize"
                                       layout="total, sizes, prev, pager, next, jumper"
                                       :total="tableData.length"
                                       style="margin-top: 7px;">
                        </el-pagination>
                      </div>
                    </div>
                  </el-tab-pane>
                  <!-- 我要寄件相关 -->
                  <el-tab-pane label="我要寄件" name="second">
                    <div >
                      <el-form :model="parcel" ref="parcel" :rules="rules" style="padding: 0px; height: 300px; " label-width="90px">
                        <div>
                          <!-- 寄件人信息 -->
                          <el-card style="float: left; width:41%; margin-left: 5%;">
                            <div slot="header" class="clearfix">
                              <span>寄件人信息</span>
                              <el-button @click= "dialogVisible_from = true" style="float: right; padding: 3px 0" type="text">保存寄件人</el-button>
                              <el-dialog width="35%" title="保存寄件人信息" :visible.sync="dialogVisible_from">
                                <el-form :model="parcel">
                                  <el-form-item label="寄件人姓名:">{{parcel.fromPeople}}</el-form-item>
                                  <el-form-item label="寄件人电话:">{{parcel.fromPhone}}</el-form-item>
                                  <el-form-item label="寄件人省市区:">{{parcel.fromAddrSelect}}</el-form-item>
                                  <el-form-item label="寄件人详细地址:">{{parcel.fromAddrDetail}}</el-form-item>
                                </el-form>
                                <div slot="footer">
                                  <el-button @click="dialogVisible_from = false">取 消</el-button>
                                  <el-button type="primary" @click="saveFrom()">确 定</el-button>
                                </div>
                              </el-dialog>
                            </div>
                            <el-form-item label="发货人"  style="margin: 13px;">
                              <el-input v-model="parcel.fromPeople"  placeholder="姓名（校验是否要中文）" autocomplete="off"></el-input>
                            </el-form-item>
                            <el-form-item label="发货人电话"  style="margin: 13px;">
                              <el-input v-model="parcel.fromPhone"  autocomplete="off"></el-input>
                            </el-form-item>
                            <el-form-item label="省/市/区"  style="margin: 13px;"><!-- :options="options"-->
                              <el-cascader
                                  :options="optionsCity"
                                  v-model="parcel.fromAddrSelect"
                                  @change="handleChange">
                              </el-cascader>
                            </el-form-item>
                            <el-form-item label="详细地址"  style="margin: 13px;margin-top: 18px;">
                              <el-input v-model="parcel.fromAddrDetail"  autocomplete="off" type="textarea"></el-input>
                            </el-form-item>
                          </el-card>
                          <!-- 收件人信息 -->
                          <el-card style="float:right; width:41%; margin-right: 5%;">
                            <div slot="header" class="clearfix">
                              <span>收件人信息</span>
                              <el-button @click= "dialogVisible_to = true" style="float: right; padding: 3px 0" type="text">保存收件人</el-button>
                              <el-dialog width="35%" title="保存寄件人信息" :visible.sync="dialogVisible_to">
                                <el-form :model="parcel">
                                  <el-form-item label="收件人姓名:">{{parcel.toPeople}}</el-form-item>
                                  <el-form-item label="收件人电话:">{{parcel.toPhone}}</el-form-item>
                                  <el-form-item label="收件人省市区:">{{parcel.toAddrSelect}}</el-form-item>
                                  <el-form-item label="收件人详细地址:">{{parcel.toAddrDetail}}</el-form-item>
                                </el-form>
                                <div slot="footer">
                                  <el-button @click="dialogVisible_to = false">取 消</el-button>
                                  <el-button type="primary" @click="saveTo()">确 定</el-button>
                                </div>
                              </el-dialog>
                            </div>
                            <el-form-item label=" 收货人"  style="margin: 13px;">
                              <el-input v-model="parcel.toPeople" placeholder="姓名（校验是否要中文）" autocomplete="off"></el-input>
                            </el-form-item>
                            <el-form-item label="收货人电话"  style="margin: 13px;">
                              <el-input v-model="parcel.toPhone"  autocomplete="off"></el-input>
                            </el-form-item>
                            <el-form-item label="省/市/区"  style="margin: 13px;">
                              <el-cascader
                                  size="small"
                                  :options="optionsCity"
                                  v-model="parcel.toAddrSelect"
                                  @change="handleChange">
                              </el-cascader>
                            </el-form-item>
                            <el-form-item label="详细地址"  style="margin: 13px; margin-top: 18px;">
                              <el-input v-model="parcel.toAddrDetail"  autocomplete="off" type="textarea"></el-input>
                            </el-form-item>
                          </el-card>
                          <!-- 物品信息 -->
                          <el-card style="float: left; width:90%; margin-left:5%; margin-top: 10px">
                            <div slot="header" class="clearfix">
                              <span>物品信息</span>
                              <el-button style="float: right; padding: 10px 5px" type="danger" @click="dialogVisible_item = true">禁寄物品</el-button>
                            </div>
                            <!-- 违寄物品 -->
                            <el-dialog
                                title="禁止寄递物品目录"
                                :visible.sync="dialogVisible_item"
                                width="60%"
                                :before-close="handleClose">
                              <span>一、国家机关公文</span><p></p>
                              <span>国家机关基于公务活动而制作的具有特定文体和格式，并加盖国家机关公章的书面材料。</span><p></p>
                              <span>二、国家保护野生动物、濒危野生动物及其制品如象牙、虎骨、犀牛角及其制品等。</span><p></p>
                              <span>三、侵犯知识产权和假冒伪劣、无证经营物品</span><p></p>
                              <span>1.侵犯知识产权：如侵犯专利权、商标权、著作权的图书、音像制品等</span><p></p>
                              <span>2.假冒伪劣：如假冒伪劣的食品、药品、儿童用品、电子产品、化妆品、纺织品等。</span><p></p>
                              <span>3. 无证经营：末取得食品生产经营许可等资质证件而生产的物品等</span><p></p>
                              <span>四、非法伪造物品</span><p></p>
                              <span>如伪造或者变造的货币、证件、公章、发票等。</span><p></p>
                              <span>五、枪支 （含仿制品、主要零部件）弹药</span><p></p>
                              <span>1. 枪支（含仿制品、主要零部件）：如手枪、步枪、冲锋枪、防暴枪、气枪、猎枪、运动枪、麻醉注射枪、钢珠枪、催泪枪等。</span><p></p>
                              <span>2. 弹药（含仿制品）：如子弹、炸弹、手榴弹、火箭弹照明弹、燃烧弹、烟幕（雾）弹、信号弹、催泪弹、毒气弹、地雷、手雷、炮弹、火药等</span><p></p>
                              <span>六、管制器具</span><p></p>
                              <span>1. 管制刀具：如匕首、三棱刮刀、带有自锁装置的弹簧刀（跳刀）、其他相类似的单刃、双刃、三棱尖刀等</span><p></p>
                              <span>2.其他：如弩、催泪器、催泪枪、电击器等。</span><p></p>
                              <span>七、爆炸物品</span><p></p>
                              <span>1. 爆破器材：如炸药、雷管、导火索、导爆索、爆破剂等等</span><p></p>
                              <span>2．烟花爆竹：如烟花、鞭炮、摔炮、拉炮、砸炮、彩药弹等烟花爆竹及黑火药、烟火药、发令纸、引火线等。</span><p></p>
                              <span>3. 其他：如推进剂、发射药、硝化棉、电点火头等。</span><p></p>
                              <span>八、压缩和液化气体及其容器</span><p></p>
                              <span>1. 易燃气体：如氢气、甲烷、乙烷、丁烷、天然气、液化石油气、乙烯、丙烯、乙炔、打火机等</span><p></p>
                              <span>2. 有毒气体：如一氧化碳、一氧化氮、氯气等。</span><p></p>
                              <span>3.易爆或者室息、助燃气体：如压缩氧气、氮气、氨气、氖气、气雾剂等。</span><p></p>
                              <span>九、昜燃液体</span><p></p>
                              <span>如汽油、柴油、煤油、桐油、丙酮、乙醚、油漆、生漆、苯、酒精、松香油等</span><p></p>
                              <span>十、易燃固体、自燃物质、遇水昜燃物质</span><p></p>
                              <span>1.易燃固体：如红磷、硫磺、铝粉、闪光粉、固体酒精火柴、活性炭等</span><p></p>
                              <span>2. 自燃物质：如黄磷、白磷、硝化纤维（含胶片）、钛粉等</span><p></p>
                              <span>3. 遇水易燃物质：如金属钠、钾、锂、锌粉、镁粉、碳化钙（电石）、氰化钠、氰化钾等</span><p></p>
                              <span>十一、氧化剂和过氧化物</span><p></p>
                              <span>如高锰酸盐、高氣酸盐、氧化氢、过氧化钠、过氧化钾、过氧化铅、氯酸盐、溴酸盐、硝酸盐、双氧水等</span><p></p>
                              <span>十二、毒性物质</span><p></p>
                              <span>如砷、砒霜、汞化物、铊化物、氰化物、硒粉、苯酚、汞、剧毒农药等</span><p></p>
                              <span>十三、生化制品、传染性、感染性物质</span><p></p>
                              <span>如病菌、炭疽、寄生虫、排泄物、医疗废弃物、尸骨、动物器官、肢体、未经硝制的兽皮、末经药制的兽骨等</span><p></p>
                              <span>十四、放射性物质</span><p></p>
                              <span>如铀、钴、镭、钚等。</span><p></p>
                              <span>十五、腐蚀性物质</span><p></p>
                              <span>如硫酸、硝酸、盐酸、蓄电池、氢氧化钠、氢氧化钾等。</span><p></p>
                              <span>十六、毒品及吸毒工具、非正当用途麻醉药品和精神药品、非正当用途的易制毒化学品</span><p></p>
                              <span>1. 毒品、麻醉药品和精神药品：如鸦片（包括蛋栗壳、花、苞、叶）、吗啡、海洛因、可卡因、大麻、甲基苯丙胺（冰毒）、氣胺酮、甲卡西酮、苯丙胺、安钠咖等</span><p></p>
                              <span>2.易制毒化学品：如胡椒醛、黄樟素、黄樟油、麻黄素、伪麻黄素、羟亚胺、邻酮、苯乙酸、溴代苯丙酮、醋酸酐、甲苯、丙酮等</span><p></p>
                              <span>3. 吸毒工具：如冰壶等</span><p></p>
                              <span>十七、非法出版物、印刷品、音像制品等宣传品</span><p></p>
                              <span>如含有反动、煽动民族仇恨、破坏国家统•破坏社会稳定、宣扬邪教、宗教极端思想、淫秽等内容的图书、刊物、图片、照片、音像制品等</span><p></p>
                              <span>十八、间谍专用器材</span><p></p>
                              <span>如暗藏式窃听器材、窃照器材、突发式收发报机、一次性密码本、密写工具、用于获取情报的电子监听和截收器材等</span><p></p>
                              <span>十九、非法伪造物品</span><p></p>
                              <span>如伪造或者变造的货币、证件、公章等。</span><p></p>
                              <span>二十、禁止进出境物品</span><p></p>
                              <span>如有碍人畜健康的、来自疫区的以及其他能传播疾病的食品、药品或者其他物品；内容涉及国家秘密的文件、资料及其他物品，以及收件地在国外、港澳台地区禁止入境的物品。</span><p></p>
                              <span>二十一、其他物品</span><p></p>
                              <span>《危险化学品目录》 《民用爆炸物品品名表》 《易制爆危险化学品名录》《易制毒化学品的分类和品种目录》《中华人民共和国禁止进出境物品表》载明的物品和《人间传染的病原微生物名录》载明的第一二类病原微生物等，以及法律、行政法规、国务院和国务院有关部门规定禁止寄递的其他物品</span><p></p>
                              <span slot="footer" class="dialog-footer">
                                <el-button style="float:bottom; width:25%" type="primary" @click="dialogVisible_item = false">确 定</el-button>
                              </span>
                            </el-dialog>
                            <el-form-item label-width="10%" label="物品名称:" style="margin: 30px;">
                              <el-input  v-model="parcel.type" placeholder="物品名称" autocomplete="off"></el-input>
                            </el-form-item>
                            <el-form-item label-width="10%" label="预估总重量:" style="margin: 30px;">
                              <el-input-number v-model="parcel.weight" @change="handleChange" :min="1"  label="KG"></el-input-number>
                              <span style="margin:10px">KG</span>
                            </el-form-item>
                            <el-form-item label-width="10%" label="保价与否:" style="margin: 30px;">
                              <el-button type="primary" circle @click=isSuranceOrNot(true) >是</el-button>
                              <el-button circle @click=isSuranceOrNot(false) >否</el-button>
                            </el-form-item>
                            <el-form-item  label-width="10%" label="物品价值:" style="margin: 30px;">
                              <template slot-scope="scope">
                                <div>
                                  <div v-if="parcel.insuranceOrNot" style=" display: flex;">
                                    <el-select size="small" v-model="value_money" placeholder="请选择">
                                      <el-option
                                          v-for="item in optionsMoney"
                                          :key="item.value_money"
                                          :label="item.label"
                                          :value="item.value_money"
                                          :disabled="item.disabled">
                                        <span style="float: left">{{ item.label }}</span>
                                        <span style="float: right; color: #8492a6; font-size: 13px">{{ item.value_money }}</span>
                                      </el-option>
                                    </el-select>
                                  </div>
                                  <div v-else style=" display: flex;">
                                    <el-select size="small" v-model="value_money" disabled placeholder="请选择">
                                    </el-select>
                                  </div>
                                </div>
                              </template>
                            </el-form-item>
                            <el-form-item label-width="10%" label="备注:" style="margin: 30px;">
                              <el-input v-model="parcel.notes" placeholder="带文件袋/带包装袋/带纸箱/要爬楼/上门前请先联系"></el-input>
                            </el-form-item>
                          </el-card>
                          <!-- 快递员信息 -->
                          <el-card style="float: left; width:90%; margin-left:5%; margin-top: 10px">
                            <div slot="header" class="clearfix">
                              <span>快递员信息</span>
                            </div>
                            <template>
                              <el-form-item label="快递员:" style="margin: 13px;">
                                <el-select v-model="parcel.chooseCourier" placeholder="请选择">
                                  <el-option
                                      v-for="item in optionsCourier"
                                      :key="item.value_courier"
                                      :label="item.label"
                                      :value="item.value_courier">
                                  </el-option>
                                </el-select>
                              </el-form-item>
                            </template>
                          </el-card>
                          <!-- 支付信息 -->
                          <el-card style="float: left; width:90%; margin-left:5%; margin-top: 10px">
                            <div slot="header" class="clearfix">
                              <span>支付信息</span>
                            </div>
                            <el-form-item label="支付方式:" style="margin: 13px;">
                              <template>
                                <el-radio v-model="pay" label="1">在线支付</el-radio>
                              </template>
                            </el-form-item>
                          </el-card>
                          <!-- 下单 -->
                          <el-card style="float: left; width:90%; margin-left:5%; margin-top: 10px">
                            <el-form-item label=" " style="float: right;margin: 13px;">
                              <el-button type="primary" @click="calculate()">下单</el-button>
                              <el-dialog width="35%" title="寄出快递" :visible.sync="dialogVisible_placeAnOrder">
                                <el-form :model="parcel">
                                  <el-form-item label="支付费用:">{{ parcel.estimatedCost }}</el-form-item>
                                </el-form>
                                <div slot="footer">
                                  <el-button @click="dialogVisible_placeAnOrder = false">取 消</el-button>
                                  <el-button type="primary" @click="addOrder()">确 定</el-button>
                                </div>
                              </el-dialog>
                            </el-form-item>
                          </el-card>
                        </div>
                      </el-form>
<!--                      <div slot="footer" style="padding: 0px;margin-top: 20px;float: right;">-->
<!--                        <el-button  @click=" clearForm ('parcel')">取 消</el-button>-->
<!--                        <el-button  type="primary" @click="sureAdd('parcel')">确 定</el-button>-->
<!--                      </div>-->
                    </div>
                  </el-tab-pane>
                </el-tabs>
            </div>
            <!-- 确认寄件弹窗 -->
            </div>
<!--            <el-dialog-->
<!--            title="确认订单"-->
<!--            :visible.sync="dialogVisible"-->
<!--            width="30%"-->
<!--            :before-close="handleClose">-->
<!--            <span>是否确认订单</span>-->
<!--            <span slot="footer" class="dialog-footer">-->
<!--                <el-button @click="dialogVisible = false">取 消</el-button>-->
<!--                <el-button type="primary" @click="addOrder">确 定</el-button>-->
<!--            </span>-->
<!--            </el-dialog>-->
            <!-- <transition name="slide-fade">
                <router-view v-if="isRouterAlive"></router-view>
            </transition> -->
            </el-main>
        </el-container>
        </el-container>
    </div>
</template>

<script>
import { regionData, CodeToText, TextToCode } from 'element-china-area-data'
import order from "@/api/order";
import user from "@/api/user";

export default{
    provide() {
    return {
      reload: this.reload
    };
  },
    data() {
      return {
        username:'HYT',
        isRouterAlive: true,
        isLogin:true,
        activeName: 'first',
        dialogVisible: false,
        dialogVisible_item: false,
        parcelID:'',//查询Param
        shipmentCode:'', // 查物流
        dialogVisible_contract:false,
        dialogVisible_from:false,
        dialogVisible_to:false,
        dialogVisible_placeAnOrder:false, // 下单
        optionsMoney: [{
          value_money:'￥1',
          label:'价值500元及以下'
        },
        {
          value_money:'￥2',
          label:'价值501-1000元'
        },
        {
          value_money: '￥3',
          label:'价值1001-1500元'
        },
        {
          value_money: '￥4',
          label:'价值1501-2000元'
        },
        {
          value_money: '￥5',
          label:'价值2000-2500元'
        },
        {
          value_money: '请联系客服',
          label: '2501元及以上',
          disabled: true
        }
      ],
        value_money:'',
        optionsCourier:[{
          value_courier:'张三丰',
          label:'张三丰'
        },{
          value_courier:'李才',
          label:'李才'
        }],
        pay:'1', // 选择支付方式
        weight:'',// 重量
        surance:'',// 保价金额
        money:'', // 最后支付价格
        value_courier:'',
        tableData:[{
          shipmentCode:'1111',
          fromPeople: 'yyz',
          fromPhone: '15302938395',
          fromAddrSelect: '北京市海淀区',
          fromAddrDetail: '北下关街道北京交通大学主校区南门',
          toPeople: 'lwt',
          toPhone: '15302938395',
          toAddrSelect: '广东省佛山市南海区',
          toAddrDetail: '里水镇桥西村桥西文化室',
          type:'生活物品',
          weight:'4kg',
          courierName:'张三丰',
          courierPhone:'13305267788',
          placeAnOrderTime :'2023-06-14',
        },
          {
            shipmentCode:'2222',
            fromPeople: 'yyz_2',
            fromPhone: '15302938395',
            fromAddrSelect: '北京市海淀区',
            fromAddrDetail: '北下关街道北京交通大学主校区南门',
            toPeople: 'lwt_2',
            toPhone: '15302938395',
            toAddrSelect: '广东省佛山市南海区',
            toAddrDetail: '里水镇桥西村桥西文化室',
            type:'生活物品_2',
            weight:'4kg',
            courierName:'张三丰',
            courierPhone:'13305267788',
            placeAnOrderTime :'2023-06-13',
          }
        ],
        // 下单
        parcel:{
          fromPeople: "",
          fromPhone: "",
          fromAddrSelect: [],
          fromAddrDetail: "",
          toPeople:"",
          toPhone: "",
          toAddrSelect:[],
          toAddrDetail: "",
          type:"",
          weight: 1,
          insuranceOrNot:false,
          notes:"",
          placeAnOrderTime:"", // 下单时间
          chooseCourier:"", //选择快递员
          paymentMethod:"在线支付", //选择支付方式
          estimatedCost:"",// 支付费用
        },
        // 物流
        trace:[{
          siteName: "北京市海淀区中转1站",
          siteAttribute: "区级中转站",
          arriveTime: "2023-06-11-17-08-07",
          leaveTime: "2023-06-11-21-09-07"
        },{
          siteName: "北京市海淀区中转2站",
          siteAttribute: "区级中转站",
          arriveTime: "2023-06-12-11-08-07",
          leaveTime: "2023-06-12-14-09-07"
        }],
        // 寄件/收件人
        fromAndTo:{
          people:"",
          phone:"",
          addrSelect:[],
          addrDetail:""
        },
        optionsCity: regionData,
        value: '',
        currentPage: 1, // 当前页码
        total: 20, // 总条数
        pageSize: 5 // 每页的数据条数
      };
    },
    methods: {
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
      // 个人中心 + 管理收件人寄件人
      personal() {
        this.$router.push('/personalPage')
      },
      // 按照快递单号查找包裹
      checkOrder(parcelID) {
        console.log("parcelID: " + parcelID)
        order.addOrder(parcelID).then(res => {
          console.log("查找包裹")
          if (res.data.success == true) {
            this.tableData = res.data.orderList
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
      },
      // 查看物流信息
      getTrace(row){
        this.shipmentCode = row.shipmentCode
        console.log("shipmentCode:" + shipmentCode)
        order.showOrderDetail(this.shipmentCode).then(res => {
          if(res.data.success == true){
            this.trace == res.data.data
            this.$message({
              message:"提交成功",
              type:"success"
            })
          }else {
            console.log(res.data.message)
            this.$message({
              message:"提交异常",
              type:"error"
            })
          }
        })
      },
      // 保存寄件人信息
      saveFrom(){
        this.dialogVisible_from = false
        this.fromAndTo.people = this.parcel.fromPeople
        this.fromAndTo.phone = this.parcel.fromPhone
        this.fromAndTo.addrSelect = this.parcel.fromAddrSelect
        this.fromAndTo.addrDetail = this.parcel.fromAddrDetail
        user.saveFrom(this.fromAndTo).then(res => {
          if(res.data.success == true){
            this.$message({
              message:"提交成功",
              type:"success"
            })
          }else {
            console.log(res.data.message)
            this.$message({
              message:"提交异常",
              type:"error"
            })
          }
        })
      },
      // 保存收件人
      saveTo(){
        this.dialogVisible_to = false
        this.fromAndTo.people = this.parcel.toPeople
        this.fromAndTo.phone = this.parcel.toPhone
        this.fromAndTo.addrSelect = this.parcel.toAddrSelect
        this.fromAndTo.addrDetail = this.parcel.toAddrDetail
        console.log("fromAndTo:"+this.fromAndTo)
        user.saveTo(this.fromAndTo).then(res => {
          if(res.data.success == true){
            this.$message({
              message:"提交成功",
              type:"success"
            })
          }else {
            console.log(res.data.message)
            this.$message({
              message:"提交异常",
              type:"error"
            })
          }
        })
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
      // 保价与否
      isSuranceOrNot(val){
        console.log(val)
        this.parcel.insuranceOrNot = val;
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
      reload() {
        this.isRouterAlive = false;
        this.$nextTick(function () {
          this.isRouterAlive = true;
        });
      },
      // 物品重量,选择省市区，
      handleChange(value) {
        console.log(value);
      },
      // handleOpen(key, keyPath) {
      //   console.log(key, keyPath);
      // },
      // handleClose(key, keyPath) {
      //   console.log(key, keyPath);
      // },

      // 联系客服
      // contact() {
      //   this.$router.push('/contact');//跳转
      // },
      //添加订单
      // sureAdd(formName){
      //   //表单验证
      //   //计算费用
      //   this.dialogVisible = true
      // },

      // 计算预估费用(待改正
      calculate(){
        console.log("触发算钱")
        this.weight = this.parcel.weight
        if (this.parcel.insuranceOrNot == true){
          this.surance = this.optionsMoney.keys()
          console.log("this.surance:" + this.surance)
        }
        this.money =

        this.dialogVisible_placeAnOrder = true
      },
      addOrder(){
        // 计算预估费用

        // 支付
        // 成功后跳转到首页
        this.dialogVisible_placeAnOrder = false
        // this.activeName='first'
      },
    },
    created(){
        this.username = window.sessionStorage.getItem('username')

    }
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